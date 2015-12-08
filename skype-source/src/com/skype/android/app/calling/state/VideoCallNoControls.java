// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling.state;

import android.support.v7.app.ActionBar;
import com.skype.android.app.calling.CallActivity;
import com.skype.android.app.calling.CallRosterFragment;
import com.skype.android.app.calling.InCallFragment;

// Referenced classes of package com.skype.android.app.calling.state:
//            CallControlsStateAdapter, VideoCallAnimatingControls, RosterFragmentDisplayed, AudioCallAnimatingControls, 
//            ChatFragmentDisplayed, CallControlsStateContext, CallControlsState

public class VideoCallNoControls extends CallControlsStateAdapter
{

    public VideoCallNoControls(CallControlsStateContext callcontrolsstatecontext)
    {
        super(callcontrolsstatecontext);
    }

    private void showControls(CallActivity callactivity, InCallFragment incallfragment, android.animation.Animator.AnimatorListener animatorlistener)
    {
        callactivity.cancelCallControlsTimeout(true);
        incallfragment.showControls(true, animatorlistener);
        incallfragment.hideUnmuteButton();
        callactivity.getSupportActionBar().g();
    }

    public CallControlsState onCallControlsDisplayRequested(CallActivity callactivity, InCallFragment incallfragment)
    {
        VideoCallAnimatingControls videocallanimatingcontrols = new VideoCallAnimatingControls(getContext());
        showControls(callactivity, incallfragment, videocallanimatingcontrols);
        return videocallanimatingcontrols;
    }

    public CallControlsState onCallRosterDisplayed(CallActivity callactivity, InCallFragment incallfragment, CallRosterFragment callrosterfragment)
    {
        incallfragment = new RosterFragmentDisplayed(getContext());
        callactivity.getSupportActionBar().g();
        return incallfragment;
    }

    public CallControlsState onConfirmedCallViewTap(CallActivity callactivity, InCallFragment incallfragment)
    {
        VideoCallAnimatingControls videocallanimatingcontrols = new VideoCallAnimatingControls(getContext());
        showControls(callactivity, incallfragment, videocallanimatingcontrols);
        return videocallanimatingcontrols;
    }

    public CallControlsState onVideoCountChanged(CallActivity callactivity, InCallFragment incallfragment, int i)
    {
        if (i == 0)
        {
            AudioCallAnimatingControls audiocallanimatingcontrols = new AudioCallAnimatingControls(getContext());
            showControls(callactivity, incallfragment, audiocallanimatingcontrols);
            return audiocallanimatingcontrols;
        } else
        {
            return this;
        }
    }

    public CallControlsState onViewPagerPageSelected(CallActivity callactivity, InCallFragment incallfragment, int i)
    {
        if (i == 1)
        {
            incallfragment = new ChatFragmentDisplayed(getContext());
            callactivity.getSupportActionBar().g();
            return incallfragment;
        } else
        {
            return this;
        }
    }
}
