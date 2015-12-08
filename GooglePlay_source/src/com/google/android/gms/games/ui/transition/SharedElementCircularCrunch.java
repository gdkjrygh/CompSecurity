// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Outline;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;

public final class SharedElementCircularCrunch extends Transition
{
    private final class OutlineProperty extends Property
    {

        ObjectAnimator mAnim;
        final SharedElementCircularCrunch this$0;

        public final volatile Object get(Object obj)
        {
            return null;
        }

        public final volatile void set(Object obj, Object obj1)
        {
            obj = (View)obj;
            obj1 = (Integer)obj1;
            if (((View) (obj)).getAlpha() == 0.0F)
            {
                ((View) (obj)).setAlpha(1.0F);
            }
            float f1 = mAnim.getAnimatedFraction();
            float f = f1;
            if (isExpanding())
            {
                f = 1.0F - f1;
            }
            ((View) (obj)).setOutlineProvider((f * (float)((Integer) (obj1)).intValue()). new ViewOutlineProvider() {

                final OutlineProperty this$1;
                final float val$radius;

                public final void getOutline(View view, Outline outline)
                {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (int)radius);
                }

            
            {
                this$1 = final_outlineproperty;
                radius = F.this;
                super();
            }
            });
            ((View) (obj)).setClipToOutline(true);
            ((View) (obj)).invalidate();
        }

        public OutlineProperty(String s)
        {
            this$0 = SharedElementCircularCrunch.this;
            super(java/lang/Integer, s);
        }
    }


    private int mMode;

    public SharedElementCircularCrunch()
    {
        mMode = 2;
    }

    private boolean isExpanding()
    {
        return (mMode & 1) != 0;
    }

    public final void captureEndValues(TransitionValues transitionvalues)
    {
    }

    public final void captureStartValues(TransitionValues transitionvalues)
    {
    }

    public final Animator createAnimator(final ViewGroup view, TransitionValues transitionvalues, TransitionValues transitionvalues1)
    {
        view = transitionvalues1.view;
        int i = view.getMeasuredWidth();
        int j = view.getMeasuredHeight();
        if (!isExpanding())
        {
            i /= 2;
        } else
        {
            i = Math.max(i, j) / 2;
        }
        transitionvalues = new OutlineProperty("outline");
        transitionvalues1 = ObjectAnimator.ofInt(view, transitionvalues, new int[] {
            i
        });
        transitionvalues.mAnim = transitionvalues1;
        transitionvalues1.addListener(new android.animation.Animator.AnimatorListener() {

            final SharedElementCircularCrunch this$0;
            final View val$view;

            public final void onAnimationCancel(Animator animator)
            {
                view.setOutlineProvider(null);
            }

            public final void onAnimationEnd(Animator animator)
            {
                view.setOutlineProvider(null);
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
            }

            
            {
                this$0 = SharedElementCircularCrunch.this;
                view = view1;
                super();
            }
        });
        return transitionvalues1;
    }

}
