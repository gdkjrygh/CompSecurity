// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.soundcloud.rx.Pager;

// Referenced classes of package com.soundcloud.android.presentation:
//            CollectionViewPresenter, PagedCollectionBinding, PagingAwareAdapter

final class PagingRecyclerScrollListener extends android.support.v7.widget.RecyclerView.OnScrollListener
{

    private final PagingAwareAdapter adapter;
    private final LinearLayoutManager layoutManager;
    private final CollectionViewPresenter presenter;

    PagingRecyclerScrollListener(CollectionViewPresenter collectionviewpresenter, PagingAwareAdapter pagingawareadapter, LinearLayoutManager linearlayoutmanager)
    {
        presenter = collectionviewpresenter;
        adapter = pagingawareadapter;
        layoutManager = linearlayoutmanager;
    }

    private void onScroll(int i, int j, int k)
    {
        Pager pager;
        if (k > 0 && k - j * 2 <= i)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        pager = ((PagedCollectionBinding)presenter.getBinding()).pager();
        if (i != 0 && adapter.isIdle() && pager.hasNext())
        {
            adapter.setLoading();
            pager.next();
        }
    }

    public final void onScrolled(RecyclerView recyclerview, int i, int j)
    {
        onScroll(layoutManager.findFirstVisibleItemPosition(), layoutManager.getChildCount(), layoutManager.getItemCount());
    }
}
