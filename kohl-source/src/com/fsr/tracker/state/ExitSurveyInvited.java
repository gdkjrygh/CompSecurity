// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.state;

import com.fsr.tracker.domain.MeasureConfiguration;
import java.util.Date;

// Referenced classes of package com.fsr.tracker.state:
//            AbstractTrackerState, ITrackerStateContext, TrackingStates, PendingExitSurveyNotification, 
//            ExitSurveyDetailsPresented, InviteDeclinedState

public class ExitSurveyInvited extends AbstractTrackerState
{

    private MeasureConfiguration measureConfiguration;

    public ExitSurveyInvited(MeasureConfiguration measureconfiguration)
    {
        measureConfiguration = measureconfiguration;
    }

    public void checkState(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.launchExitInvitation(measureConfiguration);
    }

    public TrackingStates getStateId()
    {
        return TrackingStates.ON_EXIT_INVITED;
    }

    public void onInvitationAccepted(ITrackerStateContext itrackerstatecontext)
    {
        Object obj;
        if (itrackerstatecontext.shouldUseLocalNotification())
        {
            obj = new PendingExitSurveyNotification(measureConfiguration);
        } else
        {
            obj = new ExitSurveyDetailsPresented(measureConfiguration);
        }
        itrackerstatecontext.setState(((ITrackerState) (obj)));
        itrackerstatecontext.acceptInvitation(measureConfiguration);
    }

    public void onInvitationDeclined(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.setDeclineDate(new Date());
        itrackerstatecontext.setState(new InviteDeclinedState());
        itrackerstatecontext.declineInvitation(measureConfiguration);
    }
}
