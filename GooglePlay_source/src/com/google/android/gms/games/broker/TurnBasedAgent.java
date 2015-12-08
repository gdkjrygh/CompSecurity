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
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.provider.QuerySpec;
import com.google.android.gms.common.server.BaseApiaryServer;
import com.google.android.gms.common.server.error.ErrorUtils;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import com.google.android.gms.common.server.response.FastParser;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.constants.TurnBasedMatchStatus;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer;
import com.google.android.gms.games.server.api.MatchParticipantResult;
import com.google.android.gms.games.server.api.TurnBasedAutoMatchingCriteria;
import com.google.android.gms.games.server.api.TurnBasedMatch;
import com.google.android.gms.games.server.api.TurnBasedMatchCreateRequest;
import com.google.android.gms.games.server.api.TurnBasedMatchRematch;
import com.google.android.gms.games.server.api.TurnBasedMatchResults;
import com.google.android.gms.games.server.api.TurnBasedMatchTurn;
import com.google.android.gms.games.server.api.TurnBasedMatchesApi;
import com.google.android.gms.games.server.api.TurnBasedMatchesApiInternal;
import com.google.android.gms.games.service.GamesSyncAdapter;
import com.google.android.gms.games.util.AccountUtils;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Random;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, InboxCounter, GamesClientContext, Agents, 
//            MultiplayerUtils

