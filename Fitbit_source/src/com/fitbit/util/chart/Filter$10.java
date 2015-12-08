// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.util.Calendar;
import java.util.List;

// Referenced classes of package com.fitbit.util.chart:
//            Filter

static final class a
    implements com.artfulbits.aiCharts.Base.b
{

    Calendar a;

    public void a(ChartAxis chartaxis, List list)
    {
        double d1 = chartaxis.a().f();
        double d2 = chartaxis.a().g();
        a.setTimeInMillis((long)d1);
        a.set(11, 0);
        a.set(12, 0);
        a.set(13, 0);
        a.set(14, 0);
        list.clear();
        for (double d = a.getTimeInMillis(); d < d2; d = a.getTimeInMillis())
        {
            if (d >= d1 + 0.0D && d <= d2 - 0.0D)
            {
                chartaxis = new com.artfulbits.aiCharts.Base.a(null, 0.0D);
                chartaxis.a(a.getTimeInMillis());
                chartaxis.a(e.e(a.getTimeInMillis()));
                list.add(chartaxis);
            }
            a.add(11, 2);
        }

    }

    rtAxis()
    {
        a = o.c();
    }
}
