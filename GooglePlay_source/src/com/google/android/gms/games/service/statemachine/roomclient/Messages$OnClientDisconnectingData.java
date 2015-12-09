// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            Messages

public static final class context extends MessageBase
{

    public final ClientContext clientContext;
    public final long clientId;
    public final Context context;

    public (Context context1, ClientContext clientcontext, long l)
    {
        super(28);
        clientContext = clientcontext;
        clientId = l;
        context = context1;
    }
}
