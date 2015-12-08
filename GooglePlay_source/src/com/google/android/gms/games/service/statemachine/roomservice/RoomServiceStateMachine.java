// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomservice;

import android.content.Context;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.util.state.IState;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IRoomServiceCallbacks;
import com.google.android.gms.games.realtime.PeerConnectionInfo;
import com.google.android.gms.games.realtime.network.DataConnectionCallbacks;
import com.google.android.gms.games.realtime.network.DataConnectionManager;
import com.google.android.gms.games.realtime.network.DcmFactory;
import com.google.android.gms.games.server.api.RoomStatus;
import com.google.android.gms.games.service.PlayRoomAndroidService;
import com.google.android.gms.games.service.statemachine.MultiFileStateMachine;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomservice:
//            DefaultHandlerState, InRoomState, LeavingRoomState, LibrariesLoadedState, 
//            LibrariesUnloadedState, NetworkConnectedState, NetworkConnectingState, WaitNetworkDisconnectState

public final class RoomServiceStateMachine extends MultiFileStateMachine
{
    final class DcmCallbacks
        implements DataConnectionCallbacks
    {

        final RoomServiceStateMachine this$0;

        public final void onDataConnectionFailed(PeerConnectionInfo peerconnectioninfo)
        {
            sendMessage(new Messages.P2pConnectionFailedData(peerconnectioninfo));
        }

        public final void onDataConnectionSucceeded(PeerConnectionInfo peerconnectioninfo)
        {
            sendMessage(new Messages.P2pConnectionSucceededData(peerconnectioninfo));
        }

        public final void onNetworkDisconnected()
        {
            sendMessage(new Messages.NetworkDisconnectedData());
        }

        public final void onNetworkFailedForMatch()
        {
            sendMessage(new Messages.DcmConnectFailedData());
        }

        public final void onNetworkReadyForMatch(String s, int i)
        {
            sendMessage(new Messages.DcmConnectOkData(s, i));
        }

        public final void onReceiveBuzzNotification(String s, String s1)
        {
            if (RoomServiceStateMachine.DBG)
            {
                GamesLog.d("RoomServiceStateMachine", "ReceivedBuzzNotification");
            }
            s = (new JSONArray(s)).getString(0);
            if (RoomServiceStateMachine.DBG)
            {
                GamesLog.v("RoomServiceStateMachine", (new StringBuilder("Received notification ")).append(s).toString());
            }
            s1 = s1.substring(s1.indexOf("{"));
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_108;
            }
            boolean flag = "STATUS".equals(s);
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_143;
            }
            s = PlayRoomAndroidService.parseJsonRoomStatus(s1);
            GamesLog.d("RoomServiceStateMachine", s.toString());
            sendMessage(new Messages.StatusNotificationData(s));
            return;
            s;
            try
            {
                GamesLog.e("RoomServiceStateMachine", "MatchStatus parsing error for payload");
                throw new IllegalArgumentException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                GamesLog.e("RoomServiceStateMachine", "Json parsing error for payload");
            }
            throw new IllegalArgumentException(s);
            GamesLog.e("RoomServiceStateMachine", (new StringBuilder("Invalid notification type :")).append(s).toString());
            return;
        }

        public final void onReliableReceiveData(String s, byte abyte0[])
        {
            sendMessage(new Messages.MessageReceivedData(abyte0, s, 1));
        }

        public final void onReliableSendResult(int i, String s, boolean flag)
        {
            int j = 0;
            if (RoomServiceStateMachine.DBG)
            {
                GamesLog.pii("RoomServiceStateMachine", String.format("Message Send: to %s, result = %s, token = %s", new Object[] {
                    s, Boolean.valueOf(flag), Integer.valueOf(i)
                }));
            }
            if (!flag)
            {
                j = 7001;
            }
            sendMessage(new Messages.MessageSendResultData(i, j, s));
        }

        public final void onUnreliableReceiveData(String s, byte abyte0[])
        {
            sendMessage(new Messages.MessageReceivedData(abyte0, s, 0));
        }

        DcmCallbacks()
        {
            this$0 = RoomServiceStateMachine.this;
            super();
        }
    }

    final class StateData
    {

        protected Context mContext;
        protected DataConnectionManager mDataConnectionManager;
        protected final DcmCallbacks mDcmCallBacks;
        protected DcmFactory mDcmFactory;
        protected IRoomServiceCallbacks mRoomService;
        final RoomServiceStateMachine this$0;

        StateData()
        {
            this$0 = RoomServiceStateMachine.this;
            super();
            mDcmCallBacks = new DcmCallbacks();
        }
    }

    public static final class StateMachineErrorException extends RuntimeException
    {

        public StateMachineErrorException(IState istate, Message message, String s)
        {
            super((new StringBuilder("State: ")).append(istate.getName()).append(" msg ").append(message.what).append(" : ").append(s).toString());
        }
    }

    protected static final class States
    {

        protected DefaultHandlerState defaultHandlerState;
        protected InRoomState inRoomState;
        protected LeavingRoomState leavingRoomState;
        protected LibrariesLoadedState librariesLoadedState;
        protected LibrariesUnloadedState librariesUnloadedState;
        protected NetworkConnectedState networkConnectedState;
        protected NetworkConnectingState networkConnectingState;
        protected WaitNetworkDisconnectState waitNetworkDisconnectState;

        public final void populate(RoomServiceStateMachine roomservicestatemachine)
        {
            defaultHandlerState = new DefaultHandlerState(roomservicestatemachine);
            inRoomState = new InRoomState(roomservicestatemachine);
            leavingRoomState = new LeavingRoomState(roomservicestatemachine);
            librariesLoadedState = new LibrariesLoadedState(roomservicestatemachine);
            librariesUnloadedState = new LibrariesUnloadedState(roomservicestatemachine);
            networkConnectedState = new NetworkConnectedState(roomservicestatemachine);
            networkConnectingState = new NetworkConnectingState(roomservicestatemachine);
            waitNetworkDisconnectState = new WaitNetworkDisconnectState(roomservicestatemachine);
        }

        protected States()
        {
        }
    }


    protected static final boolean DBG;

    public RoomServiceStateMachine(IRoomServiceCallbacks iroomservicecallbacks, DcmFactory dcmfactory, boolean flag)
    {
        super("RoomServiceStateMachine");
        setWaitIdleNotificationEnabled(false);
        super.mData = new StateData();
        ((States)setupStates(new States())).populate(this);
        ((StateData)mData).mDcmFactory = dcmfactory;
        ((StateData)mData).mRoomService = iroomservicecallbacks;
        ((States)mStates).defaultHandlerState.addState();
        ((States)mStates).inRoomState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).leavingRoomState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).librariesLoadedState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).librariesUnloadedState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).networkConnectedState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).networkConnectingState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).waitNetworkDisconnectState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).librariesUnloadedState.setInitialState();
        char c;
        if (DBG)
        {
            c = '\u1000';
        } else
        {
            c = '\200';
        }
        setLogRecSize(c);
        setDbg(DBG);
    }

    static void handleRemoteRoomServiceException(RemoteException remoteexception)
    {
        Log.e("RoomServiceStateMachine", "Unable to communicate with GamesAndroidService -- exiting", remoteexception);
        System.exit(0);
    }

    protected final String getWhatToString(int i)
    {
        i;
        JVM INSTR tableswitch 0 20: default 100
    //                   0 228
    //                   1 222
    //                   2 108
    //                   3 114
    //                   4 126
    //                   5 132
    //                   6 138
    //                   7 144
    //                   8 150
    //                   9 156
    //                   10 162
    //                   11 168
    //                   12 174
    //                   13 180
    //                   14 186
    //                   15 192
    //                   16 198
    //                   17 204
    //                   18 216
    //                   19 210
    //                   20 120;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L2:
        break MISSING_BLOCK_LABEL_228;
_L1:
        String s = null;
_L23:
        if (s != null)
        {
            return s;
        } else
        {
            return super.getWhatToString(i);
        }
_L4:
        s = "NETWORK_DISCONNECTED";
          goto _L23
_L5:
        s = "LEAVE_ROOM";
          goto _L23
_L22:
        s = "DONE_LEAVING_ROOM";
          goto _L23
_L6:
        s = "ENTER_ROOM";
          goto _L23
_L7:
        s = "STATUS_NOTIFICATION";
          goto _L23
_L8:
        s = "PEER_JOINED";
          goto _L23
_L9:
        s = "P2P_CONNECTION_SUCCEEDED";
          goto _L23
_L10:
        s = "P2P_CONNECTION_FAILED";
          goto _L23
_L11:
        s = "MESSAGE_RECEIVED";
          goto _L23
_L12:
        s = "MESSAGE_SEND_RESULT";
          goto _L23
_L13:
        s = "SEND_RELIABLE_MESSAGE";
          goto _L23
_L14:
        s = "SEND_UNRELIABLE_MESSAGE";
          goto _L23
_L15:
        s = "P2P_STATUS_UPDATED";
          goto _L23
_L16:
        s = "CONNECT_NETWORK";
          goto _L23
_L17:
        s = "LOAD_LIBRARIES";
          goto _L23
_L18:
        s = "DCM_CONNECT_FAILED";
          goto _L23
_L19:
        s = "DCM_CONNECT_OK";
          goto _L23
_L21:
        s = "DISCONNECT_NETWORK";
          goto _L23
_L20:
        s = "UNLOAD_LIBRARIES";
          goto _L23
_L3:
        s = "CREATE_NATIVE_SOCKET_CONNECTION";
          goto _L23
        s = "CREATE_SOCKET_CONNECTION";
          goto _L23
    }

    protected final void leaveRoomWithoutDiagnostics()
    {
        try
        {
            ((StateData)mData).mRoomService.onRoomLeaveDiagnostics(null, new byte[0]);
            return;
        }
        catch (RemoteException remoteexception)
        {
            handleRemoteRoomServiceException(remoteexception);
        }
    }

    static 
    {
        DBG = ((Boolean)G.enableVerboseRealtimeMultiplayerLogging.getBinderSafe()).booleanValue();
    }
}
