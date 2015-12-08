// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.Intent;
import android.content.SyncResult;
import android.content.SyncStats;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncRequest, LegacySyncJob, ApiSyncResult, ApiSyncer, 
//            SyncJob

class LegacySyncRequest
    implements SyncRequest
{
    static class Factory
    {

        private final LegacySyncJob.Factory collectionSyncRequestFactory;

        LegacySyncRequest create(Intent intent)
        {
            return new LegacySyncRequest(intent, collectionSyncRequestFactory);
        }

        Factory(LegacySyncJob.Factory factory)
        {
            collectionSyncRequestFactory = factory;
        }
    }


    private final String action;
    private final boolean isUIRequest;
    private final List legacySyncItems = new ArrayList();
    private final Set requestsRemaining;
    private final Bundle resultData = new Bundle();
    private final ResultReceiver resultReceiver;
    private final SyncResult syncAdapterResult = new SyncResult();

    LegacySyncRequest(Intent intent, LegacySyncJob.Factory factory)
    {
        resultReceiver = (ResultReceiver)intent.getParcelableExtra("com.soundcloud.android.sync.extra.STATUS_RECEIVER");
        isUIRequest = intent.getBooleanExtra("com.soundcloud.android.sync.extra.IS_UI_REQUEST", false);
        action = intent.getAction();
        ArrayList arraylist = intent.getParcelableArrayListExtra("com.soundcloud.android.sync.extra.SYNC_URIS");
        Object obj = arraylist;
        if (arraylist == null)
        {
            obj = new ArrayList();
        }
        if (intent.getData() != null)
        {
            ((ArrayList) (obj)).add(intent.getData());
        }
        for (intent = ((ArrayList) (obj)).iterator(); intent.hasNext(); legacySyncItems.add(factory.create(((Uri) (obj)), action, isUIRequest)))
        {
            obj = (Uri)intent.next();
        }

        requestsRemaining = new HashSet(legacySyncItems);
    }

    private boolean isSuccess()
    {
        for (Iterator iterator = legacySyncItems.iterator(); iterator.hasNext();)
        {
            LegacySyncJob legacysyncjob = (LegacySyncJob)iterator.next();
            if (!legacysyncjob.getResult().success)
            {
                String s = ApiSyncer.TAG;
                (new StringBuilder("collection sync request ")).append(legacysyncjob).append(" not successful");
                return false;
            }
        }

        return true;
    }

    public void finish()
    {
label0:
        {
            if (resultReceiver != null)
            {
                if (!isSuccess())
                {
                    break label0;
                }
                ResultReceiver resultreceiver = resultReceiver;
                byte byte0;
                if ("com.soundcloud.android.sync.action.APPEND".equals(action))
                {
                    byte0 = 5;
                } else
                {
                    byte0 = 3;
                }
                resultreceiver.send(byte0, resultData);
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.soundcloud.android.sync.extra.SYNC_RESULT", syncAdapterResult);
        ResultReceiver resultreceiver1 = resultReceiver;
        byte byte1;
        if ("com.soundcloud.android.sync.action.APPEND".equals(action))
        {
            byte1 = 4;
        } else
        {
            byte1 = 2;
        }
        resultreceiver1.send(byte1, bundle);
    }

    public Collection getPendingJobs()
    {
        return legacySyncItems;
    }

    public boolean isHighPriority()
    {
        return isUIRequest;
    }

    public boolean isSatisfied()
    {
        return requestsRemaining.isEmpty();
    }

    public boolean isWaitingForJob(SyncJob syncjob)
    {
        return requestsRemaining.contains(syncjob);
    }

    public void processJobResult(SyncJob syncjob)
    {
        syncjob = (LegacySyncJob)syncjob;
        Object obj = requestsRemaining.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            LegacySyncJob legacysyncjob = (LegacySyncJob)((Iterator) (obj)).next();
            if (legacysyncjob.equals(syncjob) && legacysyncjob != syncjob)
            {
                legacysyncjob.setResult(syncjob.getResult());
            }
        } while (true);
        requestsRemaining.remove(syncjob);
        obj = resultData;
        String s = syncjob.getContentUri().toString();
        boolean flag;
        if (isUIRequest)
        {
            if (syncjob.getResult().change != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        if (syncjob.getResult().change == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((Bundle) (obj)).putBoolean(s, flag);
        if (!syncjob.getResult().success)
        {
            SyncStats syncstats = syncAdapterResult.stats;
            syncstats.numAuthExceptions = syncstats.numAuthExceptions + syncjob.getResult().syncResult.stats.numAuthExceptions;
            syncstats = syncAdapterResult.stats;
            syncstats.numIoExceptions = syncstats.numIoExceptions + syncjob.getResult().syncResult.stats.numIoExceptions;
            syncstats = syncAdapterResult.stats;
            syncstats.numParseExceptions = syncstats.numParseExceptions + syncjob.getResult().syncResult.stats.numParseExceptions;
            syncAdapterResult.delayUntil = Math.max(syncjob.getResult().syncResult.delayUntil, syncAdapterResult.delayUntil);
        }
    }
}
