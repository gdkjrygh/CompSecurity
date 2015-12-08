// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.policies.PolicyOperations;
import com.soundcloud.rx.eventbus.EventBus;
import rx.R;
import rx.b;
import rx.b.f;
import rx.g.m;

// Referenced classes of package com.soundcloud.android.offline:
//            ClearTrackDownloadsCommand, OfflineContentStorage, TrackDownloadsStorage, LoadExpectedContentCommand, 
//            LoadOfflineContentUpdatesCommand, StoreDownloadUpdatesCommand, LoadTracksWithStalePoliciesCommand

public class OfflineContentOperations
{

    private static final f OFFLINE_LIKES_EVENT_TO_IS_MARKED_OFFLINE = new _cls3();
    public static final f OFFLINE_LIKES_EVENT_TO_OFFLINE_STATE = new _cls2();
    private static final f WRITE_RESULT_TO_SUCCESS = new _cls1();
    private final f PENDING_LIKES_TO_OFFLINE_STATE = new _cls5();
    private final f UPDATE_POLICIES = new _cls4();
    private final ClearTrackDownloadsCommand clearTrackDownloadsCommand;
    private final EventBus eventBus;
    private final FeatureOperations featureOperations;
    private final LoadExpectedContentCommand loadExpectedContentCommand;
    private final LoadOfflineContentUpdatesCommand loadOfflineContentUpdatesCommand;
    private final LoadTracksWithStalePoliciesCommand loadTracksWithStalePolicies;
    private final OfflineContentStorage offlineContentStorage;
    private final PolicyOperations policyOperations;
    private final rx.b.b publishOfflineContentRemoved = new _cls6();
    private final R scheduler;
    private final StoreDownloadUpdatesCommand storeDownloadUpdatesCommand;
    private final TrackDownloadsStorage tracksStorage;

    OfflineContentOperations(StoreDownloadUpdatesCommand storedownloadupdatescommand, LoadTracksWithStalePoliciesCommand loadtrackswithstalepoliciescommand, ClearTrackDownloadsCommand cleartrackdownloadscommand, EventBus eventbus, OfflineContentStorage offlinecontentstorage, PolicyOperations policyoperations, LoadExpectedContentCommand loadexpectedcontentcommand, 
            LoadOfflineContentUpdatesCommand loadofflinecontentupdatescommand, FeatureOperations featureoperations, TrackDownloadsStorage trackdownloadsstorage, R r)
    {
        storeDownloadUpdatesCommand = storedownloadupdatescommand;
        loadTracksWithStalePolicies = loadtrackswithstalepoliciescommand;
        clearTrackDownloadsCommand = cleartrackdownloadscommand;
        eventBus = eventbus;
        offlineContentStorage = offlinecontentstorage;
        policyOperations = policyoperations;
        loadExpectedContentCommand = loadexpectedcontentcommand;
        loadOfflineContentUpdatesCommand = loadofflinecontentupdatescommand;
        featureOperations = featureoperations;
        tracksStorage = trackdownloadsstorage;
        scheduler = r;
    }

    private rx.b.b publishLikesMarkedForOfflineChange(boolean flag)
    {
        return eventBus.publishAction1(EventQueue.ENTITY_STATE_CHANGED, EntityStateChangedEvent.fromLikesMarkedForOffline(flag));
    }

    private rx.b.b publishMarkedForOfflineChange(Urn urn, boolean flag)
    {
        return eventBus.publishAction1(EventQueue.ENTITY_STATE_CHANGED, EntityStateChangedEvent.fromMarkedForOffline(urn, flag));
    }

    public b clearOfflineContent()
    {
        return clearTrackDownloadsCommand.toObservable(null).doOnNext(publishOfflineContentRemoved).subscribeOn(scheduler);
    }

    public b disableOfflineLikedTracks()
    {
        return offlineContentStorage.storeOfflineLikesDisabled().map(WRITE_RESULT_TO_SUCCESS).doOnNext(publishLikesMarkedForOfflineChange(false)).subscribeOn(scheduler);
    }

    public b enableOfflineLikedTracks()
    {
        return offlineContentStorage.storeOfflineLikesEnabled().map(WRITE_RESULT_TO_SUCCESS).doOnNext(publishLikesMarkedForOfflineChange(true)).subscribeOn(scheduler);
    }

    public b getLikedTracksOfflineStateFromStorage()
    {
        return offlineContentStorage.isOfflineLikesEnabled().flatMap(PENDING_LIKES_TO_OFFLINE_STATE).subscribeOn(scheduler);
    }

