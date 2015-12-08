// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.Log;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static class mInterpolator
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
                    RecyclerView.access$4800(recyclerview).llBy(mDx, mDy);
                } else
                {
                    RecyclerView.access$4800(recyclerview).llBy(mDx, mDy, mDuration);
                }
            } else
            {
                RecyclerView.access$4800(recyclerview).llBy(mDx, mDy, mDuration, mInterpolator);
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


    public (int i, int j)
    {
        this(i, j, 0x80000000, null);
    }

    public <init>(int i, int j, int k, Interpolator interpolator)
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
