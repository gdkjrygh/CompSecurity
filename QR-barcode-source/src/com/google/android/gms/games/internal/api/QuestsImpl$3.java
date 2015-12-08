// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.games.internal.GamesClientImpl;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            QuestsImpl

class adsImpl extends adsImpl
{

    final int YF;
    final boolean Yf;
    final QuestsImpl Zr;
    final int Zt[];

    protected volatile void a(com.google.android.gms.common.api.sImpl._cls3 _pcls3)
        throws RemoteException
    {
        a((GamesClientImpl)_pcls3);
    }

    protected void a(GamesClientImpl gamesclientimpl)
    {
        gamesclientimpl.a(this, Zt, YF, Yf);
    }

    adsImpl(QuestsImpl questsimpl, int ai[], int i, boolean flag)
    {
        Zr = questsimpl;
        Zt = ai;
        YF = i;
        Yf = flag;
        super(null);
    }
}
