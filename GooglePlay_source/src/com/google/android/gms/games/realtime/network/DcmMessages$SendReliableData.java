// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import com.google.android.gms.games.service.statemachine.FutureMessage;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            DcmMessages

public static final class recipientJid extends FutureMessage
{

    public final byte messageData[];
    public final String recipientJid;

    public (byte abyte0[], String s)
    {
        super(6007);
        messageData = abyte0;
        recipientJid = s;
    }
}
