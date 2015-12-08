// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.app.GmsApplicationContext;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IRoomService;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            RoomClientState, CleanupBindingState, WaitDcmLoadLibrariesState, RoomServiceClientStateMachine

final class ServiceSetupState extends RoomClientState
{

    public ServiceSetupState(RoomServiceClientStateMachine roomserviceclientstatemachine)
    {
        super(roomserviceclientstatemachine);
    }

    public final boolean processMessage(Message message)
    {
        boolean flag = false;
        Messages.LoadLibrariesRetry loadlibrariesretry;
        switch (message.what)
        {
        default:
            return false;

        case 29: // '\035'
            loadlibrariesretry = ((Messages.EnterRoomData)message.obj).loadLibrariesRetry;
            break;
        }
        mSm.deferMessage(message);
        if (loadlibrariesretry.mLoadTries >= 2)
        {
            flag = true;
        }
        if (flag)
        {
            mStates.cleanupBindingState.transitionToState();
        } else
        {
            try
            {
                loadlibrariesretry.mLoadTries = loadlibrariesretry.mLoadTries + 1;
                mData.mRoomAndroidService.loadLibraries();
                mStates.waitDcmLoadLibrariesState.transitionToState();
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                mStates.cleanupBindingState.transitionToState();
                GamesLog.wtf(GmsApplicationContext.getInstance(), "RoomServiceClientStateMachine", "Unable to load libjingle.");
            }
        }
        return HANDLED;
    }
}
