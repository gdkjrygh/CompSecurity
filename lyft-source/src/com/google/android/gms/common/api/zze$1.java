// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zze

class a
    implements Runnable
{

    final ConnectionResult a;
    final zze b;

    public void run()
    {
        zze.a(b).lock();
        zze.a(b, a);
        zze.a(b).unlock();
        return;
        Exception exception;
        exception;
        zze.a(b).unlock();
        throw exception;
    }

    Result(zze zze1, ConnectionResult connectionresult)
    {
        b = zze1;
        a = connectionresult;
        super();
    }
}
