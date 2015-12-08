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

    public com.google.android.gms.games.teStatusLoadResult L(Status status)
    {
        return new com.google.android.gms.games.Notifications.GameMuteStatusLoadResult(status) {

            final NotificationsImpl._cls3 PY;
            final Status yJ;

            public Status getStatus()
            {
                return yJ;
            }

            
            {
                PY = NotificationsImpl._cls3.this;
                yJ = status;
                super();
            }
        };
    }

    protected volatile void a(com.google.android.gms.common.api.sImpl._cls3 _pcls3)
        throws RemoteException
    {
        a((GamesClientImpl)_pcls3);
    }

    protected void a(GamesClientImpl gamesclientimpl)
    {
        gamesclientimpl.q(this, PV);
    }

    public Result c(Status status)
    {
        return L(status);
    }
}
