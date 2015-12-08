// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.payment;


public final class  extends Enum
{

    private static final SPLIT_FARE $VALUES[];
    public static final SPLIT_FARE CHARGE_ACCOUNT;
    public static final SPLIT_FARE COUPON;
    public static final SPLIT_FARE SPLIT_FARE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(me/lyft/android/infrastructure/lyft/payment/PaymentDTO$PaymentMethod, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CHARGE_ACCOUNT = new <init>("CHARGE_ACCOUNT", 0);
        COUPON = new <init>("COUPON", 1);
        SPLIT_FARE = new <init>("SPLIT_FARE", 2);
        $VALUES = (new .VALUES[] {
            CHARGE_ACCOUNT, COUPON, SPLIT_FARE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
