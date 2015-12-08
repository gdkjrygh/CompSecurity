// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.Agents;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.broker.LeaderboardAgent;
import com.google.android.gms.games.broker.Lockable;
import com.google.android.gms.games.broker.MultiplayerAgent;
import com.google.android.gms.games.broker.PlayerAgent;
import com.google.android.gms.games.cache.LeaderboardScoreCache;
import com.google.android.gms.games.cache.PlayerCache;
import com.google.android.gms.games.internal.data.GamesDataChangeUris;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class PeopleChangedOperation
    implements com.google.android.gms.games.service.PlayGamesAsyncService.Operation
{

    public PeopleChangedOperation()
    {
    }

    public final void execute(Context context, DataBroker databroker)
    {
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mLeaderboardAgent
        });
        databroker.mLeaderboardAgent.mScoreCache.clear();
        Object obj;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mLeaderboardAgent
        });
        obj = databroker.getClientContextsForAllDatastores(context);
        DataBroker.acquireLocks(databroker.mPlayerAgent.mCacheLockables);
        Object obj1 = databroker.mPlayerAgent;
        int i = 0;
_L2:
        if (i >= 8)
        {
            break; /* Loop/switch isn't completed */
        }
        ((PlayerAgent) (obj1)).mCacheLockables[i].assertLockedByCurrentThread();
        i++;
        if (true) goto _L2; else goto _L1
        context;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mLeaderboardAgent
        });
        throw context;
_L1:
        Iterator iterator;
        ((PlayerAgent) (obj1)).mCache.clear();
        iterator = ((HashSet) (obj)).iterator();
_L4:
        GamesClientContext gamesclientcontext;
        PlayerAgent playeragent;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_399;
            }
            gamesclientcontext = databroker.getBackgroundGamesContext(context, (ClientContext)iterator.next());
            playeragent = databroker.mPlayerAgent;
            obj1 = PlayerAgent.getConnectedPeopleClient(gamesclientcontext);
        } while (obj1 == null);
        Context context1;
        Map map;
        ArrayList arraylist;
        ArrayList arraylist1;
        Object obj2;
        context1 = gamesclientcontext.mContext;
        map = PlayerAgent.getCircledState(context1, gamesclientcontext.mClientContext);
        obj2 = new HashSet(map.keySet());
        ((Set) (obj2)).addAll(PlayerAgent.getCachedPlayerIds(playeragent.mCache));
        ((Set) (obj2)).addAll(PlayerAgent.getCachedPlayerIds(playeragent.mNearbyCache));
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        obj2 = ((Set) (obj2)).iterator();
_L3:
        String s;
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break MISSING_BLOCK_LABEL_347;
            }
            s = (String)((Iterator) (obj2)).next();
            if (arraylist1.size() < 50)
            {
                break MISSING_BLOCK_LABEL_336;
            }
            playeragent.addCircleUpdateOps(gamesclientcontext, arraylist1, map, arraylist, ((GoogleApiClient) (obj1)));
            arraylist1.clear();
        } while (true);
        context;
        ((GoogleApiClient) (obj1)).disconnect();
        throw context;
        context;
        DataBroker.releaseLocks(databroker.mPlayerAgent.mCacheLockables);
        throw context;
        arraylist1.add(s);
          goto _L3
        if (arraylist1.size() > 0)
        {
            playeragent.addCircleUpdateOps(gamesclientcontext, arraylist1, map, arraylist, ((GoogleApiClient) (obj1)));
        }
        if (arraylist.size() > 0)
        {
            Agents.applyContentOperations(context1.getContentResolver(), arraylist, "PlayerAgent");
        }
        ((GoogleApiClient) (obj1)).disconnect();
          goto _L4
        Agents.notifyDataChangeUri(context, GamesDataChangeUris.URI_PLAYERS);
        DataBroker.releaseLocks(databroker.mPlayerAgent.mCacheLockables);
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mMultiplayerAgent
        });
        for (obj = ((HashSet) (obj)).iterator(); ((Iterator) (obj)).hasNext(); MultiplayerAgent.updateInviterStatus(context, (ClientContext)((Iterator) (obj)).next())) { }
        break MISSING_BLOCK_LABEL_477;
        context;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mMultiplayerAgent
        });
        throw context;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mMultiplayerAgent
        });
        return;
    }

    public final void postExecute()
    {
    }
}
