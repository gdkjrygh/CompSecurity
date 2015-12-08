// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.ConnectionInfo;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.statemachine.FutureMessage;
import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            OneupRtmpCalls, RoomServiceClientStateMachine, RtmpSessionLog

public final class Messages
{
    public static final class CleanupLibJingleData extends MessageBase
    {

        public CleanupLibJingleData()
        {
            super(42);
        }
    }

    public static final class ClientLeaveRoomData extends MessageBase
    {

        public final WrappedGamesCallbacks callbacks;
        public final ClientContext clientContext;
        public final Context context;
        public final String externalRoomId;

        public ClientLeaveRoomData(Context context1, ClientContext clientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s)
        {
            super(16);
            context = (Context)Preconditions.checkNotNull(context1);
            clientContext = (ClientContext)Preconditions.checkNotNull(clientcontext);
            callbacks = wrappedgamescallbacks;
            externalRoomId = (String)Preconditions.checkNotNull(s);
        }
    }

    public static final class ConnectNetworkData
    {

        public final String bareJid;
        public final ClientContext clientContext;
        public final Context context;
        public final String currentPlayerId;
        public final String externalGameId;

        public ConnectNetworkData(Context context1, String s, String s1, ClientContext clientcontext, String s2)
        {
            context = context1;
            currentPlayerId = s1;
            externalGameId = s;
            clientContext = clientcontext;
            bareJid = s2;
        }
    }

    public static final class ConnectNetworkOnConnectedData extends MessageBase
    {

        public final ConnectionInfo connectionInfo;

        public ConnectNetworkOnConnectedData(ConnectionInfo connectioninfo)
        {
            super(24);
            connectionInfo = connectioninfo;
        }
    }

    public static final class ConnectNetworkRetry
    {

        int mConnectNetworkTryCount;

        public final boolean getRetryAuthToken()
        {
            return mConnectNetworkTryCount % 2 == 0;
        }

        public ConnectNetworkRetry()
        {
        }
    }

    public static final class CreateNativeSocketData extends FutureMessage
    {

        public final String participantId;

        public CreateNativeSocketData(String s)
        {
            super(20);
            participantId = s;
        }
    }

    private static final class CreateRoomData extends EnterRoomData
    {

        public final Bundle autoMatchCriteria;
        public final String invitedPlayerIds[];
        public final int variant;

        public final DataHolderCallback getGameCallback()
        {
            return new DataHolderCallback() {

                final CreateRoomData this$0;

                public final void run(DataHolder dataholder)
                {
                    try
                    {
                        WrappedGamesCallbacks wrappedgamescallbacks = callbacks;
                        wrappedgamescallbacks.audit(new DataHolder[] {
                            dataholder
                        });
                        wrappedgamescallbacks.mCallbacks.onRoomCreated(dataholder);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (DataHolder dataholder)
                    {
                        RoomServiceClientStateMachine.handleGameRemoteFailure(dataholder);
                    }
                }

            
            {
                this$0 = CreateRoomData.this;
                super();
            }
            };
        }

        public final Runnable getOneupEnterCall(final OneupRtmpCalls oneUpCalls, final com.google.android.gms.games.service.PlayGamesAsyncService.RoomEnteredCallback roomEnteredCallback, ConnectionInfo connectioninfo)
        {
            return connectioninfo. new Runnable() {

                final CreateRoomData this$0;
                final ConnectionInfo val$connectionInfo;
                final OneupRtmpCalls val$oneUpCalls;
                final com.google.android.gms.games.service.PlayGamesAsyncService.RoomEnteredCallback val$roomEnteredCallback;

                public final void run()
                {
                    oneUpCalls.createRoom(context, clientContext, roomEnteredCallback, externalGameId, variant, invitedPlayerIds, autoMatchCriteria, connectionInfo);
                }

            
            {
                this$0 = final_createroomdata;
                oneUpCalls = oneuprtmpcalls;
                roomEnteredCallback = roomenteredcallback;
                connectionInfo = ConnectionInfo.this;
                super();
            }
            };
        }

        public CreateRoomData(Context context, ClientContext clientcontext, String s, WrappedGamesCallbacks wrappedgamescallbacks, IBinder ibinder, int i, String as[], 
                Bundle bundle, boolean flag, long l, String s1, String s2)
        {
            super(1, context, clientcontext, s, wrappedgamescallbacks, ibinder, flag, l, s1, s2);
            variant = i;
            invitedPlayerIds = as;
            autoMatchCriteria = bundle;
        }
    }

