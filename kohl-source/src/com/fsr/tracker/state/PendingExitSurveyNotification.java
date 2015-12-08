// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.state;

import com.fsr.tracker.domain.MeasureConfiguration;
import java.util.Date;

// Referenced classes of package com.fsr.tracker.state:
//            AbstractTrackerState, TrackingStates, ITrackerStateContext, PendingExitSurvey, 
//            PendingRepeatState, SurveyCompletedState

public class PendingExitSurveyNotification extends AbstractTrackerState
{

    private MeasureConfiguration measureConfiguration;

    public PendingExitSurveyNotification(MeasureConfiguration measureconfiguration)
    {
        measureConfiguration = measureconfiguration;
    }

    public void checkState(ITrackerStateContext itrackerstatecontext)
    {
    }

    public TrackingStates getStateId()
    {
        return TrackingStates.PENDING_EXIT_SURVEY_NOTIFICATION;
    }

    public void onApplicationExit(ITrackerStateContext itrackerstatecontext)
    {
        if (itrackerstatecontext.shouldUseLocalNotification())
        {
            itrackerstatecontext.sendLocalNotification(measureConfiguration);
            itrackerstatecontext.setExitNotificationDate(new Date());
            itrackerstatecontext.setState(new PendingExitSurvey());
            return;
        }
        if (itrackerstatecontext.isReinviteEnabled())
        {
            itrackerstatecontext.setState(new PendingRepeatState());
            return;
        } else
        {
            itrackerstatecontext.setState(new SurveyCompletedState());
            return;
        }
    }

    public boolean shouldPersist()
    {
        return true;
    }
}
