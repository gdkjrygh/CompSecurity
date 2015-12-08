// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.state;


// Referenced classes of package com.fsr.tracker.state:
//            ITrackerStateContext, TrackingStates

public interface ITrackerState
{

    public abstract void checkState(ITrackerStateContext itrackerstatecontext);

    public abstract TrackingStates getStateId();

    public abstract void onApplicationExit(ITrackerStateContext itrackerstatecontext);

    public abstract void onInvitationAccepted(ITrackerStateContext itrackerstatecontext);

    public abstract void onInvitationDeclined(ITrackerStateContext itrackerstatecontext);

    public abstract void onNetworkDisconnected(ITrackerStateContext itrackerstatecontext);

    public abstract void onSurveyAborted(ITrackerStateContext itrackerstatecontext);

    public abstract void onSurveyCompleted(ITrackerStateContext itrackerstatecontext);

    public abstract boolean shouldPersist();

    public abstract void triggerInvitation(String s, ITrackerStateContext itrackerstatecontext);

    public abstract void triggerSurvey(String s, ITrackerStateContext itrackerstatecontext);
}
