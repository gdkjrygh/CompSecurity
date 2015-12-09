// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
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
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.data.GamesDataChangeUris;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.server.api.FirstPartyMultiplayerEntity;
import com.google.android.gms.games.server.api.FirstPartyNotification;
import com.google.android.gms.games.server.api.MultiplayerEntitiesApiInternal;
import com.google.android.gms.games.server.api.MultiplayerEntitySyncFirstParty;
import com.google.android.gms.games.server.api.Room;
import com.google.android.gms.games.server.api.TurnBasedMatch;
import com.google.android.gms.games.util.AccountUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, InboxCounter, Agents, GamesClientContext, 
//            GameEventListenerRegistry, MultiplayerUtils, ApiRateLimitUtil

public final class MultiplayerAgent extends Lockable
    implements InboxCounter
{
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

    private static final class VersionInfo
    {

        public final int initialVersion;
        public final boolean isInvitation;
        public final int newVersion;

        public final boolean isTombstone()
        {
            return newVersion == -1;
        }

        public VersionInfo(int i, int j, boolean flag)
        {
            initialVersion = i;
            newVersion = j;
            isInvitation = flag;
        }
    }


    private static final Lockable.LockableLock LOCK = new Lockable.LockableLock();
    static final List SUPPORTED_MATCH_TYPES = Arrays.asList(new String[] {
        "real_time", "turn_based"
    });
    static final String SYNC_TOKEN_PROJECTION[] = {
        "match_sync_token"
    };
    private final MultiplayerEntitiesApiInternal mEntitiesApiInternal;
    private boolean mHasNewActivity;

    public MultiplayerAgent(Lockable lockable, BaseApiaryServer baseapiaryserver)
    {
        super("MultiplayerAgent", LOCK, lockable);
        mHasNewActivity = false;
        mEntitiesApiInternal = new MultiplayerEntitiesApiInternal(baseapiaryserver);
    }

    private static HashSet getActionableIds(Context context, ClientContext clientcontext)
    {
        HashSet hashset = new HashSet();
        hashset.addAll(Agents.getColumnValues(context, com.google.android.gms.games.provider.GamesContractInternal.Invitations.getContentUri(clientcontext), "external_invitation_id"));
        clientcontext = com.google.android.gms.games.provider.GamesContractInternal.MatchEntities.getContentUri(clientcontext);
        QuerySpec queryspec = new QuerySpec(clientcontext);
        queryspec.addWhere("metadata_version", "0", ">=?");
        queryspec.addWhere("user_match_status", "1");
        hashset.addAll(Agents.getColumnValues(context, clientcontext, "external_match_id"));
        return hashset;
    }

    private static String getEntityId(FirstPartyMultiplayerEntity firstpartymultiplayerentity)
    {
        if (firstpartymultiplayerentity.getRoom() != null)
        {
            return firstpartymultiplayerentity.getRoom().getRoomId();
        }
        if (firstpartymultiplayerentity.getTurnBasedMatch() != null)
        {
            return firstpartymultiplayerentity.getTurnBasedMatch().getMatchId();
        } else
        {
            Asserts.fail((new StringBuilder("Unexpected entity: ")).append(firstpartymultiplayerentity).toString());
            return null;
        }
    }

    private static Map getInviterImageUris(Context context, ClientContext clientcontext)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        context = new InvitationBuffer((new Agents.QueryBuilder(context)).setQuerySpec(com.google.android.gms.games.provider.GamesContractInternal.Invitations.getContentUri(clientcontext)).query());
        Invitation invitation;
        for (clientcontext = context.iterator(); clientcontext.hasNext(); hashmap.put(invitation.getInvitationId(), invitation.getInviter().getIconImageUri()))
        {
            invitation = (Invitation)clientcontext.next();
        }

        break MISSING_BLOCK_LABEL_92;
        clientcontext;
        context.release();
        throw clientcontext;
        context.release();
        return hashmap;
    }

    public static DataHolder getLocalInvitation(GamesClientContext gamesclientcontext, String s)
    {
        s = com.google.android.gms.games.provider.GamesContractInternal.Invitations.getUriForExternalInvitationId(gamesclientcontext.mClientContext, s);
        gamesclientcontext = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(s);
        gamesclientcontext.mSortOrder = "last_modified_timestamp DESC";
        return gamesclientcontext.query();
    }

    private static int getLocalInvitationVersion(Context context, ClientContext clientcontext, String s)
    {
        return Agents.resolveExternalId(context, com.google.android.gms.games.provider.GamesContractInternal.Invitations.getUriForExternalInvitationId(clientcontext, s)) <= 0L ? -1 : 1;
    }

    public static DataHolder getLocalInvitations(GamesClientContext gamesclientcontext, int i, int j)
    {
        QuerySpec queryspec;
        queryspec = new QuerySpec(com.google.android.gms.games.provider.GamesContractInternal.Invitations.getContentUri(gamesclientcontext.mClientContext));
        queryspec.addWhere("metadata_version", "0", ">=?");
        if (gamesclientcontext.mExternalTargetGameId != null)
        {
            queryspec.addWhere("external_game_id", gamesclientcontext.mExternalTargetGameId);
        }
        i;
        JVM INSTR tableswitch 0 1: default 68
    //                   0 93
    //                   1 126;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown sort order ")).append(i).toString());
_L2:
        String s = "last_modified_timestamp DESC";
_L5:
        gamesclientcontext = new Agents.QueryBuilder(gamesclientcontext);
        gamesclientcontext.mQuery = queryspec;
        gamesclientcontext.mSortOrder = s;
        gamesclientcontext.mStatusCode = j;
        return gamesclientcontext.query();
_L3:
        s = "inviter_in_circles DESC, CASE WHEN inviter_in_circles=0 THEN most_recent_invitation ELSE NULL END DESC, CASE WHEN inviter_in_circles=0 THEN external_inviter_id ELSE NULL END,last_modified_timestamp DESC";
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static boolean notifyInvitationListener(Context context, ClientContext clientcontext, String s, String s1, boolean flag)
    {
        GameEventListenerRegistry gameeventlistenerregistry;
        String s2;
        gameeventlistenerregistry = GameEventListenerRegistry.getInstance();
        s2 = AccountUtils.getResolvedAccountName(clientcontext);
        if (!gameeventlistenerregistry.hasInvitationListener(s2, s))
        {
            return false;
        }
        clientcontext = com.google.android.gms.games.provider.GamesContractInternal.Invitations.getUriForExternalInvitationId(clientcontext, s1);
        context = (new Agents.QueryBuilder(context)).setQuerySpec(clientcontext).query();
        flag = gameeventlistenerregistry.deliverInvitation(s2, s, s1, context, flag);
        context.close();
        return flag;
        clientcontext;
        context.close();
        throw clientcontext;
    }

    private static boolean notifyMatchUpdateListener(Context context, ClientContext clientcontext, String s, TurnBasedMatch turnbasedmatch, boolean flag)
    {
        GameEventListenerRegistry gameeventlistenerregistry;
        String s1;
        gameeventlistenerregistry = GameEventListenerRegistry.getInstance();
        s1 = AccountUtils.getResolvedAccountName(clientcontext);
        if (!gameeventlistenerregistry.hasMatchUpdateListener(s1, s))
        {
            return false;
        }
        clientcontext = com.google.android.gms.games.provider.GamesContractInternal.MatchEntities.getUriForExternalMatchId(clientcontext, turnbasedmatch.getMatchId());
        context = (new Agents.QueryBuilder(context)).setQuerySpec(clientcontext).query();
        flag = gameeventlistenerregistry.deliverMatchUpdate(s1, s, turnbasedmatch.getMatchId(), context, flag);
        context.close();
        return flag;
        clientcontext;
        context.close();
        throw clientcontext;
    }

    private static void postProcessNetworkEntities$4daddac8(Context context, ClientContext clientcontext, SyncNetworkResponse syncnetworkresponse, boolean flag, Map map)
    {
        Map map1;
        ArrayList arraylist;
        Uri uri;
        ArrayList arraylist1;
        int i;
        int k;
        map1 = getInviterImageUris(context, clientcontext);
        arraylist = new ArrayList();
        uri = com.google.android.gms.games.provider.GamesContractInternal.Notifications.getContentUri(clientcontext);
        arraylist1 = syncnetworkresponse.mEntities;
        i = 0;
        k = arraylist1.size();
_L2:
        Object obj;
        Object obj1;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_564;
        }
        obj = (FirstPartyMultiplayerEntity)arraylist1.get(i);
        syncnetworkresponse = ((FirstPartyMultiplayerEntity) (obj)).getRoom();
        obj1 = ((FirstPartyMultiplayerEntity) (obj)).getTurnBasedMatch();
        if (syncnetworkresponse != null || obj1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        GamesLog.e("MultiplayerAgent", (new StringBuilder("Unknown type of entity. Ignoring ")).append(obj).toString());
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        String s;
        VersionInfo versioninfo;
        s = getEntityId(((FirstPartyMultiplayerEntity) (obj)));
        if (((FirstPartyMultiplayerEntity) (obj)).getRoom() != null)
        {
            syncnetworkresponse = ((FirstPartyMultiplayerEntity) (obj)).getRoom().getApplicationId();
        } else
        if (((FirstPartyMultiplayerEntity) (obj)).getTurnBasedMatch() != null)
        {
            syncnetworkresponse = ((FirstPartyMultiplayerEntity) (obj)).getTurnBasedMatch().getApplicationId();
        } else
        {
            Asserts.fail((new StringBuilder("Unexpected entity: ")).append(obj).toString());
            syncnetworkresponse = null;
        }
        versioninfo = (VersionInfo)map.get(s);
        if (versioninfo == null)
        {
            GamesLog.d("MultiplayerAgent", (new StringBuilder("Already processed entity. Ignoring ")).append(s).toString());
        } else
        {
label0:
            {
                if (!flag)
                {
                    break label0;
                }
                boolean flag1 = false;
                if (versioninfo.isInvitation)
                {
                    flag1 = notifyInvitationListener(context, clientcontext, syncnetworkresponse, s, versioninfo.isTombstone());
                } else
                if (obj1 != null)
                {
                    flag1 = notifyMatchUpdateListener(context, clientcontext, syncnetworkresponse, ((TurnBasedMatch) (obj1)), versioninfo.isTombstone());
                }
                if (!flag1)
                {
                    break label0;
                }
                GamesLog.d("MultiplayerAgent", (new StringBuilder("Notification ")).append(s).append(" consumed by listener for game ").append(syncnetworkresponse).append(". Deleting.").toString());
                obj1 = new QuerySpec(uri);
                ((QuerySpec) (obj1)).addWhere("external_sub_id", s);
                arraylist.add(ContentProviderOperation.newDelete(uri).withSelection(((QuerySpec) (obj1)).getSelection(), ((QuerySpec) (obj1)).mSelectionArgs).withYieldAllowed(Agents.shouldAllowYieldAtIndex(arraylist.size())).build());
                obj = ((FirstPartyMultiplayerEntity) (obj)).getNotification();
                if (obj != null)
                {
                    int j;
                    if (versioninfo.isInvitation)
                    {
                        j = 1;
                    } else
                    {
                        j = 2;
                    }
                    GamesPlayLogger.logNotificationAction(context, syncnetworkresponse, AccountUtils.getResolvedAccountName(clientcontext), j, 6, ((FirstPartyNotification) (obj)).getId());
                }
            }
        }
          goto _L3
        if (((FirstPartyMultiplayerEntity) (obj)).getNotification() != null)
        {
            syncnetworkresponse = new QuerySpec(uri);
            syncnetworkresponse.addWhere("external_sub_id", s);
            syncnetworkresponse.addWhere("notification_id", ((FirstPartyMultiplayerEntity) (obj)).getNotification().getId());
            obj = ContentProviderOperation.newUpdate(uri).withSelection(syncnetworkresponse.getSelection(), ((QuerySpec) (syncnetworkresponse)).mSelectionArgs).withYieldAllowed(Agents.shouldAllowYieldAtIndex(arraylist.size()));
            if (versioninfo.isInvitation)
            {
                syncnetworkresponse = (Uri)map1.get(s);
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
          goto _L3
        if (arraylist.size() > 0)
        {
            Agents.applyContentOperations(context.getContentResolver(), arraylist, "MultiplayerAgent");
        }
        return;
          goto _L3
    }

    private void storeEntitiesFromNetwork(Context context, ClientContext clientcontext, SyncNetworkResponse syncnetworkresponse, Map map, boolean flag)
    {
        HashSet hashset;
        ArrayList arraylist;
        ArrayMap arraymap;
        ArrayList arraylist1;
        int i;
        int k;
        hashset = getActionableIds(context, clientcontext);
        arraylist = new ArrayList();
        String s = syncnetworkresponse.mNewSyncToken;
        if (s != null)
        {
            arraylist.add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.GamesContractInternal.AccountMetadata.getContentUri(clientcontext)).withValue("match_sync_token", s).build());
        }
        arraymap = new ArrayMap();
        arraylist1 = syncnetworkresponse.mEntities;
        i = 0;
        k = arraylist1.size();
_L2:
        Object obj;
        FirstPartyMultiplayerEntity firstpartymultiplayerentity;
        int j;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_781;
        }
        firstpartymultiplayerentity = (FirstPartyMultiplayerEntity)arraylist1.get(i);
        obj = null;
        Room room;
        String s1;
        boolean flag1;
        if (firstpartymultiplayerentity.getRoom() != null)
        {
            room = firstpartymultiplayerentity.getRoom();
            obj = room.getRoomId();
            j = getLocalInvitationVersion(context, clientcontext, ((String) (obj)));
            if (room.getStatus().intValue() == 4)
            {
                GamesLog.d("MultiplayerAgent", (new StringBuilder("Received tombstone for ")).append(((String) (obj))).toString());
                arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.Invitations.getUriForExternalInvitationId(clientcontext, ((String) (obj)))).withYieldAllowed(Agents.shouldAllowYieldAtIndex(arraylist.size())).build());
                obj = new VersionInfo(j, -1, true);
            } else
            {
label0:
                {
                    s1 = room.getApplicationId();
                    Asserts.checkNotNull(s1);
                    Long long1 = (Long)map.get(s1);
                    obj = long1;
                    if (long1 != null)
                    {
                        break MISSING_BLOCK_LABEL_355;
                    }
                    obj = Long.valueOf(Agents.forceResolveExternalGameId(context, clientcontext, s1));
                    if (((Long) (obj)).longValue() != -1L)
                    {
                        break label0;
                    }
                    GamesLog.e("MultiplayerAgent", (new StringBuilder("No game found matching external game ID ")).append(s1).toString());
                    obj = null;
                }
            }
        } else
        {
            if (firstpartymultiplayerentity.getTurnBasedMatch() == null)
            {
                break MISSING_BLOCK_LABEL_752;
            }
            turnbasedmatch = firstpartymultiplayerentity.getTurnBasedMatch();
            s2 = turnbasedmatch.getMatchId();
            int l = getLocalInvitationVersion(context, clientcontext, s2);
            j = -1;
            if (l == -1)
            {
                j = Agents.queryInt(context, com.google.android.gms.games.provider.GamesContractInternal.Matches.getUriForExternalMatchId(clientcontext, s2), "version", -1);
            }
            j = Math.max(l, j);
            if (turnbasedmatch.getStatus().intValue() == 5)
            {
                MultiplayerUtils.addTombstoneOps(clientcontext, s2, arraylist);
                boolean flag2;
                if (l != -1)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                obj = new VersionInfo(j, -1, flag2);
            } else
            {
label1:
                {
                    s3 = turnbasedmatch.getApplicationId();
                    Asserts.checkNotNull(s3);
                    Long long2 = (Long)map.get(s3);
                    obj = long2;
                    if (long2 != null)
                    {
                        break MISSING_BLOCK_LABEL_631;
                    }
                    obj = Long.valueOf(Agents.forceResolveExternalGameId(context, clientcontext, s3));
                    if (((Long) (obj)).longValue() != -1L)
                    {
                        break label1;
                    }
                    GamesLog.e("MultiplayerAgent", (new StringBuilder("No game found matching external game ID ")).append(s3).toString());
                    obj = null;
                }
            }
        }
