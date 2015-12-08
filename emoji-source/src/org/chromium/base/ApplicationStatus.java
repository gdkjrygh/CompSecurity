// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package org.chromium.base:
//            ObserverList, ApplicationStatusManager, ThreadUtils

public class ApplicationStatus
{
    private static class ActivityInfo
    {

        private ObserverList mListeners;
        private int mStatus;

        public ObserverList getListeners()
        {
            return mListeners;
        }

        public int getStatus()
        {
            return mStatus;
        }

        public void setStatus(int i)
        {
            mStatus = i;
        }

        private ActivityInfo()
        {
            mStatus = 6;
            mListeners = new ObserverList();
        }

    }

    public static interface ActivityStateListener
    {

        public abstract void onActivityStateChange(Activity activity, int i);
    }

    public static interface ApplicationStateListener
    {

        public abstract void onApplicationStateChange(int i);
    }


    static final boolean $assertionsDisabled;
    private static Activity sActivity;
    private static final Map sActivityInfo = new ConcurrentHashMap();
    private static Application sApplication;
    private static final ObserverList sApplicationStateListeners = new ObserverList();
    private static Integer sCachedApplicationState;
    private static Object sCachedApplicationStateLock = new Object();
    private static final ObserverList sGeneralActivityStateListeners = new ObserverList();
    private static ApplicationStateListener sNativeApplicationStateListener;

    private ApplicationStatus()
    {
    }

