// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            Messages

public static final class externalRoomId extends MessageBase
{

    public final WrappedGamesCallbacks callbacks;
    public final ClientContext clientContext;
    public final Context context;
    public final String externalRoomId;

    public (Context context1, ClientContext clientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s)
    {
        super(16);
        context = (Context)Preconditions.checkNotNull(context1);
        clientContext = (ClientContext)Preconditions.checkNotNull(clientcontext);
        callbacks = wrappedgamescallbacks;
        externalRoomId = (String)Preconditions.checkNotNull(s);
    }
}
