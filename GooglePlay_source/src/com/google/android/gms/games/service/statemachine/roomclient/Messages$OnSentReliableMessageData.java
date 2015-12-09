// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            Messages

public static final class participantId extends MessageBase
{

    public final String participantId;
    public final int statusCode;
    public final int token;

    public (int i, int j, String s)
    {
        super(31);
        statusCode = i;
        token = j;
        participantId = s;
    }
}
