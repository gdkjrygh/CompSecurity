// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.sync.SyncStateStorage;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsOperations, StationsStorage, StationsApi, StoreStationCommand, 
//            StationsSyncInitiator

public final class  extends b
    implements Provider
{

    private b scheduler;
    private b stationsApi;
    private b stationsStorage;
    private b storeStationCommand;
    private b storeTracksCommand;
    private b syncInitiator;
    private b syncStateStorage;

    public final void attach(l l1)
    {
        syncStateStorage = l1.a("com.soundcloud.android.sync.SyncStateStorage", com/soundcloud/android/stations/StationsOperations, getClass().getClassLoader());
        stationsStorage = l1.a("com.soundcloud.android.stations.StationsStorage", com/soundcloud/android/stations/StationsOperations, getClass().getClassLoader());
        stationsApi = l1.a("com.soundcloud.android.stations.StationsApi", com/soundcloud/android/stations/StationsOperations, getClass().getClassLoader());
        storeTracksCommand = l1.a("com.soundcloud.android.commands.StoreTracksCommand", com/soundcloud/android/stations/StationsOperations, getClass().getClassLoader());
        storeStationCommand = l1.a("com.soundcloud.android.stations.StoreStationCommand", com/soundcloud/android/stations/StationsOperations, getClass().getClassLoader());
        syncInitiator = l1.a("com.soundcloud.android.stations.StationsSyncInitiator", com/soundcloud/android/stations/StationsOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/stations/StationsOperations, getClass().getClassLoader());
    }

    public final StationsOperations get()
    {
        return new StationsOperations((SyncStateStorage)syncStateStorage.get(), (StationsStorage)stationsStorage.get(), (StationsApi)stationsApi.get(), (StoreTracksCommand)storeTracksCommand.get(), (StoreStationCommand)storeStationCommand.get(), (StationsSyncInitiator)syncInitiator.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(syncStateStorage);
        set.add(stationsStorage);
        set.add(stationsApi);
        set.add(storeTracksCommand);
        set.add(storeStationCommand);
        set.add(syncInitiator);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.stations.StationsOperations", "members/com.soundcloud.android.stations.StationsOperations", false, com/soundcloud/android/stations/StationsOperations);
    }
}
