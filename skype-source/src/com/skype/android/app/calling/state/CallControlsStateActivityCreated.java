// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling.state;

import android.support.v7.app.ActionBar;
import com.skype.android.app.calling.CallActivity;
import com.skype.android.app.calling.InCallFragment;

// Referenced classes of package com.skype.android.app.calling.state:
//            CallControlsStateAdapter, AudioCallAnimatingControls, VideoCallAnimatingControls, CallControlsStateContext, 
//            CallControlsState

public class CallControlsStateActivityCreated extends CallControlsStateAdapter
{

    public CallControlsStateActivityCreated(CallControlsStateContext callcontrolsstatecontext)
    {
        super(callcontrolsstatecontext);
    }

    public CallControlsState onCallControlsDisplayRequested(CallActivity callactivity, InCallFragment incallfragment)
    {
        if (incallfragment == null)
        {
            return this;
        }
        Object obj;
        Object obj1;
        if (incallfragment.isAudioCall())
        {
            callactivity.cancelCallControlsTimeout(false);
            obj1 = new AudioCallAnimatingControls(getContext());
            obj = obj1;
        } else
        {
            callactivity.cancelCallControlsTimeout(true);
            obj1 = new VideoCallAnimatingControls(getContext());
            obj = obj1;
        }
        incallfragment.showControls(true, ((android.animation.Animator.AnimatorListener) (obj)));
        incallfragment.hideUnmuteButton();
        callactivity.getSupportActionBar().g();
        return ((CallControlsState) (obj1));
    }
}
