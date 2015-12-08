// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomservice;

import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomservice:
//            Messages

public static final class token extends MessageBase
{

    public String participantId;
    public int token;

    public (String s, int i)
    {
        super(0);
        participantId = s;
        token = i;
    }
}
