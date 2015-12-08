// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomservice;

import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.games.internal.IRoomServiceCallbacks;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomservice:
//            RoomServiceState, LibrariesLoadedState, RoomServiceStateMachine

final class WaitNetworkDisconnectState extends RoomServiceState
{

    public WaitNetworkDisconnectState(RoomServiceStateMachine roomservicestatemachine)
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

        case 2: // '\002'
            break;
        }
        try
        {
            mData.mRoomService.onNetworkDisconnected();
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            RoomServiceStateMachine.handleRemoteRoomServiceException(message);
        }
        mStates.librariesLoadedState.transitionToState();
        return HANDLED;
    }
}
