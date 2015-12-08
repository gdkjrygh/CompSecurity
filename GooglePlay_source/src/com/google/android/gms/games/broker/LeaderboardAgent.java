// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.SyncResult;
import android.content.SyncStats;
import android.content.res.Resources;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.net.Uri;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.provider.QuerySpec;
import com.google.android.gms.common.provider.SelectionArgs;
import com.google.android.gms.common.server.BaseApiaryServer;
import com.google.android.gms.common.server.error.ErrorUtils;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.games.cache.LeaderboardScoreCache;
import com.google.android.gms.games.cache.ScoreCacheKey;
import com.google.android.gms.games.cache.ScoreCacheOwner;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.TimeSpan;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBufferHeader;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;
import com.google.android.gms.games.provider.ColumnSpec;
import com.google.android.gms.games.server.api.Leaderboard;
import com.google.android.gms.games.server.api.LeaderboardEntry;
import com.google.android.gms.games.server.api.LeaderboardListFirstPartyResponse;
import com.google.android.gms.games.server.api.LeaderboardListResponse;
import com.google.android.gms.games.server.api.LeaderboardScores;
import com.google.android.gms.games.server.api.LeaderboardsApi;
import com.google.android.gms.games.server.api.LeaderboardsApiInternal;
import com.google.android.gms.games.server.api.PlayerLeaderboardScore;
import com.google.android.gms.games.server.api.PlayerLeaderboardScoreListResponse;
import com.google.android.gms.games.server.api.PlayerScore;
import com.google.android.gms.games.server.api.PlayerScoreListResponse;
import com.google.android.gms.games.server.api.PlayerScoreResponse;
import com.google.android.gms.games.server.api.PlayerScoreSubmissionList;
import com.google.android.gms.games.server.api.ScoreSubmission;
import com.google.android.gms.games.server.api.ScoresApi;
import com.google.android.gms.games.server.api.ScoresApiInternal;
import com.google.android.gms.games.service.PlayGamesUploadService;
import com.google.android.gms.games.utils.GamesDataUtils;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, TransientCacheOwner, GamesClientContext, Agents, 
//            ApiRateLimitUtil, GamesDroidGuard

public final class LeaderboardAgent extends Lockable
    implements TransientCacheOwner
{
    private static interface PageTokensQuery
    {

        public static final String PROJECTION[] = {
            "top_page_token_next", "window_page_token_next", "window_page_token_prev"
        };

    }

    private static interface PendingScoreQuery
    {

        public static final String PROJECTION[] = {
            "_id", "external_leaderboard_id", "raw_score", "score_tag", "signature", "package_name", "package_uid"
        };

    }


    private static final Lockable.LockableLock LOCK = new Lockable.LockableLock();
    private static final ColumnSpec SCORE_DATA_SPEC;
    private static final String SCORE_ORDER_PROJECTION[] = {
        "score_order"
    };
    private final LeaderboardsApi mLeaderboardsApi;
    private final LeaderboardsApiInternal mLeaderboardsApiInternal;
    public final LeaderboardScoreCache mScoreCache;
    private final ScoresApi mScoresApi;
    private final ScoresApiInternal mScoresApiInternal;

    public LeaderboardAgent(Lockable lockable, BaseApiaryServer baseapiaryserver, BaseApiaryServer baseapiaryserver1)
    {
        super("LeaderboardAgent", LOCK, lockable);
        mLeaderboardsApi = new LeaderboardsApi(baseapiaryserver);
        mLeaderboardsApiInternal = new LeaderboardsApiInternal(baseapiaryserver1);
        mScoresApi = new ScoresApi(baseapiaryserver);
        mScoresApiInternal = new ScoresApiInternal(baseapiaryserver1);
        mScoreCache = new LeaderboardScoreCache(SCORE_DATA_SPEC.mColumnNames);
    }

    private static void addLeaderboardOps(GamesClientContext gamesclientcontext, Leaderboard leaderboard, int i, ArrayList arraylist)
    {
        if (leaderboard == null)
        {
            return;
        }
        int j = arraylist.size();
        leaderboard = ((FastContentValuesJsonResponse) (leaderboard)).mValues;
        leaderboard.put("game_id", Long.valueOf(gamesclientcontext.resolveTargetGameId()));
        if (i >= 0)
        {
            leaderboard.put("sorting_rank", Integer.valueOf(i));
        }
        arraylist.add(ContentProviderOperation.newInsert(com.google.android.gms.games.provider.GamesContractInternal.Leaderboards.getContentUri(gamesclientcontext.mClientContext)).withValues(leaderboard).withYieldAllowed(true).build());
        gamesclientcontext = com.google.android.gms.games.provider.GamesContractInternal.LeaderboardInstances.getContentUri(gamesclientcontext.mClientContext);
        arraylist.add(getInstanceUpsertOp(gamesclientcontext, j, 2, 0));
        arraylist.add(getInstanceUpsertOp(gamesclientcontext, j, 2, 1));
        arraylist.add(getInstanceUpsertOp(gamesclientcontext, j, 1, 0));
        arraylist.add(getInstanceUpsertOp(gamesclientcontext, j, 1, 1));
        arraylist.add(getInstanceUpsertOp(gamesclientcontext, j, 0, 0));
        arraylist.add(getInstanceUpsertOp(gamesclientcontext, j, 0, 1));
    }

    private static void addScoreResponseOps$1cd27a13(ClientContext clientcontext, long l, int i, LeaderboardScores leaderboardscores, ArrayList arraylist)
    {
        Object obj;
        Object obj1;
        ArrayList arraylist1 = leaderboardscores.getItems();
        int j;
        int k;
        long l1;
        if (arraylist1 != null)
        {
            j = arraylist1.size();
        } else
        {
            j = 0;
        }
        obj = leaderboardscores.getNextPageToken();
        obj1 = leaderboardscores.getPrevPageToken();
        l1 = DefaultClock.getInstance().currentTimeMillis();
        leaderboardscores = getInstanceValues(leaderboardscores);
        if (i != 0) goto _L2; else goto _L1
_L1:
        leaderboardscores.put("top_page_token_next", ((String) (obj)));
_L4:
        arraylist.add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.GamesContractInternal.LeaderboardInstances.getUriForId(clientcontext, l)).withValues(leaderboardscores).withYieldAllowed(true).build());
        arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.LeaderboardScores.getUriForInstanceId(clientcontext, l)).withSelection("page_type=?", new String[] {
            String.valueOf(i)
        }).build());
        for (k = 0; k < j; k++)
        {
            leaderboardscores = ContentProviderOperation.newInsert(com.google.android.gms.games.provider.GamesContractInternal.LeaderboardScores.getContentUri(clientcontext));
            obj1 = (LeaderboardEntry)arraylist1.get(k);
            obj = ((FastContentValuesJsonResponse) (obj1)).mValues;
            ((ContentValues) (obj)).put("instance_id", Long.valueOf(l));
            ((ContentValues) (obj)).put("page_type", Integer.valueOf(i));
            obj1 = ((LeaderboardEntry) (obj1)).getPlayer();
            leaderboardscores.withValueBackReference("player_id", arraylist.size());
            arraylist.add(Agents.getPlayerUpsertOp(clientcontext, ((FastContentValuesJsonResponse) (obj1)).mValues, l1));
            arraylist.add(leaderboardscores.withValues(((ContentValues) (obj))).build());
        }

        break; /* Loop/switch isn't completed */
