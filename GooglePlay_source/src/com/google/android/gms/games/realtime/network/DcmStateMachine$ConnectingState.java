// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import android.os.Message;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.jingle.Libjingle;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            DcmStateMachine, DataConnectionCallbacks

static final class e extends e
{

    public final boolean processMessage(Message message)
    {
        switch (message.what)
        {
        default:
            mSm.deferMessage(message);
            return HANDLED;

        case 1: // '\001'
            message = (com.google.android.gms.games.jingle.dOpData)message.obj;
            if (((com.google.android.gms.games.jingle.dOpData) (message)).signedIn)
            {
                mData.gle.nativeSubscribeToBuzzChannels(((Boolean)G.enableBuzzbotSubscription.get()).booleanValue());
                mData.gle.nativeListenForBuzzNotifications();
                tate tate = mStates.ngBuzzState;
                String s = ((com.google.android.gms.games.jingle.dOpData) (message)).localJid;
                int i = ((com.google.android.gms.games.jingle.dOpData) (message)).latencyMs;
                tate.mLocalJid = s;
                tate.mLatencyMs = i;
                tate.transitionToState();
            } else
            {
                mData.lbacks.onNetworkFailedForMatch();
                mStates.tedState.transitionToState();
            }
            return HANDLED;

        case 6001: 
            mData.gle.release();
            mSm.quit();
            return HANDLED;
        }
    }

    public e(DcmStateMachine dcmstatemachine)
    {
        super(dcmstatemachine);
    }
}
