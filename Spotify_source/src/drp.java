// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsRenderType;

public final class drp
{

    public final PorcelainMetricsRenderType a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    private drp(PorcelainMetricsRenderType porcelainmetricsrendertype, String s, String s1, int i, int j)
    {
        a = porcelainmetricsrendertype;
        b = s;
        c = s1;
        d = i;
        e = j;
    }

    drp(PorcelainMetricsRenderType porcelainmetricsrendertype, String s, String s1, int i, int j, byte byte0)
    {
        this(porcelainmetricsrendertype, s, s1, i, j);
    }

    public static drq a(PorcelainMetricsRenderType porcelainmetricsrendertype)
    {
        return new drq(porcelainmetricsrendertype, (byte)0);
    }
}
