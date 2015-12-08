// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.SyncResult;
import android.content.SyncStats;
import android.database.Cursor;
import android.net.Uri;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.provider.QuerySpec;
import com.google.android.gms.common.server.BaseApiaryServer;
import com.google.android.gms.common.server.error.ErrorUtils;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.events.EventIncrementEntry;
import com.google.android.gms.games.server.api.EventDefinition;
import com.google.android.gms.games.server.api.EventDefinitionListResponse;
import com.google.android.gms.games.server.api.EventPeriodRange;
import com.google.android.gms.games.server.api.EventPeriodUpdate;
import com.google.android.gms.games.server.api.EventRecordRequest;
import com.google.android.gms.games.server.api.EventUpdateRequest;
import com.google.android.gms.games.server.api.EventUpdateResponse;
import com.google.android.gms.games.server.api.EventsApi;
import com.google.android.gms.games.server.api.EventsApiInternal;
import com.google.android.gms.games.server.api.PlayerEvent;
import com.google.android.gms.games.server.api.PlayerEventListResponse;
import com.google.android.gms.games.util.AccountUtils;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, EventResolver, GamesClientContext, Agents, 
//            ApiRateLimitUtil

public final class EventAgent extends Lockable
    implements EventResolver
{
    private static final class EventDefinitionRefreshInfo
    {

        public final HashSet deletedDefinitions;
        public final ArrayList newEventDefinitions;
        public final ArrayList ops;

        private EventDefinitionRefreshInfo()
        {
            ops = new ArrayList();
            deletedDefinitions = new HashSet();
            newEventDefinitions = new ArrayList();
        }

        EventDefinitionRefreshInfo(byte byte0)
        {
            this();
        }
    }

    static interface PendingOpsQuery
    {

        public static final String PROJECTION[] = {
            "_id", "client_context_id", "window_start_time", "window_end_time", "increment", "request_id", "external_event_id", "external_game_id", "external_player_id", "package_name", 
            "package_uid"
        };

    }

    public static final class UnresolvedException extends Exception
    {
    }

    private static final class WindowInfo
    {

        public final String externalGameId;
        public final long requestId;
        public final long windowEnd;
        public final long windowStart;

        public final boolean isSameTimePeriod(WindowInfo windowinfo)
        {
            return windowStart == windowinfo.windowStart && windowEnd == windowinfo.windowEnd;
        }

        public WindowInfo(String s, long l, long l1, long l2)
        {
            windowStart = l;
            windowEnd = l1;
            requestId = l2;
            externalGameId = s;
        }
    }


    private static final Lockable.LockableLock LOCK = new Lockable.LockableLock();
    private final EventsApi mEventsApi;
    private final EventsApiInternal mEventsApiInternal;
    private final Random mRandom = new Random(DefaultClock.getInstance().currentTimeMillis());

    public EventAgent(Lockable lockable, BaseApiaryServer baseapiaryserver, BaseApiaryServer baseapiaryserver1)
    {
        super("EventAgent", LOCK, lockable);
        mEventsApi = new EventsApi(baseapiaryserver);
        mEventsApiInternal = new EventsApiInternal(baseapiaryserver1);
    }

    public static void clearPending(GamesClientContext gamesclientcontext)
    {
        Uri uri = com.google.android.gms.games.provider.GamesContractInternal.EventPendingOps.getUriForExternalPlayerAndGameId(gamesclientcontext);
        gamesclientcontext.mContext.getContentResolver().delete(uri, null, null);
    }

    private static void finishCurrentWindow(ArrayList arraylist, ArrayList arraylist1, WindowInfo windowinfo)
    {
        arraylist.add(new EventPeriodUpdate(new EventPeriodRange(Long.valueOf(windowinfo.windowEnd), Long.valueOf(windowinfo.windowStart)), arraylist1));
    }

    private static long forceResolveDefinitionId(GamesClientContext gamesclientcontext, String s)
        throws UnresolvedException
    {
        long l1 = resolveDefinitionId(gamesclientcontext, s);
        long l = l1;
        if (l1 == -1L)
        {
            GamesLog.w("EventAgent", (new StringBuilder("Inserting a local stub for event definition for game ")).append(gamesclientcontext.mExternalTargetGameId).append(", event ").append(s).append(", and player ").append(gamesclientcontext.getExternalPlayerId()).toString());
            l = gamesclientcontext.resolveTargetGameId();
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("external_event_id", s);
            contentvalues.put("event_definitions_game_id", Long.valueOf(l));
            contentvalues.put("name", "Unresolved event");
            contentvalues.put("description", "Waiting to get event information from the server");
            contentvalues.put("visibility", Integer.valueOf(0));
            l = ContentUris.parseId(gamesclientcontext.mContext.getContentResolver().insert(com.google.android.gms.games.provider.GamesContractInternal.EventDefinitions.getContentUri(gamesclientcontext.mClientContext), contentvalues));
        }
        return l;
    }

    private long forceResolveInstanceId(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException, UnresolvedException
    {
        long l1 = resolveInstanceId(gamesclientcontext, s);
        long l = l1;
        if (l1 == -1L)
        {
            GamesLog.w("EventAgent", (new StringBuilder("Inserting a local stub for event instance for game ")).append(gamesclientcontext.mExternalTargetGameId).append(", event ").append(s).append(", and player ").append(gamesclientcontext.getExternalPlayerId()).toString());
            l = gamesclientcontext.resolveCurrentPlayerId();
            long l2 = forceResolveDefinitionId(gamesclientcontext, s);
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("definition_id", Long.valueOf(l2));
            contentvalues.put("player_id", Long.valueOf(l));
            contentvalues.put("value", Integer.valueOf(0));
            gamesclientcontext.mContext.getContentResolver().insert(com.google.android.gms.games.provider.GamesContractInternal.EventInstances.getContentUri(gamesclientcontext.mClientContext), contentvalues);
            l = resolveInstanceId(gamesclientcontext, s);
        }
        return l;
    }

    private static Uri getInstanceCacheUri(GamesClientContext gamesclientcontext)
    {
        return com.google.android.gms.games.provider.GamesContractInternal.EventInstances.getUriForExternalPlayerAndGameId(gamesclientcontext.mClientContext, gamesclientcontext.getExternalPlayerId(), gamesclientcontext.getExternalGameId());
    }

    private static WindowInfo getMostRecentEventWindow(GamesClientContext gamesclientcontext, long l, long l1)
    {
        Object obj;
        obj = new QuerySpec(com.google.android.gms.games.provider.GamesContractInternal.EventPendingOps.getUriForExternalPlayerAndGameId(gamesclientcontext));
        ((QuerySpec) (obj)).addWhere("client_context_id", String.valueOf(l1));
        Agents.QueryBuilder querybuilder = new Agents.QueryBuilder(gamesclientcontext);
        querybuilder.mQuery = ((QuerySpec) (obj));
        querybuilder.mProjection = PendingOpsQuery.PROJECTION;
        querybuilder.mSortOrder = "external_game_id,window_start_time DESC limit 1";
        obj = querybuilder.queryCursor();
        if (!((Cursor) (obj)).moveToFirst() || l < ((Cursor) (obj)).getLong(2) || l >= ((Cursor) (obj)).getLong(3)) goto _L2; else goto _L1
_L1:
        l1 = ((Cursor) (obj)).getLong(2);
        l = ((Cursor) (obj)).getLong(3);
_L3:
        gamesclientcontext = new WindowInfo(gamesclientcontext.mExternalTargetGameId, l1, l, 0L);
        ((Cursor) (obj)).close();
        return gamesclientcontext;
_L2:
        l1 = l;
        long l2 = ((Long)G.eventWindowSizeMillis.get()).longValue();
        l += l2;
          goto _L3
        gamesclientcontext;
        ((Cursor) (obj)).close();
        throw gamesclientcontext;
    }

    private static EventDefinitionRefreshInfo getStoreEventDefinitionOps(GamesClientContext gamesclientcontext, ArrayList arraylist)
    {
        EventDefinitionRefreshInfo eventdefinitionrefreshinfo = new EventDefinitionRefreshInfo((byte)0);
        long l = gamesclientcontext.resolveTargetGameId();
        Uri uri = com.google.android.gms.games.provider.GamesContractInternal.EventDefinitions.getContentUri(gamesclientcontext.mClientContext);
        gamesclientcontext = Agents.getExternalIdToInternalIdMap(gamesclientcontext.mContext, com.google.android.gms.games.provider.GamesContractInternal.EventDefinitions.getUriForExternalGameId(gamesclientcontext.mClientContext, gamesclientcontext.mExternalTargetGameId), "external_event_id");
        String s;
        for (Iterator iterator = gamesclientcontext.keySet().iterator(); iterator.hasNext(); eventdefinitionrefreshinfo.deletedDefinitions.add(s))
        {
            s = (String)iterator.next();
        }

        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            ContentValues contentvalues = ((FastContentValuesJsonResponse) ((EventDefinition)arraylist.get(i))).mValues;
            contentvalues.put("event_definitions_game_id", Long.valueOf(l));
            contentvalues.put("sorting_rank", Integer.valueOf(i));
            String s1 = contentvalues.getAsString("external_event_id");
            eventdefinitionrefreshinfo.deletedDefinitions.remove(s1);
            if (!gamesclientcontext.containsKey(s1))
            {
                eventdefinitionrefreshinfo.newEventDefinitions.add(s1);
            }
            eventdefinitionrefreshinfo.ops.add(ContentProviderOperation.newInsert(uri).withValues(contentvalues).withYieldAllowed(Agents.shouldAllowYieldAtIndex(i)).build());
        }

        return eventdefinitionrefreshinfo;
    }

    private static WindowInfo getWindowFromCursor(Cursor cursor)
    {
        return new WindowInfo(cursor.getString(7), cursor.getLong(2), cursor.getLong(3), cursor.getLong(5));
    }

    private void refreshEventDefinitions(GamesClientContext gamesclientcontext)
        throws GoogleAuthException, VolleyError, UnresolvedException
    {
        ArrayList arraylist = new ArrayList();
        Object obj = null;
        Object obj1 = gamesclientcontext.mContext;
        com.google.android.gms.common.internal.ClientContext clientcontext = gamesclientcontext.mClientContext;
        String s1 = Agents.getLocaleString(((Context) (obj1)));
        do
        {
            int i;
            int j;
            if (gamesclientcontext.mIsFirstParty)
            {
                obj1 = mEventsApiInternal;
                String s2 = gamesclientcontext.mExternalTargetGameId;
                StringBuilder stringbuilder1 = new StringBuilder();
                (new Formatter(stringbuilder1)).format("applications/%1$s/eventDefinitions", new Object[] {
                    EventsApiInternal.enc(s2)
                });
                if (s1 != null)
                {
                    EventsApiInternal.append(stringbuilder1, "language", EventsApiInternal.enc(s1));
                }
                if (obj != null)
                {
                    EventsApiInternal.append(stringbuilder1, "pageToken", EventsApiInternal.enc(((String) (obj))));
                }
                obj = stringbuilder1.toString();
                obj = (EventDefinitionListResponse)((EventsApiInternal) (obj1)).mServer.getResponseBlocking(clientcontext, 0, ((String) (obj)), null, com/google/android/gms/games/server/api/EventDefinitionListResponse);
            } else
            {
                obj1 = mEventsApi;
                StringBuilder stringbuilder = new StringBuilder("eventDefinitions");
                if (s1 != null)
                {
                    EventsApi.append(stringbuilder, "language", EventsApi.enc(s1));
                }
                if (obj != null)
                {
                    EventsApi.append(stringbuilder, "pageToken", EventsApi.enc(((String) (obj))));
                }
                obj = stringbuilder.toString();
                obj = (EventDefinitionListResponse)((EventsApi) (obj1)).mServer.getResponseBlocking(clientcontext, 0, ((String) (obj)), null, com/google/android/gms/games/server/api/EventDefinitionListResponse);
            }
            arraylist.addAll(((EventDefinitionListResponse) (obj)).getItems());
            obj1 = (String)((FastMapJsonResponse) (obj)).mValues.get("nextPageToken");
            obj = obj1;
        } while (obj1 != null);
        obj1 = getStoreEventDefinitionOps(gamesclientcontext, arraylist);
        Agents.applyContentOperations(gamesclientcontext.mContext.getContentResolver(), ((EventDefinitionRefreshInfo) (obj1)).ops, "EventAgent");
        obj = new ArrayList();
        i = 0;
        for (j = ((EventDefinitionRefreshInfo) (obj1)).newEventDefinitions.size(); i < j; i++)
        {
            forceResolveInstanceId(gamesclientcontext, (String)((EventDefinitionRefreshInfo) (obj1)).newEventDefinitions.get(i));
        }

        for (obj1 = ((EventDefinitionRefreshInfo) (obj1)).deletedDefinitions.iterator(); ((Iterator) (obj1)).hasNext(); Agents.applyContentOperations(gamesclientcontext.mContext.getContentResolver(), ((ArrayList) (obj)), "EventAgent"))
        {
            String s = (String)((Iterator) (obj1)).next();
            ((ArrayList) (obj)).add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.EventInstances.getUriForExternalEventId(gamesclientcontext.mClientContext, s)).build());
            ((ArrayList) (obj)).add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.EventPendingOps.getUriForExternalEventId(gamesclientcontext.mClientContext, s)).build());
        }

        ApiRateLimitUtil.updateUriTimestamp(com.google.android.gms.games.provider.GamesContractInternal.EventDefinitions.getUriForExternalGameId(gamesclientcontext.mClientContext, gamesclientcontext.getExternalGameId()));
    }

    private static long resolveDefinitionId(GamesClientContext gamesclientcontext, String s)
    {
        s = com.google.android.gms.games.provider.GamesContractInternal.EventDefinitions.getUriForExternalEventId(gamesclientcontext.mClientContext, s);
        return Agents.resolveExternalId(gamesclientcontext.mContext, s);
    }

    private Map resolveDefinitionIds(GamesClientContext gamesclientcontext, ArrayList arraylist, boolean flag)
        throws UnresolvedException, GoogleAuthException
    {
        Object obj1;
label0:
        {
            Uri uri = com.google.android.gms.games.provider.GamesContractInternal.EventInstances.getUriForExternalPlayerAndGameId(gamesclientcontext);
            obj1 = Agents.getExternalIdToInternalIdMap(gamesclientcontext.mContext, uri, "external_event_id");
            Object obj;
            int i;
            int j;
            int k;
            if (!ApiRateLimitUtil.isUriRateLimited(com.google.android.gms.games.provider.GamesContractInternal.EventDefinitions.getUriForExternalGameId(gamesclientcontext.mClientContext, gamesclientcontext.getExternalGameId()), 0x36ee80L, gamesclientcontext.mForceReload))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            j = 0;
            k = arraylist.size();
label1:
            do
            {
label2:
                {
                    obj = obj1;
                    if (j < k)
                    {
                        if (((Map) (obj1)).containsKey((String)arraylist.get(j)) || i == 0)
                        {
                            break label2;
                        }
                        int l;
                        try
                        {
                            refreshEventDefinitions(gamesclientcontext);
                            obj = Agents.getExternalIdToInternalIdMap(gamesclientcontext.mContext, uri, "external_event_id");
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj)
                        {
                            GamesLog.e("EventAgent", "Unable to refresh events", ((Throwable) (obj)));
                            obj = obj1;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj)
                        {
                            GamesLog.e("EventAgent", "Unable to refresh events", ((Throwable) (obj)));
                            obj = obj1;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj)
                        {
                            GamesLog.e("EventAgent", "Unable to refresh events", ((Throwable) (obj)));
                            obj = obj1;
                        }
                    }
                    obj1 = obj;
                    if (!flag)
                    {
                        break label0;
                    }
                    j = 0;
                    i = 0;
                    for (l = arraylist.size(); i < l; i++)
                    {
                        obj1 = (String)arraylist.get(i);
                        if (!((Map) (obj)).containsKey(obj1))
                        {
                            forceResolveDefinitionId(gamesclientcontext, ((String) (obj1)));
                            j = 1;
                        }
                    }

                    break label1;
                }
                j++;
            } while (true);
            obj1 = obj;
            if (j != 0)
            {
                obj1 = Agents.getExternalIdToInternalIdMap(gamesclientcontext.mContext, uri, "external_event_id");
            }
        }
        return ((Map) (obj1));
    }

    private static long resolveInstanceId(GamesClientContext gamesclientcontext, String s)
    {
        Uri uri = com.google.android.gms.games.provider.GamesContractInternal.EventInstances.getUriForExternalPlayerAndGameId(gamesclientcontext);
        return Agents.queryLong(gamesclientcontext.mContext, uri, "_id", "external_event_id=?", new String[] {
            s
        }, -1L);
    }

    private static ArrayList storeEventInstances(GamesClientContext gamesclientcontext, ArrayList arraylist)
    {
        ArrayList arraylist1 = new ArrayList();
        if (arraylist != null && arraylist.size() != 0)
        {
            long l = gamesclientcontext.resolveTargetGameId();
            Map map = Agents.getExternalIdToInternalIdMap(gamesclientcontext.mContext, com.google.android.gms.games.provider.GamesContractInternal.EventDefinitions.getUriForGameId(gamesclientcontext.mClientContext, l), "external_event_id");
            l = gamesclientcontext.resolveCurrentPlayerId();
            Map map1 = Agents.getExternalIdToInternalIdMap(gamesclientcontext.mContext, com.google.android.gms.games.provider.GamesContractInternal.EventInstances.getUriForExternalPlayerAndGameId(gamesclientcontext), "external_event_id");
            Uri uri = com.google.android.gms.games.provider.GamesContractInternal.EventInstances.getContentUri(gamesclientcontext.mClientContext);
            int i = 0;
            int j = arraylist.size();
            while (i < j) 
            {
                gamesclientcontext = ((FastContentValuesJsonResponse) ((PlayerEvent)arraylist.get(i))).mValues;
                gamesclientcontext.put("player_id", Long.valueOf(l));
                Object obj = gamesclientcontext.getAsString("external_event_id");
                gamesclientcontext.remove("external_event_id");
                gamesclientcontext.remove("external_game_id");
                Long long1 = (Long)map.get(obj);
                if (long1 == null)
                {
                    GamesLog.e("EventAgent", (new StringBuilder("Unable to find local record for external event ID ")).append(((String) (obj))).toString());
                } else
                {
                    gamesclientcontext.put("definition_id", long1);
                    obj = (Long)map1.get(obj);
                    if (obj == null)
                    {
                        gamesclientcontext = ContentProviderOperation.newInsert(uri).withValues(gamesclientcontext);
                    } else
                    {
                        gamesclientcontext = ContentProviderOperation.newUpdate(ContentUris.withAppendedId(uri, ((Long) (obj)).longValue())).withValues(gamesclientcontext);
                    }
                    arraylist1.add(gamesclientcontext.withYieldAllowed(Agents.shouldAllowYieldAtIndex(i)).build());
                }
                i++;
            }
        }
        return arraylist1;
    }

    private void submitOpsAndRefreshEventInstances(GamesClientContext gamesclientcontext)
        throws GoogleAuthException, VolleyError, UnresolvedException
    {
        if (!GamesClientContext.isPlayerIdGPlusEnabled(gamesclientcontext.getExternalPlayerId()))
        {
            return;
        }
        sendPendingOpsInternal(gamesclientcontext, com.google.android.gms.games.provider.GamesContractInternal.EventPendingOps.getUriForExternalPlayerAndGameId(gamesclientcontext));
        ArrayList arraylist = new ArrayList();
        Object obj = null;
        Context context = gamesclientcontext.mContext;
        com.google.android.gms.common.internal.ClientContext clientcontext = gamesclientcontext.mClientContext;
        String s1 = Agents.getLocaleString(context);
        do
        {
            String s;
            int i;
            int j;
            if (gamesclientcontext.mIsFirstParty)
            {
                EventsApiInternal eventsapiinternal = mEventsApiInternal;
                String s2 = gamesclientcontext.getExternalPlayerId();
                String s3 = gamesclientcontext.mExternalTargetGameId;
                StringBuilder stringbuilder1 = new StringBuilder();
                (new Formatter(stringbuilder1)).format("players/%1$s/applications/%2$s/events", new Object[] {
                    EventsApiInternal.enc(s2), EventsApiInternal.enc(s3)
                });
                if (s1 != null)
                {
                    EventsApiInternal.append(stringbuilder1, "language", EventsApiInternal.enc(s1));
                }
                if (obj != null)
                {
                    EventsApiInternal.append(stringbuilder1, "pageToken", EventsApiInternal.enc(((String) (obj))));
                }
                obj = stringbuilder1.toString();
                obj = (PlayerEventListResponse)eventsapiinternal.mServer.getResponseBlocking(clientcontext, 0, ((String) (obj)), null, com/google/android/gms/games/server/api/PlayerEventListResponse);
            } else
            {
                EventsApi eventsapi = mEventsApi;
                StringBuilder stringbuilder = new StringBuilder("events");
                if (s1 != null)
                {
                    EventsApi.append(stringbuilder, "language", EventsApi.enc(s1));
                }
                if (obj != null)
                {
                    EventsApi.append(stringbuilder, "pageToken", EventsApi.enc(((String) (obj))));
                }
                obj = stringbuilder.toString();
                obj = (PlayerEventListResponse)eventsapi.mServer.getResponseBlocking(clientcontext, 0, ((String) (obj)), null, com/google/android/gms/games/server/api/PlayerEventListResponse);
            }
            arraylist.addAll(((PlayerEventListResponse) (obj)).getItems());
            s = (String)((FastMapJsonResponse) (obj)).mValues.get("nextPageToken");
            obj = s;
        } while (s != null);
        obj = new ArrayList();
        i = 0;
        for (j = arraylist.size(); i < j; i++)
        {
            ((ArrayList) (obj)).add((String)((FastContentValuesJsonResponse) ((PlayerEvent)arraylist.get(i))).mValues.get("external_event_id"));
        }

        resolveDefinitionIds(gamesclientcontext, ((ArrayList) (obj)), true);
        obj = storeEventInstances(gamesclientcontext, arraylist);
        Agents.applyContentOperations(gamesclientcontext.mContext.getContentResolver(), ((ArrayList) (obj)), "EventAgent");
        ApiRateLimitUtil.updateUriTimestamp(getInstanceCacheUri(gamesclientcontext));
    }

    final int flushAndRefreshIfNeeded(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        try
        {
            if (!ApiRateLimitUtil.isUriRateLimited(getInstanceCacheUri(gamesclientcontext), 0x36ee80L, gamesclientcontext.mForceReload))
            {
                submitOpsAndRefreshEventInstances(gamesclientcontext);
            }
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(gamesclientcontext, "EventAgent");
            }
            return 500;
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            if (GamesLog.canLog$134632())
            {
                GamesLog.e("EventAgent", "Unable to resolve", gamesclientcontext);
            }
            return 500;
        }
        return 0;
    }

    public final int incrementEvents(GamesClientContext gamesclientcontext, ArrayList arraylist)
    {
        WindowInfo windowinfo;
        EventIncrementEntry eventincremententry;
        Object obj1;
        long l1;
        long l = DefaultClock.getInstance().currentTimeMillis();
        Object obj = new ArrayList();
        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            ((ArrayList) (obj)).add(((EventIncrementEntry)arraylist.get(i)).eventId);
        }

        int k;
        try
        {
            obj = resolveDefinitionIds(gamesclientcontext, ((ArrayList) (obj)), false);
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            GamesLog.e("EventAgent", "Unable to increment events", gamesclientcontext);
            return 6;
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            GamesLog.e("EventAgent", "Unable to increment events", gamesclientcontext);
            return 6;
        }
        l1 = Agents.resolveClientContextId(gamesclientcontext.mContext, gamesclientcontext.mClientContext);
        windowinfo = getMostRecentEventWindow(gamesclientcontext, l, l1);
        i = 0;
        k = arraylist.size();
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_497;
        }
        eventincremententry = (EventIncrementEntry)arraylist.get(i);
        obj1 = (Long)((Map) (obj)).get(eventincremententry.eventId);
        if (obj1 != null && ((Long) (obj1)).longValue() != -1L)
        {
            break; /* Loop/switch isn't completed */
        }
        GamesLog.w("EventAgent", (new StringBuilder("Increment for unknown event ")).append(eventincremententry.eventId).toString());
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_100;
_L1:
        Object obj2;
        obj2 = new QuerySpec(com.google.android.gms.games.provider.GamesContractInternal.EventPendingOps.getUriForExternalEventId(gamesclientcontext.mClientContext, eventincremententry.eventId));
        ((QuerySpec) (obj2)).addWhere("client_context_id", String.valueOf(l1));
        Agents.QueryBuilder querybuilder = new Agents.QueryBuilder(gamesclientcontext);
        querybuilder.mQuery = ((QuerySpec) (obj2));
        querybuilder.mProjection = PendingOpsQuery.PROJECTION;
        querybuilder.mSortOrder = "external_game_id,window_start_time DESC limit 1";
        obj2 = querybuilder.queryCursor();
        if (!((Cursor) (obj2)).moveToFirst() || !windowinfo.isSameTimePeriod(getWindowFromCursor(((Cursor) (obj2)))))
        {
            break MISSING_BLOCK_LABEL_384;
        }
        obj1 = new ContentValues();
        ((ContentValues) (obj1)).put("increment", Long.valueOf((long)eventincremententry.increment + ((Cursor) (obj2)).getLong(4)));
        gamesclientcontext.mContext.getContentResolver().update(com.google.android.gms.games.provider.GamesContractInternal.EventPendingOps.getUriForId(gamesclientcontext.mClientContext, ((Cursor) (obj2)).getLong(0)), ((ContentValues) (obj1)), null, null);
