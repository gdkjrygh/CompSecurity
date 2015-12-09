// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            UnboundState, RoomServiceClientStateMachine

public final class mContext
    implements ServiceConnection
{

    final Context mContext;
    final UnboundState this$0;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        componentname = new mContext(componentname, ibinder);
        mSm.sendMessage(componentname);
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        mRsm.handleRasFailure(UnboundState.getRemoteException("Service disconnected"));
    }

    public (Context context)
    {
        this$0 = UnboundState.this;
        super();
        mContext = context;
    }
}
