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

    CountDownLatch a;
    boolean b;
    private WeakReference c;
    private long d;

    private void c()
    {
        AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)c.get();
        if (advertisingidclient != null)
        {
            advertisingidclient.b();
            b = true;
        }
    }

    public void a()
    {
        a.countDown();
    }

    public boolean b()
    {
        return b;
    }

    public void run()
    {
        try
        {
            if (!a.await(d, TimeUnit.MILLISECONDS))
            {
                c();
            }
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            c();
        }
    }

    public (AdvertisingIdClient advertisingidclient, long l)
    {
        c = new WeakReference(advertisingidclient);
        d = l;
        a = new CountDownLatch(1);
        b = false;
        start();
    }
}
