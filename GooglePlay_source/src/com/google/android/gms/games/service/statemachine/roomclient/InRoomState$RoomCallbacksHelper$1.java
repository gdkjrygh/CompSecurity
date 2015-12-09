// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.realtime.Room;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            InRoomState, RtmpSessionLog

final class this._cls1
    implements this._cls1
{

    final is._cls0 this$1;

    public final void run(Room room)
    {
        int k = 0;
        int j = 0;
        room = room.getParticipants();
        int i = 0;
        for (int i1 = room.size(); i < i1;)
        {
            int l = k + 1;
            k = j;
            if (((Participant)room.get(i)).isConnectedToRoom())
            {
                k = j + 1;
            }
            i++;
            j = k;
            k = l;
        }

        room = InRoomState.access$100(_fld0);
        ((RtmpSessionLog) (room)).mLog.numPeers = Math.max(k, ((RtmpSessionLog) (room)).mLog.numPeers);
        ((RtmpSessionLog) (room)).mLog.numConnectedPeers = Math.max(j, ((RtmpSessionLog) (room)).mLog.numConnectedPeers);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
