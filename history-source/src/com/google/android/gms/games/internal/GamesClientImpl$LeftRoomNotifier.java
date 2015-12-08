// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class YI
    implements com.google.android.gms.common.api.ier
{

    private final int Iv;
    private final String YI;

    public void a(RoomUpdateListener roomupdatelistener)
    {
        roomupdatelistener.onLeftRoom(Iv, YI);
    }

    public void c(Object obj)
    {
        a((RoomUpdateListener)obj);
    }

    public void gG()
    {
    }

    (int i, String s)
    {
        Iv = i;
        YI = s;
    }
}
