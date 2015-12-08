// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


public final class Q extends Enum
{

    public static final Q a;
    private static Q b;
    private static final Q c[];

    private Q(String s, int i)
    {
        super(s, i);
    }

    public static Q valueOf(String s)
    {
        return (Q)Enum.valueOf(com/paypal/android/sdk/Q, s);
    }

    public static Q[] values()
    {
        return (Q[])c.clone();
    }

    static 
    {
        b = new Q("token", 0);
        a = new Q("code", 1);
        c = (new Q[] {
            b, a
        });
    }
}
