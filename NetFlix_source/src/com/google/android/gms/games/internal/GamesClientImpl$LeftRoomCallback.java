// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

final class Ja extends com.google.android.gms.internal.lback
{

    private final int Ah;
    final GamesClientImpl IJ;
    private final String Ja;

    public void a(RoomUpdateListener roomupdatelistener)
    {
        roomupdatelistener.onLeftRoom(Ah, Ja);
    }

    public volatile void a(Object obj)
    {
        a((RoomUpdateListener)obj);
    }

    protected void dx()
    {
    }

    (GamesClientImpl gamesclientimpl, RoomUpdateListener roomupdatelistener, int i, String s)
    {
        IJ = gamesclientimpl;
        super(gamesclientimpl, roomupdatelistener);
        Ah = i;
        Ja = s;
    }
}
