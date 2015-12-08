// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;


final class cu extends Enum
{

    public static final cu a;
    public static final cu b;
    public static final cu c;
    private static final cu d[];

    private cu(String s, int i)
    {
        super(s, i);
    }

    public static cu valueOf(String s)
    {
        return (cu)Enum.valueOf(com/paypal/android/sdk/payments/cu, s);
    }

    public static cu[] values()
    {
        return (cu[])d.clone();
    }

    static 
    {
        a = new cu("PayPal", 0);
        b = new cu("CreditCard", 1);
        c = new cu("CreditCardToken", 2);
        d = (new cu[] {
            a, b, c
        });
    }
}
