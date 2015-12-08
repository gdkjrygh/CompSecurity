// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.content.Context;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.internal.ConnectionInfo;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IRoomService;
import com.google.android.gms.games.server.api.RoomStatus;
import com.google.android.gms.games.service.statemachine.IStateMachine;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            RoomClientState, WaitNetworkDisconnectState, RtmpSessionLog, WaitOneupEnterRoomState, 
//            RoomServiceClientStateMachine

final class NetworkConnectedState extends RoomClientState
{
    public static final class RealTimeDataManager
    {

        final ClientContext mClientContext;
        final Context mContext;

        public final DataHolder getRoom(String s)
        {
            DataBroker databroker = DataBroker.acquireBroker(mContext);
            s = databroker.getRoom(mContext, mClientContext, s);
            databroker.release();
            return s;
            s;
            s = DataHolder.empty(2);
            databroker.release();
            return s;
            s;
            databroker.release();
            throw s;
        }

        public final boolean updateRoom(RoomStatus roomstatus)
        {
            DataBroker databroker;
            DataHolder dataholder;
            databroker = DataBroker.acquireBroker(mContext);
            dataholder = databroker.updateRoom(mContext, mClientContext, roomstatus);
            if (dataholder.mRowCount != 0)
            {
                break MISSING_BLOCK_LABEL_75;
            }
            GamesLog.e("RealTimeDataManager", (new StringBuilder("Empty data holder with status ")).append(dataholder.mStatusCode).append(" returned for status update to room ").append(roomstatus.getRoomId()).toString());
            dataholder.close();
            databroker.release();
            return false;
            dataholder.close();
            databroker.release();
            return true;
            roomstatus;
            dataholder.close();
            databroker.release();
            throw roomstatus;
        }

        public RealTimeDataManager(Context context, ClientContext clientcontext)
        {
            AndroidUtils.assertMainGmsProcess();
            mContext = context;
            mClientContext = clientcontext;
        }
    }


    private ConnectionInfo mConnectionInfo;
    private ClientContext mConnectorClientContext;
    private long mConnectorClientId;

    public NetworkConnectedState(RoomServiceClientStateMachine roomserviceclientstatemachine)
    {
        super(roomserviceclientstatemachine);
    }

    public final void enter()
    {
        setTimer(30, 60, TimeUnit.SECONDS);
    }

    public final boolean processMessage(Message message)
    {
        final Messages.EnterRoomData baseData;
        com.google.android.gms.games.service.PlayGamesAsyncService.RoomEnteredCallback roomenteredcallback;
        switch (message.what)
        {
        default:
            return false;

        case 39: // '\''
            mSm.deferMessage(message);
            mStates.waitNetworkDisconnectState.transitionToState();
            return HANDLED;

        case 30: // '\036'
        case 41: // ')'
            try
            {
                mData.mRoomAndroidService.disconnectNetwork();
                mStates.waitNetworkDisconnectState.transitionToState();
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                handleRasFailure(message);
            }
            return HANDLED;

        case 28: // '\034'
            message = (Messages.OnClientDisconnectingData)message.obj;
            if (mConnectorClientId == ((Messages.OnClientDisconnectingData) (message)).clientId)
            {
                mSm.sendMessageAtFrontOfQueue(new Messages.DisconnectNetworkData());
            }
            return HANDLED;

        case 23: // '\027'
            message = (Messages.OnSignOutData)message.obj;
            if (((Messages.OnSignOutData) (message)).clientContext.equals(mConnectorClientContext))
            {
                mSm.sendMessageAtFrontOfQueue(message);
                mSm.sendMessageAtFrontOfQueue(new Messages.DisconnectNetworkData());
            }
            return HANDLED;

        case 29: // '\035'
            baseData = (Messages.EnterRoomData)message.obj;
            baseData.sessionLog.processedInState(5);
            roomenteredcallback = new com.google.android.gms.games.service.PlayGamesAsyncService.RoomEnteredCallback() {

                final NetworkConnectedState this$0;
                final Messages.EnterRoomData val$baseData;

                public final void onEnteredRoom(DataHolder dataholder)
                {
                    dataholder = new Messages.OnRoomEnteredData(dataholder, baseData);
                    mSm.sendMessage(dataholder);
                }

            
            {
                this$0 = NetworkConnectedState.this;
                baseData = enterroomdata;
                super();
            }
            };
            break;
        }
        if (mConnectorClientId == baseData.clientId)
        {
            message = baseData.sessionLog;
            ((RtmpSessionLog) (message)).mLog.enterCallStartTimeMs = message.deltaNow();
            baseData.getOneupEnterCall(mData.mOneup, roomenteredcallback, mConnectionInfo).run();
            message = mStates.waitOneupEnterRoomState;
            message.mConnectionInfo = mConnectionInfo;
            message.transitionToState();
            return HANDLED;
        } else
        {
            mSm.sendMessageAtFrontOfQueue(new Messages.DisconnectNetworkData());
            baseData.sessionLog.mLog.mismatchedConnector = true;
            mSm.deferMessage(message);
            return HANDLED;
        }
    }

    public final void transitionTo(long l, ClientContext clientcontext, ConnectionInfo connectioninfo)
    {
        mConnectorClientId = l;
        mConnectorClientContext = clientcontext;
        mConnectionInfo = connectioninfo;
        transitionToState();
    }
}
