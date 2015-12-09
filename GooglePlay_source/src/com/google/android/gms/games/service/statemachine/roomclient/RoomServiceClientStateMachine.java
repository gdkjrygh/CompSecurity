// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.IRoomService;
import com.google.android.gms.games.internal.IRoomServiceCallbacks;
import com.google.android.gms.games.service.ConnectNetworkAuthenticator;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.statemachine.IStateMachine;
import com.google.android.gms.games.service.statemachine.MessageTokenHelper;
import com.google.android.gms.games.service.statemachine.MultiFileStateMachine;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            CleanupBindingState, DefaultHandlerState, DisconnectedNetworkState, InRoomState, 
//            WaitLeaveDiagnosticsState, NetworkConnectedState, WaitOneupEnterRoomState, ServiceIpcState, 
//            ServiceSetupState, UnboundState, WaitConnectNetworkState, WaitDcmLoadLibrariesState, 
//            WaitForHttpLeaveState, WaitNetworkDisconnectState, WaitServiceConnectState, WaitServiceSetupState, 
//            WaitDcmEnterRoomState, RoomClientState, OneupRtmpCalls

public final class RoomServiceClientStateMachine extends MultiFileStateMachine
{
    protected static final class StateData
    {

        public ConnectNetworkAuthenticator mAuthenticator;
        public final AtomicInteger mMessageToken = new AtomicInteger();
        public OneupRtmpCalls mOneup;
        public IRoomService mRoomAndroidService;
        public IRoomServiceCallbacks roomServiceCallbacks;
        public UnboundState.RoomAndroidServiceConnection roomServiceConnection;
        public final MessageTokenHelper roomServiceGoneToken = new MessageTokenHelper();

        protected StateData()
        {
        }
    }

    protected static final class States
    {

        public CleanupBindingState cleanupBindingState;
        public DefaultHandlerState defaultHandlerState;
        public DisconnectedNetworkState disconnectedNetworkState;
        public InRoomState inRoomState;
        public NetworkConnectedState networkConnectedState;
        public ServiceIpcState serviceIpcState;
        public ServiceSetupState serviceSetupState;
        public UnboundState unboundState;
        public WaitConnectNetworkState waitConnectNetworkState;
        public WaitDcmEnterRoomState waitDcmEnterRoomState;
        public WaitDcmLoadLibrariesState waitDcmLoadLibrariesState;
        public WaitForHttpLeaveState waitForHttpLeaveState;
        public WaitLeaveDiagnosticsState waitLeaveDiagnosticsState;
        public WaitNetworkDisconnectState waitNetworkDisconnectState;
        public WaitOneupEnterRoomState waitOneupEnterRoomState;
        public WaitServiceConnectState waitServiceConnectState;
        public WaitServiceSetupState waitServiceSetupState;

        protected States()
        {
        }
    }


    protected static final boolean DBG;

