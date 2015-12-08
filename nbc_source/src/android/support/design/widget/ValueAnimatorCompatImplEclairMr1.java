// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.design.widget:
//            AnimationUtils

class ValueAnimatorCompatImplEclairMr1 extends ValueAnimatorCompat.Impl
{

    private static final int DEFAULT_DURATION = 200;
    private static final int HANDLER_DELAY = 10;
    private static final Handler sHandler = new Handler(Looper.getMainLooper());
    private float mAnimatedFraction;
    private int mDuration;
    private final float mFloatValues[] = new float[2];
    private final int mIntValues[] = new int[2];
    private Interpolator mInterpolator;
    private boolean mIsRunning;
    private ValueAnimatorCompat.Impl.AnimatorListenerProxy mListener;
    private final Runnable mRunnable = new Runnable() {

        final ValueAnimatorCompatImplEclairMr1 this$0;

        public void run()
        {
            update();
        }

            
            {
                this$0 = ValueAnimatorCompatImplEclairMr1.this;
                super();
            }
    };
    private long mStartTime;
    private ValueAnimatorCompat.Impl.AnimatorUpdateListenerProxy mUpdateListener;

    ValueAnimatorCompatImplEclairMr1()
    {
        mDuration = 200;
    }

    private void update()
    {
        if (mIsRunning)
        {
            float f1 = (float)(SystemClock.uptimeMillis() - mStartTime) / (float)mDuration;
            float f = f1;
            if (mInterpolator != null)
            {
                f = mInterpolator.getInterpolation(f1);
            }
            mAnimatedFraction = f;
            if (mUpdateListener != null)
            {
                mUpdateListener.onAnimationUpdate();
            }
            if (SystemClock.uptimeMillis() >= mStartTime + (long)mDuration)
            {
                mIsRunning = false;
                if (mListener != null)
                {
                    mListener.onAnimationEnd();
                }
            }
        }
        if (mIsRunning)
        {
            sHandler.postDelayed(mRunnable, 10L);
        }
    }

    public void cancel()
    {
        mIsRunning = false;
        sHandler.removeCallbacks(mRunnable);
        if (mListener != null)
        {
            mListener.onAnimationCancel();
        }
    }

    public void end()
    {
        if (mIsRunning)
        {
            mIsRunning = false;
            sHandler.removeCallbacks(mRunnable);
            mAnimatedFraction = 1.0F;
            if (mUpdateListener != null)
            {
                mUpdateListener.onAnimationUpdate();
            }
            if (mListener != null)
            {
                mListener.onAnimationEnd();
            }
        }
    }

    public float getAnimatedFloatValue()
    {
        return AnimationUtils.lerp(mFloatValues[0], mFloatValues[1], getAnimatedFraction());
    }

    public float getAnimatedFraction()
    {
        return mAnimatedFraction;
    }

    public int getAnimatedIntValue()
    {
        return AnimationUtils.lerp(mIntValues[0], mIntValues[1], getAnimatedFraction());
    }

    public boolean isRunning()
    {
        return mIsRunning;
    }

    public void setDuration(int i)
    {
        mDuration = i;
    }

    public void setFloatValues(float f, float f1)
    {
        mFloatValues[0] = f;
        mFloatValues[1] = f1;
    }

    public void setIntValues(int i, int j)
    {
        mIntValues[0] = i;
        mIntValues[1] = j;
    }

    public void setInterpolator(Interpolator interpolator)
    {
        mInterpolator = interpolator;
    }

    public void setListener(ValueAnimatorCompat.Impl.AnimatorListenerProxy animatorlistenerproxy)
    {
        mListener = animatorlistenerproxy;
    }

    public void setUpdateListener(ValueAnimatorCompat.Impl.AnimatorUpdateListenerProxy animatorupdatelistenerproxy)
    {
        mUpdateListener = animatorupdatelistenerproxy;
    }

    public void start()
    {
        if (mIsRunning)
        {
            return;
        }
        if (mInterpolator == null)
        {
            mInterpolator = new AccelerateDecelerateInterpolator();
        }
        mStartTime = SystemClock.uptimeMillis();
        mIsRunning = true;
        if (mListener != null)
        {
            mListener.onAnimationStart();
        }
        sHandler.postDelayed(mRunnable, 10L);
    }


}
