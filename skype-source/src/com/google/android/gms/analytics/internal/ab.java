// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


public final class ab extends Enum
{

    public static final ab a;
    public static final ab b;
    private static final ab c[];

    private ab(String s, int i)
    {
        super(s, i);
    }

    public static ab a(String s)
    {
        if ("GZIP".equalsIgnoreCase(s))
        {
            return b;
        } else
        {
            return a;
        }
    }

    public static ab valueOf(String s)
    {
        return (ab)Enum.valueOf(com/google/android/gms/analytics/internal/ab, s);
    }

    public static ab[] values()
    {
        return (ab[])c.clone();
    }

    static 
    {
        a = new ab("NONE", 0);
        b = new ab("GZIP", 1);
        c = (new ab[] {
            a, b
        });
    }
}
