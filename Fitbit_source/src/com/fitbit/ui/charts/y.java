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

public class y
    implements com.artfulbits.aiCharts.Base.ChartAxis.b
{

    private Context a;
    private Calendar b;

    public y(Context context, Timeframe timeframe)
    {
        b = o.c();
        a = context;
    }

    public void a(ChartAxis chartaxis, List list)
    {
        list.clear();
        double d = chartaxis.a().f();
        double d1 = o.c(new Date()).getTime();
        b.setTimeInMillis((long)d1);
        o.b(b);
        for (; (double)b.getTimeInMillis() > d; b.add(5, -3))
        {
            long l = b.getTimeInMillis();
            boolean flag = o.j(new Date(l));
            Object obj = e.c(b.getTimeInMillis());
            if (flag)
            {
                obj = com.fitbit.util.chart.a.b(a, com.fitbit.ui.charts.Timeframe.a);
            }
            obj = new b(com.fitbit.ui.charts.Timeframe.a, ((String) (obj)), flag, chartaxis.k());
            com.artfulbits.aiCharts.Base.ChartAxis.a a1 = new com.artfulbits.aiCharts.Base.ChartAxis.a("", l);
            a1.a(((android.graphics.drawable.Drawable) (obj)));
            list.add(a1);
        }

    }
}
