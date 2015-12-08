// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static abstract class mTargetPosition
{
    public static class Action
    {

        private boolean changed;
        private int consecutiveUpdates;
        private int mDuration;
        private int mDx;
        private int mDy;
        private Interpolator mInterpolator;
        private int mJumpToPosition;

        private void runIfNecessary(RecyclerView recyclerview)
        {
            if (mJumpToPosition >= 0)
            {
                int i = mJumpToPosition;
                mJumpToPosition = -1;
                RecyclerView.access$5100(recyclerview, i);
                changed = false;
                return;
            }
            if (changed)
            {
                validate();
                if (mInterpolator == null)
                {
                    if (mDuration == 0x80000000)
                    {
                        RecyclerView.access$4800(recyclerview).smoothScrollBy(mDx, mDy);
                    } else
                    {
                        RecyclerView.access$4800(recyclerview).smoothScrollBy(mDx, mDy, mDuration);
                    }
                } else
                {
                    RecyclerView.access$4800(recyclerview).smoothScrollBy(mDx, mDy, mDuration, mInterpolator);
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

        boolean hasJumpTarget()
        {
            return mJumpToPosition >= 0;
        }

        public void jumpTo(int i)
        {
            mJumpToPosition = i;
        }

        public void update(int i, int j, int k, Interpolator interpolator)
        {
            mDx = i;
            mDy = j;
            mDuration = k;
            mInterpolator = interpolator;
            changed = true;
        }


        public Action(int i, int j)
        {
            this(i, j, 0x80000000, null);
        }

        public Action(int i, int j, int k, Interpolator interpolator)
        {
            mJumpToPosition = -1;
            changed = false;
            consecutiveUpdates = 0;
            mDx = i;
            mDy = j;
            mDuration = k;
            mInterpolator = interpolator;
        }
    }


    private mRecyclerView mLayoutManager;
    private boolean mPendingInitialRun;
    private RecyclerView mRecyclerView;
    private final Action mRecyclingAction = new Action(0, 0);
    private boolean mRunning;
    private int mTargetPosition;
    private View mTargetView;

    private void onAnimation(int i, int j)
    {
label0:
        {
            RecyclerView recyclerview = mRecyclerView;
            if (!mRunning || mTargetPosition == -1 || recyclerview == null)
            {
                stop();
            }
            mPendingInitialRun = false;
            if (mTargetView != null)
            {
                if (getChildPosition(mTargetView) == mTargetPosition)
                {
                    onTargetFound(mTargetView, recyclerview.mState, mRecyclingAction);
                    mRecyclingAction.runIfNecessary(recyclerview);
                    stop();
                } else
                {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    mTargetView = null;
                }
            }
            if (mRunning)
            {
                onSeekTargetStep(i, j, recyclerview.mState, mRecyclingAction);
                boolean flag = mRecyclingAction.hasJumpTarget();
                mRecyclingAction.runIfNecessary(recyclerview);
                if (flag)
                {
                    if (!mRunning)
                    {
                        break label0;
                    }
                    mPendingInitialRun = true;
                    RecyclerView.access$4800(recyclerview).tOnAnimation();
                }
            }
            return;
        }
        stop();
    }

    public View findViewByPosition(int i)
    {
        return RecyclerView.access$1100(mRecyclerView).indViewByPosition(i);
    }

    public int getChildCount()
    {
        return RecyclerView.access$1100(mRecyclerView).etChildCount();
    }

    public int getChildPosition(View view)
    {
        return mRecyclerView.getChildLayoutPosition(view);
    }

    public osition getLayoutManager()
    {
        return mLayoutManager;
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

    protected void normalize(PointF pointf)
    {
        double d = Math.sqrt(pointf.x * pointf.x + pointf.y * pointf.y);
        pointf.x = (float)((double)pointf.x / d);
        pointf.y = (float)((double)pointf.y / d);
    }

    protected void onChildAttachedToWindow(View view)
    {
        if (getChildPosition(view) == getTargetPosition())
        {
            mTargetView = view;
        }
    }

    protected abstract void onSeekTargetStep(int i, int j, Action action, Action action1);

    protected abstract void onStart();

    protected abstract void onStop();

    protected abstract void onTargetFound(View view, Action action, Action action1);

    public void setTargetPosition(int i)
    {
        mTargetPosition = i;
    }

    void start(RecyclerView recyclerview, mTargetPosition mtargetposition)
    {
        mRecyclerView = recyclerview;
        mLayoutManager = mtargetposition;
        if (mTargetPosition == -1)
        {
            throw new IllegalArgumentException("Invalid target position");
        } else
        {
            _mth02(mRecyclerView.mState, mTargetPosition);
            mRunning = true;
            mPendingInitialRun = true;
            mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            RecyclerView.access$4800(mRecyclerView).tOnAnimation();
            return;
        }
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
            ccess._mth4900(mLayoutManager, this);
            mLayoutManager = null;
            mRecyclerView = null;
            return;
        }
    }


    public Action.mInterpolator()
    {
        mTargetPosition = -1;
    }
}
