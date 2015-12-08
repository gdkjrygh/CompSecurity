// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Types.ChartLineType;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

// Referenced classes of package com.fitbit.util.chart:
//            Filter, a

static final class a
    implements com.artfulbits.aiCharts.Base..b
{

    final pe a;

    public void a(ChartAxis chartaxis, List list)
    {
        chartaxis = chartaxis.a();
        double d = chartaxis.f();
        double d1 = chartaxis.d() - com.fitbit.util.chart.a.a(a, com/artfulbits/aiCharts/Types/ChartLineType);
        chartaxis = new GregorianCalendar();
        chartaxis.setTime(new Date((long)d1));
        o.f(chartaxis);
        list.clear();
        do
        {
            double d2 = chartaxis.getTimeInMillis();
            if (d2 <= d1 - 0.0D && d2 >= 0.0D + d)
            {
                com.artfulbits.aiCharts.Base..a a1 = new com.artfulbits.aiCharts.Base..a(null, 0.0D);
                list.add(a1);
                a1.a(chartaxis.getTimeInMillis());
                a1.a(e.d(chartaxis.getTimeInMillis()));
                if (chartaxis.get(2) == 0)
                {
                    com.artfulbits.aiCharts.Base..a a2 = new com.artfulbits.aiCharts.Base..a(null, 0.0D);
                    list.add(a2);
                    a2.a(chartaxis.getTimeInMillis());
                    a2.a((new StringBuilder()).append(chartaxis.get(1)).append("").toString());
                }
            }
            chartaxis.add(2, -1);
            chartaxis.set(5, chartaxis.getActualMaximum(5));
        } while ((double)chartaxis.getTimeInMillis() > d);
    }

    pe(pe pe)
    {
        a = pe;
        super();
    }
}
