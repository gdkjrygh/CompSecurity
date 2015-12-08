// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package io.fabric.sdk.android:
//            ActivityLifecycleManager

private static class application
{

    private final Application application;
    private final Set registeredCallbacks = new HashSet();

    private void clearCallbacks()
    {
        android.app.ksWrapper kswrapper;
        for (Iterator iterator = registeredCallbacks.iterator(); iterator.hasNext(); application.unregisterActivityLifecycleCallbacks(kswrapper))
        {
            kswrapper = (android.app.ksWrapper.application)iterator.next();
        }

    }

    private boolean registerLifecycleCallbacks(final application callbacks)
    {
        if (application != null)
        {
            callbacks = new android.app.Application.ActivityLifecycleCallbacks() {

                final ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper this$0;
                final ActivityLifecycleManager.Callbacks val$callbacks;

                public void onActivityCreated(Activity activity, Bundle bundle)
                {
                    callbacks.onActivityCreated(activity, bundle);
                }

                public void onActivityDestroyed(Activity activity)
                {
                    callbacks.onActivityDestroyed(activity);
                }

                public void onActivityPaused(Activity activity)
                {
                    callbacks.onActivityPaused(activity);
                }

                public void onActivityResumed(Activity activity)
                {
                    callbacks.onActivityResumed(activity);
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
                {
                    callbacks.onActivitySaveInstanceState(activity, bundle);
                }

                public void onActivityStarted(Activity activity)
                {
                    callbacks.onActivityStarted(activity);
                }

                public void onActivityStopped(Activity activity)
                {
                    callbacks.onActivityStopped(activity);
                }

            
            {
                this$0 = ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper.this;
                callbacks = callbacks1;
                super();
            }
            };
            application.registerActivityLifecycleCallbacks(callbacks);
            registeredCallbacks.add(callbacks);
            return true;
        } else
        {
            return false;
        }
    }



    _cls1.val.callbacks(Application application1)
    {
        application = application1;
    }
}
