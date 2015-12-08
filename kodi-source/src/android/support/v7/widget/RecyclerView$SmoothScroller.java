// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static abstract class Action
{
    public static class Action
    {

        private boolean changed;
        private int consecutiveUpdates;
        private int mDuration;
        private int mDx;
        private int mDy;
        private Interpolator mInterpolator;

        private void runIfNecessary(RecyclerView recyclerview)
        {
            if (changed)
            {
                validate();
                if (mInterpolator == null)
                {
                    if (mDuration == 0x80000000)
                    {
                        RecyclerView.access$4700(recyclerview).smoothScrollBy(mDx, mDy);
                    } else
                    {
                        RecyclerView.access$4700(recyclerview).smoothScrollBy(mDx, mDy, mDuration);
                    }
                } else
                {
                    RecyclerView.access$4700(recyclerview).smoothScrollBy(mDx, mDy, mDuration, mInterpolator);
                }
                consecutiveUpdates = consecutiveUpdates + 1;
                if (consecutiveUpdates > 10)
                {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                changed = false;
                return;
            } else
            {
                consecutiveUpdates = 0;
                return;
            }
        }

        private void validate()
        {
            if (mInterpolator != null && mDuration < 1)
            {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            if (mDuration < 1)
            {
                throw new IllegalStateException("Scroll duration must be a positive number");
            } else
            {
                return;
            }
        }

    }


    private mRecyclerView mLayoutManager;
    private boolean mPendingInitialRun;
    private RecyclerView mRecyclerView;
    private final Action mRecyclingAction;
    private boolean mRunning;
    private int mTargetPosition;
    private View mTargetView;

    private void onAnimation(int i, int j)
    {
        if (!mRunning || mTargetPosition == -1)
        {
            stop();
        }
        mPendingInitialRun = false;
        if (mTargetView != null)
        {
            if (getChildPosition(mTargetView) == mTargetPosition)
            {
                onTargetFound(mTargetView, mRecyclerView.mState, mRecyclingAction);
                mRecyclingAction.runIfNecessary(mRecyclerView);
                stop();
            } else
            {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                mTargetView = null;
            }
        }
        if (mRunning)
        {
            onSeekTargetStep(i, j, mRecyclerView.mState, mRecyclingAction);
            mRecyclingAction.runIfNecessary(mRecyclerView);
        }
    }

    public int getChildPosition(View view)
    {
        return mRecyclerView.getChildPosition(view);
    }

    public int getTargetPosition()
    {
        return mTargetPosition;
    }

    public boolean isPendingInitialRun()
    {
        return mPendingInitialRun;
    }

    public boolean isRunning()
    {
        return mRunning;
    }

    protected void onChildAttachedToWindow(View view)
    {
        if (getChildPosition(view) == getTargetPosition())
        {
            mTargetView = view;
        }
    }

    protected abstract void onSeekTargetStep(int i, int j, Action action, Action action1);

    protected abstract void onStop();

    protected abstract void onTargetFound(View view, Action action, Action action1);

    public void setTargetPosition(int i)
    {
        mTargetPosition = i;
    }

    protected final void stop()
    {
        if (!mRunning)
        {
            return;
        } else
        {
            onStop();
            _mth02(mRecyclerView.mState, -1);
            mTargetView = null;
            mTargetPosition = -1;
            mPendingInitialRun = false;
            mRunning = false;
            ccess._mth4800(mLayoutManager, this);
            mLayoutManager = null;
            mRecyclerView = null;
            return;
        }
    }

}
