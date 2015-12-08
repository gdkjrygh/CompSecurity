// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.games.internal.GamesClientImpl;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            EventsImpl

class dateImpl extends dateImpl
{

    final EventsImpl Po;
    final String Pp;
    final int Pq;

    public volatile void a(com.google.android.gms.common.api.sImpl._cls3 _pcls3)
        throws RemoteException
    {
        a((GamesClientImpl)_pcls3);
    }

    public void a(GamesClientImpl gamesclientimpl)
    {
        gamesclientimpl.l(Pp, Pq);
    }

    dateImpl(EventsImpl eventsimpl, String s, int i)
    {
        Po = eventsimpl;
        Pp = s;
        Pq = i;
        super(null);
    }
}
