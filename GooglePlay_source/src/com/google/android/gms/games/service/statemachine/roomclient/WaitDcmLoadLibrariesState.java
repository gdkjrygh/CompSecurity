// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.Message;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            RoomClientState, DisconnectedNetworkState, UnboundState, RoomServiceClientStateMachine

final class WaitDcmLoadLibrariesState extends RoomClientState
{

    public WaitDcmLoadLibrariesState(RoomServiceClientStateMachine roomserviceclientstatemachine)
    {
        super(roomserviceclientstatemachine);
    }

    public final boolean processMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 25: // '\031'
            if (((Messages.OnLibrariesLoadedData)message.obj).statusCode == 0)
            {
                mStates.disconnectedNetworkState.transitionToState();
            } else
            {
                killRoomAndroidService$552c4e01();
                mStates.unboundState.transitionToState();
            }
            return HANDLED;

        case 29: // '\035'
            mSm.deferMessage(message);
            return HANDLED;
        }
    }
}
