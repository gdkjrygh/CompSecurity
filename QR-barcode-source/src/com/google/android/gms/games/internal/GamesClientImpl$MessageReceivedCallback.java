// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private final class Xk extends com.google.android.gms.common.internal.k
{

    final GamesClientImpl WC;
    private final RealTimeMessage Xk;

    public void a(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
    {
        if (realtimemessagereceivedlistener != null)
        {
            realtimemessagereceivedlistener.onRealTimeMessageReceived(Xk);
        }
    }

    public void g(Object obj)
    {
        a((RealTimeMessageReceivedListener)obj);
    }

    protected void gT()
    {
    }

    ner(GamesClientImpl gamesclientimpl, RealTimeMessageReceivedListener realtimemessagereceivedlistener, RealTimeMessage realtimemessage)
    {
        WC = gamesclientimpl;
        super(gamesclientimpl, realtimemessagereceivedlistener);
        Xk = realtimemessage;
    }
}
