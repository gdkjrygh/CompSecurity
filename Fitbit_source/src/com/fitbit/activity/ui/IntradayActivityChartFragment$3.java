// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.e;
import com.fitbit.ui.FitbitChartView;

// Referenced classes of package com.fitbit.activity.ui:
//            IntradayActivityChartFragment

class a
    implements com.artfulbits.aiCharts.Base.
{

    final FitbitChartView a;
    final IntradayActivityChartFragment b;

    public void a(e e, ChartAxis chartaxis)
    {
    }

    public void b(e e, ChartAxis chartaxis)
    {
        if (!IntradayActivityChartFragment.i(b))
        {
            a.s();
        }
    }

    (IntradayActivityChartFragment intradayactivitychartfragment, FitbitChartView fitbitchartview)
    {
        b = intradayactivitychartfragment;
        a = fitbitchartview;
        super();
    }
}
