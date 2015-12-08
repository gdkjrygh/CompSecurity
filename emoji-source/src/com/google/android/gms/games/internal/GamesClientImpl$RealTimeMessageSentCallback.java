// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;


// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private final class Ow extends com.google.android.gms.internal.lback
{

    private final int CT;
    final GamesClientImpl NE;
    private final String Ow;
    private final int Ox;

    public void a(com.google.android.gms.games.multiplayer.realtime.ack ack)
    {
        if (ack != null)
        {
            ack.onRealTimeMessageSent(CT, Ox, Ow);
        }
    }

    public void d(Object obj)
    {
        a((com.google.android.gms.games.multiplayer.realtime.ack)obj);
    }

    protected void fu()
    {
    }

    ageSentCallback(GamesClientImpl gamesclientimpl, com.google.android.gms.games.multiplayer.realtime.ack ack, int i, int j, String s)
    {
        NE = gamesclientimpl;
        super(gamesclientimpl, ack);
        CT = i;
        Ox = j;
        Ow = s;
    }
}
