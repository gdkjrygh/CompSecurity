// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.RemoteException;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.internal.IRoomService;
import com.google.android.gms.games.service.statemachine.IStateMachine;
import com.google.android.gms.games.service.statemachine.MessageTokenHelper;
import com.google.android.gms.games.service.statemachine.MultiFileStateMachine;
import com.google.android.gms.games.service.statemachine.TypeSafeTransitionState;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            RoomServiceClientStateMachine

abstract class RoomClientState extends TypeSafeTransitionState
{

    protected final RoomServiceClientStateMachine.StateData mData;
    protected final RoomServiceClientStateMachine mRsm;
    protected final IStateMachine mSm;
    protected final RoomServiceClientStateMachine.States mStates;

    protected RoomClientState(RoomServiceClientStateMachine roomserviceclientstatemachine)
    {
        super(((MultiFileStateMachine) (roomserviceclientstatemachine)).mStateMachine);
        mRsm = roomserviceclientstatemachine;
        mData = (RoomServiceClientStateMachine.StateData)((MultiFileStateMachine) (roomserviceclientstatemachine)).mData;
        mSm = ((MultiFileStateMachine) (roomserviceclientstatemachine)).mStateMachine;
        mStates = (RoomServiceClientStateMachine.States)((MultiFileStateMachine) (roomserviceclientstatemachine)).mStates;
    }

    protected static RemoteException getRemoteException(String s)
    {
        if (PlatformVersion.checkVersion(15))
        {
            return new RemoteException(s);
        } else
        {
            return new RemoteException();
        }
    }

    protected final void handleRasFailure(RemoteException remoteexception)
    {
        mRsm.handleRasFailure(remoteexception);
    }

    protected final void killRoomAndroidService$552c4e01()
    {
        try
        {
            mData.mRoomAndroidService.kill("Libjingle did not disconnect");
            mData.roomServiceGoneToken.getToken();
            return;
        }
        catch (RemoteException remoteexception)
        {
            handleRasFailure(remoteexception);
        }
    }
}
