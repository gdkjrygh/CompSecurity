// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.state;

import java.util.Date;

// Referenced classes of package com.fsr.tracker.state:
//            AbstractTrackerState, ITrackerStateContext, PendingReinviteState, TrackingStates

public class SurveyAbortedState extends AbstractTrackerState
{

    public SurveyAbortedState()
    {
    }

    public void checkState(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.setDeclineDate(new Date());
        itrackerstatecontext.setState(new PendingReinviteState());
    }

    public TrackingStates getStateId()
    {
        return TrackingStates.SURVEY_ABORTED;
    }

    public boolean shouldPersist()
    {
        return true;
    }
}
