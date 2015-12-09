// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.RemoteException;
import com.google.android.gms.games.service.WrappedGamesCallbacks;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            WaitLeaveDiagnosticsState, RoomServiceClientStateMachine

final class this._cls0
    implements com.google.android.gms.games.service.ftCallback
{

    final WaitLeaveDiagnosticsState this$0;

    public final void onLeftRoom(int i, String s)
    {
        WrappedGamesCallbacks wrappedgamescallbacks;
        try
        {
            wrappedgamescallbacks = WaitLeaveDiagnosticsState.access$000(WaitLeaveDiagnosticsState.this).tLeaveRoomData.callbacks;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            RoomServiceClientStateMachine.handleGameRemoteFailure(s);
            return;
        }
        if (wrappedgamescallbacks == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        wrappedgamescallbacks.onLeftRoom(i, s);
    }

    e()
    {
        this$0 = WaitLeaveDiagnosticsState.this;
        super();
    }
}