_L5:
        ((Cursor) (obj2)).close();
        if (true) goto _L4; else goto _L3
_L3:
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("client_context_id", Long.valueOf(l1));
        contentvalues.put("window_start_time", Long.valueOf(windowinfo.windowStart));
        contentvalues.put("window_end_time", Long.valueOf(windowinfo.windowEnd));
        contentvalues.put("increment", Integer.valueOf(eventincremententry.increment));
        contentvalues.put("instance_id", ((Long) (obj1)));
        gamesclientcontext.mContext.getContentResolver().insert(com.google.android.gms.games.provider.GamesContractInternal.EventPendingOps.getContentUri(gamesclientcontext.mClientContext), contentvalues);
          goto _L5
        gamesclientcontext;
        ((Cursor) (obj2)).close();
        throw gamesclientcontext;
        return 5;
    }

    public final long resolveEventInstanceWithCount(GamesClientContext gamesclientcontext, String s, long l, ArrayList arraylist)
    {
        Object obj;
        long l1;
        boolean flag;
        boolean flag1;
        if (resolveDefinitionId(gamesclientcontext, s) == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!ApiRateLimitUtil.isUriRateLimited(getInstanceCacheUri(gamesclientcontext), 0x36ee80L, flag))
        {
            break MISSING_BLOCK_LABEL_68;
        }
        flag1 = GamesClientContext.isPlayerIdGPlusEnabled(gamesclientcontext.getExternalPlayerId());
        submitOpsAndRefreshEventInstances(gamesclientcontext);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        return resolveInstanceId(gamesclientcontext, s);
        l1 = forceResolveInstanceId(gamesclientcontext, s);
        return l1;
        obj;
_L2:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        forceResolveDefinitionId(gamesclientcontext, s);
        l1 = forceResolveInstanceId(gamesclientcontext, s);
        if (l >= 0L)
        {
            try
            {
                ArrayList arraylist1 = new ArrayList();
                arraylist1.add(new PlayerEvent(s, Long.valueOf(l)));
                arraylist.addAll(storeEventInstances(gamesclientcontext, arraylist1));
            }
            // Misplaced declaration of an exception variable
            catch (GamesClientContext gamesclientcontext)
            {
                return -1L;
            }
            // Misplaced declaration of an exception variable
            catch (GamesClientContext gamesclientcontext)
            {
                return -1L;
            }
            return l1;
        } else
        {
            return l1;
        }
        arraylist1;
        continue; /* Loop/switch isn't completed */
        arraylist1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final int sendPendingOps(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        try
        {
            sendPendingOpsInternal(gamesclientcontext, com.google.android.gms.games.provider.GamesContractInternal.EventPendingOps.getContentUri(gamesclientcontext.mClientContext));
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            return 6;
        }
        return 0;
    }

    public final void sendPendingOpsInternal(GamesClientContext gamesclientcontext, Uri uri)
        throws GoogleAuthException, VolleyError
    {
        android.database.AbstractWindowedCursor abstractwindowedcursor;
        int i;
        uri = new QuerySpec(uri);
        Agents.QueryBuilder querybuilder = new Agents.QueryBuilder(gamesclientcontext);
        querybuilder.mQuery = uri;
        querybuilder.mProjection = PendingOpsQuery.PROJECTION;
        querybuilder.mSortOrder = "external_game_id,request_id,window_start_time DESC";
        abstractwindowedcursor = querybuilder.queryCursor();
        i = 0;
        int j = abstractwindowedcursor.getCount();
_L10:
        if (i >= j) goto _L2; else goto _L1
_L1:
        Object obj1;
        ArrayList arraylist;
        Object obj4;
        ArrayList arraylist1;
        String s;
        int k;
        arraylist1 = new ArrayList();
        arraylist = new ArrayList();
        obj4 = new ArrayList();
        obj1 = new ArrayList();
        abstractwindowedcursor.moveToPosition(i);
        k = abstractwindowedcursor.getInt(10);
        s = abstractwindowedcursor.getString(9);
        uri = getWindowFromCursor(abstractwindowedcursor);
        if (((WindowInfo) (uri)).requestId != 0L) goto _L4; else goto _L3
_L3:
        long l = mRandom.nextLong();
_L9:
        if (i >= j) goto _L6; else goto _L5
_L5:
        Object obj3;
        boolean flag;
        abstractwindowedcursor.moveToPosition(i);
        obj3 = getWindowFromCursor(abstractwindowedcursor);
        if (!((WindowInfo) (uri)).externalGameId.equals(((WindowInfo) (obj3)).externalGameId))
        {
            break MISSING_BLOCK_LABEL_669;
        }
        break MISSING_BLOCK_LABEL_193;
_L11:
        if (!flag) goto _L6; else goto _L7
_L7:
        Object obj;
        Object obj2;
        if (!uri.isSameTimePeriod(((WindowInfo) (obj3))))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj2 = uri;
        obj = obj1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        finishCurrentWindow(((ArrayList) (obj4)), ((ArrayList) (obj1)), uri);
        obj = new ArrayList();
        obj2 = obj3;
        uri = gamesclientcontext.mClientContext;
        arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.EventPendingOps.getUriForId(uri, abstractwindowedcursor.getLong(0))).withYieldAllowed(Agents.shouldAllowYieldAtIndex(arraylist.size())).build());
        ((ArrayList) (obj)).add(new EventUpdateRequest(abstractwindowedcursor.getString(6), Long.valueOf(abstractwindowedcursor.getLong(4))));
        if (((WindowInfo) (obj2)).requestId == 0L)
        {
            arraylist1.add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.GamesContractInternal.EventPendingOps.getUriForId(uri, abstractwindowedcursor.getLong(0))).withValue("request_id", Long.valueOf(l)).withYieldAllowed(Agents.shouldAllowYieldAtIndex(arraylist1.size())).build());
        }
          goto _L8
