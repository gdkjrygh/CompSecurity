// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.timehop.stickyheadersrecyclerview.caching;

import android.support.v4.util.LongSparseArray;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;
import com.timehop.stickyheadersrecyclerview.util.OrientationProvider;

// Referenced classes of package com.timehop.stickyheadersrecyclerview.caching:
//            HeaderProvider

public class HeaderViewCache
    implements HeaderProvider
{

    private final StickyRecyclerHeadersAdapter mAdapter;
    private final LongSparseArray mHeaderViews = new LongSparseArray();
    private final OrientationProvider mOrientationProvider;

    public HeaderViewCache(StickyRecyclerHeadersAdapter stickyrecyclerheadersadapter, OrientationProvider orientationprovider)
    {
        mAdapter = stickyrecyclerheadersadapter;
        mOrientationProvider = orientationprovider;
    }

    public View getHeader(RecyclerView recyclerview, int i)
    {
        long l = mAdapter.getHeaderId(i);
        View view = (View)mHeaderViews.get(l);
        Object obj = view;
        if (view == null)
        {
            obj = mAdapter.onCreateHeaderViewHolder(recyclerview);
            mAdapter.onBindHeaderViewHolder(((android.support.v7.widget.RecyclerView.ViewHolder) (obj)), i);
            obj = ((android.support.v7.widget.RecyclerView.ViewHolder) (obj)).itemView;
            if (((View) (obj)).getLayoutParams() == null)
            {
                ((View) (obj)).setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            int j;
            if (mOrientationProvider.getOrientation(recyclerview) == 1)
            {
                j = android.view.View.MeasureSpec.makeMeasureSpec(recyclerview.getWidth(), 0x40000000);
                i = android.view.View.MeasureSpec.makeMeasureSpec(recyclerview.getHeight(), 0);
            } else
            {
                j = android.view.View.MeasureSpec.makeMeasureSpec(recyclerview.getWidth(), 0);
                i = android.view.View.MeasureSpec.makeMeasureSpec(recyclerview.getHeight(), 0x40000000);
            }
            ((View) (obj)).measure(ViewGroup.getChildMeasureSpec(j, recyclerview.getPaddingLeft() + recyclerview.getPaddingRight(), ((View) (obj)).getLayoutParams().width), ViewGroup.getChildMeasureSpec(i, recyclerview.getPaddingTop() + recyclerview.getPaddingBottom(), ((View) (obj)).getLayoutParams().height));
            ((View) (obj)).layout(0, 0, ((View) (obj)).getMeasuredWidth(), ((View) (obj)).getMeasuredHeight());
            mHeaderViews.put(l, obj);
        }
        return ((View) (obj));
    }

    public void invalidate()
    {
        mHeaderViews.clear();
    }
}
