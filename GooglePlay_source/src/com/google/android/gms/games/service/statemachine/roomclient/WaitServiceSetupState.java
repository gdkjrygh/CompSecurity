// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.games.service.statemachine.IStateMachine;
import com.google.android.gms.games.service.statemachine.MessageTokenHelper;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            RoomClientState, ServiceSetupState, RoomServiceClientStateMachine

final class WaitServiceSetupState extends RoomClientState
{

    public WaitServiceSetupState(RoomServiceClientStateMachine roomserviceclientstatemachine)
    {
        super(roomserviceclientstatemachine);
    }

    public final boolean processMessage(Message message)
    {
        switch (message.what)
        {
        case 28: // '\034'
        default:
            return false;

        case 27: // '\033'
            message = (Messages.SetupDoneData)message.obj;
            try
            {
                final com.google.android.gms.games.service.statemachine.MessageTokenHelper.MessageToken thisDeathBinderId = mData.roomServiceGoneToken.getToken();
                ((Messages.SetupDoneData) (message)).deathBinder.linkToDeath(new android.os.IBinder.DeathRecipient() {

                    final WaitServiceSetupState this$0;
                    final com.google.android.gms.games.service.statemachine.MessageTokenHelper.MessageToken val$thisDeathBinderId;

                    public final void binderDied()
                    {
                        mSm.sendMessage(new Messages.RoomServiceGoneData(thisDeathBinderId));
                        handleRasFailure(WaitServiceSetupState.getRemoteException("RoomAndroidService has died"));
                    }

            
            {
                this$0 = WaitServiceSetupState.this;
                thisDeathBinderId = messagetoken;
                super();
            }
                }, 0);
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                handleRasFailure(message);
            }
            mStates.serviceSetupState.transitionToState();
            return HANDLED;

        case 29: // '\035'
            mSm.deferMessage(message);
            return HANDLED;
        }
    }
}
