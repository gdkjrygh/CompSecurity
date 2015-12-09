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

    boolean mAutoDisconnected;
    private WeakReference mClient;
    CountDownLatch mCountDown;
    private long mDelayMillis;

    private void disconnect()
    {
        AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)mClient.get();
        if (advertisingidclient != null)
        {
            advertisingidclient.finish();
            mAutoDisconnected = true;
        }
    }

    public final void run()
    {
        try
        {
            if (!mCountDown.await(mDelayMillis, TimeUnit.MILLISECONDS))
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

    public (AdvertisingIdClient advertisingidclient, long l)
    {
        mClient = new WeakReference(advertisingidclient);
        mDelayMillis = l;
        mCountDown = new CountDownLatch(1);
        mAutoDisconnected = false;
        start();
    }
}
