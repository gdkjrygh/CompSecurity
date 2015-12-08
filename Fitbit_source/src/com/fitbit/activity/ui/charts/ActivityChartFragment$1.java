// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.charts;

import com.fitbit.activity.ui.charts.views.ActivityInteractiveChartView;
import com.fitbit.ui.charts.t;

// Referenced classes of package com.fitbit.activity.ui.charts:
//            ActivityChartFragment

class b
    implements Runnable
{

    final t a;
    final double b;
    final ActivityChartFragment c;

    public void run()
    {
        ActivityChartFragment.c(c).a(a, b, ActivityChartFragment.a(c), ActivityChartFragment.b(c));
    }

    eChartView(ActivityChartFragment activitychartfragment, t t, double d)
    {
        c = activitychartfragment;
        a = t;
        b = d;
        super();
    }
}
