// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomservice;

import android.os.Message;
import com.google.android.gms.common.util.state.IState;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomservice:
//            RoomServiceStateMachine

public static final class  extends RuntimeException
{

    public (IState istate, Message message, String s)
    {
        super((new StringBuilder("State: ")).append(istate.getName()).append(" msg ").append(message.what).append(" : ").append(s).toString());
    }
}
