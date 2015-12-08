// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import android.app.Activity;
import com.flurry.android.FlurryAgent;

// Referenced classes of package com.snapchat.android.analytics.framework:
//            FlurryAnalyticsPlatform

class a
    implements Runnable
{

    private Activity a;

    public void run()
    {
        FlurryAgent.setUseHttps(true);
        FlurryAgent.setReportLocation(false);
        FlurryAgent.onStartSession(a, "FRW84M2GG56RMM8VWT5G");
    }

    (Activity activity)
    {
        a = activity;
        super();
    }
}
