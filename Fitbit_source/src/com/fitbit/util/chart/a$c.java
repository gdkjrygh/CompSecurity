// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import com.artfulbits.aiCharts.Base.ChartAxis;
import java.util.List;

// Referenced classes of package com.fitbit.util.chart:
//            a

public static class a
    implements com.artfulbits.aiCharts.Base.tAxis.b, se.tAxis.b
{

    private com.artfulbits.aiCharts.Base.tAxis.b a;
    private List b;

    public List a()
    {
        return b;
    }

    public void a(ChartAxis chartaxis, List list)
    {
        a.a(chartaxis, list);
        b = list;
    }

    public se.tAxis.b(com.artfulbits.aiCharts.Base.tAxis.b b1)
    {
        a = b1;
    }
}
