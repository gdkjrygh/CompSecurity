// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.state;


// Referenced classes of package com.fsr.tracker.state:
//            AbstractTrackerState, ITrackerStateContext, TrackingStates

public class SurveyCompletedState extends AbstractTrackerState
{

    public SurveyCompletedState()
    {
    }

    public void checkState(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.setState(this);
    }

    public TrackingStates getStateId()
    {
        return TrackingStates.SURVEY_COMPLETED;
    }

    public void onSurveyCompleted(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.setState(this);
    }

    public boolean shouldPersist()
    {
        return true;
    }
}
