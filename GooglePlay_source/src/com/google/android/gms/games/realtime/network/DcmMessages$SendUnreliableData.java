// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            DcmMessages

public static final class recipientJids extends MessageBase
{

    public final byte messageData[];
    public final String recipientJids[];

    public (byte abyte0[], String as[])
    {
        super(6008);
        messageData = abyte0;
        recipientJids = as;
    }
}
