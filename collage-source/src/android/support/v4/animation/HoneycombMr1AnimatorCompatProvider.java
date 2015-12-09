// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v4.animation:
//            AnimatorProvider, ValueAnimatorCompat, AnimatorListenerCompat, AnimatorUpdateListenerCompat

class HoneycombMr1AnimatorCompatProvider
    implements AnimatorProvider
{
    static class AnimatorListenerCompatWrapper
        implements android.animation.Animator.AnimatorListener
    {

        final ValueAnimatorCompat mValueAnimatorCompat;
        final AnimatorListenerCompat mWrapped;

        public void onAnimationCancel(Animator animator)
        {
            mWrapped.onAnimationCancel(mValueAnimatorCompat);
        }

        public void onAnimationEnd(Animator animator)
        {
            mWrapped.onAnimationEnd(mValueAnimatorCompat);
        }

        public void onAnimationRepeat(Animator animator)
        {
            mWrapped.onAnimationRepeat(mValueAnimatorCompat);
        }

        public void onAnimationStart(Animator animator)
        {
            mWrapped.onAnimationStart(mValueAnimatorCompat);
        }

        public AnimatorListenerCompatWrapper(AnimatorListenerCompat animatorlistenercompat, ValueAnimatorCompat valueanimatorcompat)
        {
            mWrapped = animatorlistenercompat;
            mValueAnimatorCompat = valueanimatorcompat;
        }
    }

    static class HoneycombValueAnimatorCompat
        implements ValueAnimatorCompat
    {

        final Animator mWrapped;

        public void addListener(AnimatorListenerCompat animatorlistenercompat)
        {
            mWrapped.addListener(new AnimatorListenerCompatWrapper(animatorlistenercompat, this));
        }

        public void addUpdateListener(AnimatorUpdateListenerCompat animatorupdatelistenercompat)
        {
            if (mWrapped instanceof ValueAnimator)
            {
                ((ValueAnimator)mWrapped).addUpdateListener(animatorupdatelistenercompat. new android.animation.ValueAnimator.AnimatorUpdateListener() {

                    final HoneycombValueAnimatorCompat this$0;
                    final AnimatorUpdateListenerCompat val$animatorUpdateListener;

                    public void onAnimationUpdate(ValueAnimator valueanimator)
                    {
                        animatorUpdateListener.onAnimationUpdate(HoneycombValueAnimatorCompat.this);
                    }

            
            {
                this$0 = final_honeycombvalueanimatorcompat;
                animatorUpdateListener = AnimatorUpdateListenerCompat.this;
                super();
            }
                });
            }
        }

        public void cancel()
        {
            mWrapped.cancel();
        }

        public float getAnimatedFraction()
        {
            return ((ValueAnimator)mWrapped).getAnimatedFraction();
        }

        public void setDuration(long l)
        {
            mWrapped.setDuration(l);
        }

        public void setTarget(View view)
        {
            mWrapped.setTarget(view);
        }

        public void start()
        {
            mWrapped.start();
        }

        public HoneycombValueAnimatorCompat(Animator animator)
        {
            mWrapped = animator;
        }
    }


    private TimeInterpolator mDefaultInterpolator;

    HoneycombMr1AnimatorCompatProvider()
    {
    }

    public void clearInterpolator(View view)
    {
        if (mDefaultInterpolator == null)
        {
            mDefaultInterpolator = (new ValueAnimator()).getInterpolator();
        }
        view.animate().setInterpolator(mDefaultInterpolator);
    }

    public ValueAnimatorCompat emptyValueAnimator()
    {
        return new HoneycombValueAnimatorCompat(ValueAnimator.ofFloat(new float[] {
            0.0F, 1.0F
        }));
    }
}
