// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.Message;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            RoomClientState, ServiceIpcState, RoomServiceClientStateMachine

final class WaitServiceConnectState extends RoomClientState
{

    public WaitServiceConnectState(RoomServiceClientStateMachine roomserviceclientstatemachine)
    {
        super(roomserviceclientstatemachine);
    }

    public final boolean processMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 12: // '\f'
            message = (Messages.ServiceConnectedData)message.obj;
            mData.mRoomAndroidService = com.google.android.gms.games.internal.IRoomService.Stub.asInterface(((Messages.ServiceConnectedData) (message)).binder);
            mStates.serviceIpcState.transitionToState();
            return HANDLED;

        case 29: // '\035'
            mSm.deferMessage(message);
            break;
        }
        return HANDLED;
    }
}
