// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.state;

import java.util.Date;

// Referenced classes of package com.fsr.tracker.state:
//            AbstractTrackerState, ITrackerStateContext, InviteDeclinedState, TrackingStates, 
//            SurveyAbortedState, PendingRepeatState, SurveyCompletedState

public class PendingExitSurvey extends AbstractTrackerState
{

    public PendingExitSurvey()
    {
    }

    public void checkState(ITrackerStateContext itrackerstatecontext)
    {
        if (itrackerstatecontext.isPastOnExitTimeout())
        {
            itrackerstatecontext.setDeclineDate(new Date());
            itrackerstatecontext.setState(new InviteDeclinedState());
        }
    }

    public TrackingStates getStateId()
    {
        return TrackingStates.PENDING_EXIT_SURVEY;
    }

    public void onSurveyAborted(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.setState(new SurveyAbortedState());
    }

    public void onSurveyCompleted(ITrackerStateContext itrackerstatecontext)
    {
        Object obj;
        if (itrackerstatecontext.isReinviteEnabled())
        {
            obj = new PendingRepeatState();
        } else
        {
            obj = new SurveyCompletedState();
        }
        itrackerstatecontext.setState(((ITrackerState) (obj)));
    }

    public boolean shouldPersist()
    {
        return true;
    }
}
