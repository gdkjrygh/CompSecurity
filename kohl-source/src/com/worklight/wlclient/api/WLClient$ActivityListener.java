// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import android.app.Activity;
import android.os.Bundle;
import com.worklight.common.Logger;

// Referenced classes of package com.worklight.wlclient.api:
//            WLClient

class activityCount
    implements android.app.cleCallbacks
{

    private int activityCount;
    final WLClient this$0;

    public boolean isAppInBackground()
    {
        return activityCount == 0;
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        WLClient.access$100().debug((new StringBuilder()).append("on activity created ").append(activity.getClass().getName()).toString());
    }

    public void onActivityDestroyed(Activity activity)
    {
        WLClient.access$100().debug((new StringBuilder()).append("on activity destroyed ").append(activity.getClass().getName()).toString());
    }

    public void onActivityPaused(Activity activity)
    {
        activityCount = activityCount - 1;
        WLClient.access$100().debug((new StringBuilder()).append("on activity paused ").append(activity.getClass().getName()).append(" . activity count = ").append(activityCount).toString());
    }

    public void onActivityResumed(Activity activity)
    {
        activityCount = activityCount + 1;
        WLClient.access$100().debug((new StringBuilder()).append("on activity resumed ").append(activity.getClass().getName()).append(" . activity count = ").append(activityCount).toString());
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        WLClient.access$100().debug((new StringBuilder()).append("on activity save instance state ").append(activity.getClass().getName()).toString());
    }

    public void onActivityStarted(Activity activity)
    {
        WLClient.access$100().debug((new StringBuilder()).append("on activity started ").append(activity.getClass().getName()).toString());
    }

    public void onActivityStopped(Activity activity)
    {
        WLClient.access$100().debug((new StringBuilder()).append("on activity stopped ").append(activity.getClass().getName()).toString());
    }

    ()
    {
        this$0 = WLClient.this;
        super();
        activityCount = 0;
    }
}
