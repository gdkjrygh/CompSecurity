// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.ads.identifier:
//            AdvertisingIdClient

final class a extends Thread
{

    CountDownLatch a;
    boolean b;
    private WeakReference c;
    private long d;

    public a(AdvertisingIdClient advertisingidclient, long l)
    {
        c = new WeakReference(advertisingidclient);
        d = l;
        a = new CountDownLatch(1);
        b = false;
        start();
    }

    private void a()
    {
        AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)c.get();
        if (advertisingidclient != null)
        {
            advertisingidclient.finish();
            b = true;
        }
    }

    public final void run()
    {
        try
        {
            if (!a.await(d, TimeUnit.MILLISECONDS))
            {
                a();
            }
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            a();
        }
    }
}
