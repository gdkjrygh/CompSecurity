// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesClientImpl;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            NotificationsImpl

final class val.status
    implements com.google.android.gms.games.StatusChangeResult
{

    final val.status this$1;
    final Status val$status;

    public final String getExternalGameId()
    {
        return externalGameId;
    }

    public final Status getStatus()
    {
        return val$status;
    }

    public final boolean isMuted()
    {
        return false;
    }

    ()
    {
        this$1 = final_;
        val$status = Status.this;
        super();
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$1

/* anonymous class */
    final class NotificationsImpl._cls1 extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        final NotificationsImpl this$0;
        final String val$externalGameId;

        public final volatile Result createFailedResult(Status status1)
        {
            return status1. new NotificationsImpl._cls1._cls1();
        }

        protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            ((GamesClientImpl)client).setGameMuteStatusInternal(this, externalGameId, true);
        }

            
            {
                this$0 = final_notificationsimpl;
                externalGameId = s;
                super(GoogleApiClient.this);
            }
    }

}
