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

    private WeakReference lt;
    private long lu;
    CountDownLatch lv;
    boolean lw;

    private void disconnect()
    {
        AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)lt.get();
        if (advertisingidclient != null)
        {
            advertisingidclient.finish();
            lw = true;
        }
    }

    public boolean aa()
    {
        return lw;
    }

    public void cancel()
    {
        lv.countDown();
    }

    public void run()
    {
        try
        {
            if (!lv.await(lu, TimeUnit.MILLISECONDS))
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

    public A(AdvertisingIdClient advertisingidclient, long l)
    {
        lt = new WeakReference(advertisingidclient);
        lu = l;
        lv = new CountDownLatch(1);
        lw = false;
        start();
    }
}