_L2:
        if (i == 1)
        {
            leaderboardscores.put("window_page_token_next", ((String) (obj)));
            leaderboardscores.put("window_page_token_prev", ((String) (obj1)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private LeaderboardScores fetchScoresFromNetwork1P(GamesClientContext gamesclientcontext, String s, int i, int j, int k, int l, String s1, 
            String s2)
        throws GoogleAuthException
    {
        ClientContext clientcontext = gamesclientcontext.mClientContext;
        if (l != 1)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        ScoresApiInternal scoresapiinternal;
        String s4;
        String s6;
        Integer integer;
        Boolean boolean1;
        Object obj;
        StringBuilder stringbuilder;
        try
        {
            scoresapiinternal = mScoresApiInternal;
            String s3 = LeaderboardCollection.fromInt(j);
            String s5 = TimeSpan.fromInt(i);
            integer = Integer.valueOf(k);
            boolean1 = Boolean.valueOf(Agents.isPlusRequired$9c10cfc());
            obj = Boolean.valueOf(true);
            stringbuilder = new StringBuilder();
            (new Formatter(stringbuilder)).format("leaderboards/%1$s/window/%2$s", new Object[] {
                ScoresApiInternal.enc(s), ScoresApiInternal.enc(s3)
            });
            ScoresApiInternal.append(stringbuilder, "timeSpan", ScoresApiInternal.enc(s5));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            GamesLog.w("LeaderboardAgent", (new StringBuilder("Failed to retrieve leaderboard scores for ")).append(gamesclientcontext.mExternalTargetGameId).append(" ").append(s).append(" ").append(TimeSpan.fromInt(i)).toString(), s1);
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(s1, "LeaderboardAgent");
            }
            return null;
        }
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        ScoresApiInternal.append(stringbuilder, "language", ScoresApiInternal.enc(s2));
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        ScoresApiInternal.append(stringbuilder, "maxResults", String.valueOf(integer));
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        ScoresApiInternal.append(stringbuilder, "pageToken", ScoresApiInternal.enc(s1));
        if (boolean1 == null)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        ScoresApiInternal.append(stringbuilder, "plusRequired", String.valueOf(boolean1));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        ScoresApiInternal.append(stringbuilder, "returnTopIfAbsent", String.valueOf(obj));
        s1 = stringbuilder.toString();
        return (LeaderboardScores)scoresapiinternal.mServer.getResponseBlocking(clientcontext, 0, s1, null, com/google/android/gms/games/server/api/LeaderboardScores);
        scoresapiinternal = mScoresApiInternal;
        s4 = LeaderboardCollection.fromInt(j);
        s6 = TimeSpan.fromInt(i);
        integer = Integer.valueOf(k);
        boolean1 = Boolean.valueOf(Agents.isPlusRequired$9c10cfc());
        obj = new StringBuilder();
        (new Formatter(((Appendable) (obj)))).format("leaderboards/%1$s/scores/%2$s", new Object[] {
            ScoresApiInternal.enc(s), ScoresApiInternal.enc(s4)
        });
        ScoresApiInternal.append(((StringBuilder) (obj)), "timeSpan", ScoresApiInternal.enc(s6));
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_335;
        }
        ScoresApiInternal.append(((StringBuilder) (obj)), "language", ScoresApiInternal.enc(s2));
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_353;
        }
        ScoresApiInternal.append(((StringBuilder) (obj)), "maxResults", String.valueOf(integer));
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_371;
        }
        ScoresApiInternal.append(((StringBuilder) (obj)), "pageToken", ScoresApiInternal.enc(s1));
        if (boolean1 == null)
        {
            break MISSING_BLOCK_LABEL_389;
        }
        ScoresApiInternal.append(((StringBuilder) (obj)), "plusRequired", String.valueOf(boolean1));
        s1 = ((StringBuilder) (obj)).toString();
        s1 = (LeaderboardScores)scoresapiinternal.mServer.getResponseBlocking(clientcontext, 0, s1, null, com/google/android/gms/games/server/api/LeaderboardScores);
        return s1;
    }

    private LeaderboardScores fetchScoresFromNetwork3P(GamesClientContext gamesclientcontext, String s, int i, int j, int k, int l, String s1, 
            String s2)
        throws GoogleAuthException
    {
        if (l != 1)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        ScoresApi scoresapi;
        ClientContext clientcontext;
        String s4;
        String s6;
        Integer integer;
        Object obj;
        StringBuilder stringbuilder;
        try
        {
            scoresapi = mScoresApi;
            clientcontext = gamesclientcontext.mClientContext;
            String s3 = LeaderboardCollection.fromInt(j);
            String s5 = TimeSpan.fromInt(i);
            integer = Integer.valueOf(k);
            obj = Boolean.valueOf(true);
            stringbuilder = new StringBuilder();
            (new Formatter(stringbuilder)).format("leaderboards/%1$s/window/%2$s", new Object[] {
                ScoresApi.enc(s), ScoresApi.enc(s3)
            });
            ScoresApi.append(stringbuilder, "timeSpan", ScoresApi.enc(s5));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            GamesLog.w("LeaderboardAgent", (new StringBuilder("Failed to retrieve leaderboard scores for ")).append(gamesclientcontext.mExternalTargetGameId).append(" ").append(s).append(" ").append(TimeSpan.fromInt(i)).toString(), s1);
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(s1, "LeaderboardAgent");
            }
            return null;
        }
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        ScoresApi.append(stringbuilder, "language", ScoresApi.enc(s2));
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        ScoresApi.append(stringbuilder, "maxResults", String.valueOf(integer));
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        ScoresApi.append(stringbuilder, "pageToken", ScoresApi.enc(s1));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        ScoresApi.append(stringbuilder, "returnTopIfAbsent", String.valueOf(obj));
        s1 = stringbuilder.toString();
        return (LeaderboardScores)scoresapi.mServer.getResponseBlocking(clientcontext, 0, s1, null, com/google/android/gms/games/server/api/LeaderboardScores);
        scoresapi = mScoresApi;
        clientcontext = gamesclientcontext.mClientContext;
        s4 = LeaderboardCollection.fromInt(j);
        s6 = TimeSpan.fromInt(i);
        integer = Integer.valueOf(k);
        obj = new StringBuilder();
        (new Formatter(((Appendable) (obj)))).format("leaderboards/%1$s/scores/%2$s", new Object[] {
            ScoresApi.enc(s), ScoresApi.enc(s4)
        });
        ScoresApi.append(((StringBuilder) (obj)), "timeSpan", ScoresApi.enc(s6));
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_307;
        }
        ScoresApi.append(((StringBuilder) (obj)), "language", ScoresApi.enc(s2));
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        ScoresApi.append(((StringBuilder) (obj)), "maxResults", String.valueOf(integer));
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_343;
        }
        ScoresApi.append(((StringBuilder) (obj)), "pageToken", ScoresApi.enc(s1));
        s1 = ((StringBuilder) (obj)).toString();
        s1 = (LeaderboardScores)scoresapi.mServer.getResponseBlocking(clientcontext, 0, s1, null, com/google/android/gms/games/server/api/LeaderboardScores);
        return s1;
    }

    private long forceResolveLeaderboardId(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        Leaderboard leaderboard;
        try
        {
            leaderboard = mLeaderboardsApi.getBlocking(gamesclientcontext.mClientContext, s, Agents.getLocaleString(gamesclientcontext.mContext));
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            GamesLog.e("LeaderboardAgent", (new StringBuilder("Unable to retrieve leaderboard ")).append(s).toString());
            return -1L;
        }
        s = new ArrayList();
        addLeaderboardOps(gamesclientcontext, leaderboard, -1, s);
        if (s.size() != 0)
        {
            if ((gamesclientcontext = Agents.applyContentOperationsWithResult(gamesclientcontext.mContext.getContentResolver(), s, "LeaderboardAgent")).size() > 0)
            {
                gamesclientcontext = ((ContentProviderResult)gamesclientcontext.get(0)).uri;
                Asserts.checkNotNull(gamesclientcontext);
                return ContentUris.parseId(gamesclientcontext);
            }
        }
        return -1L;
    }

    private static ContentProviderOperation getInstanceUpsertOp(Uri uri, int i, int j, int k)
    {
        return ContentProviderOperation.newInsert(uri).withValueBackReference("leaderboard_id", i).withValue("timespan", Integer.valueOf(j)).withValue("collection", Integer.valueOf(k)).build();
    }

    private static ContentValues getInstanceValues(LeaderboardScores leaderboardscores)
    {
        ContentValues contentvalues = new ContentValues();
        Object obj = leaderboardscores.getPlayerScore();
        if (obj != null)
        {
            obj = ((FastContentValuesJsonResponse) (obj)).mValues;
            Agents.remapField(((ContentValues) (obj)), "display_score", contentvalues, "player_display_score");
            Agents.remapField(((ContentValues) (obj)), "raw_score", contentvalues, "player_raw_score");
            Agents.remapField(((ContentValues) (obj)), "display_rank", contentvalues, "player_display_rank");
            Agents.remapField(((ContentValues) (obj)), "rank", contentvalues, "player_rank");
            Agents.remapField(((ContentValues) (obj)), "score_tag", contentvalues, "player_score_tag");
        } else
        {
            contentvalues.putNull("player_display_score");
            contentvalues.putNull("player_raw_score");
            contentvalues.putNull("player_display_rank");
            contentvalues.putNull("player_rank");
            contentvalues.putNull("player_score_tag");
        }
        contentvalues.put("total_scores", (Long)((FastMapJsonResponse) (leaderboardscores)).mValues.get("numScores"));
        return contentvalues;
    }

    public static DataHolder getLocalLeaderboard(GamesClientContext gamesclientcontext, String s, int i)
    {
        s = com.google.android.gms.games.provider.GamesContractInternal.LeaderboardInstances.getUriForExternalLeaderboardId(gamesclientcontext.mClientContext, s);
        gamesclientcontext = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(s);
        gamesclientcontext.mSortOrder = "sorting_rank,name,external_leaderboard_id,timespan DESC,collection";
        gamesclientcontext.mStatusCode = i;
        return gamesclientcontext.query();
    }

    private void initializeCache(Context context, ClientContext clientcontext, int i, long l, int j, Cursor cursor)
    {
        ArrayList arraylist;
        AbstractWindowedCursor abstractwindowedcursor;
        arraylist = new ArrayList();
        for (; cursor.moveToNext(); arraylist.add(SCORE_DATA_SPEC.extractRowValues(cursor))) { }
        cursor = null;
        Object obj = null;
        clientcontext = com.google.android.gms.games.provider.GamesContractInternal.LeaderboardInstances.getUriForId(clientcontext, l);
        context = (new Agents.QueryBuilder(context)).setQuerySpec(clientcontext);
        context.mProjection = PageTokensQuery.PROJECTION;
        abstractwindowedcursor = context.queryCursor();
        clientcontext = cursor;
        context = obj;
        if (!abstractwindowedcursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch 0 1: default 238
    //                   0 223
    //                   1 152;
           goto _L3 _L4 _L5
_L3:
        throw new IllegalArgumentException((new StringBuilder("Unknown page type ")).append(j).toString());
        context;
        abstractwindowedcursor.close();
        throw context;
_L5:
        clientcontext = abstractwindowedcursor.getString(2);
        context = abstractwindowedcursor.getString(1);
_L2:
        abstractwindowedcursor.close();
        cursor = new ScoreCacheKey(l, j);
        mScoreCache.clearData(cursor);
        mScoreCache.addCacheData(cursor, arraylist, i, clientcontext, context, -1, DefaultClock.getInstance().currentTimeMillis());
        return;
_L4:
        context = abstractwindowedcursor.getString(0);
        clientcontext = cursor;
        if (true) goto _L2; else goto _L6
_L6:
    }

    private void invalidateScoreCache(ClientContext clientcontext, String s)
    {
        clientcontext = new ScoreCacheOwner(clientcontext, s);
        if (mScoreCache.hasCacheOwner(clientcontext))
        {
            mScoreCache.enableCaching(clientcontext);
            mScoreCache.clear();
        }
    }

    private static boolean isNewScoreBetter(Context context, ClientContext clientcontext, String s, long l, long l1)
    {
        int i;
        i = -1;
        clientcontext = com.google.android.gms.games.provider.GamesContractInternal.Leaderboards.getUriForExternalLeaderboardId(clientcontext, s);
        context = (new Agents.QueryBuilder(context)).setQuerySpec(clientcontext);
        context.mProjection = SCORE_ORDER_PROJECTION;
        context = context.queryCursor();
        if (context.moveToFirst())
        {
            i = context.getInt(0);
        }
        context.close();
        if (i != -1) goto _L2; else goto _L1
_L1:
        return true;
        clientcontext;
        context.close();
        throw clientcontext;
_L2:
        i;
        JVM INSTR tableswitch 0 1: default 100
    //                   0 126
    //                   1 135;
           goto _L3 _L4 _L5
_L5:
        continue; /* Loop/switch isn't completed */
_L3:
        throw new IllegalStateException((new StringBuilder("Unknown score order ")).append(i).toString());
_L4:
        if (l1 < l) goto _L1; else goto _L6
_L6:
        return false;
        if (l1 > l) goto _L1; else goto _L7
_L7:
        return false;
    }

    private static void postDeferredScore(GamesClientContext gamesclientcontext, String s, long l, long l1, String s1, String s2)
    {
        String s3;
        Uri uri;
        Object obj;
        long l2;
        long l3;
        s3 = gamesclientcontext.mExternalCurrentPlayerId;
        uri = com.google.android.gms.games.provider.GamesContractInternal.LeaderboardPendingScores.getContentUri(gamesclientcontext.mClientContext);
        obj = new QuerySpec(uri);
        ((QuerySpec) (obj)).addWhere("external_game_id", gamesclientcontext.mExternalTargetGameId);
        ((QuerySpec) (obj)).addWhere("external_leaderboard_id", s);
        ((QuerySpec) (obj)).addWhere("external_player_id", s3);
        l3 = -1L;
        l2 = -1L;
        obj = gamesclientcontext.mContext.getContentResolver().query(uri, PendingScoreQuery.PROJECTION, ((QuerySpec) (obj)).getSelection(), ((QuerySpec) (obj)).mSelectionArgs, null);
        if (((Cursor) (obj)).moveToFirst())
        {
            l3 = ((Cursor) (obj)).getLong(0);
            l2 = ((Cursor) (obj)).getLong(2);
        }
        ((Cursor) (obj)).close();
        if (l3 > 0L)
        {
            if (!isNewScoreBetter(gamesclientcontext.mContext, gamesclientcontext.mClientContext, s, l2, l))
            {
                return;
            } else
            {
                s = new ContentValues();
                s.put("raw_score", Long.valueOf(l));
                s.put("score_tag", s1);
                s.put("signature", s2);
                s1 = com.google.android.gms.games.provider.GamesContractInternal.LeaderboardPendingScores.getUriForId(gamesclientcontext.mClientContext, l3);
                gamesclientcontext.mContext.getContentResolver().update(s1, s, null, null);
                return;
            }
        } else
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("client_context_id", Long.valueOf(Agents.resolveClientContextId(gamesclientcontext.mContext, gamesclientcontext.mClientContext)));
            contentvalues.put("external_game_id", gamesclientcontext.mExternalTargetGameId);
            contentvalues.put("external_leaderboard_id", s);
            contentvalues.put("external_player_id", s3);
            contentvalues.put("raw_score", Long.valueOf(l));
            contentvalues.put("achieved_timestamp", Long.valueOf(l1));
            contentvalues.put("score_tag", s1);
            contentvalues.put("signature", s2);
            gamesclientcontext.mContext.getContentResolver().insert(uri, contentvalues);
            PlayGamesUploadService.requestSync(gamesclientcontext.mContext, gamesclientcontext.mClientContext);
            return;
        }
        gamesclientcontext;
        ((Cursor) (obj)).close();
        throw gamesclientcontext;
    }

    private void storeLeaderboards(GamesClientContext gamesclientcontext, ArrayList arraylist, boolean flag)
    {
        int j = arraylist.size();
        ArrayList arraylist1 = new ArrayList(j + 1);
        ArrayList arraylist2 = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            Leaderboard leaderboard = (Leaderboard)arraylist.get(i);
            if (leaderboard != null)
            {
                arraylist2.add((String)((FastContentValuesJsonResponse) (leaderboard)).mValues.get("external_leaderboard_id"));
                addLeaderboardOps(gamesclientcontext, leaderboard, i, arraylist1);
            }
        }

        if (flag)
        {
            if (arraylist2.size() <= 500)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag, "Attempting to preserve too many leaderboards!");
            arraylist = SelectionArgs.forObjects("external_leaderboard_id NOT IN ", arraylist2);
            arraylist1.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.Leaderboards.getUriForGameId(gamesclientcontext.mClientContext, gamesclientcontext.resolveTargetGameId())).withSelection(arraylist.getSelection(), ((SelectionArgs) (arraylist)).mSelectionArgs).build());
        }
        if (arraylist1.size() > 0)
        {
            Agents.applyContentOperations(gamesclientcontext.mContext.getContentResolver(), arraylist1, "LeaderboardAgent");
        }
    }

    private PlayerScoreResponse submitBlocking(ClientContext clientcontext, String s, long l, String s1, String s2, String s3)
        throws VolleyError, GoogleAuthException
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new ScoreSubmission(s, Long.valueOf(l), s2, s3));
        s = new PlayerScoreSubmissionList(arraylist);
        s2 = mScoresApi;
        s3 = new StringBuilder("leaderboards/scores");
        if (s1 != null)
        {
            ScoresApi.append(s3, "language", ScoresApi.enc(s1));
        }
        s1 = s3.toString();
        clientcontext = (PlayerScoreListResponse)((ScoresApi) (s2)).mServer.getResponseBlocking(clientcontext, 1, s1, s, com/google/android/gms/games/server/api/PlayerScoreListResponse);
        boolean flag;
        if (clientcontext.getSubmittedScores().size() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag, "Should be one score response");
        return (PlayerScoreResponse)clientcontext.getSubmittedScores().get(0);
    }

    public final void clearTransientCaches()
    {
        mScoreCache.clear();
    }

    LeaderboardScores fetchScoresFromNetwork(GamesClientContext gamesclientcontext, String s, int i, int j, int k, int l, String s1, 
            String s2)
        throws GoogleAuthException
    {
        if (gamesclientcontext.mIsFirstParty)
        {
            return fetchScoresFromNetwork1P(gamesclientcontext, s, i, j, k, l, s1, s2);
        } else
        {
            return fetchScoresFromNetwork3P(gamesclientcontext, s, i, j, k, l, s1, s2);
        }
    }

    public final boolean flushPendingScores(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        Context context;
        ArrayList arraylist;
        boolean flag;
        boolean flag1;
        boolean flag2;
        context = gamesclientcontext.mContext;
        gamesclientcontext = gamesclientcontext.mClientContext;
        flag1 = true;
        arraylist = new ArrayList();
        String s1 = Agents.getLocaleString(context);
        String s2 = gamesclientcontext.getResolvedAccountName();
        gamesclientcontext = com.google.android.gms.games.provider.GamesContractInternal.LeaderboardPendingScores.getContentUri(gamesclientcontext);
        String s3;
        Object obj;
        String s4;
        long l;
        long l1;
        if (s == null)
        {
            gamesclientcontext = (new Agents.QueryBuilder(context)).setQuerySpec(gamesclientcontext, "account_name=?", new String[] {
                s2
            });
            gamesclientcontext.mProjection = PendingScoreQuery.PROJECTION;
            gamesclientcontext = gamesclientcontext.queryCursor();
        } else
        {
            gamesclientcontext = (new Agents.QueryBuilder(context)).setQuerySpec(gamesclientcontext, "account_name=? AND external_leaderboard_id=?", new String[] {
                s2, s
            });
            gamesclientcontext.mProjection = PendingScoreQuery.PROJECTION;
            gamesclientcontext = gamesclientcontext.queryCursor();
        }
_L5:
        if (!gamesclientcontext.moveToNext()) goto _L2; else goto _L1
_L1:
        l = gamesclientcontext.getLong(0);
        s = gamesclientcontext.getString(1);
        l1 = gamesclientcontext.getLong(2);
        s3 = gamesclientcontext.getString(3);
        obj = gamesclientcontext.getString(5);
        obj = Agents.restoreClientContext(gamesclientcontext.getInt(6), ((String) (obj)), s2);
        s4 = gamesclientcontext.getString(4);
        submitBlocking(((ClientContext) (obj)), s, l1, s1, s3, s4);
        flag = true;
        invalidateScoreCache(((ClientContext) (obj)), s);
        flag2 = flag1;
_L3:
        flag1 = flag2;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.LeaderboardPendingScores.getUriForId(((ClientContext) (obj)), l)).withYieldAllowed(Agents.shouldAllowYieldAtIndex(arraylist.size())).build());
        flag1 = flag2;
        continue; /* Loop/switch isn't completed */
        s;
        gamesclientcontext.close();
        throw s;
        s;
        flag2 = false;
        if (GamesLog.canLog$134632())
        {
            ErrorUtils.parseAndLogErrorResponse(s, "LeaderboardAgent");
        }
        if (!ErrorUtils.isTransientError(s))
        {
            break MISSING_BLOCK_LABEL_326;
        }
        GamesLog.i("LeaderboardAgent", "Could not submit score, will try again later");
        flag = false;
        continue; /* Loop/switch isn't completed */
        flag = true;
        if (true) goto _L3; else goto _L2
