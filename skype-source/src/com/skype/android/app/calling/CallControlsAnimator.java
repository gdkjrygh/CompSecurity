// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;

public class CallControlsAnimator
{
    public static interface CallControlsAnimationListener
    {

        public abstract void onCallControlsAnimationEnd(boolean flag);

        public abstract void onCallControlsAnimationStart();

        public abstract void onCallControlsAnimationUpdate(int i);
    }


    private View callControls;
    private CallControlsAnimationListener listener;
    private ObjectAnimator translateViewAnim;

    public CallControlsAnimator(View view)
    {
        callControls = view;
    }

    private void translateViewVertically(View view, final boolean visible, android.animation.Animator.AnimatorListener animatorlistener)
    {
        int i;
        if (visible)
        {
            i = 0;
        } else
        {
            i = view.getHeight();
        }
        translateViewAnim = ObjectAnimator.ofFloat(view, "translationY", new float[] {
            (float)i
        }).setDuration(500L);
        translateViewAnim.addListener(new AnimatorListenerAdapter() {

            final CallControlsAnimator this$0;
            final boolean val$visible;

            public final void onAnimationEnd(Animator animator)
            {
                animator = callControls;
                int j;
                if (visible)
                {
                    j = 0;
                } else
                {
                    j = 8;
                }
                animator.setVisibility(j);
                if (listener != null)
                {
                    listener.onCallControlsAnimationEnd(visible);
                }
            }

            public final void onAnimationStart(Animator animator)
            {
                callControls.setVisibility(0);
                if (listener != null)
                {
                    listener.onCallControlsAnimationStart();
                }
            }

            
            {
                this$0 = CallControlsAnimator.this;
                visible = flag;
                super();
            }
        });
        translateViewAnim.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final CallControlsAnimator this$0;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                int j = ((Float)valueanimator.getAnimatedValue()).intValue();
                if (listener != null)
                {
                    listener.onCallControlsAnimationUpdate(j);
                }
            }

            
            {
                this$0 = CallControlsAnimator.this;
                super();
            }
        });
        if (animatorlistener != null)
        {
            translateViewAnim.addListener(animatorlistener);
        }
        translateViewAnim.start();
    }

    public void animateVisibility(boolean flag, android.animation.Animator.AnimatorListener animatorlistener)
    {
        translateViewVertically(callControls, flag, animatorlistener);
    }

    public void cancelAnimation()
    {
        if (translateViewAnim != null)
        {
            translateViewAnim.cancel();
        }
    }

    public void setCallControlsAnimationListener(CallControlsAnimationListener callcontrolsanimationlistener)
    {
        listener = callcontrolsanimationlistener;
    }


}
