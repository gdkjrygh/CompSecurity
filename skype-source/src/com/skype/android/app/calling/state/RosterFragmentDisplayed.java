// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling.state;

import com.skype.android.app.calling.CallActivity;
import com.skype.android.app.calling.CallRosterFragment;
import com.skype.android.app.calling.InCallFragment;

// Referenced classes of package com.skype.android.app.calling.state:
//            CallControlsStateAdapter, AudioCallAnimatingControls, VideoCallAnimatingControls, CallControlsStateContext, 
//            CallControlsState

public class RosterFragmentDisplayed extends CallControlsStateAdapter
{

    public RosterFragmentDisplayed(CallControlsStateContext callcontrolsstatecontext)
    {
        super(callcontrolsstatecontext);
    }

    public CallControlsState onCallRosterDismissed(CallActivity callactivity, InCallFragment incallfragment, CallRosterFragment callrosterfragment)
    {
        if (incallfragment == null)
        {
            return this;
        }
        callactivity.cancelCallControlsTimeout(true);
        if (incallfragment.isAudioCall())
        {
            callactivity = new AudioCallAnimatingControls(getContext());
        } else
        {
            callactivity = new VideoCallAnimatingControls(getContext());
        }
        incallfragment.showControls(true, (android.animation.Animator.AnimatorListener)callactivity);
        incallfragment.hideUnmuteButton();
        return callactivity;
    }
}
