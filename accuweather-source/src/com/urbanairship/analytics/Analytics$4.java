// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.app.Activity;
import com.urbanairship.UAirship;

// Referenced classes of package com.urbanairship.analytics:
//            Analytics

static final class val.timeMS
    implements com.urbanairship.eadyCallback
{

    final Activity val$activity;
    final long val$timeMS;

    public void onAirshipReady(UAirship uairship)
    {
        Analytics.access$600(uairship.getAnalytics(), val$activity, tor.Source.MANUAL_INSTRUMENTATION, val$timeMS);
    }

    tor.Source(Activity activity1, long l)
    {
        val$activity = activity1;
        val$timeMS = l;
        super();
    }
}
