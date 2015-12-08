// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts;

import android.content.Context;
import android.graphics.RectF;
import android.widget.Scroller;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;

// Referenced classes of package com.artfulbits.aiCharts:
//            ChartView

final class a
    implements Runnable
{

    private final Scroller a;
    private int b;
    private int c;
    private ChartAxisScale d;
    private ChartAxisScale e;
    private ChartView f;

    private static int a(float f1, ChartAxisScale chartaxisscale)
    {
        if (chartaxisscale != null && !Double.isNaN(chartaxisscale.p()))
        {
            return (int)(((double)f1 * chartaxisscale.e()) / chartaxisscale.p());
        } else
        {
            return 0;
        }
    }

    private static int a(ChartAxisScale chartaxisscale, int i)
    {
        if (chartaxisscale != null && !Double.isNaN(chartaxisscale.p()))
        {
            double d1 = chartaxisscale.o();
            double d2 = chartaxisscale.c();
            double d3 = chartaxisscale.e();
            double d4 = chartaxisscale.p();
            return (int)(((d1 - d2) * (double)i) / (d3 - d4));
        } else
        {
            return 0;
        }
    }

    private static void a(ChartAxisScale chartaxisscale, int i, int j)
    {
        if (chartaxisscale != null && !Double.isNaN(chartaxisscale.p()))
        {
            double d1 = chartaxisscale.d();
            double d2 = chartaxisscale.c();
            double d3 = chartaxisscale.p();
            double d4 = chartaxisscale.c();
            chartaxisscale.b(((d1 - d2 - d3) * (double)i) / (double)j + d4);
        }
    }

    public final void a()
    {
        if (!a.isFinished())
        {
            a.abortAnimation();
        }
        d = null;
        e = null;
        b = 0;
        c = 0;
    }

    public final void a(ChartAxis chartaxis, ChartAxis chartaxis1, float f1, float f2)
    {
        int i;
        int j;
        if (chartaxis != null)
        {
            d = chartaxis.a();
            b = a(chartaxis.B().width(), d);
            i = a(d, b);
        } else
        {
            i = 0;
        }
        if (chartaxis1 != null)
        {
            e = chartaxis1.a();
            c = a(chartaxis1.B().height(), e);
            j = a(e, c);
        } else
        {
            j = 0;
        }
        a.fling(i, j, (int)f1, (int)f2, 0, b, 0, c);
        f.post(this);
    }

    public final void run()
    {
        if (a.computeScrollOffset())
        {
            if (d != null)
            {
                a(d, a.getCurrX(), b);
            }
            if (e != null)
            {
                a(e, a.getCurrY(), c);
            }
            f.post(this);
        }
    }

    public is(ChartView chartview, Context context)
    {
        f = chartview;
        super();
        b = 0;
        c = 0;
        d = null;
        e = null;
        a = new Scroller(context);
    }
}
