// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.activity;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package me.lyft.android.infrastructure.activity:
//            IActivityService, ActivityResult

public class ActivityServiceRegistry
    implements IActivityService
{

    private Activity currentActivity;
    private Activity nextActivity;
    private Bundle nextActivityState;
    private ArrayList services;

    public transient ActivityServiceRegistry(Object aobj[])
    {
        services = new ArrayList();
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            add(aobj[i]);
        }

    }

    private void add(Object obj)
    {
        if (obj instanceof IActivityService)
        {
            obj = (IActivityService)obj;
            services.add(obj);
            return;
        } else
        {
            throw new IllegalArgumentException(String.format("Service %s should implement IActivityService interface", new Object[] {
                obj.getClass().getSimpleName()
            }));
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        if (currentActivity != null)
        {
            nextActivity = activity;
            nextActivityState = bundle;
        } else
        {
            currentActivity = activity;
            nextActivity = null;
            nextActivityState = null;
        }
        if (nextActivity == null)
        {
            for (Iterator iterator = services.iterator(); iterator.hasNext(); ((IActivityService)iterator.next()).onActivityCreated(activity, bundle)) { }
        }
    }

    public void onActivityDestroyed(Activity activity)
    {
        for (Iterator iterator = services.iterator(); iterator.hasNext(); ((IActivityService)iterator.next()).onActivityDestroyed(activity)) { }
        currentActivity = null;
        if (nextActivity != null)
        {
            activity = nextActivity;
            nextActivity = null;
            onActivityCreated(activity, nextActivityState);
            onActivityStarted(activity);
            onActivityResumed(activity);
        }
    }

    public void onActivityPaused(Activity activity)
    {
        for (Iterator iterator = services.iterator(); iterator.hasNext(); ((IActivityService)iterator.next()).onActivityPaused(activity)) { }
    }

    public void onActivityResult(Activity activity, ActivityResult activityresult)
    {
        for (Iterator iterator = services.iterator(); iterator.hasNext(); ((IActivityService)iterator.next()).onActivityResult(activity, activityresult)) { }
    }

    public void onActivityResumed(Activity activity)
    {
        if (nextActivity == null)
        {
            for (Iterator iterator = services.iterator(); iterator.hasNext(); ((IActivityService)iterator.next()).onActivityResumed(activity)) { }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        for (Iterator iterator = services.iterator(); iterator.hasNext(); ((IActivityService)iterator.next()).onActivitySaveInstanceState(activity, bundle)) { }
    }

    public void onActivityStarted(Activity activity)
    {
        if (nextActivity == null)
        {
            for (Iterator iterator = services.iterator(); iterator.hasNext(); ((IActivityService)iterator.next()).onActivityStarted(activity)) { }
        }
    }

    public void onActivityStopped(Activity activity)
    {
        for (Iterator iterator = services.iterator(); iterator.hasNext(); ((IActivityService)iterator.next()).onActivityStopped(activity)) { }
    }
}
