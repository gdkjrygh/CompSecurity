// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class Zd
    implements com.google.android.gms.common.api.ier
{

    private final RealTimeMessage Zd;

    public void a(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
    {
        realtimemessagereceivedlistener.onRealTimeMessageReceived(Zd);
    }

    public void c(Object obj)
    {
        a((RealTimeMessageReceivedListener)obj);
    }

    public void gG()
    {
    }

    ner(RealTimeMessage realtimemessage)
    {
        Zd = realtimemessage;
    }
}
