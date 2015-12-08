// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling.state;

import com.skype.android.app.calling.CallActivity;
import com.skype.android.app.calling.CallRosterFragment;
import com.skype.android.app.calling.InCallFragment;

public interface CallControlsState
{

    public abstract CallControlsState onAudioRouteChanged(CallActivity callactivity, InCallFragment incallfragment);

    public abstract CallControlsState onCallControlsDisplayTimerExpired(CallActivity callactivity, InCallFragment incallfragment);

    public abstract CallControlsState onCallEnded(CallActivity callactivity, InCallFragment incallfragment);

    public abstract CallControlsState onCallFragmentResumed(CallActivity callactivity, InCallFragment incallfragment);

    public abstract CallControlsState onCallRosterDismissed(CallActivity callactivity, InCallFragment incallfragment, CallRosterFragment callrosterfragment);

    public abstract CallControlsState onCallRosterDisplayed(CallActivity callactivity, InCallFragment incallfragment, CallRosterFragment callrosterfragment);

    public abstract CallControlsState onConfirmedCallViewTap(CallActivity callactivity, InCallFragment incallfragment);

    public abstract CallControlsState onConversationLiveStatusChanged(CallActivity callactivity, InCallFragment incallfragment);

    public abstract void onStateTransitionOut();

    public abstract CallControlsState onVideoCountChanged(CallActivity callactivity, InCallFragment incallfragment, int i);

    public abstract CallControlsState onViewPagerPageSelected(CallActivity callactivity, InCallFragment incallfragment, int i);

    public abstract CallControlsState onViewPagerScrollStateChanged(CallActivity callactivity, InCallFragment incallfragment, int i);

    public abstract CallControlsState onVoiceStatusChanged(CallActivity callactivity, InCallFragment incallfragment);
}
