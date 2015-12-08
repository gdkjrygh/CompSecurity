// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            Messages

public static final class bareJid
{

    public final String bareJid;
    public final ClientContext clientContext;
    public final Context context;
    public final String currentPlayerId;
    public final String externalGameId;

    public (Context context1, String s, String s1, ClientContext clientcontext, String s2)
    {
        context = context1;
        currentPlayerId = s1;
        externalGameId = s;
        clientContext = clientcontext;
        bareJid = s2;
    }
}
