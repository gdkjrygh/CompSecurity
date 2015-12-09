// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import com.google.android.gms.games.internal.ConnectionInfo;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            Messages, OneupRtmpCalls

final class val.connectionInfo
    implements Runnable
{

    final val.connectionInfo this$0;
    final ConnectionInfo val$connectionInfo;
    final OneupRtmpCalls val$oneUpCalls;
    final com.google.android.gms.games.service.omEnteredCallback val$roomEnteredCallback;

    public final void run()
    {
        val$oneUpCalls.joinRoom(ntext, ientContext, val$roomEnteredCallback, ternalGameId, ternalRoomId, val$connectionInfo);
    }

    ()
    {
        this$0 = final_;
        val$oneUpCalls = oneuprtmpcalls;
        val$roomEnteredCallback = omenteredcallback;
        val$connectionInfo = ConnectionInfo.this;
        super();
    }
}
