// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

import android.content.Context;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.fitbit.util.chart.a;
import com.fitbit.util.chart.b;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.ui.charts:
//            Timeframe

public class v
    implements com.artfulbits.aiCharts.Base.ChartAxis.b
{

    private final Context a;
    private final Calendar b;
    private final double c;
    private final boolean d;
    private final boolean e;

    public v(Context context, double d1, boolean flag)
    {
        this(context, d1, false, flag);
    }

    public v(Context context, double d1, boolean flag, boolean flag1)
    {
        b = o.c();
        a = context;
        c = d1;
        d = flag;
        e = flag1;
    }

    public void a(ChartAxis chartaxis, List list)
    {
        list.clear();
        Date date = o.c(o.b());
        b.setTimeInMillis(date.getTime());
        if (d)
        {
            o.a(b);
        }
        long l = b.getTimeInMillis();
        boolean flag = o.j(new Date(l));
        if (flag && !e)
        {
            Object obj = com.fitbit.util.format.e.c(b.getTimeInMillis());
            if (flag)
            {
                obj = com.fitbit.util.chart.a.b(a, com.fitbit.ui.charts.Timeframe.a);
            }
            chartaxis = new b(com.fitbit.ui.charts.Timeframe.a, ((String) (obj)), flag, chartaxis.k(), (float)c);
            obj = new com.artfulbits.aiCharts.Base.ChartAxis.a("", l);
            ((com.artfulbits.aiCharts.Base.ChartAxis.a) (obj)).a(chartaxis);
            list.add(obj);
            b.add(5, -3);
        }
    }
}
