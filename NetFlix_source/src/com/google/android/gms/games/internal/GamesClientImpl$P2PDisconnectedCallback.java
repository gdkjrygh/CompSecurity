// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

final class Jg extends com.google.android.gms.internal.lback
{

    final GamesClientImpl IJ;
    private final String Jg;

    public void a(RoomStatusUpdateListener roomstatusupdatelistener)
    {
        if (roomstatusupdatelistener != null)
        {
            roomstatusupdatelistener.onP2PDisconnected(Jg);
        }
    }

    public volatile void a(Object obj)
    {
        a((RoomStatusUpdateListener)obj);
    }

    protected void dx()
    {
    }

    (GamesClientImpl gamesclientimpl, RoomStatusUpdateListener roomstatusupdatelistener, String s)
    {
        IJ = gamesclientimpl;
        super(gamesclientimpl, roomstatusupdatelistener);
        Jg = s;
    }
}
