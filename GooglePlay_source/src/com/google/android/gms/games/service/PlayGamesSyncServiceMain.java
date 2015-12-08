// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.content.SyncStats;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.chimera.GcmTaskService;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.Agents;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.gcm.GcmNetworkManager;
import com.google.android.gms.gcm.TaskParams;

// Referenced classes of package com.google.android.gms.games.service:
//            GamesSyncAdapter

public class PlayGamesSyncServiceMain extends GcmTaskService
{

    private static GamesSyncAdapter sSyncAdapter = null;
    private static final Object sSyncAdapterLock = new Object();

    public PlayGamesSyncServiceMain()
    {
    }

    static void requestSync(Context context, ClientContext clientcontext)
    {
        GamesLog.d("GamesSyncServiceMain", "Requesting periodic sync");
        com.google.android.gms.gcm.PeriodicTask.Builder builder = (new com.google.android.gms.gcm.PeriodicTask.Builder()).setService("com.google.android.gms.games.chimera.GamesSyncServiceMainProxy");
        builder.periodInSeconds = ((Long)G.periodicSyncPeriodSecondsV2.get()).longValue();
        builder = builder.setRequiresCharging$24191f8f().setExtras(GamesSyncAdapter.SYNC_EXTRAS_PERIODIC);
        builder.flexInSeconds = ((Long)G.periodicSyncFlexSeconds.get()).longValue();
        clientcontext = builder.setUpdateCurrent$24191f8f().setTag(String.format("GamesSyncServiceMain:%s", new Object[] {
            clientcontext.getResolvedAccountName()
        })).build();
        GcmNetworkManager.getInstance(context).schedule(clientcontext);
    }

    public IBinder onBind(Intent intent)
    {
        return sSyncAdapter.getSyncAdapterBinder();
    }

    public void onCreate()
    {
        GservicesValue.init(getApplicationContext());
        synchronized (sSyncAdapterLock)
        {
            if (sSyncAdapter == null)
            {
                sSyncAdapter = new GamesSyncAdapter(getApplicationContext());
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int onRunTask(TaskParams taskparams)
    {
        Object obj1 = getApplicationContext();
        Object obj = taskparams.tag.split(":");
        if (obj.length != 2)
        {
            GamesLog.i("GamesSyncServiceMain", "Found unexpected GCM tag when scheduling; aborting");
            obj = null;
        } else
        {
            obj = Agents.buildFirstPartyClientContext(((Context) (obj1)), obj[1]);
        }
        if (obj == null)
        {
            GamesLog.w("GamesSyncServiceMain", "Failed to execute periodic sync, missing client context - aborting");
        } else
        {
            if (((Context) (obj1)).getContentResolver().acquireContentProviderClient("com.google.android.gms.games.background") == null)
            {
                GamesLog.w("GamesSyncServiceMain", "Failed to execute periodic sync, missing context provider - aborting");
                return 2;
            }
            taskparams = taskparams.extras;
            if (taskparams == null || taskparams.isEmpty())
            {
                GamesLog.w("GamesSyncServiceMain", "Failed to execute periodic sync, missing extras - aborting");
                return 2;
            }
            obj1 = new GamesSyncAdapter.GamesSyncResult();
            sSyncAdapter.checkAndPerformSync$3950bc19(((ClientContext) (obj)).mResolvedAccount, taskparams, "com.google.android.gms.games.background", ((GamesSyncAdapter.GamesSyncResult) (obj1)));
            if (((GamesSyncAdapter.GamesSyncResult) (obj1)).syncResult.stats.numIoExceptions > 0L)
            {
                return 1;
            }
            GamesLog.d("GamesSyncServiceMain", "Periodic sync complete");
            if (!((GamesSyncAdapter.GamesSyncResult) (obj1)).syncResult.hasHardError())
            {
                return 0;
            }
        }
        return 2;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (intent == null)
        {
            GamesLog.w("GamesSyncServiceMain", "Received null intent during sync; aborting");
            stopSelf(j);
            return 2;
        } else
        {
            return super.onStartCommand(intent, i, j);
        }
    }

}
