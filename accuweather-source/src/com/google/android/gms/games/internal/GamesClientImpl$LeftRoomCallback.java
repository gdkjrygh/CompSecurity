// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private final class NP extends com.google.android.gms.internal.lback
{

    private final int CQ;
    final GamesClientImpl NB;
    private final String NP;

    public void a(RoomUpdateListener roomupdatelistener)
    {
        roomupdatelistener.onLeftRoom(CQ, NP);
    }

    public void d(Object obj)
    {
        a((RoomUpdateListener)obj);
    }

    protected void fp()
    {
    }

    (GamesClientImpl gamesclientimpl, RoomUpdateListener roomupdatelistener, int i, String s)
    {
        NB = gamesclientimpl;
        super(gamesclientimpl, roomupdatelistener);
        CQ = i;
        NP = s;
    }
}
