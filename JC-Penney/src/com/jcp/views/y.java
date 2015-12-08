// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.widget.AbsListView;

// Referenced classes of package com.jcp.views:
//            PagingListView, z

class y
    implements android.widget.AbsListView.OnScrollListener
{

    final PagingListView a;

    y(PagingListView paginglistview)
    {
        a = paginglistview;
        super();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (PagingListView.a(a) != null)
        {
            PagingListView.a(a).onScroll(abslistview, i, j, k);
        }
        if (!PagingListView.b(a) && PagingListView.c(a) && i + j == k && PagingListView.d(a) != null)
        {
            PagingListView.a(a, true);
            PagingListView.d(a).a();
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (PagingListView.a(a) != null)
        {
            PagingListView.a(a).onScrollStateChanged(abslistview, i);
        }
    }
}
