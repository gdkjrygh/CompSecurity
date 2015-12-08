// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.presentation.PagingListItemAdapter;
import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;
import rx.a.a;
import rx.b;
import rx.b.f;
import rx.internal.util.q;

// Referenced classes of package com.soundcloud.android.view:
//            EmptyViewController, ReactiveListComponent, EmptyView

public class ListViewController extends DefaultSupportFragmentLightCycle
{
    private static class PagingScrollListener
        implements android.widget.AbsListView.OnScrollListener
    {

        private final PagingListItemAdapter adapter;
        private final android.widget.AbsListView.OnScrollListener listenerDelegate;
        private final a pager;

        public void onScroll(AbsListView abslistview, int i, int j, int k)
        {
            listenerDelegate.onScroll(abslistview, i, j, k);
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
            listenerDelegate.onScrollStateChanged(abslistview, i);
        }

        PagingScrollListener(a a1, PagingListItemAdapter paginglistitemadapter, android.widget.AbsListView.OnScrollListener onscrolllistener)
        {
            pager = a1;
            adapter = paginglistitemadapter;
            listenerDelegate = onscrolllistener;
        }
    }


    private AbsListView absListView;
    private ListAdapter adapter;
    private final EmptyViewController emptyViewController;
    private final ImageOperations imageOperations;
    private a pager;
    private android.widget.AbsListView.OnScrollListener scrollListener;

    public ListViewController(EmptyViewController emptyviewcontroller, ImageOperations imageoperations)
    {
        emptyViewController = emptyviewcontroller;
        imageOperations = imageoperations;
    }

    public void connect(ReactiveListComponent reactivelistcomponent, b b)
    {
        emptyViewController.connect(b);
        absListView.setOnItemClickListener(reactivelistcomponent);
    }

    public EmptyView getEmptyView()
    {
        return emptyViewController.getEmptyView();
    }

    AbsListView getListView()
    {
        return absListView;
    }

    public void onDestroyView(Fragment fragment)
    {
        emptyViewController.onDestroyView(fragment);
        absListView.setAdapter(null);
        absListView = null;
    }

    public void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        Preconditions.checkNotNull(adapter, "You must set an adapter before calling onViewCreated");
        emptyViewController.onViewCreated(fragment, view, bundle);
        absListView = (AbsListView)view.findViewById(0x102000a);
        absListView.setEmptyView(emptyViewController.getEmptyView());
        if (scrollListener == null)
        {
            scrollListener = imageOperations.createScrollPauseListener(false, true);
        } else
        {
            scrollListener = imageOperations.createScrollPauseListener(false, true, scrollListener);
        }
        if (pager != null)
        {
            scrollListener = new PagingScrollListener(pager, (PagingListItemAdapter)adapter, scrollListener);
        }
        absListView.setOnScrollListener(scrollListener);
        absListView.setAdapter(adapter);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        adapter = listadapter;
    }

    public void setAdapter(PagingListItemAdapter paginglistitemadapter, a a)
    {
        setAdapter(paginglistitemadapter, a, q.b());
    }

    public void setAdapter(final PagingListItemAdapter adapter, final a pager, final f itemMapper)
    {
        this.adapter = adapter;
        this.pager = pager;
        adapter.setOnErrorRetryListener(new _cls1());
    }

    public void setScrollListener(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        scrollListener = onscrolllistener;
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final ListViewController this$0;
        final PagingListItemAdapter val$adapter;
        final f val$itemMapper;
        final a val$pager;

        public void onClick(View view)
        {
            adapter.setLoading();
            pager.currentPage().map(itemMapper).observeOn(rx.a.b.a.a()).subscribe(adapter);
        }

        _cls1()
        {
            this$0 = ListViewController.this;
            adapter = paginglistitemadapter;
            pager = a1;
            itemMapper = f;
            super();
        }
    }

}