public class TurnBasedAgent extends Lockable
    implements InboxCounter
{
    static interface PendingOpsQuery
    {

        public static final String PROJECTION[] = {
            "_id", "type", "external_game_id", "external_match_id", "pending_participant_id", "version", "is_turn", "results", "package_name", "package_uid"
        };

    }


    private static final Lockable.LockableLock LOCK = new Lockable.LockableLock();
    static final String TAG = com/google/android/gms/games/broker/TurnBasedAgent.getSimpleName();
    private final Random mRandom = new Random(DefaultClock.getInstance().currentTimeMillis());
    private final TurnBasedMatchesApi mTurnBasedMatchesApi;
    private final TurnBasedMatchesApiInternal mTurnBasedMatchesApiInternal;

    public TurnBasedAgent(Lockable lockable, BaseApiaryServer baseapiaryserver, BaseApiaryServer baseapiaryserver1)
    {
        super(TAG, LOCK, lockable);
        mTurnBasedMatchesApi = new TurnBasedMatchesApi(baseapiaryserver);
        mTurnBasedMatchesApiInternal = new TurnBasedMatchesApiInternal(baseapiaryserver1);
    }

    static void addPendingOp(GamesClientContext gamesclientcontext, int i, String s)
    {
        addPendingOp(gamesclientcontext, i, s, null, false, -1, null);
    }

    static void addPendingOp(GamesClientContext gamesclientcontext, int i, String s, String s1, boolean flag, int j, TurnBasedMatchResults turnbasedmatchresults)
    {
        Context context = gamesclientcontext.mContext;
        ClientContext clientcontext = gamesclientcontext.mClientContext;
        Uri uri = com.google.android.gms.games.provider.GamesContractInternal.MatchesPendingOps.getContentUri(clientcontext);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("client_context_id", Long.valueOf(Agents.resolveClientContextId(context, clientcontext)));
        contentvalues.put("type", Integer.valueOf(i));
        contentvalues.put("external_game_id", gamesclientcontext.mExternalTargetGameId);
        contentvalues.put("external_match_id", s);
        contentvalues.put("pending_participant_id", s1);
        contentvalues.put("is_turn", Boolean.valueOf(flag));
        contentvalues.put("version", Integer.valueOf(j));
        if (turnbasedmatchresults == null)
        {
            gamesclientcontext = null;
        } else
        {
            gamesclientcontext = turnbasedmatchresults.toString();
        }
        contentvalues.put("results", gamesclientcontext);
        gamesclientcontext = new ArrayList(2);
        gamesclientcontext.add(ContentProviderOperation.newInsert(uri).withValues(contentvalues).build());
        gamesclientcontext.add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.GamesContractInternal.Matches.getUriForExternalMatchId(clientcontext, s)).withValue("upsync_required", Integer.valueOf(1)).build());
        Agents.applyContentOperations(context.getContentResolver(), gamesclientcontext, TAG);
        GamesSyncAdapter.requestSync$1221cb0a(clientcontext);
    }

    static ArrayList convertToWireResults(ArrayList arraylist)
    {
        if (arraylist.size() != 0) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((ArrayList) (obj));
_L2:
        ArrayList arraylist1;
        int i;
        int j;
        j = arraylist.size();
        arraylist1 = new ArrayList(j);
        i = 0;
_L12:
        obj = arraylist1;
        if (i >= j) goto _L4; else goto _L3
_L3:
        Integer integer;
        String s;
        int k;
        ParticipantResult participantresult = (ParticipantResult)arraylist.get(i);
        obj = Integer.valueOf(participantresult.mPlacing);
        integer = ((Integer) (obj));
        if (((Integer) (obj)).intValue() == -1)
        {
            integer = null;
        }
        s = participantresult.mParticipantId;
        k = participantresult.mResult;
        k;
        JVM INSTR tableswitch 0 5: default 124
    //                   0 149
    //                   1 177
    //                   2 184
    //                   3 191
    //                   4 198
    //                   5 205;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_205;
_L5:
        throw new IllegalArgumentException((new StringBuilder("Unknown result: ")).append(k).toString());
_L6:
        obj = "MATCH_RESULT_WIN";
_L13:
        arraylist1.add(new MatchParticipantResult(s, integer, ((String) (obj))));
        i++;
          goto _L12
_L7:
        obj = "MATCH_RESULT_LOSS";
          goto _L13
_L8:
        obj = "MATCH_RESULT_TIE";
          goto _L13
_L9:
        obj = "MATCH_RESULT_NONE";
          goto _L13
_L10:
        obj = "MATCH_RESULT_DISCONNECT";
          goto _L13
        obj = "MATCH_RESULT_DISAGREED";
          goto _L13
    }

    private int flushPendingOps(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        Context context;
        Uri uri;
        String s;
        ArrayList arraylist;
        AbstractWindowedCursor abstractwindowedcursor;
        int j;
        context = gamesclientcontext.mContext;
        uri = com.google.android.gms.games.provider.GamesContractInternal.MatchesPendingOps.getContentUri(gamesclientcontext.mClientContext);
        s = AccountUtils.getResolvedAccountName(gamesclientcontext.mClientContext);
        j = 0;
        arraylist = new ArrayList();
        Agents.QueryBuilder querybuilder = (new Agents.QueryBuilder(context)).setQuerySpec(uri, "account_name=?", new String[] {
            s
        });
        querybuilder.mProjection = PendingOpsQuery.PROJECTION;
        querybuilder.mSortOrder = "package_name";
        abstractwindowedcursor = querybuilder.queryCursor();
_L20:
        if (!abstractwindowedcursor.moveToNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        String s1;
        Object obj1;
        int i;
        i = abstractwindowedcursor.getInt(1);
        int k = abstractwindowedcursor.getInt(9);
        obj1 = abstractwindowedcursor.getString(8);
        s1 = abstractwindowedcursor.getString(3);
        obj = abstractwindowedcursor.getString(2);
        obj1 = Agents.restoreClientContext(k, ((String) (obj1)), s);
        i;
        JVM INSTR tableswitch 0 6: default 627
    //                   0 232
    //                   1 348
    //                   2 348
    //                   3 334
    //                   4 334
    //                   5 488
    //                   6 569;
           goto _L3 _L4 _L5 _L5 _L6 _L6 _L7 _L8
_L3:
        throw new IllegalArgumentException((new StringBuilder("Unknown op type ")).append(i).toString());
        gamesclientcontext;
        abstractwindowedcursor.close();
        throw gamesclientcontext;
_L4:
        obj = abstractwindowedcursor.getString(3);
        i = getFlushResult(declineInvitationInternal(GamesClientContext.buildContextForTargetGame(context, ((ClientContext) (obj1)), abstractwindowedcursor.getString(2)), ((String) (obj)), false));
          goto _L9
_L15:
        arraylist.add(ContentProviderOperation.newDelete(ContentUris.withAppendedId(uri, abstractwindowedcursor.getLong(0))).build());
        if (s1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.GamesContractInternal.Matches.getUriForExternalMatchId(((ClientContext) (obj1)), s1)).withValue("upsync_required", Integer.valueOf(0)).withYieldAllowed(true).build());
        break; /* Loop/switch isn't completed */
_L6:
        i = flushUpdateOp(abstractwindowedcursor, context, ((ClientContext) (obj1)));
        continue; /* Loop/switch isn't completed */
_L5:
        Object obj2;
        String s2;
        obj2 = gamesclientcontext.getBuilder(context, ((ClientContext) (obj1)));
        obj2.mExternalTargetGameId = ((String) (obj));
        obj2.mBackground = false;
        if (!((ClientContext) (obj1)).isCurrentContext())
        {
            obj2.mExternalOwningGameId = ((String) (obj));
        }
        obj2 = ((GamesClientContext.Builder) (obj2)).build();
        i = abstractwindowedcursor.getInt(1);
        s2 = abstractwindowedcursor.getString(3);
        obj = ((GamesClientContext) (obj2)).mClientContext;
        if (i != 1) goto _L11; else goto _L10
_L10:
        obj = com.google.android.gms.games.provider.GamesContractInternal.Invitations.getUriForExternalInvitationId(((ClientContext) (obj)), s2);
_L14:
        i = getFlushResult(dismissInternal(((GamesClientContext) (obj2)), s2, ((Uri) (obj))));
        continue; /* Loop/switch isn't completed */
_L11:
        if (i != 2) goto _L13; else goto _L12
_L12:
        obj = com.google.android.gms.games.provider.GamesContractInternal.Matches.getUriForExternalMatchId(((ClientContext) (obj)), s2);
          goto _L14
_L13:
        throw new IllegalArgumentException((new StringBuilder("Unknown dismiss type ")).append(i).toString());
_L7:
        obj = abstractwindowedcursor.getString(3);
        obj2 = abstractwindowedcursor.getString(2);
        s2 = abstractwindowedcursor.getString(4);
        i = abstractwindowedcursor.getInt(5);
        boolean flag;
        if (abstractwindowedcursor.getInt(6) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = getFlushResult(leaveMatchInternal(GamesClientContext.buildContextForTargetGame(context, ((ClientContext) (obj1)), ((String) (obj2))), ((String) (obj)), i, flag, s2));
        continue; /* Loop/switch isn't completed */
_L8:
        i = getFlushResult(cancelMatchInternal(context, ((ClientContext) (obj1)), abstractwindowedcursor.getString(3)));
        continue; /* Loop/switch isn't completed */
_L18:
        if (i == 1)
        {
            j = 5;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        abstractwindowedcursor.close();
        Agents.applyContentOperations(context.getContentResolver(), arraylist, TAG);
        return j;
_L9:
        if (i != 0 && i != 2) goto _L16; else goto _L15
_L16:
        if (i != 2) goto _L18; else goto _L17
_L17:
        j = 6;
        if (true) goto _L20; else goto _L19
_L19:
    }

    private int flushUpdateOp(Cursor cursor, Context context, ClientContext clientcontext)
        throws GoogleAuthException
    {
        int i = cursor.getInt(1);
        String s1 = cursor.getString(3);
        String s = cursor.getString(2);
        String s2 = cursor.getString(7);
        cursor = cursor.getString(4);
        TurnBasedMatchResults turnbasedmatchresults = new TurnBasedMatchResults();
        FastParser fastparser = new FastParser();
        try
        {
            fastparser.parse(s2, turnbasedmatchresults);
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            GamesLog.w(TAG, "Failed to parse offline update. Aborting.");
            return 2;
        }
        if (i == 3)
        {
            cursor = updateMatchInternal(context, clientcontext, s1, new TurnBasedMatchTurn(turnbasedmatchresults.getData(), (Integer)((FastMapJsonResponse) (turnbasedmatchresults)).mValues.get("matchVersion"), cursor, turnbasedmatchresults.getResults()));
        } else
        if (i == 4)
        {
            cursor = finishMatchInternal(context, clientcontext, s1, turnbasedmatchresults);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown update type ")).append(i).toString());
        }
        i = ((Integer)((Pair) (cursor)).first).intValue();
        cursor = (TurnBasedMatch)((Pair) (cursor)).second;
        if (cursor != null)
        {
            storeMatch(GamesClientContext.buildContextForTargetGame(context, clientcontext, s), cursor);
        }
        return getFlushResult(i);
    }

    private static int getFlushResult(int i)
    {
        if (i == 0)
        {
            return 0;
        }
        return i != 5 ? 2 : 1;
    }

    public static DataHolder getLocalMatch(Context context, ClientContext clientcontext, String s, int i)
    {
        clientcontext = com.google.android.gms.games.provider.GamesContractInternal.MatchEntities.getUriForExternalMatchId(clientcontext, s);
        context = (new Agents.QueryBuilder(context)).setQuerySpec(clientcontext).queryCursor();
        int j = i;
        int k = j;
        if (i == 0)
        {
            k = j;
            if (context.getCount() == 0)
            {
                k = 6506;
            }
        }
        return new DataHolder(context, Agents.resolveStatusCode(context, k));
    }

    public static DataHolder getLocalMatches(GamesClientContext gamesclientcontext, int i, int j)
    {
        QuerySpec queryspec = new QuerySpec(com.google.android.gms.games.provider.GamesContractInternal.MatchEntities.getContentUri(gamesclientcontext.mClientContext));
        queryspec.addWhere("metadata_version", "0", ">=?");
        queryspec.addWhere("user_match_status", String.valueOf(i));
        if (gamesclientcontext.hasTargetGameId())
        {
            queryspec.addWhere("external_game_id", gamesclientcontext.mExternalTargetGameId);
        }
        gamesclientcontext = new Agents.QueryBuilder(gamesclientcontext);
        gamesclientcontext.mQuery = queryspec;
        gamesclientcontext.mSortOrder = "last_updated_timestamp DESC";
        gamesclientcontext.mStatusCode = j;
        return gamesclientcontext.query();
    }

    static int getLocalVersion(Context context, ClientContext clientcontext, String s)
    {
        return Agents.queryInt(context, com.google.android.gms.games.provider.GamesContractInternal.Matches.getUriForExternalMatchId(clientcontext, s), "version", -1);
    }

    static boolean hasPendingOps(Context context, ClientContext clientcontext, String s)
    {
        return Agents.getCount(context, com.google.android.gms.games.provider.GamesContractInternal.MatchesPendingOps.getUriForExternalMatchId(clientcontext, s)) > 0L;
    }

    private static boolean storeMatch(GamesClientContext gamesclientcontext, TurnBasedMatch turnbasedmatch)
    {
        Context context = gamesclientcontext.mContext;
        ClientContext clientcontext = gamesclientcontext.mClientContext;
        long l = gamesclientcontext.resolveTargetGameId();
        gamesclientcontext = new ArrayList();
        if (turnbasedmatch != null && turnbasedmatch.getStatus().intValue() == 5)
        {
            MultiplayerUtils.addTombstoneOps(clientcontext, turnbasedmatch.getMatchId(), gamesclientcontext);
            Agents.applyContentOperations(context.getContentResolver(), gamesclientcontext, TAG);
            return true;
        }
        int i = MultiplayerUtils.addTurnBasedMatchStorageOps(context, clientcontext, turnbasedmatch, l, DefaultClock.getInstance(), gamesclientcontext);
        if (i == -1)
        {
            return false;
        }
        gamesclientcontext = Agents.applyContentOperationsWithResult(context.getContentResolver(), gamesclientcontext, TAG);
        if (gamesclientcontext == null)
        {
            GamesLog.e(TAG, "Failed to store data for newly created entity");
            return false;
        }
        gamesclientcontext = ((ContentProviderResult)gamesclientcontext.get(i)).uri;
        if (gamesclientcontext == null)
        {
            GamesLog.e(TAG, "Failed to store data for newly created entity");
            return false;
        }
        if (ContentUris.parseId(gamesclientcontext) < 0L)
        {
            GamesLog.e(TAG, "Failed to store data for newly created entity");
            return false;
        } else
        {
            return true;
        }
    }

    static DataHolder updateLocalMatchStateForPendingOp(Context context, ClientContext clientcontext, String s, String s1, byte abyte0[], int i, boolean flag, ArrayList arraylist)
    {
        String s2 = Agents.queryString$510a9928(context, com.google.android.gms.games.provider.GamesContractInternal.Matches.getUriForExternalMatchId(clientcontext, s), "pending_participant_external");
        ArrayList arraylist1 = new ArrayList();
        Object obj = new ContentValues();
        ((ContentValues) (obj)).put("external_match_id", s);
        ((ContentValues) (obj)).put("last_updater_external", s2);
        ((ContentValues) (obj)).put("last_updated_timestamp", Long.valueOf(DefaultClock.getInstance().currentTimeMillis()));
        ((ContentValues) (obj)).put("pending_participant_external", s1);
        ((ContentValues) (obj)).put("data", abyte0);
        if (flag)
        {
            ((ContentValues) (obj)).put("user_match_status", Integer.valueOf(3));
            ((ContentValues) (obj)).put("status", Integer.valueOf(2));
        } else
        if (s1 == null)
        {
            ((ContentValues) (obj)).put("user_match_status", Integer.valueOf(2));
            ((ContentValues) (obj)).put("status", Integer.valueOf(0));
        } else
        if (s1.equals(s2))
        {
            ((ContentValues) (obj)).put("user_match_status", Integer.valueOf(1));
        } else
        {
            ((ContentValues) (obj)).put("user_match_status", Integer.valueOf(2));
        }
        ((ContentValues) (obj)).put("version", Integer.valueOf(i + 1));
        ((ContentValues) (obj)).put("upsync_required", Integer.valueOf(1));
        arraylist1.add(ContentProviderOperation.newInsert(com.google.android.gms.games.provider.GamesContractInternal.Matches.getContentUri(clientcontext)).withValues(((ContentValues) (obj))).build());
        i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            abyte0 = (ParticipantResult)arraylist.get(i);
            s2 = ((ParticipantResult) (abyte0)).mParticipantId;
            obj = com.google.android.gms.games.provider.GamesContractInternal.Participants.getUriForExternalId(clientcontext, s2);
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("placing", Integer.valueOf(((ParticipantResult) (abyte0)).mPlacing));
            contentvalues.put("result_type", Integer.valueOf(((ParticipantResult) (abyte0)).mResult));
            if (flag && s2.equals(s1))
            {
                contentvalues.put("player_status", Integer.valueOf(5));
            }
            arraylist1.add(ContentProviderOperation.newUpdate(((Uri) (obj))).withValues(contentvalues).build());
        }

        if (!Agents.applyContentOperations(context.getContentResolver(), arraylist1, TAG))
        {
            GamesLog.w(TAG, (new StringBuilder("Failed to apply local match update for ")).append(s).toString());
            return DataHolder.empty(1);
        } else
        {
            clientcontext = com.google.android.gms.games.provider.GamesContractInternal.MatchEntities.getUriForExternalMatchId(clientcontext, s);
            context = (new Agents.QueryBuilder(context)).setQuerySpec(clientcontext);
            context.mStatusCode = 5;
            return context.query();
        }
    }

    public final DataHolder acceptInvitation(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        ClientContext clientcontext;
        Object obj;
        obj = gamesclientcontext.mContext;
        clientcontext = gamesclientcontext.mClientContext;
        if (!gamesclientcontext.mIsFirstParty) goto _L2; else goto _L1
_L1:
        TurnBasedMatchesApiInternal turnbasedmatchesapiinternal;
        StringBuilder stringbuilder;
        turnbasedmatchesapiinternal = mTurnBasedMatchesApiInternal;
        obj = Agents.getLocaleString(((Context) (obj)));
        stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("turnbasedmatches/%1$s/join", new Object[] {
            TurnBasedMatchesApiInternal.enc(s)
        });
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        TurnBasedMatchesApiInternal.append(stringbuilder, "language", TurnBasedMatchesApiInternal.enc(((String) (obj))));
        s = stringbuilder.toString();
        s = (TurnBasedMatch)turnbasedmatchesapiinternal.mServer.getResponseBlocking(clientcontext, 2, s, null, com/google/android/gms/games/server/api/TurnBasedMatch);
_L4:
        return storeAndReturnMatch(gamesclientcontext, s, 0);
_L2:
        TurnBasedMatchesApi turnbasedmatchesapi;
        StringBuilder stringbuilder1;
        try
        {
            turnbasedmatchesapi = mTurnBasedMatchesApi;
            obj = Agents.getLocaleString(((Context) (obj)));
            stringbuilder1 = new StringBuilder();
            (new Formatter(stringbuilder1)).format("turnbasedmatches/%1$s/join", new Object[] {
                TurnBasedMatchesApi.enc(s)
            });
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            GamesLog.e(TAG, (new StringBuilder("Failed to accept invitation: ")).append(gamesclientcontext.getMessage()).toString());
            return DataHolder.empty(MultiplayerUtils.getErrorStatus(TAG, gamesclientcontext, 6));
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        TurnBasedMatchesApi.append(stringbuilder1, "language", TurnBasedMatchesApi.enc(((String) (obj))));
        s = stringbuilder1.toString();
        s = (TurnBasedMatch)turnbasedmatchesapi.mServer.getResponseBlocking(clientcontext, 2, s, null, com/google/android/gms/games/server/api/TurnBasedMatch);
        if (true) goto _L4; else goto _L3
_L3:
    }

    final int cancelMatchInternal(Context context, ClientContext clientcontext, String s)
        throws GoogleAuthException
    {
        int i = 0;
        try
        {
            TurnBasedMatchesApi turnbasedmatchesapi = mTurnBasedMatchesApi;
            Object obj = new StringBuilder();
            (new Formatter(((Appendable) (obj)))).format("turnbasedmatches/%1$s/cancel", new Object[] {
                TurnBasedMatchesApi.enc(s)
            });
            obj = ((StringBuilder) (obj)).toString();
            turnbasedmatchesapi.mServer.performNoResponseRequestBlocking(clientcontext, 2, ((String) (obj)), null);
        }
        catch (VolleyError volleyerror)
        {
            GamesLog.e(TAG, (new StringBuilder("Failed to cancel match: ")).append(volleyerror.getMessage()).toString());
            i = MultiplayerUtils.getErrorStatus(TAG, volleyerror, 5);
        }
        clientcontext = com.google.android.gms.games.provider.GamesContractInternal.Matches.getUriForExternalMatchId(clientcontext, s);
        context.getContentResolver().delete(clientcontext, null, null);
        return i;
    }

    public final void clearActivityTypes(int i)
    {
    }

    public final DataHolder createMatch$46a5f9fd(GamesClientContext gamesclientcontext, int i, ArrayList arraylist, Bundle bundle)
        throws GoogleAuthException
    {
        Object obj;
        String s;
        StringBuilder stringbuilder;
        if (bundle == null)
        {
            bundle = null;
        } else
        {
            if (bundle.containsKey("exclusive_bit_mask"))
            {
                obj = Long.valueOf(bundle.getLong("exclusive_bit_mask"));
            } else
            {
                obj = null;
            }
            bundle = new TurnBasedAutoMatchingCriteria(((Long) (obj)), Integer.valueOf(bundle.getInt("max_automatch_players")), Integer.valueOf(bundle.getInt("min_automatch_players")));
        }
        if (i == -1)
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(i);
        }
        try
        {
            arraylist = new TurnBasedMatchCreateRequest(bundle, arraylist, Long.valueOf(mRandom.nextLong()), ((Integer) (obj)));
            bundle = mTurnBasedMatchesApi;
            obj = gamesclientcontext.mClientContext;
            s = Agents.getLocaleString(gamesclientcontext.mContext);
            stringbuilder = new StringBuilder("turnbasedmatches/create");
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            GamesLog.e(TAG, (new StringBuilder("Failed to create turn-based match: ")).append(gamesclientcontext.getMessage()).toString());
            return DataHolder.empty(MultiplayerUtils.getErrorStatus(TAG, gamesclientcontext, 6));
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        TurnBasedMatchesApi.append(stringbuilder, "language", TurnBasedMatchesApi.enc(s));
        s = stringbuilder.toString();
        arraylist = (TurnBasedMatch)((TurnBasedMatchesApi) (bundle)).mServer.getResponseBlocking(((ClientContext) (obj)), 1, s, arraylist, com/google/android/gms/games/server/api/TurnBasedMatch);
        return storeAndReturnMatch(gamesclientcontext, arraylist, 0);
    }

    final int declineInvitationInternal(GamesClientContext gamesclientcontext, String s, boolean flag)
        throws GoogleAuthException
    {
        Object obj1;
        Context context;
        ClientContext clientcontext;
        int i;
        context = gamesclientcontext.mContext;
        clientcontext = gamesclientcontext.mClientContext;
        i = 0;
        obj1 = null;
        if (!gamesclientcontext.mIsFirstParty) goto _L2; else goto _L1
_L1:
        Object obj;
        String s1;
        StringBuilder stringbuilder;
        obj = mTurnBasedMatchesApiInternal;
        s1 = Agents.getLocaleString(context);
        stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("turnbasedmatches/%1$s/decline", new Object[] {
            TurnBasedMatchesApiInternal.enc(s)
        });
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        TurnBasedMatchesApiInternal.append(stringbuilder, "language", TurnBasedMatchesApiInternal.enc(s1));
        s1 = stringbuilder.toString();
        obj = (TurnBasedMatch)((TurnBasedMatchesApiInternal) (obj)).mServer.getResponseBlocking(clientcontext, 2, s1, null, com/google/android/gms/games/server/api/TurnBasedMatch);
_L4:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_362;
        }
        GamesLog.e(TAG, (new StringBuilder("Declining invitation failed on server: ")).append(i).toString());
        if (i != 5)
        {
            return i;
        }
        break; /* Loop/switch isn't completed */
_L2:
        obj = mTurnBasedMatchesApi;
        s1 = Agents.getLocaleString(context);
        stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("turnbasedmatches/%1$s/decline", new Object[] {
            TurnBasedMatchesApi.enc(s)
        });
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        TurnBasedMatchesApi.append(stringbuilder, "language", TurnBasedMatchesApi.enc(s1));
        String s2 = stringbuilder.toString();
        obj = (TurnBasedMatch)((TurnBasedMatchesApi) (obj)).mServer.getResponseBlocking(clientcontext, 2, s2, null, com/google/android/gms/games/server/api/TurnBasedMatch);
        continue; /* Loop/switch isn't completed */
        VolleyError volleyerror;
        volleyerror;
        GamesLog.e(TAG, (new StringBuilder("Failed to decline invitation: ")).append(volleyerror.getMessage()).toString());
        i = MultiplayerUtils.getErrorStatus(TAG, volleyerror, 5);
        obj = obj1;
        if (ErrorUtils.hasStatusCode(volleyerror, 404))
        {
            GamesLog.w(TAG, (new StringBuilder("Server had no record for ")).append(s).append(" while declining.").toString());
            i = 0;
            obj = obj1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (flag)
        {
            addPendingOp(gamesclientcontext, 0, s);
        }
        if (obj != null)
        {
            int j = ((TurnBasedMatch) (obj)).getStatus().intValue();
            if (j == 5)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag, (new StringBuilder("Match was supposed to be DELETED, but instead is ")).append(TurnBasedMatchStatus.fromInt(j)).toString());
        }
        gamesclientcontext = com.google.android.gms.games.provider.GamesContractInternal.Invitations.getUriForExternalInvitationId(clientcontext, s);
        context.getContentResolver().delete(gamesclientcontext, null, null);
        return i;
    }

    final int dismissInternal(GamesClientContext gamesclientcontext, String s, Uri uri)
        throws GoogleAuthException
    {
        ClientContext clientcontext;
        int i;
        clientcontext = gamesclientcontext.mClientContext;
        i = 0;
        if (!gamesclientcontext.mIsFirstParty) goto _L2; else goto _L1
_L1:
        TurnBasedMatchesApiInternal turnbasedmatchesapiinternal = mTurnBasedMatchesApiInternal;
        StringBuilder stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("turnbasedmatches/%1$s/dismiss", new Object[] {
            TurnBasedMatchesApiInternal.enc(s)
        });
        s = stringbuilder.toString();
        turnbasedmatchesapiinternal.mServer.performNoResponseRequestBlocking(clientcontext, 2, s, null);
_L4:
        gamesclientcontext.mContext.getContentResolver().delete(uri, null, null);
        return i;
_L2:
        try
        {
            TurnBasedMatchesApi turnbasedmatchesapi = mTurnBasedMatchesApi;
            StringBuilder stringbuilder1 = new StringBuilder();
            (new Formatter(stringbuilder1)).format("turnbasedmatches/%1$s/dismiss", new Object[] {
                TurnBasedMatchesApi.enc(s)
            });
            s = stringbuilder1.toString();
            turnbasedmatchesapi.mServer.performNoResponseRequestBlocking(clientcontext, 2, s, null);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.e(TAG, (new StringBuilder("Failed to dismiss: ")).append(s.getMessage()).toString());
            i = MultiplayerUtils.getErrorStatus(TAG, s, 5);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final Pair finishMatchInternal(Context context, ClientContext clientcontext, String s, TurnBasedMatchResults turnbasedmatchresults)
        throws GoogleAuthException
    {
        Object obj;
        int i;
        i = 0;
        obj = null;
        TurnBasedMatchesApi turnbasedmatchesapi;
        StringBuilder stringbuilder;
        turnbasedmatchesapi = mTurnBasedMatchesApi;
        context = Agents.getLocaleString(context);
        stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("turnbasedmatches/%1$s/finish", new Object[] {
            TurnBasedMatchesApi.enc(s)
        });
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        TurnBasedMatchesApi.append(stringbuilder, "language", TurnBasedMatchesApi.enc(context));
        context = stringbuilder.toString();
        context = (TurnBasedMatch)turnbasedmatchesapi.mServer.getResponseBlocking(clientcontext, 2, context, turnbasedmatchresults, com/google/android/gms/games/server/api/TurnBasedMatch);
_L2:
        return new Pair(Integer.valueOf(i), context);
        context;
        GamesLog.e(TAG, (new StringBuilder("Failed to finish match: ")).append(context.getMessage()).toString());
        i = MultiplayerUtils.getErrorStatus(TAG, context, 5);
        context = obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final String getActivityKey()
    {
        return "inbox_matches_count";
    }

    final DataHolder getConflictMatch(GamesClientContext gamesclientcontext, String s, int i)
        throws GoogleAuthException
    {
        Object obj;
        int j;
        j = 0;
        obj = null;
        TurnBasedMatchesApi turnbasedmatchesapi;
        ClientContext clientcontext;
        Boolean boolean1;
        String s1;
        StringBuilder stringbuilder;
        turnbasedmatchesapi = mTurnBasedMatchesApi;
        clientcontext = gamesclientcontext.mClientContext;
        boolean1 = Boolean.valueOf(true);
        s1 = Agents.getLocaleString(gamesclientcontext.mContext);
        stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("turnbasedmatches/%1$s", new Object[] {
            TurnBasedMatchesApi.enc(s)
        });
        if (boolean1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        TurnBasedMatchesApi.append(stringbuilder, "includeMatchData", String.valueOf(boolean1));
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        TurnBasedMatchesApi.append(stringbuilder, "language", TurnBasedMatchesApi.enc(s1));
        s = stringbuilder.toString();
        s = (TurnBasedMatch)turnbasedmatchesapi.mServer.getResponseBlocking(clientcontext, 0, s, null, com/google/android/gms/games/server/api/TurnBasedMatch);
_L1:
        if (s != null)
        {
            return storeAndReturnMatch(gamesclientcontext, s, i);
        } else
        {
            return DataHolder.empty(j);
        }
        s;
        GamesLog.e(TAG, (new StringBuilder("Failed to load match: ")).append(s.getMessage()).toString());
        j = MultiplayerUtils.getErrorStatus(TAG, s, 5);
        s = obj;
          goto _L1
    }

    public final int getInboxCount(GamesClientContext gamesclientcontext)
    {
        gamesclientcontext = getLocalMatches(gamesclientcontext, 1, 0);
        int i = (new TurnBasedMatchBuffer(gamesclientcontext)).getCount();
        gamesclientcontext.close();
        return i;
        Exception exception;
        exception;
        gamesclientcontext.close();
        throw exception;
    }

    public final Lockable getLockable()
    {
        return this;
    }

    public final boolean hasInboxCountChanged()
    {
        return false;
    }

    final int leaveMatchInternal(GamesClientContext gamesclientcontext, String s, int i, boolean flag, String s1)
        throws GoogleAuthException
    {
        Object obj;
        Context context;
        ClientContext clientcontext;
        String s2;
        int j;
        context = gamesclientcontext.mContext;
        clientcontext = gamesclientcontext.mClientContext;
        j = 0;
        s2 = Agents.getLocaleString(context);
        obj = null;
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj1;
        StringBuilder stringbuilder;
        try
        {
            obj1 = mTurnBasedMatchesApi;
            stringbuilder = new StringBuilder();
            (new Formatter(stringbuilder)).format("turnbasedmatches/%1$s/leaveTurn", new Object[] {
                TurnBasedMatchesApi.enc(s)
            });
            TurnBasedMatchesApi.append(stringbuilder, "matchVersion", String.valueOf(Integer.valueOf(i)));
        }
        catch (VolleyError volleyerror)
        {
            GamesLog.e(TAG, (new StringBuilder("Failed to leave match: ")).append(volleyerror.getMessage()).toString());
            i = MultiplayerUtils.getErrorStatus(TAG, volleyerror, 5);
            s1 = obj;
            if (ErrorUtils.hasStatusCode(volleyerror, 404))
            {
                GamesLog.w(TAG, (new StringBuilder("Server had no record for ")).append(s).append(" while leaving.").toString());
                i = 0;
                s1 = obj;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        TurnBasedMatchesApi.append(stringbuilder, "language", TurnBasedMatchesApi.enc(s2));
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        TurnBasedMatchesApi.append(stringbuilder, "pendingParticipantId", TurnBasedMatchesApi.enc(s1));
        s1 = stringbuilder.toString();
        s1 = (TurnBasedMatch)((TurnBasedMatchesApi) (obj1)).mServer.getResponseBlocking(clientcontext, 2, s1, null, com/google/android/gms/games/server/api/TurnBasedMatch);
        i = j;
_L8:
        if (i != 6503) goto _L4; else goto _L3
_L3:
        j = getConflictMatch(gamesclientcontext, s, i).mStatusCode;
_L6:
        return j;
_L2:
        s1 = mTurnBasedMatchesApi;
        obj1 = new StringBuilder();
        (new Formatter(((Appendable) (obj1)))).format("turnbasedmatches/%1$s/leave", new Object[] {
            TurnBasedMatchesApi.enc(s)
        });
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        TurnBasedMatchesApi.append(((StringBuilder) (obj1)), "language", TurnBasedMatchesApi.enc(s2));
        s2 = ((StringBuilder) (obj1)).toString();
        s1 = (TurnBasedMatch)((TurnBasedMatchesApi) (s1)).mServer.getResponseBlocking(clientcontext, 2, s2, null, com/google/android/gms/games/server/api/TurnBasedMatch);
        i = j;
        continue; /* Loop/switch isn't completed */
_L4:
        if (s1 != null)
        {
            storeMatch(gamesclientcontext, s1);
            return i;
        }
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (i != 5) goto _L6; else goto _L5
_L5:
        gamesclientcontext = com.google.android.gms.games.provider.GamesContractInternal.Matches.getUriForExternalMatchId(clientcontext, s);
        context.getContentResolver().delete(gamesclientcontext, null, null);
        return i;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final DataHolder retryMatch(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        Object obj;
        String s1;
        obj = gamesclientcontext.mClientContext;
        s1 = Agents.getLocaleString(gamesclientcontext.mContext);
        if (!gamesclientcontext.mIsFirstParty) goto _L2; else goto _L1
_L1:
        Object obj1;
        Long long1;
        StringBuilder stringbuilder;
        obj1 = mTurnBasedMatchesApiInternal;
        long1 = Long.valueOf(mRandom.nextLong());
        stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("turnbasedmatches/%1$s/rematch", new Object[] {
            TurnBasedMatchesApiInternal.enc(s)
        });
        if (s1 != null)
        {
            try
            {
                TurnBasedMatchesApiInternal.append(stringbuilder, "language", TurnBasedMatchesApiInternal.enc(s1));
            }
            // Misplaced declaration of an exception variable
            catch (GamesClientContext gamesclientcontext)
            {
                GamesLog.e(TAG, (new StringBuilder("Failed to create rematch for match ")).append(s).toString());
                return DataHolder.empty(MultiplayerUtils.getErrorStatus(TAG, gamesclientcontext, 6));
            }
        }
        if (long1 == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        TurnBasedMatchesApiInternal.append(stringbuilder, "requestId", String.valueOf(long1));
        s1 = stringbuilder.toString();
        obj = (TurnBasedMatchRematch)((TurnBasedMatchesApiInternal) (obj1)).mServer.getResponseBlocking(((ClientContext) (obj)), 1, s1, null, com/google/android/gms/games/server/api/TurnBasedMatchRematch);
        s = ((String) (obj));
_L4:
        storeMatch(gamesclientcontext, s.getPreviousMatch());
        return storeAndReturnMatch(gamesclientcontext, s.getRematch(), 0);
_L2:
        obj1 = mTurnBasedMatchesApi;
        long1 = Long.valueOf(mRandom.nextLong());
        stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("turnbasedmatches/%1$s/rematch", new Object[] {
            TurnBasedMatchesApi.enc(s)
        });
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        TurnBasedMatchesApi.append(stringbuilder, "language", TurnBasedMatchesApi.enc(s1));
        if (long1 == null)
        {
            break MISSING_BLOCK_LABEL_250;
        }
        TurnBasedMatchesApi.append(stringbuilder, "requestId", String.valueOf(long1));
        s1 = stringbuilder.toString();
        obj = (TurnBasedMatchRematch)((TurnBasedMatchesApi) (obj1)).mServer.getResponseBlocking(((ClientContext) (obj)), 1, s1, null, com/google/android/gms/games/server/api/TurnBasedMatchRematch);
        s = ((String) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    final DataHolder storeAndReturnMatch(GamesClientContext gamesclientcontext, TurnBasedMatch turnbasedmatch, int i)
    {
        if (!storeMatch(gamesclientcontext, turnbasedmatch))
        {
            return DataHolder.empty(1);
        } else
        {
            turnbasedmatch = com.google.android.gms.games.provider.GamesContractInternal.MatchEntities.getUriForExternalMatchId(gamesclientcontext.mClientContext, turnbasedmatch.getMatchId());
            gamesclientcontext = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(turnbasedmatch);
            gamesclientcontext.mStatusCode = i;
            return gamesclientcontext.query();
        }
    }

    public final void submitPendingMatches(GamesClientContext gamesclientcontext, SyncResult syncresult)
        throws GoogleAuthException
    {
        if (flushPendingOps(gamesclientcontext) != 0)
        {
            gamesclientcontext = syncresult.stats;
            gamesclientcontext.numIoExceptions = ((SyncStats) (gamesclientcontext)).numIoExceptions + 1L;
        }
    }

    final Pair updateMatchInternal(Context context, ClientContext clientcontext, String s, TurnBasedMatchTurn turnbasedmatchturn)
        throws GoogleAuthException
    {
        Object obj;
        int i;
        i = 0;
        obj = null;
        TurnBasedMatchesApi turnbasedmatchesapi;
        StringBuilder stringbuilder;
        turnbasedmatchesapi = mTurnBasedMatchesApi;
        context = Agents.getLocaleString(context);
        stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("turnbasedmatches/%1$s/turn", new Object[] {
            TurnBasedMatchesApi.enc(s)
        });
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        TurnBasedMatchesApi.append(stringbuilder, "language", TurnBasedMatchesApi.enc(context));
        context = stringbuilder.toString();
        context = (TurnBasedMatch)turnbasedmatchesapi.mServer.getResponseBlocking(clientcontext, 2, context, turnbasedmatchturn, com/google/android/gms/games/server/api/TurnBasedMatch);
_L2:
        return new Pair(Integer.valueOf(i), context);
        context;
        GamesLog.e(TAG, (new StringBuilder("Failed to update match: ")).append(context.getMessage()).toString());
        i = MultiplayerUtils.getErrorStatus(TAG, context, 5);
        context = obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
