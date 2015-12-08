// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;


final class  extends Enum
{

    private static final ContactAddress $VALUES[];
    public static final ContactAddress AddAddress;
    public static final ContactAddress AddPayment;
    public static final ContactAddress ContactAddress;
    public static final ContactAddress DetailedShipping;
    public static final ContactAddress Quantity;
    public static final ContactAddress ShippingRate;
    public static final ContactAddress UserCard;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/commerce/dialog/CommerceListDialog$ViewType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ShippingRate = new <init>("ShippingRate", 0);
        DetailedShipping = new <init>("DetailedShipping", 1);
        UserCard = new <init>("UserCard", 2);
        Quantity = new <init>("Quantity", 3);
        AddPayment = new <init>("AddPayment", 4);
        AddAddress = new <init>("AddAddress", 5);
        ContactAddress = new <init>("ContactAddress", 6);
        $VALUES = (new .VALUES[] {
            ShippingRate, DetailedShipping, UserCard, Quantity, AddPayment, AddAddress, ContactAddress
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
