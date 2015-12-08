// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            Messages

public static final class roomP2PStatusesJson extends MessageBase
{

    public final String matchId;
    public final String roomP2PStatusesJson[];

    public (String s, String as[])
    {
        super(9);
        matchId = s;
        roomP2PStatusesJson = as;
    }
}
