// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonBaseCardItem;
import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonItem;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonImage;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonNavigationLink;

public abstract class dpb extends dpc
{

    public PorcelainJsonNavigationLink a;
    private Object c;
    private PorcelainJsonImage d;
    private PorcelainJsonNavigationLink e;
    private boolean f;
    private int g;

    dpb()
    {
        g = -1;
    }

    abstract PorcelainJsonBaseCardItem a(PorcelainJsonMetricsData porcelainjsonmetricsdata, Object obj, PorcelainJsonImage porcelainjsonimage, PorcelainJsonNavigationLink porcelainjsonnavigationlink, PorcelainJsonNavigationLink porcelainjsonnavigationlink1, int i, boolean flag);

    final volatile PorcelainJsonItem a(PorcelainJsonMetricsData porcelainjsonmetricsdata)
    {
        return a(porcelainjsonmetricsdata, c, d, e, a, g, f);
    }

    public final dpb a()
    {
        f = true;
        return (dpb)this;
    }

    public final dpb a(dpi dpi1)
    {
        d = (PorcelainJsonImage)ctz.a(dpi1.a());
        return (dpb)this;
    }

    public final dpb a(dpk dpk1)
    {
        e = dpk1.a();
        return (dpb)this;
    }

    public final dpb a(Object obj)
    {
        c = obj;
        return (dpb)this;
    }
}
