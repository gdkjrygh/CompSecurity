// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class r extends r
{

    public final void notifyListener(RoomUpdateListener roomupdatelistener, Room room, int i)
    {
        roomupdatelistener.onJoinedRoom$2623dbd5(room);
    }

    public r(DataHolder dataholder)
    {
        super(dataholder);
    }
}
