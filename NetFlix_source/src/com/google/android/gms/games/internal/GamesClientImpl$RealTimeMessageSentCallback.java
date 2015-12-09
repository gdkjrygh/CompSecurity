// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;


// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

final class Jj extends com.google.android.gms.internal.lback
{

    private final int Ah;
    final GamesClientImpl IJ;
    private final String Jj;
    private final int Jk;

    public void a(com.google.android.gms.games.multiplayer.realtime.ack ack)
    {
        if (ack != null)
        {
            ack.onRealTimeMessageSent(Ah, Jk, Jj);
        }
    }

    public volatile void a(Object obj)
    {
        a((com.google.android.gms.games.multiplayer.realtime.ack)obj);
    }

    protected void dx()
    {
    }

    ageSentCallback(GamesClientImpl gamesclientimpl, com.google.android.gms.games.multiplayer.realtime.ack ack, int i, int j, String s)
    {
        IJ = gamesclientimpl;
        super(gamesclientimpl, ack);
        Ah = i;
        Jk = j;
        Jj = s;
    }
}
