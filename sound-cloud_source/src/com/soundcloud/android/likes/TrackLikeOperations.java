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
//            LikedTrackStorage, LoadLikedTrackUrnsCommand

public class TrackLikeOperations
{

    static final long INITIAL_TIMESTAMP = 0x7fffffffffffffffL;
    static final int PAGE_SIZE = 30;
    private final EventBus eventBus;
    private final LikedTrackStorage likedTrackStorage;
    private final f loadInitialLikedTracks = new _cls2();
    private final f loadLikedTrack = new _cls3();
    private final LoadLikedTrackUrnsCommand loadLikedTrackUrnsCommand;
    private final NetworkConnectionHelper networkConnectionHelper;
    private final rx.b.b requestTracksSyncAction = new _cls1();
    private final R scheduler;
    private final SyncInitiator syncInitiator;

    public TrackLikeOperations(LoadLikedTrackUrnsCommand loadlikedtrackurnscommand, LikedTrackStorage likedtrackstorage, SyncInitiator syncinitiator, EventBus eventbus, R r, NetworkConnectionHelper networkconnectionhelper)
    {
        loadLikedTrackUrnsCommand = loadlikedtrackurnscommand;
        likedTrackStorage = likedtrackstorage;
        eventBus = eventbus;
        scheduler = r;
        syncInitiator = syncinitiator;
        networkConnectionHelper = networkconnectionhelper;
    }

    private b likedTracks(long l)
    {
        return loadLikedTracksInternal(l).lift(new OperatorSwitchOnEmptyList(updatedLikedTracks()));
    }

    private b loadLikedTracksInternal(long l)
    {
        return likedTrackStorage.loadTrackLikes(30, l).doOnNext(requestTracksSyncAction).subscribeOn(scheduler);
    }

    public b likedTrackUrns()
    {
        return loadLikedTrackUrnsCommand.toObservable().subscribeOn(scheduler);
    }

    b likedTracks()
    {
        return likedTracks(0x7fffffffffffffffL);
    }

    b onTrackLiked()
    {
        return eventBus.queue(EventQueue.ENTITY_STATE_CHANGED).filter(EntityStateChangedEvent.IS_TRACK_LIKED_FILTER).map(EntityStateChangedEvent.TO_URN).flatMap(loadLikedTrack);
    }

    b onTrackUnliked()
    {
        return eventBus.queue(EventQueue.ENTITY_STATE_CHANGED).filter(EntityStateChangedEvent.IS_TRACK_UNLIKED_FILTER).map(EntityStateChangedEvent.TO_URN);
    }

    com.soundcloud.rx.Pager.PagingFunction pagingFunction()
    {
        return new _cls4();
    }

    b updatedLikedTracks()
    {
        return syncInitiator.syncTrackLikes().observeOn(scheduler).flatMap(loadInitialLikedTracks).subscribeOn(scheduler);
    }





    private class _cls1
        implements rx.b.b
    {

        final TrackLikeOperations this$0;

        public volatile void call(Object obj)
        {
            call((List)obj);
        }

        public void call(List list)
        {
            if (networkConnectionHelper.isWifiConnected() && !list.isEmpty())
            {
                syncInitiator.requestTracksSync(list);
            }
        }

        _cls1()
        {
            this$0 = TrackLikeOperations.this;
            super();
        }
    }


    private class _cls2
        implements f
    {

        final TrackLikeOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((SyncResult)obj);
        }

        public b call(SyncResult syncresult)
        {
            return likedTrackStorage.loadTrackLikes(30, 0x7fffffffffffffffL);
        }

        _cls2()
        {
            this$0 = TrackLikeOperations.this;
            super();
        }
    }


    private class _cls3
        implements f
    {

        final TrackLikeOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((Urn)obj);
        }

        public b call(Urn urn)
        {
            return likedTrackStorage.loadTrackLike(urn);
        }

        _cls3()
        {
            this$0 = TrackLikeOperations.this;
            super();
        }
    }


    private class _cls4
        implements com.soundcloud.rx.Pager.PagingFunction
    {

        final TrackLikeOperations this$0;

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
                return loadLikedTracksInternal(((Date)((PropertySet)Iterables.getLast(list)).get(LikeProperty.CREATED_AT)).getTime());
            }
        }

        _cls4()
        {
            this$0 = TrackLikeOperations.this;
            super();
        }
    }

}
