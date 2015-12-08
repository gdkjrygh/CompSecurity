// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.sync.SyncStateStorage;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DateProvider;
import java.util.concurrent.Callable;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsStorage, StationsApi, WriteStationsCollectionsCommand

class StationsSyncer
    implements Callable
{

    private final StationsApi api;
    private final DateProvider dateProvider;
    private final StationsStorage storage;
    private final SyncStateStorage syncStateStorage;
    private final WriteStationsCollectionsCommand writeCollectionsCommand;

    public StationsSyncer(SyncStateStorage syncstatestorage, StationsApi stationsapi, WriteStationsCollectionsCommand writestationscollectionscommand, CurrentDateProvider currentdateprovider, StationsStorage stationsstorage)
    {
        syncStateStorage = syncstatestorage;
        api = stationsapi;
        writeCollectionsCommand = writestationscollectionscommand;
        dateProvider = currentdateprovider;
        storage = stationsstorage;
    }

    public Boolean call()
        throws Exception
    {
        WriteStationsCollectionsCommand.SyncCollectionsMetadata synccollectionsmetadata = new WriteStationsCollectionsCommand.SyncCollectionsMetadata(dateProvider.getCurrentTime(), api.syncStationsCollections(storage.getRecentStationsToSync()));
        if (((Boolean)writeCollectionsCommand.call(synccollectionsmetadata)).booleanValue())
        {
            syncStateStorage.synced("STATIONS");
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }
}
