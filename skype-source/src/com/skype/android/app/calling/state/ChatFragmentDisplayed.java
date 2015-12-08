// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling.state;

import com.skype.android.app.calling.CallActivity;
import com.skype.android.app.calling.InCallFragment;

// Referenced classes of package com.skype.android.app.calling.state:
//            CallControlsStateAdapter, AudioCallControls, VideoCallControls, CallControlsStateContext, 
//            CallControlsState

public class ChatFragmentDisplayed extends CallControlsStateAdapter
{

    public ChatFragmentDisplayed(CallControlsStateContext callcontrolsstatecontext)
    {
        super(callcontrolsstatecontext);
    }

    public CallControlsState onCallControlsDisplayRequested(CallActivity callactivity, InCallFragment incallfragment)
    {
        callactivity.cancelCallControlsTimeout(true);
        incallfragment.showControls(true, null);
        incallfragment.hideUnmuteButton();
        return this;
    }

    public CallControlsState onViewPagerPageSelected(CallActivity callactivity, InCallFragment incallfragment, int i)
    {
label0:
        {
            Object obj = this;
            if (i == 0)
            {
                if (!incallfragment.isAudioCall())
                {
                    break label0;
                }
                obj = new AudioCallControls(getContext());
            }
            return ((CallControlsState) (obj));
        }
        callactivity.cancelCallControlsTimeout(true);
        return new VideoCallControls(getContext());
    }
}
