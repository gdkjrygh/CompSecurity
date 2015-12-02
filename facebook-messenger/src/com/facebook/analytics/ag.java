// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.analytics.module.IsVerboseReliabilityAnalyticsLoggingPermitted;
import com.facebook.common.hardware.k;
import com.facebook.common.time.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.analytics:
//            cn, av, f, g

class ag extends d
{

    final f a;

    private ag(f f)
    {
        a = f;
        super();
    }

    ag(f f, g g)
    {
        this(f);
    }

    public cn a()
    {
        return new cn((av)a(com/facebook/analytics/av), (a)a(com/facebook/common/time/a), b(java/lang/Boolean, com/facebook/analytics/module/IsVerboseReliabilityAnalyticsLoggingPermitted), (k)a(com/facebook/common/hardware/k));
    }

    public Object b()
    {
        return a();
    }
}
