// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import rx.R;
import rx.b;
import rx.b.f;
import rx.b.g;
import rx.g.m;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsOperations

public class StationsController
{
    private static class CollectionPlayState
    {

        private final Urn collectionUrn;
        private final com.soundcloud.android.playback.Player.PlayerState playerState;
        private final int position;




        public CollectionPlayState(Urn urn, int i, com.soundcloud.android.playback.Player.PlayerState playerstate)
        {
            collectionUrn = urn;
            position = i;
            playerState = playerstate;
        }
    }


    private static final f IS_LOGGED_IN = new _cls2();
    private static final f IS_PLAYING_STATION = new _cls5();
    public static final g TO_COLLECTION_PLAY_STATE = new _cls1();
    private final EventBus eventBus;
    private final StationsOperations operations;
    private final rx.b.b saveRecentStation = new _cls4();
    private final R scheduler;
    private final f syncStations = new _cls3();

    public StationsController(EventBus eventbus, StationsOperations stationsoperations, R r)
    {
        eventBus = eventbus;
        operations = stationsoperations;
        scheduler = r;
    }

    private void saveRecentStation()
    {
        b.combineLatest(eventBus.queue(EventQueue.CURRENT_PLAY_QUEUE_ITEM), eventBus.queue(EventQueue.PLAYBACK_STATE_CHANGED), TO_COLLECTION_PLAY_STATE).filter(IS_PLAYING_STATION).observeOn(scheduler).doOnNext(saveRecentStation).subscribe(new DefaultSubscriber());
    }

    private void syncStationsUponLogin()
    {
        eventBus.queue(EventQueue.CURRENT_USER_CHANGED).filter(IS_LOGGED_IN).flatMap(syncStations).subscribe(new DefaultSubscriber());
    }

    public void subscribe()
    {
        syncStationsUponLogin();
        saveRecentStation();
    }



    private class _cls3
        implements f
    {

        final StationsController this$0;

        public volatile Object call(Object obj)
        {
            return call((CurrentUserChangedEvent)obj);
        }

        public b call(CurrentUserChangedEvent currentuserchangedevent)
        {
            return operations.sync();
        }

        _cls3()
        {
            this$0 = StationsController.this;
            super();
        }
    }


    private class _cls4
        implements rx.b.b
    {

        final StationsController this$0;

        public void call(CollectionPlayState collectionplaystate)
        {
            operations.saveLastPlayedTrackPosition(collectionplaystate.collectionUrn, collectionplaystate.position);
            operations.saveRecentlyPlayedStation(collectionplaystate.collectionUrn);
        }

        public volatile void call(Object obj)
        {
            call((CollectionPlayState)obj);
        }

        _cls4()
        {
            this$0 = StationsController.this;
            super();
        }
    }


    private class _cls1
        implements g
    {

        public final CollectionPlayState call(CurrentPlayQueueItemEvent currentplayqueueitemevent, com.soundcloud.android.playback.Player.StateTransition statetransition)
        {
            return new CollectionPlayState(currentplayqueueitemevent.getCollectionUrn(), currentplayqueueitemevent.getPosition(), statetransition.getNewState());
        }

        public final volatile Object call(Object obj, Object obj1)
        {
            return call((CurrentPlayQueueItemEvent)obj, (com.soundcloud.android.playback.Player.StateTransition)obj1);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements f
    {

        public final Boolean call(CurrentUserChangedEvent currentuserchangedevent)
        {
            boolean flag;
            if (currentuserchangedevent.getKind() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public final volatile Object call(Object obj)
        {
            return call((CurrentUserChangedEvent)obj);
        }

        _cls2()
        {
        }
    }


    private class _cls5
        implements f
    {

        public final Boolean call(CollectionPlayState collectionplaystate)
        {
            boolean flag;
            if (collectionplaystate.collectionUrn.isStation() && collectionplaystate.playerState.isPlayerPlaying())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public final volatile Object call(Object obj)
        {
            return call((CollectionPlayState)obj);
        }

        _cls5()
        {
        }
    }

}
