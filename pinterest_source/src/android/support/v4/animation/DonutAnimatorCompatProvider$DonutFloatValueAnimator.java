// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.animation;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.animation:
//            ValueAnimatorCompat, AnimatorListenerCompat, AnimatorUpdateListenerCompat

class _cls1
    implements ValueAnimatorCompat
{

    private long mDuration;
    private boolean mEnded;
    private float mFraction;
    List mListeners;
    private Runnable mLoopRunnable;
    private long mStartTime;
    private boolean mStarted;
    View mTarget;
    List mUpdateListeners;

    private void dispatchCancel()
    {
        for (int i = mListeners.size() - 1; i >= 0; i--)
        {
            ((AnimatorListenerCompat)mListeners.get(i)).onAnimationCancel(this);
        }

    }

    private void dispatchEnd()
    {
        for (int i = mListeners.size() - 1; i >= 0; i--)
        {
            ((AnimatorListenerCompat)mListeners.get(i)).onAnimationEnd(this);
        }

    }

    private void dispatchStart()
    {
        for (int i = mListeners.size() - 1; i >= 0; i--)
        {
            ((AnimatorListenerCompat)mListeners.get(i)).onAnimationStart(this);
        }

    }

    private long getTime()
    {
        return mTarget.getDrawingTime();
    }

    private void notifyUpdateListeners()
    {
        for (int i = mUpdateListeners.size() - 1; i >= 0; i--)
        {
            ((AnimatorUpdateListenerCompat)mUpdateListeners.get(i)).onAnimationUpdate(this);
        }

    }

    public void addListener(AnimatorListenerCompat animatorlistenercompat)
    {
        mListeners.add(animatorlistenercompat);
    }

    public void addUpdateListener(AnimatorUpdateListenerCompat animatorupdatelistenercompat)
    {
        mUpdateListeners.add(animatorupdatelistenercompat);
    }

    public void cancel()
    {
        if (mEnded)
        {
            return;
        }
        mEnded = true;
        if (mStarted)
        {
            dispatchCancel();
        }
        dispatchEnd();
    }

    public float getAnimatedFraction()
    {
        return mFraction;
    }

    public void setDuration(long l)
    {
        if (!mStarted)
        {
            mDuration = l;
        }
    }

    public void setTarget(View view)
    {
        mTarget = view;
    }

    public void start()
    {
        if (mStarted)
        {
            return;
        } else
        {
            mStarted = true;
            dispatchStart();
            mFraction = 0.0F;
            mStartTime = getTime();
            mTarget.postDelayed(mLoopRunnable, 16L);
            return;
        }
    }






/*
    static float access$302(_cls1 _pcls1, float f)
    {
        _pcls1.mFraction = f;
        return f;
    }

*/




    public _cls1.this._cls0()
    {
        mListeners = new ArrayList();
        mUpdateListeners = new ArrayList();
        mDuration = 200L;
        mFraction = 0.0F;
        mStarted = false;
        mEnded = false;
        class _cls1
            implements Runnable
        {

            final DonutAnimatorCompatProvider.DonutFloatValueAnimator this$0;

            public void run()
            {
                float f = ((float)(getTime() - mStartTime) * 1.0F) / (float)mDuration;
                if (f > 1.0F || mTarget.getParent() == null)
                {
                    f = 1.0F;
                }
                mFraction = f;
                notifyUpdateListeners();
                if (mFraction >= 1.0F)
                {
                    dispatchEnd();
                    return;
                } else
                {
                    mTarget.postDelayed(mLoopRunnable, 16L);
                    return;
                }
            }

            _cls1()
            {
                this$0 = DonutAnimatorCompatProvider.DonutFloatValueAnimator.this;
                super();
            }
        }

        mLoopRunnable = new _cls1();
    }
}
