// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.widget.AbsListView;
import com.soundcloud.android.presentation.PagingListItemAdapter;
import rx.a.a;

// Referenced classes of package com.soundcloud.android.view:
//            ListViewController

private static class listenerDelegate
    implements android.widget.rollListener
{

    private final PagingListItemAdapter adapter;
    private final android.widget.er listenerDelegate;
    private final a pager;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        listenerDelegate.listenerDelegate(abslistview, i, j, k);
        if (k > 0 && k - j * 2 <= i)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0 && adapter.isIdle() && pager.hasNext())
        {
            adapter.setLoading();
            pager.next();
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        listenerDelegate.teChanged(abslistview, i);
    }

    I(a a1, PagingListItemAdapter paginglistitemadapter, android.widget.er er)
    {
        pager = a1;
        adapter = paginglistitemadapter;
        listenerDelegate = er;
    }
}
