// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate;
import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsLogger;
import java.util.List;

public final class doh
{

    public final PorcelainRenderDelegate a;
    public final dpx b;
    public final PorcelainMetricsLogger c;
    public final ImmutableList d;
    public final abg e;

    private doh(PorcelainRenderDelegate porcelainrenderdelegate, dpx dpx1, PorcelainMetricsLogger porcelainmetricslogger, List list, abg abg)
    {
        if (list != null)
        {
            list = ImmutableList.a(list);
        } else
        {
            list = ImmutableList.d();
        }
        d = list;
        c = (PorcelainMetricsLogger)ctz.a(porcelainmetricslogger);
        a = (PorcelainRenderDelegate)ctz.a(porcelainrenderdelegate);
        b = (dpx)ctz.a(dpx1);
        e = abg;
    }

    doh(PorcelainRenderDelegate porcelainrenderdelegate, dpx dpx1, PorcelainMetricsLogger porcelainmetricslogger, List list, abg abg, byte byte0)
    {
        this(porcelainrenderdelegate, dpx1, porcelainmetricslogger, list, abg);
    }
}