_L3:
        if (obj != null)
        {
            TurnBasedMatch turnbasedmatch;
            String s2;
            String s3;
            if (((VersionInfo) (obj)).initialVersion != ((VersionInfo) (obj)).newVersion)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (j != 0)
            {
                arraymap.put(getEntityId(firstpartymultiplayerentity), obj);
            }
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        map.put(s1, obj);
        if (room.getStatus().intValue() == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Asserts.checkState(flag1);
        MultiplayerUtils.addRoomInvitationStorageOps(context, clientcontext, firstpartymultiplayerentity, ((Long) (obj)).longValue(), DefaultClock.getInstance(), arraylist);
        obj = new VersionInfo(j, 1, true);
          goto _L3
        map.put(s3, obj);
        if (((Integer)((FastContentValuesJsonResponse) (turnbasedmatch)).mValues.get("user_match_status")).intValue() == 0)
        {
            MultiplayerUtils.addTurnBasedInvitationStorageOps(context, clientcontext, firstpartymultiplayerentity, ((Long) (obj)).longValue(), DefaultClock.getInstance(), arraylist);
            obj = new VersionInfo(j, 1, true);
        } else
        {
            arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.Invitations.getUriForExternalInvitationId(clientcontext, s2)).build());
            MultiplayerUtils.addTurnBasedEntityStorageOps(context, clientcontext, firstpartymultiplayerentity, ((Long) (obj)).longValue(), DefaultClock.getInstance(), arraylist);
            obj = new VersionInfo(j, ((Integer)((FastContentValuesJsonResponse) (turnbasedmatch)).mValues.get("version")).intValue(), false);
        }
          goto _L3
        Asserts.fail((new StringBuilder("Unexpected entity: ")).append(firstpartymultiplayerentity).toString());
          goto _L3
        boolean flag3 = true;
        if (arraylist.size() > 0)
        {
            flag3 = Agents.applyContentOperations(context.getContentResolver(), arraylist, "MultiplayerAgent");
        }
        if (!flag3)
        {
            GamesLog.e("MultiplayerAgent", "Failed to store matches");
            return;
        }
        if (!arraymap.isEmpty())
        {
            Agents.notifyDataChangeUri(context, GamesDataChangeUris.URI_INVITATIONS);
        }
        map = getActionableIds(context, clientcontext);
        map.removeAll(hashset);
        if (map.size() > 0)
        {
            mHasNewActivity = true;
        }
        postProcessNetworkEntities$4daddac8(context, clientcontext, syncnetworkresponse, flag, arraymap);
        MultiplayerUtils.trimCompletedMatches(context, clientcontext);
        ApiRateLimitUtil.updateSyncTimestamp(this);
        return;
    }

    private SyncNetworkResponse syncFromNetwork(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        String s1;
        s1 = s;
        s = gamesclientcontext;
_L2:
        Object obj;
        obj = ((GamesClientContext) (s)).mContext;
        gamesclientcontext = s;
        if (!((GamesClientContext) (s)).mIsFirstParty)
        {
            gamesclientcontext = Agents.buildFirstPartyGamesContext(s).getWithForceReload$528fa945();
        }
        s = gamesclientcontext.mClientContext;
        MultiplayerEntitiesApiInternal multiplayerentitiesapiinternal;
        Object obj2;
        List list;
        Integer integer;
        String s3;
        StringBuilder stringbuilder;
        multiplayerentitiesapiinternal = mEntitiesApiInternal;
        obj2 = Agents.getLocaleString(((Context) (obj)));
        list = SUPPORTED_MATCH_TYPES;
        integer = (Integer)G.maxCompletedMatches.get();
        s3 = gamesclientcontext.mExternalTargetGameId;
        stringbuilder = new StringBuilder("multiplayerentities/sync");
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        MultiplayerEntitiesApiInternal.append(stringbuilder, "language", MultiplayerEntitiesApiInternal.enc(((String) (obj2))));
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        MultiplayerEntitiesApiInternal.append(stringbuilder, "matchType", TextUtils.join("&matchType=", list));
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        MultiplayerEntitiesApiInternal.append(stringbuilder, "maxCompletedMatchesPerApp", String.valueOf(integer));
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        MultiplayerEntitiesApiInternal.append(stringbuilder, "pageToken", MultiplayerEntitiesApiInternal.enc(s1));
        MultiplayerEntitiesApiInternal.append(stringbuilder, "platformType", MultiplayerEntitiesApiInternal.enc("ANDROID"));
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        MultiplayerEntitiesApiInternal.append(stringbuilder, "requestingApplicationId", MultiplayerEntitiesApiInternal.enc(s3));
        obj2 = stringbuilder.toString();
        obj2 = (MultiplayerEntitySyncFirstParty)multiplayerentitiesapiinternal.mServer.getResponseBlocking(s, 1, ((String) (obj2)), null, com/google/android/gms/games/server/api/MultiplayerEntitySyncFirstParty);
        int i = 0;
        obj = ((MultiplayerEntitySyncFirstParty) (obj2)).getItems();
        String s2 = (String)((FastMapJsonResponse) (obj2)).mValues.get("nextPageToken");
        s = s2;
        if (((Boolean)((FastMapJsonResponse) (obj2)).mValues.get("moreAvailable")).booleanValue())
        {
            Object obj1;
            int j;
            boolean flag;
            if (!Objects.equal(s1, s2))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag, "Server claims to have more data, yet sync tokens match!");
            gamesclientcontext = syncFromNetwork(gamesclientcontext, s2);
            j = ((SyncNetworkResponse) (gamesclientcontext)).mStatusCode;
            s = s2;
            i = j;
            if (j == 0)
            {
                ((ArrayList) (obj)).addAll(((SyncNetworkResponse) (gamesclientcontext)).mEntities);
                s = ((SyncNetworkResponse) (gamesclientcontext)).mNewSyncToken;
                i = j;
            }
        }
        gamesclientcontext = ((GamesClientContext) (obj));
        if (obj == null)
        {
            gamesclientcontext = new ArrayList();
        }
        return new SyncNetworkResponse(gamesclientcontext, s, i);
        obj1;
        if (!ErrorUtils.hasStatusCode(((VolleyError) (obj1)), 410))
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = new ArrayList(3);
        ((ArrayList) (obj1)).add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.GamesContractInternal.AccountMetadata.getContentUri(s)).withValue("match_sync_token", null).build());
        ((ArrayList) (obj1)).add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.Invitations.getContentUri(s)).build());
        ((ArrayList) (obj1)).add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.Matches.getContentUri(s)).build());
        Agents.applyContentOperations(((Context) (obj)).getContentResolver(), ((ArrayList) (obj1)), "MultiplayerAgent");
        GamesLog.d("MultiplayerAgent", (new StringBuilder("Token ")).append(s1).append(" is invalid. Retrying with no token.").toString());
        s1 = null;
        s = gamesclientcontext;
        if (true) goto _L2; else goto _L1
