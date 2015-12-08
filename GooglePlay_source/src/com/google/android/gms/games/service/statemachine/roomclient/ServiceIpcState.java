// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.Binder;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.games.internal.IRoomService;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            RoomClientState, WaitServiceSetupState, RoomServiceClientStateMachine

final class ServiceIpcState extends RoomClientState
{

    public ServiceIpcState(RoomServiceClientStateMachine roomserviceclientstatemachine)
    {
        super(roomserviceclientstatemachine);
    }

    public final boolean processMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 29: // '\035'
            break;
        }
        try
        {
            mData.mRoomAndroidService.setup(new Binder(), mData.roomServiceCallbacks);
            mSm.deferMessage(message);
            mStates.waitServiceSetupState.transitionToState();
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            handleRasFailure(message);
        }
        return HANDLED;
    }
}
