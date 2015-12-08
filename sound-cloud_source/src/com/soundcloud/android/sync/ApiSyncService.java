// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.app.Service;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.os.IBinder;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.tasks.ParallelAsyncTask;
import dagger.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.soundcloud.android.sync:
//            ApiSyncer, SyncRequest, SyncJob, SyncRequestFactory

public class ApiSyncService extends Service
{

    public static final String ACTION_APPEND = "com.soundcloud.android.sync.action.APPEND";
    public static final String ACTION_HARD_REFRESH = "com.soundcloud.android.sync.action.HARD_REFRESH";
    public static final String ACTION_PUSH = "com.soundcloud.android.sync.action.PUSH";
    public static final String EXTRA_IS_UI_REQUEST = "com.soundcloud.android.sync.extra.IS_UI_REQUEST";
    public static final String EXTRA_STATUS_RECEIVER = "com.soundcloud.android.sync.extra.STATUS_RECEIVER";
    public static final String EXTRA_SYNC_RESULT = "com.soundcloud.android.sync.extra.SYNC_RESULT";
    public static final String EXTRA_SYNC_URIS = "com.soundcloud.android.sync.extra.SYNC_URIS";
    public static final String EXTRA_TYPE = "com.soundcloud.android.sync.extra.COLLECTION_TYPE";
    public static final String LOG_TAG = com/soundcloud/android/sync/ApiSyncer.getSimpleName();
    public static final int MAX_TASK_LIMIT = 3;
    public static final int STATUS_APPEND_ERROR = 4;
    public static final int STATUS_APPEND_FINISHED = 5;
    public static final int STATUS_SYNC_ERROR = 2;
    public static final int STATUS_SYNC_FINISHED = 3;
    private int activeTaskCount;
    final LinkedList pendingJobs = new LinkedList();
    final List runningJobs = new ArrayList();
    SyncRequestFactory syncIntentSyncRequestFactory;
    final List syncRequests = new ArrayList();

    public ApiSyncService()
    {
        SoundCloudApplication.getObjectGraph().a(this);
    }

    private void addItemToPendingRequests(SyncRequest syncrequest, SyncJob syncjob)
    {
        (new StringBuilder("Adding sync job to queue : ")).append(syncjob);
        if (syncrequest.isHighPriority())
        {
            pendingJobs.add(0, syncjob);
            return;
        } else
        {
            pendingJobs.add(syncjob);
            return;
        }
    }

    private void finishAllRequests()
    {
        for (Iterator iterator = syncRequests.iterator(); iterator.hasNext(); ((SyncRequest)iterator.next()).finish()) { }
    }

    private void moveRequestToTop(SyncJob syncjob)
    {
        (new StringBuilder("Moving sync job to front of queue : ")).append(syncjob);
        syncjob = (SyncJob)pendingJobs.get(pendingJobs.indexOf(syncjob));
        pendingJobs.remove(syncjob);
        pendingJobs.addFirst(syncjob);
    }

    void enqueueRequest(SyncRequest syncrequest)
    {
        syncRequests.add(syncrequest);
        Iterator iterator = syncrequest.getPendingJobs().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            SyncJob syncjob = (SyncJob)iterator.next();
            if (!runningJobs.contains(syncjob))
            {
                if (!pendingJobs.contains(syncjob))
                {
                    addItemToPendingRequests(syncrequest, syncjob);
                    syncjob.onQueued();
                } else
                if (syncrequest.isHighPriority())
                {
                    moveRequestToTop(syncjob);
                }
            } else
            {
                (new StringBuilder("Job already running for : ")).append(syncjob);
            }
        } while (true);
    }

    void flushSyncRequests()
    {
        if (pendingJobs.isEmpty() && runningJobs.isEmpty())
        {
            finishAllRequests();
            stopSelf();
        } else
        {
            while (activeTaskCount < 3 && !pendingJobs.isEmpty()) 
            {
                SyncJob syncjob = (SyncJob)pendingJobs.poll();
                runningJobs.add(syncjob);
                (new ApiTask(null)).executeOnThreadPool(new SyncJob[] {
                    syncjob
                });
            }
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onDestroy()
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("sync_state", Integer.valueOf(0));
        getContentResolver().update(Content.COLLECTIONS.uri, contentvalues, null, null);
    }

    public void onStart(Intent intent, int i)
    {
        onStart(intent, i);
        (new StringBuilder("startListening(")).append(intent).append(")");
        if (intent != null)
        {
            enqueueRequest(syncIntentSyncRequestFactory.create(intent));
        }
        flushSyncRequests();
    }

    void onSyncJobCompleted(SyncJob syncjob)
    {
        Iterator iterator = (new ArrayList(syncRequests)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            SyncRequest syncrequest = (SyncRequest)iterator.next();
            if (syncrequest.isWaitingForJob(syncjob))
            {
                syncrequest.processJobResult(syncjob);
                if (syncrequest.isSatisfied())
                {
                    syncrequest.finish();
                    syncRequests.remove(syncrequest);
                }
            }
        } while (true);
        runningJobs.remove(syncjob);
    }



/*
    static int access$108(ApiSyncService apisyncservice)
    {
        int i = apisyncservice.activeTaskCount;
        apisyncservice.activeTaskCount = i + 1;
        return i;
    }

*/


/*
    static int access$110(ApiSyncService apisyncservice)
    {
        int i = apisyncservice.activeTaskCount;
        apisyncservice.activeTaskCount = i - 1;
        return i;
    }

*/
}
