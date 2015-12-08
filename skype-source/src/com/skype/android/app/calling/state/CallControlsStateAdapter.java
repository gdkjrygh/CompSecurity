// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling.state;

import com.skype.android.app.calling.CallActivity;
import com.skype.android.app.calling.CallRosterFragment;
import com.skype.android.app.calling.InCallFragment;

// Referenced classes of package com.skype.android.app.calling.state:
//            CallControlsState, CallControlsStateContext

public class CallControlsStateAdapter
    implements CallControlsState
{

    private final CallControlsStateContext context;

    public CallControlsStateAdapter(CallControlsStateContext callcontrolsstatecontext)
    {
        context = callcontrolsstatecontext;
    }

    public CallControlsStateContext getContext()
    {
        return context;
    }

    public CallControlsState onAudioRouteChanged(CallActivity callactivity, InCallFragment incallfragment)
    {
        return onCallControlsDisplayRequested(callactivity, incallfragment);
    }

    public CallControlsState onCallControlsDisplayRequested(CallActivity callactivity, InCallFragment incallfragment)
    {
        return this;
    }

    public CallControlsState onCallControlsDisplayTimerExpired(CallActivity callactivity, InCallFragment incallfragment)
    {
        return this;
    }

    public CallControlsState onCallEnded(CallActivity callactivity, InCallFragment incallfragment)
    {
        return onCallControlsDisplayRequested(callactivity, incallfragment);
    }

    public CallControlsState onCallFragmentResumed(CallActivity callactivity, InCallFragment incallfragment)
    {
        return onCallControlsDisplayRequested(callactivity, incallfragment);
    }

    public CallControlsState onCallRosterDismissed(CallActivity callactivity, InCallFragment incallfragment, CallRosterFragment callrosterfragment)
    {
        return onCallControlsDisplayRequested(callactivity, incallfragment);
    }

    public CallControlsState onCallRosterDisplayed(CallActivity callactivity, InCallFragment incallfragment, CallRosterFragment callrosterfragment)
    {
        return this;
    }

    public CallControlsState onConfirmedCallViewTap(CallActivity callactivity, InCallFragment incallfragment)
    {
        return this;
    }

    public CallControlsState onConversationLiveStatusChanged(CallActivity callactivity, InCallFragment incallfragment)
    {
        return onCallControlsDisplayRequested(callactivity, incallfragment);
    }

    public void onStateTransitionOut()
    {
    }

    public CallControlsState onVideoCountChanged(CallActivity callactivity, InCallFragment incallfragment, int i)
    {
        return this;
    }

    public CallControlsState onViewPagerPageSelected(CallActivity callactivity, InCallFragment incallfragment, int i)
    {
        return this;
    }

    public CallControlsState onViewPagerScrollStateChanged(CallActivity callactivity, InCallFragment incallfragment, int i)
    {
        return onCallControlsDisplayRequested(callactivity, incallfragment);
    }

    public CallControlsState onVoiceStatusChanged(CallActivity callactivity, InCallFragment incallfragment)
    {
        return onCallControlsDisplayRequested(callactivity, incallfragment);
    }
}
