// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;


final class J extends Enum
{

    public static final J a;
    public static final J b;
    public static final J c;
    public static final J d;
    private static final J e[];

    private J(String s, int i)
    {
        super(s, i);
    }

    public static J valueOf(String s)
    {
        return (J)Enum.valueOf(com/paypal/android/sdk/payments/J, s);
    }

    public static J[] values()
    {
        return (J[])e.clone();
    }

    static 
    {
        a = new J("FUTURE_PAYMENTS", 0);
        b = new J("FINANCIAL_INSTRUMENTS", 1);
        c = new J("SEND_MONEY", 2);
        d = new J("REQUEST_MONEY", 3);
        e = (new J[] {
            a, b, c, d
        });
    }
}
