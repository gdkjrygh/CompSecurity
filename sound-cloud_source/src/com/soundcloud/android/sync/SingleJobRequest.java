// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.sync.likes.DefaultSyncJob;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.Arrays;
import java.util.Collection;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncRequest, SyncJob, SyncResult

public class SingleJobRequest
    implements SyncRequest
{

    public final String action;
    private final EventBus eventBus;
    private final boolean isHighPriority;
    public SyncResult resultEvent;
    private final ResultReceiver resultReceiver;
    private final DefaultSyncJob syncJob;

    public SingleJobRequest(DefaultSyncJob defaultsyncjob, String s, boolean flag, ResultReceiver resultreceiver, EventBus eventbus)
    {
        syncJob = defaultsyncjob;
        action = s;
        isHighPriority = flag;
        resultReceiver = resultreceiver;
        eventBus = eventbus;
    }

    private Bundle getResultBundle()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("syncResult", resultEvent);
        return bundle;
    }

    public void finish()
    {
        resultReceiver.send(0, getResultBundle());
        eventBus.publish(EventQueue.SYNC_RESULT, resultEvent);
    }

    public Collection getPendingJobs()
    {
        return Arrays.asList(new DefaultSyncJob[] {
            syncJob
        });
    }

    public boolean isHighPriority()
    {
        return isHighPriority;
    }

    public boolean isSatisfied()
    {
        return resultEvent != null;
    }

    public boolean isWaitingForJob(SyncJob syncjob)
    {
        return syncJob.equals(syncjob) && resultEvent == null;
    }

    public void processJobResult(SyncJob syncjob)
    {
        if (syncjob.getException() == null)
        {
            syncjob = SyncResult.success(action, syncjob.resultedInAChange());
        } else
        {
            syncjob = SyncResult.failure(action, syncjob.getException());
        }
        resultEvent = syncjob;
    }
}