_L2:
        gamesclientcontext.close();
        Agents.applyContentOperations(context.getContentResolver(), arraylist, "LeaderboardAgent");
        return flag1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final DataHolder getLeaderboard(GamesClientContext gamesclientcontext, String s, boolean flag)
        throws GoogleAuthException
    {
        Object obj;
        ArrayList arraylist;
        int i;
        boolean flag1;
        arraylist = null;
        flag1 = false;
        obj = arraylist;
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        obj = mLeaderboardsApi.getBlocking(gamesclientcontext.mClientContext, s, Agents.getLocaleString(gamesclientcontext.mContext));
        i = ((flag1) ? 1 : 0);
_L2:
        arraylist = new ArrayList();
        arraylist.add(obj);
        storeLeaderboards(gamesclientcontext, arraylist, false);
        return getLocalLeaderboard(gamesclientcontext, s, i);
        VolleyError volleyerror;
        volleyerror;
        GamesLog.e("LeaderboardAgent", (new StringBuilder("Unable to retrieve leaderboard ")).append(s).toString());
        i = 3;
        volleyerror = arraylist;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final DataHolder getLeaderboards(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        Uri uri;
        int i;
        boolean flag;
        flag = false;
        uri = com.google.android.gms.games.provider.GamesContractInternal.Leaderboards.getUriForExternalGameId(gamesclientcontext.mClientContext, gamesclientcontext.mExternalTargetGameId);
        i = ((flag) ? 1 : 0);
        if (ApiRateLimitUtil.isUriRateLimited(uri, 0x36ee80L, gamesclientcontext.mForceReload)) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        String s;
        arraylist = new ArrayList();
        s = Agents.getLocaleString(gamesclientcontext.mContext);
        Object obj;
        i = 1;
        obj = null;
          goto _L3
_L6:
        Object obj1;
        if (gamesclientcontext.mIsFirstParty)
        {
            obj1 = mLeaderboardsApiInternal.listBlocking$3fe7d460(gamesclientcontext.mClientContext, gamesclientcontext.mExternalTargetGameId, s, ((String) (obj)), Boolean.valueOf(Agents.isPlusRequired$9c10cfc()));
            obj = ((LeaderboardListFirstPartyResponse) (obj1)).getNextPageToken();
            obj1 = ((LeaderboardListFirstPartyResponse) (obj1)).getItems();
            break MISSING_BLOCK_LABEL_103;
        }
        obj1 = mLeaderboardsApi;
        clientcontext = gamesclientcontext.mClientContext;
        stringbuilder = new StringBuilder("leaderboards");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        LeaderboardsApi.append(stringbuilder, "language", LeaderboardsApi.enc(s));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        LeaderboardsApi.append(stringbuilder, "pageToken", LeaderboardsApi.enc(((String) (obj))));
        obj = stringbuilder.toString();
        obj1 = (LeaderboardListResponse)((LeaderboardsApi) (obj1)).mServer.getResponseBlocking(clientcontext, 0, ((String) (obj)), null, com/google/android/gms/games/server/api/LeaderboardListResponse);
        obj = (String)((FastMapJsonResponse) (obj1)).mValues.get("nextPageToken");
        obj1 = ((LeaderboardListResponse) (obj1)).getItems();
        if (true) goto _L5; else goto _L4
_L7:
        ApiRateLimitUtil.updateUriTimestamp(uri);
        storeLeaderboards(gamesclientcontext, arraylist, true);
        i = ((flag) ? 1 : 0);
_L2:
        obj = com.google.android.gms.games.provider.GamesContractInternal.LeaderboardInstances.getUriForExternalGameId(gamesclientcontext.mClientContext, gamesclientcontext.mExternalTargetGameId);
        gamesclientcontext = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(((Uri) (obj)));
        gamesclientcontext.mSortOrder = "sorting_rank,name,external_leaderboard_id,timespan DESC,collection";
        gamesclientcontext.mStatusCode = i;
        return gamesclientcontext.query();
_L5:
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ClientContext clientcontext;
        StringBuilder stringbuilder;
        try
        {
            arraylist.addAll(((java.util.Collection) (obj1)));
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            GamesLog.e("LeaderboardAgent", "Unable to retrieve leaderboard list", ((Throwable) (obj)));
        }
        i = 3;
        if (true) goto _L2; else goto _L3
_L3:
        if (obj == null && i == 0) goto _L7; else goto _L6
_L4:
        i = 0;
          goto _L3
    }

    public final DataHolder getPlayerScore(GamesClientContext gamesclientcontext, String s, int i, int j)
        throws GoogleAuthException
    {
        Object obj;
        Object obj1;
        long l;
        l = DefaultClock.getInstance().currentTimeMillis();
        obj = gamesclientcontext.mExternalTargetPlayerId;
        Asserts.checkNotNull(obj, "Cannot lookup score for a null player ID!");
        Object obj2;
        try
        {
            ScoresApi scoresapi = mScoresApi;
            obj2 = gamesclientcontext.mClientContext;
            String s1 = TimeSpan.fromInt(i);
            String s2 = LeaderboardCollection.fromInt(j);
            StringBuilder stringbuilder = new StringBuilder();
            (new Formatter(stringbuilder)).format("players/%1$s/leaderboards/%2$s/scores/%3$s", new Object[] {
                ScoresApi.enc(((String) (obj))), ScoresApi.enc(s), ScoresApi.enc(s1)
            });
            ScoresApi.append(stringbuilder, "includeRankType", ScoresApi.enc(s2));
            s1 = stringbuilder.toString();
            obj2 = (PlayerLeaderboardScoreListResponse)scoresapi.mServer.getResponseBlocking(((ClientContext) (obj2)), 0, s1, null, com/google/android/gms/games/server/api/PlayerLeaderboardScoreListResponse);
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            GamesLog.e("LeaderboardAgent", (new StringBuilder("Error getting scores for ")).append(((String) (obj))).toString());
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(gamesclientcontext, "LeaderboardAgent");
            }
            return DataHolder.empty(4);
        }
        obj1 = ((PlayerLeaderboardScoreListResponse) (obj2)).getPlayer();
        Asserts.checkNotNull(obj1);
        i = ((PlayerLeaderboardScoreListResponse) (obj2)).getItems().size();
        if (i == 0)
        {
            return DataHolder.empty(0);
        }
        boolean flag;
        if (i < 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag, String.format("Found multiple entries for player (%s), in leaderboard (%s)", new Object[] {
            obj, s
        }));
        obj = (PlayerLeaderboardScore)((PlayerLeaderboardScoreListResponse) (obj2)).getItems().get(0);
        switch (j)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unrecognized type ")).append(j).toString());

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_620;

        case 0: // '\0'
            s = ((PlayerLeaderboardScore) (obj)).getPublicRank();
            break;
        }
