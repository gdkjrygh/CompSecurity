// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import com.urbanairship.Logger;

class ActivityState
{
    private static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State NONE;
        public static final State STARTED;
        public static final State STOPPED;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/urbanairship/analytics/ActivityState$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            STARTED = new State("STARTED", 0);
            STOPPED = new State("STOPPED", 1);
            NONE = new State("NONE", 2);
            $VALUES = (new State[] {
                STARTED, STOPPED, NONE
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    private final String activityName;
    private boolean analyticsEnabled;
    private State autoInstrumentedState;
    private int currentSdkVersion;
    private State manualInstrumentedState;
    private int minSdkVersion;

    public ActivityState(String s, int i, int j, boolean flag)
    {
        autoInstrumentedState = State.NONE;
        manualInstrumentedState = State.NONE;
        activityName = s;
        minSdkVersion = i;
        currentSdkVersion = j;
        analyticsEnabled = flag;
    }

    boolean isForeground()
    {
        if (currentSdkVersion < 14) goto _L2; else goto _L1
_L1:
        if (autoInstrumentedState != State.STARTED) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (manualInstrumentedState != State.STARTED)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    void setStarted(ActivityMonitor.Source source)
    {
        if (source == ActivityMonitor.Source.MANUAL_INSTRUMENTATION)
        {
            if (manualInstrumentedState == State.STARTED && analyticsEnabled)
            {
                Logger.warn((new StringBuilder()).append("Activity ").append(activityName).append(" already added without being removed first. Call UAirship.shared().getAnalytics().activityStopped in every activity's onStop() method.").toString());
            }
            manualInstrumentedState = State.STARTED;
            return;
        } else
        {
            autoInstrumentedState = State.STARTED;
            return;
        }
    }

    void setStopped(ActivityMonitor.Source source)
    {
        if (source != ActivityMonitor.Source.MANUAL_INSTRUMENTATION) goto _L2; else goto _L1
_L1:
        if (manualInstrumentedState == State.STARTED || !analyticsEnabled) goto _L4; else goto _L3
_L3:
        Logger.warn((new StringBuilder()).append("Activity ").append(activityName).append(" removed without being manually added first. Call UAirship.shared().getAnalytics().activityStarted in every activity's onStart() method.").toString());
_L5:
        manualInstrumentedState = State.STOPPED;
        return;
_L4:
        if (currentSdkVersion >= 14 && autoInstrumentedState == State.NONE && analyticsEnabled)
        {
            Logger.warn((new StringBuilder()).append("Activity ").append(activityName).append(" removed in Analytics not during the activity's onStop() method.").toString());
        }
        if (true) goto _L5; else goto _L2
_L2:
        if (minSdkVersion < 14 && manualInstrumentedState == State.NONE && analyticsEnabled)
        {
            Logger.warn((new StringBuilder()).append("Activity ").append(activityName).append(" was not manually added during onStart(). Call UAirship.shared().getAnalytics().activityStarted in every activity's onStart() method.").toString());
        }
        autoInstrumentedState = State.STOPPED;
        return;
    }
}
