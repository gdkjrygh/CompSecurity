// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

public abstract class afj
{

    private aex mLayoutManager;
    private boolean mPendingInitialRun;
    private RecyclerView mRecyclerView;
    private final afk mRecyclingAction = new afk(0, 0);
    private boolean mRunning;
    private int mTargetPosition;
    private View mTargetView;

    public afj()
    {
        mTargetPosition = -1;
    }

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
            afk afk1;
            if (mTargetView != null)
            {
                if (getChildPosition(mTargetView) == mTargetPosition)
                {
                    onTargetFound(mTargetView, recyclerview.v, mRecyclingAction);
                    afk1 = mRecyclingAction;
                    if (afk1.d >= 0)
                    {
                        int k = afk1.d;
                        afk1.d = -1;
                        RecyclerView.c(recyclerview, k);
                        afk1.f = false;
                    } else
                    if (afk1.f)
                    {
                        if (afk1.e != null && afk1.c <= 0)
                        {
                            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                        }
                        if (afk1.c <= 0)
                        {
                            throw new IllegalStateException("Scroll duration must be a positive number");
                        }
                        if (afk1.e == null)
                        {
                            if (afk1.c == 0x80000000)
                            {
                                RecyclerView.t(recyclerview).a(afk1.a, afk1.b);
                            } else
                            {
                                RecyclerView.t(recyclerview).a(afk1.a, afk1.b, afk1.c);
                            }
                        } else
                        {
                            RecyclerView.t(recyclerview).a(afk1.a, afk1.b, afk1.c, afk1.e);
                        }
                        afk1.g = afk1.g + 1;
                        if (afk1.g > 10)
                        {
                            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        afk1.f = false;
                    } else
                    {
                        afk1.g = 0;
                    }
                    stop();
                } else
                {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    mTargetView = null;
                }
            }
            if (mRunning)
            {
                onSeekTargetStep(i, j, recyclerview.v, mRecyclingAction);
                if (mRecyclingAction.d >= 0)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                afk1 = mRecyclingAction;
                if (afk1.d >= 0)
                {
                    j = afk1.d;
                    afk1.d = -1;
                    RecyclerView.c(recyclerview, j);
                    afk1.f = false;
                } else
                if (afk1.f)
                {
                    if (afk1.e != null && afk1.c <= 0)
                    {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    if (afk1.c <= 0)
                    {
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    if (afk1.e == null)
                    {
                        if (afk1.c == 0x80000000)
                        {
                            RecyclerView.t(recyclerview).a(afk1.a, afk1.b);
                        } else
                        {
                            RecyclerView.t(recyclerview).a(afk1.a, afk1.b, afk1.c);
                        }
                    } else
                    {
                        RecyclerView.t(recyclerview).a(afk1.a, afk1.b, afk1.c, afk1.e);
                    }
                    afk1.g = afk1.g + 1;
                    if (afk1.g > 10)
                    {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    afk1.f = false;
                } else
                {
                    afk1.g = 0;
                }
                if (i != 0)
                {
                    if (!mRunning)
                    {
                        break label0;
                    }
                    mPendingInitialRun = true;
                    RecyclerView.t(recyclerview).a();
                }
            }
            return;
        }
        stop();
    }

    public View findViewByPosition(int i)
    {
        return RecyclerView.d(mRecyclerView).findViewByPosition(i);
    }

    public int getChildCount()
    {
        return RecyclerView.d(mRecyclerView).getChildCount();
    }

    public int getChildPosition(View view)
    {
        return RecyclerView.d(view);
    }

    public aex getLayoutManager()
    {
        return mLayoutManager;
    }

    public int getTargetPosition()
    {
        return mTargetPosition;
    }

    public void instantScrollToPosition(int i)
    {
        mRecyclerView.a(i);
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

    protected abstract void onSeekTargetStep(int i, int j, afl afl1, afk afk1);

    protected abstract void onStart();

    protected abstract void onStop();

    protected abstract void onTargetFound(View view, afl afl1, afk afk1);

    public void setTargetPosition(int i)
    {
        mTargetPosition = i;
    }

    void start(RecyclerView recyclerview, aex aex1)
    {
        mRecyclerView = recyclerview;
        mLayoutManager = aex1;
        if (mTargetPosition == -1)
        {
            throw new IllegalArgumentException("Invalid target position");
        } else
        {
            mRecyclerView.v.a = mTargetPosition;
            mRunning = true;
            mPendingInitialRun = true;
            mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            RecyclerView.t(mRecyclerView).a();
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
            mRecyclerView.v.a = -1;
            mTargetView = null;
            mTargetPosition = -1;
            mPendingInitialRun = false;
            mRunning = false;
            aex.access$5000(mLayoutManager, this);
            mLayoutManager = null;
            mRecyclerView = null;
            return;
        }
    }

}
