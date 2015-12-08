// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import com.soundcloud.android.tasks.ParallelAsyncTask;

// Referenced classes of package com.soundcloud.android.sync:
//            ApiSyncService, SyncJob

private class <init> extends ParallelAsyncTask
{

    final ApiSyncService this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((SyncJob[])aobj);
    }

    protected transient Void doInBackground(SyncJob asyncjob[])
    {
        int j = asyncjob.length;
        for (int i = 0; i < j; i++)
        {
            SyncJob syncjob = asyncjob[i];
            syncjob.run();
            publishProgress(new SyncJob[] {
                syncjob
            });
        }

        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        int _tmp = ApiSyncService.access$110(ApiSyncService.this);
        flushSyncRequests();
    }

    protected void onPreExecute()
    {
        int _tmp = ApiSyncService.access$108(ApiSyncService.this);
    }

    protected transient void onProgressUpdate(SyncJob asyncjob[])
    {
        int j = asyncjob.length;
        for (int i = 0; i < j; i++)
        {
            SyncJob syncjob = asyncjob[i];
            onSyncJobCompleted(syncjob);
        }

    }

    protected volatile void onProgressUpdate(Object aobj[])
    {
        onProgressUpdate((SyncJob[])aobj);
    }

    private ()
    {
        this$0 = ApiSyncService.this;
        super();
    }

    t>(t> t>)
    {
        this();
    }
}
