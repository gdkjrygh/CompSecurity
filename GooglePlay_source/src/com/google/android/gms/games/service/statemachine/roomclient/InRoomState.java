// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.content.Context;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.response.FastParser;
import com.google.android.gms.games.broker.MultiplayerUtils;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.ConnectionInfo;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.internal.IRoomService;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomBuffer;
import com.google.android.gms.games.server.api.RoomP2PStatus;
import com.google.android.gms.games.server.api.RoomStatus;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.statemachine.IStateMachine;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            RoomClientState, RtmpSessionLog, WaitLeaveDiagnosticsState, OneupRtmpCalls, 
//            RoomServiceClientStateMachine

final class InRoomState extends RoomClientState
{
    public final class DeathSender
        implements android.os.IBinder.DeathRecipient
    {

        final IBinder mRealTimeGameDeathBinder;
        boolean mRegistered;
        private final String mRoomId;
        final InRoomState this$0;

        public final void binderDied()
        {
            GamesLog.w("RoomServiceClientStateMachine", "The game process died without disconnecting the games client.");
            mSm.sendMessage(new Messages.GameDeathBinderDiedData(mRoomId));
        }

        public DeathSender(String s, IBinder ibinder)
        {
            this$0 = InRoomState.this;
            super();
            mRegistered = false;
            mRealTimeGameDeathBinder = ibinder;
            mRoomId = s;
            try
            {
                mRealTimeGameDeathBinder.linkToDeath(this, 0);
                mRegistered = true;
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("RoomServiceClientStateMachine", "When registering for game death binder", s);
            }
            mSm.sendMessage(new Messages.GameDeathBinderDiedData(mRoomId));
        }
    }

    static interface LogCallBack
    {

        public abstract void run(Room room);
    }

    static interface RoomCallBack
    {

