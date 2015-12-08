// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.animation.Interpolator;

// Referenced classes of package android.support.design.widget:
//            ValueAnimatorCompat

static abstract class AnimatorUpdateListenerProxy
{
    static interface AnimatorListenerProxy
    {

        public abstract void onAnimationCancel();

        public abstract void onAnimationEnd();

        public abstract void onAnimationStart();
    }

    static interface AnimatorUpdateListenerProxy
    {

        public abstract void onAnimationUpdate();
    }


    abstract void cancel();

    abstract void end();

    abstract float getAnimatedFloatValue();

    abstract float getAnimatedFraction();

    abstract int getAnimatedIntValue();

    abstract boolean isRunning();

    abstract void setDuration(int i);

    abstract void setFloatValues(float f, float f1);

    abstract void setIntValues(int i, int j);

    abstract void setInterpolator(Interpolator interpolator);

    abstract void setListener(AnimatorListenerProxy animatorlistenerproxy);

    abstract void setUpdateListener(AnimatorUpdateListenerProxy animatorupdatelistenerproxy);

    abstract void start();

    AnimatorUpdateListenerProxy()
    {
    }
}
