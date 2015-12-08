// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.state;

import com.fsr.tracker.domain.MeasureConfiguration;
import java.util.Date;

// Referenced classes of package com.fsr.tracker.state:
//            AbstractTrackerState, ITrackerStateContext, TrackingStates, SurveyAbortedState, 
//            TrackingState, PendingRepeatState, SurveyCompletedState

public class SurveyPresentedState extends AbstractTrackerState
{

    private MeasureConfiguration measureConfiguration;

    public SurveyPresentedState(MeasureConfiguration measureconfiguration)
    {
        measureConfiguration = measureconfiguration;
    }

    public void checkState(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.setState(this);
        itrackerstatecontext.launchSurvey(measureConfiguration);
    }

    public TrackingStates getStateId()
    {
        return TrackingStates.SURVEY_PRESENTED;
    }

    public void onInvitationDeclined(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.setState(new SurveyAbortedState());
        itrackerstatecontext.abortSurvey(measureConfiguration);
    }

    public void onNetworkDisconnected(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.setState(new TrackingState());
    }

    public void onSurveyAborted(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.setDeclineDate(new Date());
        itrackerstatecontext.setState(new SurveyAbortedState());
        itrackerstatecontext.abortSurvey(measureConfiguration);
    }

    public void onSurveyCompleted(ITrackerStateContext itrackerstatecontext)
    {
        if (itrackerstatecontext.isReinviteEnabled())
        {
            itrackerstatecontext.setState(new PendingRepeatState());
        } else
        {
            itrackerstatecontext.setState(new SurveyCompletedState());
        }
        itrackerstatecontext.completeSurvey(measureConfiguration);
    }
}
