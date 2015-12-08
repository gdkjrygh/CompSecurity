// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


public final class aD extends Enum
{

    public static final aD a;
    public static final aD b;
    public static final aD c;
    private static aD d;
    private static aD e;
    private static final aD f[];

    private aD(String s, int i)
    {
        super(s, i);
    }

    public static aD valueOf(String s)
    {
        return (aD)Enum.valueOf(com/paypal/android/sdk/aD, s);
    }

    public static aD[] values()
    {
        return (aD[])f.clone();
    }

    static 
    {
        a = new aD("GET", 0);
        b = new aD("POST", 1);
        d = new aD("PUT", 2);
        c = new aD("DELETE", 3);
        e = new aD("HEAD", 4);
        f = (new aD[] {
            a, b, d, c, e
        });
    }
}