        public abstract void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks)
            throws RemoteException;
    }

    public final class RoomCallbacksHelper
    {

        List cbList;
        String mCurrentRoomId;
        OneCallback mGamesCallBack;
        final LogCallBack mLogPeerCounts = new _cls1();
        OneCallback mWaitingRoomCb;
        final InRoomState this$0;

        static void logEx(String s, RemoteException remoteexception)
        {
            Log.e("RoomServiceClientStateMachine", (new StringBuilder("RoomCallbacksHelper.")).append(s).toString(), remoteexception);
        }

        public final void clear()
        {
            cbList.clear();
        }

        final void onRoomCallback(String s, String s1, RoomCallBack roomcallback, LogCallBack logcallback)
        {
            boolean flag;
            if (TextUtils.equals(s1, mCurrentRoomId))
            {
                flag = true;
            } else
            {
                mSm.logNote((new StringBuilder("Current room is ")).append(mCurrentRoomId).append(" but got a message for ").append(s1).append(" in ").append(s).toString());
                flag = false;
            }
            if (!flag)
            {
                return;
            }
            s1 = mRealTimeDataManager.getRoom(s1);
            if (logcallback != null)
            {
                RoomBuffer roombuffer = new RoomBuffer(s1);
                if (roombuffer.getCount() > 0)
                {
                    logcallback.run((Room)roombuffer.get(0));
                }
            }
            logcallback = cbList.iterator();
_L1:
            OneCallback onecallback;
            if (!logcallback.hasNext())
            {
                break MISSING_BLOCK_LABEL_192;
            }
            onecallback = (OneCallback)logcallback.next();
            roomcallback.run(s1, onecallback.mCallbacks);
              goto _L1
            RemoteException remoteexception;
            remoteexception;
            logEx(s, remoteexception);
              goto _L1
            s;
            s1.close();
            throw s;
            s1.close();
            return;
        }

        final void updateCbList()
        {
            cbList.clear();
            if (mWaitingRoomCb != null)
            {
                cbList.add(mWaitingRoomCb);
            }
            if (mGamesCallBack != null)
            {
                cbList.add(mGamesCallBack);
            }
        }

        public RoomCallbacksHelper()
        {
            this$0 = InRoomState.this;
            super();
            mCurrentRoomId = "";
            cbList = new ArrayList();
        }
    }

    final class RoomCallbacksHelper.OneCallback
    {

        public final WrappedGamesCallbacks mCallbacks;
        public final String mOwner;
        final RoomCallbacksHelper this$1;

        public RoomCallbacksHelper.OneCallback(WrappedGamesCallbacks wrappedgamescallbacks, String s)
        {
            this$1 = RoomCallbacksHelper.this;
            super();
            mCallbacks = wrappedgamescallbacks;
            mOwner = s;
        }
    }


    final RoomCallbacksHelper mCallBacksHelper = new RoomCallbacksHelper();
    ConnectionInfo mConnectionInfo;
    Context mContext;
    DeathSender mDeathSender;
    private final Hashtable mOutstandingCreateNativeSocket = new Hashtable();
    private final Hashtable mOutstandingCreateSocket = new Hashtable();
    private final Hashtable mOutstandingReliableMessages = new Hashtable();
    NetworkConnectedState.RealTimeDataManager mRealTimeDataManager;
    ClientContext mRoomCreatorClientContext;
    long mRoomCreatorClientId;
    RtmpSessionLog mSessionLog;
    private int mSocketToken;

    public InRoomState(RoomServiceClientStateMachine roomserviceclientstatemachine)
    {
        super(roomserviceclientstatemachine);
        mSocketToken = 0;
    }

    private Messages.LeaveRoomData generateLeaveOnBehalfOfClient(Context context, ClientContext clientcontext)
    {
        context = new Messages.LeaveRoomData(new Messages.ClientLeaveRoomData(context, clientcontext, null, mCallBacksHelper.mCurrentRoomId), mRoomCreatorClientId, mRoomCreatorClientContext, mConnectionInfo);
        try
        {
            mData.mRoomAndroidService.leaveRoom();
        }
        // Misplaced declaration of an exception variable
        catch (ClientContext clientcontext)
        {
            handleRasFailure(clientcontext);
            return context;
        }
        return context;
    }

    private void transitionToLeavingState(Messages.LeaveRoomData leaveroomdata, boolean flag, int i)
    {
        WaitLeaveDiagnosticsState waitleavediagnosticsstate;
        mSessionLog.onLeavingRoom(i);
        waitleavediagnosticsstate = mStates.waitLeaveDiagnosticsState;
        i;
        JVM INSTR tableswitch 1 8: default 64
    //                   1 116
    //                   2 123
    //                   3 130
    //                   4 137
    //                   5 144
    //                   6 151
    //                   7 158
    //                   8 165;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        String s = "PLAYER_LEFT";
_L11:
        waitleavediagnosticsstate.transitionTo(s, leaveroomdata, mSessionLog);
        if (flag || !((Boolean)G.rtmpReuseXmppConnections.get()).booleanValue())
        {
            mSm.sendMessageAtFrontOfQueue(new Messages.DisconnectNetworkData());
        }
        return;
_L2:
        s = "PLAYER_LEFT";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "REALTIME_SERVER_CONNECTION_FAILURE";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "REALTIME_CLIENT_DISCONNECTING";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "REALTIME_SIGN_OUT";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "REALTIME_GAME_CRASHED";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "REALTIME_ROOM_SERVICE_CRASHED";
        continue; /* Loop/switch isn't completed */
_L8:
        s = "REALTIME_DIFFERENT_CLIENT_ROOM_OPERATION";
        continue; /* Loop/switch isn't completed */
_L9:
        s = "REALTIME_SAME_CLIENT_ROOM_OPERATION";
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final void enter()
    {
        mData.mMessageToken.set(0);
    }

    public final void exit()
    {
        for (Iterator iterator = mOutstandingCreateSocket.values().iterator(); iterator.hasNext(); ((Messages.CreateSocketConnectionData)iterator.next()).setResult(null)) { }
        mOutstandingCreateSocket.clear();
        for (Iterator iterator1 = mOutstandingCreateNativeSocket.values().iterator(); iterator1.hasNext(); ((Messages.CreateNativeSocketData)iterator1.next()).setResult(null)) { }
        mOutstandingCreateNativeSocket.clear();
        mOutstandingReliableMessages.clear();
        DeathSender deathsender = mDeathSender;
        if (deathsender.mRegistered)
        {
            deathsender.mRealTimeGameDeathBinder.unlinkToDeath(deathsender, 0);
            deathsender.mRegistered = false;
        }
        mCallBacksHelper.clear();
    }

    public final boolean processMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 47: default 208
    //                   1 407
    //                   2 847
    //                   3 448
    //                   4 730
    //                   5 888
    //                   6 606
    //                   7 524
    //                   8 208
    //                   9 1831
    //                   10 2244
    //                   11 2148
    //                   12 208
    //                   13 1196
    //                   14 208
    //                   15 208
    //                   16 1333
    //                   17 1585
    //                   18 1484
    //                   19 2360
    //                   20 2272
    //                   21 210
    //                   22 327
    //                   23 1068
    //                   24 208
    //                   25 208
    //                   26 1317
    //                   27 208
    //                   28 1026
    //                   29 1245
    //                   30 208
    //                   31 1736
    //                   32 929
    //                   33 489
    //                   34 208
    //                   35 771
    //                   36 688
    //                   37 809
    //                   38 208
    //                   39 2258
    //                   40 208
    //                   41 208
    //                   42 208
    //                   43 1112
    //                   44 2448
    //                   45 2490
    //                   46 208
    //                   47 1970;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L1 _L9 _L10 _L11 _L1 _L12 _L1 _L1 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L1 _L1 _L21 _L1 _L22 _L23 _L1 _L24 _L25 _L26 _L1 _L27 _L28 _L29 _L1 _L30 _L1 _L1 _L1 _L31 _L32 _L33 _L1 _L34
_L1:
        return false;
_L18:
        message = (Messages.RegisterWaitingRoomListenerRestrictedData)message.obj;
        if (TextUtils.equals(mCallBacksHelper.mCurrentRoomId, ((Messages.RegisterWaitingRoomListenerRestrictedData) (message)).externalRoomId))
        {
            RoomCallbacksHelper roomcallbackshelper = mCallBacksHelper;
            roomcallbackshelper.mWaitingRoomCb = roomcallbackshelper. new RoomCallbacksHelper.OneCallback(((Messages.RegisterWaitingRoomListenerRestrictedData) (message)).callbacks, "mWaitingRoomCb");
            roomcallbackshelper.updateCbList();
            message.setResult(mRealTimeDataManager.getRoom(((Messages.RegisterWaitingRoomListenerRestrictedData) (message)).externalRoomId));
        } else
        {
            message.setResult(DataHolder.empty(1));
            Log.e("RoomServiceClientStateMachine", String.format("REGISTER_WAITING_ROOM_LISTENER_RESTRICTED for room {0} not the active room {1}", new Object[] {
                ((Messages.RegisterWaitingRoomListenerRestrictedData) (message)).externalRoomId, mCallBacksHelper.mCurrentRoomId
            }));
        }
        return HANDLED;
_L19:
        message = (Messages.UnregisterWaitingRoomListenerRestrictedData)message.obj;
        if (TextUtils.equals(mCallBacksHelper.mCurrentRoomId, ((Messages.UnregisterWaitingRoomListenerRestrictedData) (message)).externalRoomId))
        {
            message = mCallBacksHelper;
            message.mWaitingRoomCb = null;
            message.updateCbList();
        } else
        {
            Log.e("RoomServiceClientStateMachine", String.format("UNREGISTER_WAITING_ROOM_LISTENER_RESTRICTED for room {0} not the active room {1}", new Object[] {
                ((Messages.UnregisterWaitingRoomListenerRestrictedData) (message)).externalRoomId, mCallBacksHelper.mCurrentRoomId
            }));
        }
        return HANDLED;
_L2:
        final RoomCallbacksHelper final_roomcallbackshelper = mCallBacksHelper;
        message = (Messages.OnPeerJoinedRoomData)message.obj;
        final_roomcallbackshelper.onRoomCallback("onPeerJoinedRoom", ((Messages.OnPeerJoinedRoomData) (message)).roomId, message. new RoomCallBack() {

            final RoomCallbacksHelper this$1;
            final Messages.OnPeerJoinedRoomData val$data;

            public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks1)
                throws RemoteException
            {
                String as[] = data.participantIds;
                wrappedgamescallbacks1.audit(new DataHolder[] {
                    dataholder
                });
                wrappedgamescallbacks1.mCallbacks.onPeerJoinedRoom(dataholder, as);
            }

            
            {
                this$1 = final_roomcallbackshelper;
                data = Messages.OnPeerJoinedRoomData.this;
                super();
            }
        }, final_roomcallbackshelper.mLogPeerCounts);
        return HANDLED;
