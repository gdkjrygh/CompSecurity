// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling.state;

import android.animation.Animator;

// Referenced classes of package com.skype.android.app.calling.state:
//            CallControlsStateAdapter, CallControlsStateContext, CallControlsState

public abstract class UiAnimationControlsStateAdapter extends CallControlsStateAdapter
    implements android.animation.Animator.AnimatorListener
{

    private CallControlsState nextState;

    public UiAnimationControlsStateAdapter(CallControlsStateContext callcontrolsstatecontext, CallControlsState callcontrolsstate)
    {
        super(callcontrolsstatecontext);
        nextState = callcontrolsstate;
    }

    public void cancelAnimationUpdates()
    {
        nextState = null;
    }

    public void onAnimationCancel(Animator animator)
    {
        animator.removeListener(this);
    }

    public void onAnimationEnd(Animator animator)
    {
        animator.removeListener(this);
        if (nextState != null)
        {
            getContext().setState(nextState);
        }
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }

    public void onStateTransitionOut()
    {
        cancelAnimationUpdates();
    }

    public void setNextState(CallControlsState callcontrolsstate)
    {
        nextState = callcontrolsstate;
    }
}
