// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomservice;

import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.games.internal.ConnectionInfo;
import com.google.android.gms.games.internal.IRoomServiceCallbacks;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomservice:
//            RoomServiceState, NetworkConnectedState, RoomServiceStateMachine, LibrariesLoadedState

final class NetworkConnectingState extends RoomServiceState
{

    String mPlayerId;

    public NetworkConnectingState(RoomServiceStateMachine roomservicestatemachine)
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

        case 17: // '\021'
            message = (Messages.DcmConnectOkData)message.obj;
            try
            {
                mData.mRoomService.onNetworkConnected(new ConnectionInfo(((Messages.DcmConnectOkData) (message)).fullJid, ((Messages.DcmConnectOkData) (message)).registrationLatency));
                mStates.networkConnectedState.transitionTo(mPlayerId, ((Messages.DcmConnectOkData) (message)).fullJid);
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                RoomServiceStateMachine.handleRemoteRoomServiceException(message);
            }
            return HANDLED;

        case 16: // '\020'
            break;
        }
        try
        {
            mData.mRoomService.onNetworkConnected(null);
            mStates.librariesLoadedState.transitionToState();
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            RoomServiceStateMachine.handleRemoteRoomServiceException(message);
        }
        return HANDLED;
    }
}
