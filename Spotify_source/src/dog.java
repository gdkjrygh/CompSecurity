// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.porcelain.PorcelainAdapter;
import com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate;
import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsLogger;
import java.util.List;

public final class dog
{

    public PorcelainMetricsLogger a;
    public PorcelainRenderDelegate b;
    public dpx c;
    public abg d;
    public List e;

    public dog()
    {
    }

    public final PorcelainAdapter a(Context context)
    {
        dpx dpx1;
        PorcelainMetricsLogger porcelainmetricslogger;
        if (b != null)
        {
            context = b;
        } else
        {
            context = dqe.a(context).a();
        }
        if (c != null)
        {
            dpx1 = c;
        } else
        {
            dpx1 = dpx.a;
        }
        if (a != null)
        {
            porcelainmetricslogger = a;
        } else
        {
            porcelainmetricslogger = PorcelainMetricsLogger.a;
        }
        return new PorcelainAdapter(new doh(context, dpx1, porcelainmetricslogger, e, d, (byte)0), (byte)0);
    }
}
