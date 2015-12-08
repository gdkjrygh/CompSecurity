// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.timehop.stickyheadersrecyclerview;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import com.timehop.stickyheadersrecyclerview.caching.HeaderProvider;
import com.timehop.stickyheadersrecyclerview.caching.HeaderViewCache;
import com.timehop.stickyheadersrecyclerview.calculation.DimensionCalculator;
import com.timehop.stickyheadersrecyclerview.rendering.HeaderRenderer;
import com.timehop.stickyheadersrecyclerview.util.LinearLayoutOrientationProvider;
import com.timehop.stickyheadersrecyclerview.util.OrientationProvider;

// Referenced classes of package com.timehop.stickyheadersrecyclerview:
//            HeaderPositionCalculator, StickyRecyclerHeadersAdapter

public class StickyRecyclerHeadersDecoration extends android.support.v7.widget.RecyclerView.ItemDecoration
{

    private final StickyRecyclerHeadersAdapter mAdapter;
    private final DimensionCalculator mDimensionCalculator;
    private final HeaderPositionCalculator mHeaderPositionCalculator;
    private final HeaderProvider mHeaderProvider;
    private final SparseArray mHeaderRects;
    private final OrientationProvider mOrientationProvider;
    private final HeaderRenderer mRenderer;

    public StickyRecyclerHeadersDecoration(StickyRecyclerHeadersAdapter stickyrecyclerheadersadapter)
    {
        this(stickyrecyclerheadersadapter, ((OrientationProvider) (new LinearLayoutOrientationProvider())), new DimensionCalculator());
    }

    private StickyRecyclerHeadersDecoration(StickyRecyclerHeadersAdapter stickyrecyclerheadersadapter, HeaderRenderer headerrenderer, OrientationProvider orientationprovider, DimensionCalculator dimensioncalculator, HeaderProvider headerprovider, HeaderPositionCalculator headerpositioncalculator)
    {
        mHeaderRects = new SparseArray();
        mAdapter = stickyrecyclerheadersadapter;
        mHeaderProvider = headerprovider;
        mOrientationProvider = orientationprovider;
        mRenderer = headerrenderer;
        mDimensionCalculator = dimensioncalculator;
        mHeaderPositionCalculator = headerpositioncalculator;
    }

    private StickyRecyclerHeadersDecoration(StickyRecyclerHeadersAdapter stickyrecyclerheadersadapter, OrientationProvider orientationprovider, DimensionCalculator dimensioncalculator)
    {
        this(stickyrecyclerheadersadapter, orientationprovider, dimensioncalculator, new HeaderRenderer(orientationprovider), ((HeaderProvider) (new HeaderViewCache(stickyrecyclerheadersadapter, orientationprovider))));
    }

    private StickyRecyclerHeadersDecoration(StickyRecyclerHeadersAdapter stickyrecyclerheadersadapter, OrientationProvider orientationprovider, DimensionCalculator dimensioncalculator, HeaderRenderer headerrenderer, HeaderProvider headerprovider)
    {
        this(stickyrecyclerheadersadapter, headerrenderer, orientationprovider, dimensioncalculator, headerprovider, new HeaderPositionCalculator(stickyrecyclerheadersadapter, headerprovider, orientationprovider, dimensioncalculator));
    }

    private void setItemOffsetsForHeader(Rect rect, View view, int i)
    {
        Rect rect1 = mDimensionCalculator.getMargins(view);
        if (i == 1)
        {
            rect.top = view.getHeight() + rect1.top + rect1.bottom;
            return;
        } else
        {
            rect.left = view.getWidth() + rect1.left + rect1.right;
            return;
        }
    }

    public int findHeaderPositionUnder(int i, int j)
    {
        for (int k = 0; k < mHeaderRects.size(); k++)
        {
            if (((Rect)mHeaderRects.get(mHeaderRects.keyAt(k))).contains(i, j))
            {
                return mHeaderRects.keyAt(k);
            }
        }

        return -1;
    }

    public View getHeaderView(RecyclerView recyclerview, int i)
    {
        return mHeaderProvider.getHeader(recyclerview, i);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
    {
        super.getItemOffsets(rect, view, recyclerview, state);
        int i;
        for (i = recyclerview.getChildAdapterPosition(view); i == -1 || !mHeaderPositionCalculator.hasNewHeader(i);)
        {
            return;
        }

        setItemOffsetsForHeader(rect, getHeaderView(recyclerview, i), mOrientationProvider.getOrientation(recyclerview));
    }

    public void invalidateHeaders()
    {
        mHeaderProvider.invalidate();
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
    {
        super.onDrawOver(canvas, recyclerview, state);
        mHeaderRects.clear();
        if (recyclerview.getChildCount() > 0 && mAdapter.getItemCount() > 0)
        {
            int i = 0;
            while (i < recyclerview.getChildCount()) 
            {
                Object obj = recyclerview.getChildAt(i);
                int j = recyclerview.getChildAdapterPosition(((View) (obj)));
                if (j != -1)
                {
                    boolean flag = mHeaderPositionCalculator.hasStickyHeader(((View) (obj)), mOrientationProvider.getOrientation(recyclerview), j);
                    if (flag || mHeaderPositionCalculator.hasNewHeader(j))
                    {
                        state = mHeaderProvider.getHeader(recyclerview, j);
                        obj = mHeaderPositionCalculator.getHeaderBounds(recyclerview, state, ((View) (obj)), flag);
                        mRenderer.drawHeader(recyclerview, canvas, state, ((Rect) (obj)));
                        mHeaderRects.put(j, obj);
                    }
                }
                i++;
            }
        }
    }
}
