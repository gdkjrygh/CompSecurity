// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.Message;
import android.util.Log;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            RoomClientState, RoomServiceClientStateMachine, NetworkConnectedState, RtmpSessionLog

final class WaitForHttpLeaveState extends RoomClientState
{

    RtmpSessionLog mSessionLog;

    public WaitForHttpLeaveState(RoomServiceClientStateMachine roomserviceclientstatemachine)
    {
        super(roomserviceclientstatemachine);
    }

    public final boolean processMessage(Message message)
    {
        boolean flag = false;
        switch (message.what)
        {
        default:
            return false;

        case 39: // '\''
        case 41: // ')'
            mSm.deferMessage(message);
            return HANDLED;

        case 46: // '.'
            Messages.OnRoomLeftData onroomleftdata = (Messages.OnRoomLeftData)message.obj;
            RoomServiceClientStateMachine.handleOnRoomLeft(this, message);
            mStates.networkConnectedState.transitionTo(onroomleftdata.leaveRoomData.mConnectorClientId, onroomleftdata.leaveRoomData.mConnectorClientContext, onroomleftdata.leaveRoomData.mConnectionInfo);
            message = mSessionLog;
            if (onroomleftdata.status == 0)
            {
                flag = true;
            }
            message.onRoomLeaveDone(flag);
            mSessionLog.dispatchLog();
            if (onroomleftdata.status != 0)
            {
                Log.i("RoomServiceClientStateMachine", "Disconnecting network because room leave failed!");
                mSm.sendMessageAtFrontOfQueue(new Messages.DisconnectNetworkData());
            }
            return HANDLED;

        case 29: // '\035'
            ((Messages.EnterRoomData)message.obj).sessionLog.processedInState(12);
            mSm.deferMessage(message);
            return HANDLED;
        }
    }
}
