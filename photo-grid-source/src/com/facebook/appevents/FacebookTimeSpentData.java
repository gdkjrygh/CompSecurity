// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import java.io.Serializable;
import java.util.Locale;

// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger

class FacebookTimeSpentData
    implements Serializable
{

    private static final long APP_ACTIVATE_SUPPRESSION_PERIOD_IN_MILLISECONDS = 0x493e0L;
    private static final long FIRST_TIME_LOAD_RESUME_TIME = -1L;
    private static final long INACTIVE_SECONDS_QUANTA[] = {
        0x493e0L, 0xdbba0L, 0x1b7740L, 0x36ee80L, 0x1499700L, 0x2932e00L, 0x5265c00L, 0xa4cb800L, 0xf731400L, 0x240c8400L, 
        0x48190800L, 0x6c258c00L, 0x90321000L, 0x134fd9000L, 0x1cf7c5800L, 0x269fb2000L, 0x30479e800L, 0x39ef8b000L, 0x757b12c00L
    };
    private static final long INTERRUPTION_THRESHOLD_MILLISECONDS = 1000L;
    private static final long NUM_MILLISECONDS_IDLE_TO_BE_NEW_SESSION = 60000L;
    private static final String TAG = com/facebook/appevents/AppEventsLogger.getCanonicalName();
    private static final long serialVersionUID = 1L;
    private String firstOpenSourceApplication;
    private int interruptionCount;
    private boolean isAppActive;
    private boolean isWarmLaunch;
    private long lastActivateEventLoggedTime;
    private long lastResumeTime;
    private long lastSuspendTime;
    private long millisecondsSpentInSession;

    FacebookTimeSpentData()
    {
        resetSession();
    }

    private FacebookTimeSpentData(long l, long l1, long l2, int i)
    {
        resetSession();
        lastResumeTime = l;
        lastSuspendTime = l1;
        millisecondsSpentInSession = l2;
        interruptionCount = i;
    }

    FacebookTimeSpentData(long l, long l1, long l2, int i, 
            _cls1 _pcls1)
    {
        this(l, l1, l2, i);
    }

    private FacebookTimeSpentData(long l, long l1, long l2, int i, 
            String s)
    {
        resetSession();
        lastResumeTime = l;
        lastSuspendTime = l1;
        millisecondsSpentInSession = l2;
        interruptionCount = i;
        firstOpenSourceApplication = s;
    }

    FacebookTimeSpentData(long l, long l1, long l2, int i, 
            String s, _cls1 _pcls1)
    {
        this(l, l1, l2, i, s);
    }

    private static int getQuantaIndex(long l)
    {
        int i;
        for (i = 0; i < INACTIVE_SECONDS_QUANTA.length && INACTIVE_SECONDS_QUANTA[i] < l; i++) { }
        return i;
    }

    private boolean isColdLaunch()
    {
        boolean flag;
        if (!isWarmLaunch)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isWarmLaunch = true;
        return flag;
    }

    private void logAppDeactivatedEvent(AppEventsLogger appeventslogger, long l)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("fb_mobile_app_interruptions", interruptionCount);
        bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[] {
            Integer.valueOf(getQuantaIndex(l))
        }));
        bundle.putString("fb_mobile_launch_source", firstOpenSourceApplication);
        appeventslogger.logEvent("fb_mobile_deactivate_app", millisecondsSpentInSession / 1000L, bundle);
        resetSession();
    }

    private void resetSession()
    {
        isAppActive = false;
        lastResumeTime = -1L;
        lastSuspendTime = -1L;
        interruptionCount = 0;
        millisecondsSpentInSession = 0L;
    }

    private boolean wasSuspendedEver()
    {
        return lastSuspendTime != -1L;
    }

    private Object writeReplace()
    {
        return new SerializationProxyV2(lastResumeTime, lastSuspendTime, millisecondsSpentInSession, interruptionCount, firstOpenSourceApplication);
    }

    void onResume(AppEventsLogger appeventslogger, long l, String s)
    {
        long l1;
        long l2 = 0L;
        if (isColdLaunch() || l - lastActivateEventLoggedTime > 0x493e0L)
        {
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", s);
            appeventslogger.logEvent("fb_mobile_activate_app", bundle);
            lastActivateEventLoggedTime = l;
        }
        if (isAppActive)
        {
            Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Resume for active app");
            return;
        }
        if (wasSuspendedEver())
        {
            l1 = l - lastSuspendTime;
        } else
        {
            l1 = 0L;
        }
        if (l1 < 0L)
        {
            Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Clock skew detected");
            l1 = l2;
        }
        if (l1 <= 60000L) goto _L2; else goto _L1
_L1:
        logAppDeactivatedEvent(appeventslogger, l1);
_L4:
        if (interruptionCount == 0)
        {
            firstOpenSourceApplication = s;
        }
        lastResumeTime = l;
        isAppActive = true;
        return;
_L2:
        if (l1 > 1000L)
        {
            interruptionCount = interruptionCount + 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void onSuspend(AppEventsLogger appeventslogger, long l)
    {
        long l1 = 0L;
        if (!isAppActive)
        {
            Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Suspend for inactive app");
            return;
        }
        long l2 = l - lastResumeTime;
        if (l2 < 0L)
        {
            Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Clock skew detected");
        } else
        {
            l1 = l2;
        }
        millisecondsSpentInSession = l1 + millisecondsSpentInSession;
        lastSuspendTime = l;
        isAppActive = false;
    }


    private class SerializationProxyV2
        implements Serializable
    {

        private static final long serialVersionUID = 6L;
        private final String firstOpenSourceApplication;
        private final int interruptionCount;
        private final long lastResumeTime;
        private final long lastSuspendTime;
        private final long millisecondsSpentInSession;

        private Object readResolve()
        {
            return new FacebookTimeSpentData(lastResumeTime, lastSuspendTime, millisecondsSpentInSession, interruptionCount, firstOpenSourceApplication, null);
        }

        SerializationProxyV2(long l, long l1, long l2, int i, 
                String s)
        {
            lastResumeTime = l;
            lastSuspendTime = l1;
            millisecondsSpentInSession = l2;
            interruptionCount = i;
            firstOpenSourceApplication = s;
        }
    }

}
