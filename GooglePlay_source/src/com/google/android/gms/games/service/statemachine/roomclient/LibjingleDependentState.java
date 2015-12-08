// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.Message;
import com.google.android.gms.common.app.GmsApplicationContext;
import com.google.android.gms.games.internal.GamesLog;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            RoomClientState, UnboundState, RoomServiceClientStateMachine

abstract class LibjingleDependentState extends RoomClientState
{

    private final int mLibjingleTimeoutSec;

    public LibjingleDependentState(RoomServiceClientStateMachine roomserviceclientstatemachine, int i)
    {
        super(roomserviceclientstatemachine);
        mLibjingleTimeoutSec = i;
    }

    public final void enter()
    {
        setTimer(48, mLibjingleTimeoutSec, TimeUnit.SECONDS);
    }

    public final boolean processMessage(Message message)
    {
        if (message.what == 48)
        {
            message = (new StringBuilder("Libjingle failure in state:")).append(toString()).append(" no response after ").append(mLibjingleTimeoutSec).append(" seconds").toString();
            killRoomAndroidService$552c4e01();
            GamesLog.wtf(GmsApplicationContext.getInstance(), "RoomServiceClientStateMachine", message);
            mStates.unboundState.transitionToState();
            return HANDLED;
        } else
        {
            return processNonTimerMessage(message);
        }
    }

    abstract boolean processNonTimerMessage(Message message);
}