_L4:
        final RoomCallbacksHelper final_roomcallbackshelper = mCallBacksHelper;
        message = (Messages.OnPeerDeclinedData)message.obj;
        final_roomcallbackshelper.onRoomCallback("onPeerDeclined", ((Messages.OnPeerDeclinedData) (message)).roomId, message. new RoomCallBack() {

            final RoomCallbacksHelper this$1;
            final Messages.OnPeerDeclinedData val$data;

            public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks1)
                throws RemoteException
            {
                String as[] = data.participantIds;
                wrappedgamescallbacks1.audit(new DataHolder[] {
                    dataholder
                });
                wrappedgamescallbacks1.mCallbacks.onPeerDeclined(dataholder, as);
            }

            
            {
                this$1 = final_roomcallbackshelper;
                data = Messages.OnPeerDeclinedData.this;
                super();
            }
        }, final_roomcallbackshelper.mLogPeerCounts);
        return HANDLED;
_L26:
        RoomCallbacksHelper roomcallbackshelper1 = mCallBacksHelper;
        roomcallbackshelper1.onRoomCallback("onRoomConnecting", ((Messages.OnRoomConnectingData)message.obj).roomId, roomcallbackshelper1. new RoomCallBack() {

            final RoomCallbacksHelper this$1;

            public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks1)
                throws RemoteException
            {
                wrappedgamescallbacks1.audit(new DataHolder[] {
                    dataholder
                });
                wrappedgamescallbacks1.mCallbacks.onRoomConnecting(dataholder);
            }

            
            {
                this$1 = RoomCallbacksHelper.this;
                super();
            }
        }, null);
        return HANDLED;
