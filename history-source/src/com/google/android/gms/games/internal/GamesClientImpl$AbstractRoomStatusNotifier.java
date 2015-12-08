// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static abstract class  extends a
{

    protected void a(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
    {
        a(roomstatusupdatelistener, GamesClientImpl.S(dataholder));
    }

    protected abstract void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room);

    protected volatile void a(Object obj, DataHolder dataholder)
    {
        a((RoomStatusUpdateListener)obj, dataholder);
    }

    (DataHolder dataholder)
    {
        super(dataholder);
    }
}