    public b getOfflineContentOrOfflineLikesStatusChanges()
    {
        return featureOperations.offlineContentEnabled().concatWith(getOfflineLikedTracksStatusChanges());
    }

    public b getOfflineLikedTracksStatusChanges()
    {
        return isOfflineLikedTracksEnabled().concatWith(eventBus.queue(EventQueue.ENTITY_STATE_CHANGED).filter(EntityStateChangedEvent.IS_OFFLINE_LIKES_EVENT_FILTER).map(OFFLINE_LIKES_EVENT_TO_IS_MARKED_OFFLINE));
    }

    public b isOfflineLikedTracksEnabled()
    {
        return offlineContentStorage.isOfflineLikesEnabled().subscribeOn(scheduler);
    }

    public b isOfflinePlaylist(Urn urn)
    {
        return offlineContentStorage.isOfflinePlaylist(urn).subscribeOn(scheduler);
    }

    b loadContentToDelete()
    {
        return tracksStorage.getTracksToRemove().subscribeOn(scheduler);
    }

    b loadOfflineContentUpdates()
    {
        return updateOfflineContentStalePolicies().onErrorResumeNext(b.just(null)).flatMap(loadExpectedContentCommand.toContinuation()).flatMap(loadOfflineContentUpdatesCommand.toContinuation()).doOnNext(storeDownloadUpdatesCommand.toAction()).subscribeOn(scheduler);
    }

    public b makePlaylistAvailableOffline(Urn urn)
    {
        return offlineContentStorage.storeAsOfflinePlaylist(urn).map(WRITE_RESULT_TO_SUCCESS).doOnNext(publishMarkedForOfflineChange(urn, true)).subscribeOn(scheduler);
    }

    public b makePlaylistUnavailableOffline(Urn urn)
    {
        return offlineContentStorage.removeFromOfflinePlaylists(urn).map(WRITE_RESULT_TO_SUCCESS).doOnNext(publishMarkedForOfflineChange(urn, false)).subscribeOn(scheduler);
    }

    b updateOfflineContentStalePolicies()
    {
        return loadTracksWithStalePolicies.toObservable(null).flatMap(UPDATE_POLICIES).subscribeOn(scheduler);
    }





    private class _cls4
        implements f
    {

        final OfflineContentOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((Collection)obj);
        }

        public b call(Collection collection)
        {
            if (collection.isEmpty())
            {
                return b.just(null);
            } else
            {
                return policyOperations.updatePolicies(collection);
            }
        }

        _cls4()
        {
            this$0 = OfflineContentOperations.this;
            super();
        }
    }


    private class _cls5
        implements f
    {

        final OfflineContentOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((Boolean)obj);
        }

        public b call(Boolean boolean1)
        {
            if (boolean1.booleanValue())
            {
                return tracksStorage.getLikesOfflineState();
            } else
            {
                return b.just(OfflineState.NO_OFFLINE);
            }
        }

        _cls5()
        {
            this$0 = OfflineContentOperations.this;
            super();
        }
    }


    private class _cls6
        implements rx.b.b
    {

        final OfflineContentOperations this$0;

        public volatile void call(Object obj)
        {
            call((List)obj);
        }

        public void call(List list)
        {
            eventBus.publish(EventQueue.CURRENT_DOWNLOAD, CurrentDownloadEvent.offlineContentRemoved(list));
        }

        _cls6()
        {
            this$0 = OfflineContentOperations.this;
            super();
        }
    }


    private class _cls1
        implements f
    {

        public final Boolean call(WriteResult writeresult)
        {
            return Boolean.valueOf(writeresult.success());
        }

        public final volatile Object call(Object obj)
        {
            return call((WriteResult)obj);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements f
    {

        public final OfflineState call(EntityStateChangedEvent entitystatechangedevent)
        {
            if (((Boolean)entitystatechangedevent.getNextChangeSet().getOrElse(OfflineProperty.Collection.OFFLINE_LIKES, Boolean.valueOf(false))).booleanValue())
            {
                return OfflineState.REQUESTED;
            } else
            {
                return OfflineState.NO_OFFLINE;
            }
        }

        public final volatile Object call(Object obj)
        {
            return call((EntityStateChangedEvent)obj);
        }

        _cls2()
        {
        }
    }


    private class _cls3
        implements f
    {

        public final Boolean call(EntityStateChangedEvent entitystatechangedevent)
        {
            return (Boolean)entitystatechangedevent.getNextChangeSet().getOrElse(OfflineProperty.Collection.OFFLINE_LIKES, Boolean.valueOf(false));
        }

        public final volatile Object call(Object obj)
        {
            return call((EntityStateChangedEvent)obj);
        }

        _cls3()
        {
        }
    }

}
