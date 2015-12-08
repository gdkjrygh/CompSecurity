// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.charts.views;

import com.artfulbits.aiCharts.Base.ChartAxis;
import com.fitbit.activity.ui.charts.a.d;
import com.fitbit.ui.charts.t;
import com.fitbit.util.chart.a;
import com.fitbit.util.format.e;
import java.util.List;

// Referenced classes of package com.fitbit.activity.ui.charts.views:
//            ActivityInteractiveChartView

private class <init>
    implements com.artfulbits.aiCharts.Base.View.b
{

    final ActivityInteractiveChartView a;

    public void a(ChartAxis chartaxis, List list)
    {
        list.clear();
        int i = ActivityInteractiveChartView.f(a).b(com.fitbit.activity.ui.charts.views.ActivityInteractiveChartView.e(a).c(), ActivityInteractiveChartView.c(a));
        int j = ActivityInteractiveChartView.f(a).c();
        if (j == 1)
        {
            j = i / 4;
            i = 0;
            while (i < 5) 
            {
                if (i % 2 == 0)
                {
                    chartaxis = new com.artfulbits.aiCharts.Base.View.b.a(e.a(i * j + 0), i * j + 0, 2);
                } else
                {
                    chartaxis = new com.artfulbits.aiCharts.Base.View.b.a("", i * j + 0, 2);
                }
                list.add(chartaxis);
                i++;
            }
        } else
        {
            double d1 = (double)i / (double)j / 4D;
            i = 0;
            while (i < 5) 
            {
                if (i % 2 == 0)
                {
                    double d2 = (double)i * d1 + 0.0D;
                    chartaxis = new com.artfulbits.aiCharts.Base.View.b.a(com.fitbit.util.chart.a.a(d2, j), d2, 2);
                } else
                {
                    chartaxis = new com.artfulbits.aiCharts.Base.View.b.a("", (double)i * d1 + 0.0D, 2);
                }
                list.add(chartaxis);
                i++;
            }
        }
    }

    private (ActivityInteractiveChartView activityinteractivechartview)
    {
        a = activityinteractivechartview;
        super();
    }

    a(ActivityInteractiveChartView activityinteractivechartview, a a1)
    {
        this(activityinteractivechartview);
    }
}
