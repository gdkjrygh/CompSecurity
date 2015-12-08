// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.gl;
import com.google.android.gms.internal.gn;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bh

class com.google.android.gms.tagmanager.a
{
    public static interface a
    {

        public abstract com.google.android.gms.ads.identifier.AdvertisingIdClient.Info jW();
    }


    private static com.google.android.gms.tagmanager.a Wx;
    private static Object sf = new Object();
    private volatile long Ws;
    private volatile long Wt;
    private volatile long Wu;
    private final gl Wv;
    private a Ww = new a() {

        final com.google.android.gms.tagmanager.a Wy;

        public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info jW()
        {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
            try
            {
                info = AdvertisingIdClient.getAdvertisingIdInfo(com.google.android.gms.tagmanager.a.a(Wy));
            }
            catch (IllegalStateException illegalstateexception)
            {
                bh.z("IllegalStateException getting Advertising Id Info");
                return null;
            }
            catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception)
            {
                bh.z("GooglePlayServicesRepairableException getting Advertising Id Info");
                return null;
            }
            catch (IOException ioexception)
            {
                bh.z("IOException getting Ad Id Info");
                return null;
            }
            catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
            {
                bh.z("GooglePlayServicesNotAvailableException getting Advertising Id Info");
                return null;
            }
            catch (Exception exception)
            {
                bh.z("Unknown exception. Could not get the Advertising Id Info.");
                return null;
            }
            return info;
        }

            
            {
                Wy = com.google.android.gms.tagmanager.a.this;
                super();
            }
    };
    private volatile boolean mClosed;
    private final Context mContext;
    private final Thread qY;
    private volatile com.google.android.gms.ads.identifier.AdvertisingIdClient.Info sh;

    private com.google.android.gms.tagmanager.a(Context context)
    {
        this(context, null, gn.ft());
    }

    com.google.android.gms.tagmanager.a(Context context, a a1, gl gl1)
    {
        Ws = 0xdbba0L;
        Wt = 30000L;
        mClosed = false;
        Wv = gl1;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        } else
        {
            mContext = context;
        }
        if (a1 != null)
        {
            Ww = a1;
        }
        qY = new Thread(new Runnable() {

            final com.google.android.gms.tagmanager.a Wy;

            public void run()
            {
                com.google.android.gms.tagmanager.a.b(Wy);
            }

            
            {
                Wy = com.google.android.gms.tagmanager.a.this;
                super();
            }
        });
    }

    static com.google.android.gms.tagmanager.a E(Context context)
    {
        if (Wx == null)
        {
            synchronized (sf)
            {
                if (Wx == null)
                {
                    Wx = new com.google.android.gms.tagmanager.a(context);
                    Wx.start();
                }
            }
        }
        return Wx;
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
        a1.jU();
    }

    private void jU()
    {
        Process.setThreadPriority(10);
        while (!mClosed) 
        {
            try
            {
                sh = Ww.jW();
                Thread.sleep(Ws);
            }
            catch (InterruptedException interruptedexception)
            {
                bh.x("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    private void jV()
    {
        if (Wv.currentTimeMillis() - Wu < Wt)
        {
            return;
        } else
        {
            interrupt();
            Wu = Wv.currentTimeMillis();
            return;
        }
    }

    void interrupt()
    {
        qY.interrupt();
    }

    public boolean isLimitAdTrackingEnabled()
    {
        jV();
        if (sh == null)
        {
            return true;
        } else
        {
            return sh.isLimitAdTrackingEnabled();
        }
    }

    public String jT()
    {
        jV();
        if (sh == null)
        {
            return null;
        } else
        {
            return sh.getId();
        }
    }

    void start()
    {
        qY.start();
    }

}
