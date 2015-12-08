// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            c

class Ei
    implements leApiClient.OnConnectionFailedListener
{

    final c Eh;
    final b Ei;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        c.a(Eh).lock();
        if (c.h(Eh) == null || Ei.getPriority() < c.i(Eh))
        {
            c.a(Eh, connectionresult);
            c.c(Eh, Ei.getPriority());
        }
        c.d(Eh);
        c.a(Eh).unlock();
        return;
        connectionresult;
        c.a(Eh).unlock();
        throw connectionresult;
    }

    b(c c1, b b)
    {
        Eh = c1;
        Ei = b;
        super();
    }
}
