// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.statemachine.FutureMessage;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            Messages

public static final class externalRoomId extends FutureMessage
{

    public final WrappedGamesCallbacks callbacks;
    public final String externalRoomId;

    public (WrappedGamesCallbacks wrappedgamescallbacks, String s)
    {
        super(21);
        callbacks = wrappedgamescallbacks;
        externalRoomId = s;
    }
}
