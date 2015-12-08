// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private final class On extends com.google.android.gms.internal.lback
{

    final GamesClientImpl NB;
    private final String On;

    public void a(RoomStatusUpdateListener roomstatusupdatelistener)
    {
        if (roomstatusupdatelistener != null)
        {
            roomstatusupdatelistener.onP2PDisconnected(On);
        }
    }

    public void d(Object obj)
    {
        a((RoomStatusUpdateListener)obj);
    }

    protected void fp()
    {
    }

    (GamesClientImpl gamesclientimpl, RoomStatusUpdateListener roomstatusupdatelistener, String s)
    {
        NB = gamesclientimpl;
        super(gamesclientimpl, roomstatusupdatelistener);
        On = s;
    }
}
