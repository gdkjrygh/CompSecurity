// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.sync.SyncStateStorage;
import com.soundcloud.propeller.ChangeResult;
import rx.R;
import rx.b;
import rx.b.f;
import rx.internal.util.q;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsStorage, StationsApi, StoreStationCommand, StationsSyncInitiator

public class StationsOperations
{

    private static final f HAS_TRACKS = new _cls2();
    private final R scheduler;
    private final StationsApi stationsApi;
    private final StationsStorage stationsStorage;
    private final StoreStationCommand storeStationCommand;
    private final rx.b.b storeTracks = new _cls1();
    private final StoreTracksCommand storeTracksCommand;
    private final StationsSyncInitiator syncInitiator;
    private final SyncStateStorage syncStateStorage;

    public StationsOperations(SyncStateStorage syncstatestorage, StationsStorage stationsstorage, StationsApi stationsapi, StoreTracksCommand storetrackscommand, StoreStationCommand storestationcommand, StationsSyncInitiator stationssyncinitiator, R r)
    {
        syncStateStorage = syncstatestorage;
        stationsStorage = stationsstorage;
        stationsApi = stationsapi;
        syncInitiator = stationssyncinitiator;
        scheduler = r;
        storeTracksCommand = storetrackscommand;
        storeStationCommand = storestationcommand;
    }

    private f loadPlayQueue(final Urn station, final int startPosition)
    {
        return new _cls5();
    }

    private b loadStationsCollection(int i)
    {
        return stationsStorage.getStationsCollection(i).subscribeOn(scheduler);
    }

    private f prependSeed(final Urn seed)
    {
        return new _cls3();
    }

    private b station(Urn urn, f f)
    {
        return b.concat(stationsStorage.station(urn).filter(HAS_TRACKS), stationsApi.fetchStation(urn).doOnNext(storeTracks).map(f).doOnNext(storeStationCommand.toAction())).first().subscribeOn(scheduler);
    }

    private b syncAndLoadStationsCollection(int i)
    {
        return syncInitiator.syncRecentStations().flatMap(RxUtils.continueWith(loadStationsCollection(i)));
    }

    private f toPlayQueue(final Urn station)
    {
        return new _cls4();
    }

    public void clearData()
    {
        stationsStorage.clear();
    }

    public b collection(int i)
    {
        b b1;
        if (syncStateStorage.hasSyncedBefore("STATIONS"))
        {
            b1 = loadStationsCollection(i);
        } else
        {
            b1 = syncAndLoadStationsCollection(i);
        }
        return b1.subscribeOn(scheduler);
    }

    public void disableOnboarding()
    {
        stationsStorage.disableOnboarding();
    }

    public b fetchUpcomingTracks(Urn urn, int i)
    {
        return stationsApi.fetchStation(urn).doOnNext(storeTracks).doOnNext(storeStationCommand.toAction()).flatMap(loadPlayQueue(urn, i)).toList().map(toPlayQueue(urn)).subscribeOn(scheduler);
    }

    ChangeResult saveLastPlayedTrackPosition(Urn urn, int i)
    {
        return stationsStorage.saveLastPlayedTrackPosition(urn, i);
    }

    public ChangeResult saveRecentlyPlayedStation(Urn urn)
    {
        urn = stationsStorage.saveUnsyncedRecentlyPlayedStation(urn);
        syncInitiator.requestSystemSync();
        return urn;
    }

    public boolean shouldDisplayOnboardingStreamItem()
    {
        return !stationsStorage.isOnboardingDisabled();
    }

    public b station(Urn urn)
    {
        return station(urn, q.b());
    }

    public b stationWithSeed(Urn urn, Urn urn1)
    {
        return station(urn, prependSeed(urn1));
    }

    public b sync()
    {
        return syncInitiator.syncRecentStations();
    }




    private class _cls1
        implements rx.b.b
    {

        final StationsOperations this$0;

        public void call(ApiStation apistation)
        {
            storeTracksCommand.call(apistation.getTrackRecords());
        }

        public volatile void call(Object obj)
        {
            call((ApiStation)obj);
        }

        _cls1()
        {
            this$0 = StationsOperations.this;
            super();
        }
    }


    private class _cls5
        implements f
    {

        final StationsOperations this$0;
        final int val$startPosition;
        final Urn val$station;

        public volatile Object call(Object obj)
        {
            return call((StationRecord)obj);
        }

        public b call(StationRecord stationrecord)
        {
            return stationsStorage.loadPlayQueue(station, startPosition);
        }

        _cls5()
        {
            this$0 = StationsOperations.this;
            station = urn;
            startPosition = i;
            super();
        }
    }


    private class _cls3
        implements f
    {

        final StationsOperations this$0;
        final Urn val$seed;

        public StationRecord call(StationRecord stationrecord)
        {
            if (stationrecord.getTracks().isEmpty())
            {
                return stationrecord;
            } else
            {
                return Station.stationWithSeedTrack(stationrecord, seed);
            }
        }

        public volatile Object call(Object obj)
        {
            return call((StationRecord)obj);
        }

        _cls3()
        {
            this$0 = StationsOperations.this;
            seed = urn;
            super();
        }
    }


    private class _cls4
        implements f
    {

        final StationsOperations this$0;
        final Urn val$station;

        public PlayQueue call(List list)
        {
            return PlayQueue.fromStation(station, list);
        }

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        _cls4()
        {
            this$0 = StationsOperations.this;
            station = urn;
            super();
        }
    }


    private class _cls2
        implements f
    {

        public final Boolean call(StationRecord stationrecord)
        {
            boolean flag;
            if (stationrecord.getTracks().size() > 0)
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
            return call((StationRecord)obj);
        }

        _cls2()
        {
        }
    }

}
