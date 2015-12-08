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

class _cls1.yJ extends com.google.android.gms.games.thodImpl
{

    final String PV;

    public com.google.android.gms.games.teStatusChangeResult K(Status status)
    {
        return new com.google.android.gms.games.Notifications.GameMuteStatusChangeResult(status) {

            final NotificationsImpl._cls1 PW;
            final Status yJ;

            public Status getStatus()
            {
                return yJ;
            }

            
            {
                PW = NotificationsImpl._cls1.this;
                yJ = status;
                super();
            }
        };
    }

    protected volatile void a(com.google.android.gms.common.api.sImpl._cls1 _pcls1)
        throws RemoteException
    {
        a((GamesClientImpl)_pcls1);
    }

    protected void a(GamesClientImpl gamesclientimpl)
    {
        gamesclientimpl.d(this, PV, true);
    }

    public Result c(Status status)
    {
        return K(status);
    }
}
