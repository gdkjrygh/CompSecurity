// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.Log;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutManager

static class mScrapList
{

    static final int INVALID_LAYOUT = 0x80000000;
    static final int ITEM_DIRECTION_HEAD = -1;
    static final int ITEM_DIRECTION_TAIL = 1;
    static final int LAYOUT_END = 1;
    static final int LAYOUT_START = -1;
    static final int SCOLLING_OFFSET_NaN = 0x80000000;
    static final String TAG = "LinearLayoutManager#LayoutState";
    int mAvailable;
    int mCurrentPosition;
    int mExtra;
    boolean mIsPreLayout;
    int mItemDirection;
    int mLayoutDirection;
    int mOffset;
    boolean mRecycle;
    List mScrapList;
    int mScrollingOffset;

    private View nextFromLimitedList()
    {
        mScrapList mscraplist;
        int i;
        int j;
        int l;
        l = mScrapList.size();
        i = 0x7fffffff;
        j = 0;
        mscraplist = null;
_L2:
        mScrapList mscraplist1;
        if (j >= l)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        mscraplist1 = (mScrapList)mScrapList.get(j);
        if (mIsPreLayout || !mscraplist1.d())
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        int k = (mscraplist1.ion() - mCurrentPosition) * mItemDirection;
        if (k < 0 || k >= i) goto _L4; else goto _L3
_L3:
        if (k != 0) goto _L6; else goto _L5
_L5:
        if (mscraplist1 != null)
        {
            mCurrentPosition = mscraplist1.ion() + mItemDirection;
            return mscraplist1.;
        } else
        {
            return null;
        }
_L6:
        mscraplist = mscraplist1;
        i = k;
          goto _L4
        mscraplist1 = mscraplist;
          goto _L5
    }

    boolean hasMore( )
    {
        return mCurrentPosition >= 0 && mCurrentPosition < .mCurrentPosition();
    }

    void log()
    {
        Log.d("LinearLayoutManager#LayoutState", (new StringBuilder()).append("avail:").append(mAvailable).append(", ind:").append(mCurrentPosition).append(", dir:").append(mItemDirection).append(", offset:").append(mOffset).append(", layoutDir:").append(mLayoutDirection).toString());
    }

    View next(mLayoutDirection mlayoutdirection)
    {
        if (mScrapList != null)
        {
            return nextFromLimitedList();
        } else
        {
            mlayoutdirection = mlayoutdirection.Position(mCurrentPosition);
            mCurrentPosition = mCurrentPosition + mItemDirection;
            return mlayoutdirection;
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
