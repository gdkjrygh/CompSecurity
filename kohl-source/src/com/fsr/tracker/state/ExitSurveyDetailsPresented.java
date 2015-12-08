// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.state;

import com.fsr.tracker.domain.MeasureConfiguration;
import java.util.Date;

// Referenced classes of package com.fsr.tracker.state:
//            AbstractTrackerState, TrackingStates, PendingExitSurveyNotification, ITrackerStateContext, 
//            InviteDeclinedState

public class ExitSurveyDetailsPresented extends AbstractTrackerState
{

    private MeasureConfiguration measureConfiguration;

    public ExitSurveyDetailsPresented(MeasureConfiguration measureconfiguration)
    {
        measureConfiguration = measureconfiguration;
    }

    public void checkState(ITrackerStateContext itrackerstatecontext)
    {
    }

    public TrackingStates getStateId()
    {
        return TrackingStates.ON_EXIT_DETAILS_PRESENTED;
    }

    public void onInvitationAccepted(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.setState(new PendingExitSurveyNotification(measureConfiguration));
    }

    public void onInvitationDeclined(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.setDeclineDate(new Date());
        itrackerstatecontext.setState(new InviteDeclinedState());
    }

    public void onNetworkDisconnected(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.setDeclineDate(new Date());
        itrackerstatecontext.setState(new InviteDeclinedState());
    }

    public void onSurveyAborted(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.setDeclineDate(new Date());
        super.onSurveyAborted(itrackerstatecontext);
    }

    public void onSurveyCompleted(ITrackerStateContext itrackerstatecontext)
    {
        if (itrackerstatecontext.networkConnectionAvaliable())
        {
            itrackerstatecontext.setState(new PendingExitSurveyNotification(measureConfiguration));
            return;
        } else
        {
            itrackerstatecontext.setDeclineDate(new Date());
            itrackerstatecontext.setState(new InviteDeclinedState());
            return;
        }
    }
}
