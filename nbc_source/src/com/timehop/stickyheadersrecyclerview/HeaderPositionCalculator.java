// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.timehop.stickyheadersrecyclerview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.timehop.stickyheadersrecyclerview.caching.HeaderProvider;
import com.timehop.stickyheadersrecyclerview.calculation.DimensionCalculator;
import com.timehop.stickyheadersrecyclerview.util.OrientationProvider;

// Referenced classes of package com.timehop.stickyheadersrecyclerview:
//            StickyRecyclerHeadersAdapter

public class HeaderPositionCalculator
{

    private final StickyRecyclerHeadersAdapter mAdapter;
    private final DimensionCalculator mDimensionCalculator;
    private final HeaderProvider mHeaderProvider;
    private final OrientationProvider mOrientationProvider;

    public HeaderPositionCalculator(StickyRecyclerHeadersAdapter stickyrecyclerheadersadapter, HeaderProvider headerprovider, OrientationProvider orientationprovider, DimensionCalculator dimensioncalculator)
    {
        mAdapter = stickyrecyclerheadersadapter;
        mHeaderProvider = headerprovider;
        mOrientationProvider = orientationprovider;
        mDimensionCalculator = dimensioncalculator;
    }

    private Rect getDefaultHeaderOffset(RecyclerView recyclerview, View view, View view1, int i)
    {
        Rect rect = mDimensionCalculator.getMargins(view);
        int j;
        if (i == 1)
        {
            i = view1.getLeft() + rect.left;
            j = Math.max(view1.getTop() - view.getHeight() - rect.bottom, getListTop(recyclerview) + rect.top);
        } else
        {
            j = view1.getTop() + rect.top;
            i = Math.max(view1.getLeft() - view.getWidth() - rect.right, getListLeft(recyclerview) + rect.left);
        }
        return new Rect(i, j, view.getWidth() + i, view.getHeight() + j);
    }

    private View getFirstViewUnobscuredByHeader(RecyclerView recyclerview, View view)
    {
        for (int i = 0; i < recyclerview.getChildCount(); i++)
        {
            View view1 = recyclerview.getChildAt(i);
            if (!itemIsObscuredByHeader(recyclerview, view1, view, mOrientationProvider.getOrientation(recyclerview)))
            {
                return view1;
            }
        }

        return null;
    }

    private int getListLeft(RecyclerView recyclerview)
    {
        if (recyclerview.getLayoutManager().getClipToPadding())
        {
            return recyclerview.getPaddingLeft();
        } else
        {
            return 0;
        }
    }

    private int getListTop(RecyclerView recyclerview)
    {
        if (recyclerview.getLayoutManager().getClipToPadding())
        {
            return recyclerview.getPaddingTop();
        } else
        {
            return 0;
        }
    }

    private boolean indexOutOfBounds(int i)
    {
        return i < 0 || i >= mAdapter.getItemCount();
    }

    private boolean isStickyHeaderBeingPushedOffscreen(RecyclerView recyclerview, View view)
    {
        View view1;
        int i;
        view1 = getFirstViewUnobscuredByHeader(recyclerview, view);
        i = recyclerview.getChildAdapterPosition(view1);
        break MISSING_BLOCK_LABEL_14;
        View view2;
        Rect rect;
        Rect rect1;
label0:
        while (view1.getLeft() - rect.right - view2.getWidth() - rect.left >= recyclerview.getPaddingLeft() + view.getRight() + rect1.left + rect1.right) 
        {
            do
            {
                do
                {
                    return false;
                } while (i == -1 || i <= 0 || !hasNewHeader(i));
                view2 = mHeaderProvider.getHeader(recyclerview, i);
                rect = mDimensionCalculator.getMargins(view2);
                rect1 = mDimensionCalculator.getMargins(view);
                if (mOrientationProvider.getOrientation(recyclerview) != 1)
                {
                    continue label0;
                }
            } while (view1.getTop() - rect.bottom - view2.getHeight() - rect.top >= recyclerview.getPaddingTop() + view.getBottom() + rect1.top + rect1.bottom);
            return true;
        }
        return true;
    }

    private boolean itemIsObscuredByHeader(RecyclerView recyclerview, View view, View view1, int i)
    {
        android.support.v7.widget.RecyclerView.LayoutParams layoutparams;
        Rect rect;
        int j;
        layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
        rect = mDimensionCalculator.getMargins(view1);
        j = recyclerview.getChildAdapterPosition(view);
        if (j != -1 && mHeaderProvider.getHeader(recyclerview, j) == view1) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (i != 1) goto _L4; else goto _L3
_L3:
        if (view.getTop() - layoutparams.topMargin > view1.getBottom() + rect.bottom + rect.top) goto _L1; else goto _L5
_L5:
        return true;
_L4:
        if (view.getLeft() - layoutparams.leftMargin > view1.getRight() + rect.right + rect.left)
        {
            return false;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    private void translateHeaderWithNextHeader(RecyclerView recyclerview, int i, Rect rect, View view, View view1, View view2)
    {
        Rect rect1 = mDimensionCalculator.getMargins(view2);
        Rect rect2 = mDimensionCalculator.getMargins(view);
        if (i == 1)
        {
            i = getListTop(recyclerview) + rect2.top + rect2.bottom;
            int j = view1.getTop() - view2.getHeight() - rect1.bottom - rect1.top - view.getHeight() - i;
            if (j < i)
            {
                rect.top = rect.top + j;
            }
        } else
        {
            i = getListLeft(recyclerview) + rect2.left + rect2.right;
            int k = view1.getLeft() - view2.getWidth() - rect1.right - rect1.left - view.getWidth() - i;
            if (k < i)
            {
                rect.left = rect.left + k;
                return;
            }
        }
    }

    public Rect getHeaderBounds(RecyclerView recyclerview, View view, View view1, boolean flag)
    {
        view1 = getDefaultHeaderOffset(recyclerview, view, view1, mOrientationProvider.getOrientation(recyclerview));
        if (flag && isStickyHeaderBeingPushedOffscreen(recyclerview, view))
        {
            View view2 = getFirstViewUnobscuredByHeader(recyclerview, view);
            int i = recyclerview.getChildAdapterPosition(view2);
            View view3 = mHeaderProvider.getHeader(recyclerview, i);
            translateHeaderWithNextHeader(recyclerview, mOrientationProvider.getOrientation(recyclerview), view1, view, view2, view3);
        }
        return view1;
    }

    public boolean hasNewHeader(int i)
    {
        long l;
        if (!indexOutOfBounds(i))
        {
            if ((l = mAdapter.getHeaderId(i)) >= 0L && (i == 0 || l != mAdapter.getHeaderId(i - 1)))
            {
                return true;
            }
        }
        return false;
    }

    public boolean hasStickyHeader(View view, int i, int j)
    {
        int k;
        if (i == 1)
        {
            k = view.getTop();
            i = mDimensionCalculator.getMargins(view).top;
        } else
        {
            k = view.getLeft();
            i = mDimensionCalculator.getMargins(view).left;
        }
        return k <= i && mAdapter.getHeaderId(j) >= 0L;
    }
}
