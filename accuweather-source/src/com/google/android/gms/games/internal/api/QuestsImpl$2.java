// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.games.internal.GamesClientImpl;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            QuestsImpl

class aimImpl extends aimImpl
{

    final String Qk;
    final QuestsImpl Ql;
    final String Qm;

    protected volatile void a(com.google.android.gms.common.api.sImpl._cls2 _pcls2)
        throws RemoteException
    {
        a((GamesClientImpl)_pcls2);
    }

    protected void a(GamesClientImpl gamesclientimpl)
    {
        gamesclientimpl.b(this, Qk, Qm);
    }

    aimImpl(QuestsImpl questsimpl, String s, String s1)
    {
        Ql = questsimpl;
        Qk = s;
        Qm = s1;
        super(null);
    }
}
