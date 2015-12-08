// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;


public final class RtlSpacingHelper
{

    public int mEnd;
    public int mExplicitLeft;
    public int mExplicitRight;
    public boolean mIsRelative;
    public boolean mIsRtl;
    public int mLeft;
    public int mRight;
    public int mStart;

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

    public final void setRelative(int i, int j)
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
