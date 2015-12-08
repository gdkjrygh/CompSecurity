// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.sync.SyncStateStorage;
import com.soundcloud.android.utils.CurrentDateProvider;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsSyncer, StationsApi, WriteStationsCollectionsCommand, StationsStorage

public final class d extends b
    implements Provider
{

    private b api;
    private b dateProvider;
    private b storage;
    private b syncStateStorage;
    private b writeCollectionsCommand;

    public final void attach(l l1)
    {
        syncStateStorage = l1.a("com.soundcloud.android.sync.SyncStateStorage", com/soundcloud/android/stations/StationsSyncer, getClass().getClassLoader());
        api = l1.a("com.soundcloud.android.stations.StationsApi", com/soundcloud/android/stations/StationsSyncer, getClass().getClassLoader());
        writeCollectionsCommand = l1.a("com.soundcloud.android.stations.WriteStationsCollectionsCommand", com/soundcloud/android/stations/StationsSyncer, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/stations/StationsSyncer, getClass().getClassLoader());
        storage = l1.a("com.soundcloud.android.stations.StationsStorage", com/soundcloud/android/stations/StationsSyncer, getClass().getClassLoader());
    }

    public final StationsSyncer get()
    {
        return new StationsSyncer((SyncStateStorage)syncStateStorage.get(), (StationsApi)api.get(), (WriteStationsCollectionsCommand)writeCollectionsCommand.get(), (CurrentDateProvider)dateProvider.get(), (StationsStorage)storage.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(syncStateStorage);
        set.add(api);
        set.add(writeCollectionsCommand);
        set.add(dateProvider);
        set.add(storage);
    }

    public d()
    {
        super("com.soundcloud.android.stations.StationsSyncer", "members/com.soundcloud.android.stations.StationsSyncer", false, com/soundcloud/android/stations/StationsSyncer);
    }
}
