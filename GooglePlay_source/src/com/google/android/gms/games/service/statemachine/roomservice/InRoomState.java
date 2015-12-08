// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomservice;

import android.content.ContentValues;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.support.v4.util.ArrayMap;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IRoomServiceCallbacks;
import com.google.android.gms.games.internal.constants.MatchParticipantStatus;
import com.google.android.gms.games.jingle.PeerDiagnostics;
import com.google.android.gms.games.multiplayer.ParticipantUtils;
import com.google.android.gms.games.realtime.PeerConnectionInfo;
import com.google.android.gms.games.realtime.RoomData;
import com.google.android.gms.games.realtime.RoomParticipant;
import com.google.android.gms.games.realtime.network.DataConnectionManager;
import com.google.android.gms.games.server.api.AggregateStats;
import com.google.android.gms.games.server.api.PeerChannelDiagnostics;
import com.google.android.gms.games.server.api.PeerSessionDiagnostics;
import com.google.android.gms.games.server.api.RoomClientAddress;
import com.google.android.gms.games.server.api.RoomLeaveDiagnostics;
import com.google.android.gms.games.server.api.RoomP2PStatus;
import com.google.android.gms.games.server.api.RoomStatus;
import com.google.android.gms.games.service.statemachine.IStateMachine;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomservice:
//            RoomServiceState, RoomServiceStateMachine, LeavingRoomState, WaitNetworkDisconnectState

final class InRoomState extends RoomServiceState
{

    private Hashtable mConnectionRetries;
    private com.google.android.gms.games.service.statemachine.roomclient.RtmpSessionLog.RtmpDcmLog mDcmLog;
    protected boolean mEnableSockets;
    private String mMyJid;
    protected String mPlayerId;
    protected RoomData mRoomData;
    protected final SparseArray mSentMessageTokens = new SparseArray();

    public InRoomState(RoomServiceStateMachine roomservicestatemachine)
    {
        super(roomservicestatemachine);
    }

