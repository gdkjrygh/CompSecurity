// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.widget.AbsListView;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            PaginatedAdapter

public class PaginationScrollListener
    implements android.widget.AbsListView.OnScrollListener
{

    private final PaginatedAdapter adapter;

    public PaginationScrollListener(PaginatedAdapter paginatedadapter)
    {
        adapter = paginatedadapter;
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (i + j >= k)
        {
            adapter.loadMore();
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }
}
