// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling.state;

import com.skype.android.app.LayoutExperience;
import com.skype.android.app.calling.CallActivity;
import com.skype.android.app.calling.CallRosterFragment;
import com.skype.android.app.calling.InCallFragment;
import com.skype.android.util.accessibility.AccessibilityUtil;

// Referenced classes of package com.skype.android.app.calling.state:
//            CallControlsState, CallControlsStateActivityCreated

public class CallControlsStateContext
    implements CallControlsState
{

    private final AccessibilityUtil accessibility;
    private CallControlsState currentState;
    private final LayoutExperience layoutExperience;

    public CallControlsStateContext(AccessibilityUtil accessibilityutil, LayoutExperience layoutexperience)
    {
        currentState = new CallControlsStateActivityCreated(this);
        accessibility = accessibilityutil;
        layoutExperience = layoutexperience;
    }

    boolean isInAccessibleMode()
    {
        return accessibility.a();
    }

    boolean isMultipane()
    {
        return layoutExperience.isMultipane();
    }

    public CallControlsState onAudioRouteChanged(CallActivity callactivity, InCallFragment incallfragment)
    {
        setState(currentState.onAudioRouteChanged(callactivity, incallfragment));
        return currentState;
    }

    public CallControlsState onCallControlsDisplayTimerExpired(CallActivity callactivity, InCallFragment incallfragment)
    {
        setState(currentState.onCallControlsDisplayTimerExpired(callactivity, incallfragment));
        return currentState;
    }

    public CallControlsState onCallEnded(CallActivity callactivity, InCallFragment incallfragment)
    {
        setState(currentState.onCallEnded(callactivity, incallfragment));
        return currentState;
    }

    public CallControlsState onCallFragmentResumed(CallActivity callactivity, InCallFragment incallfragment)
    {
        setState(currentState.onCallFragmentResumed(callactivity, incallfragment));
        return currentState;
    }

    public CallControlsState onCallRosterDismissed(CallActivity callactivity, InCallFragment incallfragment, CallRosterFragment callrosterfragment)
    {
        setState(currentState.onCallRosterDismissed(callactivity, incallfragment, callrosterfragment));
        return currentState;
    }

    public CallControlsState onCallRosterDisplayed(CallActivity callactivity, InCallFragment incallfragment, CallRosterFragment callrosterfragment)
    {
        setState(currentState.onCallRosterDisplayed(callactivity, incallfragment, callrosterfragment));
        return currentState;
    }

    public CallControlsState onConfirmedCallViewTap(CallActivity callactivity, InCallFragment incallfragment)
    {
        setState(currentState.onConfirmedCallViewTap(callactivity, incallfragment));
        return currentState;
    }

    public CallControlsState onConversationLiveStatusChanged(CallActivity callactivity, InCallFragment incallfragment)
    {
        setState(currentState.onConversationLiveStatusChanged(callactivity, incallfragment));
        return currentState;
    }

    public void onStateTransitionOut()
    {
    }

    public CallControlsState onVideoCountChanged(CallActivity callactivity, InCallFragment incallfragment, int i)
    {
        setState(currentState.onVideoCountChanged(callactivity, incallfragment, i));
        return currentState;
    }

    public CallControlsState onViewPagerPageSelected(CallActivity callactivity, InCallFragment incallfragment, int i)
    {
        setState(currentState.onViewPagerPageSelected(callactivity, incallfragment, i));
        return currentState;
    }

    public CallControlsState onViewPagerScrollStateChanged(CallActivity callactivity, InCallFragment incallfragment, int i)
    {
        setState(currentState.onViewPagerScrollStateChanged(callactivity, incallfragment, i));
        return currentState;
    }

    public CallControlsState onVoiceStatusChanged(CallActivity callactivity, InCallFragment incallfragment)
    {
        setState(currentState.onVoiceStatusChanged(callactivity, incallfragment));
        return currentState;
    }

    void setState(CallControlsState callcontrolsstate)
    {
        CallControlsState callcontrolsstate1 = currentState;
        currentState = callcontrolsstate;
        if (callcontrolsstate1 != callcontrolsstate)
        {
            callcontrolsstate1.onStateTransitionOut();
        }
    }
}
