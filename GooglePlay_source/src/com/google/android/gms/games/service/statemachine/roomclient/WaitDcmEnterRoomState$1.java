// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;


// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            WaitDcmEnterRoomState, RtmpSessionLog

final class val.logToClose
    implements com.google.android.gms.games.service.omLeftCallback
{

    final WaitDcmEnterRoomState this$0;
    final RtmpSessionLog val$logToClose;

    public final void onLeftRoom(int i, String s)
    {
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        val$logToClose.onRoomLeaveDone(flag);
        val$logToClose.dispatchLog();
    }

    ()
    {
        this$0 = final_waitdcmenterroomstate;
        val$logToClose = RtmpSessionLog.this;
        super();
    }
}
