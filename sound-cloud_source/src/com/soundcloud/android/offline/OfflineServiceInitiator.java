// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.content.Context;
import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.playlists.PlaylistOperations;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.rx.eventbus.EventBus;
import rx.R;
import rx.Y;
import rx.b;
import rx.b.f;
import rx.g.m;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineSettingsStorage, OfflineContentOperations, OfflineContentServiceSubscriber, OfflineContentService

public class OfflineServiceInitiator
{

    private static final f IS_LIKES_SYNC_FILTER = new _cls1();
    private static final f IS_PLAYLIST_SYNCED_FILTER = new _cls2();
    private final f areOfflineLikesEnabled = new _cls4();
    private final Context context;
    private final EventBus eventBus;
    private final f isOfflinePlaylist = new _cls3();
    private final OfflineContentOperations offlineContentOperations;
    private final PlaylistOperations playlistOperations;
    private final R scheduler;
    private Y subscription;
    private final f syncPlaylistIfNecessary = new _cls5();
    private final b syncWifiOnlyToggled;

    public OfflineServiceInitiator(Context context1, EventBus eventbus, OfflineSettingsStorage offlinesettingsstorage, PlaylistOperations playlistoperations, OfflineContentOperations offlinecontentoperations, R r)
    {
        subscription = RxUtils.invalidSubscription();
        context = context1;
        eventBus = eventbus;
        scheduler = r;
        playlistOperations = playlistoperations;
        offlineContentOperations = offlinecontentoperations;
        syncWifiOnlyToggled = offlinesettingsstorage.getWifiOnlyOfflineSyncStateChange();
    }

    private b getOfflineLikedTracksContentChanged()
    {
        return b.merge(eventBus.queue(EventQueue.ENTITY_STATE_CHANGED).filter(EntityStateChangedEvent.IS_TRACK_LIKE_EVENT_FILTER), eventBus.queue(EventQueue.SYNC_RESULT).filter(IS_LIKES_SYNC_FILTER)).flatMap(areOfflineLikesEnabled).filter(RxUtils.IS_TRUE);
    }

    private b getOfflineLikesChangedEvents()
    {
        return b.merge(getOfflineLikedTracksContentChanged(), offlineContentOperations.getOfflineLikedTracksStatusChanges());
    }

    private b getOfflinePlaylistChangedEvents()
    {
        return b.merge(offlinePlaylistSynced(), offlinePlaylistStatusChanged(), offlinePlaylistContentChanged());
    }

    private b getSyncOverWifiStateChanged()
    {
        return syncWifiOnlyToggled.filter(RxUtils.IS_FALSE);
    }

    private b offlinePlaylistContentChanged()
    {
        return eventBus.queue(EventQueue.ENTITY_STATE_CHANGED).filter(EntityStateChangedEvent.IS_PLAYLIST_CONTENT_CHANGED_FILTER).flatMap(isOfflinePlaylist).filter(RxUtils.IS_TRUE);
    }

    private b offlinePlaylistStatusChanged()
    {
        return eventBus.queue(EventQueue.ENTITY_STATE_CHANGED).filter(EntityStateChangedEvent.IS_PLAYLIST_OFFLINE_CONTENT_EVENT_FILTER).map(EntityStateChangedEvent.TO_SINGULAR_CHANGE).flatMap(syncPlaylistIfNecessary);
    }

    private b offlinePlaylistSynced()
    {
        return eventBus.queue(EventQueue.SYNC_RESULT).filter(IS_PLAYLIST_SYNCED_FILTER).flatMap(isOfflinePlaylist).filter(RxUtils.IS_TRUE);
    }

    private b policyUpdates()
    {
        return eventBus.queue(EventQueue.POLICY_UPDATES);
    }

    private b startOfflineContent()
    {
        return b.merge(getOfflinePlaylistChangedEvents(), getOfflineLikesChangedEvents(), getSyncOverWifiStateChanged(), policyUpdates());
    }

    public void subscribe()
    {
        subscription = startOfflineContent().doOnSubscribe(OfflineContentServiceSubscriber.startServiceAction(context)).subscribe(new OfflineContentServiceSubscriber(context));
    }

    public void unsubscribe()
    {
        OfflineContentService.stop(context);
        subscription.unsubscribe();
    }





    private class _cls3
        implements f
    {

        final OfflineServiceInitiator this$0;

        public volatile Object call(Object obj)
        {
            return call((UrnEvent)obj);
        }

        public b call(UrnEvent urnevent)
        {
            return offlineContentOperations.isOfflinePlaylist(urnevent.getFirstUrn());
        }

        _cls3()
        {
            this$0 = OfflineServiceInitiator.this;
            super();
        }
    }


    private class _cls4
        implements f
    {

        final OfflineServiceInitiator this$0;

        public volatile Object call(Object obj)
        {
            return call((UrnEvent)obj);
        }

        public b call(UrnEvent urnevent)
        {
            return offlineContentOperations.isOfflineLikedTracksEnabled();
        }

        _cls4()
        {
            this$0 = OfflineServiceInitiator.this;
            super();
        }
    }


    private class _cls5
        implements f
    {

        final OfflineServiceInitiator this$0;

        public volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        public b call(PropertySet propertyset)
        {
            return playlistOperations.playlist((Urn)propertyset.get(PlaylistProperty.URN)).subscribeOn(scheduler);
        }

        _cls5()
        {
            this$0 = OfflineServiceInitiator.this;
            super();
        }
    }


    private class _cls1
        implements f
    {

        public final Boolean call(SyncResult syncresult)
        {
            boolean flag;
            if (syncresult.wasChanged() && "syncTrackLikes".equals(syncresult.getAction()))
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
            return call((SyncResult)obj);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements f
    {

        public final Boolean call(SyncResult syncresult)
        {
            boolean flag;
            if ("syncPlaylist".equals(syncresult.getAction()) && syncresult.wasChanged() && syncresult.hasChangedEntities().booleanValue())
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
            return call((SyncResult)obj);
        }

        _cls2()
        {
        }
    }

}
