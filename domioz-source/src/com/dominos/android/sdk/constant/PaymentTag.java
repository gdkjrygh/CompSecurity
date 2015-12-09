// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.constant;


public final class PaymentTag extends Enum
{

    private static final PaymentTag $VALUES[];
    public static final PaymentTag ANON;
    public static final PaymentTag CASH;
    public static final PaymentTag CREDIT;
    public static final PaymentTag GIFTCARD;
    public static final PaymentTag GOOGLE;
    public static final PaymentTag NONE;
    private final String text;

    private PaymentTag(String s, int i, String s1)
    {
        super(s, i);
        text = s1;
    }

    public static PaymentTag valueOf(String s)
    {
        return (PaymentTag)Enum.valueOf(com/dominos/android/sdk/constant/PaymentTag, s);
    }

    public static PaymentTag[] values()
    {
        return (PaymentTag[])$VALUES.clone();
    }

    public final String toString()
    {
        return text;
    }

    static 
    {
        CASH = new PaymentTag("CASH", 0, "Cash");
        CREDIT = new PaymentTag("CREDIT", 1, "Credit");
        GOOGLE = new PaymentTag("GOOGLE", 2, "Google");
        GIFTCARD = new PaymentTag("GIFTCARD", 3, "GiftCard");
        ANON = new PaymentTag("ANON", 4, "");
        NONE = new PaymentTag("NONE", 5, "");
        $VALUES = (new PaymentTag[] {
            CASH, CREDIT, GOOGLE, GIFTCARD, ANON, NONE
        });
    }
}
