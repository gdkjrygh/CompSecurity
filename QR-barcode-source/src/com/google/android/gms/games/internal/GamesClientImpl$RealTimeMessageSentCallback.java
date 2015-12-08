// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;


// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private final class Xx extends com.google.android.gms.common.internal.x
{

    private final int HF;
    final GamesClientImpl WC;
    private final String Xx;
    private final int Xy;

    public void a(com.google.android.gms.games.multiplayer.realtime.ack ack)
    {
        if (ack != null)
        {
            ack.onRealTimeMessageSent(HF, Xy, Xx);
        }
    }

    public void g(Object obj)
    {
        a((com.google.android.gms.games.multiplayer.realtime.ack)obj);
    }

    protected void gT()
    {
    }

    ageSentCallback(GamesClientImpl gamesclientimpl, com.google.android.gms.games.multiplayer.realtime.ack ack, int i, int j, String s)
    {
        WC = gamesclientimpl;
        super(gamesclientimpl, ack);
        HF = i;
        Xy = j;
        Xx = s;
    }
}
