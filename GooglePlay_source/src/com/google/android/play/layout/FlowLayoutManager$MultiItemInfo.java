// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.layout;


// Referenced classes of package com.google.android.play.layout:
//            FlowLayoutManager

private static abstract class <init>
{

    public int mMeasureMode;
    public int mPositionStart;
    public int mTotalHeight;

    public final int arrangeIfNecessary(int i)
    {
        boolean flag = true;
        int j;
        byte byte0;
        if (mPositionStart == 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (validPositionEnd() == i)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        j |= byte0;
        if (mTotalHeight == -1 || j != mMeasureMode)
        {
            if (mTotalHeight != -1)
            {
                flag = false;
            }
            mTotalHeight = Math.max(0, onArrange(flag, i));
            mMeasureMode = j;
        }
        return mTotalHeight;
    }

    public final int invalidateFrom(int i)
    {
        if (i <= mPositionStart)
        {
            mTotalHeight = -1;
            return 2;
        }
        if (invalidateFromInternal(i))
        {
            mTotalHeight = -1;
            return 1;
        } else
        {
            return 0;
        }
    }

    protected abstract boolean invalidateFromInternal(int i);

    public void offsetPositions(int i)
    {
        mPositionStart = mPositionStart + i;
    }

    protected abstract int onArrange(boolean flag, int i);

    protected void reset()
    {
        mTotalHeight = -1;
        mPositionStart = -1;
        mMeasureMode = 0;
    }

    public abstract int validPositionEnd();

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
