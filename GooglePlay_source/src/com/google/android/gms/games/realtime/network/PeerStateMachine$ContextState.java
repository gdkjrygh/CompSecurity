// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import android.os.Message;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            PeerStateMachine

private abstract class mPeerLog
{

    protected final com.google.android.gms.games.service.statemachine.roomclient. mPeerLog;
    protected int mPresenceCount;
    public final String remoteJid;
    final String sessionId;
    final PeerStateMachine this$0;

    public final String getName()
    {
        String s = getClass().getName();
        int i = s.lastIndexOf('$');
        return (new StringBuilder()).append(s.substring(i + 1)).append("-").append(remoteJid).toString();
    }

    public abstract boolean processMessage(Message message);

    protected RtmpPeerLog(String s, String s1, int i, com.google.android.gms.games.service.statemachine.roomclient. )
    {
        this$0 = PeerStateMachine.this;
        super();
        remoteJid = s;
        sessionId = s1;
        mPresenceCount = i;
        mPeerLog = ;
    }
}