_L8:
        Object obj = mCallBacksHelper;
        message = (Messages.OnP2PDisconnectedData)message.obj;
        for (obj = ((RoomCallbacksHelper) (obj)).cbList.iterator(); ((Iterator) (obj)).hasNext();)
        {
            Object obj5 = (RoomCallbacksHelper.OneCallback)((Iterator) (obj)).next();
            try
            {
                obj5 = ((RoomCallbacksHelper.OneCallback) (obj5)).mCallbacks;
                String s = ((Messages.OnP2PDisconnectedData) (message)).participantId;
                ((WrappedGamesCallbacks) (obj5)).mCallbacks.onP2PDisconnected(s);
            }
            catch (RemoteException remoteexception2)
            {
                RoomCallbacksHelper.logEx("onP2pDisconnected", remoteexception2);
            }
        }

        return HANDLED;
_L7:
        Object obj1 = mCallBacksHelper;
        message = (Messages.OnP2PConnectedData)message.obj;
        for (obj1 = ((RoomCallbacksHelper) (obj1)).cbList.iterator(); ((Iterator) (obj1)).hasNext();)
        {
            Object obj6 = (RoomCallbacksHelper.OneCallback)((Iterator) (obj1)).next();
            try
            {
                obj6 = ((RoomCallbacksHelper.OneCallback) (obj6)).mCallbacks;
                String s1 = ((Messages.OnP2PConnectedData) (message)).participantId;
                ((WrappedGamesCallbacks) (obj6)).mCallbacks.onP2PConnected(s1);
            }
            catch (RemoteException remoteexception3)
            {
                RoomCallbacksHelper.logEx("onP2pConnected", remoteexception3);
            }
        }

        return HANDLED;
_L28:
        RoomCallbacksHelper roomcallbackshelper2 = mCallBacksHelper;
        roomcallbackshelper2.onRoomCallback("onConnectedToRoom", ((Messages.OnConnectedToRoomData)message.obj).roomId, roomcallbackshelper2. new RoomCallBack() {

            final RoomCallbacksHelper this$1;

            public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks1)
                throws RemoteException
            {
                wrappedgamescallbacks1.audit(new DataHolder[] {
                    dataholder
                });
                wrappedgamescallbacks1.mCallbacks.onConnectedToRoom(dataholder);
            }

            
            {
                this$1 = RoomCallbacksHelper.this;
                super();
            }
        }, roomcallbackshelper2. new LogCallBack() {

            final RoomCallbacksHelper this$1;

            public final void run(Room room)
            {
                RtmpSessionLog rtmpsessionlog = mSessionLog;
                if (rtmpsessionlog.mLog.peerConnectTimeMs == 0L)
                {
                    rtmpsessionlog.mLog.peerConnectTimeMs = rtmpsessionlog.deltaNow();
                }
                mLogPeerCounts.run(room);
            }

            
            {
                this$1 = RoomCallbacksHelper.this;
                super();
            }
        });
        return HANDLED;
_L5:
        final RoomCallbacksHelper final_roomcallbackshelper = mCallBacksHelper;
        message = (Messages.OnPeerConnectedData)message.obj;
        final_roomcallbackshelper.onRoomCallback("onPeerConnected", ((Messages.OnPeerConnectedData) (message)).roomId, message. new RoomCallBack() {

            final RoomCallbacksHelper this$1;
            final Messages.OnPeerConnectedData val$data;

            public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks1)
                throws RemoteException
            {
                String as[] = data.participantIds;
                wrappedgamescallbacks1.audit(new DataHolder[] {
                    dataholder
                });
                wrappedgamescallbacks1.mCallbacks.onPeerConnected(dataholder, as);
            }

            
            {
                this$1 = final_roomcallbackshelper;
                data = Messages.OnPeerConnectedData.this;
                super();
            }
        }, final_roomcallbackshelper.mLogPeerCounts);
        return HANDLED;
_L27:
        RoomCallbacksHelper roomcallbackshelper3 = mCallBacksHelper;
        roomcallbackshelper3.onRoomCallback("onRoomConnected", ((Messages.OnRoomConnectedData)message.obj).roomId, roomcallbackshelper3. new RoomCallBack() {

            final RoomCallbacksHelper this$1;

            public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks1)
                throws RemoteException
            {
                wrappedgamescallbacks1.audit(new DataHolder[] {
                    dataholder
                });
                wrappedgamescallbacks1.mCallbacks.onRoomConnected(dataholder);
            }

            
            {
                this$1 = RoomCallbacksHelper.this;
                super();
            }
        }, roomcallbackshelper3.mLogPeerCounts);
        return HANDLED;
