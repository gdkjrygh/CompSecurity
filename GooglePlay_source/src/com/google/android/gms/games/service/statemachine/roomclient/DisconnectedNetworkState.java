// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IRoomService;
import com.google.android.gms.games.service.ConnectNetworkAuthenticator;
import com.google.android.gms.games.service.statemachine.IStateMachine;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            RoomClientState, ServiceSetupState, RtmpSessionLog, WaitConnectNetworkState, 
//            RoomServiceClientStateMachine

final class DisconnectedNetworkState extends RoomClientState
{

    public DisconnectedNetworkState(RoomServiceClientStateMachine roomserviceclientstatemachine)
    {
        super(roomserviceclientstatemachine);
    }

    private boolean connectNetwork(Messages.ConnectNetworkData connectnetworkdata, boolean flag)
    {
        String s = null;
        String s1 = mData.mAuthenticator.getAuthToken(connectnetworkdata.context, connectnetworkdata.clientContext, flag);
        s = s1;
_L2:
        if (s == null)
        {
            GamesLog.e("RoomServiceClientStateMachine", "Error getting auth token");
            return false;
        }
        break; /* Loop/switch isn't completed */
        GoogleAuthException googleauthexception;
        googleauthexception;
        GamesLog.e("RoomServiceClientStateMachine", "Google authentication error", googleauthexception);
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            mData.mRoomAndroidService.connectNetwork(connectnetworkdata.currentPlayerId, s, connectnetworkdata.bareJid);
        }
        // Misplaced declaration of an exception variable
        catch (Messages.ConnectNetworkData connectnetworkdata)
        {
            handleRasFailure(connectnetworkdata);
        }
        return true;
    }

    public final void enter()
    {
        setTimer(40, 60, TimeUnit.SECONDS);
    }

    public final boolean processMessage(Message message)
    {
        Object obj;
        Object obj1;
        boolean flag;
        boolean flag1;
        flag1 = true;
        switch (message.what)
        {
        default:
            return false;

        case 40: // '('
        case 42: // '*'
            try
            {
                mData.mRoomAndroidService.unloadLibraries();
                mStates.serviceSetupState.transitionToState();
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                handleRasFailure(message);
            }
            return HANDLED;

        case 29: // '\035'
            obj = (Messages.EnterRoomData)message.obj;
            ((Messages.EnterRoomData) (obj)).sessionLog.processedInState(2);
            obj1 = ((Messages.EnterRoomData) (obj)).sessionLog;
            break;
        }
        long l;
        if (((RtmpSessionLog) (obj1)).mLog.connectXmppStartTimeMs == 0L)
        {
            ((RtmpSessionLog) (obj1)).mLog.connectXmppStartTimeMs = ((RtmpSessionLog) (obj1)).deltaNow();
        } else
        {
            obj1 = ((RtmpSessionLog) (obj1)).mLog;
            obj1.connectXmppRetries = ((com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession) (obj1)).connectXmppRetries + 1;
        }
        obj1 = ((Messages.EnterRoomData) (obj)).getGameCallback();
        if (((Messages.EnterRoomData) (obj)).connectNetworkRetry.mConnectNetworkTryCount >= 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        mSm.logNote((new StringBuilder("Connect with retry.getRetryAuthToken(): ")).append(((Messages.EnterRoomData) (obj)).connectNetworkRetry.getRetryAuthToken()).toString());
        if (connectNetwork(((Messages.EnterRoomData) (obj)).connectNetworkData, ((Messages.EnterRoomData) (obj)).connectNetworkRetry.getRetryAuthToken())) goto _L4; else goto _L3
_L3:
        mSm.logNote("Unable to get auth token to try connect.");
        ((Messages.DataHolderCallback) (obj1)).run(DataHolder.empty(6));
_L7:
        flag = false;
_L5:
        if (flag)
        {
            message = mStates.waitConnectNetworkState;
            l = ((Messages.EnterRoomData) (obj)).clientId;
            obj1 = ((Messages.EnterRoomData) (obj)).clientContext;
            obj = ((Messages.EnterRoomData) (obj)).sessionLog;
            message.mConnectorClientId = l;
            message.mConnectorClientContext = ((com.google.android.gms.common.internal.ClientContext) (obj1));
            message.mSessionLog = (RtmpSessionLog)Preconditions.checkNotNull(obj);
            message.transitionToState();
        } else
        {
            ((Messages.EnterRoomData) (obj)).sessionLog.onConnectNetworkDone(false);
            ((Messages.EnterRoomData) (obj)).sessionLog.dispatchLog();
        }
        return HANDLED;
_L4:
        mSm.logNote("Trying to connect with returned auth token.");
        obj1 = ((Messages.EnterRoomData) (obj)).connectNetworkRetry;
        obj1.mConnectNetworkTryCount = ((Messages.ConnectNetworkRetry) (obj1)).mConnectNetworkTryCount + 1;
        mSm.deferMessage(message);
        flag = flag1;
          goto _L5
_L2:
        mSm.logNote("Unable to connect to network -- failing");
        ((Messages.DataHolderCallback) (obj1)).run(DataHolder.empty(4));
        if (true) goto _L7; else goto _L6
_L6:
    }
}