_L1:
        obj = ((FastContentValuesJsonResponse) (obj)).mValues;
        ((ContentValues) (obj)).putAll(((FastContentValuesJsonResponse) (obj1)).mValues);
        Integer integer;
        ArrayList arraylist;
        Object obj3;
        if (s != null)
        {
            ((ContentValues) (obj)).put("rank", (Long)((FastContentValuesJsonResponse) (s)).mValues.get("player_rank"));
            ((ContentValues) (obj)).put("display_rank", (String)((FastContentValuesJsonResponse) (s)).mValues.get("player_display_rank"));
        } else
        {
            ((ContentValues) (obj)).put("rank", Integer.valueOf(-1));
            ((ContentValues) (obj)).put("display_rank", gamesclientcontext.mContext.getResources().getString(0x7f1001c4));
        }
        ((ContentValues) (obj)).putAll(((FastContentValuesJsonResponse) (obj1)).mValues);
        ((ContentValues) (obj)).put("last_updated", Long.valueOf(l));
        Agents.validatePlayerName(gamesclientcontext.mContext, ((ContentValues) (obj)));
        obj3 = com.google.android.gms.games.provider.GamesContractInternal.Images.getContentUri(gamesclientcontext.mClientContext);
        arraylist = new ArrayList(4);
        s = Agents.addInsertImageOp(((Uri) (obj3)), ((ContentValues) (obj)).getAsString("profile_icon_image_url"), arraylist);
        obj1 = Agents.addInsertImageOp(((Uri) (obj3)), ((ContentValues) (obj)).getAsString("profile_hi_res_image_url"), arraylist);
        integer = Agents.addInsertImageOp(((Uri) (obj3)), ((ContentValues) (obj)).getAsString("banner_image_landscape_url"), arraylist);
        obj3 = Agents.addInsertImageOp(((Uri) (obj3)), ((ContentValues) (obj)).getAsString("banner_image_portrait_url"), arraylist);
        gamesclientcontext = Agents.applyContentOperationsWithResult(gamesclientcontext.mContext.getContentResolver(), arraylist, "LeaderboardAgent");
        if (s != null)
        {
            Agents.addImageUriColumn(((ContentValues) (obj)), "profile_icon_image_url", "profile_icon_image_uri", gamesclientcontext, s);
            Agents.addImageUriColumn(((ContentValues) (obj)), "default_display_image_url", "default_display_image_uri", gamesclientcontext, s);
        }
        if (obj1 != null)
        {
            Agents.addImageUriColumn(((ContentValues) (obj)), "profile_hi_res_image_url", "profile_hi_res_image_uri", gamesclientcontext, ((Integer) (obj1)));
        }
        if (integer != null)
        {
            Agents.addImageUriColumn(((ContentValues) (obj)), "banner_image_landscape_url", "banner_image_landscape_uri", gamesclientcontext, integer);
        }
        if (obj3 != null)
        {
            Agents.addImageUriColumn(((ContentValues) (obj)), "banner_image_portrait_url", "banner_image_portrait_uri", gamesclientcontext, ((Integer) (obj3)));
        }
        return DataHolder.builder(SCORE_DATA_SPEC.mColumnNames).withRow(((ContentValues) (obj))).build(0);
        s = ((PlayerLeaderboardScore) (obj)).getSocialRank();
          goto _L1
    }

    final DataHolder getRootPage(GamesClientContext gamesclientcontext, String s, int i, int j, int k, int l)
        throws GoogleAuthException
    {
        Object obj;
        long l1;
        l1 = resolveInstanceId(gamesclientcontext, s, i, j);
        if (l1 == -1L)
        {
            GamesLog.e("LeaderboardAgent", (new StringBuilder("No instance found for leaderboard ")).append(s).append(" for ").append(LeaderboardCollection.fromInt(j)).append(" and ").append(TimeSpan.fromInt(i)).toString());
            return DataHolder.empty(4);
        }
        flushPendingScores(gamesclientcontext, s);
        obj = new ScoreCacheOwner(gamesclientcontext.mClientContext, s);
        mScoreCache.enableCaching(obj);
        obj = new ScoreCacheKey(l1, l);
        if (gamesclientcontext.mForceReload)
        {
            mScoreCache.clearData(obj);
        }
        if (mScoreCache.hasData(obj, DefaultClock.getInstance().currentTimeMillis())) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj2;
        obj1 = Agents.getLocaleString(gamesclientcontext.mContext);
        obj2 = new ArrayList();
        obj1 = fetchScoresFromNetwork(gamesclientcontext, s, i, j, k, l, null, ((String) (obj1)));
        if (obj1 != null)
        {
            addScoreResponseOps$1cd27a13(gamesclientcontext.mClientContext, l1, l, ((LeaderboardScores) (obj1)), ((ArrayList) (obj2)));
        }
        if (((ArrayList) (obj2)).size() > 0)
        {
            Agents.applyContentOperations(gamesclientcontext.mContext.getContentResolver(), ((ArrayList) (obj2)), "LeaderboardAgent");
        }
        obj2 = com.google.android.gms.games.provider.GamesContractInternal.LeaderboardScores.getUriForInstanceId(gamesclientcontext.mClientContext, l1);
        obj2 = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(((Uri) (obj2)), "page_type=?", new String[] {
            String.valueOf(l)
        });
        obj2.mProjection = SCORE_DATA_SPEC.mColumnNames;
        obj2.mSortOrder = "rank ASC";
        obj2 = ((Agents.QueryBuilder) (obj2)).queryCursor();
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        byte byte0;
        if (((AbstractWindowedCursor) (obj2)).getCount() == 0)
        {
            byte0 = 4;
        } else
        {
            byte0 = 3;
        }
_L6:
        initializeCache(gamesclientcontext.mContext, gamesclientcontext.mClientContext, byte0, l1, l, ((Cursor) (obj2)));
        ((AbstractWindowedCursor) (obj2)).close();
_L2:
        gamesclientcontext = LeaderboardScoreBufferHeader.builder().withGameId(gamesclientcontext.mExternalTargetGameId).withLeaderboardId(s).withTimeSpan(i).withLeaderboardCollection(j).withPageType(l).build();
        return mScoreCache.getRootPage(((ScoreCacheKey) (obj)), gamesclientcontext, k);
        gamesclientcontext;
        ((AbstractWindowedCursor) (obj2)).close();
        throw gamesclientcontext;
_L4:
        byte0 = 0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    void loadCachePage(Context context, ClientContext clientcontext, long l, int i, LeaderboardScores leaderboardscores, int j)
    {
        ArrayList arraylist = leaderboardscores.getItems();
        String s;
        String s1;
        Object obj;
        ArrayList arraylist1;
        ArrayList arraylist2;
        Uri uri;
        ArrayList arraylist3;
        int k;
        long l1;
        if (arraylist != null)
        {
            k = arraylist.size();
        } else
        {
            k = 0;
        }
        s = leaderboardscores.getNextPageToken();
        s1 = leaderboardscores.getPrevPageToken();
        l1 = DefaultClock.getInstance().currentTimeMillis();
        leaderboardscores = getInstanceValues(leaderboardscores);
        obj = com.google.android.gms.games.provider.GamesContractInternal.LeaderboardInstances.getUriForId(clientcontext, l);
        context.getContentResolver().update(((Uri) (obj)), leaderboardscores, null, null);
        uri = com.google.android.gms.games.provider.GamesContractInternal.Images.getContentUri(clientcontext);
        clientcontext = new ArrayList(k);
        leaderboardscores = new ArrayList(k);
        obj = new ArrayList(k);
        arraylist1 = new ArrayList(k);
        arraylist2 = new ArrayList(k);
        arraylist3 = new ArrayList(k);
        for (int i1 = 0; i1 < k; i1++)
        {
            LeaderboardEntry leaderboardentry = (LeaderboardEntry)arraylist.get(i1);
            ContentValues contentvalues1 = ((FastContentValuesJsonResponse) (leaderboardentry)).mValues;
            contentvalues1.put("instance_id", Long.valueOf(l));
            contentvalues1.put("page_type", Integer.valueOf(i));
            contentvalues1.putAll(((FastContentValuesJsonResponse) (leaderboardentry.getPlayer())).mValues);
            contentvalues1.put("last_updated", Long.valueOf(l1));
            Agents.validatePlayerName(context, contentvalues1);
            leaderboardscores.add(Agents.addInsertImageOp(uri, contentvalues1.getAsString("profile_icon_image_url"), arraylist3));
            ((ArrayList) (obj)).add(Agents.addInsertImageOp(uri, contentvalues1.getAsString("profile_hi_res_image_url"), arraylist3));
            arraylist1.add(Agents.addInsertImageOp(uri, contentvalues1.getAsString("banner_image_landscape_url"), arraylist3));
            arraylist2.add(Agents.addInsertImageOp(uri, contentvalues1.getAsString("banner_image_portrait_url"), arraylist3));
            clientcontext.add(contentvalues1);
        }

        boolean flag;
        if (leaderboardscores.size() == k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (((ArrayList) (obj)).size() == k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (arraylist1.size() == k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (arraylist2.size() == k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        context = Agents.applyContentOperationsWithResult(context.getContentResolver(), arraylist3, "LeaderboardAgent");
        for (int j1 = 0; j1 < k; j1++)
        {
            ContentValues contentvalues = (ContentValues)clientcontext.get(j1);
            Agents.addImageUriColumn(contentvalues, "profile_icon_image_url", "profile_icon_image_uri", context, (Integer)leaderboardscores.get(j1));
            Agents.addImageUriColumn(contentvalues, "default_display_image_url", "default_display_image_uri", context, (Integer)leaderboardscores.get(j1));
            Agents.addImageUriColumn(contentvalues, "profile_hi_res_image_url", "profile_hi_res_image_uri", context, (Integer)((ArrayList) (obj)).get(j1));
            Agents.addImageUriColumn(contentvalues, "banner_image_landscape_url", "banner_image_landscape_uri", context, (Integer)arraylist1.get(j1));
            Agents.addImageUriColumn(contentvalues, "banner_image_portrait_url", "banner_image_portrait_uri", context, (Integer)arraylist2.get(j1));
        }

        context = new ScoreCacheKey(l, i);
        mScoreCache.addCacheData(context, clientcontext, 0, s1, s, j, l1);
    }

    long resolveInstanceId(GamesClientContext gamesclientcontext, String s, int i, int j)
        throws GoogleAuthException
    {
        if (Agents.resolveExternalId(gamesclientcontext.mContext, com.google.android.gms.games.provider.GamesContractInternal.Leaderboards.getUriForExternalLeaderboardId(gamesclientcontext.mClientContext, s)) == -1L && forceResolveLeaderboardId(gamesclientcontext, s) == -1L)
        {
            return -1L;
        } else
        {
            s = com.google.android.gms.games.provider.GamesContractInternal.LeaderboardInstances.getUriForExternalLeaderboardId(gamesclientcontext.mClientContext, s);
            QuerySpec queryspec = new QuerySpec(s);
            queryspec.addWhere("timespan", String.valueOf(i));
            queryspec.addWhere("collection", String.valueOf(j));
            return Agents.resolveExternalId(gamesclientcontext.mContext, s, queryspec.getSelection(), queryspec.mSelectionArgs);
        }
    }

    public final ScoreSubmissionData submitScore(GamesClientContext gamesclientcontext, String s, long l, long l1, String s1, 
            boolean flag)
        throws GoogleAuthException
    {
        String s2 = gamesclientcontext.mExternalCurrentPlayerId;
        Object obj1 = GamesDroidGuard.getDroidGuardSubmitScoreData(gamesclientcontext, s, l, s1);
        if (!flag)
        {
            postDeferredScore(gamesclientcontext, s, l, l1, s1, ((String) (obj1)));
            return new ScoreSubmissionData(5, s, s2);
        }
        Object obj;
        try
        {
            obj = submitBlocking(gamesclientcontext.mClientContext, s, l, Agents.getLocaleString(gamesclientcontext.mContext), s1, ((String) (obj1)));
            invalidateScoreCache(gamesclientcontext.mClientContext, s);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(((VolleyError) (obj)), "LeaderboardAgent");
            }
            byte byte0 = 6;
            if (ErrorUtils.isTransientError(((VolleyError) (obj))))
            {
                GamesLog.i("LeaderboardAgent", "Could not submit score. Deferring for later");
                byte0 = 5;
                postDeferredScore(gamesclientcontext, s, l, l1, s1, ((String) (obj1)));
            } else
            {
                GamesLog.e("LeaderboardAgent", (new StringBuilder("Encountered a hard error while submitting score for leaderboard ")).append(s).append(" and player ").append(s2).toString());
            }
            return new ScoreSubmissionData(byte0, s, s2);
        }
        gamesclientcontext = new HashMap();
        obj1 = ((PlayerScoreResponse) (obj)).getUnbeatenScores();
        if (obj1 != null)
        {
            int i = 0;
            for (int k = ((ArrayList) (obj1)).size(); i < k; i++)
            {
                PlayerScore playerscore = (PlayerScore)((ArrayList) (obj1)).get(i);
                gamesclientcontext.put(Integer.valueOf(TimeSpan.fromString((String)((FastMapJsonResponse) (playerscore)).mValues.get("timeSpan"))), new com.google.android.gms.games.leaderboard.ScoreSubmissionData.Result(((Long)((FastMapJsonResponse) (playerscore)).mValues.get("score")).longValue(), (String)((FastMapJsonResponse) (playerscore)).mValues.get("formattedScore"), (String)((FastMapJsonResponse) (playerscore)).mValues.get("scoreTag"), false));
            }

        }
        obj1 = (ArrayList)((FastMapJsonResponse) (obj)).mValues.get("beatenScoreTimeSpans");
        if (obj1 != null)
        {
            int j = 0;
            for (int i1 = ((ArrayList) (obj1)).size(); j < i1; j++)
            {
                gamesclientcontext.put(Integer.valueOf(TimeSpan.fromString((String)((ArrayList) (obj1)).get(j))), new com.google.android.gms.games.leaderboard.ScoreSubmissionData.Result(l, (String)((FastMapJsonResponse) (obj)).mValues.get("formattedScore"), s1, true));
            }

        }
        return new ScoreSubmissionData(0, s, s2, gamesclientcontext);
    }

    public final boolean syncLeaderboards(GamesClientContext gamesclientcontext, SyncResult syncresult)
        throws GoogleAuthException
    {
        String s;
        ArrayList arraylist;
        String s2;
        boolean flag;
        arraylist = new ArrayList();
        s2 = Agents.getLocaleString(gamesclientcontext.mContext);
        flag = true;
        s = null;
_L2:
        if (s == null && !flag)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag1 = false;
        String s1;
        LeaderboardListFirstPartyResponse leaderboardlistfirstpartyresponse;
        try
        {
            leaderboardlistfirstpartyresponse = mLeaderboardsApiInternal.listBlocking$3fe7d460(gamesclientcontext.mClientContext, gamesclientcontext.mExternalTargetGameId, s2, s, Boolean.valueOf(Agents.isPlusRequired$9c10cfc()));
            s1 = leaderboardlistfirstpartyresponse.getNextPageToken();
        }
        catch (VolleyError volleyerror)
        {
            GamesLog.d("LeaderboardAgent", (new StringBuilder("Failed to sync leaderboards for game ")).append(gamesclientcontext.mExternalTargetGameId).toString());
            gamesclientcontext = syncresult.stats;
            gamesclientcontext.numIoExceptions = ((SyncStats) (gamesclientcontext)).numIoExceptions + 1L;
            return false;
        }
        s = s1;
        flag = flag1;
        if (leaderboardlistfirstpartyresponse.getItems() == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        arraylist.addAll(leaderboardlistfirstpartyresponse.getItems());
        s = s1;
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
        storeLeaderboards(gamesclientcontext, arraylist, true);
        return true;
    }

    static 
    {
        SCORE_DATA_SPEC = ColumnSpec.builder().withColumn("instance_id", com.google.android.gms.games.provider.ColumnSpec.DataType.LONG).withColumn("page_type", com.google.android.gms.games.provider.ColumnSpec.DataType.INTEGER).withColumn("default_display_image_uri", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("default_display_image_url", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("default_display_name", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("rank", com.google.android.gms.games.provider.ColumnSpec.DataType.LONG).withColumn("display_rank", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("raw_score", com.google.android.gms.games.provider.ColumnSpec.DataType.LONG).withColumn("display_score", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("achieved_timestamp", com.google.android.gms.games.provider.ColumnSpec.DataType.LONG).withColumn("score_tag", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumnsFrom(GamesDataUtils.PLAYER_SPEC).build();
    }
}
