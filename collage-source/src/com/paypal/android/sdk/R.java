// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


public final class R extends Enum
{

    public static final R a;
    public static final R b;
    private static R c;
    private static final R d[];

    private R(String s, int i)
    {
        super(s, i);
    }

    public static R valueOf(String s)
    {
        return (R)Enum.valueOf(com/paypal/android/sdk/R, s);
    }

    public static R[] values()
    {
        return (R[])d.clone();
    }

    static 
    {
        a = new R("USER_REQUIRED", 0);
        c = new R("USER_OPTIONAL", 1);
        b = new R("PROMPT_LOGIN", 2);
        d = (new R[] {
            a, c, b
        });
    }
}
