// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.playlists;

import android.os.ResultReceiver;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.sync.SingleJobRequest;
import com.soundcloud.android.sync.SyncJob;
import com.soundcloud.android.sync.SyncResult;
import com.soundcloud.android.sync.likes.DefaultSyncJob;
import com.soundcloud.rx.eventbus.EventBus;

public class SinglePlaylistJobRequest extends SingleJobRequest
{

    private final Urn playlistUrn;

    public SinglePlaylistJobRequest(DefaultSyncJob defaultsyncjob, String s, boolean flag, ResultReceiver resultreceiver, EventBus eventbus, Urn urn)
    {
        super(defaultsyncjob, s, flag, resultreceiver, eventbus);
        playlistUrn = urn;
    }

    public void processJobResult(SyncJob syncjob)
    {
        Exception exception = syncjob.getException();
        if (exception == null)
        {
            syncjob = SyncResult.success(action, syncjob.resultedInAChange(), playlistUrn);
        } else
        {
            syncjob = SyncResult.failure(action, exception);
        }
        resultEvent = syncjob;
    }
}
