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

final class val.data
    implements val.data
{

    final pantIds this$1;
    final pantIds val$data;

    public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks)
        throws RemoteException
    {
        String as[] = val$data.pantIds;
        wrappedgamescallbacks.audit(new DataHolder[] {
            dataholder
        });
        wrappedgamescallbacks.mCallbacks.onPeerLeftRoom(dataholder, as);
    }

    ()
    {
        this$1 = final_;
        val$data = val.data.this;
        super();
    }
}
