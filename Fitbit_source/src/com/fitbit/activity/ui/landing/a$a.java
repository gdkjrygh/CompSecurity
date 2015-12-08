// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.landing;

import com.artfulbits.aiCharts.Base.ChartAxis;
import com.fitbit.activity.ui.charts.a.a;
import com.fitbit.ui.charts.t;
import com.fitbit.util.format.e;
import java.util.List;

// Referenced classes of package com.fitbit.activity.ui.landing:
//            a

private class <init>
    implements com.artfulbits.aiCharts.Base.tAxis.b
{

    final com.fitbit.activity.ui.landing.a a;

    public void a(ChartAxis chartaxis, List list)
    {
        int k = 0;
        int i = 0;
        list.clear();
        int i1 = com.fitbit.activity.ui.landing.a.c(a).d(com.fitbit.activity.ui.landing.a.a(a).c(), com.fitbit.activity.ui.landing.a.b(a));
        int l = com.fitbit.activity.ui.landing.a.c(a).c();
        if (l == 1)
        {
            k = i1 / 2;
            for (; i < 3; i++)
            {
                list.add(new com.artfulbits.aiCharts.Base.tAxis.a(e.a(i * k + 0), i * k + 0, 2));
            }

        } else
        {
            double d = (double)i1 / (double)l / 2D;
            for (int j = k; j < 3; j++)
            {
                double d1 = 0.0D + (double)j * d;
                list.add(new com.artfulbits.aiCharts.Base.tAxis.a(com.fitbit.util.chart.a.a(d1, l), d1, 2));
            }

        }
    }

    private xis(com.fitbit.activity.ui.landing.a a1)
    {
        a = a1;
        super();
    }

    a(com.fitbit.activity.ui.landing.a a1, a a2)
    {
        this(a1);
    }
}
