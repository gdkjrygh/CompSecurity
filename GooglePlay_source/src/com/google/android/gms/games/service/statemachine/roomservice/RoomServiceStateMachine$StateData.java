// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomservice;

import android.content.Context;
import com.google.android.gms.games.internal.IRoomServiceCallbacks;
import com.google.android.gms.games.realtime.network.DataConnectionManager;
import com.google.android.gms.games.realtime.network.DcmFactory;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomservice:
//            RoomServiceStateMachine

final class this._cls0
{

    protected Context mContext;
    protected DataConnectionManager mDataConnectionManager;
    protected final ks mDcmCallBacks;
    protected DcmFactory mDcmFactory;
    protected IRoomServiceCallbacks mRoomService;
    final RoomServiceStateMachine this$0;

    ks()
    {
        this$0 = RoomServiceStateMachine.this;
        super();
        mDcmCallBacks = new ks(RoomServiceStateMachine.this);
    }
}
