// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.charts.views;

import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.t;
import com.fitbit.ui.charts.n;

// Referenced classes of package com.fitbit.activity.ui.charts.views:
//            ActivityInteractiveChartView, c

class a
    implements t
{

    final ActivityInteractiveChartView a;

    public j a(Object obj, j j1)
    {
        obj = (n)obj;
        double d = ((n) (obj)).b();
        if (j1 != null)
        {
            j1.a(((n) (obj)).a(), d);
        } else
        {
            j1 = new j(((n) (obj)).a(), new double[] {
                d
            });
        }
        if (d >= ActivityInteractiveChartView.c(a))
        {
            j1.a(com.fitbit.activity.ui.charts.views.c.j, Boolean.valueOf(true));
        }
        if ((long)j1.a() == ActivityInteractiveChartView.d(a))
        {
            j1.a(c.l, Boolean.valueOf(true));
        }
        return j1;
    }

    public volatile Object a(Object obj, Object obj1)
    {
        return a(obj, (j)obj1);
    }

    (ActivityInteractiveChartView activityinteractivechartview)
    {
        a = activityinteractivechartview;
        super();
    }
}
