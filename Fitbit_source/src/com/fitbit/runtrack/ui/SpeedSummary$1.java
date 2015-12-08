// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.fitbit.util.format.e;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            SpeedSummary

class a
    implements com.artfulbits.aiCharts.Base.
{

    final SpeedSummary a;

    public void a(ChartAxis chartaxis, List list)
    {
        chartaxis = chartaxis.a();
        list.clear();
        for (int i = 0; i <= chartaxis.m(); i++)
        {
            double d = i;
            double d1 = chartaxis.i();
            list.add(new com.artfulbits.aiCharts.Base.it>((new StringBuilder()).append(e.a(d * d1)).append("  ").toString(), (double)i * chartaxis.i(), 2));
        }

    }

    (SpeedSummary speedsummary)
    {
        a = speedsummary;
        super();
    }
}
