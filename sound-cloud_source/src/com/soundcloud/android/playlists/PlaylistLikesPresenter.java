// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.likes.PlaylistLikeOperations;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.presentation.CollectionBinding;
import com.soundcloud.android.presentation.RecyclerViewPresenter;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.view.EmptyView;
import com.soundcloud.android.view.adapters.PrependItemToListSubscriber;
import com.soundcloud.android.view.adapters.RemoveEntityListSubscriber;
import com.soundcloud.android.view.adapters.UpdateCurrentDownloadSubscriber;
import com.soundcloud.android.view.adapters.UpdateEntityListSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import rx.Y;
import rx.a.b.a;
import rx.g.m;
import rx.h.b;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistItem, PlaylistItemAdapter

public class PlaylistLikesPresenter extends RecyclerViewPresenter
{

    private final PlaylistItemAdapter adapter;
    private final EventBus eventBus;
    private final PlaylistLikeOperations likeOperations;
    private final Navigator navigator;
    private b viewLifeCycle;

    public PlaylistLikesPresenter(SwipeRefreshAttacher swiperefreshattacher, PlaylistLikeOperations playlistlikeoperations, PlaylistItemAdapter playlistitemadapter, EventBus eventbus, Navigator navigator1)
    {
        super(swiperefreshattacher);
        likeOperations = playlistlikeoperations;
        adapter = playlistitemadapter;
        eventBus = eventbus;
        navigator = navigator1;
    }

    protected com.soundcloud.android.view.EmptyView.Status handleError(Throwable throwable)
    {
        return ErrorUtils.emptyViewStatusFromError(throwable);
    }

    protected CollectionBinding onBuildBinding(Bundle bundle)
    {
        return CollectionBinding.from(likeOperations.likedPlaylists(), PlaylistItem.fromPropertySets()).withAdapter(adapter).withPager(likeOperations.pagingFunction()).build();
    }

    public void onCreate(Fragment fragment, Bundle bundle)
    {
        super.onCreate(fragment, bundle);
        getBinding().connect();
    }

    public void onDestroyView(Fragment fragment)
    {
        viewLifeCycle.unsubscribe();
        super.onDestroyView(fragment);
    }

    public void onItemClicked(View view, int i)
    {
        com.soundcloud.android.model.Urn urn = ((PlaylistItem)adapter.getItem(i)).getEntityUrn();
        navigator.openPlaylist(view.getContext(), urn, Screen.PLAYLISTS);
    }

    protected CollectionBinding onRefreshBinding()
    {
        return CollectionBinding.from(likeOperations.updatedLikedPlaylists(), PlaylistItem.fromPropertySets()).withAdapter(adapter).withPager(likeOperations.pagingFunction()).build();
    }

    public void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        super.onViewCreated(fragment, view, bundle);
        getEmptyView().setImage(0x7f020100);
        getEmptyView().setMessageText(0x7f070153);
        viewLifeCycle = new b(new Y[] {
            eventBus.subscribe(EventQueue.ENTITY_STATE_CHANGED, new UpdateEntityListSubscriber(adapter)), likeOperations.onPlaylistLiked().map(PlaylistItem.fromPropertySet()).observeOn(a.a()).subscribe(new PrependItemToListSubscriber(adapter)), likeOperations.onPlaylistUnliked().observeOn(a.a()).subscribe(new RemoveEntityListSubscriber(adapter)), eventBus.queue(EventQueue.CURRENT_DOWNLOAD).observeOn(a.a()).subscribe(new UpdateCurrentDownloadSubscriber(adapter))
        });
    }
}
