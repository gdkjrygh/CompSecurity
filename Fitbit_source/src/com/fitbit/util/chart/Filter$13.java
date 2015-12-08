// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import android.content.Context;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Types.ChartLineType;
import com.fitbit.util.o;
import java.util.Calendar;
import java.util.List;

// Referenced classes of package com.fitbit.util.chart:
//            Filter, a, TimeIntervalType

static final class b
    implements com.artfulbits.aiCharts.Base.b
{

    final e a;
    final Context b;

    public void a(ChartAxis chartaxis, List list)
    {
        double d;
        double d1;
        double d2;
        int i;
        chartaxis = chartaxis.a();
        d = chartaxis.f();
        d1 = chartaxis.d() - com.fitbit.util.chart.a.a(a, com/artfulbits/aiCharts/Types/ChartLineType);
        d2 = chartaxis.g();
        i = 1;
        if (a != e.k) goto _L2; else goto _L1
_L1:
        i = 2;
_L4:
        chartaxis = o.b((long)d1);
        Calendar calendar = o.b((long)d2);
        int j = (int)((chartaxis.getTimeInMillis() - calendar.getTimeInMillis()) / (0x240c8400L * (long)i));
        if (j > 0)
        {
            chartaxis.add(5, -j * (i * 7));
        }
        list.clear();
        do
        {
            double d3 = chartaxis.getTimeInMillis();
            if (d3 <= d1 - 0.0D && d3 >= 0.0D + d)
            {
                com.artfulbits.aiCharts.Base.a a1 = new com.artfulbits.aiCharts.Base.a(null, 0.0D);
                if (Filter.b(a))
                {
                    a1.b(a1.f() | 2);
                }
                list.add(a1);
                a1.a(chartaxis.getTimeInMillis());
                a1.a(a.a().a(b, a, chartaxis.getTimeInMillis()));
            }
            chartaxis.add(5, i * -7);
        } while ((double)chartaxis.getTimeInMillis() > d);
        return;
_L2:
        if (a == e.n)
        {
            i = 6;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    e(e e, Context context)
    {
        a = e;
        b = context;
        super();
    }
}
