// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.airship;

import android.app.Activity;
import android.os.Bundle;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.Analytics;

public class AirshipLifecycleCallbacks
    implements android.app.Application.ActivityLifecycleCallbacks
{

    public AirshipLifecycleCallbacks()
    {
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
    }

    public void onActivityResumed(Activity activity)
    {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
        UAirship.shared().getAnalytics().activityStarted(activity);
    }

    public void onActivityStopped(Activity activity)
    {
        UAirship.shared().getAnalytics().activityStopped(activity);
    }
}
