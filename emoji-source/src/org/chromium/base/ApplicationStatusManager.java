// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import java.util.Iterator;

// Referenced classes of package org.chromium.base:
//            ObserverList, ApplicationStatus, WindowCallbackWrapper

public class ApplicationStatusManager
{
    public static interface WindowFocusChangedListener
    {

        public abstract void onWindowFocusChanged(Activity activity, boolean flag);
    }


    private static ObserverList sWindowFocusListeners = new ObserverList();

    public ApplicationStatusManager()
    {
    }

    public static void informActivityStarted(Activity activity)
    {
        setWindowFocusChangedCallback(activity);
        ApplicationStatus.informActivityStarted(activity);
    }

    public static void init(Application application)
    {
        ApplicationStatus.initialize(application);
        application.registerActivityLifecycleCallbacks(new android.app.Application.ActivityLifecycleCallbacks() {

            static final boolean $assertionsDisabled;

            public void onActivityCreated(Activity activity, Bundle bundle)
            {
                ApplicationStatusManager.setWindowFocusChangedCallback(activity);
            }

            public void onActivityDestroyed(Activity activity)
            {
                if (!$assertionsDisabled && !(activity.getWindow().getCallback() instanceof WindowCallbackWrapper))
                {
                    throw new AssertionError();
                } else
                {
                    return;
                }
            }

            public void onActivityPaused(Activity activity)
            {
                if (!$assertionsDisabled && !(activity.getWindow().getCallback() instanceof WindowCallbackWrapper))
                {
                    throw new AssertionError();
                } else
                {
                    return;
                }
            }

            public void onActivityResumed(Activity activity)
            {
                if (!$assertionsDisabled && !(activity.getWindow().getCallback() instanceof WindowCallbackWrapper))
                {
                    throw new AssertionError();
                } else
                {
                    return;
                }
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
            {
                if (!$assertionsDisabled && !(activity.getWindow().getCallback() instanceof WindowCallbackWrapper))
                {
                    throw new AssertionError();
                } else
                {
                    return;
                }
            }

            public void onActivityStarted(Activity activity)
            {
                if (!$assertionsDisabled && !(activity.getWindow().getCallback() instanceof WindowCallbackWrapper))
                {
                    throw new AssertionError();
                } else
                {
                    return;
                }
            }

            public void onActivityStopped(Activity activity)
            {
                if (!$assertionsDisabled && !(activity.getWindow().getCallback() instanceof WindowCallbackWrapper))
                {
                    throw new AssertionError();
                } else
                {
                    return;
                }
            }

            static 
            {
                boolean flag;
                if (!org/chromium/base/ApplicationStatusManager.desiredAssertionStatus())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                $assertionsDisabled = flag;
            }

        });
    }

    public static void registerWindowFocusChangedListener(WindowFocusChangedListener windowfocuschangedlistener)
    {
        sWindowFocusListeners.addObserver(windowfocuschangedlistener);
    }

    private static void setWindowFocusChangedCallback(Activity activity)
    {
        android.view.Window.Callback callback = activity.getWindow().getCallback();
        activity.getWindow().setCallback(new WindowCallbackWrapper(callback, activity) {

            final Activity val$activity;

            public void onWindowFocusChanged(boolean flag)
            {
                super.onWindowFocusChanged(flag);
                for (Iterator iterator = ApplicationStatusManager.sWindowFocusListeners.iterator(); iterator.hasNext(); ((WindowFocusChangedListener)iterator.next()).onWindowFocusChanged(activity, flag)) { }
            }

            
            {
                activity = activity1;
                super(callback);
            }
        });
    }

    public static void unregisterWindowFocusChangedListener(WindowFocusChangedListener windowfocuschangedlistener)
    {
        sWindowFocusListeners.removeObserver(windowfocuschangedlistener);
    }



}