    public static final class CreateSocketConnectionData extends FutureMessage
    {

        public final String participantId;

        public CreateSocketConnectionData(String s)
        {
            super(19);
            participantId = s;
        }
    }

    public static interface DataHolderCallback
    {

        public abstract void run(DataHolder dataholder);
    }

    public static final class DisconnectNetworkData extends MessageBase
    {

        public DisconnectNetworkData()
        {
            super(41);
        }
    }

    public static final class DoneCleaningData extends MessageBase
    {

        public DoneCleaningData()
        {
            super(14);
        }
    }

    public static abstract class EnterRoomData extends MessageBase
    {

        public final WrappedGamesCallbacks callbacks;
        public final ClientContext clientContext;
        public final long clientId;
        public final ConnectNetworkData connectNetworkData;
        public final ConnectNetworkRetry connectNetworkRetry = new ConnectNetworkRetry();
        public final Context context;
        public final boolean enableSockets;
        public final String externalGameId;
        public final LoadLibrariesRetry loadLibrariesRetry = new LoadLibrariesRetry();
        public final IBinder realTimeGameDeathBinder;
        public final RtmpSessionLog sessionLog;

        public abstract DataHolderCallback getGameCallback();

        public abstract Runnable getOneupEnterCall(OneupRtmpCalls oneuprtmpcalls, com.google.android.gms.games.service.PlayGamesAsyncService.RoomEnteredCallback roomenteredcallback, ConnectionInfo connectioninfo);

        protected EnterRoomData(int i, Context context1, ClientContext clientcontext, String s, WrappedGamesCallbacks wrappedgamescallbacks, IBinder ibinder, boolean flag, 
                long l, String s1, String s2)
        {
            super(29);
            sessionLog = new RtmpSessionLog(context1, clientcontext, i, s, flag);
            clientContext = clientcontext;
            context = context1;
            externalGameId = s;
            callbacks = wrappedgamescallbacks;
            realTimeGameDeathBinder = ibinder;
            enableSockets = flag;
            connectNetworkData = new ConnectNetworkData(context1, s, s2, clientcontext, s1);
            clientId = l;
        }
    }

    public static final class GameDeathBinderDiedData extends MessageBase
    {

        public final String roomId;

        public GameDeathBinderDiedData(String s)
        {
            super(43);
            roomId = s;
        }
    }

    private static final class JoinRoomData extends EnterRoomData
    {

        public final String externalRoomId;

        public final DataHolderCallback getGameCallback()
        {
            return new DataHolderCallback() {

                final JoinRoomData this$0;

                public final void run(DataHolder dataholder)
                {
                    try
                    {
                        WrappedGamesCallbacks wrappedgamescallbacks = callbacks;
                        wrappedgamescallbacks.audit(new DataHolder[] {
                            dataholder
                        });
                        wrappedgamescallbacks.mCallbacks.onJoinedRoom(dataholder);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (DataHolder dataholder)
                    {
                        RoomServiceClientStateMachine.handleGameRemoteFailure(dataholder);
                    }
                }

            
            {
                this$0 = JoinRoomData.this;
                super();
            }
            };
        }

        public final Runnable getOneupEnterCall(final OneupRtmpCalls oneUpCalls, final com.google.android.gms.games.service.PlayGamesAsyncService.RoomEnteredCallback roomEnteredCallback, ConnectionInfo connectioninfo)
        {
            return connectioninfo. new Runnable() {

                final JoinRoomData this$0;
                final ConnectionInfo val$connectionInfo;
                final OneupRtmpCalls val$oneUpCalls;
                final com.google.android.gms.games.service.PlayGamesAsyncService.RoomEnteredCallback val$roomEnteredCallback;

                public final void run()
                {
                    oneUpCalls.joinRoom(context, clientContext, roomEnteredCallback, externalGameId, externalRoomId, connectionInfo);
                }

            
            {
                this$0 = final_joinroomdata;
                oneUpCalls = oneuprtmpcalls;
                roomEnteredCallback = roomenteredcallback;
                connectionInfo = ConnectionInfo.this;
                super();
            }
            };
        }

        public JoinRoomData(Context context, ClientContext clientcontext, String s, WrappedGamesCallbacks wrappedgamescallbacks, IBinder ibinder, boolean flag, long l, String s1, String s2, String s3)
        {
            super(2, context, clientcontext, s, wrappedgamescallbacks, ibinder, flag, l, s1, s2);
            externalRoomId = s3;
        }
    }

