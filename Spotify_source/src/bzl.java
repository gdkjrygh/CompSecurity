// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

final class bzl
    implements Runnable
{

    private Context a;

    public bzl(Context context)
    {
        a = context.getApplicationContext();
        if (a == null)
        {
            a = context;
        }
    }

    public final void run()
    {
        bzj;
        JVM INSTR monitorenter ;
        if (bzj.a() == null)
        {
            AdvertisingIdClient advertisingidclient = new AdvertisingIdClient(a);
            advertisingidclient.start();
            bzj.a(advertisingidclient);
        }
        bzj.c().countDown();
_L1:
        bzj;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        bzj.b();
        bzj.c().countDown();
          goto _L1
        obj;
        bzj;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        bzj.c().countDown();
          goto _L1
        obj;
        bzj.c().countDown();
          goto _L1
        obj;
        bzj.c().countDown();
        throw obj;
    }
}
