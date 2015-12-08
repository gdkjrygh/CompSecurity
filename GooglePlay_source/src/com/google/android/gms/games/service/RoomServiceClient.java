// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.internal.ConnectionInfo;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.server.api.RoomLeaveDiagnostics;
import com.google.android.gms.games.service.statemachine.FutureMessage;
import com.google.android.gms.games.service.statemachine.roomclient.OneupRtmpCalls;
import com.google.android.gms.games.service.statemachine.roomclient.RoomServiceClientStateMachine;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.games.service:
//            ConnectNetworkAuthenticatorImpl, PlayGamesAsyncService

public final class RoomServiceClient
{
    private static final class Holder
    {

        private static final RoomServiceClient INSTANCE = new RoomServiceClient((byte)0);


    }

    private final class RoomServiceCallbacks extends com.google.android.gms.games.internal.IRoomServiceCallbacks.Stub
    {

        final RoomServiceClient this$0;

        public final void onConnectedToRoom(String s)
            throws RemoteException
        {
            s = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnConnectedToRoomData(s);
            mStateMachine.sendMessage(s);
        }

        public final void onCreateNativeLibjingleSocket(ParcelFileDescriptor parcelfiledescriptor, int i)
        {
            mStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnCreateNativeLibjingleSocketData(parcelfiledescriptor, i));
        }

