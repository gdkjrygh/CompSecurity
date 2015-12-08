// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.service.WrappedGamesCallbacks;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            InRoomState

final class this._cls1
    implements this._cls1
{

    final this._cls1 this$1;

    public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks)
        throws RemoteException
    {
        wrappedgamescallbacks.audit(new DataHolder[] {
            dataholder
        });
        wrappedgamescallbacks.mCallbacks.onDisconnectedFromRoom(dataholder);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
