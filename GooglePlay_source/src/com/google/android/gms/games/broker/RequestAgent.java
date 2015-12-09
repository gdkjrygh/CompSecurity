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
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.util.ArrayMap;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.provider.QuerySpec;
import com.google.android.gms.common.server.BaseApiaryServer;
import com.google.android.gms.common.server.error.ErrorUtils;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.constants.RequestType;
import com.google.android.gms.games.internal.request.RequestUpdateOutcomes;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.server.api.FirstPartyNotification;
import com.google.android.gms.games.server.api.InboundRequestInfo;
import com.google.android.gms.games.server.api.OutboundRequestInfo;
import com.google.android.gms.games.server.api.Request;
import com.google.android.gms.games.server.api.RequestEntity;
import com.google.android.gms.games.server.api.RequestRecipient;
import com.google.android.gms.games.server.api.RequestSyncResponseFirstParty;
import com.google.android.gms.games.server.api.RequestUpdate;
import com.google.android.gms.games.server.api.RequestUpdateList;
import com.google.android.gms.games.server.api.RequestUpdateResult;
import com.google.android.gms.games.server.api.RequestUpdateResultList;
import com.google.android.gms.games.server.api.RequestsApiInternal;
import com.google.android.gms.games.server.api.SendRequest;
import com.google.android.gms.games.util.AccountUtils;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, InboxCounter, GamesClientContext, Agents, 
//            GameEventListenerRegistry

