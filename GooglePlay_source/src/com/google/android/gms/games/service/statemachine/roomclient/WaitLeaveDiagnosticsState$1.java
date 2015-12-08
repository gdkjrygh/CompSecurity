// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            WaitLeaveDiagnosticsState

final class val.clientLeaveRoom
    implements com.google.android.gms.games.service.ftCallback
{

    final WaitLeaveDiagnosticsState this$0;
    final val.clientLeaveRoom val$clientLeaveRoom;
    final WrappedGamesCallbacks val$leaveCb;

    public final void onLeftRoom(int i, String s)
    {
        mSm.sendMessage(new t>(i, s, val$leaveCb, val$clientLeaveRoom));
    }

    ()
    {
        this$0 = final_waitleavediagnosticsstate;
        val$leaveCb = wrappedgamescallbacks;
        val$clientLeaveRoom = val.clientLeaveRoom.this;
        super();
    }
}
