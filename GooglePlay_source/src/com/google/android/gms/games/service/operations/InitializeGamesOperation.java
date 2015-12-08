// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.common.SharedPreferencesCompat;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.util.VersionUtils;
import com.google.android.gms.games.GamesSharedPrefs;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GameAgent;
import com.google.android.gms.games.broker.Lockable;
import java.util.HashSet;
import java.util.Iterator;

public final class InitializeGamesOperation
    implements com.google.android.gms.games.service.PlayGamesAsyncService.Operation
{

    public InitializeGamesOperation()
    {
    }

    public final void execute(Context context, DataBroker databroker)
    {
        databroker.clearRevisionCheck(context);
        databroker.registerForNotifications(context);
        Object obj;
        boolean flag;
        if (GamesSharedPrefs.getSharedPrefs(context).getInt("forcedMetadataRefreshVersion", 0) >= 0x4c4b40)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        obj = databroker.getClientContextsForAllDatastores(context);
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mGameAgent
        });
        for (obj = ((HashSet) (obj)).iterator(); ((Iterator) (obj)).hasNext(); GameAgent.refreshAllGameMetadata(context, (ClientContext)((Iterator) (obj)).next())) { }
        break MISSING_BLOCK_LABEL_108;
        context;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mGameAgent
        });
        throw context;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mGameAgent
        });
        context = GamesSharedPrefs.getSharedPrefs(context).edit();
        context.putInt("forcedMetadataRefreshVersion", VersionUtils.getVersionCode());
        SharedPreferencesCompat.apply(context);
    }

    public final void postExecute()
    {
    }
}
