// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.internal:
//            aa

final class ac
    implements Runnable
{

    private Context a;

    public ac(Context context)
    {
        a = context.getApplicationContext();
        if (a == null)
        {
            a = context;
        }
    }

    public final void run()
    {
        com/google/android/gms/internal/aa;
        JVM INSTR monitorenter ;
        if (aa.a() == null)
        {
            AdvertisingIdClient advertisingidclient = new AdvertisingIdClient(a);
            advertisingidclient.start();
            aa.a(advertisingidclient);
        }
        com.google.android.gms.internal.aa.c().countDown();
_L1:
        com/google/android/gms/internal/aa;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        aa.b();
        com.google.android.gms.internal.aa.c().countDown();
          goto _L1
        obj;
        com/google/android/gms/internal/aa;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        com.google.android.gms.internal.aa.c().countDown();
          goto _L1
        obj;
        com.google.android.gms.internal.aa.c().countDown();
          goto _L1
        obj;
        com.google.android.gms.internal.aa.c().countDown();
        throw obj;
    }
}
