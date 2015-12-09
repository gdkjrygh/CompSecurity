// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import com.artfulbits.aiCharts.Base.ChartAxis;
import java.util.List;

// Referenced classes of package com.fitbit.util.chart:
//            a

public static class se.tAxis.b extends se.tAxis.b
{

    private boolean a;

    public void a(ChartAxis chartaxis, List list)
    {
        if (a)
        {
            list.clear();
            a = false;
        }
        super.a(chartaxis, list);
    }

    public void b()
    {
        a = true;
    }

    public se.tAxis.b(com.artfulbits.aiCharts.Base.tAxis.b b1)
    {
        super(b1);
    }
}
