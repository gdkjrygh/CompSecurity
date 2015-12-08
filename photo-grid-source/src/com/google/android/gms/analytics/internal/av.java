// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


public final class av extends Enum
{

    public static final av a;
    public static final av b;
    private static final av c[];

    private av(String s, int i)
    {
        super(s, i);
    }

    public static av a(String s)
    {
        if ("GZIP".equalsIgnoreCase(s))
        {
            return b;
        } else
        {
            return a;
        }
    }

    public static av valueOf(String s)
    {
        return (av)Enum.valueOf(com/google/android/gms/analytics/internal/av, s);
    }

    public static av[] values()
    {
        return (av[])c.clone();
    }

    static 
    {
        a = new av("NONE", 0);
        b = new av("GZIP", 1);
        c = (new av[] {
            a, b
        });
    }
}
