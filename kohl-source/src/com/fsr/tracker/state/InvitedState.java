// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.state;

import com.fsr.tracker.domain.MeasureConfiguration;
import java.util.Date;

// Referenced classes of package com.fsr.tracker.state:
//            AbstractTrackerState, ITrackerStateContext, TrackingStates, SurveyPresentedState, 
//            InviteDeclinedState

public class InvitedState extends AbstractTrackerState
{

    private MeasureConfiguration measureConfiguration;

    public InvitedState(MeasureConfiguration measureconfiguration)
    {
        measureConfiguration = measureconfiguration;
    }

    public void checkState(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.launchInvitation(measureConfiguration);
    }

    public TrackingStates getStateId()
    {
        return TrackingStates.INVITED;
    }

    public void onInvitationAccepted(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.logInviteAccepted(measureConfiguration);
        itrackerstatecontext.setState(new SurveyPresentedState(measureConfiguration));
        itrackerstatecontext.acceptInvitation(measureConfiguration);
    }

    public void onInvitationDeclined(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.logInviteDeclined(measureConfiguration);
        itrackerstatecontext.declineInvitation(measureConfiguration);
        itrackerstatecontext.setDeclineDate(new Date());
        itrackerstatecontext.setState(new InviteDeclinedState());
    }
}
