// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.payment;

import io.card.payment.b;

// Referenced classes of package ly.kite.payment:
//            PayPalCard

public static final class paypalIdentifier extends Enum
{

    private static final UNSUPPORTED $VALUES[];
    public static final UNSUPPORTED AMEX;
    public static final UNSUPPORTED DISCOVER;
    public static final UNSUPPORTED MASTERCARD;
    public static final UNSUPPORTED UNSUPPORTED;
    public static final UNSUPPORTED VISA;
    private final String paypalIdentifier;

    public static paypalIdentifier getCardType(b b1)
    {
        switch (Map.io.card.payment.CardType[b1.ordinal()])
        {
        default:
            return UNSUPPORTED;

        case 1: // '\001'
            return AMEX;

        case 2: // '\002'
            return MASTERCARD;

        case 3: // '\003'
            return DISCOVER;

        case 4: // '\004'
            return VISA;
        }
    }

    public static VISA valueOf(String s)
    {
        return (VISA)Enum.valueOf(ly/kite/payment/PayPalCard$CardType, s);
    }

    public static VISA[] values()
    {
        return (VISA[])$VALUES.clone();
    }

    static 
    {
        VISA = new <init>("VISA", 0, "visa");
        MASTERCARD = new <init>("MASTERCARD", 1, "mastercard");
        DISCOVER = new <init>("DISCOVER", 2, "discover");
        AMEX = new <init>("AMEX", 3, "amex");
        UNSUPPORTED = new <init>("UNSUPPORTED", 4, "unsupported");
        $VALUES = (new .VALUES[] {
            VISA, MASTERCARD, DISCOVER, AMEX, UNSUPPORTED
        });
    }


    private (String s, int i, String s1)
    {
        super(s, i);
        paypalIdentifier = s1;
    }
}
