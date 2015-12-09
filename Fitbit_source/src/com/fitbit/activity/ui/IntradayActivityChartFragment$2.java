// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.de;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.activity.ui:
//            IntradayActivityChartFragment, f

class a
    implements Runnable
{

    final IntradayActivityChartFragment a;

    public void run()
    {
        IntradayActivityChartFragment.e(a);
        UUID uuid = UUID.randomUUID();
        IntradayActivityChartFragment.g(a).a(IntradayActivityChartFragment.f(a));
        IntradayActivityChartFragment.g(a).a(de.a(FitBitApplication.a(), IntradayActivityChartFragment.c(a), IntradayActivityChartFragment.h(a), IntradayActivityChartFragment.h(a), false, uuid), uuid);
        if (IntradayActivityChartFragment.d(a) == null || IntradayActivityChartFragment.d(a).a.size() == 0)
        {
            IntradayActivityChartFragment.a(a, null);
            a.a(ate.b);
        }
    }

    ate(IntradayActivityChartFragment intradayactivitychartfragment)
    {
        a = intradayactivitychartfragment;
        super();
    }
}
