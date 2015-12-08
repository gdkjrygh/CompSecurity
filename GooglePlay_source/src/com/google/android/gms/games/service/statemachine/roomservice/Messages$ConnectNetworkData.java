// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomservice;

import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomservice:
//            Messages

public static final class accountBareJid extends MessageBase
{

    public final String accountBareJid;
    public final String authToken;
    public final String playerId;

    public (String s, String s1, String s2)
    {
        super(14);
        playerId = s;
        authToken = s1;
        accountBareJid = s2;
    }
}
