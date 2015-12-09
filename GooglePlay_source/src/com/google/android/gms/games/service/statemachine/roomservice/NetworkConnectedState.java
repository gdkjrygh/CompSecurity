// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomservice;

import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IRoomServiceCallbacks;
import com.google.android.gms.games.multiplayer.ParticipantUtils;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.realtime.RoomData;
import com.google.android.gms.games.realtime.RoomParticipant;
import com.google.android.gms.games.realtime.network.DataConnectionManager;
import com.google.android.gms.games.service.statemachine.IStateMachine;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomservice:
//            RoomServiceState, RoomServiceStateMachine, WaitNetworkDisconnectState, InRoomState

final class NetworkConnectedState extends RoomServiceState
{

    private String mMyJid;
    private String mPlayerId;

    public NetworkConnectedState(RoomServiceStateMachine roomservicestatemachine)
    {
        super(roomservicestatemachine);
    }

    private void handleAlreadyJoinedPlayers(RoomData roomdata)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = roomdata.getPeerParticipants().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            RoomParticipant roomparticipant = (RoomParticipant)iterator.next();
            if (!roomparticipant.mParticipantId.equals(roomdata.mCurrentParticipantId) && roomparticipant.mParticipantStatus == 2)
            {
                arraylist.add(roomparticipant);
                if (RoomServiceStateMachine.DBG)
                {
                    GamesLog.d("RoomServiceStateMachine", (new StringBuilder("Participant Joined = ")).append(roomparticipant.mParticipantId).toString());
                }
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            mRsm.sendMessage(6, arraylist);
        }
    }

    public final boolean processMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 2: // '\002'
            mSm.deferMessage(message);
            mStates.waitNetworkDisconnectState.transitionToState();
            return HANDLED;

        case 5: // '\005'
            mSm.deferMessage(message);
            return HANDLED;

        case 4: // '\004'
            message = (Messages.EnterRoomData)message.obj;
            RoomData roomdata = new RoomData(mPlayerId, ((Messages.EnterRoomData) (message)).room);
            mSm.logNote((new StringBuilder("mPlayerId: ")).append(mPlayerId).append(" Enter room: ").append(roomdata.toString()).toString());
            mData.mDataConnectionManager.registerWithBuzzbot(roomdata.mRoomId);
            handleAlreadyJoinedPlayers(roomdata);
            try
            {
                mData.mRoomService.onEnterRoomResult(((Messages.EnterRoomData) (message)).room.getRoomId(), true);
            }
            catch (RemoteException remoteexception)
            {
                RoomServiceStateMachine.handleRemoteRoomServiceException(remoteexception);
            }
            mStates.inRoomState.transitionTo(mPlayerId, roomdata, ((Messages.EnterRoomData) (message)).enableSockets, mMyJid);
            return HANDLED;

        case 19: // '\023'
            mData.mDataConnectionManager.tearDown();
            mStates.waitNetworkDisconnectState.transitionToState();
            return HANDLED;
        }
    }

    public final void transitionTo(String s, String s1)
    {
        mPlayerId = s;
        mMyJid = s1;
        boolean flag;
        if (!ParticipantUtils.isValidParticipantId(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Expecting player id!");
        transitionToState();
    }
}
