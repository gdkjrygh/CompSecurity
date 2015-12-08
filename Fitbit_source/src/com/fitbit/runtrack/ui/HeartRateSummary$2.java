// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import com.artfulbits.aiCharts.Base.ChartAxis;
import com.fitbit.data.domain.heartrate.HeartRateZone;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            HeartRateSummary

class b
    implements com.artfulbits.aiCharts.Base.
{

    final int a;
    final HeartRateZone b;
    final HeartRateSummary c;

    public void a(ChartAxis chartaxis, List list)
    {
        list.clear();
        list.add(new com.artfulbits.aiCharts.Base.("30  ", 30D, 2));
        list.add(new com.artfulbits.aiCharts.Base.((new StringBuilder()).append(a).append("  ").toString(), a, 2));
        list.add(new com.artfulbits.aiCharts.Base.((new StringBuilder()).append(b.b()).append("  ").toString(), b.b(), 2));
    }

    Zone(HeartRateSummary heartratesummary, int i, HeartRateZone heartratezone)
    {
        c = heartratesummary;
        a = i;
        b = heartratezone;
        super();
    }
}
