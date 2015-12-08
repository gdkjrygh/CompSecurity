// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;


public final class TuneBannerPosition extends Enum
{

    public static final TuneBannerPosition a;
    public static final TuneBannerPosition b;
    private static final TuneBannerPosition c[];

    private TuneBannerPosition(String s, int i)
    {
        super(s, i);
    }

    public static TuneBannerPosition valueOf(String s)
    {
        return (TuneBannerPosition)Enum.valueOf(com/tune/crosspromo/TuneBannerPosition, s);
    }

    public static TuneBannerPosition[] values()
    {
        return (TuneBannerPosition[])c.clone();
    }

    static 
    {
        a = new TuneBannerPosition("BOTTOM_CENTER", 0);
        b = new TuneBannerPosition("TOP_CENTER", 1);
        c = (new TuneBannerPosition[] {
            a, b
        });
    }
}
