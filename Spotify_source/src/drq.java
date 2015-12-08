// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsRenderType;

public final class drq
{

    public String a;
    public String b;
    public int c;
    public int d;
    private PorcelainMetricsRenderType e;

    private drq(PorcelainMetricsRenderType porcelainmetricsrendertype)
    {
        e = (PorcelainMetricsRenderType)ctz.a(porcelainmetricsrendertype);
    }

    drq(PorcelainMetricsRenderType porcelainmetricsrendertype, byte byte0)
    {
        this(porcelainmetricsrendertype);
    }

    public final drp a()
    {
        return new drp(e, a, b, c, d, (byte)0);
    }
}
