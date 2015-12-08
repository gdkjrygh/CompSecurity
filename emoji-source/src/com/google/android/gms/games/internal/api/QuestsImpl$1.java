// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.games.internal.GamesClientImpl;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            QuestsImpl

class ceptImpl extends ceptImpl
{

    final String Qn;
    final QuestsImpl Qo;

    protected volatile void a(com.google.android.gms.common.api.sImpl._cls1 _pcls1)
        throws RemoteException
    {
        a((GamesClientImpl)_pcls1);
    }

    protected void a(GamesClientImpl gamesclientimpl)
    {
        gamesclientimpl.i(this, Qn);
    }

    ceptImpl(QuestsImpl questsimpl, String s)
    {
        Qo = questsimpl;
        Qn = s;
        super(null);
    }
}