_L4:
        l = ((WindowInfo) (uri)).requestId;
          goto _L9
_L6:
        finishCurrentWindow(((ArrayList) (obj4)), ((ArrayList) (obj1)), uri);
        Agents.applyContentOperations(gamesclientcontext.mContext.getContentResolver(), arraylist1, "EventAgent");
        obj = Agents.restoreClientContext(k, s, AccountUtils.getResolvedAccountName(gamesclientcontext.mClientContext));
        obj1 = mEventsApi;
        obj2 = Agents.getLocaleString(gamesclientcontext.mContext);
        obj3 = new EventRecordRequest(Long.valueOf(DefaultClock.getInstance().currentTimeMillis()), Long.valueOf(l), ((ArrayList) (obj4)));
        obj4 = new StringBuilder("events");
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_510;
        }
        EventsApi.append(((StringBuilder) (obj4)), "language", EventsApi.enc(((String) (obj2))));
        obj2 = ((StringBuilder) (obj4)).toString();
        obj = (EventUpdateResponse)((EventsApi) (obj1)).mServer.getResponseBlocking(((com.google.android.gms.common.internal.ClientContext) (obj)), 1, ((String) (obj2)), obj3, com/google/android/gms/games/server/api/EventUpdateResponse);
        obj1 = gamesclientcontext.getBuilder();
        obj1.mExternalCurrentPlayerId = abstractwindowedcursor.getString(8);
        obj1.mExternalTargetGameId = ((WindowInfo) (uri)).externalGameId;
        if (!gamesclientcontext.mIsFirstParty)
        {
            obj1.mExternalOwningGameId = ((WindowInfo) (uri)).externalGameId;
        }
        arraylist.addAll(storeEventInstances(((GamesClientContext.Builder) (obj1)).build(), ((EventUpdateResponse) (obj)).getPlayerEvents()));
        Agents.applyContentOperations(gamesclientcontext.mContext.getContentResolver(), arraylist, "EventAgent");
          goto _L10
        gamesclientcontext;
        abstractwindowedcursor.close();
        throw gamesclientcontext;
