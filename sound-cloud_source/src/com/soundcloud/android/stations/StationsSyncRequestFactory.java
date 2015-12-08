// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.os.ResultReceiver;
import com.soundcloud.android.sync.SingleJobRequest;
import com.soundcloud.android.sync.SyncRequest;
import com.soundcloud.android.sync.likes.DefaultSyncJob;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsSyncer

public class StationsSyncRequestFactory
{
    public static class Actions
    {

        public static final String SYNC_STATIONS = "syncStations";

        public Actions()
        {
        }
    }


    private final EventBus eventBus;
    private final StationsSyncer syncer;

    public StationsSyncRequestFactory(StationsSyncer stationssyncer, EventBus eventbus)
    {
        syncer = stationssyncer;
        eventBus = eventbus;
    }

    public SyncRequest create(String s, ResultReceiver resultreceiver)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch 1968822650 1968822650: default 24
    //                   1968822650 68;
           goto _L1 _L2
_L1:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown action. ")).append(s).toString());

        case 0: // '\0'
            return new SingleJobRequest(new DefaultSyncJob(syncer), "syncStations", true, resultreceiver, eventBus);
        }
_L2:
        if (s.equals("syncStations"))
        {
            byte0 = 0;
        }
          goto _L1
    }
}
