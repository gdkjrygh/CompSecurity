// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.metrics;


public final class PorcelainMetricsRenderType extends Enum
{

    public static final PorcelainMetricsRenderType a;
    public static final PorcelainMetricsRenderType b;
    public static final PorcelainMetricsRenderType c;
    public static final PorcelainMetricsRenderType d;
    public static final PorcelainMetricsRenderType e;
    public static final PorcelainMetricsRenderType f;
    public static final PorcelainMetricsRenderType g;
    private static PorcelainMetricsRenderType h;
    private static final PorcelainMetricsRenderType i[];

    private PorcelainMetricsRenderType(String s, int j)
    {
        super(s, j);
    }

    public static PorcelainMetricsRenderType valueOf(String s)
    {
        return (PorcelainMetricsRenderType)Enum.valueOf(com/spotify/mobile/android/porcelain/metrics/PorcelainMetricsRenderType, s);
    }

    public static PorcelainMetricsRenderType[] values()
    {
        return (PorcelainMetricsRenderType[])i.clone();
    }

    static 
    {
        a = new PorcelainMetricsRenderType("BILLBOARD", 0);
        b = new PorcelainMetricsRenderType("CARD", 1);
        c = new PorcelainMetricsRenderType("CARD_WIDE", 2);
        h = new PorcelainMetricsRenderType("CAROUSEL", 3);
        d = new PorcelainMetricsRenderType("HEADER", 4);
        e = new PorcelainMetricsRenderType("LIST_ITEM", 5);
        f = new PorcelainMetricsRenderType("LIST_ITEM_TALL", 6);
        g = new PorcelainMetricsRenderType("OTHER", 7);
        i = (new PorcelainMetricsRenderType[] {
            a, b, c, h, d, e, f, g
        });
    }
}
