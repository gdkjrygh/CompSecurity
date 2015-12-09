// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import android.content.Context;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.fitbit.util.o;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

// Referenced classes of package com.fitbit.util.chart:
//            Filter, TimeIntervalType

static final class t>
    implements com.artfulbits.aiCharts.Base.b
{

    Calendar a;
    final e b;
    final Context c;

    public void a(ChartAxis chartaxis, List list)
    {
        chartaxis.a().c();
        chartaxis.a().d();
        double d1 = chartaxis.a().f();
        double d2 = chartaxis.a().g();
        a.setTimeInMillis((long)d1);
        o.c(a);
        list.clear();
        for (double d = a.getTimeInMillis(); d < d2; d = a.getTimeInMillis())
        {
            if (d >= d1 + 0.0D && d <= d2 - 0.0D)
            {
                chartaxis = new com.artfulbits.aiCharts.Base.a(null, 0.0D);
                if (Filter.b(b))
                {
                    chartaxis.b(chartaxis.f() | 2);
                }
                chartaxis.a(a.getTimeInMillis());
                chartaxis.a(b.a().a(c, b, a.getTimeInMillis()));
                list.add(chartaxis);
            }
            a.add(5, 1);
        }

    }

    e(e e, Context context)
    {
        b = e;
        c = context;
        super();
        a = new GregorianCalendar();
    }
}