    private void connectToParticipant(RoomParticipant roomparticipant)
    {
        String s1 = roomparticipant.mParticipantId;
        String s2 = roomparticipant.mPublicProfileJid;
        String s;
        IStateMachine istatemachine;
        boolean flag;
        if (!TextUtils.isEmpty(s2))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        if (mRoomData.mCurrentParticipantId.compareTo(s1) >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        istatemachine = mSm;
        if (flag)
        {
            s = "Initiating connection with %s";
        } else
        {
            s = "Waiting for connection from %s";
        }
        istatemachine.logNote(String.format(s, new Object[] {
            s1
        }));
        mData.mDataConnectionManager.connectToPeer(s2, flag, roomparticipant.mCapabilities);
    }

    private static AggregateStats getAggregateStats(com.google.android.gms.games.jingle.PeerDiagnostics.AggregateStats aggregatestats)
    {
        AggregateStats aggregatestats1 = null;
        if (aggregatestats != null)
        {
            aggregatestats1 = new AggregateStats(Long.valueOf(aggregatestats.getCount()), Long.valueOf(aggregatestats.getMax()), Long.valueOf(aggregatestats.getMin()), Long.valueOf(aggregatestats.getSum()));
        }
        return aggregatestats1;
    }

    private ArrayList getMessageRecipients(String as[])
    {
        if (as != null) goto _L2; else goto _L1
_L1:
        Object obj = mRoomData.getPeerParticipants();
_L4:
        return ((ArrayList) (obj));
_L2:
        ArrayList arraylist = new ArrayList(as.length);
        int j = as.length;
        int i = 0;
        do
        {
            obj = arraylist;
            if (i >= j)
            {
                continue;
            }
            obj = as[i];
            arraylist.add(mRoomData.getPeerParticipantForParticipantId(((String) (obj))));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String[] getParticipantIds(ArrayList arraylist)
    {
        String as[] = new String[arraylist.size()];
        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            as[i] = ((RoomParticipant)arraylist.get(i)).mParticipantId;
        }

        return as;
    }

    private static PeerChannelDiagnostics getPeerChannelDiagnostics(com.google.android.gms.games.jingle.PeerDiagnostics.PeerChannelMetrics peerchannelmetrics)
    {
        AggregateStats aggregatestats = getAggregateStats(peerchannelmetrics.getNumBytesReceived());
        AggregateStats aggregatestats1 = getAggregateStats(peerchannelmetrics.getNumBytesSent());
        AggregateStats aggregatestats2 = getAggregateStats(peerchannelmetrics.getRoundTripLatencyMs());
        return new PeerChannelDiagnostics(aggregatestats, aggregatestats1, Integer.valueOf(peerchannelmetrics.getNumMessagesLost()), Integer.valueOf(peerchannelmetrics.getNumMessagesReceived()), Integer.valueOf(peerchannelmetrics.getNumMessagesSent()), Integer.valueOf(0), aggregatestats2);
    }

    private void handlePeerConnectionUpdate(RoomParticipant roomparticipant, String s, PeerConnectionInfo peerconnectioninfo)
    {
        boolean flag = true;
        if ("CONNECTION_FAILED".equals(s))
        {
            roomparticipant.mConnectionFailed = true;
        }
        String s1 = roomparticipant.mParticipantId;
        int i;
        if (mRoomData.mCurrentParticipantId.compareTo(s1) < 0)
        {
            flag = false;
        }
        mSm.logNote((new StringBuilder("Connection status: ")).append(s).append(" reporting ? ").append(flag).toString());
        if (!"CONNECTION_FAILED".equals(s) && !flag)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        roomparticipant = new ArrayList();
        roomparticipant.add(new RoomP2PStatus(peerconnectioninfo.mConnectionSetupLatencyMs, peerconnectioninfo.mError, s1, s, null));
        try
        {
            s = new String[roomparticipant.size()];
        }
        // Misplaced declaration of an exception variable
        catch (RoomParticipant roomparticipant)
        {
            GamesLog.e("RoomServiceStateMachine", "Room client is not connected.");
            return;
        }
        i = 0;
        if (i >= s.length)
        {
            break; /* Loop/switch isn't completed */
        }
        s[i] = ((RoomP2PStatus)roomparticipant.get(i)).toString();
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_130;
_L1:
        mData.mRoomService.onReportP2pStatus(mRoomData.mRoomId, s);
    }

    private void handleStatusNotification(RoomStatus roomstatus)
    {
        if (RoomServiceStateMachine.DBG)
        {
            GamesLog.d("RoomServiceStateMachine", "HandleStatusNotification");
        }
        if (mRoomData.mRoomId.equals(roomstatus.getRoomId())) goto _L2; else goto _L1
_L1:
        GamesLog.w("RoomServiceStateMachine", String.format("Current room %s does not match room %s from notification. Ignoring the notification.", new Object[] {
            mRoomData.mRoomId, roomstatus.getRoomId()
        }));
_L30:
        return;
_L2:
        Object obj;
        ArrayList arraylist1;
        ArrayList arraylist2;
        ArrayList arraylist3;
        ArrayList arraylist4;
        ArrayList arraylist5;
        ArrayList arraylist6;
        String s;
        Integer integer;
        int i1;
        boolean flag;
        com.google.android.gms.games.server.api.RoomParticipant roomparticipant;
        ArrayList arraylist;
        int i;
        int l;
        if (roomstatus.getStatusVersion() != null)
        {
            if (mRoomData.mStatusVersion >= roomstatus.getStatusVersion().intValue())
            {
                GamesLog.i("RoomServiceStateMachine", String.format("Current status version %d which is the same or later than the version received %d. Ignoring the notification.", new Object[] {
                    Integer.valueOf(mRoomData.mStatusVersion), roomstatus.getStatusVersion()
                }));
                return;
            }
            mRoomData.mStatusVersion = roomstatus.getStatusVersion().intValue();
        } else
        if (RoomServiceStateMachine.DBG)
        {
            GamesLog.d("RoomServiceStateMachine", "roomStatus returned null status version.");
        }
        try
        {
            mData.mRoomService.onRoomUpdated(roomstatus.toString());
            arraylist = roomstatus.getParticipants();
            arraylist1 = new ArrayList();
            arraylist2 = new ArrayList();
            arraylist3 = new ArrayList();
            arraylist4 = new ArrayList();
            arraylist5 = new ArrayList();
            arraylist6 = new ArrayList();
            l = arraylist.size();
        }
        // Misplaced declaration of an exception variable
        catch (RoomStatus roomstatus)
        {
            RoomServiceStateMachine.handleRemoteRoomServiceException(roomstatus);
            return;
        }
        i = 0;
        if (i >= l) goto _L4; else goto _L3
_L3:
        roomparticipant = (com.google.android.gms.games.server.api.RoomParticipant)arraylist.get(i);
        s = roomparticipant.getId();
        if (roomparticipant.isConnected() != null) goto _L6; else goto _L5
_L5:
        flag = false;
_L13:
        i1 = ((Integer)((FastContentValuesJsonResponse) (roomparticipant)).mValues.get("player_status")).intValue();
        obj = null;
        if (roomparticipant.getClientAddress() != null)
        {
            obj = roomparticipant.getClientAddress().getXmppAddress();
        }
        integer = (Integer)((FastContentValuesJsonResponse) (roomparticipant)).mValues.get("capabilities");
        if (!s.equals(mRoomData.mCurrentParticipantId)) goto _L8; else goto _L7
_L7:
        if (RoomServiceStateMachine.DBG)
        {
            GamesLog.d("RoomServiceStateMachine", "Current Participant");
        }
        if (flag == mRoomData.mCurrentParticipantInConnectedSet) goto _L10; else goto _L9
_L9:
        if (flag) goto _L12; else goto _L11
_L11:
        mData.mRoomService.onDisconnectedFromRoom(mRoomData.mRoomId);
_L10:
        mRoomData.mCurrentParticipantInConnectedSet = flag;
_L23:
        i++;
        break MISSING_BLOCK_LABEL_227;
_L6:
        flag = roomparticipant.isConnected().booleanValue();
          goto _L13
_L12:
        mData.mRoomService.onConnectedToRoom(mRoomData.mRoomId);
          goto _L10
_L8:
        Object obj1 = mRoomData.getPeerParticipantForParticipantId(s);
        int j = 0;
        if (obj1 == null) goto _L15; else goto _L14
_L14:
        int k;
        boolean flag1;
        k = ((RoomParticipant) (obj1)).mParticipantStatus;
        flag1 = ((RoomParticipant) (obj1)).mInConnectedSet;
        obj1.mPublicProfileJid = ((String) (obj));
        obj1.mParticipantStatus = i1;
        obj1.mInConnectedSet = flag;
        obj = obj1;
          goto _L16
_L36:
        GamesLog.w("RoomServiceStateMachine", String.format("Received participant with invalid status %d", new Object[] {
            Integer.valueOf(i1)
        }));
_L26:
        if (flag1 == flag) goto _L18; else goto _L17
_L17:
        if (!flag) goto _L20; else goto _L19
_L19:
        arraylist5.add(obj);
_L27:
        if (((RoomParticipant) (obj)).mParticipantStatus == 2)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        obj1 = mRoomData;
        ((RoomData) (obj1)).mPeerParticipantIdToParticipantDataMap.put(((RoomParticipant) (obj)).mParticipantId, obj);
        if (j == 0) goto _L22; else goto _L21
_L21:
        if (!TextUtils.isEmpty(((RoomParticipant) (obj)).mPublicProfileJid))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        ((RoomData) (obj1)).mPublicProfileJidToParticipantDataMap.put(((RoomParticipant) (obj)).mPublicProfileJid, obj);
          goto _L23
_L15:
        if (integer == null) goto _L25; else goto _L24
_L24:
        j = integer.intValue();
_L41:
        obj = new RoomParticipant(s, ((String) (obj)), i1, flag, j);
        flag1 = false;
        k = 0;
        j = 1;
        continue; /* Loop/switch isn't completed */
_L38:
        arraylist2.add(obj);
          goto _L26
_L39:
        arraylist3.add(obj);
          goto _L26
_L40:
        arraylist4.add(obj);
          goto _L26
_L37:
        arraylist1.add(obj);
          goto _L26
_L20:
        arraylist6.add(obj);
          goto _L27
_L18:
        if (!((RoomParticipant) (obj)).mConnectionFailed || flag1) goto _L27; else goto _L28
_L28:
        mSm.logNote((new StringBuilder("Adding participant: ")).append(((RoomParticipant) (obj)).mPublicProfileJid).append(" to disconnected set.").toString());
        arraylist6.add(obj);
          goto _L27
_L22:
        ((RoomData) (obj1)).mPublicProfileJidToParticipantDataMap.remove(((RoomParticipant) (obj)).mPublicProfileJid);
          goto _L23
_L4:
        sendPeerStatusChangedMessage(2, arraylist2);
        sendPeerStatusChangedMessage(3, arraylist3);
        sendPeerStatusChangedMessage(4, arraylist4);
        sendPeerStatusChangedMessage(1, arraylist1);
        if (!arraylist5.isEmpty())
        {
            mData.mRoomService.onPeerConnected(mRoomData.mRoomId, getParticipantIds(arraylist5));
        }
        if (!arraylist6.isEmpty())
        {
            mData.mRoomService.onPeerDisconnected(mRoomData.mRoomId, getParticipantIds(arraylist6));
        }
        if (mRoomData.mRoomStatus == roomstatus.getStatus().intValue())
        {
            continue; /* Loop/switch isn't completed */
        }
        mRoomData.mRoomStatus = roomstatus.getStatus().intValue();
        roomstatus.getStatus().intValue();
        JVM INSTR tableswitch 0 3: default 1109
    //                   0 65
    //                   1 964
    //                   2 981
    //                   3 998;
           goto _L29 _L30 _L31 _L32 _L33
_L29:
        GamesLog.w("RoomServiceStateMachine", String.format("Received room with invalid status %d", new Object[] {
            roomstatus.getStatus()
        }));
        return;
_L31:
        mData.mRoomService.onRoomAutoMatching(roomstatus.getRoomId());
        return;
_L32:
        mData.mRoomService.onRoomConnecting(roomstatus.getRoomId());
        return;
_L33:
        mData.mRoomService.onRoomConnected(roomstatus.getRoomId());
        return;
        if (!RoomServiceStateMachine.DBG) goto _L30; else goto _L34
_L34:
        GamesLog.d("RoomServiceStateMachine", String.format("Received room with same status %d", new Object[] {
            roomstatus.getStatus()
        }));
        return;
_L16:
        if (j == 0 && k == i1) goto _L26; else goto _L35
_L35:
        i1;
        JVM INSTR tableswitch 1 4: default 1088
    //                   1 686
    //                   2 656
    //                   3 666
    //                   4 676;
           goto _L36 _L37 _L38 _L39 _L40
_L25:
        j = 0;
          goto _L41
    }

    private void initiateP2PConnection(ArrayList arraylist)
    {
        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            connectToParticipant((RoomParticipant)arraylist.get(i));
        }

    }

    private void leaveRoomWithDiagnostics()
    {
        Object obj = (ConnectivityManager)mData.mContext.getSystemService("connectivity");
        int j = 0;
        int i = 0;
        obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
        if (obj != null)
        {
            j = ((NetworkInfo) (obj)).getType();
            i = ((NetworkInfo) (obj)).getSubtype();
        }
        obj = new ArrayList();
        Object obj1 = mRoomData.getPeerParticipants();
        int k = 0;
        for (int l = ((ArrayList) (obj1)).size(); k < l; k++)
        {
            RoomParticipant roomparticipant = (RoomParticipant)((ArrayList) (obj1)).get(k);
            Object obj2 = roomparticipant.mPublicProfileJid;
            if (TextUtils.isEmpty(((CharSequence) (obj2))))
            {
                continue;
            }
            obj2 = mData.mDataConnectionManager.getNetworkDiagnosticsForPeer(((String) (obj2)));
            if (obj2 != null && ((com.google.android.gms.games.realtime.network.DataConnectionManager.SessionDiagnostics) (obj2)).peerDiagnostics != null)
            {
                PeerChannelDiagnostics peerchanneldiagnostics = getPeerChannelDiagnostics(((com.google.android.gms.games.realtime.network.DataConnectionManager.SessionDiagnostics) (obj2)).peerDiagnostics.getReliableChannelMetrics());
                com.google.android.gms.games.jingle.PeerDiagnostics.PeerChannelMetrics peerchannelmetrics = ((com.google.android.gms.games.realtime.network.DataConnectionManager.SessionDiagnostics) (obj2)).peerDiagnostics.getUnreliableChannelMetrics();
                PeerChannelDiagnostics peerchanneldiagnostics1 = getPeerChannelDiagnostics(peerchannelmetrics);
                long l1 = peerchannelmetrics.getConnectionStartTimestampMs();
                ((ArrayList) (obj)).add(new PeerSessionDiagnostics(Long.valueOf(System.currentTimeMillis() - l1), roomparticipant.mParticipantId, peerchanneldiagnostics, peerchanneldiagnostics1));
            }
            if (obj2 != null && ((com.google.android.gms.games.realtime.network.DataConnectionManager.SessionDiagnostics) (obj2)).rtmpPeerLog != null)
            {
                com.google.android.gms.games.service.statemachine.roomclient.RtmpSessionLog.RtmpDcmLog rtmpdcmlog = mDcmLog;
                obj2 = ((com.google.android.gms.games.realtime.network.DataConnectionManager.SessionDiagnostics) (obj2)).rtmpPeerLog;
                rtmpdcmlog.mPeerLogs.add(obj2);
            }
        }

        obj1 = (TelephonyManager)mData.mContext.getSystemService("phone");
        obj = new RoomLeaveDiagnostics(Integer.valueOf(i), Integer.valueOf(j), ((TelephonyManager) (obj1)).getNetworkOperator(), ((TelephonyManager) (obj1)).getNetworkOperatorName(), ((ArrayList) (obj)), Boolean.valueOf(mEnableSockets));
        try
        {
            mData.mRoomService.onRoomLeaveDiagnostics(((RoomLeaveDiagnostics) (obj)).toString(), com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.toByteArray(mDcmLog.toPlayLog()));
            return;
        }
        catch (RemoteException remoteexception)
        {
            RoomServiceStateMachine.handleRemoteRoomServiceException(remoteexception);
        }
    }

    private void sendPeerStatusChangedMessage(int i, ArrayList arraylist)
    {
        if (RoomServiceStateMachine.DBG)
        {
            GamesLog.d("RoomServiceStateMachine", String.format("Checking participantStatus %s for %d participants.", new Object[] {
                MatchParticipantStatus.fromInt(i), Integer.valueOf(arraylist.size())
            }));
        }
        if (arraylist.isEmpty()) goto _L2; else goto _L1
_L1:
        String as[] = getParticipantIds(arraylist);
        i;
        JVM INSTR tableswitch 1 4: default 84
    //                   1 108
    //                   2 140
    //                   3 254
    //                   4 166;
           goto _L3 _L4 _L5 _L6 _L7
_L4:
        mData.mRoomService.onPeerInvitedToRoom(mRoomData.mRoomId, as);
        return;
_L3:
        try
        {
            GamesLog.e("RoomServiceStateMachine", (new StringBuilder("Illegal Peer Status : ")).append(i).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            GamesLog.e("RoomServiceStateMachine", "Room client is not connected.");
        }
        return;
_L5:
        initiateP2PConnection(arraylist);
        mData.mRoomService.onPeerJoinedRoom(mRoomData.mRoomId, as);
        return;
_L7:
        int j = arraylist.size();
        i = 0;
_L9:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        RoomParticipant roomparticipant = (RoomParticipant)arraylist.get(i);
        boolean flag;
        if (!TextUtils.isEmpty(roomparticipant.mPublicProfileJid))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        mData.mDataConnectionManager.disconnectPeerConnection(roomparticipant.mPublicProfileJid);
        i++;
        if (true) goto _L9; else goto _L8
_L8:
        mData.mRoomService.onPeerLeftRoom(mRoomData.mRoomId, as);
        return;
_L6:
        mData.mRoomService.onPeerDeclined(mRoomData.mRoomId, as);
_L2:
    }

    public final void enter()
    {
    }

    public final boolean processMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 19: default 100
    //                   0 291
    //                   1 102
    //                   2 2041
    //                   3 1914
    //                   4 100
    //                   5 422
    //                   6 474
    //                   7 886
    //                   8 542
    //                   9 1114
    //                   10 1790
    //                   11 1251
    //                   12 1493
    //                   13 527
    //                   14 100
    //                   15 100
    //                   16 100
    //                   17 100
    //                   18 100
    //                   19 2069;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L1 _L1 _L1 _L1 _L1 _L15
_L1:
        return false;
_L3:
        message = (Messages.CreateNativeSocketConnectionData)message.obj;
        if (!mRoomData.mCurrentParticipantId.equals(((Messages.CreateNativeSocketConnectionData) (message)).participantId)) goto _L17; else goto _L16
_L16:
        GamesLog.e("RoomServiceStateMachine", "Attempting to create a socket connection to self.");
        mData.mRoomService.onCreateNativeLibjingleSocket(null, ((Messages.CreateNativeSocketConnectionData) (message)).token);
_L20:
        return HANDLED;
_L17:
        String s = mRoomData.getPeerPublicProfileJid(((Messages.CreateNativeSocketConnectionData) (message)).participantId);
        if (s != null) goto _L19; else goto _L18
_L18:
        try
        {
            mData.mRoomService.onCreateNativeLibjingleSocket(null, ((Messages.CreateNativeSocketConnectionData) (message)).token);
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            RoomServiceStateMachine.handleRemoteRoomServiceException(message);
        }
          goto _L20
_L19:
        int i = mData.mDataConnectionManager.createNativeLibjingleSocket(s);
        if (i <= 0) goto _L22; else goto _L21
_L21:
        mData.mRoomService.onCreateNativeLibjingleSocket(ParcelFileDescriptor.adoptFd(i), ((Messages.CreateNativeSocketConnectionData) (message)).token);
          goto _L20
_L22:
        GamesLog.e("RoomServiceStateMachine", (new StringBuilder("Native socket creation failed for participant: ")).append(((Messages.CreateNativeSocketConnectionData) (message)).participantId).toString());
        mData.mRoomService.onCreateNativeLibjingleSocket(null, ((Messages.CreateNativeSocketConnectionData) (message)).token);
          goto _L20
_L2:
        message = (Messages.CreateSocketConnectionData)message.obj;
        if (!mRoomData.mCurrentParticipantId.equals(((Messages.CreateSocketConnectionData) (message)).participantId)) goto _L24; else goto _L23
_L23:
        GamesLog.e("RoomServiceStateMachine", "Attempting to create a socket connection to self.");
        mData.mRoomService.onCreateSocketConnection(null, ((Messages.CreateSocketConnectionData) (message)).token);
_L27:
        return HANDLED;
_L24:
        s = mRoomData.getPeerPublicProfileJid(((Messages.CreateSocketConnectionData) (message)).participantId);
        if (s != null) goto _L26; else goto _L25
_L25:
        try
        {
            mData.mRoomService.onCreateSocketConnection(null, ((Messages.CreateSocketConnectionData) (message)).token);
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            RoomServiceStateMachine.handleRemoteRoomServiceException(message);
        }
          goto _L27
_L26:
        mData.mRoomService.onCreateSocketConnection(mData.mDataConnectionManager.createSocketConnection(s), ((Messages.CreateSocketConnectionData) (message)).token);
          goto _L27
_L6:
        message = (Messages.StatusNotificationData)message.obj;
        if (RoomServiceStateMachine.DBG)
        {
            GamesLog.d("RoomServiceStateMachine", String.format("Received statusNotification for room %s", new Object[] {
                mRoomData.toString()
            }));
        }
        handleStatusNotification(((Messages.StatusNotificationData) (message)).roomStatus);
        return HANDLED;
_L7:
        message = (ArrayList)message.obj;
        initiateP2PConnection(message);
        try
        {
            mData.mRoomService.onPeerJoinedRoom(mRoomData.mRoomId, getParticipantIds(message));
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            GamesLog.e("RoomServiceStateMachine", "Room client is not connected.");
        }
        return HANDLED;
_L14:
        handleStatusNotification((RoomStatus)message.obj);
        return HANDLED;
_L9:
        Messages.P2pConnectionFailedData p2pconnectionfaileddata = (Messages.P2pConnectionFailedData)message.obj;
        message = p2pconnectionfaileddata.peerConnectionInfo.mPeerJid;
        RoomParticipant roomparticipant1 = mRoomData.getPeerParticipantForPublicProfileJid(message);
        if (roomparticipant1 != null)
        {
            int j;
            if (((Integer)G.rtmpMaxReconnectAttempts.get()).intValue() == 0)
            {
                j = 0;
            } else
            if (roomparticipant1.mParticipantStatus != 2)
            {
                j = 0;
            } else
            {
                message = (Integer)mConnectionRetries.get(roomparticipant1.mParticipantId);
                if (message == null)
                {
                    message = Integer.valueOf(0);
                }
                if (message.intValue() < ((Integer)G.rtmpMaxReconnectAttempts.get()).intValue())
                {
                    String s6 = (new StringBuilder("Attempting to reconnect to: ")).append(roomparticipant1.mParticipantId).toString();
                    mSm.logNote(s6);
                    GamesLog.i("RoomServiceStateMachine", s6);
                    connectToParticipant(roomparticipant1);
                    j = message.intValue();
                    mConnectionRetries.put(roomparticipant1.mParticipantId, Integer.valueOf(j + 1));
                    message = mDcmLog.getReconnectEntry(roomparticipant1.mParticipantId);
                    message.retryCount = ((com.google.android.gms.games.service.statemachine.roomclient.RtmpSessionLog.RtmpDcmLog.ReconnectLog) (message)).retryCount + 1;
                    j = 1;
                } else
                {
                    message = (new StringBuilder("Could not reconnect to: ")).append(roomparticipant1.mParticipantId).append(" after ").append(message).append(" tries").toString();
                    mSm.logNote(message);
                    GamesLog.e("RoomServiceStateMachine", message);
                    j = 0;
                }
            }
            if (j == 0)
            {
                try
                {
                    mData.mRoomService.onP2PDisconnected(roomparticipant1.mParticipantId);
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    GamesLog.e("RoomServiceStateMachine", "Room client is not connected.");
                }
                handlePeerConnectionUpdate(roomparticipant1, "CONNECTION_FAILED", p2pconnectionfaileddata.peerConnectionInfo);
            }
        } else
        if (RoomServiceStateMachine.DBG)
        {
            GamesLog.e("RoomServiceStateMachine", (new StringBuilder("failedParticipant is null for: ")).append(message).toString());
        }
        return HANDLED;
_L8:
        Messages.P2pConnectionSucceededData p2pconnectionsucceededdata = (Messages.P2pConnectionSucceededData)message.obj;
        Object obj1 = p2pconnectionsucceededdata.peerConnectionInfo.mPeerJid;
        message = mRoomData.getPeerParticipantForPublicProfileJid(((String) (obj1)));
        if (message != null)
        {
            try
            {
                mData.mRoomService.onP2PConnected(((RoomParticipant) (message)).mParticipantId);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                GamesLog.e("RoomServiceStateMachine", "Room client is not connected.");
            }
            handlePeerConnectionUpdate(message, "CONNECTION_ESTABLISHED", p2pconnectionsucceededdata.peerConnectionInfo);
            if (((Integer)G.rtmpMaxReconnectAttempts.get()).intValue() != 0)
            {
                Object obj = (Integer)mConnectionRetries.get(((RoomParticipant) (message)).mParticipantId);
                if (obj != null)
                {
                    obj = (new StringBuilder("Reestablished peer connection to ")).append(((RoomParticipant) (message)).mParticipantId).append(" after ").append(obj).append(" tries").toString();
                    obj1 = mDcmLog.getReconnectEntry(((RoomParticipant) (message)).mParticipantId);
                    obj1.retrySuccessful = ((com.google.android.gms.games.service.statemachine.roomclient.RtmpSessionLog.RtmpDcmLog.ReconnectLog) (obj1)).retrySuccessful + 1;
                    mSm.logNote(((String) (obj)));
                    GamesLog.i("RoomServiceStateMachine", ((String) (obj)));
                    mConnectionRetries.remove(((RoomParticipant) (message)).mParticipantId);
                }
            }
        } else
        if (RoomServiceStateMachine.DBG)
        {
            GamesLog.e("RoomServiceStateMachine", (new StringBuilder("successParticipant is null for: ")).append(((String) (obj1))).toString());
        }
        return HANDLED;
_L10:
        Messages.MessageReceivedData messagereceiveddata = (Messages.MessageReceivedData)message.obj;
        String s3 = mRoomData.getPeerParticipantId(messagereceiveddata.senderJid);
        if (messagereceiveddata.reliable != 0)
        {
            message = "Reliable";
        } else
        {
            message = "Unreliable";
        }
        if (s3 == null)
        {
            GamesLog.e("RoomServiceStateMachine", String.format("%s message received: %s, who is not a participant in the room", new Object[] {
                message, messagereceiveddata.senderJid
            }));
        } else
        {
            GamesLog.d("RoomServiceStateMachine", String.format("%s message received : %s", new Object[] {
                message, messagereceiveddata.senderJid
            }));
            try
            {
                mData.mRoomService.onRealTimeMessageReceived(s3, messagereceiveddata.messageData, messagereceiveddata.reliable);
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                GamesLog.e("RoomServiceStateMachine", "Room client is not connected.");
            }
        }
        return HANDLED;
_L12:
        message = (Messages.SendReliableMessageData)message.obj;
        if (mRoomData.mCurrentParticipantId.equals(((Messages.SendReliableMessageData) (message)).recipientParticipantId) || !mRoomData.isValidPeerParticipantId(((Messages.SendReliableMessageData) (message)).recipientParticipantId))
        {
            try
            {
                mData.mRoomService.onSentReliableMessage(7001, ((Messages.SendReliableMessageData) (message)).clientToken, ((Messages.SendReliableMessageData) (message)).recipientParticipantId);
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                RoomServiceStateMachine.handleRemoteRoomServiceException(message);
            }
        } else
        {
            RoomParticipant roomparticipant = mRoomData.getPeerParticipantForParticipantId(((Messages.SendReliableMessageData) (message)).recipientParticipantId);
            if (mRoomData.mCurrentParticipantInConnectedSet && roomparticipant != null && !TextUtils.isEmpty(roomparticipant.mPublicProfileJid) && roomparticipant.mInConnectedSet)
            {
                int k = mData.mDataConnectionManager.sendReliableMessage(((Messages.SendReliableMessageData) (message)).messageData, roomparticipant.mPublicProfileJid);
                if (k != -1)
                {
                    mSentMessageTokens.put(k, Integer.valueOf(((Messages.SendReliableMessageData) (message)).clientToken));
                } else
                {
                    try
                    {
                        mData.mRoomService.onSentReliableMessage(7001, ((Messages.SendReliableMessageData) (message)).clientToken, ((Messages.SendReliableMessageData) (message)).recipientParticipantId);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Message message)
                    {
                        GamesLog.e("RoomServiceStateMachine", "Room client is not connected.");
                    }
                }
            } else
            {
                try
                {
                    mData.mRoomService.onSentReliableMessage(7003, ((Messages.SendReliableMessageData) (message)).clientToken, ((Messages.SendReliableMessageData) (message)).recipientParticipantId);
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    GamesLog.e("RoomServiceStateMachine", "Room client is not connected.");
                }
            }
        }
        return HANDLED;
_L13:
        message = (Messages.SendUnreliableMessageData)message.obj;
        if (((Messages.SendUnreliableMessageData) (message)).recipientParticipantIds != null)
        {
            boolean flag1 = true;
            String as[] = ((Messages.SendUnreliableMessageData) (message)).recipientParticipantIds;
            int j1 = as.length;
            for (int l = 0; l < j1; l++)
            {
                String s4 = as[l];
                if (mRoomData.mCurrentParticipantId.equals(s4) || !mRoomData.isValidPeerParticipantId(s4))
                {
                    flag1 = false;
                    GamesLog.e("RoomServiceStateMachine", (new StringBuilder("Can't send message to self or to invalid peer ")).append(s4).toString());
                }
            }

            if (!flag1)
            {
                return HANDLED;
            }
        }
        if (mRoomData.mCurrentParticipantInConnectedSet)
        {
            ArrayList arraylist = getMessageRecipients(((Messages.SendUnreliableMessageData) (message)).recipientParticipantIds);
            HashSet hashset;
            boolean flag;
            int i1;
            int k1;
            if (((Messages.SendUnreliableMessageData) (message)).recipientParticipantIds != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hashset = new HashSet(arraylist.size());
            i1 = 0;
            k1 = arraylist.size();
            while (i1 < k1) 
            {
                RoomParticipant roomparticipant2 = (RoomParticipant)arraylist.get(i1);
                if (roomparticipant2 != null && !TextUtils.isEmpty(roomparticipant2.mPublicProfileJid) && roomparticipant2.mInConnectedSet)
                {
                    hashset.add(roomparticipant2.mPublicProfileJid);
                } else
                if (flag)
                {
                    GamesLog.e("RoomServiceStateMachine", "Attempting to send an unreliable message to participant who is not in connected set.");
                }
                i1++;
            }
            mData.mDataConnectionManager.sendUnreliableMessage(((Messages.SendUnreliableMessageData) (message)).messageData, (String[])hashset.toArray(new String[hashset.size()]));
        } else
        {
            GamesLog.e("RoomServiceStateMachine", "Attempting to send an unreliable message to participants when not in connected set.");
        }
        return HANDLED;
_L11:
        Messages.MessageSendResultData messagesendresultdata = (Messages.MessageSendResultData)message.obj;
        Integer integer = (Integer)mSentMessageTokens.get(messagesendresultdata.dcmToken);
        if (integer != null)
        {
            mSentMessageTokens.remove(messagesendresultdata.dcmToken);
            message = messagesendresultdata.peerJid;
            message = mRoomData.getPeerParticipantId(message);
            if (message != null)
            {
                try
                {
                    mData.mRoomService.onSentReliableMessage(messagesendresultdata.statusCode, integer.intValue(), message);
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    GamesLog.e("RoomServiceStateMachine", "Room client is not connected.");
                }
            }
            return HANDLED;
        } else
        {
            GamesLog.e("RoomServiceStateMachine", (new StringBuilder("Got null token for messageId ")).append(message.arg1).toString());
            return HANDLED;
        }
_L5:
        leaveRoomWithDiagnostics();
        mSm.logNote("Disconnecting all peers");
        String s1;
        for (message = mRoomData.mPublicProfileJidToParticipantDataMap.keySet().iterator(); message.hasNext(); mData.mDataConnectionManager.disconnectPeerConnection(s1))
        {
            s1 = (String)message.next();
        }

        message = mStates.leavingRoomState;
        String s2 = mPlayerId;
        String s5 = mMyJid;
        message.mPlayerId = s2;
        message.mMyJid = s5;
        boolean flag2;
        if (!ParticipantUtils.isValidParticipantId(s2))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkState(flag2, "Expecting player id!");
        message.transitionToState();
        return HANDLED;
_L4:
        leaveRoomWithDiagnostics();
        mSm.deferMessage(message);
        mStates.waitNetworkDisconnectState.transitionToState();
        return HANDLED;
_L15:
        mData.mDataConnectionManager.tearDown();
        mStates.waitNetworkDisconnectState.transitionToState();
        return HANDLED;
    }

    public final void transitionTo(String s, RoomData roomdata, boolean flag, String s1)
    {
        mRoomData = (RoomData)Preconditions.checkNotNull(roomdata);
        mEnableSockets = flag;
        mPlayerId = s;
        if (!ParticipantUtils.isValidParticipantId(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Expecting player id!");
        mConnectionRetries = new Hashtable();
        mMyJid = s1;
        mDcmLog = new com.google.android.gms.games.service.statemachine.roomclient.RtmpSessionLog.RtmpDcmLog(s1);
        transitionToState();
    }
}
