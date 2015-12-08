// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            QuestsImpl

class adsImpl extends adsImpl
{

    final boolean ZW;
    final int aaA;
    final QuestsImpl abl;
    final int abn[];

    protected volatile void a(com.google.android.gms.common.api.sImpl._cls3 _pcls3)
        throws RemoteException
    {
        a((GamesClientImpl)_pcls3);
    }

    protected void a(GamesClientImpl gamesclientimpl)
    {
        gamesclientimpl.a(this, abn, aaA, ZW);
    }

    adsImpl(QuestsImpl questsimpl, GoogleApiClient googleapiclient, int ai[], int i, boolean flag)
    {
        abl = questsimpl;
        abn = ai;
        aaA = i;
        ZW = flag;
        super(googleapiclient, null);
    }
}
