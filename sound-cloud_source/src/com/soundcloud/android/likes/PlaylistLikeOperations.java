// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.rx.OperatorSwitchOnEmptyList;
import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.rx.eventbus.EventBus;
import rx.R;
import rx.b;
import rx.b.f;
import rx.g.m;

// Referenced classes of package com.soundcloud.android.likes:
//            PlaylistLikesStorage

public class PlaylistLikeOperations
{

    static final int PAGE_SIZE = 30;
    private final EventBus eventBus;
    private final NetworkConnectionHelper networkConnectionHelper;
    private final rx.b.b requestPlaylistsSyncAction = new _cls1();
    private final R scheduler;
    private final PlaylistLikesStorage storage;
    private final SyncInitiator syncInitiator;
    private final f toLoadLikedPlaylist = new _cls2();
    private final f toLoadLikedPlaylists = new _cls3();

    PlaylistLikeOperations(PlaylistLikesStorage playlistlikesstorage, SyncInitiator syncinitiator, EventBus eventbus, R r, NetworkConnectionHelper networkconnectionhelper)
    {
        storage = playlistlikesstorage;
        eventBus = eventbus;
        scheduler = r;
        syncInitiator = syncinitiator;
        networkConnectionHelper = networkconnectionhelper;
    }

    private b likedPlaylists(long l)
    {
        return loadLikedPlaylistsInternal(l).lift(new OperatorSwitchOnEmptyList(updatedLikedPlaylists()));
    }

    private b loadLikedPlaylistsInternal(long l)
    {
        return storage.loadLikedPlaylists(30, l).doOnNext(requestPlaylistsSyncAction).subscribeOn(scheduler);
    }

    public b likedPlaylists()
    {
        return likedPlaylists(0x7fffffffffffffffL);
    }

    public b onPlaylistLiked()
    {
        return eventBus.queue(EventQueue.ENTITY_STATE_CHANGED).filter(EntityStateChangedEvent.IS_PLAYLIST_LIKED_FILTER).map(EntityStateChangedEvent.TO_URN).flatMap(toLoadLikedPlaylist);
    }

    public b onPlaylistUnliked()
    {
        return eventBus.queue(EventQueue.ENTITY_STATE_CHANGED).filter(EntityStateChangedEvent.IS_PLAYLIST_UNLIKED_FILTER).map(EntityStateChangedEvent.TO_URN);
    }

    public com.soundcloud.rx.Pager.PagingFunction pagingFunction()
    {
        return new _cls4();
    }

    public b updatedLikedPlaylists()
    {
        return syncInitiator.syncPlaylistLikes().flatMap(toLoadLikedPlaylists);
    }






    private class _cls1
        implements rx.b.b
    {

        final PlaylistLikeOperations this$0;

        public volatile void call(Object obj)
        {
            call((List)obj);
        }

        public void call(List list)
        {
            if (networkConnectionHelper.isWifiConnected() && !list.isEmpty())
            {
                syncInitiator.requestPlaylistSync(list);
            }
        }

        _cls1()
        {
            this$0 = PlaylistLikeOperations.this;
            super();
        }
    }


    private class _cls2
        implements f
    {

        final PlaylistLikeOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((Urn)obj);
        }

        public b call(Urn urn)
        {
            return storage.loadLikedPlaylist(urn).subscribeOn(scheduler);
        }

        _cls2()
        {
            this$0 = PlaylistLikeOperations.this;
            super();
        }
    }


    private class _cls3
        implements f
    {

        final PlaylistLikeOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((SyncResult)obj);
        }

        public b call(SyncResult syncresult)
        {
            return storage.loadLikedPlaylists(30, 0x7fffffffffffffffL).subscribeOn(scheduler);
        }

        _cls3()
        {
            this$0 = PlaylistLikeOperations.this;
            super();
        }
    }


    private class _cls4
        implements com.soundcloud.rx.Pager.PagingFunction
    {

        final PlaylistLikeOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public b call(List list)
        {
            if (list.size() < 30)
            {
                return Pager.finish();
            } else
            {
                return loadLikedPlaylistsInternal(((Date)((PropertySet)Iterables.getLast(list)).get(LikeProperty.CREATED_AT)).getTime());
            }
        }

        _cls4()
        {
            this$0 = PlaylistLikeOperations.this;
            super();
        }
    }

}
