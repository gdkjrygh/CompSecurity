// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.app.Application;
import android.content.Context;

public class ActivityLifecycleManager
{

    private final Application a;
    private ActivityLifecycleCallbacksWrapper b;

    public ActivityLifecycleManager(Context context)
    {
        a = (Application)context.getApplicationContext();
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b = new ActivityLifecycleCallbacksWrapper(a);
        }
    }

    public boolean a(Callbacks callbacks)
    {
        return b != null && ActivityLifecycleCallbacksWrapper.a(b, callbacks);
    }

    private class ActivityLifecycleCallbacksWrapper
    {

        private final Set a = new HashSet();
        private final Application b;

        static boolean a(ActivityLifecycleCallbacksWrapper activitylifecyclecallbackswrapper, Callbacks callbacks)
        {
            return activitylifecyclecallbackswrapper.a(callbacks);
        }

        private boolean a(Callbacks callbacks)
        {
            if (b != null)
            {
                callbacks = new android.app.Application.ActivityLifecycleCallbacks(callbacks) {

                    final Callbacks a;
                    final ActivityLifecycleCallbacksWrapper b;

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
                    b = ActivityLifecycleCallbacksWrapper.this;
                    a = callbacks;
                    super();
                }

                    private class Callbacks
                    {

                        public void a(Activity activity)
                        {
                        }

                        public void a(Activity activity, Bundle bundle)
                        {
                        }

                        public void b(Activity activity)
                        {
                        }

                        public void b(Activity activity, Bundle bundle)
                        {
                        }

                        public void c(Activity activity)
                        {
                        }

                        public void d(Activity activity)
                        {
                        }

                        public void e(Activity activity)
                        {
                        }

                        public Callbacks()
                        {
                        }
                    }

                };
                b.registerActivityLifecycleCallbacks(callbacks);
                a.add(callbacks);
                return true;
            } else
            {
                return false;
            }
        }

        ActivityLifecycleCallbacksWrapper(Application application)
        {
            b = application;
        }
    }

}
