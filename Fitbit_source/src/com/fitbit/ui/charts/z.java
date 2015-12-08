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

public class z
    implements com.artfulbits.aiCharts.Base.ChartAxis.b
{

    private Context a;
    private Calendar b;
    private boolean c;

    public z(Context context, boolean flag)
    {
        b = o.c();
        a = context;
        c = flag;
    }

    public void a(ChartAxis chartaxis, List list)
    {
        list.clear();
        double d = o.d().getTimeInMillis();
        double d1 = chartaxis.a().f();
        b.setTimeInMillis((long)d);
        o.b(b);
        b.set(5, 1);
        while ((double)b.getTimeInMillis() > d1) 
        {
            long l = b.getTimeInMillis();
            boolean flag = o.j(b);
            Object obj = e.b(a, new Date(l));
            com.artfulbits.aiCharts.Base.ChartAxis.a a1;
            int i;
            int j;
            int k;
            if (flag)
            {
                if (c)
                {
                    obj = a.getResources().getString(0x7f080540);
                } else
                {
                    obj = com.fitbit.util.chart.a.b(a, Timeframe.d);
                }
            }
            obj = new b(Timeframe.d, ((String) (obj)), flag, chartaxis.k());
            a1 = new com.artfulbits.aiCharts.Base.ChartAxis.a(null, l);
            a1.a(((android.graphics.drawable.Drawable) (obj)));
            list.add(a1);
            b.add(2, -4);
            k = b.get(2);
            j = 6 - k;
            i = j;
            if (j > 0)
            {
                i = 0 - k;
            }
            b.add(2, i);
        }
    }
}
