// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            Messages

public static final class reliable extends MessageBase
{

    public final String fromId;
    public final byte messageData[];
    public final int reliable;

    public i(String s, byte abyte0[], int i)
    {
        super(32);
        fromId = s;
        messageData = abyte0;
        reliable = i;
    }
}
