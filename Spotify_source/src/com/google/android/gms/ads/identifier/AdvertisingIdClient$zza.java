// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.ads.identifier:
//            AdvertisingIdClient

class start extends Thread
{

    private WeakReference zzoi;
    private long zzoj;
    CountDownLatch zzok;
    boolean zzol;

    private void disconnect()
    {
        AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)zzoi.get();
        if (advertisingidclient != null)
        {
            advertisingidclient.finish();
            zzol = true;
        }
    }

    public void cancel()
    {
        zzok.countDown();
    }

    public void run()
    {
        try
        {
            if (!zzok.await(zzoj, TimeUnit.MILLISECONDS))
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
        return zzol;
    }

    public (AdvertisingIdClient advertisingidclient, long l)
    {
        zzoi = new WeakReference(advertisingidclient);
        zzoj = l;
        zzok = new CountDownLatch(1);
        zzol = false;
        start();
    }
}
