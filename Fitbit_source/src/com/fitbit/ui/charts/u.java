// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

import android.content.Context;
import android.content.res.Resources;
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

public class u
    implements com.artfulbits.aiCharts.Base.ChartAxis.b
{

    private Context a;
    private Calendar b;
    private boolean c;

    public u(Context context, boolean flag)
    {
        b = o.c();
        a = context;
        c = flag;
    }

    private static void a(Calendar calendar)
    {
        calendar.add(3, -1);
        calendar.setMinimalDaysInFirstWeek(7);
        calendar.set(4, 1);
        calendar.set(7, calendar.getFirstDayOfWeek());
    }

    public void a(ChartAxis chartaxis, List list)
    {
        list.clear();
        long l = o.d().getTime().getTime();
        double d = chartaxis.a().f();
        b.setTimeInMillis(l);
        o.b(b);
        b.set(7, b.getFirstDayOfWeek());
        l = b.getTimeInMillis();
        do
        {
            if ((double)b.getTimeInMillis() <= d)
            {
                break;
            }
            long l1 = b.getTimeInMillis();
            Object obj;
            com.artfulbits.aiCharts.Base.ChartAxis.a a1;
            boolean flag;
            if (l1 == l)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = e.d(0x240c8400L + l1);
            if (flag)
            {
                if (c)
                {
                    obj = a.getResources().getString(0x7f080540);
                } else
                {
                    obj = com.fitbit.util.chart.a.b(a, Timeframe.c);
                }
            }
            obj = new b(Timeframe.c, ((String) (obj)), flag, chartaxis.k());
            a1 = new com.artfulbits.aiCharts.Base.ChartAxis.a("", l1);
            a1.a(((android.graphics.drawable.Drawable) (obj)));
            list.add(a1);
            a(b);
            if (l - b.getTimeInMillis() < 0xb43e9400L)
            {
                a(b);
            }
        } while (true);
    }
}
