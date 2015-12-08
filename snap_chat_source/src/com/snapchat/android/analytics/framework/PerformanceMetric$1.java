// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import LP;
import LQ;

// Referenced classes of package com.snapchat.android.analytics.framework:
//            PerformanceMetric

class a
    implements Runnable
{

    private PerformanceMetric a;

    public void run()
    {
        LQ lq = PerformanceMetric.a(a);
        PerformanceMetric performancemetric = a;
        lq.mUiLatencyAggregator.a(performancemetric);
        PerformanceMetric.b(a);
    }

    (PerformanceMetric performancemetric)
    {
        a = performancemetric;
        super();
    }
}
