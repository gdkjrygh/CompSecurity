// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private final class Xr extends com.google.android.gms.common.internal.r
{

    final GamesClientImpl WC;
    private final String Xr;

    public void a(RoomStatusUpdateListener roomstatusupdatelistener)
    {
        if (roomstatusupdatelistener != null)
        {
            roomstatusupdatelistener.onP2PConnected(Xr);
        }
    }

    public void g(Object obj)
    {
        a((RoomStatusUpdateListener)obj);
    }

    protected void gT()
    {
    }

    (GamesClientImpl gamesclientimpl, RoomStatusUpdateListener roomstatusupdatelistener, String s)
    {
        WC = gamesclientimpl;
        super(gamesclientimpl, roomstatusupdatelistener);
        Xr = s;
    }
}
