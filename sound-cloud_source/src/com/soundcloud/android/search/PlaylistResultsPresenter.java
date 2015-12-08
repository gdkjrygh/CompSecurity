// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.events.SearchEvent;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.playlists.PlaylistItem;
import com.soundcloud.android.presentation.CollectionBinding;
import com.soundcloud.android.presentation.RecyclerViewPresenter;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.view.EmptyViewBuilder;
import com.soundcloud.android.view.adapters.RecyclerViewParallaxer;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistDiscoveryOperations, PlaylistResultsAdapter

class PlaylistResultsPresenter extends RecyclerViewPresenter
{

    private final PlaylistResultsAdapter adapter;
    private final EventBus eventBus;
    private final Navigator navigator;
    private final PlaylistDiscoveryOperations operations;
    private final RecyclerViewParallaxer parallaxer;

    PlaylistResultsPresenter(PlaylistDiscoveryOperations playlistdiscoveryoperations, PlaylistResultsAdapter playlistresultsadapter, SwipeRefreshAttacher swiperefreshattacher, RecyclerViewParallaxer recyclerviewparallaxer, Navigator navigator1, EventBus eventbus)
    {
        super(swiperefreshattacher, com.soundcloud.android.presentation.RecyclerViewPresenter.Options.grid(0x7f0a0005).build());
        operations = playlistdiscoveryoperations;
        adapter = playlistresultsadapter;
        parallaxer = recyclerviewparallaxer;
        navigator = navigator1;
        eventBus = eventbus;
    }

    protected com.soundcloud.android.view.EmptyView.Status handleError(Throwable throwable)
    {
        return ErrorUtils.emptyViewStatusFromError(throwable);
    }

    protected CollectionBinding onBuildBinding(Bundle bundle)
    {
        bundle = bundle.getString("playlist_tag");
        return CollectionBinding.from(operations.playlistsForTag(bundle), PlaylistItem.fromApiPlaylists()).withAdapter(adapter).withPager(operations.pager(bundle)).build();
    }

    public void onCreate(Fragment fragment, Bundle bundle)
    {
        super.onCreate(fragment, bundle);
        eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.SEARCH_PLAYLIST_DISCO));
        getBinding().connect();
    }

    protected void onCreateCollectionView(Fragment fragment, View view, Bundle bundle)
    {
        super.onCreateCollectionView(fragment, view, bundle);
        (new EmptyViewBuilder()).configureForSearch(getEmptyView());
        getRecyclerView().addOnScrollListener(parallaxer);
    }

    protected void onItemClicked(View view, int i)
    {
        PlaylistItem playlistitem = (PlaylistItem)adapter.getItem(i);
        navigator.openPlaylist(view.getContext(), playlistitem.getEntityUrn(), Screen.SEARCH_PLAYLIST_DISCO);
        eventBus.publish(EventQueue.TRACKING, SearchEvent.tapPlaylistOnScreen(Screen.SEARCH_PLAYLIST_DISCO));
    }
}
