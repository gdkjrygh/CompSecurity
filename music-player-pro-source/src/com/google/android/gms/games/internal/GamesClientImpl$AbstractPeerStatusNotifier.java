// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static abstract class Yv extends Yv
{

    private final ArrayList Yv = new ArrayList();

    protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
    {
        a(roomstatusupdatelistener, room, Yv);
    }

    protected abstract void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist);

    (DataHolder dataholder, String as[])
    {
        super(dataholder);
        int i = 0;
        for (int j = as.length; i < j; i++)
        {
            Yv.add(as[i]);
        }

    }
}
