// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            Messages

public static final class recipientParticipantIds extends MessageBase
{

    public final WrappedGamesCallbacks callbacks;
    public int mToken;
    public final byte messageData[];
    public final String recipientParticipantIds;
    public final String roomId;

    public (WrappedGamesCallbacks wrappedgamescallbacks, byte abyte0[], String s, String s1)
    {
        super(17);
        callbacks = wrappedgamescallbacks;
        messageData = abyte0;
        roomId = s;
        recipientParticipantIds = s1;
    }
}
