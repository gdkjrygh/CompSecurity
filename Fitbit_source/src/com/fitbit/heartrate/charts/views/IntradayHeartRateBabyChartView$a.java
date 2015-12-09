// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.charts.views;

import com.artfulbits.aiCharts.Base.ChartAxis;
import java.util.List;

// Referenced classes of package com.fitbit.heartrate.charts.views:
//            IntradayHeartRateBabyChartView

private class <init>
    implements com.artfulbits.aiCharts.Base.ew.a
{

    final IntradayHeartRateBabyChartView a;

    private com.artfulbits.aiCharts.Base.ew.a a()
    {
        int i = (int)Math.round(IntradayHeartRateBabyChartView.a(a));
        com.artfulbits.aiCharts.Base.ew ew = new com.artfulbits.aiCharts.Base.ew.a.a(String.valueOf(i), i);
        a(ew);
        return ew;
    }

    private void a(com.artfulbits.aiCharts.Base.ew.a a1)
    {
        a1.ew(IntradayHeartRateBabyChartView.c(a));
        a1.a(3);
    }

    private com.artfulbits.aiCharts.Base.ew.a b()
    {
        int i = (int)Math.round(IntradayHeartRateBabyChartView.b(a));
        int j = (int)Math.round(IntradayHeartRateBabyChartView.a(a));
        i = Math.round((i - j) / 2 + j);
        com.artfulbits.aiCharts.Base.ew ew = new com.artfulbits.aiCharts.Base.ew.a.a(String.valueOf(i), i);
        a(ew);
        return ew;
    }

    private com.artfulbits.aiCharts.Base.ew.a c()
    {
        int i = (int)Math.round(IntradayHeartRateBabyChartView.b(a));
        com.artfulbits.aiCharts.Base.ew ew = new com.artfulbits.aiCharts.Base.ew.a.a(String.valueOf(i), i);
        a(ew);
        return ew;
    }

    public void a(ChartAxis chartaxis, List list)
    {
        list.clear();
        list.add(a());
        list.add(b());
        list.add(c());
    }

    private (IntradayHeartRateBabyChartView intradayheartratebabychartview)
    {
        a = intradayheartratebabychartview;
        super();
    }

    a(IntradayHeartRateBabyChartView intradayheartratebabychartview, a a1)
    {
        this(intradayheartratebabychartview);
    }
}