_L29:
        RoomCallbacksHelper roomcallbackshelper4 = mCallBacksHelper;
        roomcallbackshelper4.onRoomCallback("onDisconnectedFromRoom", ((Messages.OnDisconnectedFromRoomData)message.obj).roomId, roomcallbackshelper4. new RoomCallBack() {

            final RoomCallbacksHelper this$1;

            public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks1)
                throws RemoteException
            {
                wrappedgamescallbacks1.audit(new DataHolder[] {
                    dataholder
                });
                wrappedgamescallbacks1.mCallbacks.onDisconnectedFromRoom(dataholder);
            }

            
            {
                this$1 = RoomCallbacksHelper.this;
                super();
            }
        }, roomcallbackshelper4.mLogPeerCounts);
        return HANDLED;
_L3:
        final RoomCallbacksHelper final_roomcallbackshelper = mCallBacksHelper;
        message = (Messages.OnPeerLeftRoomData)message.obj;
        final_roomcallbackshelper.onRoomCallback("onPeerLeftRoom", ((Messages.OnPeerLeftRoomData) (message)).roomId, message. new RoomCallBack() {

            final RoomCallbacksHelper this$1;
            final Messages.OnPeerLeftRoomData val$data;

            public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks1)
                throws RemoteException
            {
                String as[] = data.participantIds;
                wrappedgamescallbacks1.audit(new DataHolder[] {
                    dataholder
                });
                wrappedgamescallbacks1.mCallbacks.onPeerLeftRoom(dataholder, as);
            }

            
            {
                this$1 = final_roomcallbackshelper;
                data = Messages.OnPeerLeftRoomData.this;
                super();
            }
        }, final_roomcallbackshelper.mLogPeerCounts);
        return HANDLED;
_L6:
        final RoomCallbacksHelper final_roomcallbackshelper = mCallBacksHelper;
        message = (Messages.OnPeerDisconnectedData)message.obj;
        final_roomcallbackshelper.onRoomCallback("onPeerDisconnected", ((Messages.OnPeerDisconnectedData) (message)).roomId, message. new RoomCallBack() {

            final RoomCallbacksHelper this$1;
            final Messages.OnPeerDisconnectedData val$data;

            public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks1)
                throws RemoteException
            {
                String as[] = data.participantIds;
                wrappedgamescallbacks1.audit(new DataHolder[] {
                    dataholder
                });
                wrappedgamescallbacks1.mCallbacks.onPeerDisconnected(dataholder, as);
            }

            
            {
                this$1 = final_roomcallbackshelper;
                data = Messages.OnPeerDisconnectedData.this;
                super();
            }
        }, final_roomcallbackshelper.mLogPeerCounts);
        return HANDLED;
_L25:
        Object obj2 = mCallBacksHelper;
        message = (Messages.OnRealTimeMessageReceivedData)message.obj;
        for (obj2 = ((RoomCallbacksHelper) (obj2)).cbList.iterator(); ((Iterator) (obj2)).hasNext();)
        {
            Object obj7 = (RoomCallbacksHelper.OneCallback)((Iterator) (obj2)).next();
            try
            {
                obj7 = ((RoomCallbacksHelper.OneCallback) (obj7)).mCallbacks;
                RealTimeMessage realtimemessage = new RealTimeMessage(((Messages.OnRealTimeMessageReceivedData) (message)).fromId, ((Messages.OnRealTimeMessageReceivedData) (message)).messageData, ((Messages.OnRealTimeMessageReceivedData) (message)).reliable);
                ((WrappedGamesCallbacks) (obj7)).mCallbacks.onRealTimeMessageReceived(realtimemessage);
            }
            catch (RemoteException remoteexception4)
            {
                RoomCallbacksHelper.logEx("onRealtimeMessageRecieved", remoteexception4);
            }
        }

        return HANDLED;
_L22:
        message = (Messages.OnClientDisconnectingData)message.obj;
        if (mRoomCreatorClientId == ((Messages.OnClientDisconnectingData) (message)).clientId)
        {
            transitionToLeavingState(generateLeaveOnBehalfOfClient(((Messages.OnClientDisconnectingData) (message)).context, ((Messages.OnClientDisconnectingData) (message)).clientContext), true, 3);
        }
        return HANDLED;
_L20:
        message = (Messages.OnSignOutData)message.obj;
        if (((Messages.OnSignOutData) (message)).clientContext.equals(mRoomCreatorClientContext))
        {
            transitionToLeavingState(generateLeaveOnBehalfOfClient(((Messages.OnSignOutData) (message)).context, ((Messages.OnSignOutData) (message)).clientContext), true, 4);
        }
        return HANDLED;
