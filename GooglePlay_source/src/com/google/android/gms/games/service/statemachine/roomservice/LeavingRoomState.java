// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomservice;

import android.os.Message;
import com.google.android.gms.games.realtime.network.DataConnectionManager;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomservice:
//            RoomServiceState, NetworkConnectedState, RoomServiceStateMachine

final class LeavingRoomState extends RoomServiceState
{

    String mMyJid;
    String mPlayerId;

    public LeavingRoomState(RoomServiceStateMachine roomservicestatemachine)
    {
        super(roomservicestatemachine);
    }

    public final boolean processMessage(Message message)
    {
        switch (message.what)
        {
        default:
            mSm.deferMessage(message);
            return HANDLED;

        case 20: // '\024'
            break;
        }
        if (((Messages.DoneLeavingRoomData)message.obj).result)
        {
            mData.mDataConnectionManager.unregisterWithBuzzbot();
        }
        mStates.networkConnectedState.transitionTo(mPlayerId, mMyJid);
        return HANDLED;
    }
}
