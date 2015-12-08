// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling.state;

import com.skype.android.app.calling.CallActivity;
import com.skype.android.app.calling.CallRosterFragment;
import com.skype.android.app.calling.InCallFragment;

// Referenced classes of package com.skype.android.app.calling.state:
//            CallControlsStateAdapter, RosterFragmentDisplayed, VideoCallControls, ChatFragmentDisplayed, 
//            CallControlsStateContext, CallControlsState

public class AudioCallControls extends CallControlsStateAdapter
{

    public AudioCallControls(CallControlsStateContext callcontrolsstatecontext)
    {
        super(callcontrolsstatecontext);
    }

    public CallControlsState onCallRosterDisplayed(CallActivity callactivity, InCallFragment incallfragment, CallRosterFragment callrosterfragment)
    {
        callactivity = new RosterFragmentDisplayed(getContext());
        incallfragment.showControls(false, null);
        return callactivity;
    }

    public CallControlsState onVideoCountChanged(CallActivity callactivity, InCallFragment incallfragment, int i)
    {
        incallfragment = this;
        if (i > 0)
        {
            callactivity.cancelCallControlsTimeout(true);
            incallfragment = new VideoCallControls(getContext());
        }
        return incallfragment;
    }

    public CallControlsState onViewPagerPageSelected(CallActivity callactivity, InCallFragment incallfragment, int i)
    {
        callactivity = this;
        if (i == 1)
        {
            callactivity = new ChatFragmentDisplayed(getContext());
        }
        return callactivity;
    }
}
