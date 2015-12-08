// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            DcmMessages

public static final class peerCapabilities extends MessageBase
{

    public final String fullPeerJid;
    public final boolean isPeerInitiator;
    public final int peerCapabilities;

    public (String s, boolean flag, int i)
    {
        super(6009);
        fullPeerJid = s;
        isPeerInitiator = flag;
        peerCapabilities = i;
    }
}
