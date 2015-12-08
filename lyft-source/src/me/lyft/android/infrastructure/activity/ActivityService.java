// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.activity;

import android.app.Activity;
import android.os.Bundle;
import me.lyft.android.logging.L;

// Referenced classes of package me.lyft.android.infrastructure.activity:
//            IActivityService, ActivityResult

public abstract class ActivityService
    implements IActivityService
{

    private Activity currentActivity;

    public ActivityService()
    {
    }

    protected final Activity getCurrentActivity()
    {
        return currentActivity;
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        currentActivity = activity;
    }

    public void onActivityDestroyed(Activity activity)
    {
        if (activity.equals(currentActivity))
        {
            currentActivity = null;
            return;
        } else
        {
            L.e(new IllegalStateException(), "Destroyed and current activity did not match", new Object[0]);
            return;
        }
    }

    public void onActivityPaused(Activity activity)
    {
    }

    public void onActivityResult(Activity activity, ActivityResult activityresult)
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
    }

    public void onActivityStopped(Activity activity)
    {
    }
}
