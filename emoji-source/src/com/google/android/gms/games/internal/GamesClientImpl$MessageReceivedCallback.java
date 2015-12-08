// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private final class Ol extends com.google.android.gms.internal.lback
{

    final GamesClientImpl NE;
    private final RealTimeMessage Ol;

    public void a(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
    {
        if (realtimemessagereceivedlistener != null)
        {
            realtimemessagereceivedlistener.onRealTimeMessageReceived(Ol);
        }
    }

    public void d(Object obj)
    {
        a((RealTimeMessageReceivedListener)obj);
    }

    protected void fu()
    {
    }

    ner(GamesClientImpl gamesclientimpl, RealTimeMessageReceivedListener realtimemessagereceivedlistener, RealTimeMessage realtimemessage)
    {
        NE = gamesclientimpl;
        super(gamesclientimpl, realtimemessagereceivedlistener);
        Ol = realtimemessage;
    }
}
