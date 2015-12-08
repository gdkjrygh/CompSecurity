// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui;

import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.util.a;

// Referenced classes of package com.fitbit.activity.ui:
//            i, FitbitActivityChartActivity

class a extends i
{

    final FitbitActivityChartActivity a;

    protected void a(LiveDataPacket livedatapacket)
    {
        double d = com.fitbit.util.a.a(FitbitActivityChartActivity.c(a));
        if (d > 0.0D)
        {
            com.fitbit.activity.ui.FitbitActivityChartActivity.a(a, d);
        }
    }

    (FitbitActivityChartActivity fitbitactivitychartactivity)
    {
        a = fitbitactivitychartactivity;
        super();
    }
}
