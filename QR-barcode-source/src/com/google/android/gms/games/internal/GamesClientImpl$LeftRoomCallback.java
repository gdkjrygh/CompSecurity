// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private final class WQ extends com.google.android.gms.common.internal.Q
{

    private final int HF;
    final GamesClientImpl WC;
    private final String WQ;

    public void a(RoomUpdateListener roomupdatelistener)
    {
        roomupdatelistener.onLeftRoom(HF, WQ);
    }

    public void g(Object obj)
    {
        a((RoomUpdateListener)obj);
    }

    protected void gT()
    {
    }

    (GamesClientImpl gamesclientimpl, RoomUpdateListener roomupdatelistener, int i, String s)
    {
        WC = gamesclientimpl;
        super(gamesclientimpl, roomupdatelistener);
        HF = i;
        WQ = s;
    }
}
