// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.skype.android.app.calling:
//            CallControlsAnimator

final class val.visible extends AnimatorListenerAdapter
{

    final CallControlsAnimator this$0;
    final boolean val$visible;

    public final void onAnimationEnd(Animator animator)
    {
        animator = CallControlsAnimator.access$000(CallControlsAnimator.this);
        int i;
        if (val$visible)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        animator.setVisibility(i);
        if (CallControlsAnimator.access$100(CallControlsAnimator.this) != null)
        {
            CallControlsAnimator.access$100(CallControlsAnimator.this).onCallControlsAnimationEnd(val$visible);
        }
    }

    public final void onAnimationStart(Animator animator)
    {
        CallControlsAnimator.access$000(CallControlsAnimator.this).setVisibility(0);
        if (CallControlsAnimator.access$100(CallControlsAnimator.this) != null)
        {
            CallControlsAnimator.access$100(CallControlsAnimator.this).onCallControlsAnimationStart();
        }
    }

    llControlsAnimationListener()
    {
        this$0 = final_callcontrolsanimator;
        val$visible = Z.this;
        super();
    }
}
