// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;


// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class Zp
    implements com.google.android.gms.common.api.ier
{

    private final int Iv;
    private final String Zp;
    private final int Zq;

    public void a(com.google.android.gms.games.multiplayer.realtime.ack ack)
    {
        if (ack != null)
        {
            ack.onRealTimeMessageSent(Iv, Zq, Zp);
        }
    }

    public void c(Object obj)
    {
        a((com.google.android.gms.games.multiplayer.realtime.ack)obj);
    }

    public void gG()
    {
    }

    ageSentCallback(int i, int j, String s)
    {
        Iv = i;
        Zq = j;
        Zp = s;
    }
}
