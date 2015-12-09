// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class AutoScrollHelper
    implements android.view.View.OnTouchListener
{
    private static final class ClampedScroller
    {

        long mDeltaTime;
        int mDeltaX;
        int mDeltaY;
        int mEffectiveRampDown;
        int mRampDownDuration;
        int mRampUpDuration;
        long mStartTime;
        long mStopTime;
        float mStopValue;
        float mTargetVelocityX;
        float mTargetVelocityY;

        final float getValueAt(long l)
        {
            if (l < mStartTime)
            {
                return 0.0F;
            }
            if (mStopTime < 0L || l < mStopTime)
            {
                return 0.5F * AutoScrollHelper.constrain((float)(l - mStartTime) / (float)mRampUpDuration);
            } else
            {
                long l1 = mStopTime;
                return (1.0F - mStopValue) + mStopValue * AutoScrollHelper.constrain((float)(l - l1) / (float)mEffectiveRampDown);
            }
        }

        public ClampedScroller()
        {
            mStartTime = 0x8000000000000000L;
            mStopTime = -1L;
            mDeltaTime = 0L;
            mDeltaX = 0;
            mDeltaY = 0;
        }
    }

    private final class ScrollAnimationRunnable
        implements Runnable
    {

        final AutoScrollHelper this$0;

        public final void run()
        {
            boolean flag1 = false;
            if (!mAnimating)
            {
                return;
            }
            if (mNeedsReset)
            {
                mNeedsReset;
                ClampedScroller clampedscroller = mScroller;
                clampedscroller.mStartTime = AnimationUtils.currentAnimationTimeMillis();
                clampedscroller.mStopTime = -1L;
                clampedscroller.mDeltaTime = clampedscroller.mStartTime;
                clampedscroller.mStopValue = 0.5F;
                clampedscroller.mDeltaX = 0;
                clampedscroller.mDeltaY = 0;
            }
            ClampedScroller clampedscroller1 = mScroller;
            boolean flag = flag1;
            if (clampedscroller1.mStopTime > 0L)
            {
                flag = flag1;
                if (AnimationUtils.currentAnimationTimeMillis() > clampedscroller1.mStopTime + (long)clampedscroller1.mEffectiveRampDown)
                {
                    flag = true;
                }
            }
            if (flag || !shouldAnimate())
            {
                mAnimating;
                return;
            }
            if (mNeedsCancel)
            {
                mNeedsCancel;
                long l = SystemClock.uptimeMillis();
            }
            if (clampedscroller1.mDeltaTime == 0L)
            {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            } else
            {
                long l = AnimationUtils.currentAnimationTimeMillis();
                float f = clampedscroller1.getValueAt(l);
                f = f * 4F + -4F * f * f;
                long l1 = l - clampedscroller1.mDeltaTime;
                clampedscroller1.mDeltaTime = l;
                clampedscroller1.mDeltaX = (int)((float)l1 * f * clampedscroller1.mTargetVelocityX);
                clampedscroller1.mDeltaY = (int)((float)l1 * f * clampedscroller1.mTargetVelocityY);
                int i = clampedscroller1.mDeltaY;
                scrollTargetBy$255f295(i);
                ViewCompat.postOnAnimation(mTarget, this);
                return;
            }
        }

        private ScrollAnimationRunnable()
        {
            this$0 = AutoScrollHelper.this;
            super();
        }

        ScrollAnimationRunnable(byte byte0)
        {
            this();
        }
    }


    private static final int DEFAULT_ACTIVATION_DELAY = ViewConfiguration.getTapTimeout();
    private int mActivationDelay;
    private boolean mAlreadyDelayed;
    private boolean mAnimating;
    private final Interpolator mEdgeInterpolator = new AccelerateInterpolator();
    private int mEdgeType;
    private boolean mEnabled;
    private float mMaximumEdges[] = {
        3.402823E+38F, 3.402823E+38F
    };
    private float mMaximumVelocity[] = {
        3.402823E+38F, 3.402823E+38F
    };
    private float mMinimumVelocity[] = {
        0.0F, 0.0F
    };
    private boolean mNeedsCancel;
    private boolean mNeedsReset;
    private float mRelativeEdges[] = {
        0.0F, 0.0F
    };
    private float mRelativeVelocity[] = {
        0.0F, 0.0F
    };
    private Runnable mRunnable;
    private final ClampedScroller mScroller = new ClampedScroller();
    private final View mTarget;

    public AutoScrollHelper(View view)
    {
        mTarget = view;
        view = Resources.getSystem().getDisplayMetrics();
        int i = (int)(1575F * ((DisplayMetrics) (view)).density + 0.5F);
        int j = (int)(315F * ((DisplayMetrics) (view)).density + 0.5F);
        float f = i;
        mMaximumVelocity[0] = f / 1000F;
        mMaximumVelocity[1] = f / 1000F;
        f = j;
        mMinimumVelocity[0] = f / 1000F;
        mMinimumVelocity[1] = f / 1000F;
        mEdgeType = 1;
        mMaximumEdges[0] = 3.402823E+38F;
        mMaximumEdges[1] = 3.402823E+38F;
        mRelativeEdges[0] = 0.2F;
        mRelativeEdges[1] = 0.2F;
        mRelativeVelocity[0] = 0.001F;
        mRelativeVelocity[1] = 0.001F;
        mActivationDelay = DEFAULT_ACTIVATION_DELAY;
        mScroller.mRampUpDuration = 500;
        mScroller.mRampDownDuration = 500;
    }

    private float computeTargetVelocity(int i, float f, float f1, float f2)
    {
        float f3 = constrain(mRelativeEdges[i] * f1, 0.0F, mMaximumEdges[i]);
        float f5 = constrainEdgeValue(f, f3);
        f = constrainEdgeValue(f1 - f, f3) - f5;
        if (f >= 0.0F) goto _L2; else goto _L1
_L1:
        f = -mEdgeInterpolator.getInterpolation(-f);
_L6:
        f = constrain(f, -1F, 1.0F);
_L4:
        if (f == 0.0F)
        {
            return 0.0F;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (f > 0.0F)
        {
            f = mEdgeInterpolator.getInterpolation(f);
            continue; /* Loop/switch isn't completed */
        }
        f = 0.0F;
        if (true) goto _L4; else goto _L3
_L3:
        float f6 = mRelativeVelocity[i];
        f1 = mMinimumVelocity[i];
        float f4 = mMaximumVelocity[i];
        f2 = f6 * f2;
        if (f > 0.0F)
        {
            return constrain(f * f2, f1, f4);
        }
        return -constrain(-f * f2, f1, f4);
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static float constrain(float f, float f1, float f2)
    {
        if (f > f2)
        {
            return f2;
        }
        if (f < f1)
        {
            return f1;
        } else
        {
            return f;
        }
    }

    private float constrainEdgeValue(float f, float f1)
    {
        if (f1 != 0.0F) goto _L2; else goto _L1
_L1:
        return 0.0F;
_L2:
        mEdgeType;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 42
    //                   1 42
    //                   2 77;
           goto _L3 _L4 _L4 _L5
_L5:
        continue; /* Loop/switch isn't completed */
_L3:
        return 0.0F;
_L4:
        if (f >= f1) goto _L1; else goto _L6
_L6:
        if (f >= 0.0F)
        {
            return 1.0F - f / f1;
        }
        if (!mAnimating || mEdgeType != 1) goto _L1; else goto _L7
_L7:
        return 1.0F;
        if (f >= 0.0F) goto _L1; else goto _L8
_L8:
        return f / -f1;
    }

    private void requestStop()
    {
        ClampedScroller clampedscroller;
        int i;
        int j;
        long l;
        if (mNeedsReset)
        {
            mAnimating = false;
            return;
        }
        clampedscroller = mScroller;
        l = AnimationUtils.currentAnimationTimeMillis();
        i = (int)(l - clampedscroller.mStartTime);
        j = clampedscroller.mRampDownDuration;
        if (i <= j) goto _L2; else goto _L1
_L1:
        i = j;
_L4:
        clampedscroller.mEffectiveRampDown = i;
        clampedscroller.mStopValue = clampedscroller.getValueAt(l);
        clampedscroller.mStopTime = l;
        return;
_L2:
        if (i < 0)
        {
            i = 0;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean shouldAnimate()
    {
        ClampedScroller clampedscroller = mScroller;
        int i = (int)(clampedscroller.mTargetVelocityY / Math.abs(clampedscroller.mTargetVelocityY));
        int j = (int)(clampedscroller.mTargetVelocityX / Math.abs(clampedscroller.mTargetVelocityX));
        if (i == 0 || !canTargetScrollVertically(i))
        {
            if (j == 0);
            return false;
        } else
        {
            return true;
        }
    }

    public abstract boolean canTargetScrollVertically(int i);

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (mEnabled) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        switch (MotionEventCompat.getActionMasked(motionevent))
        {
        default:
            return false;

        case 0: // '\0'
            mNeedsCancel = true;
            mAlreadyDelayed = false;
            // fall through

        case 2: // '\002'
            float f = computeTargetVelocity(0, motionevent.getX(), view.getWidth(), mTarget.getWidth());
            float f1 = computeTargetVelocity(1, motionevent.getY(), view.getHeight(), mTarget.getHeight());
            view = mScroller;
            view.mTargetVelocityX = f;
            view.mTargetVelocityY = f1;
            if (!mAnimating && shouldAnimate())
            {
                if (mRunnable == null)
                {
                    mRunnable = new ScrollAnimationRunnable((byte)0);
                }
                mAnimating = true;
                mNeedsReset = true;
                if (!mAlreadyDelayed && mActivationDelay > 0)
                {
                    ViewCompat.postOnAnimationDelayed(mTarget, mRunnable, mActivationDelay);
                } else
                {
                    mRunnable.run();
                }
                mAlreadyDelayed = true;
                return false;
            }
            break;

        case 1: // '\001'
        case 3: // '\003'
            requestStop();
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public abstract void scrollTargetBy$255f295(int i);

    public final AutoScrollHelper setEnabled(boolean flag)
    {
        if (mEnabled && !flag)
        {
            requestStop();
        }
        mEnabled = flag;
        return this;
    }




/*
    static boolean access$102$2149d4c8(AutoScrollHelper autoscrollhelper)
    {
        autoscrollhelper.mAnimating = false;
        return false;
    }

*/



/*
    static boolean access$202$2149d4c8(AutoScrollHelper autoscrollhelper)
    {
        autoscrollhelper.mNeedsReset = false;
        return false;
    }

*/





/*
    static boolean access$502$2149d4c8(AutoScrollHelper autoscrollhelper)
    {
        autoscrollhelper.mNeedsCancel = false;
        return false;
    }

*/


/*
    static void access$600(AutoScrollHelper autoscrollhelper)
    {
        long l = SystemClock.uptimeMillis();
        MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        autoscrollhelper.mTarget.onTouchEvent(motionevent);
        motionevent.recycle();
        return;
    }

*/


}
