// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

final class Je extends com.google.android.gms.internal.lback
{

    final GamesClientImpl IJ;
    private final RealTimeMessage Je;

    public void a(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
    {
        if (realtimemessagereceivedlistener != null)
        {
            realtimemessagereceivedlistener.onRealTimeMessageReceived(Je);
        }
    }

    public volatile void a(Object obj)
    {
        a((RealTimeMessageReceivedListener)obj);
    }

    protected void dx()
    {
    }

    ner(GamesClientImpl gamesclientimpl, RealTimeMessageReceivedListener realtimemessagereceivedlistener, RealTimeMessage realtimemessage)
    {
        IJ = gamesclientimpl;
        super(gamesclientimpl, realtimemessagereceivedlistener);
        Je = realtimemessage;
    }
}
