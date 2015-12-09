// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.payment;


// Referenced classes of package ly.kite.payment:
//            PayPalCard

public static final class code extends Enum
{

    private static final CAD $VALUES[];
    public static final CAD AUD;
    public static final CAD CAD;
    public static final CAD EUR;
    public static final CAD GBP;
    public static final CAD NZD;
    public static final CAD SGD;
    public static final CAD USD;
    private final String code;

    public static code valueOf(String s)
    {
        return (code)Enum.valueOf(ly/kite/payment/PayPalCard$Currency, s);
    }

    public static code[] values()
    {
        return (code[])$VALUES.clone();
    }

    static 
    {
        GBP = new <init>("GBP", 0, "GBP");
        USD = new <init>("USD", 1, "USD");
        EUR = new <init>("EUR", 2, "EUR");
        NZD = new <init>("NZD", 3, "NZD");
        SGD = new <init>("SGD", 4, "SGD");
        AUD = new <init>("AUD", 5, "AUD");
        CAD = new <init>("CAD", 6, "CAD");
        $VALUES = (new .VALUES[] {
            GBP, USD, EUR, NZD, SGD, AUD, CAD
        });
    }


    private (String s, int i, String s1)
    {
        super(s, i);
        code = s1;
    }
}