    public static final class LeaveRoomData extends MessageBase
    {

        public final ClientLeaveRoomData clientLeaveRoomData;
        public final ConnectionInfo mConnectionInfo;
        public final ClientContext mConnectorClientContext;
        public final long mConnectorClientId;

        public LeaveRoomData(ClientLeaveRoomData clientleaveroomdata, long l, ClientContext clientcontext, ConnectionInfo connectioninfo)
        {
            super(26);
            mConnectorClientId = ((Long)Preconditions.checkNotNull(Long.valueOf(l))).longValue();
            mConnectorClientContext = (ClientContext)Preconditions.checkNotNull(clientcontext);
            mConnectionInfo = (ConnectionInfo)Preconditions.checkNotNull(connectioninfo);
            clientLeaveRoomData = (ClientLeaveRoomData)Preconditions.checkNotNull(clientleaveroomdata);
        }
    }

    public static final class LoadLibrariesRetry
    {

        int mLoadTries;

        public LoadLibrariesRetry()
        {
        }
    }

    public static final class OnClientDisconnectingData extends MessageBase
    {

        public final ClientContext clientContext;
        public final long clientId;
        public final Context context;

        public OnClientDisconnectingData(Context context1, ClientContext clientcontext, long l)
        {
            super(28);
            clientContext = clientcontext;
            clientId = l;
            context = context1;
        }
    }

    public static final class OnConnectedToRoomData extends MessageBase
    {

        public final String roomId;

        public OnConnectedToRoomData(String s)
        {
            super(36);
            roomId = s;
        }
    }

    public static final class OnCreateNativeLibjingleSocketData extends MessageBase
    {

        public final ParcelFileDescriptor nativeSocket;
        public final int token;

        public OnCreateNativeLibjingleSocketData(ParcelFileDescriptor parcelfiledescriptor, int i)
        {
            super(44);
            nativeSocket = parcelfiledescriptor;
            token = i;
        }
    }

    public static final class OnCreateSocketConnectionData extends MessageBase
    {

        public final String socketName;
        public final int token;

        public OnCreateSocketConnectionData(String s, int i)
        {
            super(45);
            socketName = s;
            token = i;
        }
    }

    public static final class OnDcmRoomEnterResultData extends MessageBase
    {

        public final String roomId;
        public final Boolean success;

        public OnDcmRoomEnterResultData(String s, boolean flag)
        {
            super(49);
            roomId = s;
            success = Boolean.valueOf(flag);
        }
    }

    public static final class OnDisconnectedFromRoomData extends MessageBase
    {

        public final String roomId;

        public OnDisconnectedFromRoomData(String s)
        {
            super(37);
            roomId = s;
        }
    }

    public static final class OnLibrariesLoadedData extends MessageBase
    {

        public final int statusCode;

        public OnLibrariesLoadedData(int i)
        {
            super(25);
            statusCode = i;
        }
    }

    public static final class OnNetworkDisconnectedData extends MessageBase
    {

        public OnNetworkDisconnectedData()
        {
            super(39);
        }
    }

    public static final class OnP2PConnectedData extends MessageBase
    {

        public final String participantId;

