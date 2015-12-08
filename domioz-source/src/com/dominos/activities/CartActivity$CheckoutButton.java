// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


final class  extends Enum
{

    private static final GOOGLE_WALLET $VALUES[];
    public static final GOOGLE_WALLET CHECKOUT;
    public static final GOOGLE_WALLET GOOGLE_WALLET;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/activities/CartActivity$CheckoutButton, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CHECKOUT = new <init>("CHECKOUT", 0);
        GOOGLE_WALLET = new <init>("GOOGLE_WALLET", 1);
        $VALUES = (new .VALUES[] {
            CHECKOUT, GOOGLE_WALLET
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
