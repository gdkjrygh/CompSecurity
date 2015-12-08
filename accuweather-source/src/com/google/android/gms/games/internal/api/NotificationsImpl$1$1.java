// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesClientImpl;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            NotificationsImpl

class yG
    implements com.google.android.gms.games.StatusChangeResult
{

    final yG PT;
    final Status yG;

    public Status getStatus()
    {
        return yG;
    }

    esult(esult esult, Status status)
    {
        PT = esult;
        yG = status;
        super();
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$1

/* anonymous class */
    class NotificationsImpl._cls1 extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        final String PS;

        public com.google.android.gms.games.Notifications.GameMuteStatusChangeResult K(Status status)
        {
            return new NotificationsImpl._cls1._cls1(this, status);
        }

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.d(this, PS, true);
        }

        public Result c(Status status)
        {
            return K(status);
        }
    }

}
