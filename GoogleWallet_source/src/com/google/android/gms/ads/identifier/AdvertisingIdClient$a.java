// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.ads.identifier:
//            AdvertisingIdClient

static final class start extends Thread
{

    private WeakReference lw;
    private long lx;
    CountDownLatch ly;
    boolean lz;

    private void disconnect()
    {
        AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)lw.get();
        if (advertisingidclient != null)
        {
            advertisingidclient.finish();
            lz = true;
        }
    }

    public final boolean aa()
    {
        return lz;
    }

    public final void cancel()
    {
        ly.countDown();
    }

    public final void run()
    {
        try
        {
            if (!ly.await(lx, TimeUnit.MILLISECONDS))
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
        lw = new WeakReference(advertisingidclient);
        lx = l;
        ly = new CountDownLatch(1);
        lz = false;
        start();
    }
}