public final class RequestAgent extends Lockable
    implements InboxCounter
{
    private static interface PendingOpsQuery
    {

        public static final String PROJECTION[] = {
            "_id", "external_request_id", "external_game_id", "package_name", "package_uid"
        };

    }

    private static final class RequestSummariesData
        implements Comparable
    {

        final ContentValues contentValues;
        final Set externalPlayerIds = new HashSet();
        final String requestingPlayerId;

        private String getGameId()
        {
            return contentValues.getAsString("external_game_id");
        }

        public final volatile int compareTo(Object obj)
        {
            obj = (RequestSummariesData)obj;
            int i = (int)(getExpirationTimestamp() - ((RequestSummariesData) (obj)).getExpirationTimestamp());
            if (i != 0)
            {
                return i;
            } else
            {
                return getGameId().compareTo(((RequestSummariesData) (obj)).getGameId());
            }
        }

        public final long getExpirationTimestamp()
        {
            return contentValues.getAsLong("expiration_timestamp").longValue();
        }

        public RequestSummariesData(ContentValues contentvalues, String s)
        {
            requestingPlayerId = s;
            contentValues = contentvalues;
            externalPlayerIds.add(s);
        }
    }

    private static final class SyncNetworkResponse
    {

        final ArrayList mEntities;
        final String mNewSyncToken;
        final int mStatusCode;

        public SyncNetworkResponse()
        {
            mEntities = new ArrayList();
            mNewSyncToken = null;
            mStatusCode = 500;
        }

        public SyncNetworkResponse(ArrayList arraylist, String s, int i)
        {
            mEntities = (ArrayList)Preconditions.checkNotNull(arraylist);
            mNewSyncToken = s;
            mStatusCode = i;
        }
    }

    private static interface TrimRequestsQuery
    {

        public static final String PROJECTION[] = {
            "_id", "game_id", "creation_timestamp"
        };

    }


    private static final String ALL_SENDER_COLUMNS[];
    private static final Lockable.LockableLock LOCK = new Lockable.LockableLock();
    private static final String REQUEST_SUMMARY_COLUMNS[];
    static final String SYNC_TOKEN_PROJECTION[] = {
        "request_sync_token"
    };
    boolean mHasNewActivity;
    private final Random mRandom = new Random(DefaultClock.getInstance().currentTimeMillis());
    private final RequestsApiInternal mRequestApiInternal;

    public RequestAgent(Lockable lockable, BaseApiaryServer baseapiaryserver)
    {
        super("RequestAgent", LOCK, lockable);
        mHasNewActivity = false;
        mRequestApiInternal = new RequestsApiInternal(baseapiaryserver);
    }

    private static void addRecipientOps(GamesClientContext gamesclientcontext, Uri uri, OutboundRequestInfo outboundrequestinfo, int i, ArrayList arraylist)
    {
        Clock clock = DefaultClock.getInstance();
        outboundrequestinfo = outboundrequestinfo.getRecipients();
        int j = 0;
        for (int k = outboundrequestinfo.size(); j < k; j++)
        {
            RequestRecipient requestrecipient = (RequestRecipient)outboundrequestinfo.get(j);
            com.google.android.gms.games.server.api.Player player = requestrecipient.getRecipientPlayer();
            int l = arraylist.size();
            arraylist.add(Agents.getPlayerUpsertOp(gamesclientcontext.mClientContext, ((FastContentValuesJsonResponse) (player)).mValues, clock.currentTimeMillis()));
            arraylist.add(ContentProviderOperation.newInsert(uri).withValues(((FastContentValuesJsonResponse) (requestrecipient)).mValues).withValueBackReference("player_id", l).withValueBackReference("request_id", i).build());
        }

    }

    static HashSet getActionableIds(GamesClientContext gamesclientcontext)
    {
        HashSet hashset = new HashSet();
        Object obj = gamesclientcontext.mClientContext;
        long l = gamesclientcontext.resolveCurrentPlayerId();
        QuerySpec queryspec = getLocalQuery(((ClientContext) (obj)), null, l, 0, 1);
        hashset.addAll(Agents.getColumnValues(gamesclientcontext.mContext, queryspec, "external_request_id"));
        obj = getLocalQuery(((ClientContext) (obj)), null, l, 0, 2);
        hashset.addAll(Agents.getColumnValues(gamesclientcontext.mContext, ((QuerySpec) (obj)), "external_request_id"));
        return hashset;
    }

    private static QuerySpec getLocalQuery(ClientContext clientcontext, String s, long l, int i, int j)
    {
        boolean flag;
        if ((j - 1 & j) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Request type must be a single bit value!");
        clientcontext = new QuerySpec(com.google.android.gms.games.provider.GamesContractInternal.RequestEntities.getContentUri(clientcontext));
        clientcontext.addWhere("metadata_version", "0", ">=?");
        clientcontext.addWhere("type", String.valueOf(j));
        if (s != null)
        {
            clientcontext.addWhere("external_game_id", s);
        }
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown request direction ")).append(i).toString());

        case 0: // '\0'
            clientcontext.addWhere("player_id", String.valueOf(l));
            return clientcontext;

        case 1: // '\001'
            clientcontext.addWhere("sender_id", String.valueOf(l));
            break;
        }
        return clientcontext;
    }

    public static DataHolder getLocalRequestSummaries(GamesClientContext gamesclientcontext, int i, int j)
    {
        com.google.android.gms.common.data.DataHolder.Builder builder;
        ArrayMap arraymap;
        Object obj;
        builder = DataHolder.builder(REQUEST_SUMMARY_COLUMNS);
        arraymap = new ArrayMap();
        QuerySpec queryspec = new QuerySpec(com.google.android.gms.games.provider.GamesContractInternal.RequestEntities.getContentUri(gamesclientcontext.mClientContext));
        queryspec.addWhere("metadata_version", "0", ">=?");
        queryspec.addWhereForMask("type", i);
        obj = new Agents.QueryBuilder(gamesclientcontext);
        obj.mQuery = queryspec;
        obj.mStatusCode = j;
        obj = new GameRequestBuffer(((Agents.QueryBuilder) (obj)).query());
        Iterator iterator1 = ((GameRequestBuffer) (obj)).iterator();
_L8:
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        String s;
        String s1;
        Object obj1;
        Object obj2;
        obj1 = (GameRequest)iterator1.next();
        s1 = ((GameRequest) (obj1)).getGame().getApplicationId();
        s = gamesclientcontext.mExternalCurrentPlayerId;
        obj2 = ((GameRequest) (obj1)).getRecipients().iterator();
_L6:
        if (!((Iterator) (obj2)).hasNext()) goto _L4; else goto _L3
_L3:
        if (!((Player)((Iterator) (obj2)).next()).getPlayerId().equals(s)) goto _L6; else goto _L5
_L5:
        i = 1;
_L13:
        if (i == 0) goto _L8; else goto _L7
_L7:
        if (!arraymap.containsKey(s1)) goto _L10; else goto _L9
_L9:
        String s2;
        obj2 = (RequestSummariesData)arraymap.get(s1);
        s2 = ((GameRequest) (obj1)).getSender().getPlayerId();
        ((RequestSummariesData) (obj2)).externalPlayerIds.add(s2);
        ((RequestSummariesData) (obj2)).contentValues.put("player_count", Integer.valueOf(((RequestSummariesData) (obj2)).externalPlayerIds.size() - 1));
        long l;
        if (((GameRequest) (obj1)).getType() == 2)
        {
            s = "wish_count";
        } else
        {
            s = "gift_count";
        }
        i = ((RequestSummariesData) (obj2)).contentValues.getAsInteger(s).intValue();
        ((RequestSummariesData) (obj2)).contentValues.put(s, Integer.valueOf(i + 1));
        l = ((GameRequest) (obj1)).getExpirationTimestamp();
        if (l >= ((RequestSummariesData) (obj2)).getExpirationTimestamp()) goto _L12; else goto _L11
_L11:
        ((RequestSummariesData) (obj2)).contentValues.put("expiration_timestamp", Long.valueOf(l));
        i = 1;
_L16:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_380;
        }
        if (!((RequestSummariesData) (obj2)).requestingPlayerId.equals(s2))
        {
            ((RequestSummariesData) (obj2)).contentValues.putAll(PlayerRef.toContentValues(((GameRequest) (obj1)).getSender()));
        }
        arraymap.put(s1, obj2);
          goto _L8
        gamesclientcontext;
        ((GameRequestBuffer) (obj)).release();
        throw gamesclientcontext;
_L4:
        i = 0;
          goto _L13
_L10:
        s2 = gamesclientcontext.mExternalCurrentPlayerId;
        s = ((GameRequest) (obj1)).getSender().getPlayerId();
        obj2 = new ContentValues();
        ((ContentValues) (obj2)).putAll(GameRef.toContentValues(((GameRequest) (obj1)).getGame()));
        ((ContentValues) (obj2)).putAll(PlayerRef.toContentValues("sender_", ((GameRequest) (obj1)).getSender()));
        int k;
        if (((GameRequest) (obj1)).getType() == 2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L14
_L15:
        ((ContentValues) (obj2)).put("wish_count", Integer.valueOf(k));
        if (i != 0)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        ((ContentValues) (obj2)).put("gift_count", Integer.valueOf(i));
        ((ContentValues) (obj2)).put("expiration_timestamp", Long.valueOf(((GameRequest) (obj1)).getExpirationTimestamp()));
        obj1 = new RequestSummariesData(((ContentValues) (obj2)), s2);
        ((RequestSummariesData) (obj1)).externalPlayerIds.add(s);
        ((ContentValues) (obj2)).put("player_count", Integer.valueOf(((RequestSummariesData) (obj1)).externalPlayerIds.size() - 1));
        arraymap.put(s1, obj1);
          goto _L8
_L18:
        k = 0;
          goto _L15
_L2:
        ((GameRequestBuffer) (obj)).release();
        gamesclientcontext = new ArrayList(arraymap.values());
        Collections.sort(gamesclientcontext);
        for (Iterator iterator = gamesclientcontext.iterator(); iterator.hasNext(); builder.withRow(((RequestSummariesData)iterator.next()).contentValues)) { }
        return builder.build(Agents.resolveStatusCode(gamesclientcontext.size(), j));
_L12:
        i = 0;
          goto _L16
_L14:
        if (i == 0) goto _L18; else goto _L17
_L17:
        k = 1;
          goto _L15
    }

    public static DataHolder getLocalRequests(GamesClientContext gamesclientcontext, int i, int j, int k, int l)
    {
        QuerySpec queryspec = getLocalQuery(gamesclientcontext.mClientContext, gamesclientcontext.mExternalTargetGameId, gamesclientcontext.resolveCurrentPlayerId(), i, j);
        k;
        JVM INSTR tableswitch 0 1: default 44
    //                   0 69
    //                   1 106;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown sort order ")).append(k).toString());
_L2:
        String s = "expiration_timestamp ASC";
_L5:
        gamesclientcontext = new Agents.QueryBuilder(gamesclientcontext);
        gamesclientcontext.mQuery = queryspec;
        gamesclientcontext.mSortOrder = s;
        gamesclientcontext.mStatusCode = l;
        return gamesclientcontext.query();
_L3:
        s = "sender_is_in_circles DESC, CASE WHEN sender_is_in_circles=0 THEN next_expiring_request ELSE NULL END ASC, CASE WHEN sender_is_in_circles=0 THEN sender_id ELSE NULL END,expiration_timestamp ASC";
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static Map getSenderImageUris(Context context, ClientContext clientcontext)
    {
        ArrayMap arraymap;
        arraymap = new ArrayMap();
        context = new GameRequestBuffer((new Agents.QueryBuilder(context)).setQuerySpec(com.google.android.gms.games.provider.GamesContractInternal.RequestEntities.getContentUri(clientcontext)).query());
        GameRequest gamerequest;
        Uri uri;
        for (clientcontext = context.iterator(); clientcontext.hasNext(); arraymap.put(gamerequest.getRequestId(), uri))
        {
            gamerequest = (GameRequest)clientcontext.next();
            uri = gamerequest.getSender().getIconImageUri();
        }

        break MISSING_BLOCK_LABEL_96;
        clientcontext;
        context.release();
        throw clientcontext;
        context.release();
        return arraymap;
    }

    private static void handleOfflineDismiss(GamesClientContext gamesclientcontext, RequestUpdateList requestupdatelist)
    {
        Context context = gamesclientcontext.mContext;
        gamesclientcontext = gamesclientcontext.mClientContext;
        ArrayList arraylist = new ArrayList(requestupdatelist.getItems().size());
        Iterator iterator = requestupdatelist.getItems().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = ((RequestUpdate)iterator.next()).getId();
            Uri uri = com.google.android.gms.games.provider.GamesContractInternal.Requests.getUriForExternalRequestId(gamesclientcontext, s);
            if (Agents.getCount(context, uri) != 0L)
            {
                arraylist.add(ContentProviderOperation.newDelete(uri).build());
            }
            if (Agents.getCount(context, com.google.android.gms.games.provider.GamesContractInternal.RequestPendingOps.getUriForExternalRequestId(gamesclientcontext, s)) == 0L)
            {
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("client_context_id", Long.valueOf(Agents.resolveClientContextId(context, gamesclientcontext)));
                contentvalues.put("external_request_id", s);
                contentvalues.put("external_game_id", (String)((FastMapJsonResponse) (requestupdatelist)).mValues.get("requestingApplicationId"));
                arraylist.add(ContentProviderOperation.newInsert(com.google.android.gms.games.provider.GamesContractInternal.RequestPendingOps.getContentUri(gamesclientcontext)).withValues(contentvalues).build());
            }
        } while (true);
        Agents.applyContentOperations(context.getContentResolver(), arraylist, "RequestAgent");
    }

    private static boolean notifyListeners(GamesClientContext gamesclientcontext, String s, boolean flag)
    {
        GameRequestBuffer gamerequestbuffer;
        GameEventListenerRegistry gameeventlistenerregistry;
        String s1;
        DataHolder dataholder;
        gameeventlistenerregistry = GameEventListenerRegistry.getInstance();
        s1 = AccountUtils.getResolvedAccountName(gamesclientcontext.mClientContext);
        if (!gameeventlistenerregistry.hasRequestListener(s1, gamesclientcontext.mExternalTargetGameId))
        {
            return false;
        }
        dataholder = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(com.google.android.gms.games.provider.GamesContractInternal.RequestEntities.getUriForExternalRequestId(gamesclientcontext.mClientContext, s)).query();
        gamerequestbuffer = new GameRequestBuffer(dataholder);
        boolean flag1;
        if (gamerequestbuffer.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        flag1 = gamesclientcontext.mExternalCurrentPlayerId.equals(((GameRequest)gamerequestbuffer.get(0)).getSender().getPlayerId());
        if (flag1)
        {
            gamerequestbuffer.release();
            return false;
        }
        flag = gameeventlistenerregistry.deliverRequest(s1, gamesclientcontext.mExternalTargetGameId, s, dataholder, flag);
        gamerequestbuffer.release();
        return flag;
        gamesclientcontext;
        gamerequestbuffer.release();
        throw gamesclientcontext;
    }

    static void postProcessNetworkEntities(GamesClientContext gamesclientcontext, SyncNetworkResponse syncnetworkresponse)
    {
        Map map;
        ArrayList arraylist;
        Uri uri;
        ArrayList arraylist1;
        int i;
        int j;
        map = getSenderImageUris(gamesclientcontext.mContext, gamesclientcontext.mClientContext);
        arraylist = new ArrayList();
        uri = com.google.android.gms.games.provider.GamesContractInternal.Notifications.getContentUri(gamesclientcontext.mClientContext);
        arraylist1 = syncnetworkresponse.mEntities;
        i = 0;
        j = arraylist1.size();
_L8:
        if (i >= j) goto _L2; else goto _L1
_L1:
        String s;
        Object obj;
        String s1;
        obj = (RequestEntity)arraylist1.get(i);
        syncnetworkresponse = ((RequestEntity) (obj)).getRequest();
        s = syncnetworkresponse.getId();
        s1 = syncnetworkresponse.getApplicationId();
        if (gamesclientcontext.hasTargetGameId()) goto _L4; else goto _L3
_L3:
        Object obj1 = gamesclientcontext.getBuilder();
        obj1.mExternalTargetGameId = s1;
        obj1 = ((GamesClientContext.Builder) (obj1)).build();
        boolean flag;
        if (syncnetworkresponse.getStatus().intValue() == 1000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!notifyListeners(((GamesClientContext) (obj1)), s, flag)) goto _L4; else goto _L5
_L5:
        GamesLog.d("RequestAgent", (new StringBuilder("Notification ")).append(s).append(" consumed by listener for game ").append(s1).append(". Deleting.").toString());
        arraylist.add(ContentProviderOperation.newDelete(uri).withSelection("external_sub_id=?", new String[] {
            s
        }).withYieldAllowed(Agents.shouldAllowYieldAtIndex(arraylist.size())).build());
        syncnetworkresponse = ((RequestEntity) (obj)).getNotification();
        if (syncnetworkresponse != null)
        {
            GamesPlayLogger.logNotificationAction(((GamesClientContext) (obj1)).mContext, s1, AccountUtils.getResolvedAccountName(((GamesClientContext) (obj1)).mClientContext), 4, 6, syncnetworkresponse.getId());
        }
_L6:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        if (((RequestEntity) (obj)).getNotification() != null)
        {
            QuerySpec queryspec = new QuerySpec(uri);
            queryspec.addWhere("external_sub_id", s);
            queryspec.addWhere("notification_id", ((RequestEntity) (obj)).getNotification().getId());
            obj = ContentProviderOperation.newUpdate(uri).withSelection(queryspec.getSelection(), queryspec.mSelectionArgs).withYieldAllowed(Agents.shouldAllowYieldAtIndex(arraylist.size()));
            if (syncnetworkresponse.getInboundRequestInfo() != null)
            {
                syncnetworkresponse = (Uri)map.get(s);
                if (syncnetworkresponse == null)
                {
                    syncnetworkresponse = null;
                } else
                {
                    syncnetworkresponse = Long.valueOf(ContentUris.parseId(syncnetworkresponse));
                }
                ((android.content.ContentProviderOperation.Builder) (obj)).withValue("image_id", syncnetworkresponse);
                arraylist.add(((android.content.ContentProviderOperation.Builder) (obj)).build());
            }
        }
        if (true) goto _L6; else goto _L2
_L2:
        if (arraylist.size() > 0)
        {
            Agents.applyContentOperations(gamesclientcontext.mContext.getContentResolver(), arraylist, "RequestAgent");
        }
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static Map resolveExternalGameIds(Context context, ClientContext clientcontext, SyncNetworkResponse syncnetworkresponse)
    {
        syncnetworkresponse = syncnetworkresponse.mEntities;
        int j = syncnetworkresponse.size();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            String s = ((RequestEntity)syncnetworkresponse.get(i)).getRequest().getApplicationId();
            if (s != null)
            {
                arraylist.add(s);
            }
        }

        return Agents.forceResolveExternalGameIds(context, clientcontext, arraylist);
    }

    private boolean storeRequest(GamesClientContext gamesclientcontext, Request request)
    {
        ArrayList arraylist = new ArrayList();
        if (request.getStatus().intValue() == 1000)
        {
            arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.Requests.getUriForExternalRequestId(gamesclientcontext.mClientContext, request.getId())).withYieldAllowed(Agents.shouldAllowYieldAtIndex(arraylist.size())).build());
            Agents.applyContentOperations(gamesclientcontext.mContext.getContentResolver(), arraylist, "RequestAgent");
            return true;
        }
        int i = addRequestOps(gamesclientcontext, request, arraylist);
        if (i == -1)
        {
            return false;
        }
        gamesclientcontext = Agents.applyContentOperationsWithResult(gamesclientcontext.mContext.getContentResolver(), arraylist, "RequestAgent");
        if (gamesclientcontext == null)
        {
            GamesLog.e("RequestAgent", "Failed to store data for request");
            return false;
        }
        gamesclientcontext = ((ContentProviderResult)gamesclientcontext.get(i)).uri;
        if (gamesclientcontext == null)
        {
            GamesLog.e("RequestAgent", "Failed to store data for request");
            return false;
        }
        if (ContentUris.parseId(gamesclientcontext) < 0L)
        {
            GamesLog.e("RequestAgent", "Failed to store data for newly created entity");
            return false;
        } else
        {
            return true;
        }
    }

    public static void trimRequestEntitiesForPlayer(GamesClientContext gamesclientcontext)
    {
        ArrayMap arraymap;
        Object obj;
        int i;
        int k;
        long l;
        long l3;
        arraymap = new ArrayMap();
        k = ((Integer)G.maxAcceptedOutboundRequests.get()).intValue();
        l = -1L;
        l3 = gamesclientcontext.resolveCurrentPlayerId();
        i = 0;
        obj = new QuerySpec(com.google.android.gms.games.provider.GamesContractInternal.Requests.getContentUri(gamesclientcontext.mClientContext));
        ((QuerySpec) (obj)).addWhere("status", "1");
        ((QuerySpec) (obj)).addWhere("sender_id", String.valueOf(l3));
        Agents.QueryBuilder querybuilder = new Agents.QueryBuilder(gamesclientcontext);
        querybuilder.mQuery = ((QuerySpec) (obj));
        querybuilder.mProjection = TrimRequestsQuery.PROJECTION;
        querybuilder.mSortOrder = "game_id,creation_timestamp DESC";
        obj = querybuilder.queryCursor();
_L7:
        if (!((Cursor) (obj)).moveToNext()) goto _L2; else goto _L1
_L1:
        long l2 = ((Cursor) (obj)).getLong(1);
        int j;
        long l1;
        j = i;
        l1 = l;
        if (l2 != l)
        {
            l1 = l2;
            j = 0;
        }
          goto _L3
_L5:
        i = j;
        l = l1;
        if (arraymap.containsKey(Long.valueOf(l2)))
        {
            continue; /* Loop/switch isn't completed */
        }
        arraymap.put(Long.valueOf(l2), Long.valueOf(((Cursor) (obj)).getLong(2)));
        i = j;
        l = l1;
        continue; /* Loop/switch isn't completed */
        gamesclientcontext;
        ((Cursor) (obj)).close();
        throw gamesclientcontext;
_L2:
        ((Cursor) (obj)).close();
        obj = new ArrayList(arraymap.keySet().size());
        Uri uri;
        QuerySpec queryspec;
        for (Iterator iterator = arraymap.keySet().iterator(); iterator.hasNext(); ((ArrayList) (obj)).add(ContentProviderOperation.newDelete(uri).withSelection(queryspec.getSelection(), queryspec.mSelectionArgs).withYieldAllowed(Agents.shouldAllowYieldAtIndex(((ArrayList) (obj)).size())).build()))
        {
            Long long1 = (Long)iterator.next();
            l = ((Long)arraymap.get(long1)).longValue();
            uri = com.google.android.gms.games.provider.GamesContractInternal.Requests.getContentUri(gamesclientcontext.mClientContext);
            queryspec = new QuerySpec(uri);
            queryspec.addWhere("status", "1");
            queryspec.addWhere("creation_timestamp", String.valueOf(l), "<=?");
            queryspec.addWhere("game_id", String.valueOf(long1));
            queryspec.addWhere("sender_id", String.valueOf(l3));
        }

        if (((ArrayList) (obj)).size() > 0)
        {
            Agents.applyContentOperations(gamesclientcontext.mContext.getContentResolver(), ((ArrayList) (obj)), "RequestAgent");
        }
        return;
_L3:
        if (j >= k) goto _L5; else goto _L4
_L4:
        i = j + 1;
        l = l1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final volatile void acquireLockOnAllChildren()
    {
        super.acquireLockOnAllChildren();
    }

    final int addRequestOps(GamesClientContext gamesclientcontext, Request request, ArrayList arraylist)
    {
        long l = gamesclientcontext.resolveCurrentPlayerId();
        long l1 = gamesclientcontext.resolveTargetGameId();
        Object obj = gamesclientcontext.mClientContext;
        Object obj2 = DefaultClock.getInstance();
        Object obj1 = request.getId();
        if (request.getStatus().intValue() == 1000)
        {
            arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.Requests.getUriForExternalRequestId(((ClientContext) (obj)), ((String) (obj1)))).withYieldAllowed(Agents.shouldAllowYieldAtIndex(arraylist.size())).build());
            return -1;
        }
        obj1 = request.getInboundRequestInfo();
        int i = -1;
        if (obj1 != null)
        {
            com.google.android.gms.games.server.api.Player player = ((InboundRequestInfo) (obj1)).getSenderPlayer();
            i = arraylist.size();
            arraylist.add(Agents.getPlayerUpsertOp(((ClientContext) (obj)), ((FastContentValuesJsonResponse) (player)).mValues, ((Clock) (obj2)).currentTimeMillis()));
        }
        obj2 = new ContentValues(((FastContentValuesJsonResponse) (request)).mValues);
        ((ContentValues) (obj2)).remove("external_game_id");
        ((ContentValues) (obj2)).put("game_id", Long.valueOf(l1));
        int j = arraylist.size();
        obj2 = ContentProviderOperation.newInsert(com.google.android.gms.games.provider.GamesContractInternal.Requests.getContentUri(((ClientContext) (obj)))).withValues(((ContentValues) (obj2)));
        if (i == -1)
        {
            ((android.content.ContentProviderOperation.Builder) (obj2)).withValue("sender_id", Long.valueOf(l));
        } else
        {
            ((android.content.ContentProviderOperation.Builder) (obj2)).withValueBackReference("sender_id", i);
        }
        arraylist.add(((android.content.ContentProviderOperation.Builder) (obj2)).withYieldAllowed(true).build());
        obj = com.google.android.gms.games.provider.GamesContractInternal.RequestRecipients.getContentUri(((ClientContext) (obj)));
        if (obj1 != null)
        {
            gamesclientcontext = new ContentValues(((FastContentValuesJsonResponse) (obj1)).mValues);
            gamesclientcontext.put("player_id", Long.valueOf(l));
            arraylist.add(ContentProviderOperation.newInsert(((Uri) (obj))).withValues(gamesclientcontext).withValueBackReference("request_id", j).build());
            return j;
        } else
        {
            request = request.getOutboundRequestInfo();
            Asserts.checkNotNull(request, "Request has no outbound or inbound info");
            addRecipientOps(gamesclientcontext, ((Uri) (obj)), request, j, arraylist);
            return j;
        }
    }

    public final volatile void assertAllChildrenLockedByCurrentThread()
    {
        super.assertAllChildrenLockedByCurrentThread();
    }

    public final volatile void assertLockedByCurrentThread()
    {
        super.assertLockedByCurrentThread();
    }

    public final volatile void assertNoChildrenLockedByCurrentThread()
    {
        super.assertNoChildrenLockedByCurrentThread();
    }

    public final void clearActivityTypes(int i)
    {
        if ((i & 4) != 0)
        {
            mHasNewActivity = false;
        }
    }

    public final volatile int compareTo(Lockable lockable)
    {
        return super.compareTo(lockable);
    }

    public final volatile void dumpLockInfo(PrintWriter printwriter, String s)
    {
        super.dumpLockInfo(printwriter, s);
    }

    public final int flushPendingOps(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        Context context;
        ArrayList arraylist;
        ArrayMap arraymap;
        Object obj3;
        Object obj4;
        int i;
        context = gamesclientcontext.mContext;
        Uri uri = com.google.android.gms.games.provider.GamesContractInternal.RequestPendingOps.getContentUri(gamesclientcontext.mClientContext);
        obj3 = AccountUtils.getResolvedAccountName(gamesclientcontext.mClientContext);
        arraylist = new ArrayList();
        obj4 = context.getContentResolver().query(uri, PendingOpsQuery.PROJECTION, "account_name=?", new String[] {
            obj3
        }, "package_name");
        arraymap = new ArrayMap();
        i = 0;
_L12:
        Object obj1;
        Object obj5;
        String s;
        if (!((Cursor) (obj4)).moveToNext())
        {
            break MISSING_BLOCK_LABEL_241;
        }
        obj5 = ((Cursor) (obj4)).getString(1);
        s = ((Cursor) (obj4)).getString(2);
        obj1 = Agents.restoreClientContext(((Cursor) (obj4)).getInt(4), ((Cursor) (obj4)).getString(3), ((String) (obj3)));
        if (!arraymap.containsKey(obj1)) goto _L2; else goto _L1
_L1:
        Object obj = (Map)arraymap.get(obj1);
_L5:
        if (!((Map) (obj)).containsKey(s)) goto _L4; else goto _L3
_L3:
        obj = (ArrayList)((Map) (obj)).get(s);
_L6:
        ((ArrayList) (obj)).add(obj5);
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        obj = new ArrayMap();
        arraymap.put(obj1, obj);
          goto _L5
        gamesclientcontext;
        ((Cursor) (obj4)).close();
        throw gamesclientcontext;
_L4:
        obj1 = new ArrayList();
        ((Map) (obj)).put(s, obj1);
        obj = obj1;
          goto _L6
        ((Cursor) (obj4)).close();
        obj3 = arraymap.keySet().iterator();
_L8:
        int j;
        if (!((Iterator) (obj3)).hasNext())
        {
            break MISSING_BLOCK_LABEL_559;
        }
        obj4 = (ClientContext)((Iterator) (obj3)).next();
        obj5 = ((Map)arraymap.get(obj4)).keySet().iterator();
        j = i;
_L10:
        i = j;
        if (!((Iterator) (obj5)).hasNext()) goto _L8; else goto _L7
_L7:
        Object obj2 = (String)((Iterator) (obj5)).next();
        Object obj6 = gamesclientcontext.getBuilder(context, ((ClientContext) (obj4)));
        String s1;
        if (((GamesClientContext.Builder) (obj6)).mClientContext.isCurrentContext())
        {
            obj = null;
        } else
        {
            obj = obj2;
        }
        obj6.mExternalOwningGameId = ((String) (obj));
        obj6.mExternalTargetGameId = ((String) (obj2));
        obj = updateRequests(((GamesClientContext.Builder) (obj6)).build(), (ArrayList)((Map)arraymap.get(obj4)).get(obj2), 1, false);
        obj6 = RequestUpdateOutcomes.fromDataHolder(((DataHolder) (obj)));
        obj2 = ((ArrayList)((Map)arraymap.get(obj4)).get(obj2)).iterator();
_L9:
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break MISSING_BLOCK_LABEL_545;
            }
            s1 = (String)((Iterator) (obj2)).next();
            Preconditions.checkArgument(((RequestUpdateOutcomes) (obj6)).mOutcomeMap.containsKey(s1), (new StringBuilder("Request ")).append(s1).append(" was not part of the update operation!").toString());
        } while (((Integer)((RequestUpdateOutcomes) (obj6)).mOutcomeMap.get(s1)).intValue() != 0);
        arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.RequestPendingOps.getUriForExternalRequestId(((ClientContext) (obj4)), s1)).build());
        j--;
          goto _L9
        ((DataHolder) (obj)).close();
          goto _L10
        gamesclientcontext;
        ((DataHolder) (obj)).close();
        throw gamesclientcontext;
        if (!arraylist.isEmpty())
        {
            Agents.applyContentOperations(context.getContentResolver(), arraylist, "RequestAgent");
        }
        if (i == 0)
        {
            return 0;
        }
        return 5;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final String getActivityKey()
    {
        return "inbox_requests_count";
    }

    public final int getInboxCount(GamesClientContext gamesclientcontext)
    {
        DataHolder dataholder = getLocalRequests(gamesclientcontext, 0, 1, 0, 0);
        int i = (new GameRequestBuffer(dataholder)).getCount();
        dataholder.close();
        gamesclientcontext = getLocalRequests(gamesclientcontext, 0, 2, 0, 0);
        int j = (new GameRequestBuffer(gamesclientcontext)).getCount();
        gamesclientcontext.close();
        return i + 0 + j;
        gamesclientcontext;
        dataholder.close();
        throw gamesclientcontext;
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
        return mHasNewActivity;
    }

    public final volatile boolean isLockedByCurrentThread()
    {
        return super.isLockedByCurrentThread();
    }

    public final volatile void releaseLockOnAllChildren()
    {
        super.releaseLockOnAllChildren();
    }

    public final DataHolder sendRequest(GamesClientContext gamesclientcontext, int i, Integer integer, byte abyte0[], ArrayList arraylist)
        throws GoogleAuthException
    {
        flushPendingOps(gamesclientcontext);
        if (arraylist.size() > 8)
        {
            return DataHolder.empty(2002);
        }
        Object obj;
        StringBuilder stringbuilder;
        if (abyte0 == null)
        {
            abyte0 = null;
        } else
        {
            abyte0 = Base64Utils.encodeUrlSafe(abyte0);
        }
        obj = integer;
        if (integer.intValue() == -1)
        {
            obj = null;
        }
        integer = new SendRequest(gamesclientcontext.mExternalTargetGameId, ((Integer) (obj)), abyte0, arraylist, Long.valueOf(mRandom.nextLong()), RequestType.fromInt(i));
        try
        {
            abyte0 = mRequestApiInternal;
            arraylist = gamesclientcontext.mClientContext;
            obj = Agents.getLocaleString(gamesclientcontext.mContext);
            stringbuilder = new StringBuilder("requests/send");
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            GamesLog.e("RequestAgent", (new StringBuilder("Failed to send a request: ")).append(gamesclientcontext.getMessage()).toString());
            return DataHolder.empty(6);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        RequestsApiInternal.append(stringbuilder, "language", RequestsApiInternal.enc(((String) (obj))));
        obj = stringbuilder.toString();
        integer = (Request)((RequestsApiInternal) (abyte0)).mServer.getResponseBlocking(arraylist, 2, ((String) (obj)), integer, com/google/android/gms/games/server/api/Request);
        if (!storeRequest(gamesclientcontext, integer))
        {
            return DataHolder.empty(1);
        } else
        {
            return (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(com.google.android.gms.games.provider.GamesContractInternal.RequestEntities.getUriForExternalRequestId(gamesclientcontext.mClientContext, integer.getId())).query();
        }
    }

    final SyncNetworkResponse syncFromNetwork(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
_L2:
        ClientContext clientcontext;
        RequestsApiInternal requestsapiinternal;
        String s2;
        Object obj1;
        StringBuilder stringbuilder;
        clientcontext = Agents.buildFirstPartyClientContext(gamesclientcontext.mClientContext);
        requestsapiinternal = mRequestApiInternal;
        s2 = Agents.getLocaleString(gamesclientcontext.mContext);
        obj1 = gamesclientcontext.mExternalTargetGameId;
        stringbuilder = new StringBuilder("requests/sync");
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        RequestsApiInternal.append(stringbuilder, "language", RequestsApiInternal.enc(s2));
        RequestsApiInternal.append(stringbuilder, "platformType", RequestsApiInternal.enc("ANDROID"));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        RequestsApiInternal.append(stringbuilder, "requestingApplicationId", RequestsApiInternal.enc(((String) (obj1))));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        RequestsApiInternal.append(stringbuilder, "syncToken", RequestsApiInternal.enc(s));
        String s3 = stringbuilder.toString();
        obj1 = (RequestSyncResponseFirstParty)requestsapiinternal.mServer.getResponseBlocking(clientcontext, 0, s3, null, com/google/android/gms/games/server/api/RequestSyncResponseFirstParty);
        int i = 0;
        ArrayList arraylist = ((RequestSyncResponseFirstParty) (obj1)).getItems();
        String s4 = (String)((FastMapJsonResponse) (obj1)).mValues.get("syncToken");
        String s1 = s4;
        if (((Boolean)((FastMapJsonResponse) (obj1)).mValues.get("moreAvailable")).booleanValue())
        {
            Object obj;
            int j;
            boolean flag;
            if (!Objects.equal(s, s4))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag, "Server claims to have more data, yet sync tokens match!");
            gamesclientcontext = syncFromNetwork(gamesclientcontext, s4);
            j = ((SyncNetworkResponse) (gamesclientcontext)).mStatusCode;
            s1 = s4;
            i = j;
            if (j == 0)
            {
                arraylist.addAll(((SyncNetworkResponse) (gamesclientcontext)).mEntities);
                s1 = ((SyncNetworkResponse) (gamesclientcontext)).mNewSyncToken;
                i = j;
            }
        }
        gamesclientcontext = arraylist;
        if (arraylist == null)
        {
            gamesclientcontext = new ArrayList();
        }
        return new SyncNetworkResponse(gamesclientcontext, s1, i);
        obj;
        if (!ErrorUtils.hasStatusCode(((VolleyError) (obj)), 410))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = new ArrayList(3);
        ((ArrayList) (obj)).add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.GamesContractInternal.AccountMetadata.getContentUri(gamesclientcontext.mClientContext)).withValue("request_sync_token", null).build());
        ((ArrayList) (obj)).add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.Requests.getContentUri(gamesclientcontext.mClientContext)).build());
        Agents.applyContentOperations(gamesclientcontext.mContext.getContentResolver(), ((ArrayList) (obj)), "RequestAgent");
        GamesLog.d("RequestAgent", (new StringBuilder("Token ")).append(s).append(" is invalid. Retrying with no token.").toString());
        s = null;
        if (true) goto _L2; else goto _L1
