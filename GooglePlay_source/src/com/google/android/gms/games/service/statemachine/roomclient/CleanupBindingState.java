// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.Message;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            RoomClientState, UnboundState, RoomServiceClientStateMachine

final class CleanupBindingState extends RoomClientState
{

    public CleanupBindingState(RoomServiceClientStateMachine roomserviceclientstatemachine)
    {
        super(roomserviceclientstatemachine);
    }

    public final void enter()
    {
        if (mData.roomServiceConnection != null)
        {
            mSm.logNote("Unbinding from service");
            ConnectionTracker.getInstance().unbindService(mData.roomServiceConnection.mContext, mData.roomServiceConnection);
            mData.roomServiceConnection = null;
        }
        mSm.sendMessage(new Messages.DoneCleaningData());
    }

    public final boolean processMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 14: // '\016'
            mStates.unboundState.transitionToState();
            break;
        }
        return HANDLED;
    }
}
