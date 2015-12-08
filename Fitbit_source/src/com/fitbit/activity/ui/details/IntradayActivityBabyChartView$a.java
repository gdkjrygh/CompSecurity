// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.details;

import android.graphics.Paint;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.fitbit.heartrate.charts.a;
import com.fitbit.ui.charts.t;
import com.fitbit.util.format.e;
import java.util.List;

// Referenced classes of package com.fitbit.activity.ui.details:
//            IntradayActivityBabyChartView

private class <init>
    implements com.artfulbits.aiCharts.Base.a
{

    private static final double b = 0.75D;
    final IntradayActivityBabyChartView a;
    private final double c[] = {
        400D, 200D, 100D, 20D, 10D, 6D, 4D, 2D, 1.0D, 0.59999999999999998D, 
        0.40000000000000002D, 0.20000000000000001D, 0.10000000000000001D
    };

    private double a()
    {
        double d = IntradayActivityBabyChartView.b(a).c();
        int i = 0;
        do
        {
            if (i >= c.length)
            {
                break;
            }
            double d1 = c[i];
            if (d1 < 2D)
            {
                break;
            }
            int j = com.fitbit.heartrate.charts.a.a((int)d, (int)d1);
            if (j != 0 && (double)j > 0.75D * d)
            {
                return (double)j;
            }
            i++;
        } while (true);
        return 2D;
    }

    private com.artfulbits.aiCharts.Base.a a(double d)
    {
        com.artfulbits.aiCharts.Base.a a1;
        if (com.fitbit.activity.ui.details.IntradayActivityBabyChartView.a(a))
        {
            a1 = new com.artfulbits.aiCharts.Base.a.a(e.b(d), d);
        } else
        {
            a1 = new com.artfulbits.aiCharts.Base.a.a(e.b((int)d), (int)d);
        }
        a(a1);
        return a1;
    }

    private void a(com.artfulbits.aiCharts.Base.a a1)
    {
        a1.a(new Paint());
        com.fitbit.heartrate.charts.a.c(a.getContext(), a1.getContext());
        a1.getContext(3);
    }

    private double b()
    {
        double d = IntradayActivityBabyChartView.b(a).c();
        double d1 = c[c.length - 1];
        for (int i = 0; i < c.length; i++)
        {
            double d2 = c[i];
            if (d2 >= 2D)
            {
                int j = com.fitbit.heartrate.charts.a.a((int)d, (int)d2);
                if (j != 0 && (double)j > d * 0.75D)
                {
                    return (double)j;
                }
                continue;
            }
            int k = (int)(d * 10D);
            int l = com.fitbit.heartrate.charts.a.a(k, (int)(d2 * 10D));
            if (l != 0 && l > (int)((double)k * 0.75D))
            {
                return (double)l / 10D;
            }
        }

        return d1;
    }

    public void a(ChartAxis chartaxis, List list)
    {
        list.clear();
        double d;
        if (com.fitbit.activity.ui.details.IntradayActivityBabyChartView.a(a))
        {
            d = b();
        } else
        {
            d = a();
        }
        list.add(a(d));
        list.add(a(d / 2D));
        list.add(a(0.0D));
    }

    private (IntradayActivityBabyChartView intradayactivitybabychartview)
    {
        a = intradayactivitybabychartview;
        super();
    }

    a(IntradayActivityBabyChartView intradayactivitybabychartview, a a1)
    {
        this(intradayactivitybabychartview);
    }
}
