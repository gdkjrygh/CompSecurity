// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;


final class  extends Enum
{

    private static final Checkout $VALUES[];
    public static final Checkout Checkout;
    public static final Checkout VariantSelection;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/commerce/logic/CheckoutController$DisplayState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        VariantSelection = new <init>("VariantSelection", 0);
        Checkout = new <init>("Checkout", 1);
        $VALUES = (new .VALUES[] {
            VariantSelection, Checkout
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
