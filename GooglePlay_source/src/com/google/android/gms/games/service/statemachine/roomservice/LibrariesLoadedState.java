// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomservice;

import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.games.internal.IRoomServiceCallbacks;
import com.google.android.gms.games.realtime.network.DataConnectionManager;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomservice:
//            RoomServiceState, RoomServiceStateMachine, LibrariesUnloadedState, NetworkConnectingState

final class LibrariesLoadedState extends RoomServiceState
{

    public LibrariesLoadedState(RoomServiceStateMachine roomservicestatemachine)
    {
        super(roomservicestatemachine);
    }

    public final boolean processMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 2: // '\002'
            return HANDLED;

        case 19: // '\023'
            try
            {
                mData.mRoomService.onNetworkDisconnected();
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                RoomServiceStateMachine.handleRemoteRoomServiceException(message);
            }
            return HANDLED;

        case 15: // '\017'
            try
            {
                mData.mRoomService.onLibrariesLoaded(0);
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                RoomServiceStateMachine.handleRemoteRoomServiceException(message);
            }
            return HANDLED;

        case 18: // '\022'
            mData.mDataConnectionManager.cleanup();
            mData.mDataConnectionManager = null;
            mStates.librariesUnloadedState.transitionToState();
            return HANDLED;

        case 14: // '\016'
            message = (Messages.ConnectNetworkData)message.obj;
            mData.mDataConnectionManager.prepareNetworkForMatch(((Messages.ConnectNetworkData) (message)).authToken, ((Messages.ConnectNetworkData) (message)).playerId);
            NetworkConnectingState networkconnectingstate = mStates.networkConnectingState;
            networkconnectingstate.mPlayerId = ((Messages.ConnectNetworkData) (message)).playerId;
            networkconnectingstate.transitionToState();
            return HANDLED;
        }
    }
}
