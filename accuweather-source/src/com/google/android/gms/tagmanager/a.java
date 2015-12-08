// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ik;
import com.google.android.gms.internal.im;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bh

class com.google.android.gms.tagmanager.a
{
    public static interface a
    {

        public abstract com.google.android.gms.ads.identifier.AdvertisingIdClient.Info lb();
    }


    private static com.google.android.gms.tagmanager.a aee;
    private static Object tn = new Object();
    private volatile long adZ;
    private volatile long aea;
    private volatile long aeb;
    private final ik aec;
    private a aed = new a() {

        final com.google.android.gms.tagmanager.a aef;

        public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info lb()
        {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
            try
            {
                info = AdvertisingIdClient.getAdvertisingIdInfo(com.google.android.gms.tagmanager.a.a(aef));
            }
            catch (IllegalStateException illegalstateexception)
            {
                bh.D("IllegalStateException getting Advertising Id Info");
                return null;
            }
            catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception)
            {
                bh.D("GooglePlayServicesRepairableException getting Advertising Id Info");
                return null;
            }
            catch (IOException ioexception)
            {
                bh.D("IOException getting Ad Id Info");
                return null;
            }
            catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
            {
                bh.D("GooglePlayServicesNotAvailableException getting Advertising Id Info");
                return null;
            }
            catch (Exception exception)
            {
                bh.D("Unknown exception. Could not get the Advertising Id Info.");
                return null;
            }
            return info;
        }

            
            {
                aef = com.google.android.gms.tagmanager.a.this;
                super();
            }
    };
    private volatile boolean mClosed;
    private final Context mContext;
    private final Thread sc;
    private volatile com.google.android.gms.ads.identifier.AdvertisingIdClient.Info tp;

    private com.google.android.gms.tagmanager.a(Context context)
    {
        this(context, null, im.fW());
    }

    com.google.android.gms.tagmanager.a(Context context, a a1, ik ik1)
    {
        adZ = 0xdbba0L;
        aea = 30000L;
        mClosed = false;
        aec = ik1;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        } else
        {
            mContext = context;
        }
        if (a1 != null)
        {
            aed = a1;
        }
        sc = new Thread(new Runnable() {

            final com.google.android.gms.tagmanager.a aef;

            public void run()
            {
                com.google.android.gms.tagmanager.a.b(aef);
            }

            
            {
                aef = com.google.android.gms.tagmanager.a.this;
                super();
            }
        });
    }

    static com.google.android.gms.tagmanager.a J(Context context)
    {
        if (aee == null)
        {
            synchronized (tn)
            {
                if (aee == null)
                {
                    aee = new com.google.android.gms.tagmanager.a(context);
                    aee.start();
                }
            }
        }
        return aee;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static Context a(com.google.android.gms.tagmanager.a a1)
    {
        return a1.mContext;
    }

    static void b(com.google.android.gms.tagmanager.a a1)
    {
        a1.kZ();
    }

    private void kZ()
    {
        Process.setThreadPriority(10);
        while (!mClosed) 
        {
            try
            {
                tp = aed.lb();
                Thread.sleep(adZ);
            }
            catch (InterruptedException interruptedexception)
            {
                bh.B("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    private void la()
    {
        if (aec.currentTimeMillis() - aeb < aea)
        {
            return;
        } else
        {
            interrupt();
            aeb = aec.currentTimeMillis();
            return;
        }
    }

    void interrupt()
    {
        sc.interrupt();
    }

    public boolean isLimitAdTrackingEnabled()
    {
        la();
        if (tp == null)
        {
            return true;
        } else
        {
            return tp.isLimitAdTrackingEnabled();
        }
    }

    public String kY()
    {
        la();
        if (tp == null)
        {
            return null;
        } else
        {
            return tp.getId();
        }
    }

    void start()
    {
        sc.start();
    }

}
