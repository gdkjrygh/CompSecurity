// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.TransientDataHolder;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.BaseApiaryServer;
import com.google.android.gms.common.server.error.ErrorUtils;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.games.internal.ConnectionInfo;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.constants.Capability;
import com.google.android.gms.games.internal.data.GamesDataChangeUris;
import com.google.android.gms.games.provider.ColumnSpec;
import com.google.android.gms.games.server.api.NetworkDiagnostics;
import com.google.android.gms.games.server.api.Room;
import com.google.android.gms.games.server.api.RoomAutoMatchingCriteria;
import com.google.android.gms.games.server.api.RoomClientAddress;
import com.google.android.gms.games.server.api.RoomCreateRequest;
import com.google.android.gms.games.server.api.RoomJoinRequest;
import com.google.android.gms.games.server.api.RoomLeaveDiagnostics;
import com.google.android.gms.games.server.api.RoomLeaveRequest;
import com.google.android.gms.games.server.api.RoomP2PStatuses;
import com.google.android.gms.games.server.api.RoomStatus;
import com.google.android.gms.games.server.api.RoomsApi;
import com.google.android.gms.games.server.api.RoomsApiInternal;
import com.google.android.gms.games.utils.GamesDataUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, Agents, MultiplayerUtils, GamesClientContext

final class RealTimeAgent extends Lockable
{
    private static final class RoomCache
    {

        private TransientDataHolder mRoomDataHolder;
        Map mRoomDataValues;
        final String mRoomId;

        final DataHolder getRoomData()
        {
            if (mRoomDataHolder.getCount() == 0)
            {
                return DataHolder.empty(1);
            } else
            {
                return mRoomDataHolder.build(0);
            }
        }

        final boolean isRoomCached(String s)
        {
            return mRoomId.equals(s);
        }

        final void updateRoomValues(Map map)
        {
            mRoomDataValues = map;
            mRoomDataHolder = new TransientDataHolder(RealTimeAgent.ROOM_CACHE_COLUMNS, null, null, null);
            if (mRoomDataValues != null)
            {
                ContentValues contentvalues;
                for (map = mRoomDataValues.values().iterator(); map.hasNext(); mRoomDataHolder.addRow(contentvalues))
                {
                    contentvalues = (ContentValues)map.next();
                }

            }
        }

        RoomCache(String s, Map map)
        {
            mRoomId = s;
            updateRoomValues(map);
        }
    }


    private static final Lockable.LockableLock LOCK = new Lockable.LockableLock();
    private static final String ROOM_CACHE_COLUMNS[];
    private static final String ROOM_COLUMNS[] = {
        "external_match_id", "creator_external", "creation_timestamp", "last_updater_external", "last_updated_timestamp", "pending_participant_external", "data", "status", "description", "variant", 
        "version", "has_automatch_criteria", "automatch_min_players", "automatch_max_players", "automatch_bit_mask", "automatch_wait_estimate_sec"
    };
    private final Random mRandom = new Random(DefaultClock.getInstance().currentTimeMillis());
    RoomCache mRoomCache;
    private final RoomsApi mRoomsApi;
    private final RoomsApiInternal mRoomsApiInternal;

    public RealTimeAgent(Lockable lockable, BaseApiaryServer baseapiaryserver, BaseApiaryServer baseapiaryserver1)
    {
        super("RealTimeAgent", LOCK, lockable);
        mRoomsApi = new RoomsApi(baseapiaryserver);
        mRoomsApiInternal = new RoomsApiInternal(baseapiaryserver1);
    }

    private static void deleteAndNotify(Context context, ClientContext clientcontext, String s)
    {
        clientcontext = com.google.android.gms.games.provider.GamesContractInternal.Invitations.getUriForExternalInvitationId(clientcontext, s);
        context.getContentResolver().delete(clientcontext, null, null);
        Agents.notifyDataChangeUri(context, GamesDataChangeUris.URI_INVITATIONS);
    }

