// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Map;

public final class ReturnFade extends Transition
{

    private static final String sTransitionProperties[] = {
        "android:silhouetteExpando:bounds", "android:silhouetteExpando:windowX", "android:silhouetteExpando:windowY"
    };
    private Rect mEndBounds;
    private Drawable mRevealDrawable;
    private Rect mStartBounds;
    private int mTempLocation[];

    public ReturnFade(Drawable drawable)
    {
        mTempLocation = new int[2];
        mRevealDrawable = drawable;
    }

    private void captureValues(TransitionValues transitionvalues)
    {
        Object obj = transitionvalues.view;
        obj = new Rect(((View) (obj)).getLeft(), ((View) (obj)).getTop(), ((View) (obj)).getRight(), ((View) (obj)).getBottom());
        transitionvalues.values.put("android:silhouetteExpando:bounds", obj);
        transitionvalues.view.getLocationInWindow(mTempLocation);
        transitionvalues.values.put("android:silhouetteExpando:windowX", Integer.valueOf(mTempLocation[0]));
        transitionvalues.values.put("android:silhouetteExpando:windowY", Integer.valueOf(mTempLocation[1]));
    }

    public final void captureEndValues(TransitionValues transitionvalues)
    {
        captureValues(transitionvalues);
    }

    public final void captureStartValues(TransitionValues transitionvalues)
    {
        captureValues(transitionvalues);
    }

    public final Animator createAnimator(final ViewGroup view, TransitionValues transitionvalues, TransitionValues transitionvalues1)
    {
        if (transitionvalues != null && transitionvalues1 != null)
        {
            mStartBounds = (Rect)transitionvalues.values.get("android:silhouetteExpando:bounds");
            mEndBounds = (Rect)transitionvalues1.values.get("android:silhouetteExpando:bounds");
            mEndBounds.inset(0, 0);
            view = transitionvalues1.view;
            view.setX(mEndBounds.left);
            view.setY(mEndBounds.top);
            transitionvalues = ObjectAnimator.ofFloat(view, "alpha", new float[] {
                1.0F
            });
            transitionvalues.setDuration(450L);
            transitionvalues.addListener(new android.animation.Animator.AnimatorListener() {

                final ReturnFade this$0;
                final View val$view;

                public final void onAnimationCancel(Animator animator)
                {
                }

                public final void onAnimationEnd(Animator animator)
                {
                }

                public final void onAnimationRepeat(Animator animator)
                {
                }

                public final void onAnimationStart(Animator animator)
                {
                    ((ImageView)view).setImageDrawable(mRevealDrawable);
                }

            
            {
                this$0 = ReturnFade.this;
                view = view1;
                super();
            }
            });
            return transitionvalues;
        } else
        {
            return null;
        }
    }

    public final String[] getTransitionProperties()
    {
        return sTransitionProperties;
    }


}
