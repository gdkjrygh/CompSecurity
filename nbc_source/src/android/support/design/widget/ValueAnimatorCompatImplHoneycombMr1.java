// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;

class ValueAnimatorCompatImplHoneycombMr1 extends ValueAnimatorCompat.Impl
{

    final ValueAnimator mValueAnimator = new ValueAnimator();

    ValueAnimatorCompatImplHoneycombMr1()
    {
    }

    public void cancel()
    {
        mValueAnimator.cancel();
    }

    public void end()
    {
        mValueAnimator.end();
    }

    public float getAnimatedFloatValue()
    {
        return ((Float)mValueAnimator.getAnimatedValue()).floatValue();
    }

    public float getAnimatedFraction()
    {
        return mValueAnimator.getAnimatedFraction();
    }

    public int getAnimatedIntValue()
    {
        return ((Integer)mValueAnimator.getAnimatedValue()).intValue();
    }

    public boolean isRunning()
    {
        return mValueAnimator.isRunning();
    }

    public void setDuration(int i)
    {
        mValueAnimator.setDuration(i);
    }

    public void setFloatValues(float f, float f1)
    {
        mValueAnimator.setFloatValues(new float[] {
            f, f1
        });
    }

    public void setIntValues(int i, int j)
    {
        mValueAnimator.setIntValues(new int[] {
            i, j
        });
    }

    public void setInterpolator(Interpolator interpolator)
    {
        mValueAnimator.setInterpolator(interpolator);
    }

    public void setListener(final ValueAnimatorCompat.Impl.AnimatorListenerProxy listener)
    {
        mValueAnimator.addListener(new AnimatorListenerAdapter() {

            final ValueAnimatorCompatImplHoneycombMr1 this$0;
            final ValueAnimatorCompat.Impl.AnimatorListenerProxy val$listener;

            public void onAnimationCancel(Animator animator)
            {
                listener.onAnimationCancel();
            }

            public void onAnimationEnd(Animator animator)
            {
                listener.onAnimationEnd();
            }

            public void onAnimationStart(Animator animator)
            {
                listener.onAnimationStart();
            }

            
            {
                this$0 = ValueAnimatorCompatImplHoneycombMr1.this;
                listener = animatorlistenerproxy;
                super();
            }
        });
    }

    public void setUpdateListener(final ValueAnimatorCompat.Impl.AnimatorUpdateListenerProxy updateListener)
    {
        mValueAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final ValueAnimatorCompatImplHoneycombMr1 this$0;
            final ValueAnimatorCompat.Impl.AnimatorUpdateListenerProxy val$updateListener;

            public void onAnimationUpdate(ValueAnimator valueanimator)
            {
                updateListener.onAnimationUpdate();
            }

            
            {
                this$0 = ValueAnimatorCompatImplHoneycombMr1.this;
                updateListener = animatorupdatelistenerproxy;
                super();
            }
        });
    }

    public void start()
    {
        mValueAnimator.start();
    }
}
