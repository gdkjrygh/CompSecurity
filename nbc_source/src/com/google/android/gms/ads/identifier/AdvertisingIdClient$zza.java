// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.ads.identifier:
//            AdvertisingIdClient

static class start extends Thread
{

    private WeakReference zzod;
    private long zzoe;
    CountDownLatch zzof;
    boolean zzog;

    private void disconnect()
    {
        AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)zzod.get();
        if (advertisingidclient != null)
        {
            advertisingidclient.finish();
            zzog = true;
        }
    }

    public void cancel()
    {
        zzof.countDown();
    }

    public void run()
    {
        try
        {
            if (!zzof.await(zzoe, TimeUnit.MILLISECONDS))
            {
                disconnect();
            }
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            disconnect();
        }
    }

    public boolean zzaK()
    {
        return zzog;
    }

    public (AdvertisingIdClient advertisingidclient, long l)
    {
        zzod = new WeakReference(advertisingidclient);
        zzoe = l;
        zzof = new CountDownLatch(1);
        zzog = false;
        start();
    }
}
