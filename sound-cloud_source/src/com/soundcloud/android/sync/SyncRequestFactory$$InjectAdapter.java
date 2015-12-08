// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import com.soundcloud.android.stations.StationsSyncRequestFactory;
import com.soundcloud.android.sync.entities.EntitySyncRequestFactory;
import com.soundcloud.android.sync.playlists.SinglePlaylistSyncerFactory;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.Lazy;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncRequestFactory

public final class ory extends b
    implements Provider
{

    private b entitySyncRequestFactory;
    private b eventBus;
    private b lazyRecommendationSyncer;
    private b lazySyncPlaylistLikesJob;
    private b lazySyncTrackLikesJob;
    private b singlePlaylistSyncerFactory;
    private b stationsSyncRequestFactory;
    private b syncIntentFactory;

    public final void attach(l l1)
    {
        syncIntentFactory = l1.a("com.soundcloud.android.sync.LegacySyncRequest$Factory", com/soundcloud/android/sync/SyncRequestFactory, getClass().getClassLoader());
        lazySyncTrackLikesJob = l1.a("dagger.Lazy<com.soundcloud.android.sync.likes.SyncTrackLikesJob>", com/soundcloud/android/sync/SyncRequestFactory, getClass().getClassLoader());
        lazySyncPlaylistLikesJob = l1.a("dagger.Lazy<com.soundcloud.android.sync.likes.SyncPlaylistLikesJob>", com/soundcloud/android/sync/SyncRequestFactory, getClass().getClassLoader());
        entitySyncRequestFactory = l1.a("com.soundcloud.android.sync.entities.EntitySyncRequestFactory", com/soundcloud/android/sync/SyncRequestFactory, getClass().getClassLoader());
        singlePlaylistSyncerFactory = l1.a("com.soundcloud.android.sync.playlists.SinglePlaylistSyncerFactory", com/soundcloud/android/sync/SyncRequestFactory, getClass().getClassLoader());
        lazyRecommendationSyncer = l1.a("dagger.Lazy<com.soundcloud.android.sync.recommendations.RecommendationsSyncer>", com/soundcloud/android/sync/SyncRequestFactory, getClass().getClassLoader());
        stationsSyncRequestFactory = l1.a("com.soundcloud.android.stations.StationsSyncRequestFactory", com/soundcloud/android/sync/SyncRequestFactory, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/sync/SyncRequestFactory, getClass().getClassLoader());
    }

    public final SyncRequestFactory get()
    {
        return new SyncRequestFactory((ory)syncIntentFactory.get(), (Lazy)lazySyncTrackLikesJob.get(), (Lazy)lazySyncPlaylistLikesJob.get(), (EntitySyncRequestFactory)entitySyncRequestFactory.get(), (SinglePlaylistSyncerFactory)singlePlaylistSyncerFactory.get(), (Lazy)lazyRecommendationSyncer.get(), (StationsSyncRequestFactory)stationsSyncRequestFactory.get(), (EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(syncIntentFactory);
        set.add(lazySyncTrackLikesJob);
        set.add(lazySyncPlaylistLikesJob);
        set.add(entitySyncRequestFactory);
        set.add(singlePlaylistSyncerFactory);
        set.add(lazyRecommendationSyncer);
        set.add(stationsSyncRequestFactory);
        set.add(eventBus);
    }

    public ory()
    {
        super("com.soundcloud.android.sync.SyncRequestFactory", "members/com.soundcloud.android.sync.SyncRequestFactory", false, com/soundcloud/android/sync/SyncRequestFactory);
    }
}
