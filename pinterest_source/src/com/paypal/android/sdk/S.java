// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


public final class S extends Enum
{

    public static final S a;
    private static S b;
    private static final S c[];

    private S(String s, int i)
    {
        super(s, i);
    }

    public static S valueOf(String s)
    {
        return (S)Enum.valueOf(com/paypal/android/sdk/S, s);
    }

    public static S[] values()
    {
        return (S[])c.clone();
    }

    static 
    {
        b = new S("token", 0);
        a = new S("code", 1);
        c = (new S[] {
            b, a
        });
    }
}
