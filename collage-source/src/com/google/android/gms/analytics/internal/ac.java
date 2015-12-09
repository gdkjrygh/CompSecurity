// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


public final class ac extends Enum
{

    public static final ac a;
    public static final ac b;
    private static final ac c[];

    private ac(String s, int i)
    {
        super(s, i);
    }

    public static ac a(String s)
    {
        if ("GZIP".equalsIgnoreCase(s))
        {
            return b;
        } else
        {
            return a;
        }
    }

    public static ac valueOf(String s)
    {
        return (ac)Enum.valueOf(com/google/android/gms/analytics/internal/ac, s);
    }

    public static ac[] values()
    {
        return (ac[])c.clone();
    }

    static 
    {
        a = new ac("NONE", 0);
        b = new ac("GZIP", 1);
        c = (new ac[] {
            a, b
        });
    }
}