        public OnP2PConnectedData(String s)
        {
            super(6);
            participantId = s;
        }
    }

    public static final class OnP2PDisconnectedData extends MessageBase
    {

        public final String participantId;

        public OnP2PDisconnectedData(String s)
        {
            super(7);
            participantId = s;
        }
    }

    public static final class OnP2pStatusReportedData extends MessageBase
    {

        public final String roomStatusJson;
        public final int statusCode;

        public OnP2pStatusReportedData(int i, String s)
        {
            super(47);
            statusCode = i;
            roomStatusJson = s;
        }
    }

    public static final class OnPeerConnectedData extends MessageBase
    {

        public final String participantIds[];
        public final String roomId;

        public OnPeerConnectedData(String s, String as[])
        {
            super(4);
            roomId = s;
            participantIds = as;
        }
    }

    public static final class OnPeerDeclinedData extends MessageBase
    {

        public final String participantIds[];
        public final String roomId;

        public OnPeerDeclinedData(String s, String as[])
        {
            super(3);
            roomId = s;
            participantIds = as;
        }
    }

    public static final class OnPeerDisconnectedData extends MessageBase
    {

        public final String participantIds[];
        public final String roomId;

        public OnPeerDisconnectedData(String s, String as[])
        {
            super(5);
            roomId = s;
            participantIds = as;
        }
    }

    public static final class OnPeerInvitedToRoomData extends MessageBase
    {

        public final String participantIds[];
        public final String roomId;

        public OnPeerInvitedToRoomData(String s, String as[])
        {
            super(38);
            roomId = s;
            participantIds = as;
        }
    }

    public static final class OnPeerJoinedRoomData extends MessageBase
    {

        public final String participantIds[];
        public final String roomId;

        public OnPeerJoinedRoomData(String s, String as[])
        {
            super(1);
            roomId = s;
            participantIds = as;
        }
    }

    public static final class OnPeerLeftRoomData extends MessageBase
    {

        public final String participantIds[];
        public final String roomId;

        public OnPeerLeftRoomData(String s, String as[])
        {
            super(2);
            roomId = s;
            participantIds = as;
        }
    }

    public static final class OnRealTimeMessageReceivedData extends MessageBase
    {

        public final String fromId;
        public final byte messageData[];
        public final int reliable;

        public OnRealTimeMessageReceivedData(String s, byte abyte0[], int i)
        {
            super(32);
            fromId = s;
            messageData = abyte0;
            reliable = i;
        }
    }

    public static final class OnRoomAutoMatchingData extends MessageBase
    {

        public final String roomId;

        public OnRoomAutoMatchingData(String s)
        {
            super(34);
            roomId = s;
        }
    }

    public static final class OnRoomConnectedData extends MessageBase
    {

        public final String roomId;

        public OnRoomConnectedData(String s)
        {
            super(35);
            roomId = s;
        }
    }

    public static final class OnRoomConnectingData extends MessageBase
    {

        public final String roomId;

        public OnRoomConnectingData(String s)
        {
            super(33);
            roomId = s;
        }
    }

    public static final class OnRoomEnteredData extends MessageBase
    {

        public final EnterRoomData enterRoomData;
        public final DataHolder roomDataHolder;

        public OnRoomEnteredData(DataHolder dataholder, EnterRoomData enterroomdata)
        {
            super(15);
            roomDataHolder = dataholder;
            enterRoomData = enterroomdata;
        }
    }

    public static final class OnRoomLeaveDiagnosticsData extends MessageBase
    {

        public final byte dcmPlaylog[];
        public final String roomLeaveDiagnosticsJson;

        public OnRoomLeaveDiagnosticsData(String s, byte abyte0[])
        {
            super(10);
            roomLeaveDiagnosticsJson = s;
            dcmPlaylog = abyte0;
        }
    }

    public static final class OnRoomLeftData extends MessageBase
    {

        public final WrappedGamesCallbacks callbacks;
        public final LeaveRoomData leaveRoomData;
        public final String roomId;
        public final int status;

