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

final class t> extends com.google.android.gms.games.thodImpl
{

    final NotificationsImpl this$0;
    final String val$externalGameId;

    public final volatile Result createFailedResult(final Status status)
    {
        return new com.google.android.gms.games.Notifications.GameMuteStatusChangeResult() {

            final NotificationsImpl._cls1 this$1;
            final Status val$status;

            public final String getExternalGameId()
            {
                return externalGameId;
            }

            public final Status getStatus()
            {
                return status;
            }

            public final boolean isMuted()
            {
                return false;
            }

            
            {
                this$1 = NotificationsImpl._cls1.this;
                status = status1;
                super();
            }
        };
    }

    protected final volatile void doExecute(com.google.android.gms.common.api.sImpl._cls1 _pcls1)
        throws RemoteException
    {
        ((GamesClientImpl)_pcls1).setGameMuteStatusInternal(this, val$externalGameId, true);
    }

    _cls1.val.status(String s)
    {
        this$0 = final_notificationsimpl;
        val$externalGameId = s;
        super(GoogleApiClient.this);
    }
}
