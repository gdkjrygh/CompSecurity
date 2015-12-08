// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.soundcloud.android.view.EmptyView;
import com.soundcloud.java.checks.Preconditions;

// Referenced classes of package com.soundcloud.android.presentation:
//            CollectionViewPresenter, PagedCollectionBinding, PagingRecyclerScrollListener, PagingAwareAdapter, 
//            CollectionBinding, RecyclerItemAdapter, DividerItemDecoration, ItemAdapter, 
//            SwipeRefreshAttacher

public abstract class RecyclerViewPresenter extends CollectionViewPresenter
{
    public static class Options
    {

        private final Class layoutManagerClass;
        private final int numColumns;
        private final boolean useDividers;
        private final boolean useItemClickListener;

        public static Builder custom()
        {
            return new Builder();
        }

        public static Options defaults()
        {
            return (new Builder()).build();
        }

        public static Builder grid(int i)
        {
            return (new Builder()).withLayoutManager(android/support/v7/widget/GridLayoutManager).columns(i).useDividers().useItemClickListener();
        }

        public static Builder list()
        {
            return (new Builder()).withLayoutManager(android/support/v7/widget/LinearLayoutManager).useDividers().useItemClickListener();
        }





        private Options(boolean flag, boolean flag1, Class class1, int i)
        {
            useDividers = flag;
            useItemClickListener = flag1;
            layoutManagerClass = class1;
            numColumns = i;
        }

        Options(boolean flag, boolean flag1, Class class1, int i, _cls1 _pcls1)
        {
            this(flag, flag1, class1, i);
        }
    }

    public static class Options.Builder
    {

        private Class layoutManagerClass;
        private int numColumns;
        private boolean useDividers;
        private boolean useItemClickListener;

        private Options.Builder withLayoutManager(Class class1)
        {
            layoutManagerClass = class1;
            return this;
        }

        public Options build()
        {
            return new Options(useDividers, useItemClickListener, layoutManagerClass, numColumns, null);
        }

        public Options.Builder columns(int i)
        {
            numColumns = i;
            return this;
        }

        public Options.Builder useDividers()
        {
            useDividers = true;
            return this;
        }

        public Options.Builder useItemClickListener()
        {
            useItemClickListener = true;
            return this;
        }


        public Options.Builder()
        {
        }
    }


    private android.support.v7.widget.RecyclerView.AdapterDataObserver emptyViewObserver;
    private final Options options;
    private RecyclerView recyclerView;

    public RecyclerViewPresenter(SwipeRefreshAttacher swiperefreshattacher)
    {
        this(swiperefreshattacher, Options.list().build());
    }

    public RecyclerViewPresenter(SwipeRefreshAttacher swiperefreshattacher, Options options1)
    {
        super(swiperefreshattacher);
        options = options1;
    }

    private void configurePagedListAdapter(final PagedCollectionBinding binding)
    {
        final PagingAwareAdapter adapter = binding.adapter();
        recyclerView.addOnScrollListener(new PagingRecyclerScrollListener(this, adapter, (LinearLayoutManager)recyclerView.getLayoutManager()));
        adapter.setOnErrorRetryListener(new _cls2());
    }

    private android.support.v7.widget.RecyclerView.AdapterDataObserver createEmptyViewObserver()
    {
        return new _cls3();
    }

    private RecyclerItemAdapter setupAdapter(CollectionBinding collectionbinding)
    {
        Preconditions.checkArgument(collectionbinding.adapter() instanceof RecyclerItemAdapter, (new StringBuilder("Adapter must be an ")).append(com/soundcloud/android/presentation/RecyclerItemAdapter).toString());
        RecyclerItemAdapter recycleritemadapter = (RecyclerItemAdapter)collectionbinding.adapter();
        recyclerView.setAdapter(recycleritemadapter);
        if (options.useItemClickListener)
        {
            setupDefaultClickListener(recycleritemadapter);
        }
        if (collectionbinding instanceof PagedCollectionBinding)
        {
            Preconditions.checkArgument(recyclerView.getLayoutManager() instanceof LinearLayoutManager, "Paged bindings currently only support LinearLayoutManager");
            configurePagedListAdapter((PagedCollectionBinding)collectionbinding);
        }
        return recycleritemadapter;
    }

    private void setupDefaultClickListener(final RecyclerItemAdapter adapter)
    {
        adapter.setOnItemClickListener(new _cls1());
    }

