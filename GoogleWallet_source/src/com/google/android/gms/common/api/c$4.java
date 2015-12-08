// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            c

final class SZ
    implements com.google.android.gms.common.lePlayServicesClient.OnConnectionFailedListener
{

    final c SY;
    final b SZ;

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        c.a(SY).lock();
        if (c.k(SY) == null || SZ.getPriority() < c.l(SY))
        {
            c.a(SY, connectionresult);
            c.b(SY, SZ.getPriority());
        }
        c.d(SY);
        c.a(SY).unlock();
        return;
        connectionresult;
        c.a(SY).unlock();
        throw connectionresult;
    }

    b(c c1, b b)
    {
        SY = c1;
        SZ = b;
        super();
    }
}