    public RoomServiceClientStateMachine(OneupRtmpCalls oneuprtmpcalls, ConnectNetworkAuthenticator connectnetworkauthenticator, IRoomServiceCallbacks iroomservicecallbacks)
    {
        super("RoomServiceClientStateMachine");
        super.mData = new StateData();
        States states = (States)setupStates(new States());
        states.cleanupBindingState = new CleanupBindingState(this);
        states.defaultHandlerState = new DefaultHandlerState(this);
        states.disconnectedNetworkState = new DisconnectedNetworkState(this);
        states.inRoomState = new InRoomState(this);
        states.waitLeaveDiagnosticsState = new WaitLeaveDiagnosticsState(this);
        states.networkConnectedState = new NetworkConnectedState(this);
        states.waitOneupEnterRoomState = new WaitOneupEnterRoomState(this);
        states.serviceIpcState = new ServiceIpcState(this);
        states.serviceSetupState = new ServiceSetupState(this);
        states.unboundState = new UnboundState(this);
        states.waitConnectNetworkState = new WaitConnectNetworkState(this);
        states.waitDcmLoadLibrariesState = new WaitDcmLoadLibrariesState(this);
        states.waitForHttpLeaveState = new WaitForHttpLeaveState(this);
        states.waitNetworkDisconnectState = new WaitNetworkDisconnectState(this);
        states.waitServiceConnectState = new WaitServiceConnectState(this);
        states.waitServiceSetupState = new WaitServiceSetupState(this);
        states.waitDcmEnterRoomState = new WaitDcmEnterRoomState(this);
        ((StateData)mData).mAuthenticator = connectnetworkauthenticator;
        ((StateData)mData).mOneup = oneuprtmpcalls;
        ((StateData)mData).roomServiceCallbacks = iroomservicecallbacks;
        setDbg(DBG);
        char c;
        if (DBG)
        {
            c = '\u1000';
        } else
        {
            c = '\200';
        }
        setLogRecSize(c);
        ((States)mStates).defaultHandlerState.addState();
        ((States)mStates).cleanupBindingState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).disconnectedNetworkState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).inRoomState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).waitLeaveDiagnosticsState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).networkConnectedState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).waitOneupEnterRoomState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).serviceIpcState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).serviceSetupState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).unboundState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).waitConnectNetworkState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).waitDcmLoadLibrariesState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).waitForHttpLeaveState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).waitNetworkDisconnectState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).waitServiceConnectState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).waitServiceSetupState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).waitDcmEnterRoomState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).unboundState.setInitialState();
    }

    protected static void handleGameRemoteFailure(RemoteException remoteexception)
    {
        Log.e("RoomServiceClientStateMachine", "Unable to communicate with Game", remoteexception);
    }

    protected static void handleOnRoomLeft(RoomClientState roomclientstate, Message message)
    {
        message = (Messages.OnRoomLeftData)message.obj;
        IRoomService iroomservice = roomclientstate.mData.mRoomAndroidService;
        boolean flag;
        if (((Messages.OnRoomLeftData) (message)).status == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            iroomservice.doneLeavingRoom(flag);
        }
        catch (RemoteException remoteexception)
        {
            roomclientstate.handleRasFailure(remoteexception);
        }
        try
        {
            if (((Messages.OnRoomLeftData) (message)).callbacks != null)
            {
                ((Messages.OnRoomLeftData) (message)).callbacks.onLeftRoom(((Messages.OnRoomLeftData) (message)).status, ((Messages.OnRoomLeftData) (message)).roomId);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RoomClientState roomclientstate)
        {
            handleGameRemoteFailure(roomclientstate);
        }
        return;
    }

    protected final String getWhatToString(int i)
    {
        i;
        JVM INSTR tableswitch 1 49: default 212
    //                   1 283
    //                   2 290
    //                   3 297
    //                   4 304
    //                   5 311
    //                   6 318
    //                   7 325
    //                   8 332
    //                   9 339
    //                   10 346
    //                   11 353
    //                   12 360
    //                   13 367
    //                   14 381
    //                   15 388
    //                   16 542
    //                   17 395
    //                   18 402
    //                   19 409
    //                   20 416
    //                   21 423
    //                   22 430
    //                   23 437
    //                   24 451
    //                   25 374
    //                   26 444
    //                   27 472
    //                   28 479
    //                   29 220
    //                   30 535
    //                   31 227
    //                   32 234
    //                   33 241
    //                   34 248
    //                   35 255
    //                   36 262
    //                   37 269
    //                   38 276
    //                   39 458
    //                   40 465
    //                   41 486
    //                   42 493
    //                   43 500
    //                   44 507
    //                   45 514
    //                   46 521
    //                   47 528
    //                   48 549
    //                   49 556;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47 _L48 _L49 _L50
_L50:
        break MISSING_BLOCK_LABEL_556;
_L1:
        String s = null;
_L51:
        if (s != null)
        {
            return s;
        } else
        {
            return super.getWhatToString(i);
        }
_L30:
        s = "ENTER_ROOM";
          goto _L51
_L32:
        s = "ON_SENT_RELIABLE_MESSAGE";
          goto _L51
_L33:
        s = "ON_REAL_TIME_MESSAGE_RECEIVED";
          goto _L51
_L34:
        s = "ON_ROOM_CONNECTING";
          goto _L51
_L35:
        s = "ON_ROOM_AUTO_MATCHING";
          goto _L51
_L36:
        s = "ON_ROOM_CONNECTED";
          goto _L51
_L37:
        s = "ON_CONNECTED_TO_ROOM";
          goto _L51
_L38:
        s = "ON_DISCONNECTED_FROM_ROOM";
          goto _L51
_L39:
        s = "ON_PEER_INVITED_TO_ROOM";
          goto _L51
_L2:
        s = "ON_PEER_JOINED_ROOM";
          goto _L51
_L3:
        s = "ON_PEER_LEFT_ROOM";
          goto _L51
_L4:
        s = "ON_PEER_DECLINED";
          goto _L51
_L5:
        s = "ON_PEER_CONNECTED";
          goto _L51
_L6:
        s = "ON_PEER_DISCONNECTED";
          goto _L51
_L7:
        s = "ON_P2P_CONNECTED";
          goto _L51
_L8:
        s = "ON_P2P_DISCONNECTED";
          goto _L51
_L9:
        s = "ON_ROOM_TORN_DOWN";
          goto _L51
_L10:
        s = "REPORT_P2P_STATUS";
          goto _L51
_L11:
        s = "ON_ROOM_LEAVE_DIAGNOSTICS";
          goto _L51
_L12:
        s = "DATA_MANAGER_UPDATE_ROOM";
          goto _L51
_L13:
        s = "SERVICE_CONNECTED";
          goto _L51
_L14:
        s = "ROOM_SERVICE_GONE";
          goto _L51
_L26:
        s = "ON_DCM_INIT";
          goto _L51
_L15:
        s = "DONE_CLEANING";
          goto _L51
_L16:
        s = "ON_ROOM_ENTERED";
          goto _L51
_L18:
        s = "SEND_RELIABLE_MESSAGE";
          goto _L51
_L19:
        s = "SEND_UNRELIABLE_MESSAGE";
          goto _L51
_L20:
        s = "CREATE_SOCKET_CONNECTION";
          goto _L51
_L21:
        s = "CREATE_NATIVE_SOCKET";
          goto _L51
_L22:
        s = "REGISTER_WAITING_ROOM_LISTENER_RESTRICTED";
          goto _L51
_L23:
        s = "UNREGISTER_WAITING_ROOM_LISTENER_RESTRICTED";
          goto _L51
_L24:
        s = "ON_SIGN_OUT";
          goto _L51
_L27:
        s = "LEAVE_ROOM";
          goto _L51
_L25:
        s = "CONNECT_NETWORK_ON_CONNECTED";
          goto _L51
_L40:
        s = "ON_NETWORK_DISCONNECTED";
          goto _L51
_L41:
        s = "CLEANUP_LIB_JINGLE_TIMER";
          goto _L51
_L28:
        s = "SETUP_DONE";
          goto _L51
_L29:
        s = "ON_CLIENT_DISCONNECTING";
          goto _L51
_L42:
        s = "DISCONNECT_NETWORK";
          goto _L51
_L43:
        s = "CLEANUP_LIB_JINGLE";
          goto _L51
_L44:
        s = "GAME_DEATH_BINDER_DIED";
          goto _L51
_L45:
        s = "ON_CREATE_NATIVE_LIBJINGLE_SOCKET";
          goto _L51
_L46:
        s = "ON_CREATE_SOCKET_CONNECTION";
          goto _L51
_L47:
        s = "ON_ROOM_LEFT";
          goto _L51
_L48:
        s = "ON_P2P_STATUS_REPORTED";
          goto _L51
_L31:
        s = "DISCONNECT_NETWORK_TIMER";
          goto _L51
_L17:
        s = "CLIENT_LEAVE_ROOM";
          goto _L51
_L49:
        s = "LIBJINGLE_FAIL_TIMER";
          goto _L51
        s = "ON_DCM_ROOM_ENTER_RESULT";
          goto _L51
    }

    protected final void handleRasFailure(RemoteException remoteexception)
    {
        Log.e("RoomServiceClientStateMachine", "Unable to communicate with RAS", remoteexception);
        mStateMachine.sendMessageAtFrontOfQueue(new Messages.RoomServiceGoneData(((StateData)mData).roomServiceGoneToken.getToken()));
        try
        {
            ((StateData)mData).mRoomAndroidService.kill("Room service gone");
            Log.e("RoomServiceClientStateMachine", "Killed RAS", remoteexception);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RemoteException remoteexception)
        {
            Log.i("RoomServiceClientStateMachine", "Unable to kill RAS (may already be dead)", remoteexception);
        }
    }

    static 
    {
        DBG = ((Boolean)G.enableVerboseRealtimeMultiplayerLogging.getBinderSafe()).booleanValue();
    }
}
