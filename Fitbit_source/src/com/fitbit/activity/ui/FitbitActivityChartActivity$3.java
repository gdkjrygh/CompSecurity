// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import com.fitbit.ui.ChartViewPager;
import java.util.GregorianCalendar;

// Referenced classes of package com.fitbit.activity.ui:
//            FitbitActivityChartActivity, g, IntradayActivityChartFragment

class a
    implements android.support.v4.view.
{

    final FitbitActivityChartActivity a;

    public void onPageScrollStateChanged(int i)
    {
        IntradayActivityChartFragment intradayactivitychartfragment = (IntradayActivityChartFragment)FitbitActivityChartActivity.b(a).instantiateItem(FitbitActivityChartActivity.a(a), FitbitActivityChartActivity.a(a).getCurrentItem());
        if (i != 0 && intradayactivitychartfragment != null)
        {
            intradayactivitychartfragment.m();
        }
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        if (FitbitActivityChartActivity.b(a) != null)
        {
            (new GregorianCalendar()).add(5, -(FitbitActivityChartActivity.b(a).getCount() - i - 1));
        }
        a.a_(i);
    }

    r(FitbitActivityChartActivity fitbitactivitychartactivity)
    {
        a = fitbitactivitychartactivity;
        super();
    }
}
