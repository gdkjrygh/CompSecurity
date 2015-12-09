// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import android.content.Context;
import android.graphics.RectF;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.fitbit.util.ap;
import com.fitbit.util.format.e;
import java.text.Format;
import java.util.List;

// Referenced classes of package com.fitbit.util.chart:
//            Filter

static final class  extends 
{

    final Context a;

    public void a(ChartAxis chartaxis, List list)
    {
        super.(chartaxis, list);
        com.artfulbits.aiCharts.Base..a a1;
        if (list != null && list.size() != 0)
        {
            a1 = (com.artfulbits.aiCharts.Base..a)list.get(0);
            double d;
            com.artfulbits.aiCharts.Base..a a3;
            if (Math.abs((float)((double)chartaxis.B().bottom - chartaxis.a().h(a1.b()) * (double)chartaxis.B().height()) - (float)((double)chartaxis.B().bottom - chartaxis.a().h(chartaxis.a().f()) * (double)chartaxis.B().height())) < (float)ap.a(a, 14F))
            {
                if (chartaxis.x() != null)
                {
                    a1.a(chartaxis.x().format(Double.valueOf(a1.b())));
                } else
                {
                    a1.a(e.e(a1.b()));
                }
            }
        }
        if (list != null && list.size() > 2)
        {
            a1 = (com.artfulbits.aiCharts.Base..a)list.get(list.size() - 1);
            com.artfulbits.aiCharts.Base..a a2 = (com.artfulbits.aiCharts.Base..a)list.get(list.size() - 2);
            a3 = (com.artfulbits.aiCharts.Base..a)list.get(list.size() - 3);
            if (chartaxis.x() != null)
            {
                a1.a(chartaxis.x().format(Double.valueOf(a1.b())));
                a2.a(chartaxis.x().format(Double.valueOf(a2.b())));
            } else
            {
                a1.a(e.e(a1.b()));
                a2.a(e.e(a2.b()));
            }
            d = a1.b() - a2.b();
            if (d != a2.b() - a3.b() && d != 0.0D)
            {
                list.remove(list.size() - 1);
            }
        }
    }

    (com.artfulbits.aiCharts.Base..b b, Context context)
    {
        a = context;
        super(b);
    }
}
