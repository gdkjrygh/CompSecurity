// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonItem;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;

public abstract class dpc
{

    public PorcelainJsonMetricsData b;

    dpc()
    {
    }

    abstract PorcelainJsonItem a(PorcelainJsonMetricsData porcelainjsonmetricsdata);

    public final dpc a(dpj dpj1)
    {
        b = new PorcelainJsonMetricsData(null, dpj1.a, null, null);
        return this;
    }

    public final PorcelainJsonItem b()
    {
        return a(b);
    }
}
