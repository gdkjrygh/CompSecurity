// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.ConnectionInfo;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            RoomClientState, InRoomState, RtmpSessionLog, OneupRtmpCalls, 
//            NetworkConnectedState, RoomServiceClientStateMachine

final class WaitDcmEnterRoomState extends RoomClientState
{

    ConnectionInfo mConnectionInfo;
    Messages.EnterRoomData mEnterRoomData;
    DataHolder mRoomDataHolder;
    String mRoomId;

    public WaitDcmEnterRoomState(RoomServiceClientStateMachine roomserviceclientstatemachine)
    {
        super(roomserviceclientstatemachine);
    }

    public final void exit()
    {
        if (mRoomDataHolder != null)
        {
            mEnterRoomData.getGameCallback().run(DataHolder.empty(1));
            mRoomDataHolder.close();
        }
    }

    public final boolean processMessage(final Message logToClose)
    {
        switch (logToClose.what)
        {
        default:
            mSm.deferMessage(logToClose);
            return HANDLED;

        case 49: // '1'
            break;
        }
        Object obj;
        logToClose = (Messages.OnDcmRoomEnterResultData)logToClose.obj;
        obj = mEnterRoomData.getGameCallback();
        if (!((Messages.OnDcmRoomEnterResultData) (logToClose)).success.booleanValue()) goto _L2; else goto _L1
_L1:
        ((Messages.DataHolderCallback) (obj)).run(mRoomDataHolder);
        logToClose = mStates.inRoomState;
        obj = mEnterRoomData.clientContext;
        long l = mEnterRoomData.clientId;
        Context context = mEnterRoomData.context;
        String s = mRoomId;
        Object obj1 = mEnterRoomData.realTimeGameDeathBinder;
        com.google.android.gms.games.service.WrappedGamesCallbacks wrappedgamescallbacks = mEnterRoomData.callbacks;
        ConnectionInfo connectioninfo = mConnectionInfo;
        RtmpSessionLog rtmpsessionlog = mEnterRoomData.sessionLog;
        logToClose.mRoomCreatorClientContext = (ClientContext)Preconditions.checkNotNull(obj);
        logToClose.mRoomCreatorClientId = ((Long)Preconditions.checkNotNull(Long.valueOf(l))).longValue();
        logToClose.mContext = (Context)Preconditions.checkNotNull(context);
        logToClose.mDeathSender = (InRoomState.DeathSender)Preconditions.checkNotNull(new InRoomState.DeathSender(logToClose, s, ((android.os.IBinder) (obj1))));
        logToClose.mConnectionInfo = (ConnectionInfo)Preconditions.checkNotNull(connectioninfo);
        ((InRoomState) (logToClose)).mCallBacksHelper.clear();
        obj1 = ((InRoomState) (logToClose)).mCallBacksHelper;
        obj1.mGamesCallBack = new InRoomState.RoomCallbacksHelper.OneCallback(((InRoomState.RoomCallbacksHelper) (obj1)), wrappedgamescallbacks, "mGamesCallBack");
        ((InRoomState.RoomCallbacksHelper) (obj1)).updateCbList();
        ((InRoomState) (logToClose)).mCallBacksHelper.mCurrentRoomId = s;
        logToClose.mRealTimeDataManager = new NetworkConnectedState.RealTimeDataManager(context, ((ClientContext) (obj)));
        logToClose.mSessionLog = (RtmpSessionLog)Preconditions.checkNotNull(rtmpsessionlog);
        ((InRoomState) (logToClose)).mSessionLog.mLog.roomId = s;
        Preconditions.checkNotNull(obj);
        logToClose.transitionToState();
_L4:
        mRoomDataHolder.close();
        mRoomDataHolder = null;
        return HANDLED;
_L2:
        ((Messages.DataHolderCallback) (obj)).run(DataHolder.empty(6));
        mEnterRoomData.sessionLog.oneupLeaveCallStart();
        logToClose = mEnterRoomData.sessionLog;
        logToClose.onLeavingRoom(0);
        mData.mOneup.leaveRoom(mEnterRoomData.context, mEnterRoomData.clientContext, new com.google.android.gms.games.service.PlayGamesAsyncService.RoomLeftCallback() {

            final WaitDcmEnterRoomState this$0;
            final RtmpSessionLog val$logToClose;

            public final void onLeftRoom(int i, String s1)
            {
                boolean flag;
                if (i == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                logToClose.onRoomLeaveDone(flag);
                logToClose.dispatchLog();
            }

            
            {
                this$0 = WaitDcmEnterRoomState.this;
                logToClose = rtmpsessionlog;
                super();
            }
        }, mRoomId, "REALTIME_SERVER_CONNECTION_FAILURE", null);
        mStates.networkConnectedState.transitionTo(mEnterRoomData.clientId, mEnterRoomData.clientContext, mConnectionInfo);
        if (true) goto _L4; else goto _L3
_L3:
        logToClose;
        mRoomDataHolder.close();
        mRoomDataHolder = null;
        throw logToClose;
    }
}
