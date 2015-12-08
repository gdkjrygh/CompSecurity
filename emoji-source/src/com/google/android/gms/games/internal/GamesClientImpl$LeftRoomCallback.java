// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private final class NS extends com.google.android.gms.internal.lback
{

    private final int CT;
    final GamesClientImpl NE;
    private final String NS;

    public void a(RoomUpdateListener roomupdatelistener)
    {
        roomupdatelistener.onLeftRoom(CT, NS);
    }

    public void d(Object obj)
    {
        a((RoomUpdateListener)obj);
    }

    protected void fu()
    {
    }

    (GamesClientImpl gamesclientimpl, RoomUpdateListener roomupdatelistener, int i, String s)
    {
        NE = gamesclientimpl;
        super(gamesclientimpl, roomupdatelistener);
        CT = i;
        NS = s;
    }
}
