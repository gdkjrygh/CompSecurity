// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class Zk
    implements com.google.android.gms.common.api.ier
{

    private final String Zk;

    public void a(RoomStatusUpdateListener roomstatusupdatelistener)
    {
        roomstatusupdatelistener.onP2PConnected(Zk);
    }

    public void c(Object obj)
    {
        a((RoomStatusUpdateListener)obj);
    }

    public void gG()
    {
    }

    (String s)
    {
        Zk = s;
    }
}
