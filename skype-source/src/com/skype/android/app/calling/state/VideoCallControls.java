// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling.state;

import android.support.v7.app.ActionBar;
import com.skype.android.app.calling.CallActivity;
import com.skype.android.app.calling.CallRosterFragment;
import com.skype.android.app.calling.InCallFragment;

// Referenced classes of package com.skype.android.app.calling.state:
//            CallControlsStateAdapter, VideoCallHidingControls, CallControlsStateContext, RosterFragmentDisplayed, 
//            AudioCallControls, ChatFragmentDisplayed, CallControlsState

public class VideoCallControls extends CallControlsStateAdapter
{

    public VideoCallControls(CallControlsStateContext callcontrolsstatecontext)
    {
        super(callcontrolsstatecontext);
    }

    private CallControlsState hideControls(CallActivity callactivity, InCallFragment incallfragment)
    {
        VideoCallHidingControls videocallhidingcontrols = new VideoCallHidingControls(getContext());
        incallfragment.showControls(false, videocallhidingcontrols);
        callactivity.getSupportActionBar().h();
        if (incallfragment.isMicrophoneMuted())
        {
            incallfragment.showUnmuteButton();
        }
        return videocallhidingcontrols;
    }

    public CallControlsState onCallControlsDisplayTimerExpired(CallActivity callactivity, InCallFragment incallfragment)
    {
        if (getContext().isInAccessibleMode() || getContext().isMultipane())
        {
            return this;
        } else
        {
            return hideControls(callactivity, incallfragment);
        }
    }

    public CallControlsState onCallRosterDisplayed(CallActivity callactivity, InCallFragment incallfragment, CallRosterFragment callrosterfragment)
    {
        callactivity = new RosterFragmentDisplayed(getContext());
        incallfragment.showControls(false, null);
        return callactivity;
    }

    public CallControlsState onConfirmedCallViewTap(CallActivity callactivity, InCallFragment incallfragment)
    {
        if (getContext().isInAccessibleMode() || getContext().isMultipane())
        {
            return this;
        } else
        {
            return hideControls(callactivity, incallfragment);
        }
    }

    public CallControlsState onVideoCountChanged(CallActivity callactivity, InCallFragment incallfragment, int i)
    {
        callactivity = this;
        if (i == 0)
        {
            callactivity = new AudioCallControls(getContext());
        }
        return callactivity;
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