_L31:
        message = (Messages.GameDeathBinderDiedData)message.obj;
        if (TextUtils.equals(mCallBacksHelper.mCurrentRoomId, ((Messages.GameDeathBinderDiedData) (message)).roomId))
        {
            transitionToLeavingState(generateLeaveOnBehalfOfClient(mContext, mRoomCreatorClientContext), true, 5);
        } else
        {
            Log.e("RoomServiceClientStateMachine", String.format("GAME_DEATH_BINDER_DIED for room {0} not the active room {1}", new Object[] {
                ((Messages.GameDeathBinderDiedData) (message)).roomId, mCallBacksHelper.mCurrentRoomId
            }));
        }
        return HANDLED;
_L12:
        if (((Messages.RoomServiceGoneData)message.obj).validToken.isValid())
        {
            transitionToLeavingState(generateLeaveOnBehalfOfClient(mContext, mRoomCreatorClientContext), true, 6);
            mSm.deferMessage(message);
        }
        return HANDLED;
_L23:
        Messages.EnterRoomData enterroomdata = (Messages.EnterRoomData)message.obj;
        enterroomdata.sessionLog.processedInState(3);
        mSm.deferMessage(message);
        byte byte0;
        if (enterroomdata.clientId != mRoomCreatorClientId)
        {
            byte0 = 7;
        } else
        {
            byte0 = 8;
        }
        transitionToLeavingState(generateLeaveOnBehalfOfClient(mContext, mRoomCreatorClientContext), false, byte0);
        return HANDLED;
_L21:
        mSm.logNote("We shouldn't be able to get LEAVE_ROOM in InRoomState");
        return HANDLED;