        public OnRoomLeftData(int i, String s, WrappedGamesCallbacks wrappedgamescallbacks, LeaveRoomData leaveroomdata)
        {
            super(46);
            leaveRoomData = (LeaveRoomData)Preconditions.checkNotNull(leaveroomdata);
            status = ((Integer)Preconditions.checkNotNull(Integer.valueOf(i))).intValue();
            roomId = Preconditions.checkNotEmpty(s);
            callbacks = wrappedgamescallbacks;
        }
    }

    public static final class OnRoomTornDownData extends MessageBase
    {

        public OnRoomTornDownData()
        {
            super(8);
        }
    }

    public static final class OnRoomUpdatedData extends MessageBase
    {

        public final String roomStatusJson;

        public OnRoomUpdatedData(String s)
        {
            super(11);
            roomStatusJson = s;
        }
    }

    public static final class OnSentReliableMessageData extends MessageBase
    {

        public final String participantId;
        public final int statusCode;
        public final int token;

        public OnSentReliableMessageData(int i, int j, String s)
        {
            super(31);
            statusCode = i;
            token = j;
            participantId = s;
        }
    }

    public static final class OnSignOutData extends MessageBase
    {

        public final ClientContext clientContext;
        public final Context context;

        public OnSignOutData(Context context1, ClientContext clientcontext)
        {
            super(23);
            clientContext = clientcontext;
            context = context1;
        }
    }

    public static final class RegisterWaitingRoomListenerRestrictedData extends FutureMessage
    {

        public final WrappedGamesCallbacks callbacks;
        public final String externalRoomId;

        public RegisterWaitingRoomListenerRestrictedData(WrappedGamesCallbacks wrappedgamescallbacks, String s)
        {
            super(21);
            callbacks = wrappedgamescallbacks;
            externalRoomId = s;
        }
    }

    public static final class ReportP2pStatusData extends MessageBase
    {

        public final String matchId;
        public final String roomP2PStatusesJson[];

        public ReportP2pStatusData(String s, String as[])
        {
            super(9);
            matchId = s;
            roomP2PStatusesJson = as;
        }
    }

    public static final class RoomServiceGoneData extends MessageBase
    {

        public final com.google.android.gms.games.service.statemachine.MessageTokenHelper.MessageToken validToken;

        public RoomServiceGoneData(com.google.android.gms.games.service.statemachine.MessageTokenHelper.MessageToken messagetoken)
        {
            super(13);
            validToken = messagetoken;
        }
    }

    public static final class SendReliableMessageData extends MessageBase
    {

        public final WrappedGamesCallbacks callbacks;
        public int mToken;
        public final byte messageData[];
        public final String recipientParticipantIds;
        public final String roomId;

        public SendReliableMessageData(WrappedGamesCallbacks wrappedgamescallbacks, byte abyte0[], String s, String s1)
        {
            super(17);
            callbacks = wrappedgamescallbacks;
            messageData = abyte0;
            roomId = s;
            recipientParticipantIds = s1;
        }
    }

    public static final class SendUnreliableMessageData extends MessageBase
    {

        public final byte messageData[];
        public final String recipientParticipantIds[];
        public final String roomId;

        public SendUnreliableMessageData(byte abyte0[], String s, String as[])
        {
            super(18);
            messageData = abyte0;
            roomId = s;
            recipientParticipantIds = as;
        }
    }

    public static final class ServiceConnectedData extends MessageBase
    {

        public final IBinder binder;
        public final ComponentName component;

        public ServiceConnectedData(ComponentName componentname, IBinder ibinder)
        {
            super(12);
            component = componentname;
            binder = ibinder;
        }
    }

    public static final class SetupDoneData extends MessageBase
    {

        public final IBinder deathBinder;

        public SetupDoneData(IBinder ibinder)
        {
            super(27);
            deathBinder = ibinder;
        }
    }

    public static final class UnregisterWaitingRoomListenerRestrictedData extends MessageBase
    {

        public final String externalRoomId;

        public UnregisterWaitingRoomListenerRestrictedData(String s)
        {
            super(22);
            externalRoomId = s;
        }
    }

}
