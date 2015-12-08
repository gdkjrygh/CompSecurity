// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.state;


// Referenced classes of package com.fsr.tracker.state:
//            AbstractTrackerState, ITrackerStateContext, TrackingState, TrackingStates

public class PendingRepeatState extends AbstractTrackerState
{

    public PendingRepeatState()
    {
    }

    public void checkState(ITrackerStateContext itrackerstatecontext)
    {
        if (itrackerstatecontext.isPastRepeatDate())
        {
            itrackerstatecontext.resetCounters();
            itrackerstatecontext.setState(new TrackingState());
            return;
        } else
        {
            itrackerstatecontext.setState(this);
            return;
        }
    }

    public TrackingStates getStateId()
    {
        return TrackingStates.PENDING_REPEAT;
    }

    public boolean shouldPersist()
    {
        return true;
    }
}
