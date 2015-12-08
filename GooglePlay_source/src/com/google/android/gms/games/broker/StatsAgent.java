// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.BaseApiaryServer;
import com.google.android.gms.common.server.error.ErrorUtils;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.server.api.StatsApi;
import com.google.android.gms.games.server.api.StatsResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, GamesClientContext, ApiRateLimitUtil, Agents

final class StatsAgent extends Lockable
{

    private static final Lockable.LockableLock LOCK = new Lockable.LockableLock();
    private final StatsApi mStatsApi;

    public StatsAgent(Lockable lockable, BaseApiaryServer baseapiaryserver)
    {
        super("StatsAgent", LOCK, lockable);
        mStatsApi = new StatsApi(baseapiaryserver);
    }

    private static void addRawValues(StatsResponse statsresponse, Bundle bundle)
        throws IOException, JSONException
    {
        statsresponse = FastJsonResponse.getUnzippedStream(statsresponse.getResponseBody());
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        IOUtils.copyStream(statsresponse, bytearrayoutputstream, true, 1024);
        statsresponse = new JSONObject(new String(bytearrayoutputstream.toByteArray()));
        String s;
        for (Iterator iterator = statsresponse.keys(); iterator.hasNext(); bundle.putString(s, statsresponse.getString(s)))
        {
            s = (String)iterator.next();
        }

        bundle.remove("kind");
        for (statsresponse = StatsResponse.sFields.keySet().iterator(); statsresponse.hasNext(); bundle.remove((String)statsresponse.next())) { }
    }

    public final DataHolder loadPlayerStats(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        android.net.Uri uri;
        int i;
        boolean flag;
        flag = false;
        uri = com.google.android.gms.games.provider.GamesContractInternal.PlayerStats.getUriForGamesContext(gamesclientcontext);
        i = ((flag) ? 1 : 0);
        if (ApiRateLimitUtil.isUriRateLimited(uri, 0x1b7740L, gamesclientcontext.mForceReload)) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Object obj3;
        obj = new ArrayList(1);
        obj1 = mStatsApi;
        com.google.android.gms.common.internal.ClientContext clientcontext = gamesclientcontext.mClientContext;
        obj3 = (StatsResponse)((StatsApi) (obj1)).mServer.getResponseBlocking(clientcontext, 0, "stats", null, com/google/android/gms/games/server/api/StatsResponse);
        obj1 = new Bundle();
        addRawValues(((StatsResponse) (obj3)), ((Bundle) (obj1)));
_L6:
        Object obj2;
        obj2 = new ContentValues();
        ((ContentValues) (obj2)).putAll(((FastContentValuesJsonResponse) (obj3)).mValues);
        ((ContentValues) (obj2)).put("game_id", Long.valueOf(gamesclientcontext.resolveOwningGameId()));
        ((ContentValues) (obj2)).put("player_id", Long.valueOf(gamesclientcontext.resolveCurrentPlayerId()));
        if (((Bundle) (obj1)).size() <= 0) goto _L4; else goto _L3
_L3:
        StringBuilder stringbuilder;
        obj3 = new StringBuilder();
        stringbuilder = new StringBuilder();
        String s;
        for (Iterator iterator = ((Bundle) (obj1)).keySet().iterator(); iterator.hasNext(); stringbuilder.append(((Bundle) (obj1)).getString(s)).append(","))
        {
            s = (String)iterator.next();
            ((StringBuilder) (obj3)).append(s).append(",");
        }

          goto _L5
        obj;
        ErrorUtils.parseAndLogErrorResponse(((VolleyError) (obj)), "StatsAgent");
        i = 500;
_L2:
        gamesclientcontext = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(uri);
        gamesclientcontext.mStatusCode = i;
        return gamesclientcontext.query();
        obj2;
        GamesLog.w("StatsAgent", "Failed to parse response - ignoring unknown values", ((Throwable) (obj2)));
          goto _L6
        obj2;
        GamesLog.w("StatsAgent", "Failed to parse response - ignoring unknown values", ((Throwable) (obj2)));
          goto _L6
_L5:
        ((StringBuilder) (obj3)).deleteCharAt(((StringBuilder) (obj3)).length() - 1);
        stringbuilder.deleteCharAt(stringbuilder.length() - 1);
        ((ContentValues) (obj2)).put("unknown_raw_keys", ((StringBuilder) (obj3)).toString());
        ((ContentValues) (obj2)).put("unknown_raw_values", stringbuilder.toString());
_L4:
        ((ArrayList) (obj)).add(ContentProviderOperation.newInsert(com.google.android.gms.games.provider.GamesContractInternal.PlayerStats.getContentUri(gamesclientcontext.mClientContext)).withValues(((ContentValues) (obj2))).withYieldAllowed(true).build());
        Agents.applyContentOperations(gamesclientcontext.mContext.getContentResolver(), ((ArrayList) (obj)), "StatsAgent");
        ApiRateLimitUtil.updateUriTimestamp(uri);
        i = ((flag) ? 1 : 0);
          goto _L2
    }

}
