// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.Message;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            LibjingleDependentState, RtmpSessionLog, DisconnectedNetworkState, NetworkConnectedState, 
//            RoomServiceClientStateMachine

final class WaitConnectNetworkState extends LibjingleDependentState
{

    ClientContext mConnectorClientContext;
    long mConnectorClientId;
    RtmpSessionLog mSessionLog;

    public WaitConnectNetworkState(RoomServiceClientStateMachine roomserviceclientstatemachine)
    {
        super(roomserviceclientstatemachine, ((Integer)G.rtmpLibjingleConnectTimeoutSeconds.getBinderSafe()).intValue());
    }

    public final boolean processNonTimerMessage(Message message)
    {
        boolean flag = false;
        switch (message.what)
        {
        default:
            return false;

        case 24: // '\030'
            message = (Messages.ConnectNetworkOnConnectedData)message.obj;
            RtmpSessionLog rtmpsessionlog = mSessionLog;
            if (((Messages.ConnectNetworkOnConnectedData) (message)).connectionInfo != null)
            {
                flag = true;
            }
            rtmpsessionlog.onConnectNetworkDone(flag);
            if (((Messages.ConnectNetworkOnConnectedData) (message)).connectionInfo == null)
            {
                mStates.disconnectedNetworkState.transitionToState();
            } else
            {
                mStates.networkConnectedState.transitionTo(mConnectorClientId, mConnectorClientContext, ((Messages.ConnectNetworkOnConnectedData) (message)).connectionInfo);
            }
            return HANDLED;

        case 29: // '\035'
            ((Messages.EnterRoomData)message.obj).sessionLog.processedInState(10);
            mSm.deferMessage(message);
            return HANDLED;
        }
    }
}
