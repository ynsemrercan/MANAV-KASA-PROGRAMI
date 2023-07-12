import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        float elma,armut,domates,patlican,muz, elmaFiyat=3.67f ,armutFiyat=2.14f ,domatesFiyat=1.11f ,patlicanFiyat=5f, muzFiyat =0.95f, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Alınan Elma Kilogramı:" );
        elma= input.nextFloat();

        System.out.print("Alınan Armut Kilogramı:" );
        armut= input.nextFloat();

        System.out.print("Alınan Domates Kilogramı:" );
        domates= input.nextFloat();

        System.out.print("Alınan Patlıcan Kilogramı:" );
        patlican= input.nextFloat();

        System.out.print("Alınan Muz Kilogramı:" );
        muz= input.nextFloat();

        total=(elma*elmaFiyat)+(armut*armutFiyat)+(patlican*patlicanFiyat)+(domates*domatesFiyat)+(muz*muzFiyat);

        System.out.print("Ödeyeceğiniz Ücret: "+total);








    }
}