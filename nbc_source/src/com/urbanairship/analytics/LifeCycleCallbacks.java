// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

class LifeCycleCallbacks
{
    public static interface Callback
    {

        public abstract void onStart(Activity activity);

        public abstract void onStop(Activity activity);
    }


    LifeCycleCallbacks()
    {
    }

    public static void registerCallback(Application application, Callback callback)
    {
        application.registerActivityLifecycleCallbacks(new android.app.Application.ActivityLifecycleCallbacks(callback) {

            final Callback val$callback;

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
                callback.onStart(activity);
            }

            public void onActivityStopped(Activity activity)
            {
                callback.onStop(activity);
            }

            
            {
                callback = callback1;
                super();
            }
        });
    }
}
