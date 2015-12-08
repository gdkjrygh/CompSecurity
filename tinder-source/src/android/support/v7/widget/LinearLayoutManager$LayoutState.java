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
        int j = mScrapList.size();
        for (int i = 0; i < j; i++)
        {
            View view = ((mScrapList)mScrapList.get(i)).;
            mScrapList mscraplist = ()view.getLayoutParams();
            if (!mscraplist.Removed() && mCurrentPosition == mscraplist.wLayoutPosition())
            {
                assignPositionFromScrapList(view);
                return view;
            }
        }

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
        Log.d("LinearLayoutManager#LayoutState", (new StringBuilder("avail:")).append(mAvailable).append(", ind:").append(mCurrentPosition).append(", dir:").append(mItemDirection).append(", offset:").append(mOffset).append(", layoutDir:").append(mLayoutDirection).toString());
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
        for (int j = 0; j < l; j++)
        {
            View view2 = ((mScrapList)mScrapList.get(j)).;
            mItemDirection mitemdirection = ()view2.getLayoutParams();
            if (view2 == view || mitemdirection.Removed())
            {
                continue;
            }
            int k = (mitemdirection.wLayoutPosition() - mCurrentPosition) * mItemDirection;
            if (k < 0 || k >= i)
            {
                continue;
            }
            view1 = view2;
            if (k == 0)
            {
                break;
            }
            view1 = view2;
            i = k;
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
