// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.animation.Interpolator;

class ValueAnimatorCompat
{
    static interface AnimatorListener
    {

        public abstract void onAnimationCancel(ValueAnimatorCompat valueanimatorcompat);

        public abstract void onAnimationEnd(ValueAnimatorCompat valueanimatorcompat);

        public abstract void onAnimationStart(ValueAnimatorCompat valueanimatorcompat);
    }

    static class AnimatorListenerAdapter
        implements AnimatorListener
    {

        public void onAnimationCancel(ValueAnimatorCompat valueanimatorcompat)
        {
        }

        public void onAnimationEnd(ValueAnimatorCompat valueanimatorcompat)
        {
        }

        public void onAnimationStart(ValueAnimatorCompat valueanimatorcompat)
        {
        }

        AnimatorListenerAdapter()
        {
        }
    }

    static interface AnimatorUpdateListener
    {

        public abstract void onAnimationUpdate(ValueAnimatorCompat valueanimatorcompat);
    }

    static interface Creator
    {

        public abstract ValueAnimatorCompat createAnimator();
    }

    static abstract class Impl
    {

        abstract void cancel();

        abstract void end();

        abstract float getAnimatedFloatValue();

        abstract float getAnimatedFraction();

        abstract int getAnimatedIntValue();

        abstract long getDuration();

        abstract boolean isRunning();

        abstract void setDuration(int i);

        abstract void setFloatValues(float f, float f1);

        abstract void setIntValues(int i, int j);

        abstract void setInterpolator(Interpolator interpolator);

        abstract void setListener(AnimatorListenerProxy animatorlistenerproxy);

        abstract void setUpdateListener(AnimatorUpdateListenerProxy animatorupdatelistenerproxy);

        abstract void start();

        Impl()
        {
        }
    }

    static interface Impl.AnimatorListenerProxy
    {

        public abstract void onAnimationCancel();

        public abstract void onAnimationEnd();

        public abstract void onAnimationStart();
    }

    static interface Impl.AnimatorUpdateListenerProxy
    {

        public abstract void onAnimationUpdate();
    }


    private final Impl mImpl;

    ValueAnimatorCompat(Impl impl)
    {
        mImpl = impl;
    }

    public void cancel()
    {
        mImpl.cancel();
    }

    public void end()
    {
        mImpl.end();
    }

    public float getAnimatedFloatValue()
    {
        return mImpl.getAnimatedFloatValue();
    }

    public float getAnimatedFraction()
    {
        return mImpl.getAnimatedFraction();
    }

    public int getAnimatedIntValue()
    {
        return mImpl.getAnimatedIntValue();
    }

    public long getDuration()
    {
        return mImpl.getDuration();
    }

    public boolean isRunning()
    {
        return mImpl.isRunning();
    }

    public void setDuration(int i)
    {
        mImpl.setDuration(i);
    }

    public void setFloatValues(float f, float f1)
    {
        mImpl.setFloatValues(f, f1);
    }

    public void setIntValues(int i, int j)
    {
        mImpl.setIntValues(i, j);
    }

    public void setInterpolator(Interpolator interpolator)
    {
        mImpl.setInterpolator(interpolator);
    }

    public void setListener(final AnimatorListener listener)
    {
        if (listener != null)
        {
            mImpl.setListener(new Impl.AnimatorListenerProxy() {

                final ValueAnimatorCompat this$0;
                final AnimatorListener val$listener;

                public void onAnimationCancel()
                {
                    listener.onAnimationCancel(ValueAnimatorCompat.this);
                }

                public void onAnimationEnd()
                {
                    listener.onAnimationEnd(ValueAnimatorCompat.this);
                }

                public void onAnimationStart()
                {
                    listener.onAnimationStart(ValueAnimatorCompat.this);
                }

            
            {
                this$0 = ValueAnimatorCompat.this;
                listener = animatorlistener;
                super();
            }
            });
            return;
        } else
        {
            mImpl.setListener(null);
            return;
        }
    }

    public void setUpdateListener(final AnimatorUpdateListener updateListener)
    {
        if (updateListener != null)
        {
            mImpl.setUpdateListener(new Impl.AnimatorUpdateListenerProxy() {

                final ValueAnimatorCompat this$0;
                final AnimatorUpdateListener val$updateListener;

                public void onAnimationUpdate()
                {
                    updateListener.onAnimationUpdate(ValueAnimatorCompat.this);
                }

            
            {
                this$0 = ValueAnimatorCompat.this;
                updateListener = animatorupdatelistener;
                super();
            }
            });
            return;
        } else
        {
            mImpl.setUpdateListener(null);
            return;
        }
    }

    public void start()
    {
        mImpl.start();
    }
}
