// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public abstract class Action
{

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
                    Action.access._mth5900(mRecyclingAction, recyclerview);
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
                Action.access._mth5900(mRecyclingAction, recyclerview);
                if (flag)
                {
                    if (!mRunning)
                    {
                        break label0;
                    }
                    mPendingInitialRun = true;
                    RecyclerView.access$5700(recyclerview).tOnAnimation();
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

    public void instantScrollToPosition(int i)
    {
        mRecyclerView.scrollToPosition(i);
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
            RecyclerView.access$5700(mRecyclerView).tOnAnimation();
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
            ccess._mth5800(mLayoutManager, this);
            mLayoutManager = null;
            mRecyclerView = null;
            return;
        }
    }


    public Action()
    {
        mTargetPosition = -1;
    /* block-local class not found */
    class Action {}

    }
}
