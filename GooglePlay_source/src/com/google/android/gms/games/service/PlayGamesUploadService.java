// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import android.content.SyncResult;
import android.content.SyncStats;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.chimera.GcmTaskService;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.Agents;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.server.error.GamesException;
import com.google.android.gms.gcm.GcmNetworkManager;
import com.google.android.gms.gcm.TaskParams;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.games.service:
//            GamesSyncAdapter

public class PlayGamesUploadService extends GcmTaskService
{

    private static AtomicBoolean mSyncRequested = new AtomicBoolean(false);

    public PlayGamesUploadService()
    {
    }

    public static void requestSync(Context context, ClientContext clientcontext)
    {
        if (mSyncRequested.getAndSet(true))
        {
            return;
        } else
        {
            GamesLog.d("PlayGamesUploadService", "Requesting network sync");
            int i = (int)(((Long)G.syncBufferMillis.get()).longValue() / 1000L);
            int j = Math.max(i, (int)(((Long)G.syncBufferMaxMillis.get()).longValue() / 1000L));
            com.google.android.gms.gcm.OneoffTask.Builder builder = (new com.google.android.gms.gcm.OneoffTask.Builder()).setService("com.google.android.gms.games.chimera.GamesUploadServiceProxy");
            long l = i;
            long l1 = j;
            builder.windowStartSeconds = l;
            builder.windowEndSeconds = l1;
            clientcontext = builder.setTag(String.format("PlayGamesUploadService:%s", new Object[] {
                clientcontext.getResolvedAccountName()
            })).build();
            GcmNetworkManager.getInstance(context).schedule(clientcontext);
            return;
        }
    }

    public final int onRunTask(TaskParams taskparams)
    {
        GamesSyncAdapter.GamesSyncResult gamessyncresult;
        Context context;
        context = getApplicationContext();
        gamessyncresult = new GamesSyncAdapter.GamesSyncResult();
        taskparams = taskparams.tag.split(":");
        if (taskparams.length != 2)
        {
            GamesLog.i("PlayGamesUploadService", "Found unexpected GCM tag when scheduling; aborting");
            taskparams = null;
        } else
        {
            taskparams = Agents.buildFirstPartyClientContext(context, taskparams[1]);
        }
        if (taskparams != null) goto _L2; else goto _L1
_L1:
        GamesLog.w("PlayGamesUploadService", "Failed to execute network upload - aborting");
        mSyncRequested.set(false);
_L5:
        return 2;
_L2:
        DataBroker databroker;
        databroker = DataBroker.acquireBroker(context);
        taskparams = databroker.getBackgroundGamesContext(context, taskparams);
        GamesSyncAdapter.syncPendingData(taskparams, databroker, gamessyncresult, false);
        databroker.release();
_L3:
        if (gamessyncresult.syncResult.stats.numIoExceptions > 0L)
        {
            return 1;
        }
        break MISSING_BLOCK_LABEL_164;
        taskparams;
        taskparams = gamessyncresult.syncResult.stats;
        taskparams.numAuthExceptions = ((SyncStats) (taskparams)).numAuthExceptions + 1L;
        databroker.release();
          goto _L3
        taskparams;
        GamesLog.e("PlayGamesUploadService", ((GamesException) (taskparams)).mLogMessage, taskparams);
        databroker.release();
          goto _L3
        taskparams;
        databroker.release();
        throw taskparams;
        mSyncRequested.set(false);
        GamesLog.d("PlayGamesUploadService", "Network sync complete");
        if (!gamessyncresult.syncResult.hasHardError())
        {
            return 0;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

}