        public final void onCreateSocketConnection(String s, int i)
        {
            mStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnCreateSocketConnectionData(s, i));
        }

        public final void onDisconnectedFromRoom(String s)
            throws RemoteException
        {
            s = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnDisconnectedFromRoomData(s);
            mStateMachine.sendMessage(s);
        }

        public final void onEnterRoomResult(String s, boolean flag)
            throws RemoteException
        {
            s = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnDcmRoomEnterResultData(s, flag);
            mStateMachine.sendMessage(s);
        }

        public final void onLibrariesLoaded(int i)
        {
            mStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnLibrariesLoadedData(i));
        }

        public final void onNetworkConnected(ConnectionInfo connectioninfo)
        {
            mStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomclient.Messages.ConnectNetworkOnConnectedData(connectioninfo));
        }

        public final void onNetworkDisconnected()
        {
            mStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnNetworkDisconnectedData());
        }

        public final void onP2PConnected(String s)
            throws RemoteException
        {
            s = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnP2PConnectedData(s);
            mStateMachine.sendMessage(s);
        }

        public final void onP2PDisconnected(String s)
            throws RemoteException
        {
            s = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnP2PDisconnectedData(s);
            mStateMachine.sendMessage(s);
        }

        public final void onPeerConnected(String s, String as[])
            throws RemoteException
        {
            s = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnPeerConnectedData(s, as);
            mStateMachine.sendMessage(s);
        }

        public final void onPeerDeclined(String s, String as[])
            throws RemoteException
        {
            s = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnPeerDeclinedData(s, as);
            mStateMachine.sendMessage(s);
        }

        public final void onPeerDisconnected(String s, String as[])
            throws RemoteException
        {
            s = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnPeerDisconnectedData(s, as);
            mStateMachine.sendMessage(s);
        }

        public final void onPeerInvitedToRoom(String s, String as[])
            throws RemoteException
        {
            s = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnPeerInvitedToRoomData(s, as);
            mStateMachine.sendMessage(s);
        }

        public final void onPeerJoinedRoom(String s, String as[])
            throws RemoteException
        {
            s = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnPeerJoinedRoomData(s, as);
            mStateMachine.sendMessage(s);
        }

        public final void onPeerLeftRoom(String s, String as[])
            throws RemoteException
        {
            s = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnPeerLeftRoomData(s, as);
            mStateMachine.sendMessage(s);
        }

        public final void onRealTimeMessageReceived(String s, byte abyte0[], int i)
            throws RemoteException
        {
            s = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnRealTimeMessageReceivedData(s, abyte0, i);
            mStateMachine.sendMessage(s);
        }

        public final void onReportP2pStatus(String s, String as[])
            throws RemoteException
        {
            s = new com.google.android.gms.games.service.statemachine.roomclient.Messages.ReportP2pStatusData(s, as);
            mStateMachine.sendMessage(s);
        }

        public final void onRoomAutoMatching(String s)
            throws RemoteException
        {
            s = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnRoomAutoMatchingData(s);
            mStateMachine.sendMessage(s);
        }

        public final void onRoomConnected(String s)
            throws RemoteException
        {
            s = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnRoomConnectedData(s);
            mStateMachine.sendMessage(s);
        }

        public final void onRoomConnecting(String s)
            throws RemoteException
        {
            s = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnRoomConnectingData(s);
            mStateMachine.sendMessage(s);
        }

        public final void onRoomLeaveDiagnostics(String s, byte abyte0[])
            throws RemoteException
        {
            s = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnRoomLeaveDiagnosticsData(s, abyte0);
            mStateMachine.sendMessage(s);
        }

        public final void onRoomTornDown()
            throws RemoteException
        {
            com.google.android.gms.games.service.statemachine.roomclient.Messages.OnRoomTornDownData onroomtorndowndata = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnRoomTornDownData();
            mStateMachine.sendMessage(onroomtorndowndata);
        }

        public final void onRoomUpdated(String s)
            throws RemoteException
        {
            s = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnRoomUpdatedData(s);
            mStateMachine.sendMessage(s);
        }

        public final void onSentReliableMessage(int i, int j, String s)
            throws RemoteException
        {
            s = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnSentReliableMessageData(i, j, s);
            mStateMachine.sendMessage(s);
        }

        public final void onSetupDone(IBinder ibinder)
        {
            mStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomclient.Messages.SetupDoneData(ibinder));
        }

        private RoomServiceCallbacks()
        {
            this$0 = RoomServiceClient.this;
            super();
        }

        RoomServiceCallbacks(byte byte0)
        {
            this();
        }
    }


    private final RoomServiceCallbacks mRscCallbacks;
    protected final RoomServiceClientStateMachine mStateMachine;

    private RoomServiceClient()
    {
        mRscCallbacks = new RoomServiceCallbacks((byte)0);
        Log.i("RoomServiceClient", "Creating RoomServiceClient and mStateMachine");
        mStateMachine = new RoomServiceClientStateMachine(new OneupRtmpCalls() {

            final RoomServiceClient this$0;

            public final void createRoom(Context context, ClientContext clientcontext, PlayGamesAsyncService.RoomEnteredCallback roomenteredcallback, String s, int i, String as[], Bundle bundle, 
                    ConnectionInfo connectioninfo)
            {
                context = new com.google.android.gms.games.broker.GamesClientContext.Builder(context, clientcontext);
                context.mExternalOwningGameId = s;
                context.mExternalTargetGameId = s;
                PlayGamesAsyncService.createRoom(context.build(), roomenteredcallback, i, as, bundle, connectioninfo);
            }

            public final void joinRoom(Context context, ClientContext clientcontext, PlayGamesAsyncService.RoomEnteredCallback roomenteredcallback, String s, String s1, ConnectionInfo connectioninfo)
            {
                context = new com.google.android.gms.games.broker.GamesClientContext.Builder(context, clientcontext);
                context.mExternalOwningGameId = s;
                context.mExternalTargetGameId = s;
                PlayGamesAsyncService.joinRoom(context.build(), roomenteredcallback, s1, connectioninfo);
            }

            public final void leaveRoom(Context context, ClientContext clientcontext, PlayGamesAsyncService.RoomLeftCallback roomleftcallback, String s, String s1, RoomLeaveDiagnostics roomleavediagnostics)
            {
                PlayGamesAsyncService.leaveRoom(context, clientcontext, roomleftcallback, s, s1, roomleavediagnostics);
            }

            public final void reportP2pStatus(Context context, ClientContext clientcontext, PlayGamesAsyncService.P2pStatusReportCallback p2pstatusreportcallback, String s, ArrayList arraylist)
            {
                PlayGamesAsyncService.reportP2pStatus(context, clientcontext, p2pstatusreportcallback, s, arraylist);
            }

            
            {
                this$0 = RoomServiceClient.this;
                super();
            }
        }, new ConnectNetworkAuthenticatorImpl(), mRscCallbacks);
        mStateMachine.start();
    }

    RoomServiceClient(byte byte0)
    {
        this();
    }

    public final ParcelFileDescriptor createNativeSocket(com.google.android.gms.games.service.statemachine.roomclient.Messages.CreateNativeSocketData createnativesocketdata)
    {
        if (!PlatformVersion.checkVersion(13)) goto _L2; else goto _L1
_L1:
        mStateMachine.sendMessage(createnativesocketdata);
        createnativesocketdata = (ParcelFileDescriptor)((FutureMessage) (createnativesocketdata)).mFuture.get();
        return createnativesocketdata;
        createnativesocketdata;
        Log.e("RoomServiceClient", "During createNativeSocket", createnativesocketdata);
_L4:
        return null;
        createnativesocketdata;
        Log.e("RoomServiceClient", "During createNativeSocket", createnativesocketdata);
        continue; /* Loop/switch isn't completed */
_L2:
        GamesLog.w("RoomServiceClient", "Native sockets are not supported at this API level");
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String createSocketConnection(com.google.android.gms.games.service.statemachine.roomclient.Messages.CreateSocketConnectionData createsocketconnectiondata)
    {
        mStateMachine.sendMessage(createsocketconnectiondata);
        createsocketconnectiondata = (String)((FutureMessage) (createsocketconnectiondata)).mFuture.get();
        return createsocketconnectiondata;
        createsocketconnectiondata;
        Log.e("RoomServiceClient", "During createSocketConnection", createsocketconnectiondata);
_L2:
        return null;
        createsocketconnectiondata;
        Log.e("RoomServiceClient", "During createSocketConnection", createsocketconnectiondata);
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final void dump(PrintWriter printwriter)
    {
        printwriter.println((new StringBuilder("[RTMP DUMP] ")).append(getClass().getSimpleName()).toString());
        mStateMachine.dump$dcd0ff(printwriter);
    }

    public final void enterRoom(com.google.android.gms.games.service.statemachine.roomclient.Messages.EnterRoomData enterroomdata)
    {
        mStateMachine.sendMessage(enterroomdata);
    }

    public final void leaveRoom(com.google.android.gms.games.service.statemachine.roomclient.Messages.ClientLeaveRoomData clientleaveroomdata)
    {
        mStateMachine.sendMessage(clientleaveroomdata);
    }

    public final void onClientDisconnecting(Context context, ClientContext clientcontext, long l)
    {
        context = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnClientDisconnectingData(context, clientcontext, l);
        mStateMachine.sendMessage(context);
    }

    public final void onSignOut(Context context, ClientContext clientcontext)
    {
        context = new com.google.android.gms.games.service.statemachine.roomclient.Messages.OnSignOutData(context, clientcontext);
        mStateMachine.sendMessage(context);
    }

    public final DataHolder registerWaitingRoomListenerRestricted(com.google.android.gms.games.service.statemachine.roomclient.Messages.RegisterWaitingRoomListenerRestrictedData registerwaitingroomlistenerrestricteddata)
    {
        mStateMachine.sendMessage(registerwaitingroomlistenerrestricteddata);
        registerwaitingroomlistenerrestricteddata = (DataHolder)((FutureMessage) (registerwaitingroomlistenerrestricteddata)).mFuture.get();
        return registerwaitingroomlistenerrestricteddata;
        registerwaitingroomlistenerrestricteddata;
        Log.e("RoomServiceClient", "During registerWaitingRoomListenerRestricted", registerwaitingroomlistenerrestricteddata);
_L2:
        return null;
        registerwaitingroomlistenerrestricteddata;
        Log.e("RoomServiceClient", "During registerWaitingRoomListenerRestricted", registerwaitingroomlistenerrestricteddata);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final int sendReliableMessage(com.google.android.gms.games.service.statemachine.roomclient.Messages.SendReliableMessageData sendreliablemessagedata)
    {
        sendreliablemessagedata.mToken = ((com.google.android.gms.games.service.statemachine.roomclient.RoomServiceClientStateMachine.StateData)mStateMachine.mData).mMessageToken.incrementAndGet();
        mStateMachine.sendMessage(sendreliablemessagedata);
        return sendreliablemessagedata.mToken;
    }

    public final int sendUnreliableMessage(com.google.android.gms.games.service.statemachine.roomclient.Messages.SendUnreliableMessageData sendunreliablemessagedata)
    {
        mStateMachine.sendMessage(sendunreliablemessagedata);
        return 0;
    }

    public final int unregisterWaitingRoomListenerRestricted(com.google.android.gms.games.service.statemachine.roomclient.Messages.UnregisterWaitingRoomListenerRestrictedData unregisterwaitingroomlistenerrestricteddata)
    {
        mStateMachine.sendMessage(unregisterwaitingroomlistenerrestricteddata);
        return 0;
    }
}
