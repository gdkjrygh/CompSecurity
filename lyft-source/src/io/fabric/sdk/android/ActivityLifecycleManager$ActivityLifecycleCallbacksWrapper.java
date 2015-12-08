// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

class b
{

    private final Set a = new HashSet();
    private final Application b;

    static boolean a(b b1, b b2)
    {
        return b1.a(b2);
    }

    private boolean a(a a1)
    {
        if (b != null)
        {
            a1 = new android.app.Application.ActivityLifecycleCallbacks(a1) {

                final ActivityLifecycleManager.Callbacks a;
                final ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper b;

                public void onActivityCreated(Activity activity, Bundle bundle)
                {
                    a.a(activity, bundle);
                }

                public void onActivityDestroyed(Activity activity)
                {
                    a.e(activity);
                }

                public void onActivityPaused(Activity activity)
                {
                    a.c(activity);
                }

                public void onActivityResumed(Activity activity)
                {
                    a.b(activity);
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
                {
                    a.b(activity, bundle);
                }

                public void onActivityStarted(Activity activity)
                {
                    a.a(activity);
                }

                public void onActivityStopped(Activity activity)
                {
                    a.d(activity);
                }

            
            {
                b = ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper.this;
                a = callbacks;
                super();
            }
            };
            b.registerActivityLifecycleCallbacks(a1);
            a.add(a1);
            return true;
        } else
        {
            return false;
        }
    }

    _cls1.a(Application application)
    {
        b = application;
    }
}
