// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ju;
import com.google.android.gms.internal.jw;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bh

class com.google.android.gms.tagmanager.a
{
    public static interface a
    {

        public abstract com.google.android.gms.ads.identifier.AdvertisingIdClient.Info nM();
    }


    private static com.google.android.gms.tagmanager.a anQ;
    private static Object xz = new Object();
    private volatile long anM;
    private volatile long anN;
    private volatile long anO;
    private a anP = new a() {

        final com.google.android.gms.tagmanager.a anR;

        public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info nM()
        {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
            try
            {
                info = AdvertisingIdClient.getAdvertisingIdInfo(com.google.android.gms.tagmanager.a.a(anR));
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
                anR = com.google.android.gms.tagmanager.a.this;
                super();
            }
    };
    private volatile boolean mClosed;
    private final Context mContext;
    private final Thread wf;
    private volatile com.google.android.gms.ads.identifier.AdvertisingIdClient.Info xB;
    private final ju yD;

    private com.google.android.gms.tagmanager.a(Context context)
    {
        this(context, null, jw.hA());
    }

    com.google.android.gms.tagmanager.a(Context context, a a1, ju ju1)
    {
        anM = 0xdbba0L;
        anN = 30000L;
        mClosed = false;
        yD = ju1;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        } else
        {
            mContext = context;
        }
        if (a1 != null)
        {
            anP = a1;
        }
        wf = new Thread(new Runnable() {

            final com.google.android.gms.tagmanager.a anR;

            public void run()
            {
                com.google.android.gms.tagmanager.a.b(anR);
            }

            
            {
                anR = com.google.android.gms.tagmanager.a.this;
                super();
            }
        });
    }

    static com.google.android.gms.tagmanager.a W(Context context)
    {
        if (anQ == null)
        {
            synchronized (xz)
            {
                if (anQ == null)
                {
                    anQ = new com.google.android.gms.tagmanager.a(context);
                    anQ.start();
                }
            }
        }
        return anQ;
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
        a1.nK();
    }

    private void nK()
    {
        Process.setThreadPriority(10);
        while (!mClosed) 
        {
            try
            {
                xB = anP.nM();
                Thread.sleep(anM);
            }
            catch (InterruptedException interruptedexception)
            {
                bh.U("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    private void nL()
    {
        if (yD.currentTimeMillis() - anO < anN)
        {
            return;
        } else
        {
            interrupt();
            anO = yD.currentTimeMillis();
            return;
        }
    }

    void interrupt()
    {
        wf.interrupt();
    }

    public boolean isLimitAdTrackingEnabled()
    {
        nL();
        if (xB == null)
        {
            return true;
        } else
        {
            return xB.isLimitAdTrackingEnabled();
        }
    }

    public String nJ()
    {
        nL();
        if (xB == null)
        {
            return null;
        } else
        {
            return xB.getId();
        }
    }

    void start()
    {
        wf.start();
    }

}
