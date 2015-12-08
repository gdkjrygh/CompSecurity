// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collection;

public class LoadingAnimationView extends FrameLayout
{
    private static class InfiniteAnimationListener
        implements android.animation.Animator.AnimatorListener
    {

        public void onAnimationCancel(Animator animator)
        {
        }

        public void onAnimationEnd(Animator animator)
        {
            animator.setStartDelay(700L);
            animator.start();
        }

        public void onAnimationRepeat(Animator animator)
        {
        }

        public void onAnimationStart(Animator animator)
        {
        }

        private InfiniteAnimationListener()
        {
        }

        InfiniteAnimationListener(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final int ANIMATION_DURATION_PER_LOADING_BAR = 100;
    private static final int DELAY_BEFORE_REPEATING_ANIMATION = 700;
    private static final int DELAY_BETWEEN_ANIMATIONS = 50;
    private AnimatorSet animators;
    private final View loadingBars[] = {
        findViewById(0x7f0f017a), findViewById(0x7f0f017b), findViewById(0x7f0f017c), findViewById(0x7f0f017d), findViewById(0x7f0f017e)
    };
    private final float translationYOffset = -getResources().getDimension(0x7f0b00d6);

    public LoadingAnimationView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        LayoutInflater.from(context).inflate(0x7f030074, this, true);
        animators = new AnimatorSet();
    }

    private transient void clearAnimations(View aview[])
    {
        int j = aview.length;
        for (int i = 0; i < j; i++)
        {
            aview[i].clearAnimation();
        }

    }

    private ObjectAnimator createAnimator(View view, long l)
    {
        view = ObjectAnimator.ofFloat(view, "translationY", new float[] {
            0.0F, translationYOffset, 0.0F
        });
        view.setInterpolator(new AccelerateDecelerateInterpolator());
        view.setDuration(100L);
        view.setStartDelay(l);
        return view;
    }

    private transient Collection createAnimators(View aview[])
    {
        ArrayList arraylist = new ArrayList(aview.length);
        for (int i = 0; i < aview.length; i++)
        {
            arraylist.add(createAnimator(aview[i], i * 50));
        }

        return arraylist;
    }

    public void start()
    {
        animators = new AnimatorSet();
        animators.playTogether(createAnimators(loadingBars));
        animators.addListener(new InfiniteAnimationListener(null));
        animators.setInterpolator(new LinearInterpolator());
        animators.start();
    }

    public void stop()
    {
        animators.cancel();
        clearAnimations(loadingBars);
    }
}
