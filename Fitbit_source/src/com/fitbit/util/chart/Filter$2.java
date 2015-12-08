// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import android.content.Context;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.fitbit.util.al;
import com.fitbit.util.bn;
import com.fitbit.util.o;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

// Referenced classes of package com.fitbit.util.chart:
//            Filter, TimeIntervalType

static final class it>
    implements com.artfulbits.aiCharts.Base..b
{

    Calendar a;
    final pe b;
    final Context c;

    public void a(ChartAxis chartaxis, List list)
    {
        a.setTime(new Date());
        double d = chartaxis.a().f();
        if (a.get(5) > 15)
        {
            a.set(5, 15);
        } else
        {
            a.set(5, 1);
        }
        list.clear();
        do
        {
            o.b(a);
            chartaxis = new com.artfulbits.aiCharts.Base..a(null, 0.0D);
            list.add(chartaxis);
            chartaxis.a(a.getTimeInMillis());
            chartaxis.a(b.a().a(c, b, a.getTimeInMillis()));
            if (a.get(5) == 15)
            {
                a.set(5, 1);
            } else
            {
                a.add(6, -1);
                a.set(5, 15);
            }
        } while ((double)a.getTimeInMillis() > d);
    }

    pe(pe pe, Context context)
    {
        b = pe;
        c = context;
        super();
        a = new GregorianCalendar(bn.b(), al.a());
    }
}
