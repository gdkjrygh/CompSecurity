// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import android.os.Message;
import com.google.android.gms.games.jingle.Libjingle;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            PeerStateMachine

private final class g.RtmpPeerLog.enteredState extends e
{

    final PeerStateMachine this$0;

    public final boolean processMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 2: // '\002'
            message = (com.google.android.gms.games.jingle.gedOpData)message.obj;
            if (((com.google.android.gms.games.jingle.gedOpData) (message)).newState == 2)
            {
                mLibjingle.nativeAcceptCall(((com.google.android.gms.games.jingle.gedOpData) (message)).sessionId);
                mNextState = new solicitedRemoteConnection(PeerStateMachine.this, ((com.google.android.gms.games.jingle.gedOpData) (message)).remoteJid, ((com.google.android.gms.games.jingle.gedOpData) (message)).sessionId, mPresenceCount, mPeerLog);
            }
            return true;

        case 6009: 
            message = (mPeerLog)message.obj;
            mSm.logNote((new StringBuilder("Setting peer ")).append(((mPeerLog) (message)).fullPeerJid).append(" capabilities to ").append(((fullPeerJid) (message)).peerCapabilities).toString());
            mLibjingle.nativeSetPeerCapabilities(((peerCapabilities) (message)).fullPeerJid, ((fullPeerJid) (message)).peerCapabilities);
            break;
        }
        if (((peerCapabilities) (message)).isPeerInitiator)
        {
            mNextState = new xpectedConnection(PeerStateMachine.this, remoteJid, ((remoteJid) (message)).peerCapabilities, mPresenceCount, mPeerLog);
        } else
        {
            mLibjingle.nativeCall("", ((mPeerLog) (message)).fullPeerJid, 0);
            mNextState = new utgoingRemoteConnectionNoSessionId(PeerStateMachine.this, remoteJid, ((remoteJid) (message)).peerCapabilities, mPresenceCount, mPeerLog);
        }
        return true;
    }

    public sionId(String s, com.google.android.gms.games.service.statemachine.roomclient.nnectionNoSessionId nnectionnosessionid)
    {
        this$0 = PeerStateMachine.this;
        super(PeerStateMachine.this, s, null, 0, nnectionnosessionid);
        mPeerLog.nteredState(1);
    }
}
