// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Log;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import com.google.android.play.utils.NoPauseAnimatorWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.play.transition:
//            ForcedVisibilityTransition

public final class CircularReveal extends ForcedVisibilityTransition
{
    private static final class KeyFrame
        implements Comparable
    {

        public Float mAmountPct;
        public TimeInterpolator mInterpolator;
        public Float mTimePct;

        public final volatile int compareTo(Object obj)
        {
            obj = (KeyFrame)obj;
            return mTimePct.compareTo(((KeyFrame) (obj)).mTimePct);
        }

        public final boolean equals(Object obj)
        {
            return (obj instanceof KeyFrame) && mTimePct.equals(((KeyFrame)obj).mTimePct);
        }

        public final int hashCode()
        {
            return mTimePct.hashCode();
        }

        public KeyFrame(float f, float f1)
        {
            if (f < 0.0F || f > 1.0F)
            {
                throw new IllegalArgumentException("Time value must be between [0,1]");
            }
            if (f1 < 0.0F || f1 > 1.0F)
            {
                throw new IllegalArgumentException("Value percentage must be between [0,1]");
            } else
            {
                mTimePct = Float.valueOf(f);
                mAmountPct = Float.valueOf(f1);
                mInterpolator = null;
                return;
            }
        }
    }


    private List mKeyFrames;

    public CircularReveal()
    {
        this(1);
        Log.w("CircularReveal", "This constructor - CircularReveal(Rect) - is deprecated.");
    }

    public CircularReveal(int i)
    {
        this(i, (byte)0);
    }

    private CircularReveal(int i, byte byte0)
    {
        super(i);
        mKeyFrames = new LinkedList();
        mKeyFrames.add(new KeyFrame(0.0F, 0.0F));
        mKeyFrames.add(new KeyFrame(1.0F, 1.0F));
    }

    public final Animator createAnimator(ViewGroup viewgroup, TransitionValues transitionvalues, final TransitionValues view)
    {
        view = view.view;
        float f = (float)Math.sqrt((float)(view.getWidth() * view.getWidth()) + (float)(view.getHeight() * view.getHeight())) / 2.0F;
        int i = view.getMeasuredWidth() / 2;
        int j = view.getMeasuredHeight() / 2;
        if (!isRevealing())
        {
            Collections.reverse(mKeyFrames);
        }
        ArrayList arraylist = new ArrayList(mKeyFrames.size() - 1);
        Iterator iterator = mKeyFrames.iterator();
        viewgroup = (KeyFrame)iterator.next();
        while (iterator.hasNext()) 
        {
            transitionvalues = (KeyFrame)iterator.next();
            Animator animator = ViewAnimationUtils.createCircularReveal(view, i, j, ((KeyFrame) (viewgroup)).mAmountPct.floatValue() * f, ((KeyFrame) (transitionvalues)).mAmountPct.floatValue() * f);
            long l = getDuration();
            if (isRevealing())
            {
                float f1 = ((KeyFrame) (transitionvalues)).mTimePct.floatValue();
                float f3 = l;
                float f5 = ((KeyFrame) (viewgroup)).mTimePct.floatValue();
                l = (long)Math.abs(f1 * f3 - (float)l * f5);
            } else
            {
                float f2 = ((KeyFrame) (transitionvalues)).mTimePct.floatValue();
                float f4 = l;
                float f6 = ((KeyFrame) (viewgroup)).mTimePct.floatValue();
                l = (long)Math.abs((1.0F - f2) * f4 - (float)l * (1.0F - f6));
            }
            animator.setDuration(l);
            if (isRevealing())
            {
                viewgroup = ((KeyFrame) (transitionvalues)).mInterpolator;
            } else
            {
                viewgroup = ((KeyFrame) (viewgroup)).mInterpolator;
            }
            animator.setInterpolator(viewgroup);
            arraylist.add(animator);
            viewgroup = transitionvalues;
        }
        viewgroup = new AnimatorSet();
        viewgroup.playSequentially(arraylist);
        viewgroup.setDuration(getDuration());
        viewgroup.addListener(new AnimatorListenerAdapter() {

            final CircularReveal this$0;
            final View val$view;

            public final void onAnimationEnd(Animator animator1)
            {
                if (!isRevealing())
                {
                    view.setVisibility(4);
                    view.setAlpha(0.0F);
                }
            }

            
            {
                this$0 = CircularReveal.this;
                view = view1;
                super();
            }
        });
        return new NoPauseAnimatorWrapper(viewgroup);
    }

    public final TimeInterpolator getInterpolator()
    {
        return ((KeyFrame)mKeyFrames.get(mKeyFrames.size() - 1)).mInterpolator;
    }

    public final Transition setInterpolator(TimeInterpolator timeinterpolator)
    {
        ((KeyFrame)mKeyFrames.get(mKeyFrames.size() - 1)).mInterpolator = timeinterpolator;
        return this;
    }
}
