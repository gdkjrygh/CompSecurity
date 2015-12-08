// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutManager

static final class mScrapList
{

    int mAvailable;
    int mCurrentPosition;
    int mExtra;
    boolean mIsPreLayout;
    int mItemDirection;
    int mLastScrollDelta;
    int mLayoutDirection;
    int mOffset;
    boolean mRecycle;
    List mScrapList;
    int mScrollingOffset;

    public final void assignPositionFromScrapList(mScrapList mscraplist)
    {
_L2:
        int j;
        if (mscraplist2 == null)
        {
            j = -1;
        } else
        {
            j = mscraplist2.tPosition();
        }
        mCurrentPosition = j;
        return;
        int i1 = mScrapList.size();
        mScrapList mscraplist1 = null;
        int i = 0x7fffffff;
        mScrapList mscraplist2;
        for (int k = 0; k < i1; k++)
        {
            mscraplist2 = (mScrapList)mScrapList.get(k);
            if (mscraplist2 != mscraplist && !mscraplist2.d())
            {
                int l = (mscraplist2.tPosition() - mCurrentPosition) * mItemDirection;
                if (l >= 0 && l < i)
                {
                    if (l == 0)
                    {
                        break MISSING_BLOCK_LABEL_102;
                    }
                    mscraplist1 = mscraplist2;
                    i = l;
                }
            }
        }

        mscraplist2 = mscraplist1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    final boolean hasMore(mItemDirection mitemdirection)
    {
        return mCurrentPosition >= 0 && mCurrentPosition < mitemdirection.mCurrentPosition();
    }

    final View next(mCurrentPosition mcurrentposition)
    {
        if (mScrapList != null)
        {
            int j = mScrapList.size();
            for (int i = 0; i < j; i++)
            {
                mcurrentposition = (mScrapList)mScrapList.get(i);
                if (!mcurrentposition.d() && mCurrentPosition == mcurrentposition.tPosition())
                {
                    assignPositionFromScrapList(mcurrentposition);
                    return ((assignPositionFromScrapList) (mcurrentposition)).;
                }
            }

            return null;
        } else
        {
            mcurrentposition = mcurrentposition.Position(mCurrentPosition);
            mCurrentPosition = mCurrentPosition + mItemDirection;
            return mcurrentposition;
        }
    }

    ()
    {
        mRecycle = true;
        mExtra = 0;
        mIsPreLayout = false;
        mScrapList = null;
    }
}
