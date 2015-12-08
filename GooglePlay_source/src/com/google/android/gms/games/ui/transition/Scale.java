// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public final class Scale extends Transition
{
    private final class CenterXProperty extends FloatProperty
    {

        final Scale this$0;

        public final volatile Object get(Object obj)
        {
            return null;
        }

        public final volatile void setValue(Object obj, float f)
        {
            ((View)obj).setX(f - ((float)mEndBounds.width() * mScaleX) / 2.0F);
        }

        public CenterXProperty()
        {
            this$0 = Scale.this;
            super("centerX");
        }
    }

    private final class CenterYProperty extends FloatProperty
    {

        final Scale this$0;

        public final volatile Object get(Object obj)
        {
            return null;
        }

        public final volatile void setValue(Object obj, float f)
        {
            ((View)obj).setY(f - ((float)mEndBounds.height() * mScaleY) / 2.0F);
        }

        public CenterYProperty()
        {
            this$0 = Scale.this;
            super("centerY");
        }
    }

    public static abstract class FloatProperty extends Property
    {

        public volatile void set(Object obj, Object obj1)
        {
            setValue(obj, ((Float)obj1).intValue());
        }

        public abstract void setValue(Object obj, float f);

        public FloatProperty(String s)
        {
            super(java/lang/Float, s);
        }
    }


    private static final String sTransitionProperties[] = {
        "android:silhouetteExpando:bounds", "android:silhouetteExpando:windowX", "android:silhouetteExpando:windowY"
    };
    private Rect mEndBounds;
    private final boolean mIsEntering = true;
    boolean mMaintainAspectRatio;
    private float mScaleX;
    private TimeInterpolator mScaleXInterpolator;
    private float mScaleY;
    private TimeInterpolator mScaleYInterpolator;
    private Rect mStartBounds;
    private int mTempLocation[];

    public Scale(TimeInterpolator timeinterpolator, TimeInterpolator timeinterpolator1)
    {
        mTempLocation = new int[2];
        mScaleXInterpolator = timeinterpolator;
        mScaleYInterpolator = timeinterpolator1;
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

    public final Animator createAnimator(ViewGroup viewgroup, TransitionValues transitionvalues, TransitionValues transitionvalues1)
    {
        if (transitionvalues != null && transitionvalues1 != null)
        {
            mStartBounds = (Rect)transitionvalues.values.get("android:silhouetteExpando:bounds");
            mEndBounds = (Rect)transitionvalues1.values.get("android:silhouetteExpando:bounds");
            mStartBounds.inset(0, 0);
            transitionvalues1 = transitionvalues1.view;
            viewgroup = getPathMotion().getPath(mStartBounds.left + mStartBounds.width() / 2, mStartBounds.top + mStartBounds.height() / 2, mEndBounds.left + mEndBounds.width() / 2, mEndBounds.top + mEndBounds.height() / 2);
            viewgroup = ObjectAnimator.ofFloat(transitionvalues1, new CenterXProperty(), new CenterYProperty(), viewgroup);
            transitionvalues1.setPivotX(0.0F);
            transitionvalues1.setPivotY(0.0F);
            float f = (float)mStartBounds.width() / (float)mEndBounds.width();
            float f1 = (float)mStartBounds.height() / (float)mEndBounds.height();
            mScaleX = f;
            mScaleY = f1;
            transitionvalues1.setX(mStartBounds.left);
            transitionvalues1.setY(mStartBounds.top);
            transitionvalues1.setScaleX(f);
            transitionvalues1.setScaleY(f1);
            transitionvalues = ObjectAnimator.ofFloat(transitionvalues1, "scaleX", new float[] {
                f, 1.0F
            });
            transitionvalues1 = ObjectAnimator.ofFloat(transitionvalues1, "scaleY", new float[] {
                f1, 1.0F
            });
            transitionvalues.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final Scale this$0;

                public final void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    mScaleX = ((Float)valueanimator.getAnimatedValue()).floatValue();
                }

            
            {
                this$0 = Scale.this;
                super();
            }
            });
            transitionvalues1.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final Scale this$0;

                public final void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    mScaleY = ((Float)valueanimator.getAnimatedValue()).floatValue();
                }

            
            {
                this$0 = Scale.this;
                super();
            }
            });
            if (mScaleXInterpolator != null)
            {
                transitionvalues.setInterpolator(mScaleXInterpolator);
            }
            if (mScaleYInterpolator != null)
            {
                transitionvalues1.setInterpolator(mScaleYInterpolator);
            }
            AnimatorSet animatorset = new AnimatorSet();
            animatorset.playTogether(new Animator[] {
                transitionvalues, transitionvalues1, viewgroup
            });
            animatorset.setDuration(450L);
            animatorset.setInterpolator(getInterpolator());
            return animatorset;
        } else
        {
            return null;
        }
    }

    public final String[] getTransitionProperties()
    {
        return sTransitionProperties;
    }




/*
    static float access$002(Scale scale, float f)
    {
        scale.mScaleX = f;
        return f;
    }

*/



/*
    static float access$102(Scale scale, float f)
    {
        scale.mScaleY = f;
        return f;
    }

*/

}
