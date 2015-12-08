// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.headerlist;

import android.support.v7.widget.RecyclerView;

// Referenced classes of package com.google.android.play.headerlist:
//            PlayHeaderListLayout

public final class PlayHeaderListRecyclerViewListener extends android.support.v7.widget.RecyclerView.OnScrollListener
{

    private int mAbsoluteY;
    private android.support.v7.widget.RecyclerView.Adapter mAdapter;
    final PlayHeaderListLayout mLayout;
    private final android.support.v7.widget.RecyclerView.AdapterDataObserver mObserver = new android.support.v7.widget.RecyclerView.AdapterDataObserver() {

        final PlayHeaderListRecyclerViewListener this$0;

        public final void onChanged()
        {
            reset();
            mLayout.mPendingListSync = 2;
        }

        public final void onItemRangeChanged(int i, int j)
        {
            onChanged();
        }

        public final void onItemRangeInserted(int i, int j)
        {
            onChanged();
        }

        public final void onItemRangeRemoved(int i, int j)
        {
            onChanged();
        }

            
            {
                this$0 = PlayHeaderListRecyclerViewListener.this;
                super();
            }
    };
    protected int mScrollState;

    public PlayHeaderListRecyclerViewListener(PlayHeaderListLayout playheaderlistlayout)
    {
        mAbsoluteY = -1;
        mLayout = playheaderlistlayout;
    }

    private void updateAdapter(android.support.v7.widget.RecyclerView.Adapter adapter)
    {
        if (mAdapter == adapter)
        {
            return;
        }
        if (mAdapter != null)
        {
            mAdapter.unregisterAdapterDataObserver(mObserver);
        }
        mAdapter = adapter;
        if (mAdapter != null)
        {
            mAdapter.registerAdapterDataObserver(mObserver);
        }
        reset(false);
    }

    public final void onScrollStateChanged(RecyclerView recyclerview, int i)
    {
        updateAdapter(recyclerview.mAdapter);
        mScrollState = i;
        mLayout.onScrollStateChanged(i);
        if (mLayout.mAppRecyclerViewOnScrollListener != null)
        {
            mLayout.mAppRecyclerViewOnScrollListener.onScrollStateChanged(recyclerview, i);
        }
    }

    public final void onScrolled(RecyclerView recyclerview, int i, int j)
    {
        updateAdapter(recyclerview.mAdapter);
        int k = mLayout.tryGetCollectionViewAbsoluteY(recyclerview);
        PlayHeaderListLayout playheaderlistlayout;
        int l;
        if (k == -1)
        {
            if (j == 0)
            {
                mAbsoluteY = -1;
            } else
            if (mAbsoluteY != -1)
            {
                mAbsoluteY = mAbsoluteY + j;
            }
        } else
        {
            mAbsoluteY = k;
        }
        playheaderlistlayout = mLayout;
        l = mScrollState;
        if (recyclerview.getChildCount() == 0)
        {
            k = 0;
        } else
        {
            k = mAbsoluteY;
        }
        playheaderlistlayout.onScroll(l, j, k);
        if (mLayout.mAppRecyclerViewOnScrollListener != null)
        {
            mLayout.mAppRecyclerViewOnScrollListener.onScrolled(recyclerview, i, j);
        }
    }

    final void reset(boolean flag)
    {
        mAbsoluteY = -1;
        if (flag)
        {
            updateAdapter(null);
        }
        mScrollState = 0;
    }

}
