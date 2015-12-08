// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;


public final class c extends Enum
{

    public static final c a;
    public static final c b;
    private static final c d[];
    private final int c;

    private c(String s, int i, int j)
    {
        super(s, i);
        c = j;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/facebook/ads/internal/c, s);
    }

    public static c[] values()
    {
        return (c[])d.clone();
    }

    public final int a()
    {
        return c;
    }

    static 
    {
        a = new c("ADS", 0, 0);
        b = new c("APP_OF_THE_DAY", 1, 1);
        d = (new c[] {
            a, b
        });
    }
}
