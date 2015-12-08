// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.state;


// Referenced classes of package com.fsr.tracker.state:
//            AbstractTrackerState, PendingReinviteState, ITrackerStateContext, TrackingStates

public class InviteDeclinedState extends AbstractTrackerState
{

    public InviteDeclinedState()
    {
    }

    public void checkState(ITrackerStateContext itrackerstatecontext)
    {
        itrackerstatecontext.setState(new PendingReinviteState());
    }

    public TrackingStates getStateId()
    {
        return TrackingStates.INVITE_DECLINED;
    }

    public boolean shouldPersist()
    {
        return true;
    }
}
