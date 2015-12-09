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

class wz
    implements com.google.android.gms.games.StatusLoadResult
{

    final wz KE;
    final Status wz;

    public Status getStatus()
    {
        return wz;
    }

    ult(ult ult, Status status)
    {
        KE = ult;
        wz = status;
        super();
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$3

/* anonymous class */
    class NotificationsImpl._cls3 extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        final String KB;

        public com.google.android.gms.games.Notifications.GameMuteStatusLoadResult I(Status status)
        {
            return new NotificationsImpl._cls3._cls1(this, status);
        }

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.n(this, KB);
        }

        public Result d(Status status)
        {
            return I(status);
        }
    }

}