_L1:
        if (GamesLog.canLog$134632())
        {
            ErrorUtils.parseAndLogErrorResponse(((VolleyError) (obj1)), "MultiplayerAgent");
        }
        return new SyncNetworkResponse();
    }

    public static void updateInviterStatus(Context context, ClientContext clientcontext)
    {
        InvitationBuffer invitationbuffer;
        ArrayList arraylist;
        arraylist = new ArrayList();
        invitationbuffer = new InvitationBuffer((new Agents.QueryBuilder(context)).setQuerySpec(com.google.android.gms.games.provider.GamesContractInternal.Invitations.getContentUri(clientcontext)).query());
        Iterator iterator = invitationbuffer.iterator();
_L2:
        Invitation invitation;
        Player player;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_139;
            }
            invitation = (Invitation)iterator.next();
            player = invitation.getInviter().getPlayer();
        } while (player == null);
        arraylist.add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.GamesContractInternal.Invitations.getUriForExternalInvitationId(clientcontext, invitation.getInvitationId())).withValue("inviter_in_circles", Integer.valueOf(player.isInCircles())).withYieldAllowed(Agents.shouldAllowYieldAtIndex(arraylist.size())).build());
        if (true) goto _L2; else goto _L1
_L1:
        context;
        invitationbuffer.release();
        throw context;
        invitationbuffer.release();
        if (arraylist.size() > 0)
        {
            Agents.applyContentOperations(context.getContentResolver(), arraylist, "MultiplayerAgent");
        }
        return;
    }

    public final void clearActivityTypes(int i)
    {
        if ((i & 3) != 0)
        {
            mHasNewActivity = false;
        }
    }

    public final String getActivityKey()
    {
        return "inbox_matches_count";
    }

    public final int getInboxCount(GamesClientContext gamesclientcontext)
    {
        gamesclientcontext = getLocalInvitations(gamesclientcontext, 0, 0);
        int i = (new InvitationBuffer(gamesclientcontext)).getCount();
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
        return mHasNewActivity;
    }

    public final int syncEntities(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        Context context = gamesclientcontext.mContext;
        ClientContext clientcontext = gamesclientcontext.mClientContext;
        if (ApiRateLimitUtil.isSyncRateLimited(this, ((Long)G.tickleSyncThresholdMillis.get()).longValue(), gamesclientcontext.mForceReload))
        {
            GamesLog.i("MultiplayerAgent", "Returning cached entities");
            return 0;
        }
        SyncNetworkResponse syncnetworkresponse = syncFromNetwork(gamesclientcontext, Agents.getSyncToken(context, clientcontext, SYNC_TOKEN_PROJECTION));
        GamesLog.d("MultiplayerAgent", String.format("Received %s multiplayer entities during sync", new Object[] {
            Integer.valueOf(syncnetworkresponse.mEntities.size())
        }));
        if (syncnetworkresponse.mStatusCode != 0)
        {
            return syncnetworkresponse.mStatusCode;
        }
        ArrayList arraylist = syncnetworkresponse.mEntities;
        int j = arraylist.size();
        ArrayList arraylist1 = new ArrayList(j);
        int i = 0;
        while (i < j) 
        {
            Object obj = (FirstPartyMultiplayerEntity)arraylist.get(i);
            if (((FirstPartyMultiplayerEntity) (obj)).getRoom() != null)
            {
                obj = ((FirstPartyMultiplayerEntity) (obj)).getRoom().getApplicationId();
            } else
            if (((FirstPartyMultiplayerEntity) (obj)).getTurnBasedMatch() != null)
            {
                obj = ((FirstPartyMultiplayerEntity) (obj)).getTurnBasedMatch().getApplicationId();
            } else
            {
                throw new IllegalStateException((new StringBuilder("Malformed entity: ")).append(obj).toString());
            }
            if (obj != null)
            {
                arraylist1.add(obj);
            }
            i++;
        }
        Map map = Agents.forceResolveExternalGameIds(context, clientcontext, arraylist1);
        boolean flag;
        if (!gamesclientcontext.hasTargetGameId())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        storeEntitiesFromNetwork(context, clientcontext, syncnetworkresponse, map, flag);
        return 0;
    }

}
