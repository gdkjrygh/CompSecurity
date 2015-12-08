// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import com.skype.telemetry.sdk.FlurryAccessInterface;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.analytics:
//            Analytics, AnalyticsEvent

final class a
    implements Callable
{

    final AnalyticsEvent a;
    final Analytics b;

    public final Object call()
        throws Exception
    {
        Analytics.a(b).c(a.name());
        return Boolean.valueOf(true);
    }

    nt(Analytics analytics, AnalyticsEvent analyticsevent)
    {
        b = analytics;
        a = analyticsevent;
        super();
    }
}
