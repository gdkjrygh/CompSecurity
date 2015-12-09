// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.ConnectionInfo;
import com.google.android.gms.games.internal.IRoomService;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomBuffer;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            RoomClientState, WaitDcmEnterRoomState, RtmpSessionLog, NetworkConnectedState, 
//            RoomServiceClientStateMachine

final class WaitOneupEnterRoomState extends RoomClientState
{

    ConnectionInfo mConnectionInfo;

    public WaitOneupEnterRoomState(RoomServiceClientStateMachine roomserviceclientstatemachine)
    {
        super(roomserviceclientstatemachine);
    }

    public final boolean processMessage(Message message)
    {
        message.what;
        JVM INSTR lookupswitch 4: default 48
    //                   15: 78
    //                   28: 50
    //                   29: 409
    //                   39: 64;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return false;
_L3:
        mSm.deferMessage(message);
        return HANDLED;
_L5:
        mSm.deferMessage(message);
        return HANDLED;
_L2:
        Object obj;
        Messages.OnRoomEnteredData onroomentereddata;
        Messages.DataHolderCallback dataholdercallback;
        onroomentereddata = (Messages.OnRoomEnteredData)message.obj;
        dataholdercallback = onroomentereddata.enterRoomData.getGameCallback();
        obj = onroomentereddata.roomDataHolder;
        message = null;
        if (((DataHolder) (obj)).mStatusCode == 0) goto _L7; else goto _L6
_L6:
        dataholdercallback.run(((DataHolder) (obj)));
_L13:
        if (message == null) goto _L9; else goto _L8
_L8:
        mData.mRoomAndroidService.enterRoom(((DataHolder) (obj)), onroomentereddata.enterRoomData.enableSockets);
_L10:
        WaitDcmEnterRoomState waitdcmenterroomstate = mStates.waitDcmEnterRoomState;
        ConnectionInfo connectioninfo = mConnectionInfo;
        Messages.EnterRoomData enterroomdata = onroomentereddata.enterRoomData;
        waitdcmenterroomstate.mConnectionInfo = (ConnectionInfo)Preconditions.checkNotNull(connectioninfo);
        waitdcmenterroomstate.mEnterRoomData = (Messages.EnterRoomData)Preconditions.checkNotNull(enterroomdata);
        waitdcmenterroomstate.mRoomId = (String)Preconditions.checkNotNull(message);
        waitdcmenterroomstate.mRoomDataHolder = (DataHolder)Preconditions.checkNotNull(obj);
        waitdcmenterroomstate.transitionToState();
        obj = null;
_L11:
        if (obj != null)
        {
            ((DataHolder) (obj)).close();
        }
        obj = onroomentereddata.enterRoomData.sessionLog;
        Object obj1;
        RemoteException remoteexception;
        boolean flag;
        if (message != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((RtmpSessionLog) (obj)).mLog.enterCallEndTimeMs = ((RtmpSessionLog) (obj)).deltaNow();
        ((RtmpSessionLog) (obj)).mLog.enterCallResult = flag;
        return HANDLED;
_L7:
        obj1 = new RoomBuffer(((DataHolder) (obj)));
        if (((RoomBuffer) (obj1)).getCount() > 0)
        {
            obj1 = (Room)((Room)((RoomBuffer) (obj1)).get(0)).freeze();
            message = ((Room) (obj1)).getRoomId();
            mSm.logNote((new StringBuilder("Entering room: ")).append(obj1).toString());
        }
        continue; /* Loop/switch isn't completed */
        message;
        if (obj != null)
        {
            ((DataHolder) (obj)).close();
        }
        throw message;
        remoteexception;
        handleRasFailure(remoteexception);
          goto _L10
_L9:
        onroomentereddata.enterRoomData.sessionLog.dispatchLog();
        mStates.networkConnectedState.transitionTo(onroomentereddata.enterRoomData.clientId, onroomentereddata.enterRoomData.clientContext, mConnectionInfo);
          goto _L11
_L4:
        mSm.deferMessage(message);
        return HANDLED;
        if (true) goto _L13; else goto _L12
_L12:
    }
}
