// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.Intent;
import android.os.ResultReceiver;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.stations.StationsSyncRequestFactory;
import com.soundcloud.android.sync.entities.EntitySyncRequestFactory;
import com.soundcloud.android.sync.likes.DefaultSyncJob;
import com.soundcloud.android.sync.playlists.SinglePlaylistJobRequest;
import com.soundcloud.android.sync.playlists.SinglePlaylistSyncerFactory;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.Lazy;
import java.util.concurrent.Callable;

// Referenced classes of package com.soundcloud.android.sync:
//            SingleJobRequest, SyncRequest

class SyncRequestFactory
{

    private final EntitySyncRequestFactory entitySyncRequestFactory;
    private final EventBus eventBus;
    private final Lazy lazyRecommendationSyncer;
    private final Lazy lazySyncPlaylistLikesJob;
    private final Lazy lazySyncTrackLikesJob;
    private final SinglePlaylistSyncerFactory singlePlaylistSyncerFactory;
    private final StationsSyncRequestFactory stationsSyncRequestFactory;
    private final LegacySyncRequest.Factory syncIntentFactory;

    SyncRequestFactory(LegacySyncRequest.Factory factory, Lazy lazy, Lazy lazy1, EntitySyncRequestFactory entitysyncrequestfactory, SinglePlaylistSyncerFactory singleplaylistsyncerfactory, Lazy lazy2, StationsSyncRequestFactory stationssyncrequestfactory, 
            EventBus eventbus)
    {
        syncIntentFactory = factory;
        lazySyncTrackLikesJob = lazy;
        lazySyncPlaylistLikesJob = lazy1;
        entitySyncRequestFactory = entitysyncrequestfactory;
        singlePlaylistSyncerFactory = singleplaylistsyncerfactory;
        lazyRecommendationSyncer = lazy2;
        stationsSyncRequestFactory = stationssyncrequestfactory;
        eventBus = eventbus;
    }

    private SyncRequest createLegacyRequest(Intent intent)
    {
        if ("syncTrackLikes".equals(intent.getAction()))
        {
            return new SingleJobRequest((DefaultSyncJob)lazySyncTrackLikesJob.a(), intent.getAction(), true, getReceiverFromIntent(intent), eventBus);
        }
        if ("syncPlaylistLikes".equals(intent.getAction()))
        {
            return new SingleJobRequest((DefaultSyncJob)lazySyncPlaylistLikesJob.a(), intent.getAction(), true, getReceiverFromIntent(intent), eventBus);
        }
        if ("syncTracks".equals(intent.getAction()) || "syncPlaylists".equals(intent.getAction()) || "syncUsers".equals(intent.getAction()))
        {
            return entitySyncRequestFactory.create(intent, getReceiverFromIntent(intent));
        }
        if ("syncPlaylist".equals(intent.getAction()))
        {
            Urn urn = (Urn)intent.getParcelableExtra("urn");
            return new SinglePlaylistJobRequest(new DefaultSyncJob(singlePlaylistSyncerFactory.create(urn)), intent.getAction(), true, getReceiverFromIntent(intent), eventBus, urn);
        }
        if ("syncRecommendations".equals(intent.getAction()))
        {
            return new SingleJobRequest(new DefaultSyncJob((Callable)lazyRecommendationSyncer.a()), "syncRecommendations", true, getReceiverFromIntent(intent), eventBus);
        } else
        {
            return syncIntentFactory.create(intent);
        }
    }

    private SyncRequest createRequest(Intent intent)
    {
        String s;
        byte byte0;
        s = intent.getStringExtra("com.soundcloud.android.sync.extra.COLLECTION_TYPE");
        byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch 2100958655 2100958655: default 32
    //                   2100958655 76;
           goto _L1 _L2
_L1:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown type. ")).append(s).toString());

        case 0: // '\0'
            return stationsSyncRequestFactory.create(intent.getAction(), getReceiverFromIntent(intent));
        }
_L2:
        if (s.equals("STATIONS"))
        {
            byte0 = 0;
        }
          goto _L1
    }

    private ResultReceiver getReceiverFromIntent(Intent intent)
    {
        return (ResultReceiver)intent.getParcelableExtra("com.soundcloud.android.sync.extra.STATUS_RECEIVER");
    }

    SyncRequest create(Intent intent)
    {
        if (intent.hasExtra("com.soundcloud.android.sync.extra.COLLECTION_TYPE"))
        {
            return createRequest(intent);
        } else
        {
            return createLegacyRequest(intent);
        }
    }
}
