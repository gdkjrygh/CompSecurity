// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import com.fitbit.ui.ChartViewPager;

// Referenced classes of package com.fitbit.activity.ui:
//            FitbitActivityChartActivity, g, IntradayActivityChartFragment

class a
    implements Runnable
{

    final FitbitActivityChartActivity a;

    public void run()
    {
        ((IntradayActivityChartFragment)FitbitActivityChartActivity.b(a).instantiateItem(FitbitActivityChartActivity.a(a), FitbitActivityChartActivity.a(a).getCurrentItem())).m();
    }

    (FitbitActivityChartActivity fitbitactivitychartactivity)
    {
        a = fitbitactivitychartactivity;
        super();
    }
}
