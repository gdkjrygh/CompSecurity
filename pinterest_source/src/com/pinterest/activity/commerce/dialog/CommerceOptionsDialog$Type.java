// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;


final class  extends Enum
{

    private static final ShippingAddress $VALUES[];
    public static final ShippingAddress PaymentMethod;
    public static final ShippingAddress ShippingAddress;

    public static  getType(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalStateException("Passed a value that is not in the range of this enum");

        case 0: // '\0'
            return PaymentMethod;

        case 1: // '\001'
            return ShippingAddress;
        }
    }

    public static ShippingAddress valueOf(String s)
    {
        return (ShippingAddress)Enum.valueOf(com/pinterest/activity/commerce/dialog/CommerceOptionsDialog$Type, s);
    }

    public static ShippingAddress[] values()
    {
        return (ShippingAddress[])$VALUES.clone();
    }

    static 
    {
        PaymentMethod = new <init>("PaymentMethod", 0);
        ShippingAddress = new <init>("ShippingAddress", 1);
        $VALUES = (new .VALUES[] {
            PaymentMethod, ShippingAddress
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
