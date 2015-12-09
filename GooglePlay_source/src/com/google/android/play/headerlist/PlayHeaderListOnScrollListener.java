// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.headerlist;

import android.database.DataSetObserver;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Adapter;

// Referenced classes of package com.google.android.play.headerlist:
//            PlayHeaderListLayout

public final class PlayHeaderListOnScrollListener
    implements android.widget.AbsListView.OnScrollListener
{

    private int mAbsoluteY;
    private Adapter mAdapter;
    private final PlayHeaderListLayout mLayout;
    private final DataSetObserver mObserver = new DataSetObserver() {

        final PlayHeaderListOnScrollListener this$0;

        public final void onChanged()
        {
            reset();
            mLayout.mPendingListSync = 2;
        }

        public final void onInvalidated()
        {
            onChanged();
        }

            
            {
                this$0 = PlayHeaderListOnScrollListener.this;
                super();
            }
    };
    private int mPreviousRelativeTopIndex;
    private final SparseIntArray mRelativeTops[] = {
        new SparseIntArray(), new SparseIntArray()
    };
    protected int mScrollState;

    public PlayHeaderListOnScrollListener(PlayHeaderListLayout playheaderlistlayout)
    {
        mAbsoluteY = -1;
        mLayout = playheaderlistlayout;
    }

    private SparseIntArray previousRelativeTops()
    {
        return mRelativeTops[mPreviousRelativeTopIndex];
    }

    private void updateAdapter(Adapter adapter)
    {
        if (mAdapter == adapter)
        {
            return;
        }
        if (mAdapter != null)
        {
            mAdapter.unregisterDataSetObserver(mObserver);
        }
        mAdapter = adapter;
        if (mAdapter != null)
        {
            mAdapter.registerDataSetObserver(mObserver);
        }
        reset(false);
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        int i1 = Math.min(j, k);
        updateAdapter(abslistview.getAdapter());
        boolean flag = false;
        k = -1;
        Object obj = previousRelativeTops();
        SparseIntArray sparseintarray = mRelativeTops[(mPreviousRelativeTopIndex + 1) % 2];
        sparseintarray.clear();
        for (j = i; j < i + i1; j++)
        {
            sparseintarray.put(j, abslistview.getChildAt(j - i).getTop());
        }

        int l = i;
        j = k;
        do
        {
label0:
            {
                k = ((flag) ? 1 : 0);
                if (l < i + i1)
                {
                    j = ((SparseIntArray) (obj)).get(l, -1);
                    if (j == -1)
                    {
                        break label0;
                    }
                    k = j - sparseintarray.get(l);
                }
                mPreviousRelativeTopIndex = (mPreviousRelativeTopIndex + 1) % 2;
                if (mAbsoluteY == -1 || j == -1)
                {
                    mAbsoluteY = mLayout.tryGetCollectionViewAbsoluteY(abslistview);
                } else
                {
                    mAbsoluteY = mAbsoluteY + k;
                }
                obj = mLayout;
                j = mScrollState;
                if (abslistview.getChildCount() == 0)
                {
                    i = 0;
                } else
                {
                    i = mAbsoluteY;
                }
                ((PlayHeaderListLayout) (obj)).onScroll(j, k, i);
                return;
            }
            l++;
        } while (true);
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        updateAdapter(abslistview.getAdapter());
        mScrollState = i;
        mLayout.onScrollStateChanged(i);
    }

    final void reset(boolean flag)
    {
        previousRelativeTops().clear();
        mAbsoluteY = -1;
        if (flag)
        {
            updateAdapter(null);
        }
        mScrollState = 0;
    }


}
