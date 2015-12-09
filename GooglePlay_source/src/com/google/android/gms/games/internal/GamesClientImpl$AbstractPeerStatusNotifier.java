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

private static abstract class mParticipantIds extends mParticipantIds
{

    private final ArrayList mParticipantIds = new ArrayList();

    protected final void notifyListener(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
    {
        notifyListener$2b0c8916(roomstatusupdatelistener, room);
    }

    protected abstract void notifyListener$2b0c8916(RoomStatusUpdateListener roomstatusupdatelistener, Room room);

    (DataHolder dataholder, String as[])
    {
        super(dataholder);
        int i = 0;
        for (int j = as.length; i < j; i++)
        {
            mParticipantIds.add(as[i]);
        }

    }
}
