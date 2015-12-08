// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls.animators;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class FadeAnimator
{

    private static final long FADE_DURATION = 250L;
    public static final float INTERPOLATOR_FACTOR = 1.5F;

    public FadeAnimator()
    {
    }

    public static void fadeIn(View view)
    {
        if (view.getVisibility() == 0)
        {
            return;
        } else
        {
            view.setVisibility(0);
            view = ObjectAnimator.ofFloat(view, View.ALPHA, new float[] {
                0.0F, 1.0F
            });
            view.setDuration(250L);
            view.setInterpolator(new AccelerateInterpolator(1.5F));
            view.start();
            return;
        }
    }

    public static void fadeOut(final View view)
    {
        if (view.getVisibility() == 8)
        {
            return;
        } else
        {
            final ObjectAnimator animator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[] {
                1.0F, 0.0F
            });
            animator.setDuration(250L);
            animator.setInterpolator(new DecelerateInterpolator(1.5F));
            animator.start();
            animator.addListener(new AnimatorListenerAdapter() {

                final ObjectAnimator val$animator;
                final View val$view;

                public void onAnimationEnd(Animator animator1)
                {
                    view.setVisibility(8);
                    animator.removeAllListeners();
                }

            
            {
                view = view1;
                animator = objectanimator;
                super();
            }
            });
            return;
        }
    }
}
