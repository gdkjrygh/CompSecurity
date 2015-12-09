// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import com.google.android.gms.games.service.statemachine.FutureMessage;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            DcmMessages

public static final class peerJid extends FutureMessage
{

    public final String peerJid;

    public (String s)
    {
        super(6004);
        peerJid = s;
    }
}
