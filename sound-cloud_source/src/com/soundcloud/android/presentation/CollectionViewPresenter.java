// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.soundcloud.android.view.EmptyView;
import com.soundcloud.android.view.MultiSwipeRefreshLayout;
import com.soundcloud.lightcycle.LightCycleBinder;
import com.soundcloud.lightcycle.SupportFragmentLightCycleDispatcher;
import rx.X;
import rx.b;

// Referenced classes of package com.soundcloud.android.presentation:
//            CollectionBinding, SwipeRefreshAttacher, RefreshableScreen, ItemAdapter

public abstract class CollectionViewPresenter extends SupportFragmentLightCycleDispatcher
{
    private final class EmptyViewSubscriber extends X
    {

        final CollectionViewPresenter this$0;

        public final void onCompleted()
        {
            updateEmptyViewStatus(com.soundcloud.android.view.EmptyView.Status.OK);
        }

        public final void onError(Throwable throwable)
        {
            throwable.printStackTrace();
            updateEmptyViewStatus(handleError(throwable));
        }

        public final void onNext(Object obj)
        {
            updateEmptyViewStatus(com.soundcloud.android.view.EmptyView.Status.OK);
        }

        private EmptyViewSubscriber()
        {
            this$0 = CollectionViewPresenter.this;
            super();
        }

        EmptyViewSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class RefreshListener
        implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
    {

        final CollectionViewPresenter this$0;

        public void onRefresh()
        {
            refreshBinding = onRefreshBinding();
            refreshBinding.items().subscribe(new RefreshSubscriber(null));
            refreshBinding.connect();
        }

        private RefreshListener()
        {
            this$0 = CollectionViewPresenter.this;
            super();
        }

        RefreshListener(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class RefreshSubscriber extends X
    {

        final CollectionViewPresenter this$0;

        public final void onCompleted()
        {
        }

        public final void onError(Throwable throwable)
        {
            throwable.printStackTrace();
            swipeRefreshAttacher.setRefreshing(false);
            refreshBinding = null;
        }

        public final void onNext(Iterable iterable)
        {
            collectionBinding.adapter().clear();
            resetBindingTo(refreshBinding);
            refreshBinding = null;
            subscribeBinding();
            swipeRefreshAttacher.setRefreshing(false);
            unsubscribe();
        }

        public final volatile void onNext(Object obj)
        {
            onNext((Iterable)obj);
        }

        private RefreshSubscriber()
        {
            this$0 = CollectionViewPresenter.this;
            super();
        }

        RefreshSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final String TAG = "CollectionViewPresenter";
    private CollectionBinding collectionBinding;
    private EmptyView emptyView;
    private com.soundcloud.android.view.EmptyView.Status emptyViewStatus;
    private Bundle fragmentArgs;
    private CollectionBinding refreshBinding;
    private final SwipeRefreshAttacher swipeRefreshAttacher;
    private rx.h.b viewLifeCycle;

    protected CollectionViewPresenter(SwipeRefreshAttacher swiperefreshattacher)
    {
        emptyViewStatus = com.soundcloud.android.view.EmptyView.Status.WAITING;
        swipeRefreshAttacher = swiperefreshattacher;
    }

    private void resetBindingTo(CollectionBinding collectionbinding)
    {
        collectionBinding = collectionbinding;
        collectionBinding.items().subscribe(collectionbinding.adapter());
    }

    private void setupEmptyView(View view)
    {
        emptyView = (EmptyView)view.findViewById(0x1020004);
        emptyView.setStatus(emptyViewStatus);
    }

    private void subscribeBinding()
    {
        if (viewLifeCycle != null)
        {
            viewLifeCycle.unsubscribe();
        }
        viewLifeCycle = new rx.h.b();
        viewLifeCycle.a(collectionBinding.items().subscribe(new EmptyViewSubscriber(null)));
        onSubscribeBinding(collectionBinding, viewLifeCycle);
    }

    private void updateEmptyViewStatus(com.soundcloud.android.view.EmptyView.Status status)
    {
        emptyViewStatus = status;
        emptyView.setStatus(status);
    }

    protected transient void attachSwipeToRefresh(MultiSwipeRefreshLayout multiswiperefreshlayout, View aview[])
    {
        swipeRefreshAttacher.attach(new RefreshListener(null), multiswiperefreshlayout, aview);
        if (refreshBinding != null)
        {
            swipeRefreshAttacher.setRefreshing(true);
        }
    }

    protected void detachSwipeToRefresh()
    {
        swipeRefreshAttacher.setRefreshing(false);
        swipeRefreshAttacher.detach();
    }

    public CollectionBinding getBinding()
    {
        return collectionBinding;
    }

    public EmptyView getEmptyView()
    {
        return emptyView;
    }

    public abstract com.soundcloud.android.view.EmptyView.Status handleError(Throwable throwable);

    public abstract CollectionBinding onBuildBinding(Bundle bundle);

    public void onCreate(Fragment fragment, Bundle bundle)
    {
        LightCycleBinder.bind(this);
        super.onCreate(fragment, bundle);
        fragmentArgs = fragment.getArguments();
        rebuildBinding(fragmentArgs);
    }

    public abstract void onCreateCollectionView(Fragment fragment, View view, Bundle bundle);

    public void onDestroy(Fragment fragment)
    {
        collectionBinding.disconnect();
        super.onDestroy(fragment);
    }

    public void onDestroyView(Fragment fragment)
    {
        viewLifeCycle.unsubscribe();
        detachSwipeToRefresh();
        super.onDestroyView(fragment);
    }

    public void onItemClicked(View view, int i)
    {
    }

    public CollectionBinding onRefreshBinding()
    {
        return onBuildBinding(fragmentArgs);
    }

    public void onSubscribeBinding(CollectionBinding collectionbinding, rx.h.b b1)
    {
    }

    public void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        super.onViewCreated(fragment, view, bundle);
        setupEmptyView(view);
        onCreateCollectionView(fragment, view, bundle);
        if (fragment instanceof RefreshableScreen)
        {
            fragment = (RefreshableScreen)fragment;
            attachSwipeToRefresh(fragment.getRefreshLayout(), fragment.getRefreshableViews());
        }
        subscribeBinding();
    }

    protected CollectionBinding rebuildBinding(Bundle bundle)
    {
        resetBindingTo(onBuildBinding(bundle));
        return collectionBinding;
    }

    public void retryWith(CollectionBinding collectionbinding)
    {
        resetBindingTo(collectionbinding);
        subscribeBinding();
        collectionbinding.connect();
    }




/*
    static CollectionBinding access$302(CollectionViewPresenter collectionviewpresenter, CollectionBinding collectionbinding)
    {
        collectionviewpresenter.refreshBinding = collectionbinding;
        return collectionbinding;
    }

*/




}
