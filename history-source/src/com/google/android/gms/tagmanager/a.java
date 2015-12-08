// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ld;
import com.google.android.gms.internal.lf;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bh

class com.google.android.gms.tagmanager.a
{
    public static interface a
    {

        public abstract com.google.android.gms.ads.identifier.AdvertisingIdClient.Info pd();
    }


    private static com.google.android.gms.tagmanager.a aqa;
    private static Object xO = new Object();
    private volatile long apW;
    private volatile long apX;
    private volatile long apY;
    private a apZ = new a() {

        final com.google.android.gms.tagmanager.a aqb;

        public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info pd()
        {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
            try
            {
                info = AdvertisingIdClient.getAdvertisingIdInfo(com.google.android.gms.tagmanager.a.a(aqb));
            }
            catch (IllegalStateException illegalstateexception)
            {
                bh.W("IllegalStateException getting Advertising Id Info");
                return null;
            }
            catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception)
            {
                bh.W("GooglePlayServicesRepairableException getting Advertising Id Info");
                return null;
            }
            catch (IOException ioexception)
            {
                bh.W("IOException getting Ad Id Info");
                return null;
            }
            catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
            {
                bh.W("GooglePlayServicesNotAvailableException getting Advertising Id Info");
                return null;
            }
            catch (Exception exception)
            {
                bh.W("Unknown exception. Could not get the Advertising Id Info.");
                return null;
            }
            return info;
        }

            
            {
                aqb = com.google.android.gms.tagmanager.a.this;
                super();
            }
    };
    private volatile boolean mClosed;
    private final Context mContext;
    private final ld wb;
    private final Thread wu;
    private volatile com.google.android.gms.ads.identifier.AdvertisingIdClient.Info xQ;

    private com.google.android.gms.tagmanager.a(Context context)
    {
        this(context, null, lf._mthif());
    }

    com.google.android.gms.tagmanager.a(Context context, a a1, ld ld1)
    {
        apW = 0xdbba0L;
        apX = 30000L;
        mClosed = false;
        wb = ld1;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        } else
        {
            mContext = context;
        }
        if (a1 != null)
        {
            apZ = a1;
        }
        wu = new Thread(new Runnable() {

            final com.google.android.gms.tagmanager.a aqb;

            public void run()
            {
                com.google.android.gms.tagmanager.a.b(aqb);
            }

            
            {
                aqb = com.google.android.gms.tagmanager.a.this;
                super();
            }
        });
    }

    static com.google.android.gms.tagmanager.a W(Context context)
    {
        if (aqa == null)
        {
            synchronized (xO)
            {
                if (aqa == null)
                {
                    aqa = new com.google.android.gms.tagmanager.a(context);
                    aqa.start();
                }
            }
        }
        return aqa;
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
        a1.pb();
    }

    private void pb()
    {
        Process.setThreadPriority(10);
        while (!mClosed) 
        {
            try
            {
                xQ = apZ.pd();
                Thread.sleep(apW);
            }
            catch (InterruptedException interruptedexception)
            {
                bh.U("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    private void pc()
    {
        if (wb.currentTimeMillis() - apY < apX)
        {
            return;
        } else
        {
            interrupt();
            apY = wb.currentTimeMillis();
            return;
        }
    }

    void interrupt()
    {
        wu.interrupt();
    }

    public boolean isLimitAdTrackingEnabled()
    {
        pc();
        if (xQ == null)
        {
            return true;
        } else
        {
            return xQ.isLimitAdTrackingEnabled();
        }
    }

    public String pa()
    {
        pc();
        if (xQ == null)
        {
            return null;
        } else
        {
            return xQ.getId();
        }
    }

    void start()
    {
        wu.start();
    }

}
