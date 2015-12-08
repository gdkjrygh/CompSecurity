// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.service.WrappedGamesCallbacks;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            RoomClientState, RoomServiceClientStateMachine, RtmpSessionLog, CleanupBindingState

final class DefaultHandlerState extends RoomClientState
{

    public DefaultHandlerState(RoomServiceClientStateMachine roomserviceclientstatemachine)
    {
        super(roomserviceclientstatemachine);
    }

    public final boolean processMessage(Message message)
    {
        switch (message.what)
        {
        case 22: // '\026'
        case 24: // '\030'
        case 25: // '\031'
        case 27: // '\033'
        case 30: // '\036'
        case 31: // '\037'
        case 32: // ' '
        case 33: // '!'
        case 34: // '"'
        case 35: // '#'
        case 36: // '$'
        case 37: // '%'
        case 38: // '&'
        case 39: // '\''
        case 41: // ')'
        case 42: // '*'
        case 44: // ','
        case 45: // '-'
        case 47: // '/'
        case 48: // '0'
        default:
            return false;

        case 40: // '('
        case 43: // '+'
            return HANDLED;

        case 21: // '\025'
            Log.e("RoomServiceClientStateMachine", "REGISTER_WAITING_ROOM_LISTENER_RESTRICTED: when not in room");
            ((Messages.RegisterWaitingRoomListenerRestrictedData)message.obj).setResult(DataHolder.empty(1));
            return HANDLED;

        case 20: // '\024'
            ((Messages.CreateNativeSocketData)message.obj).setResult(null);
            return HANDLED;

        case 19: // '\023'
            ((Messages.CreateSocketConnectionData)message.obj).setResult(null);
            return HANDLED;

        case 17: // '\021'
            message = (Messages.SendReliableMessageData)message.obj;
            try
            {
                ((Messages.SendReliableMessageData) (message)).callbacks.onMessageSent(6502, ((Messages.SendReliableMessageData) (message)).mToken, ((Messages.SendReliableMessageData) (message)).recipientParticipantIds);
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                RoomServiceClientStateMachine.handleGameRemoteFailure(message);
            }
            return HANDLED;

        case 18: // '\022'
            return HANDLED;

        case 29: // '\035'
            message = (Messages.EnterRoomData)message.obj;
            ((Messages.EnterRoomData) (message)).sessionLog.processedInState(0);
            ((Messages.EnterRoomData) (message)).sessionLog.dispatchLog();
            message.getGameCallback().run(DataHolder.empty(7000));
            return HANDLED;

        case 26: // '\032'
            message = (Messages.LeaveRoomData)message.obj;
            try
            {
                if (((Messages.LeaveRoomData) (message)).clientLeaveRoomData.callbacks != null)
                {
                    ((Messages.LeaveRoomData) (message)).clientLeaveRoomData.callbacks.onLeftRoom(7004, ((Messages.LeaveRoomData) (message)).clientLeaveRoomData.externalRoomId);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                RoomServiceClientStateMachine.handleGameRemoteFailure(message);
            }
            return HANDLED;

        case 16: // '\020'
            message = (Messages.ClientLeaveRoomData)message.obj;
            try
            {
                if (((Messages.ClientLeaveRoomData) (message)).callbacks != null)
                {
                    ((Messages.ClientLeaveRoomData) (message)).callbacks.onLeftRoom(7004, ((Messages.ClientLeaveRoomData) (message)).externalRoomId);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                RoomServiceClientStateMachine.handleGameRemoteFailure(message);
            }
            return HANDLED;

        case 14: // '\016'
            Log.e("RoomServiceClientStateMachine", "Unexpected: DONE_CLEANING");
            return HANDLED;

        case 13: // '\r'
            if (((Messages.RoomServiceGoneData)message.obj).validToken.isValid())
            {
                mStates.cleanupBindingState.transitionToState();
            }
            return HANDLED;

        case 28: // '\034'
            return HANDLED;

        case 23: // '\027'
            return HANDLED;

        case 46: // '.'
            Log.e("RoomServiceClientStateMachine", "Unexpected: ON_ROOM_LEFT");
            RoomServiceClientStateMachine.handleOnRoomLeft(this, message);
            return HANDLED;

        case 15: // '\017'
            ((Messages.OnRoomEnteredData)message.obj).roomDataHolder.close();
            return HANDLED;

        case 49: // '1'
            Log.e("RoomServiceClientStateMachine", "Unexpected: ON_DCM_ROOM_ENTER_RESULT");
            return HANDLED;
        }
    }
}
