// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomservice;

import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.games.internal.IRoomServiceCallbacks;
import com.google.android.gms.games.internal.constants.Capability;
import com.google.android.gms.games.realtime.network.DcmFactory;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomservice:
//            RoomServiceState, LibrariesLoadedState, RoomServiceStateMachine

final class LibrariesUnloadedState extends RoomServiceState
{

    public LibrariesUnloadedState(RoomServiceStateMachine roomservicestatemachine)
    {
        super(roomservicestatemachine);
    }

    public final boolean processMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 15: // '\017'
            message = (Messages.LoadLibrariesData)message.obj;
            try
            {
                mData.mContext = ((Messages.LoadLibrariesData) (message)).context;
                mData.mDataConnectionManager = mData.mDcmFactory.build(((Messages.LoadLibrariesData) (message)).context, mData.mDcmCallBacks, Capability.getSupportedCapabilitiesAsInteger());
                mData.mRoomService.onLibrariesLoaded(0);
                mStates.librariesLoadedState.transitionToState();
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                mSm.logException("Unable to load libraries", message);
                try
                {
                    mData.mRoomService.onLibrariesLoaded(-1);
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    RoomServiceStateMachine.handleRemoteRoomServiceException(message);
                }
            }
            return HANDLED;

        case 18: // '\022'
            return HANDLED;

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

        case 3: // '\003'
            mRsm.leaveRoomWithoutDiagnostics();
            return HANDLED;
        }
    }
}
