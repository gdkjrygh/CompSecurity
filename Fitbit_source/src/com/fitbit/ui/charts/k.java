// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

import android.content.Context;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.fitbit.util.chart.a;
import com.fitbit.util.chart.b;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.ui.charts:
//            Timeframe

public class k
    implements com.artfulbits.aiCharts.Base.ChartAxis.b
{

    private Context a;
    private Calendar b;

    public k(Context context)
    {
        b = o.c();
        a = context;
    }

    public void a(ChartAxis chartaxis, List list)
    {
        list.clear();
        double d = chartaxis.a().f();
        double d1 = o.d().getTimeInMillis();
        b.setTimeInMillis((long)d1);
        o.b(b);
        while ((double)b.getTimeInMillis() > d) 
        {
            long l = b.getTimeInMillis();
            boolean flag = o.j(new Date(l));
            Object obj = e.d(a, b.getTimeInMillis());
            if (flag)
            {
                obj = com.fitbit.util.chart.a.b(a, com.fitbit.ui.charts.Timeframe.b);
            }
            obj = new b(com.fitbit.ui.charts.Timeframe.b, ((String) (obj)), flag, chartaxis.k());
            com.artfulbits.aiCharts.Base.ChartAxis.a a1 = new com.artfulbits.aiCharts.Base.ChartAxis.a("", l);
            a1.a(((android.graphics.drawable.Drawable) (obj)));
            list.add(a1);
            b.add(6, -5);
            int i = b.get(5);
            if (i >= 20)
            {
                i = 20;
            } else
            if (i >= 10)
            {
                i = 10;
            } else
            {
                i = 1;
            }
            b.set(5, i);
        }
    }
}
