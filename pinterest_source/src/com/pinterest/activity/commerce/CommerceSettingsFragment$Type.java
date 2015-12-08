// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;


final class  extends Enum
{

    private static final Footer $VALUES[];
    public static final Footer Footer;
    public static final Footer LoadMore;
    public static final Footer Order;
    public static final Footer PaymentMethod;
    public static final Footer ShippingAddress;

    public static  getType(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalStateException("Passed a value that is not in the range of this enum");

        case 0: // '\0'
            return Order;

        case 1: // '\001'
            return PaymentMethod;

        case 2: // '\002'
            return ShippingAddress;

        case 3: // '\003'
            return LoadMore;

        case 4: // '\004'
            return Footer;
        }
    }

    public static Footer valueOf(String s)
    {
        return (Footer)Enum.valueOf(com/pinterest/activity/commerce/CommerceSettingsFragment$Type, s);
    }

    public static Footer[] values()
    {
        return (Footer[])$VALUES.clone();
    }

    static 
    {
        Order = new <init>("Order", 0);
        PaymentMethod = new <init>("PaymentMethod", 1);
        ShippingAddress = new <init>("ShippingAddress", 2);
        LoadMore = new <init>("LoadMore", 3);
        Footer = new <init>("Footer", 4);
        $VALUES = (new .VALUES[] {
            Order, PaymentMethod, ShippingAddress, LoadMore, Footer
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
