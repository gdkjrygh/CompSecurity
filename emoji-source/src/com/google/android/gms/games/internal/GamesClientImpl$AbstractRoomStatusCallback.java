// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private abstract class NE extends com.google.android.gms.internal.lback
{

    final GamesClientImpl NE;

    protected void a(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
    {
        a(roomstatusupdatelistener, GamesClientImpl.a(NE, dataholder));
    }

    protected abstract void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room);

    protected volatile void a(Object obj, DataHolder dataholder)
    {
        a((RoomStatusUpdateListener)obj, dataholder);
    }

    (GamesClientImpl gamesclientimpl, RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
    {
        NE = gamesclientimpl;
        super(gamesclientimpl, roomstatusupdatelistener, dataholder);
    }
}
