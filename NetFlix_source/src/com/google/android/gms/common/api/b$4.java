// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            b

class Bt
    implements leApiClient.OnConnectionFailedListener
{

    final b Bs;
    final b Bt;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        b.a(Bs).lock();
        if (b.h(Bs) == null || Bt.getPriority() < b.i(Bs))
        {
            b.a(Bs, connectionresult);
            b.c(Bs, Bt.getPriority());
        }
        b.d(Bs);
        b.a(Bs).unlock();
        return;
        connectionresult;
        b.a(Bs).unlock();
        throw connectionresult;
    }

    b(b b1, b b2)
    {
        Bs = b1;
        Bt = b2;
        super();
    }
}
