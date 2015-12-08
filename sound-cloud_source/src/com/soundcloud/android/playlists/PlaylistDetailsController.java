// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.soundcloud.android.analytics.PromotedSourceInfo;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.ListItemAdapter;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.EmptyViewAware;
import com.soundcloud.android.tracks.LegacyUpdatePlayingTrackSubscriber;
import com.soundcloud.android.tracks.PlaylistTrackItemRenderer;
import com.soundcloud.android.tracks.TrackItem;
import com.soundcloud.android.util.AnimUtils;
import com.soundcloud.android.view.adapters.UpdateCurrentDownloadSubscriber;
import com.soundcloud.android.view.adapters.UpdateEntityListSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.Iterator;
import java.util.List;
import rx.Y;
import rx.h.b;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistWithTracks

abstract class PlaylistDetailsController
    implements EmptyViewAware, com.soundcloud.android.tracks.TrackItemMenuPresenter.RemoveTrackListener
{
    static interface Listener
    {

        public abstract void onPlaylistContentChanged();
    }

    public static class Provider
    {

        private final javax.inject.Provider injectionProvider;

        public PlaylistDetailsController create()
        {
            return (PlaylistDetailsController)injectionProvider.get();
        }

        Provider(javax.inject.Provider provider)
        {
            injectionProvider = provider;
        }
    }


    private final ListItemAdapter adapter;
    private final EventBus eventBus;
    private Y eventSubscriptions;
    protected ListView listView;
    private Listener listener;
    private Urn playlistUrn;
    private final PlaylistTrackItemRenderer trackRenderer;

    protected PlaylistDetailsController(PlaylistTrackItemRenderer playlisttrackitemrenderer, ListItemAdapter listitemadapter, EventBus eventbus)
    {
        eventSubscriptions = RxUtils.invalidSubscription();
        playlistUrn = Urn.NOT_SET;
        trackRenderer = playlisttrackitemrenderer;
        adapter = listitemadapter;
        eventBus = eventbus;
        playlisttrackitemrenderer.setRemoveTrackListener(this);
    }

    private void subscribeToContentUpdate()
    {
        eventSubscriptions = new b(new Y[] {
            eventBus.subscribe(EventQueue.CURRENT_PLAY_QUEUE_ITEM, new LegacyUpdatePlayingTrackSubscriber(adapter, trackRenderer)), eventBus.subscribe(EventQueue.CURRENT_DOWNLOAD, new UpdateCurrentDownloadSubscriber(adapter)), eventBus.subscribe(EventQueue.ENTITY_STATE_CHANGED, new UpdateEntityListSubscriber(adapter))
        });
    }

    ListItemAdapter getAdapter()
    {
        return adapter;
    }

    public Urn getPlaylistUrn()
    {
        return playlistUrn;
    }

    abstract boolean hasContent();

    boolean hasTracks()
    {
        return adapter.getItems().size() > 0;
    }

    public void onDestroyView()
    {
        eventSubscriptions.unsubscribe();
    }

    public void onPlaylistTrackRemoved(int i)
    {
        AnimUtils.removeItemFromList(listView, i, new _cls1());
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        subscribeToContentUpdate();
    }

    void setContent(PlaylistWithTracks playlistwithtracks, PromotedSourceInfo promotedsourceinfo)
    {
        eventSubscriptions.unsubscribe();
        trackRenderer.setPlaylistInformation(promotedsourceinfo, playlistwithtracks.getUrn());
        adapter.clear();
        for (playlistwithtracks = playlistwithtracks.getTracks().iterator(); playlistwithtracks.hasNext(); adapter.addItem(promotedsourceinfo))
        {
            promotedsourceinfo = (TrackItem)playlistwithtracks.next();
        }

        adapter.notifyDataSetChanged();
        subscribeToContentUpdate();
    }

    abstract void setListShown(boolean flag);

    public void showTrackRemovalOptions(Urn urn, Listener listener1)
    {
        playlistUrn = urn;
        listener = listener1;
    }



    private class _cls1
        implements com.soundcloud.android.util.AnimUtils.ItemRemovalCallback
    {

        final PlaylistDetailsController this$0;

        public void onAnimationComplete(int i)
        {
            adapter.removeItem(i);
            adapter.notifyDataSetChanged();
            listener.onPlaylistContentChanged();
        }

        _cls1()
        {
            this$0 = PlaylistDetailsController.this;
            super();
        }
    }

}
