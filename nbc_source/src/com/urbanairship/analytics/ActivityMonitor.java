// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.app.Activity;
import android.os.Handler;
import android.util.SparseArray;

// Referenced classes of package com.urbanairship.analytics:
//            ActivityState

class ActivityMonitor
{
    public static abstract class Listener
    {

        public abstract void onBackground();

        public abstract void onForeground();

        public Listener()
        {
        }
    }

    static final class Source extends Enum
    {

        private static final Source $VALUES[];
        public static final Source AUTO_INSTRUMENTATION;
        public static final Source MANUAL_INSTRUMENTATION;

        public static Source valueOf(String s)
        {
            return (Source)Enum.valueOf(com/urbanairship/analytics/ActivityMonitor$Source, s);
        }

        public static Source[] values()
        {
            return (Source[])$VALUES.clone();
        }

        static 
        {
            MANUAL_INSTRUMENTATION = new Source("MANUAL_INSTRUMENTATION", 0);
            AUTO_INSTRUMENTATION = new Source("AUTO_INSTRUMENTATION", 1);
            $VALUES = (new Source[] {
                MANUAL_INSTRUMENTATION, AUTO_INSTRUMENTATION
            });
        }

        private Source(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int BACKGROUND_DELAY_MS = 2000;
    private SparseArray activityStates;
    private boolean analyticsEnabled;
    private int currentSdkVersion;
    private boolean isForeground;
    private Listener listener;
    private int minSdkVersion;

    public ActivityMonitor(int i, int j, boolean flag)
    {
        activityStates = new SparseArray();
        isForeground = false;
        minSdkVersion = i;
        currentSdkVersion = j;
        analyticsEnabled = flag;
    }

    private ActivityState getActivityState(Activity activity)
    {
        ActivityState activitystate1 = (ActivityState)activityStates.get(activity.hashCode());
        ActivityState activitystate = activitystate1;
        if (activitystate1 == null)
        {
            activitystate = new ActivityState(activity.toString(), minSdkVersion, currentSdkVersion, analyticsEnabled);
            activityStates.put(activity.hashCode(), activitystate);
        }
        return activitystate;
    }

    public void activityStarted(Activity activity, Source source)
    {
        getActivityState(activity).setStarted(source);
        updateForegroundState();
    }

    public void activityStopped(Activity activity, Source source)
    {
        getActivityState(activity).setStopped(source);
        (new Handler()).postDelayed(new Runnable() {

            final ActivityMonitor this$0;

            public void run()
            {
                updateForegroundState();
            }

            
            {
                this$0 = ActivityMonitor.this;
                super();
            }
        }, 2000L);
    }

    void setForeground(boolean flag)
    {
        if (isForeground == flag)
        {
            return;
        }
        isForeground = flag;
        this;
        JVM INSTR monitorenter ;
        if (listener == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        listener.onForeground();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        listener.onBackground();
          goto _L1
    }

    public void setListener(Listener listener1)
    {
        this;
        JVM INSTR monitorenter ;
        listener = listener1;
        this;
        JVM INSTR monitorexit ;
        return;
        listener1;
        this;
        JVM INSTR monitorexit ;
        throw listener1;
    }

    void updateForegroundState()
    {
        for (int i = 0; i < activityStates.size(); i++)
        {
            if (((ActivityState)activityStates.valueAt(i)).isForeground())
            {
                setForeground(true);
                return;
            }
        }

        setForeground(false);
    }
}
