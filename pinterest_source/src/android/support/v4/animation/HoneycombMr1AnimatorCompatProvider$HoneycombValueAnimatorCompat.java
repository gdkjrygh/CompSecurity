// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.animation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package android.support.v4.animation:
//            ValueAnimatorCompat, AnimatorListenerCompat, AnimatorUpdateListenerCompat

class mWrapped
    implements ValueAnimatorCompat
{

    final Animator mWrapped;

    public void addListener(AnimatorListenerCompat animatorlistenercompat)
    {
        mWrapped.addListener(new (animatorlistenercompat, this));
    }

    public void addUpdateListener(final AnimatorUpdateListenerCompat animatorUpdateListener)
    {
        class _cls1
            implements android.animation.ValueAnimator.AnimatorUpdateListener
        {

            final HoneycombMr1AnimatorCompatProvider.HoneycombValueAnimatorCompat this$0;
            final AnimatorUpdateListenerCompat val$animatorUpdateListener;

            public void onAnimationUpdate(ValueAnimator valueanimator)
            {
                animatorUpdateListener.onAnimationUpdate(HoneycombMr1AnimatorCompatProvider.HoneycombValueAnimatorCompat.this);
            }

            _cls1()
            {
                this$0 = HoneycombMr1AnimatorCompatProvider.HoneycombValueAnimatorCompat.this;
                animatorUpdateListener = animatorupdatelistenercompat;
                super();
            }
        }

        if (mWrapped instanceof ValueAnimator)
        {
            ((ValueAnimator)mWrapped).addUpdateListener(new _cls1());
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

    public _cls1(Animator animator)
    {
        mWrapped = animator;
    }
}
