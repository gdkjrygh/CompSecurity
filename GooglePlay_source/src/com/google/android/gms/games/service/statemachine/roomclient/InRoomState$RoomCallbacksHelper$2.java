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

    final icipantIds this$1;
    final icipantIds val$data;

    public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks)
        throws RemoteException
    {
        String as[] = val$data.icipantIds;
        wrappedgamescallbacks.audit(new DataHolder[] {
            dataholder
        });
        wrappedgamescallbacks.mCallbacks.onPeerJoinedRoom(dataholder, as);
    }

    ()
    {
        this$1 = final_;
        val$data = val.data.this;
        super();
    }
}