    private static NetworkDiagnostics getDiagnostics(Context context, int i)
    {
        NetworkInfo networkinfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null)
        {
            return null;
        } else
        {
            context = (TelephonyManager)context.getSystemService("phone");
            return new NetworkDiagnostics(Integer.valueOf(networkinfo.getSubtype()), Integer.valueOf(networkinfo.getType()), context.getNetworkOperator(), context.getNetworkOperatorName(), Integer.valueOf(i));
        }
    }

    private DataHolder getRoomAsDataHolder(Context context, ClientContext clientcontext, Room room, String s)
    {
        mRoomCache = new RoomCache(room.getRoomId(), MultiplayerUtils.getRoomAsDataValues(context, clientcontext, room, s));
        return mRoomCache.getRoomData();
    }

    public final DataHolder acceptInvitation(GamesClientContext gamesclientcontext, String s, ConnectionInfo connectioninfo)
        throws GoogleAuthException
    {
        Object obj;
        Context context;
        ClientContext clientcontext;
        int i;
        context = gamesclientcontext.mContext;
        clientcontext = gamesclientcontext.mClientContext;
        i = 0;
        obj = null;
        Object obj1;
        String s1;
        StringBuilder stringbuilder;
        obj1 = connectioninfo.mClientAddress;
        connectioninfo = new RoomJoinRequest(Capability.getSupportedCapabilities(), new RoomClientAddress(((String) (obj1))), getDiagnostics(context, connectioninfo.mRegistrationLatency));
        obj1 = mRoomsApi;
        s1 = Agents.getLocaleString(context);
        stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("rooms/%1$s/join", new Object[] {
            RoomsApi.enc(s)
        });
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        RoomsApi.append(stringbuilder, "language", RoomsApi.enc(s1));
        String s2 = stringbuilder.toString();
        connectioninfo = (Room)((RoomsApi) (obj1)).mServer.getResponseBlocking(clientcontext, 1, s2, connectioninfo, com/google/android/gms/games/server/api/Room);
_L2:
        if (i == 7000)
        {
            return DataHolder.empty(i);
        }
        break; /* Loop/switch isn't completed */
        connectioninfo;
        GamesLog.e("RealTimeAgent", "Failed to accept invitation");
        i = MultiplayerUtils.getErrorStatus("RealTimeAgent", connectioninfo, 7000);
        connectioninfo = obj;
        if (true) goto _L2; else goto _L1
_L1:
        deleteAndNotify(context, clientcontext, s);
        if (connectioninfo == null)
        {
            return DataHolder.empty(i);
        } else
        {
            return getRoomAsDataHolder(context, gamesclientcontext.mClientContext, connectioninfo, gamesclientcontext.mExternalTargetGameId);
        }
    }

    public final DataHolder createRoom(GamesClientContext gamesclientcontext, int i, ArrayList arraylist, Bundle bundle, ConnectionInfo connectioninfo)
        throws GoogleAuthException
    {
        Object obj1;
        Context context = gamesclientcontext.mContext;
        Object obj;
        if (bundle == null)
        {
            bundle = null;
        } else
        {
            obj = null;
            if (bundle.containsKey("exclusive_bit_mask"))
            {
                obj = Long.valueOf(bundle.getLong("exclusive_bit_mask"));
            }
            bundle = new RoomAutoMatchingCriteria(((Long) (obj)), Integer.valueOf(bundle.getInt("max_automatch_players")), Integer.valueOf(bundle.getInt("min_automatch_players")));
        }
        try
        {
            obj = connectioninfo.mClientAddress;
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            GamesLog.e("RealTimeAgent", (new StringBuilder("Failed to create room: ")).append(gamesclientcontext.getMessage()).toString());
            return DataHolder.empty(MultiplayerUtils.getErrorStatus("RealTimeAgent", gamesclientcontext, 7000));
        }
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
          goto _L3
_L5:
        arraylist = new RoomCreateRequest(bundle, Capability.getSupportedCapabilities(), ((RoomClientAddress) (obj)), arraylist, getDiagnostics(context, connectioninfo.mRegistrationLatency), Long.valueOf(mRandom.nextLong()), ((Integer) (obj1)));
        bundle = mRoomsApi;
        connectioninfo = gamesclientcontext.mClientContext;
        obj = Agents.getLocaleString(context);
        obj1 = new StringBuilder("rooms/create");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        RoomsApi.append(((StringBuilder) (obj1)), "language", RoomsApi.enc(((String) (obj))));
        obj = ((StringBuilder) (obj1)).toString();
        arraylist = (Room)((RoomsApi) (bundle)).mServer.getResponseBlocking(connectioninfo, 1, ((String) (obj)), arraylist, com/google/android/gms/games/server/api/Room);
        return getRoomAsDataHolder(context, gamesclientcontext.mClientContext, arraylist, gamesclientcontext.mExternalTargetGameId);
_L2:
        obj = new RoomClientAddress(((String) (obj)));
_L3:
        while (i != -1) 
        {
            obj1 = Integer.valueOf(i);
            continue; /* Loop/switch isn't completed */
        }
        obj1 = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final int declineInvitation(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        Context context;
        ClientContext clientcontext;
        int i;
        context = gamesclientcontext.mContext;
        clientcontext = gamesclientcontext.mClientContext;
        i = 0;
        String s1;
        StringBuilder stringbuilder;
        if (!gamesclientcontext.mIsFirstParty)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        gamesclientcontext = mRoomsApiInternal;
        s1 = Agents.getLocaleString(context);
        stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("rooms/%1$s/decline", new Object[] {
            RoomsApiInternal.enc(s)
        });
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        RoomsApiInternal.append(stringbuilder, "language", RoomsApiInternal.enc(s1));
        s1 = stringbuilder.toString();
        ((RoomsApiInternal) (gamesclientcontext)).mServer.getResponseBlocking(clientcontext, 1, s1, null, com/google/android/gms/games/server/api/Room);
        break MISSING_BLOCK_LABEL_226;
        gamesclientcontext = mRoomsApi;
        s1 = Agents.getLocaleString(context);
        stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("rooms/%1$s/decline", new Object[] {
            RoomsApi.enc(s)
        });
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        RoomsApi.append(stringbuilder, "language", RoomsApi.enc(s1));
        String s2 = stringbuilder.toString();
        ((RoomsApi) (gamesclientcontext)).mServer.getResponseBlocking(clientcontext, 1, s2, null, com/google/android/gms/games/server/api/Room);
        break MISSING_BLOCK_LABEL_226;
        gamesclientcontext;
        GamesLog.e("RealTimeAgent", "Failed to decline invitation");
        i = MultiplayerUtils.getErrorStatus("RealTimeAgent", gamesclientcontext, 7000);
        while (i != 7000) 
        {
            deleteAndNotify(context, clientcontext, s);
            return i;
        }
        return i;
    }

    public final int dismissInvitation(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        ClientContext clientcontext;
        int i;
        clientcontext = gamesclientcontext.mClientContext;
        i = 0;
        if (!gamesclientcontext.mIsFirstParty) goto _L2; else goto _L1
_L1:
        RoomsApiInternal roomsapiinternal = mRoomsApiInternal;
        Object obj = new StringBuilder();
        (new Formatter(((Appendable) (obj)))).format("rooms/%1$s/dismiss", new Object[] {
            RoomsApiInternal.enc(s)
        });
        obj = ((StringBuilder) (obj)).toString();
        roomsapiinternal.mServer.performNoResponseRequestBlocking(clientcontext, 1, ((String) (obj)), null);
_L4:
        deleteAndNotify(gamesclientcontext.mContext, clientcontext, s);
        return i;
_L2:
        try
        {
            RoomsApi roomsapi = mRoomsApi;
            Object obj1 = new StringBuilder();
            (new Formatter(((Appendable) (obj1)))).format("rooms/%1$s/dismiss", new Object[] {
                RoomsApi.enc(s)
            });
            obj1 = ((StringBuilder) (obj1)).toString();
            roomsapi.mServer.performNoResponseRequestBlocking(clientcontext, 1, ((String) (obj1)), null);
        }
        catch (VolleyError volleyerror)
        {
            GamesLog.e("RealTimeAgent", "Failed to dismiss invitation");
            i = MultiplayerUtils.getErrorStatus("RealTimeAgent", volleyerror, 5);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final DataHolder getRoom(Context context, ClientContext clientcontext, String s)
        throws GoogleAuthException
    {
        if (mRoomCache != null && mRoomCache.isRoomCached(s))
        {
            return mRoomCache.getRoomData();
        }
        Object obj;
        String s1;
        StringBuilder stringbuilder;
        try
        {
            obj = mRoomsApi;
            s1 = Agents.getLocaleString(context);
            stringbuilder = new StringBuilder();
            (new Formatter(stringbuilder)).format("rooms/%1$s", new Object[] {
                RoomsApi.enc(s)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("RealTimeAgent", (new StringBuilder("Failed to retrieve room: ")).append(context.getMessage()).toString());
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(context, "RealTimeAgent");
            }
            return DataHolder.empty(4);
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        RoomsApi.append(stringbuilder, "language", RoomsApi.enc(s1));
        s = stringbuilder.toString();
        s = (Room)((RoomsApi) (obj)).mServer.getResponseBlocking(clientcontext, 0, s, null, com/google/android/gms/games/server/api/Room);
        obj = s.getApplicationId();
        Asserts.checkNotNull(obj);
        return getRoomAsDataHolder(context, clientcontext, s, ((String) (obj)));
    }

    public final int leaveRoom(Context context, ClientContext clientcontext, String s, String s1, RoomLeaveDiagnostics roomleavediagnostics)
        throws GoogleAuthException
    {
        RoomsApi roomsapi;
        try
        {
            roomsapi = mRoomsApi;
            context = Agents.getLocaleString(context);
            s1 = new RoomLeaveRequest(roomleavediagnostics, s1);
            roomleavediagnostics = new StringBuilder();
            (new Formatter(roomleavediagnostics)).format("rooms/%1$s/leave", new Object[] {
                RoomsApi.enc(s)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("RealTimeAgent", (new StringBuilder("Failed to leave match: ")).append(context.getMessage()).toString());
            return MultiplayerUtils.getErrorStatus("RealTimeAgent", context, 7000);
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        RoomsApi.append(roomleavediagnostics, "language", RoomsApi.enc(context));
        context = roomleavediagnostics.toString();
        roomsapi.mServer.getResponseBlocking(clientcontext, 1, context, s1, com/google/android/gms/games/server/api/Room);
        mRoomCache = null;
        return 0;
    }

    public final DataHolder p2pStatus(Context context, ClientContext clientcontext, String s, List list)
        throws GoogleAuthException
    {
        RoomsApi roomsapi;
        StringBuilder stringbuilder;
        try
        {
            roomsapi = mRoomsApi;
            context = Agents.getLocaleString(context);
            list = new RoomP2PStatuses(new ArrayList(list));
            stringbuilder = new StringBuilder();
            (new Formatter(stringbuilder)).format("rooms/%1$s/reportstatus", new Object[] {
                RoomsApi.enc(s)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("RealTimeAgent", (new StringBuilder("Failed to report peer connections: ")).append(context.getMessage()).toString());
            return DataHolder.empty(MultiplayerUtils.getErrorStatus("RealTimeAgent", context, 7000));
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        RoomsApi.append(stringbuilder, "language", RoomsApi.enc(context));
        context = stringbuilder.toString();
        context = MultiplayerUtils.roomStatusToDataHolder((RoomStatus)roomsapi.mServer.getResponseBlocking(clientcontext, 1, context, list, com/google/android/gms/games/server/api/RoomStatus));
        return context;
    }

    static 
    {
        ROOM_CACHE_COLUMNS = (String[])ArrayUtils.concat(new String[][] {
            ROOM_COLUMNS, GamesDataUtils.PARTICIPANT_SPEC.mColumnNames
        });
    }


}
