// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.soundcloud.android.events.CollectionEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.presentation.CollectionBinding;
import com.soundcloud.android.presentation.RecyclerViewPresenter;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.view.adapters.UpdateCurrentDownloadSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import rx.Y;
import rx.a.b.a;
import rx.b.f;
import rx.h.b;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionsAdapter, CollectionsOptionsStorage, PlaylistsOptions, CollectionsOperations, 
//            CollectionsPlaylistOptionsPresenter, MyCollections

public class CollectionsPresenter extends RecyclerViewPresenter
    implements CollectionsAdapter.Listener, CollectionsPlaylistOptionsPresenter.Listener, OnboardingItemCellRenderer.Listener
{
    private class OnCollectionLoadedAction
        implements rx.b.b
    {

        final CollectionsPresenter this$0;

        public void call(MyCollections mycollections)
        {
            adapter.clear();
            subscribeForUpdates();
            if (mycollections.hasError())
            {
                showError();
            }
        }

        public volatile void call(Object obj)
        {
            call((MyCollections)obj);
        }

        private OnCollectionLoadedAction()
        {
            this$0 = CollectionsPresenter.this;
            super();
        }

        OnCollectionLoadedAction(_cls1 _pcls1)
        {
            this();
        }
    }

    private class OnErrorAction
        implements rx.b.b
    {

        final CollectionsPresenter this$0;

        public volatile void call(Object obj)
        {
            call((Throwable)obj);
        }

        public void call(Throwable throwable)
        {
            showError();
        }

        private OnErrorAction()
        {
            this$0 = CollectionsPresenter.this;
            super();
        }

        OnErrorAction(_cls1 _pcls1)
        {
            this();
        }
    }

    private class RefreshCollectionsSubscriber extends DefaultSubscriber
    {

        final CollectionsPresenter this$0;

        public void onNext(Object obj)
        {
            refreshCollections();
        }

        private RefreshCollectionsSubscriber()
        {
            this$0 = CollectionsPresenter.this;
            super();
        }

        RefreshCollectionsSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private final CollectionsAdapter adapter;
    private final rx.b.b clearOnNext = new _cls3();
    private final CollectionsOperations collectionsOperations;
    private final CollectionsOptionsStorage collectionsOptionsStorage;
    private PlaylistsOptions currentOptions;
    private final EventBus eventBus;
    private b eventSubscriptions;
    private final f isNotRefreshing = new _cls2();
    private final CollectionsPlaylistOptionsPresenter optionsPresenter;
    private final Resources resources;
    private final SwipeRefreshAttacher swipeRefreshAttacher;
    final f toCollectionsItems = new _cls1();

    CollectionsPresenter(SwipeRefreshAttacher swiperefreshattacher, CollectionsOperations collectionsoperations, CollectionsOptionsStorage collectionsoptionsstorage, CollectionsAdapter collectionsadapter, CollectionsPlaylistOptionsPresenter collectionsplaylistoptionspresenter, Resources resources1, EventBus eventbus)
    {
        super(swiperefreshattacher, com.soundcloud.android.presentation.RecyclerViewPresenter.Options.defaults());
        eventSubscriptions = new b();
        swipeRefreshAttacher = swiperefreshattacher;
        collectionsOperations = collectionsoperations;
        collectionsOptionsStorage = collectionsoptionsstorage;
        adapter = collectionsadapter;
        optionsPresenter = collectionsplaylistoptionspresenter;
        resources = resources1;
        eventBus = eventbus;
        collectionsadapter.setListener(this);
        collectionsadapter.setOnboardingListener(this);
        currentOptions = collectionsoptionsstorage.getLastOrDefault();
    }

    private android.support.v7.widget.GridLayoutManager.SpanSizeLookup createSpanSizeLookup(final int spanCount)
    {
        return new _cls4();
    }

    private boolean isCurrentlyFiltered()
    {
        return currentOptions.showLikes() && !currentOptions.showPosts() || !currentOptions.showLikes() && currentOptions.showPosts();
    }

    private void refreshCollections()
    {
        retryWith(CollectionBinding.from(collectionsOperations.collections(currentOptions).observeOn(a.a()).doOnNext(clearOnNext), toCollectionsItems).withAdapter(adapter).build());
    }

    private void removeItem(int i)
    {
        adapter.removeItem(i);
        adapter.notifyItemRemoved(i);
    }

    private void showError()
    {
        Snackbar.make(getRecyclerView(), 0x7f0700e5, 0).show();
    }

    private void subscribeForUpdates()
    {
        eventSubscriptions.unsubscribe();
        eventSubscriptions = new b(new Y[] {
            eventBus.subscribe(EventQueue.CURRENT_DOWNLOAD, new UpdateCurrentDownloadSubscriber(adapter)), collectionsOperations.onCollectionSynced().filter(isNotRefreshing).observeOn(a.a()).subscribe(new RefreshCollectionsSubscriber(null)), collectionsOperations.onCollectionChanged().observeOn(a.a()).subscribe(new RefreshCollectionsSubscriber(null))
        });
    }

    protected com.soundcloud.android.view.EmptyView.Status handleError(Throwable throwable)
    {
        return ErrorUtils.emptyViewStatusFromError(throwable);
    }

    protected CollectionBinding onBuildBinding(Bundle bundle)
    {
        return CollectionBinding.from(collectionsOperations.collections(currentOptions).observeOn(a.a()).doOnNext(new OnCollectionLoadedAction(null)), toCollectionsItems).withAdapter(adapter).build();
    }

    public void onCollectionsOnboardingItemClosed(int i)
    {
        collectionsOptionsStorage.disableOnboarding();
        removeItem(i);
    }

    public void onCreate(Fragment fragment, Bundle bundle)
    {
        super.onCreate(fragment, bundle);
        getBinding().connect();
    }

    public void onDestroyView(Fragment fragment)
    {
        eventSubscriptions.unsubscribe();
        super.onDestroyView(fragment);
    }

    public void onOptionsUpdated(PlaylistsOptions playlistsoptions)
    {
        collectionsOptionsStorage.store(playlistsoptions);
        currentOptions = playlistsoptions;
        refreshCollections();
        eventBus.publish(EventQueue.TRACKING, CollectionEvent.forFilter(currentOptions));
    }

    public void onPlaylistSettingsClicked(View view)
    {
        optionsPresenter.showOptions(view.getContext(), this, currentOptions);
    }

    protected CollectionBinding onRefreshBinding()
    {
        return CollectionBinding.from(collectionsOperations.updatedCollections(currentOptions).observeOn(a.a()).doOnError(new OnErrorAction(null)).doOnNext(clearOnNext), toCollectionsItems).withAdapter(adapter).build();
    }

    public void onRemoveFilterClicked()
    {
        onOptionsUpdated(PlaylistsOptions.builder().build());
        eventBus.publish(EventQueue.TRACKING, CollectionEvent.forClearFilter());
    }

    public void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        super.onViewCreated(fragment, view, bundle);
        fragment = getRecyclerView();
        int i = resources.getInteger(0x7f0a0004);
        view = new GridLayoutManager(view.getContext(), i);
        view.setSpanSizeLookup(createSpanSizeLookup(i));
        fragment.setLayoutManager(view);
    }








    private class _cls1
        implements f
    {

        final CollectionsPresenter this$0;

        public volatile Object call(Object obj)
        {
            return call((MyCollections)obj);
        }

        public List call(MyCollections mycollections)
        {
            List list = mycollections.getPlaylistItems();
            ArrayList arraylist = new ArrayList(list.size() + 4);
            if (collectionsOptionsStorage.isOnboardingEnabled())
            {
                arraylist.add(CollectionsItem.fromOnboarding());
            }
            arraylist.add(CollectionsItem.fromCollectionsPreview(mycollections.getLikes(), mycollections.getRecentStations()));
            arraylist.add(CollectionsItem.fromPlaylistHeader());
            for (mycollections = list.iterator(); mycollections.hasNext(); arraylist.add(CollectionsItem.fromPlaylistItem((PlaylistItem)mycollections.next()))) { }
            if (isCurrentlyFiltered())
            {
                arraylist.add(CollectionsItem.fromKillFilter());
            } else
            if (list.isEmpty())
            {
                arraylist.add(CollectionsItem.fromEmptyPlaylists());
                return arraylist;
            }
            return arraylist;
        }

        _cls1()
        {
            this$0 = CollectionsPresenter.this;
            super();
        }
    }


    private class _cls2
        implements f
    {

        final CollectionsPresenter this$0;

        public Boolean call(SyncResult syncresult)
        {
            boolean flag;
            if (!swipeRefreshAttacher.isRefreshing())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public volatile Object call(Object obj)
        {
            return call((SyncResult)obj);
        }

        _cls2()
        {
            this$0 = CollectionsPresenter.this;
            super();
        }
    }


    private class _cls3
        implements rx.b.b
    {

        final CollectionsPresenter this$0;

        public void call(MyCollections mycollections)
        {
            adapter.clear();
        }

        public volatile void call(Object obj)
        {
            call((MyCollections)obj);
        }

        _cls3()
        {
            this$0 = CollectionsPresenter.this;
            super();
        }
    }


    private class _cls4 extends android.support.v7.widget.GridLayoutManager.SpanSizeLookup
    {

        final CollectionsPresenter this$0;
        final int val$spanCount;

        public int getSpanSize(int i)
        {
            if (((CollectionsItem)adapter.getItem(i)).isPlaylistItem())
            {
                return 1;
            } else
            {
                return spanCount;
            }
        }

        _cls4()
        {
            this$0 = CollectionsPresenter.this;
            spanCount = i;
            super();
        }
    }

}
