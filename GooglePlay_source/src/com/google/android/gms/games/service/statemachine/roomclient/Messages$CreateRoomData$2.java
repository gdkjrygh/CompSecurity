// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.service.WrappedGamesCallbacks;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            Messages, RoomServiceClientStateMachine

final class this._cls0
    implements k
{

    final ine.handleGameRemoteFailure this$0;

    public final void run(DataHolder dataholder)
    {
        try
        {
            WrappedGamesCallbacks wrappedgamescallbacks = llbacks;
            wrappedgamescallbacks.audit(new DataHolder[] {
                dataholder
            });
            wrappedgamescallbacks.mCallbacks.onRoomCreated(dataholder);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DataHolder dataholder)
        {
            RoomServiceClientStateMachine.handleGameRemoteFailure(dataholder);
        }
    }

    ine()
    {
        this$0 = this._cls0.this;
        super();
    }
}
