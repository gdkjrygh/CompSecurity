// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomservice;

import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IRoomServiceCallbacks;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomservice:
//            RoomServiceState, RoomServiceStateMachine

final class DefaultHandlerState extends RoomServiceState
{

    public DefaultHandlerState(RoomServiceStateMachine roomservicestatemachine)
    {
        super(roomservicestatemachine);
    }

    public final boolean processMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 20: default 500
    //                   0 104
    //                   1 133
    //                   2 380
    //                   3 162
    //                   4 181
    //                   5 215
    //                   6 243
    //                   7 255
    //                   8 259
    //                   9 263
    //                   10 267
    //                   11 271
    //                   12 345
    //                   13 229
    //                   14 368
    //                   15 400
    //                   16 420
    //                   17 440
    //                   18 460
    //                   19 480
    //                   20 356;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L2:
        message = (Messages.CreateSocketConnectionData)message.obj;
        mData.mRoomService.onCreateSocketConnection(null, ((Messages.CreateSocketConnectionData) (message)).token);
        return HANDLED;
_L3:
        message = (Messages.CreateNativeSocketConnectionData)message.obj;
        mData.mRoomService.onCreateNativeLibjingleSocket(null, ((Messages.CreateNativeSocketConnectionData) (message)).token);
        return HANDLED;
_L5:
        Log.e("RoomServiceStateMachine", "Unexpected: LEAVE_ROOM");
        mRsm.leaveRoomWithoutDiagnostics();
        return HANDLED;
_L6:
        message = (Messages.EnterRoomData)message.obj;
        mData.mRoomService.onEnterRoomResult(((Messages.EnterRoomData) (message)).room.getRoomId(), false);
        return HANDLED;
_L7:
        mSm.deferMessage(message);
        return HANDLED;
_L15:
        mSm.deferMessage(message);
        return HANDLED;
_L8:
        Log.e("RoomServiceStateMachine", "Unexpected: PEER_JOINED");
        return HANDLED;
_L9:
        return HANDLED;
_L10:
        return HANDLED;
_L11:
        return HANDLED;
_L12:
        return HANDLED;
_L13:
        message = (Messages.SendReliableMessageData)message.obj;
        GamesLog.e("RoomServiceStateMachine", String.format("Failed to send message %s. Message can be sent only inside a room", new Object[] {
            Integer.valueOf(((Messages.SendReliableMessageData) (message)).clientToken)
        }));
        mData.mRoomService.onSentReliableMessage(7004, ((Messages.SendReliableMessageData) (message)).clientToken, ((Messages.SendReliableMessageData) (message)).recipientParticipantId);
          goto _L23
        message;
        RoomServiceStateMachine.handleRemoteRoomServiceException(message);
_L23:
        try
        {
            return HANDLED;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            RoomServiceStateMachine.handleRemoteRoomServiceException(message);
        }
        return false;
_L14:
        GamesLog.e("RoomServiceStateMachine", "Can't sent a message while not in room");
        return HANDLED;
_L22:
        Log.e("RoomServiceStateMachine", "Unexpected: DONE_LEAVING_ROOM");
        return HANDLED;
_L16:
        Log.e("RoomServiceStateMachine", "Unexpected: CONNECT_NETWORK");
        return HANDLED;
_L4:
        throw new RoomServiceStateMachine.StateMachineErrorException(mSm.getCurrentState(), message, "Unexpected: NETWORK_DISCONNECTED");
_L17:
        throw new RoomServiceStateMachine.StateMachineErrorException(mSm.getCurrentState(), message, "Unexpected: DCM_CONNECT");
_L18:
        throw new RoomServiceStateMachine.StateMachineErrorException(mSm.getCurrentState(), message, "Unexpected: DCM_CONNECT_FAILED");
_L19:
        throw new RoomServiceStateMachine.StateMachineErrorException(mSm.getCurrentState(), message, "Unexpected: DCM_CONNECT_OK");
_L20:
        throw new RoomServiceStateMachine.StateMachineErrorException(mSm.getCurrentState(), message, "Unexpected: DCM_DISCONNECT");
_L21:
        throw new RoomServiceStateMachine.StateMachineErrorException(mSm.getCurrentState(), message, "Unexpected: DISCONNECT_NETWORK");
_L1:
        return false;
    }
}
