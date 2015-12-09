// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.Message;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            LibjingleDependentState, DisconnectedNetworkState, RoomServiceClientStateMachine

final class WaitNetworkDisconnectState extends LibjingleDependentState
{

    public WaitNetworkDisconnectState(RoomServiceClientStateMachine roomserviceclientstatemachine)
    {
        super(roomserviceclientstatemachine, 10);
    }

    public final boolean processNonTimerMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 39: // '\''
            mStates.disconnectedNetworkState.transitionToState();
            return HANDLED;

        case 29: // '\035'
            mSm.deferMessage(message);
            return HANDLED;
        }
    }
}
