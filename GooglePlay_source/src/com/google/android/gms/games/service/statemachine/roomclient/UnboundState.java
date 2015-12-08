// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            RoomClientState, CleanupBindingState, WaitServiceConnectState, RoomServiceClientStateMachine

final class UnboundState extends RoomClientState
{
    public final class RoomAndroidServiceConnection
        implements ServiceConnection
    {

        final Context mContext;
        final UnboundState this$0;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            componentname = new Messages.ServiceConnectedData(componentname, ibinder);
            mSm.sendMessage(componentname);
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            mRsm.handleRasFailure(UnboundState.getRemoteException("Service disconnected"));
        }

        public RoomAndroidServiceConnection(Context context)
        {
            this$0 = UnboundState.this;
            super();
            mContext = context;
        }
    }


    public UnboundState(RoomServiceClientStateMachine roomserviceclientstatemachine)
    {
        super(roomserviceclientstatemachine);
    }

    public final boolean processMessage(Message message)
    {
        Context context;
        switch (message.what)
        {
        default:
            return false;

        case 29: // '\035'
            context = ((Messages.EnterRoomData)message.obj).context;
            break;
        }
        Intent intent = new Intent("com.google.android.gms.games.rtmp.service.START");
        intent.setPackage(context.getPackageName());
        mData.roomServiceConnection = new RoomAndroidServiceConnection(context);
        if (!ConnectionTracker.getInstance().bindService(context, intent, mData.roomServiceConnection, 1))
        {
            mStates.cleanupBindingState.transitionToState();
        } else
        {
            mSm.deferMessage(message);
            mStates.waitServiceConnectState.transitionToState();
        }
        return HANDLED;
    }
}
