// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.fitbit.data.bl.an;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            RecentSummary, l

class a
    implements com.artfulbits.aiCharts.Base.
{

    final RecentSummary a;

    public void a(ChartAxis chartaxis, List list)
    {
        chartaxis = chartaxis.a();
        list.clear();
        l l1 = new l(an.a().b());
        for (int i = 0; i <= chartaxis.m(); i++)
        {
            double d = i;
            double d1 = chartaxis.i();
            list.add(new com.artfulbits.aiCharts.Base.t>(l1.a(a.getActivity(), d * d1), (double)i * chartaxis.i(), 2));
        }

    }

    a(RecentSummary recentsummary)
    {
        a = recentsummary;
        super();
    }
}
