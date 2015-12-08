// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling.state;

import android.support.v7.app.ActionBar;
import com.skype.android.app.calling.CallActivity;
import com.skype.android.app.calling.CallRosterFragment;
import com.skype.android.app.calling.InCallFragment;

// Referenced classes of package com.skype.android.app.calling.state:
//            UiAnimationControlsStateAdapter, AudioCallControls, RosterFragmentDisplayed, VideoCallControls, 
//            ChatFragmentDisplayed, CallControlsStateContext, CallControlsState

public class AudioCallAnimatingControls extends UiAnimationControlsStateAdapter
{

    public AudioCallAnimatingControls(CallControlsStateContext callcontrolsstatecontext)
    {
        super(callcontrolsstatecontext, new AudioCallControls(callcontrolsstatecontext));
    }

    public CallControlsState onCallRosterDisplayed(CallActivity callactivity, InCallFragment incallfragment, CallRosterFragment callrosterfragment)
    {
        callrosterfragment = new RosterFragmentDisplayed(getContext());
        callactivity.getSupportActionBar().g();
        incallfragment.showControls(false, null);
        return callrosterfragment;
    }

    public CallControlsState onVideoCountChanged(CallActivity callactivity, InCallFragment incallfragment, int i)
    {
        if (i == 0)
        {
            setNextState(new AudioCallControls(getContext()));
            return this;
        } else
        {
            setNextState(new VideoCallControls(getContext()));
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
