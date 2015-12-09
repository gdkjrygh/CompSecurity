// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            DcmMessages, SocketProxy

public static final class remoteJid extends MessageBase
{

    public final String remoteJid;
    public final SocketProxy sender;

    public (String s, SocketProxy socketproxy)
    {
        super(6013);
        sender = socketproxy;
        remoteJid = s;
    }
}
