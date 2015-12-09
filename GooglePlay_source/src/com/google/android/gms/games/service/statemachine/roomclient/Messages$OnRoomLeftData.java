// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            Messages

public static final class callbacks extends MessageBase
{

    public final WrappedGamesCallbacks callbacks;
    public final callbacks leaveRoomData;
    public final String roomId;
    public final int status;

    public (int i, String s, WrappedGamesCallbacks wrappedgamescallbacks,  )
    {
        super(46);
        leaveRoomData = (leaveRoomData)Preconditions.checkNotNull();
        status = ((Integer)Preconditions.checkNotNull(Integer.valueOf(i))).intValue();
        roomId = Preconditions.checkNotEmpty(s);
        callbacks = wrappedgamescallbacks;
    }
}