    private static int determineApplicationState()
    {
        Iterator iterator;
        boolean flag;
        int i;
        byte byte0;
        byte0 = 4;
        i = 0;
        flag = false;
        iterator = sActivityInfo.values().iterator();
_L8:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        int j = ((ActivityInfo)iterator.next()).getStatus();
        if (j == 4 || j == 5 || j == 6) goto _L4; else goto _L3
_L3:
        i = 1;
_L6:
        return i;
_L4:
        if (j == 4)
        {
            i = 1;
        } else
        if (j == 5)
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (i != 0)
        {
            return 2;
        }
        i = byte0;
        if (!flag) goto _L6; else goto _L5
_L5:
        return 3;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static Context getApplicationContext()
    {
        if (sApplication != null)
        {
            return sApplication.getApplicationContext();
        } else
        {
            return null;
        }
    }

    public static Activity getLastTrackedFocusedActivity()
    {
        return sActivity;
    }

    public static List getRunningActivities()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = sActivityInfo.keySet().iterator(); iterator.hasNext(); arraylist.add(new WeakReference((Activity)iterator.next()))) { }
        return arraylist;
    }

    public static int getStateForActivity(Activity activity)
    {
        activity = (ActivityInfo)sActivityInfo.get(activity);
        if (activity != null)
        {
            return activity.getStatus();
        } else
        {
            return 6;
        }
    }

    public static int getStateForApplication()
    {
        synchronized (sCachedApplicationStateLock)
        {
            if (sCachedApplicationState == null)
            {
                sCachedApplicationState = Integer.valueOf(determineApplicationState());
            }
        }
        return sCachedApplicationState.intValue();
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static boolean hasVisibleActivities()
    {
        int i = getStateForApplication();
        return i == 1 || i == 2;
    }

    public static void informActivityStarted(Activity activity)
    {
        onStateChange(activity, 1);
        onStateChange(activity, 2);
        onStateChange(activity, 3);
    }

    public static void initialize(Application application)
    {
        sApplication = application;
        ApplicationStatusManager.registerWindowFocusChangedListener(new ApplicationStatusManager.WindowFocusChangedListener() {

            public void onWindowFocusChanged(Activity activity, boolean flag)
            {
                int i;
                if (flag && activity != ApplicationStatus.sActivity)
                {
                    if ((i = ApplicationStatus.getStateForActivity(activity)) != 6 && i != 5)
                    {
                        ApplicationStatus.sActivity = activity;
                        return;
                    }
                }
            }

        });
        sApplication.registerActivityLifecycleCallbacks(new android.app.Application.ActivityLifecycleCallbacks() {

            public void onActivityCreated(Activity activity, Bundle bundle)
            {
                ApplicationStatus.onStateChange(activity, 1);
            }

            public void onActivityDestroyed(Activity activity)
            {
                ApplicationStatus.onStateChange(activity, 6);
            }

            public void onActivityPaused(Activity activity)
            {
                ApplicationStatus.onStateChange(activity, 4);
            }

            public void onActivityResumed(Activity activity)
            {
                ApplicationStatus.onStateChange(activity, 3);
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
            {
            }

            public void onActivityStarted(Activity activity)
            {
                ApplicationStatus.onStateChange(activity, 2);
            }

            public void onActivityStopped(Activity activity)
            {
                ApplicationStatus.onStateChange(activity, 5);
            }

        });
    }

    public static boolean isEveryActivityDestroyed()
    {
        return sActivityInfo.isEmpty();
    }

    private static native void nativeOnApplicationStateChange(int i);

    private static void onStateChange(Activity activity, int i)
    {
        if (activity == null)
        {
            throw new IllegalArgumentException("null activity is not supported");
        }
        if (sActivity == null || i == 1 || i == 3 || i == 2)
        {
            sActivity = activity;
        }
        int j = getStateForApplication();
        if (i == 1)
        {
            if (!$assertionsDisabled && sActivityInfo.containsKey(activity))
            {
                throw new AssertionError();
            }
            sActivityInfo.put(activity, new ActivityInfo());
        }
        synchronized (sCachedApplicationStateLock)
        {
            sCachedApplicationState = null;
        }
        obj = (ActivityInfo)sActivityInfo.get(activity);
        if (obj != null)
        {
            ((ActivityInfo) (obj)).setStatus(i);
            for (Iterator iterator = ((ActivityInfo) (obj)).getListeners().iterator(); iterator.hasNext(); ((ActivityStateListener)iterator.next()).onActivityStateChange(activity, i)) { }
            for (Iterator iterator1 = sGeneralActivityStateListeners.iterator(); iterator1.hasNext(); ((ActivityStateListener)iterator1.next()).onActivityStateChange(activity, i)) { }
            int k = getStateForApplication();
            if (k != j)
            {
                for (Iterator iterator2 = sApplicationStateListeners.iterator(); iterator2.hasNext(); ((ApplicationStateListener)iterator2.next()).onApplicationStateChange(k)) { }
            }
            if (i == 6)
            {
                sActivityInfo.remove(activity);
                if (activity == sActivity)
                {
                    sActivity = null;
                    return;
                }
            }
        }
        return;
        activity;
        obj;
        JVM INSTR monitorexit ;
        throw activity;
    }

    public static void onStateChangeForTesting(Activity activity, int i)
    {
        onStateChange(activity, i);
    }

    public static void registerApplicationStateListener(ApplicationStateListener applicationstatelistener)
    {
        sApplicationStateListeners.addObserver(applicationstatelistener);
    }

    public static void registerStateListenerForActivity(ActivityStateListener activitystatelistener, Activity activity)
    {
        if (!$assertionsDisabled && activity == null)
        {
            throw new AssertionError();
        }
        activity = (ActivityInfo)sActivityInfo.get(activity);
        if (!$assertionsDisabled && (activity == null || activity.getStatus() == 6))
        {
            throw new AssertionError();
        } else
        {
            activity.getListeners().addObserver(activitystatelistener);
            return;
        }
    }

    public static void registerStateListenerForAllActivities(ActivityStateListener activitystatelistener)
    {
        sGeneralActivityStateListeners.addObserver(activitystatelistener);
    }

    private static void registerThreadSafeNativeApplicationStateListener()
    {
        ThreadUtils.runOnUiThread(new Runnable() {

            public void run()
            {
                if (ApplicationStatus.sNativeApplicationStateListener != null)
                {
                    return;
                } else
                {
                    ApplicationStatus.sNativeApplicationStateListener = new ApplicationStateListener() {

                        final _cls3 this$0;

                        public void onApplicationStateChange(int i)
                        {
                            ApplicationStatus.nativeOnApplicationStateChange(i);
                        }

            
            {
                this$0 = _cls3.this;
                super();
            }
                    };
                    ApplicationStatus.registerApplicationStateListener(ApplicationStatus.sNativeApplicationStateListener);
                    return;
                }
            }

        });
    }

    public static void unregisterActivityStateListener(ActivityStateListener activitystatelistener)
    {
        sGeneralActivityStateListeners.removeObserver(activitystatelistener);
        for (Iterator iterator = sActivityInfo.values().iterator(); iterator.hasNext(); ((ActivityInfo)iterator.next()).getListeners().removeObserver(activitystatelistener)) { }
    }

    public static void unregisterApplicationStateListener(ApplicationStateListener applicationstatelistener)
    {
        sApplicationStateListeners.removeObserver(applicationstatelistener);
    }

    static 
    {
        boolean flag;
        if (!org/chromium/base/ApplicationStatus.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }



/*
    static Activity access$002(Activity activity)
    {
        sActivity = activity;
        return activity;
    }

*/




/*
    static ApplicationStateListener access$302(ApplicationStateListener applicationstatelistener)
    {
        sNativeApplicationStateListener = applicationstatelistener;
        return applicationstatelistener;
    }

*/

}
