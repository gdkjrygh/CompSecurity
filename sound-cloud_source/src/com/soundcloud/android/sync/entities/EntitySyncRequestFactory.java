// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.entities;

import android.content.Intent;
import android.os.ResultReceiver;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.Lazy;

// Referenced classes of package com.soundcloud.android.sync.entities:
//            EntitySyncRequest, EntitySyncJob

public class EntitySyncRequestFactory
{

    private final EventBus eventBus;
    private final Lazy playlistSyncJob;
    private final Lazy tracksSyncJob;
    private final Lazy usersSyncJob;

    public EntitySyncRequestFactory(Lazy lazy, Lazy lazy1, Lazy lazy2, EventBus eventbus)
    {
        tracksSyncJob = lazy;
        playlistSyncJob = lazy1;
        usersSyncJob = lazy2;
        eventBus = eventbus;
    }

    public EntitySyncRequest create(Intent intent, ResultReceiver resultreceiver)
    {
        String s;
        byte byte0;
        s = intent.getAction();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 48
    //                   485289005: 118
    //                   1119517830: 133
    //                   2129370883: 103;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_133;
_L5:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected action : ")).append(intent.getAction()).toString());

        case 0: // '\0'
            return new EntitySyncRequest((EntitySyncJob)tracksSyncJob.a(), intent, eventBus, intent.getAction(), resultreceiver);

        case 1: // '\001'
            return new EntitySyncRequest((EntitySyncJob)usersSyncJob.a(), intent, eventBus, intent.getAction(), resultreceiver);

        case 2: // '\002'
            return new EntitySyncRequest((EntitySyncJob)playlistSyncJob.a(), intent, eventBus, intent.getAction(), resultreceiver);
        }
_L4:
        if (s.equals("syncTracks"))
        {
            byte0 = 0;
        }
          goto _L5
_L2:
        if (s.equals("syncUsers"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s.equals("syncPlaylists"))
        {
            byte0 = 2;
        }
          goto _L5
    }
}
