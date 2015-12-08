// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.entities;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.sync.SyncJob;
import com.soundcloud.android.sync.SyncRequest;
import com.soundcloud.android.sync.SyncResult;
import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.soundcloud.android.sync.entities:
//            EntitySyncJob

class EntitySyncRequest
    implements SyncRequest
{

    private final String action;
    private final EntitySyncJob entitySyncJob;
    private final EventBus eventBus;
    private SyncResult resultEvent;
    private final ResultReceiver resultReceiver;

    EntitySyncRequest(EntitySyncJob entitysyncjob, Intent intent, EventBus eventbus, String s, ResultReceiver resultreceiver)
    {
        entitySyncJob = entitysyncjob;
        eventBus = eventbus;
        action = s;
        resultReceiver = resultreceiver;
        setUrnsFromIntent(intent);
    }

    private Bundle getResultBundle()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("syncResult", resultEvent);
        return bundle;
    }

    private void setUrnsFromIntent(Intent intent)
    {
        intent = intent.getParcelableArrayListExtra("urns");
        boolean flag;
        if (intent != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Requested a resource sync without providing urns...");
        entitySyncJob.setUrns(intent);
    }

    public void finish()
    {
        if (resultReceiver != null)
        {
            resultReceiver.send(0, getResultBundle());
        }
        if (!entitySyncJob.getUpdatedEntities().isEmpty())
        {
            eventBus.publish(EventQueue.ENTITY_STATE_CHANGED, EntityStateChangedEvent.fromSync(entitySyncJob.getUpdatedEntities()));
        }
    }

    public Collection getPendingJobs()
    {
        if (isSatisfied())
        {
            return Collections.emptyList();
        } else
        {
            return Collections.singletonList(entitySyncJob);
        }
    }

    public boolean isHighPriority()
    {
        return true;
    }

    public boolean isSatisfied()
    {
        return resultEvent != null;
    }

    public boolean isWaitingForJob(SyncJob syncjob)
    {
        return syncjob.equals(entitySyncJob) && !isSatisfied();
    }

    public void processJobResult(SyncJob syncjob)
    {
        if (syncjob.equals(entitySyncJob))
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
}
