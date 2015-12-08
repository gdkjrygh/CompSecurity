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

    private WeakReference zzoh;
    private long zzoi;
    CountDownLatch zzoj;
    boolean zzok;

    private void disconnect()
    {
        AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)zzoh.get();
        if (advertisingidclient != null)
        {
            advertisingidclient.finish();
            zzok = true;
        }
    }

    public void cancel()
    {
        zzoj.countDown();
    }

    public void run()
    {
        try
        {
            if (!zzoj.await(zzoi, TimeUnit.MILLISECONDS))
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
        return zzok;
    }

    public (AdvertisingIdClient advertisingidclient, long l)
    {
        zzoh = new WeakReference(advertisingidclient);
        zzoi = l;
        zzoj = new CountDownLatch(1);
        zzok = false;
        start();
    }
}
