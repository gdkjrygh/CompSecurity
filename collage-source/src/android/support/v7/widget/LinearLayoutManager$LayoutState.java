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
    int mLastScrollDelta;
    int mLayoutDirection;
    int mOffset;
    boolean mRecycle;
    List mScrapList;
    int mScrollingOffset;

    private View nextViewFromScrapList()
    {
        int i;
        int j;
        j = mScrapList.size();
        i = 0;
_L3:
        View view;
        mScrapList mscraplist;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        view = ((mScrapList)mScrapList.get(i)).;
        mscraplist = ()view.getLayoutParams();
          goto _L1
_L5:
        i++;
        if (true) goto _L3; else goto _L2
_L1:
        if (mscraplist.Removed() || mCurrentPosition != mscraplist.wLayoutPosition()) goto _L5; else goto _L4
_L4:
        assignPositionFromScrapList(view);
        return view;
_L2:
        return null;
    }

    public void assignPositionFromScrapList()
    {
        assignPositionFromScrapList(null);
    }

    public void assignPositionFromScrapList(View view)
    {
        view = nextViewInLimitedList(view);
        if (view == null)
        {
            mCurrentPosition = -1;
            return;
        } else
        {
            mCurrentPosition = ((mCurrentPosition)view.getLayoutParams()).wLayoutPosition();
            return;
        }
    }

    boolean hasMore(wLayoutPosition wlayoutposition)
    {
        return mCurrentPosition >= 0 && mCurrentPosition < wlayoutposition.mCurrentPosition();
    }

    void log()
    {
        Log.d("LinearLayoutManager#LayoutState", (new StringBuilder()).append("avail:").append(mAvailable).append(", ind:").append(mCurrentPosition).append(", dir:").append(mItemDirection).append(", offset:").append(mOffset).append(", layoutDir:").append(mLayoutDirection).toString());
    }

    View next(mLayoutDirection mlayoutdirection)
    {
        if (mScrapList != null)
        {
            return nextViewFromScrapList();
        } else
        {
            mlayoutdirection = mlayoutdirection.Position(mCurrentPosition);
            mCurrentPosition = mCurrentPosition + mItemDirection;
            return mlayoutdirection;
        }
    }

    public View nextViewInLimitedList(View view)
    {
        int l = mScrapList.size();
        View view1 = null;
        int i = 0x7fffffff;
        int j = 0;
        while (j < l) 
        {
            View view2 = ((mScrapList)mScrapList.get(j)).;
            mItemDirection mitemdirection = ()view2.getLayoutParams();
            if (view2 != view && !mitemdirection.Removed())
            {
                int k = (mitemdirection.wLayoutPosition() - mCurrentPosition) * mItemDirection;
                if (k >= 0 && k < i)
                {
                    if (k == 0)
                    {
                        return view2;
                    }
                    view1 = view2;
                    i = k;
                }
            }
            j++;
        }
        return view1;
    }

    ()
    {
        mRecycle = true;
        mExtra = 0;
        mIsPreLayout = false;
        mScrapList = null;
    }
}
