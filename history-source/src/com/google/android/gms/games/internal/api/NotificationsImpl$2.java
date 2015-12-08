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

class _cls1.DS extends com.google.android.gms.games.thodImpl
{

    final String aaR;

    public com.google.android.gms.games.teStatusChangeResult Y(Status status)
    {
        return new com.google.android.gms.games.Notifications.GameMuteStatusChangeResult(status) {

            final Status DS;
            final NotificationsImpl._cls2 aaT;

            public Status getStatus()
            {
                return DS;
            }

            
            {
                aaT = NotificationsImpl._cls2.this;
                DS = status;
                super();
            }
        };
    }

    protected volatile void a(com.google.android.gms.common.api.sImpl._cls2 _pcls2)
        throws RemoteException
    {
        a((GamesClientImpl)_pcls2);
    }

    protected void a(GamesClientImpl gamesclientimpl)
    {
        gamesclientimpl.e(this, aaR, false);
    }

    public Result c(Status status)
    {
        return Y(status);
    }
}
