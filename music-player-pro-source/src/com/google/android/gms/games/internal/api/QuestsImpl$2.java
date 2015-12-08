// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            QuestsImpl

class aimImpl extends aimImpl
{

    final String abk;
    final QuestsImpl abl;
    final String abm;

    protected volatile void a(com.google.android.gms.common.api.sImpl._cls2 _pcls2)
        throws RemoteException
    {
        a((GamesClientImpl)_pcls2);
    }

    protected void a(GamesClientImpl gamesclientimpl)
    {
        gamesclientimpl.b(this, abk, abm);
    }

    aimImpl(QuestsImpl questsimpl, GoogleApiClient googleapiclient, String s, String s1)
    {
        abl = questsimpl;
        abk = s;
        abm = s1;
        super(googleapiclient, null);
    }
}
