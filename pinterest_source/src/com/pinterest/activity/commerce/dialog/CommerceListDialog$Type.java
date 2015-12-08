// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;


public final class  extends Enum
{

    private static final ContactAddress $VALUES[];
    public static final ContactAddress ContactAddress;
    public static final ContactAddress PaymentMethod;
    public static final ContactAddress Quantity;
    public static final ContactAddress ShippingAddress;
    public static final ContactAddress ShippingMethod;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/commerce/dialog/CommerceListDialog$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ShippingAddress = new <init>("ShippingAddress", 0);
        ShippingMethod = new <init>("ShippingMethod", 1);
        Quantity = new <init>("Quantity", 2);
        PaymentMethod = new <init>("PaymentMethod", 3);
        ContactAddress = new <init>("ContactAddress", 4);
        $VALUES = (new .VALUES[] {
            ShippingAddress, ShippingMethod, Quantity, PaymentMethod, ContactAddress
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
