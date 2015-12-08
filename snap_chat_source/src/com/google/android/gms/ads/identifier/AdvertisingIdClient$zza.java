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

    private WeakReference zzlt;
    private long zzlu;
    CountDownLatch zzlv;
    boolean zzlw;

    private void disconnect()
    {
        AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)zzlt.get();
        if (advertisingidclient != null)
        {
            advertisingidclient.finish();
            zzlw = true;
        }
    }

    public void cancel()
    {
        zzlv.countDown();
    }

    public void run()
    {
        try
        {
            if (!zzlv.await(zzlu, TimeUnit.MILLISECONDS))
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

    public boolean zzaa()
    {
        return zzlw;
    }

    public (AdvertisingIdClient advertisingidclient, long l)
    {
        zzlt = new WeakReference(advertisingidclient);
        zzlu = l;
        zzlv = new CountDownLatch(1);
        zzlw = false;
        start();
    }
}