_L1:
        if (GamesLog.canLog$134632())
        {
            ErrorUtils.parseAndLogErrorResponse(((VolleyError) (obj)), "RequestAgent");
        }
        return new SyncNetworkResponse();
    }

    final DataHolder updateRequests(GamesClientContext gamesclientcontext, ArrayList arraylist, int i, boolean flag)
        throws GoogleAuthException
    {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        obj3 = gamesclientcontext.mExternalTargetGameId;
        obj2 = new ArrayList();
        obj = new ArrayList();
        obj4 = arraylist.iterator();
_L39:
        if (!((Iterator) (obj4)).hasNext()) goto _L2; else goto _L1
_L1:
        Object obj5;
        long l1;
        obj5 = (String)((Iterator) (obj4)).next();
        l1 = mRandom.nextLong();
        i;
        JVM INSTR tableswitch 0 1: default 84
    //                   0 173
    //                   1 181;
           goto _L3 _L4 _L5
_L3:
        Object obj1;
        GamesLog.e("RequestUpdateType", (new StringBuilder("Unknown request update state: ")).append(i).toString());
        obj1 = "UNKNOWN_UPDATE";
_L6:
        ((ArrayList) (obj)).add(new RequestUpdate(((String) (obj5)), Long.valueOf(l1), ((String) (obj1))));
        if (((ArrayList) (obj)).size() >= 25)
        {
            ((ArrayList) (obj2)).add(new RequestUpdateList(((ArrayList) (obj)), ((String) (obj3))));
            obj = new ArrayList();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        obj1 = "ACCEPT";
        continue; /* Loop/switch isn't completed */
_L5:
        obj1 = "DISMISS";
        if (true) goto _L6; else goto _L2
_L2:
        int j;
        boolean flag1;
        int i1;
        if (((ArrayList) (obj)).size() > 0)
        {
            ((ArrayList) (obj2)).add(new RequestUpdateList(((ArrayList) (obj)), ((String) (obj3))));
        }
        obj = new com.google.android.gms.games.internal.request.RequestUpdateOutcomes.Builder();
        obj.mStatusCode = 0;
        flag1 = false;
        obj1 = new ArrayList();
        j = 0;
        i1 = ((ArrayList) (obj2)).size();
_L8:
        if (j >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        String s;
        StringBuilder stringbuilder;
        obj3 = mRequestApiInternal;
        obj4 = gamesclientcontext.mClientContext;
        s = Agents.getLocaleString(gamesclientcontext.mContext);
        obj5 = (RequestUpdateList)((ArrayList) (obj2)).get(j);
        stringbuilder = new StringBuilder("requests");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_321;
        }
        RequestsApiInternal.append(stringbuilder, "language", RequestsApiInternal.enc(s));
        String s1 = stringbuilder.toString();
        ((ArrayList) (obj1)).addAll(((RequestUpdateResultList)((RequestsApiInternal) (obj3)).mServer.getResponseBlocking(((ClientContext) (obj4)), 2, s1, obj5, com/google/android/gms/games/server/api/RequestUpdateResultList)).getItems());
_L10:
        j++;
        if (true) goto _L8; else goto _L7
        VolleyError volleyerror;
        volleyerror;
        int l;
        GamesLog.e("RequestAgent", (new StringBuilder("Failed to send an update: ")).append(volleyerror.getMessage()).toString());
        l = 1;
        volleyerror = (RequestUpdateList)((ArrayList) (obj2)).get(j);
        flag1 = l;
        if (i != 1) goto _L10; else goto _L9
_L9:
        int k;
        int j1;
        handleOfflineDismiss(gamesclientcontext, volleyerror);
        volleyerror = volleyerror.getItems();
        k = 0;
        j1 = volleyerror.size();
_L12:
        flag1 = l;
        if (k >= j1) goto _L10; else goto _L11
_L11:
        ((com.google.android.gms.games.internal.request.RequestUpdateOutcomes.Builder) (obj)).addRequestOutcome(((RequestUpdate)volleyerror.get(k)).getId(), 0);
        k++;
          goto _L12
          goto _L10
_L7:
        if (!flag1 && flag)
        {
            flushPendingOps(gamesclientcontext);
        }
        l = arraylist.size();
        k = ((com.google.android.gms.games.internal.request.RequestUpdateOutcomes.Builder) (obj)).mOutcomeMap.size();
        i1 = ((ArrayList) (obj1)).size() + k;
        obj1 = ((ArrayList) (obj1)).iterator();
_L37:
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (RequestUpdateResult)((Iterator) (obj1)).next();
        volleyerror = ((RequestUpdateResult) (obj2)).getUpdatedRequest();
        obj4 = ((RequestUpdateResult) (obj2)).getOutcome();
        j = -1;
        ((String) (obj4)).hashCode();
        JVM INSTR lookupswitch 10: default 664
    //                   -2119615265: 898
    //                   -1932564335: 932
    //                   -1416305653: 968
    //                   -1346728829: 881
    //                   -1149187101: 830
    //                   330987829: 986
    //                   688802715: 950
    //                   840924829: 915
    //                   1023286998: 864
    //                   1042782100: 847;
           goto _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23
_L13:
        j;
        JVM INSTR tableswitch 0 9: default 720
    //                   0 1004
    //                   1 1010
    //                   2 1016
    //                   3 1022
    //                   4 1028
    //                   5 1034
    //                   6 1040
    //                   7 1046
    //                   8 1052
    //                   9 1058;
           goto _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34
_L24:
        GamesLog.e("RequestUpdateResultOutcome", (new StringBuilder("Unknown outcome type string: ")).append(((String) (obj4))).toString());
        j = -1;
_L35:
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        default:
            GamesLog.e("RequestAgent", String.format("Failed to update request %s: %s", new Object[] {
                ((RequestUpdateResult) (obj2)).getId(), ((RequestUpdateResult) (obj2)).getOutcome()
            }));
            ((com.google.android.gms.games.internal.request.RequestUpdateOutcomes.Builder) (obj)).addRequestOutcome(((RequestUpdateResult) (obj2)).getId(), 1);
            break;

        case 0: // '\0'
            ((com.google.android.gms.games.internal.request.RequestUpdateOutcomes.Builder) (obj)).addRequestOutcome(((RequestUpdateResult) (obj2)).getId(), j);
            switch (i)
            {
            default:
                if (storeRequest(gamesclientcontext, volleyerror))
                {
                    k++;
                }
                break;

            case 1: // '\001'
                obj2 = com.google.android.gms.games.provider.GamesContractInternal.Requests.getUriForExternalRequestId(gamesclientcontext.mClientContext, ((RequestUpdateResult) (obj2)).getId());
                gamesclientcontext.mContext.getContentResolver().delete(((Uri) (obj2)), null, null);
                k++;
                break;
            }
            break;

        case 3: // '\003'
            GamesLog.e("RequestAgent", String.format("Request %s was already expired; deleting.", new Object[] {
                ((RequestUpdateResult) (obj2)).getId()
            }));
            volleyerror = com.google.android.gms.games.provider.GamesContractInternal.Requests.getUriForExternalRequestId(gamesclientcontext.mClientContext, ((RequestUpdateResult) (obj2)).getId());
            gamesclientcontext.mContext.getContentResolver().delete(volleyerror, null, null);
            ((com.google.android.gms.games.internal.request.RequestUpdateOutcomes.Builder) (obj)).addRequestOutcome(((RequestUpdateResult) (obj2)).getId(), 1);
            break;

        case 4: // '\004'
            if (storeRequest(gamesclientcontext, volleyerror))
            {
                k++;
                ((com.google.android.gms.games.internal.request.RequestUpdateOutcomes.Builder) (obj)).addRequestOutcome(((RequestUpdateResult) (obj2)).getId(), 0);
            } else
            {
                ((com.google.android.gms.games.internal.request.RequestUpdateOutcomes.Builder) (obj)).addRequestOutcome(((RequestUpdateResult) (obj2)).getId(), 1);
            }
            break;
        }
        continue; /* Loop/switch isn't completed */
_L18:
        if (((String) (obj4)).equals("SUCCESS"))
        {
            j = 0;
        }
          goto _L13
_L23:
        if (((String) (obj4)).equals("ALREADY_UPDATED"))
        {
            j = 1;
        }
          goto _L13
_L22:
        if (((String) (obj4)).equals("NOT_FOUND"))
        {
            j = 2;
        }
          goto _L13
_L17:
        if (((String) (obj4)).equals("INVALID_ID"))
        {
            j = 3;
        }
          goto _L13
_L14:
        if (((String) (obj4)).equals("INVALID_OPERATION"))
        {
            j = 4;
        }
          goto _L13
_L21:
        if (((String) (obj4)).equals("DUPLICATE_UPDATE"))
        {
            j = 5;
        }
          goto _L13
_L15:
        if (((String) (obj4)).equals("INCONSISTENT_UPDATE"))
        {
            j = 6;
        }
          goto _L13
_L20:
        if (((String) (obj4)).equals("MALFORMED"))
        {
            j = 7;
        }
          goto _L13
_L16:
        if (((String) (obj4)).equals("PERMISSION_DENIED"))
        {
            j = 8;
        }
          goto _L13
_L19:
        if (((String) (obj4)).equals("REQUEST_EXPIRED"))
        {
            j = 9;
        }
          goto _L13
_L25:
        j = 0;
          goto _L35
_L26:
        j = 4;
          goto _L35
_L27:
        j = 1;
          goto _L35
_L28:
        j = 1;
          goto _L35
_L29:
        j = 1;
          goto _L35
_L30:
        j = 1;
          goto _L35
_L31:
        j = 1;
          goto _L35
_L32:
        j = 1;
          goto _L35
_L33:
        j = 1;
          goto _L35
_L34:
        j = 3;
          goto _L35
        if (true) goto _L37; else goto _L36
_L36:
        if (k == 0 && flag1)
        {
            return DataHolder.empty(6);
        }
        if (i1 < l)
        {
            obj.mStatusCode = 2000;
            for (i = 0; i < l; i++)
            {
                gamesclientcontext = (String)arraylist.get(i);
                if (!((com.google.android.gms.games.internal.request.RequestUpdateOutcomes.Builder) (obj)).mOutcomeMap.containsKey(gamesclientcontext))
                {
                    ((com.google.android.gms.games.internal.request.RequestUpdateOutcomes.Builder) (obj)).addRequestOutcome(gamesclientcontext, 2);
                }
            }

        } else
        if (k < i1)
        {
            if (k == 0)
            {
                obj.mStatusCode = 2001;
            } else
            {
                obj.mStatusCode = 2000;
            }
        }
        return RequestUpdateOutcomes.toDataHolder(((com.google.android.gms.games.internal.request.RequestUpdateOutcomes.Builder) (obj)).build());
        if (true) goto _L39; else goto _L38
_L38:
    }

    static 
    {
        String as[] = com.google.android.gms.games.internal.GamesContract.PlayersColumns.ALL_COLUMNS;
        ALL_SENDER_COLUMNS = new String[38];
        int i = 0;
        do
        {
            String as1[] = com.google.android.gms.games.internal.GamesContract.PlayersColumns.ALL_COLUMNS;
            if (i < 38)
            {
                ALL_SENDER_COLUMNS[i] = (new StringBuilder("sender_")).append(com.google.android.gms.games.internal.GamesContract.PlayersColumns.ALL_COLUMNS[i]).toString();
                i++;
            } else
            {
                String as2[] = com.google.android.gms.games.internal.GamesContract.GamesColumns.ALL_COLUMNS;
                as2 = com.google.android.gms.games.internal.GamesContract.RequestSummaryColumns.ALL_COLUMNS;
                REQUEST_SUMMARY_COLUMNS = new String[72];
                as2 = com.google.android.gms.games.internal.GamesContract.GamesColumns.ALL_COLUMNS;
                String as3[] = REQUEST_SUMMARY_COLUMNS;
                String as4[] = com.google.android.gms.games.internal.GamesContract.GamesColumns.ALL_COLUMNS;
                System.arraycopy(as2, 0, as3, 0, 31);
                as2 = ALL_SENDER_COLUMNS;
                as3 = REQUEST_SUMMARY_COLUMNS;
                as4 = com.google.android.gms.games.internal.GamesContract.GamesColumns.ALL_COLUMNS;
                as4 = com.google.android.gms.games.internal.GamesContract.PlayersColumns.ALL_COLUMNS;
                System.arraycopy(as2, 0, as3, 31, 38);
                as2 = com.google.android.gms.games.internal.GamesContract.RequestSummaryColumns.ALL_COLUMNS;
                as3 = REQUEST_SUMMARY_COLUMNS;
                as4 = com.google.android.gms.games.internal.GamesContract.GamesColumns.ALL_COLUMNS;
                as4 = com.google.android.gms.games.internal.GamesContract.PlayersColumns.ALL_COLUMNS;
                as4 = com.google.android.gms.games.internal.GamesContract.RequestSummaryColumns.ALL_COLUMNS;
                System.arraycopy(as2, 0, as3, 69, 3);
            }
        } while (true);
    }
}
