// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

abstract class LifeCycleCallbacks
{

    private android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
    private boolean isRegistered;

    public LifeCycleCallbacks()
    {
        isRegistered = false;
        activityLifecycleCallbacks = new android.app.Application.ActivityLifecycleCallbacks() {

            final LifeCycleCallbacks this$0;

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
                LifeCycleCallbacks.this.onActivityStarted(activity);
            }

            public void onActivityStopped(Activity activity)
            {
                LifeCycleCallbacks.this.onActivityStopped(activity);
            }

            
            {
                this$0 = LifeCycleCallbacks.this;
                super();
            }
        };
    }

    public abstract void onActivityStarted(Activity activity);

    public abstract void onActivityStopped(Activity activity);

    public void register(Application application)
    {
        if (!isRegistered)
        {
            application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            isRegistered = true;
        }
    }

    public void unregister(Application application)
    {
        if (isRegistered)
        {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            isRegistered = false;
        }
    }
}
