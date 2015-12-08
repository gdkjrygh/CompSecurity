// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.event;


public final class  extends Enum
{

    private static final EnrollInIncentive $VALUES[];
    public static final EnrollInIncentive AddAddress;
    public static final EnrollInIncentive AddPayment;
    public static final EnrollInIncentive Address;
    public static final EnrollInIncentive EnrollInIncentive;
    public static final EnrollInIncentive PayCalculateButton;
    public static final EnrollInIncentive Payment;
    public static final EnrollInIncentive Quantity;
    public static final EnrollInIncentive ShipMethod;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/commerce/event/CheckoutClickEvent$Click, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Address = new <init>("Address", 0);
        Payment = new <init>("Payment", 1);
        Quantity = new <init>("Quantity", 2);
        AddAddress = new <init>("AddAddress", 3);
        AddPayment = new <init>("AddPayment", 4);
        PayCalculateButton = new <init>("PayCalculateButton", 5);
        ShipMethod = new <init>("ShipMethod", 6);
        EnrollInIncentive = new <init>("EnrollInIncentive", 7);
        $VALUES = (new .VALUES[] {
            Address, Payment, Quantity, AddAddress, AddPayment, PayCalculateButton, ShipMethod, EnrollInIncentive
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