_L2:
        abstractwindowedcursor.close();
        return;
        if (((WindowInfo) (uri)).requestId == ((WindowInfo) (obj3)).requestId)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_669;
        }
        flag = true;
          goto _L11
_L8:
        i++;
        uri = ((Uri) (obj2));
        obj1 = obj;
          goto _L9
        flag = false;
          goto _L11
    }

    public final int submitPendingEventsForGame(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        try
        {
            assertLockedByCurrentThread();
            sendPendingOpsInternal(gamesclientcontext, com.google.android.gms.games.provider.GamesContractInternal.EventPendingOps.getUriForExternalPlayerAndGameId(gamesclientcontext));
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(gamesclientcontext, "EventAgent");
            }
            return 6;
        }
        return 0;
    }

    public final boolean syncEventDefinitions(GamesClientContext gamesclientcontext, SyncResult syncresult)
        throws GoogleAuthException
    {
        if (gamesclientcontext.mExternalCurrentPlayerId != null) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = false;
        refreshEventDefinitions(gamesclientcontext);
        return true;
        gamesclientcontext;
        if (GamesLog.canLog$134632())
        {
            ErrorUtils.parseAndLogErrorResponse(gamesclientcontext, "EventAgent");
        }
        gamesclientcontext = syncresult.stats;
        gamesclientcontext.numIoExceptions = ((SyncStats) (gamesclientcontext)).numIoExceptions + 1L;
        return false;
        gamesclientcontext;
        if (GamesLog.canLog$134632())
        {
            GamesLog.e("EventAgent", "Unable to resolve", gamesclientcontext);
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean syncInstances(GamesClientContext gamesclientcontext, SyncResult syncresult)
        throws GoogleAuthException
    {
        if (gamesclientcontext.mExternalCurrentPlayerId != null) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = false;
        submitOpsAndRefreshEventInstances(gamesclientcontext);
        return true;
        gamesclientcontext;
        if (GamesLog.canLog$134632())
        {
            ErrorUtils.parseAndLogErrorResponse(gamesclientcontext, "EventAgent");
        }
        gamesclientcontext = syncresult.stats;
        gamesclientcontext.numIoExceptions = ((SyncStats) (gamesclientcontext)).numIoExceptions + 1L;
        return false;
        gamesclientcontext;
        if (GamesLog.canLog$134632())
        {
            GamesLog.e("EventAgent", "Unable to resolve", gamesclientcontext);
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
