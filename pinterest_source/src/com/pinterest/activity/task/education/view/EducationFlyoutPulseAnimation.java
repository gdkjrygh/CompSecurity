// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

public class EducationFlyoutPulseAnimation
{

    private AnimatorSet _animatorSet;
    private View _flyoutView;
    private final int _longDuration = 1000;
    private final int _shortDuration = 50;
    private final int _startDelay = 1500;

    public EducationFlyoutPulseAnimation(View view)
    {
        _flyoutView = view;
        _animatorSet = new AnimatorSet();
        init();
    }

    public Animator getAnimator()
    {
        return _animatorSet;
    }

    public void init()
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(_flyoutView, "alpha", new float[] {
            1.0F
        });
        objectanimator.setDuration(50L);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(_flyoutView, "scaleX", new float[] {
                1.2F
            }), ObjectAnimator.ofFloat(_flyoutView, "scaleY", new float[] {
                1.2F
            }), ObjectAnimator.ofFloat(_flyoutView, "alpha", new float[] {
                0.0F
            })
        });
        animatorset.setInterpolator(new DecelerateInterpolator());
        animatorset.setDuration(1000L);
        _animatorSet.play(objectanimator).before(animatorset);
        _animatorSet.addListener(new _cls1());
    }



    private class _cls1 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final EducationFlyoutPulseAnimation this$0;

        public void onAnimationEnd(Animator animator)
        {
            super.onAnimationEnd(animator);
            _flyoutView.setScaleX(1.0F);
            _flyoutView.setScaleY(1.0F);
            _animatorSet.setStartDelay(1500L);
            _animatorSet.start();
        }

        _cls1()
        {
            this$0 = EducationFlyoutPulseAnimation.this;
            super();
        }
    }

}
