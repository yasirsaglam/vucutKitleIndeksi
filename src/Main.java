import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double kilo, boy, sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz : ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu giriniz : ");
        kilo = input.nextDouble();
        sonuc = (kilo / (boy * boy));
        System.out.println("Vücut Kitle İndeksiniz : " + sonuc);
    }
}
