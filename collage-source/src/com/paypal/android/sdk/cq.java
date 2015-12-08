// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


public final class cq extends Enum
{

    public static final cq a;
    public static final cq b;
    private static final cq c[];

    private cq(String s, int i)
    {
        super(s, i);
    }

    public static cq valueOf(String s)
    {
        return (cq)Enum.valueOf(com/paypal/android/sdk/cq, s);
    }

    public static cq[] values()
    {
        return (cq[])c.clone();
    }

    static 
    {
        a = new cq("EMAIL", 0);
        b = new cq("PHONE", 1);
        c = (new cq[] {
            a, b
        });
    }
}
