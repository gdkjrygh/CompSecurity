// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;


public class RtlSpacingHelper
{

    public static final int UNDEFINED = 0x80000000;
    private int mEnd;
    private int mExplicitLeft;
    private int mExplicitRight;
    private boolean mIsRelative;
    private boolean mIsRtl;
    private int mLeft;
    private int mRight;
    private int mStart;

    public RtlSpacingHelper()
    {
        mLeft = 0;
        mRight = 0;
        mStart = 0x80000000;
        mEnd = 0x80000000;
        mExplicitLeft = 0;
        mExplicitRight = 0;
        mIsRtl = false;
        mIsRelative = false;
    }

    public int getEnd()
    {
        if (mIsRtl)
        {
            return mLeft;
        } else
        {
            return mRight;
        }
    }

    public int getLeft()
    {
        return mLeft;
    }

    public int getRight()
    {
        return mRight;
    }

    public int getStart()
    {
        if (mIsRtl)
        {
            return mRight;
        } else
        {
            return mLeft;
        }
    }

    public void setAbsolute(int i, int j)
    {
        mIsRelative = false;
        if (i != 0x80000000)
        {
            mExplicitLeft = i;
            mLeft = i;
        }
        if (j != 0x80000000)
        {
            mExplicitRight = j;
            mRight = j;
        }
    }

    public void setDirection(boolean flag)
    {
        if (flag == mIsRtl)
        {
            return;
        }
        mIsRtl = flag;
        if (mIsRelative)
        {
            if (flag)
            {
                int i;
                if (mEnd != 0x80000000)
                {
                    i = mEnd;
                } else
                {
                    i = mExplicitLeft;
                }
                mLeft = i;
                if (mStart != 0x80000000)
                {
                    i = mStart;
                } else
                {
                    i = mExplicitRight;
                }
                mRight = i;
                return;
            }
            int j;
            if (mStart != 0x80000000)
            {
                j = mStart;
            } else
            {
                j = mExplicitLeft;
            }
            mLeft = j;
            if (mEnd != 0x80000000)
            {
                j = mEnd;
            } else
            {
                j = mExplicitRight;
            }
            mRight = j;
            return;
        } else
        {
            mLeft = mExplicitLeft;
            mRight = mExplicitRight;
            return;
        }
    }

    public void setRelative(int i, int j)
    {
        mStart = i;
        mEnd = j;
        mIsRelative = true;
        if (mIsRtl)
        {
            if (j != 0x80000000)
            {
                mLeft = j;
            }
            if (i != 0x80000000)
            {
                mRight = i;
            }
        } else
        {
            if (i != 0x80000000)
            {
                mLeft = i;
            }
            if (j != 0x80000000)
            {
                mRight = j;
                return;
            }
        }
    }
}
