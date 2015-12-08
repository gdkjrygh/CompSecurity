// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.presentation.CollectionBinding;
import com.soundcloud.android.presentation.RecyclerViewPresenter;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.view.EmptyView;
import com.soundcloud.android.view.adapters.UpdateCurrentDownloadSubscriber;
import com.soundcloud.android.view.adapters.UpdateEntityListSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import rx.Y;
import rx.h.b;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistPostOperations, PlaylistItem, PlaylistItemAdapter

public class PlaylistPostsPresenter extends RecyclerViewPresenter
{

    private final PlaylistItemAdapter adapter;
    private final EventBus eventBus;
    private Y eventSubscriptions;
    private final Navigator navigator;
    private final PlaylistPostOperations playlistPostOperations;

    PlaylistPostsPresenter(PlaylistItemAdapter playlistitemadapter, PlaylistPostOperations playlistpostoperations, SwipeRefreshAttacher swiperefreshattacher, Navigator navigator1, EventBus eventbus)
    {
        super(swiperefreshattacher);
        eventSubscriptions = RxUtils.invalidSubscription();
        adapter = playlistitemadapter;
        playlistPostOperations = playlistpostoperations;
        navigator = navigator1;
        eventBus = eventbus;
    }

    protected com.soundcloud.android.view.EmptyView.Status handleError(Throwable throwable)
    {
        return ErrorUtils.emptyViewStatusFromError(throwable);
    }

    protected CollectionBinding onBuildBinding(Bundle bundle)
    {
        return CollectionBinding.from(playlistPostOperations.postedPlaylists(), PlaylistItem.fromPropertySets()).withAdapter(adapter).withPager(playlistPostOperations.pagingFunction()).build();
    }

    public void onCreate(Fragment fragment, Bundle bundle)
    {
        super.onCreate(fragment, bundle);
        getBinding().connect();
    }

    public void onDestroyView(Fragment fragment)
    {
        eventSubscriptions.unsubscribe();
    }

    public void onItemClicked(View view, int i)
    {
        com.soundcloud.android.model.Urn urn = ((PlaylistItem)adapter.getItem(i)).getEntityUrn();
        navigator.openPlaylist(view.getContext(), urn, Screen.PLAYLISTS);
    }

    protected CollectionBinding onRefreshBinding()
    {
        return CollectionBinding.from(playlistPostOperations.updatedPostedPlaylists(), PlaylistItem.fromPropertySets()).withAdapter(adapter).withPager(playlistPostOperations.pagingFunction()).build();
    }

    public void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        super.onViewCreated(fragment, view, bundle);
        getEmptyView().setImage(0x7f020101);
        getEmptyView().setMessageText(0x7f07015d);
        eventSubscriptions = new b(new Y[] {
            eventBus.subscribe(EventQueue.ENTITY_STATE_CHANGED, new UpdateEntityListSubscriber(adapter)), eventBus.subscribe(EventQueue.CURRENT_DOWNLOAD, new UpdateCurrentDownloadSubscriber(adapter))
        });
    }
}
