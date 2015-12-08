// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;

// Referenced classes of package com.urbanairship.analytics:
//            ActivityState

class ActivityMonitor
{
    public static abstract class Listener
    {

        public abstract void onBackground(long l);

        public abstract void onForeground(long l);

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

    public void activityStarted(Activity activity, Source source, long l)
    {
        getActivityState(activity).setStarted(source, l);
        updateForegroundState();
    }

    public void activityStopped(Activity activity, Source source, long l)
    {
        getActivityState(activity).setStopped(source, l);
        (new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {

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
        long l;
        long l1;
        boolean flag1;
        l = 0L;
        l1 = 0L;
        flag1 = false;
        int i = 0;
        while (i < activityStates.size()) 
        {
            ActivityState activitystate = (ActivityState)activityStates.valueAt(i);
            long l2;
            long l3;
            boolean flag;
            if (activitystate.isForeground())
            {
                flag1 = true;
                flag = flag1;
                l2 = l1;
                l3 = l;
                if (activitystate.getLastModifiedTime() > l)
                {
                    l3 = activitystate.getLastModifiedTime();
                    l2 = l1;
                    flag = flag1;
                }
            } else
            {
                flag = flag1;
                l2 = l1;
                l3 = l;
                if (activitystate.getLastModifiedTime() > l1)
                {
                    l2 = activitystate.getLastModifiedTime();
                    flag = flag1;
                    l3 = l;
                }
            }
            i++;
            flag1 = flag;
            l1 = l2;
            l = l3;
        }
        if (isForeground == flag1)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        isForeground = flag1;
        this;
        JVM INSTR monitorenter ;
        if (!flag1) goto _L2; else goto _L1
_L1:
        if (listener != null)
        {
            listener.onForeground(l);
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (listener != null)
        {
            listener.onBackground(l1);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