_L13:
        message = (Messages.ClientLeaveRoomData)message.obj;
        if (!TextUtils.equals(((Messages.ClientLeaveRoomData) (message)).externalRoomId, mCallBacksHelper.mCurrentRoomId))
        {
            Log.e("RoomServiceClientStateMachine", String.format("InRoomState: LEAVE_ROOM - Sending to room {0} while in room {1} ", new Object[] {
                ((Messages.ClientLeaveRoomData) (message)).externalRoomId, mCallBacksHelper.mCurrentRoomId
            }));
            try
            {
                if (((Messages.ClientLeaveRoomData) (message)).callbacks != null)
                {
                    ((Messages.ClientLeaveRoomData) (message)).callbacks.onLeftRoom(6004, ((Messages.ClientLeaveRoomData) (message)).externalRoomId);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                Log.e("RoomServiceClientStateMachine", "InRoomState: LEAVE_ROOM", message);
            }
        } else
        {
            message = new Messages.LeaveRoomData(message, mRoomCreatorClientId, mRoomCreatorClientContext, mConnectionInfo);
            try
            {
                mData.mRoomAndroidService.leaveRoom();
                transitionToLeavingState(message, false, 1);
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                handleRasFailure(message);
            }
        }
        return HANDLED;
_L15:
        message = (Messages.SendUnreliableMessageData)message.obj;
        if (!TextUtils.equals(((Messages.SendUnreliableMessageData) (message)).roomId, mCallBacksHelper.mCurrentRoomId))
        {
            Log.e("RoomServiceClientStateMachine", String.format("InRoomState: SEND_UNRELIABLE_MESSAGE - Sending to room {0} while in room {1} ", new Object[] {
                ((Messages.SendUnreliableMessageData) (message)).roomId, mCallBacksHelper.mCurrentRoomId
            }));
        } else
        {
            try
            {
                mData.mRoomAndroidService.sendUnreliableMessage(((Messages.SendUnreliableMessageData) (message)).messageData, ((Messages.SendUnreliableMessageData) (message)).recipientParticipantIds);
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                Log.e("RoomServiceClientStateMachine", "InRoomState: SEND_UNRELIABLE_MESSAGE", message);
            }
        }
        return HANDLED;
_L14:
        message = (Messages.SendReliableMessageData)message.obj;
        if (!TextUtils.equals(((Messages.SendReliableMessageData) (message)).roomId, mCallBacksHelper.mCurrentRoomId))
        {
            Log.e("RoomServiceClientStateMachine", String.format("InRoomState: SEND_UNRELIABLE_MESSAGE - Sending to room {0} while in room {1} ", new Object[] {
                ((Messages.SendReliableMessageData) (message)).roomId, mCallBacksHelper.mCurrentRoomId
            }));
            try
            {
                ((Messages.SendReliableMessageData) (message)).callbacks.onMessageSent(6004, ((Messages.SendReliableMessageData) (message)).mToken, ((Messages.SendReliableMessageData) (message)).recipientParticipantIds);
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                Log.e("RoomServiceClientStateMachine", "InRoomState: SEND_RELIABLE_MESSAGE", message);
            }
        } else
        {
            try
            {
                mData.mRoomAndroidService.sendReliableMessage(((Messages.SendReliableMessageData) (message)).messageData, ((Messages.SendReliableMessageData) (message)).recipientParticipantIds, ((Messages.SendReliableMessageData) (message)).mToken);
                mOutstandingReliableMessages.put(Integer.valueOf(((Messages.SendReliableMessageData) (message)).mToken), ((Messages.SendReliableMessageData) (message)).callbacks);
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                handleRasFailure(message);
            }
        }
        return HANDLED;
_L24:
        message = (Messages.OnSentReliableMessageData)message.obj;
        WrappedGamesCallbacks wrappedgamescallbacks = (WrappedGamesCallbacks)mOutstandingReliableMessages.remove(Integer.valueOf(((Messages.OnSentReliableMessageData) (message)).token));
        if (wrappedgamescallbacks == null)
        {
            Log.e("RoomServiceClientStateMachine", (new StringBuilder("InRoomState: ON_SENT_RELIABLE_MESSAGE - can't find token ")).append(((Messages.OnSentReliableMessageData) (message)).token).toString());
        } else
        {
            try
            {
                wrappedgamescallbacks.onMessageSent(((Messages.OnSentReliableMessageData) (message)).statusCode, ((Messages.OnSentReliableMessageData) (message)).token, ((Messages.OnSentReliableMessageData) (message)).participantId);
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                Log.e("RoomServiceClientStateMachine", "InRoomState: ON_SENT_RELIABLE_MESSAGE", message);
            }
        }
        return HANDLED;
_L9:
        Object obj3;
        message = (Messages.ReportP2pStatusData)message.obj;
        obj3 = new ArrayList();
        FastParser fastparser = new FastParser();
        int i = 0;
_L36:
        if (i >= ((Messages.ReportP2pStatusData) (message)).roomP2PStatusesJson.length)
        {
            break; /* Loop/switch isn't completed */
        }
        RoomP2PStatus roomp2pstatus = new RoomP2PStatus();
        fastparser.parse(((Messages.ReportP2pStatusData) (message)).roomP2PStatusesJson[i], roomp2pstatus);
        ((ArrayList) (obj3)).add(roomp2pstatus);
        i++;
        if (true) goto _L36; else goto _L35
_L35:
        try
        {
            mData.mOneup.reportP2pStatus(mContext, mRoomCreatorClientContext, new com.google.android.gms.games.service.PlayGamesAsyncService.P2pStatusReportCallback() {

                final InRoomState this$0;

                public final void onReportedStatus(DataHolder dataholder)
                {
                    String s2;
                    if (dataholder.mStatusCode == 0)
                    {
                        s2 = MultiplayerUtils.roomStatusDataHolderToJsonString(dataholder);
                    } else
                    {
                        s2 = (new StringBuilder("Error ")).append(dataholder.mStatusCode).toString();
                    }
                    mSm.sendMessage(new Messages.OnP2pStatusReportedData(dataholder.mStatusCode, s2));
                }

            
            {
                this$0 = InRoomState.this;
                super();
            }
            }, ((Messages.ReportP2pStatusData) (message)).matchId, ((ArrayList) (obj3)));
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            mSm.logException("Unable to report P2P status.", message);
            GamesLog.e("RoomServiceClientStateMachine", "Unable to report P2P status.", message);
        }
        return HANDLED;
_L34:
        message = (Messages.OnP2pStatusReportedData)message.obj;
        if (((Messages.OnP2pStatusReportedData) (message)).statusCode != 0) goto _L38; else goto _L37
_L37:
        try
        {
            mData.mRoomAndroidService.handleStatusNotification(((Messages.OnP2pStatusReportedData) (message)).roomStatusJson);
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            handleRasFailure(message);
        }
_L43:
        return HANDLED;
_L38:
        mSm.logNote("Unable to send P2P status.");
        mSessionLog.mLog.unableToReportP2PStatus = true;
        obj3 = generateLeaveOnBehalfOfClient(mContext, mRoomCreatorClientContext);
        ((Messages.OnP2pStatusReportedData) (message)).statusCode;
        JVM INSTR lookupswitch 2: default 2080
    //                   6: 2142
    //                   6004: 2135;
           goto _L39 _L40 _L41
_L41:
        break; /* Loop/switch isn't completed */
_L39:
        message = "REALTIME_SERVER_CONNECTION_FAILURE";
_L44:
        mSessionLog.onLeavingRoom(2);
        mStates.waitLeaveDiagnosticsState.transitionTo(message, ((Messages.LeaveRoomData) (obj3)), mSessionLog);
        mSm.sendMessageAtFrontOfQueue(new Messages.DisconnectNetworkData());
        GamesLog.e("RoomServiceClientStateMachine", "Unable to send P2P status.");
        if (true) goto _L43; else goto _L42
_L42:
        message = "REALTIME_SERVER_ERROR";
          goto _L44
_L40:
        message = "REALTIME_SERVER_CONNECTION_FAILURE";
          goto _L44
_L11:
        message = (Messages.OnRoomUpdatedData)message.obj;
        Object obj4 = new FastParser();
        try
        {
            RoomStatus roomstatus = new RoomStatus();
            ((FastParser) (obj4)).parse(((Messages.OnRoomUpdatedData) (message)).roomStatusJson, roomstatus);
            mRealTimeDataManager.updateRoom(roomstatus);
            obj4 = mSessionLog.mLog;
            obj4.roomUpdateCount = ((com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession) (obj4)).roomUpdateCount + 1;
        }
        catch (com.google.android.gms.common.server.response.FastParser.ParseException parseexception)
        {
            Log.e("RoomServiceClientStateMachine", (new StringBuilder("Unable to parse DATA_MANAGER_UPDATE_ROOM ")).append(((Messages.OnRoomUpdatedData) (message)).roomStatusJson).toString(), parseexception);
        }
        return HANDLED;
_L10:
        mSm.deferMessage(message);
        return HANDLED;
_L30:
        mSm.deferMessage(message);
        return HANDLED;
_L17:
        mSessionLog.mLog.usedNativeSockets = true;
        Messages.CreateNativeSocketData createnativesocketdata = (Messages.CreateNativeSocketData)message.obj;
        int j = mSocketToken;
        mSocketToken = j + 1;
        try
        {
            mData.mRoomAndroidService.createNativeLibjingleSocket(createnativesocketdata.participantId, j);
            mOutstandingCreateNativeSocket.put(Integer.valueOf(j), createnativesocketdata);
        }
        catch (RemoteException remoteexception)
        {
            handleRasFailure(remoteexception);
            mSm.deferMessage(message);
        }
        return HANDLED;
_L16:
        Messages.CreateSocketConnectionData createsocketconnectiondata = (Messages.CreateSocketConnectionData)message.obj;
        mSessionLog.mLog.usedLegacySockets = true;
        int k = mSocketToken;
        mSocketToken = k + 1;
        try
        {
            mData.mRoomAndroidService.createSocketConnection(createsocketconnectiondata.participantId, k);
            mOutstandingCreateSocket.put(Integer.valueOf(k), createsocketconnectiondata);
        }
        catch (RemoteException remoteexception1)
        {
            handleRasFailure(remoteexception1);
            mSm.deferMessage(message);
        }
        return HANDLED;
_L32:
        message = (Messages.OnCreateNativeLibjingleSocketData)message.obj;
        Messages.CreateNativeSocketData createnativesocketdata1 = (Messages.CreateNativeSocketData)mOutstandingCreateNativeSocket.remove(Integer.valueOf(((Messages.OnCreateNativeLibjingleSocketData) (message)).token));
        if (createnativesocketdata1 != null)
        {
            createnativesocketdata1.setResult(((Messages.OnCreateNativeLibjingleSocketData) (message)).nativeSocket);
        }
        return HANDLED;
_L33:
        message = (Messages.OnCreateSocketConnectionData)message.obj;
        Messages.CreateSocketConnectionData createsocketconnectiondata1 = (Messages.CreateSocketConnectionData)mOutstandingCreateSocket.remove(Integer.valueOf(((Messages.OnCreateSocketConnectionData) (message)).token));
        if (createsocketconnectiondata1 != null)
        {
            createsocketconnectiondata1.setResult(((Messages.OnCreateSocketConnectionData) (message)).socketName);
        }
        return HANDLED;
    }



    // Unreferenced inner class com/google/android/gms/games/service/statemachine/roomclient/InRoomState$RoomCallbacksHelper$1

/* anonymous class */
    final class RoomCallbacksHelper._cls1
        implements LogCallBack
    {

        final RoomCallbacksHelper this$1;

        public final void run(Room room)
        {
            int k = 0;
            int j = 0;
            room = room.getParticipants();
            int i = 0;
            for (int i1 = room.size(); i < i1;)
            {
                int l = k + 1;
                k = j;
                if (((Participant)room.get(i)).isConnectedToRoom())
                {
                    k = j + 1;
                }
                i++;
                j = k;
                k = l;
            }

            room = mSessionLog;
            ((RtmpSessionLog) (room)).mLog.numPeers = Math.max(k, ((RtmpSessionLog) (room)).mLog.numPeers);
            ((RtmpSessionLog) (room)).mLog.numConnectedPeers = Math.max(j, ((RtmpSessionLog) (room)).mLog.numConnectedPeers);
        }

            
            {
                this$1 = RoomCallbacksHelper.this;
                super();
            }
    }

}
