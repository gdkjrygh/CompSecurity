// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomservice;

import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomservice:
//            Messages

public static final class peerJid extends MessageBase
{

    public final int dcmToken;
    public final String peerJid;
    public final int statusCode;

    public (int i, int j, String s)
    {
        super(10);
        dcmToken = i;
        statusCode = j;
        peerJid = s;
    }
}
