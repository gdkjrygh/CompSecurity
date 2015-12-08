// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import com.google.android.gms.games.multiplayer.realtime.Room;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            InRoomState, RtmpSessionLog

final class this._cls1
    implements this._cls1
{

    final ogPeerCounts this$1;

    public final void run(Room room)
    {
        RtmpSessionLog rtmpsessionlog = InRoomState.access$100(_fld0);
        if (rtmpsessionlog.mLog.peerConnectTimeMs == 0L)
        {
            rtmpsessionlog.mLog.peerConnectTimeMs = rtmpsessionlog.deltaNow();
        }
        ogPeerCounts.ogPeerCounts(room);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
