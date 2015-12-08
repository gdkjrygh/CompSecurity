// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


final class LayoutState
{

    int mAvailable;
    int mCurrentPosition;
    int mEndLine;
    int mItemDirection;
    int mLayoutDirection;
    int mStartLine;

    LayoutState()
    {
        mStartLine = 0;
        mEndLine = 0;
    }

    public final String toString()
    {
        return (new StringBuilder("LayoutState{mAvailable=")).append(mAvailable).append(", mCurrentPosition=").append(mCurrentPosition).append(", mItemDirection=").append(mItemDirection).append(", mLayoutDirection=").append(mLayoutDirection).append(", mStartLine=").append(mStartLine).append(", mEndLine=").append(mEndLine).append('}').toString();
    }
}
