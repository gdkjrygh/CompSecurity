// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2.cash.square.data;


public final class CardBrand extends Enum
{

    private static final CardBrand $VALUES[];
    public static final CardBrand AMERICAN_EXPRESS;
    public static final CardBrand DISCOVER;
    public static final CardBrand DISCOVER_DINERS;
    public static final CardBrand JCB;
    public static final CardBrand MASTER_CARD;
    public static final CardBrand UNKNOWN;
    public static final CardBrand VISA;

    private CardBrand(String s, int i)
    {
        super(s, i);
    }

    public static int getDrawable(CardBrand cardbrand)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$snapchat$android$api2$cash$square$data$CardBrand[];

            static 
            {
                $SwitchMap$com$snapchat$android$api2$cash$square$data$CardBrand = new int[CardBrand.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$api2$cash$square$data$CardBrand[CardBrand.VISA.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$android$api2$cash$square$data$CardBrand[CardBrand.MASTER_CARD.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.snapchat.android.api2.cash.square.data.CardBrand[cardbrand.ordinal()])
        {
        default:
            return 0;

        case 1: // '\001'
            return 0x7f0200ad;

        case 2: // '\002'
            return 0x7f0200a4;
        }
    }

    public static CardBrand valueOf(String s)
    {
        return (CardBrand)Enum.valueOf(com/snapchat/android/api2/cash/square/data/CardBrand, s);
    }

    public static CardBrand[] values()
    {
        return (CardBrand[])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new CardBrand("UNKNOWN", 0);
        VISA = new CardBrand("VISA", 1);
        MASTER_CARD = new CardBrand("MASTER_CARD", 2);
        AMERICAN_EXPRESS = new CardBrand("AMERICAN_EXPRESS", 3);
        DISCOVER = new CardBrand("DISCOVER", 4);
        DISCOVER_DINERS = new CardBrand("DISCOVER_DINERS", 5);
        JCB = new CardBrand("JCB", 6);
        $VALUES = (new CardBrand[] {
            UNKNOWN, VISA, MASTER_CARD, AMERICAN_EXPRESS, DISCOVER, DISCOVER_DINERS, JCB
        });
    }
}
