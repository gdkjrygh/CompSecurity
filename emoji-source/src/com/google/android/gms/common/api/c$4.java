// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            c

class El
    implements leApiClient.OnConnectionFailedListener
{

    final c Ek;
    final b El;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        c.a(Ek).lock();
        if (c.h(Ek) == null || El.getPriority() < c.i(Ek))
        {
            c.a(Ek, connectionresult);
            c.c(Ek, El.getPriority());
        }
        c.d(Ek);
        c.a(Ek).unlock();
        return;
        connectionresult;
        c.a(Ek).unlock();
        throw connectionresult;
    }

    b(c c1, b b)
    {
        Ek = c1;
        El = b;
        super();
    }
}