    private void setupDividers(View view)
    {
        android.graphics.drawable.Drawable drawable = view.getResources().getDrawable(com.soundcloud.androidkit.R.drawable.ak_list_divider_item);
        int i = view.getResources().getDimensionPixelSize(com.soundcloud.androidkit.R.dimen.ak_list_divider_horizontal_height);
        recyclerView.addItemDecoration(new DividerItemDecoration(drawable, i));
    }

    private void setupEmptyView(RecyclerItemAdapter recycleritemadapter)
    {
        emptyViewObserver = createEmptyViewObserver();
        recycleritemadapter.registerAdapterDataObserver(emptyViewObserver);
        updateEmptyViewVisibility();
    }

    private void setupRecyclerView(Fragment fragment, View view)
    {
        recyclerView = (RecyclerView)view.findViewById(com.soundcloud.androidkit.R.id.ak_recycler_view);
        if (recyclerView == null)
        {
            throw new IllegalStateException("Expected to find RecyclerView with ID R.id.recycler_view");
        }
        if (options.layoutManagerClass == android/support/v7/widget/GridLayoutManager)
        {
            view = view.getResources();
            recyclerView.setLayoutManager(new GridLayoutManager(fragment.getActivity(), view.getInteger(options.numColumns)));
            return;
        } else
        {
            recyclerView.setLayoutManager(new LinearLayoutManager(fragment.getActivity()));
            return;
        }
    }

    private void updateEmptyViewVisibility()
    {
        boolean flag = false;
        boolean flag1 = getBinding().adapter().isEmpty();
        Object obj = getRecyclerView();
        int i;
        if (flag1)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((RecyclerView) (obj)).setVisibility(i);
        obj = getEmptyView();
        if (flag1)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((EmptyView) (obj)).setVisibility(i);
    }

    public volatile EmptyView getEmptyView()
    {
        return super.getEmptyView();
    }

    public RecyclerView getRecyclerView()
    {
        return recyclerView;
    }

    public volatile void onCreate(Fragment fragment, Bundle bundle)
    {
        super.onCreate(fragment, bundle);
    }

    public void onCreateCollectionView(Fragment fragment, View view, Bundle bundle)
    {
        bundle = getBinding();
        setupRecyclerView(fragment, view);
        if (options.useDividers)
        {
            setupDividers(view);
        }
        setupEmptyView(setupAdapter(bundle));
    }

    public volatile void onDestroy(Fragment fragment)
    {
        super.onDestroy(fragment);
    }

    public void onDestroyView(Fragment fragment)
    {
        recyclerView.clearOnScrollListeners();
        recyclerView.getAdapter().unregisterAdapterDataObserver(emptyViewObserver);
        recyclerView.setAdapter(null);
        recyclerView = null;
        super.onDestroyView(fragment);
    }

    public volatile void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        super.onViewCreated(fragment, view, bundle);
    }

    public void scrollToTop()
    {
        recyclerView.smoothScrollToPosition(0);
    }



    private class _cls2
        implements android.view.View.OnClickListener
    {

        final RecyclerViewPresenter this$0;
        final PagingAwareAdapter val$adapter;
        final PagedCollectionBinding val$binding;

        public void onClick(View view)
        {
            adapter.setLoading();
            retryWith(binding.fromCurrentPage());
        }

        _cls2()
        {
            this$0 = RecyclerViewPresenter.this;
            adapter = pagingawareadapter;
            binding = pagedcollectionbinding;
            super();
        }
    }


    private class _cls3 extends android.support.v7.widget.RecyclerView.AdapterDataObserver
    {

        final RecyclerViewPresenter this$0;

        public void onChanged()
        {
            updateEmptyViewVisibility();
        }

        public void onItemRangeInserted(int i, int j)
        {
            updateEmptyViewVisibility();
        }

        public void onItemRangeRemoved(int i, int j)
        {
            updateEmptyViewVisibility();
        }

        _cls3()
        {
            this$0 = RecyclerViewPresenter.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final RecyclerViewPresenter this$0;
        final RecyclerItemAdapter val$adapter;

        public void onClick(View view)
        {
            int i = recyclerView.getChildAdapterPosition(view);
            if (i >= 0 && i < adapter.getItemCount())
            {
                onItemClicked(view, i);
                return;
            } else
            {
                new IllegalArgumentException((new StringBuilder("Invalid recycler position in click handler ")).append(i).toString());
                return;
            }
        }

        _cls1()
        {
            this$0 = RecyclerViewPresenter.this;
            adapter = recycleritemadapter;
            super();
        }
    }

}
