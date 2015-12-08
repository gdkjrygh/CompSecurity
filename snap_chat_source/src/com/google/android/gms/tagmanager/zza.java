// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.zzlv;
import com.google.android.gms.internal.zzlx;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbf

class com.google.android.gms.tagmanager.zza
{
    public static interface zza
    {

        public abstract com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzsC();
    }


    private static Object zzaxj = new Object();
    private static com.google.android.gms.tagmanager.zza zzaxk;
    private volatile boolean mClosed;
    private final Context mContext;
    private volatile com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzAO;
    private volatile long zzaxf;
    private volatile long zzaxg;
    private volatile long zzaxh;
    private zza zzaxi = new zza() {

        final com.google.android.gms.tagmanager.zza zzaxl;

        public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzsC()
        {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
            try
            {
                info = AdvertisingIdClient.getAdvertisingIdInfo(com.google.android.gms.tagmanager.zza.zza(zzaxl));
            }
            catch (IllegalStateException illegalstateexception)
            {
                zzbf.zzac("IllegalStateException getting Advertising Id Info");
                return null;
            }
            catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception)
            {
                zzbf.zzac("GooglePlayServicesRepairableException getting Advertising Id Info");
                return null;
            }
            catch (IOException ioexception)
            {
                zzbf.zzac("IOException getting Ad Id Info");
                return null;
            }
            catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
            {
                zzbf.zzac("GooglePlayServicesNotAvailableException getting Advertising Id Info");
                return null;
            }
            catch (Exception exception)
            {
                zzbf.zzac("Unknown exception. Could not get the Advertising Id Info.");
                return null;
            }
            return info;
        }

            
            {
                zzaxl = com.google.android.gms.tagmanager.zza.this;
                super();
            }
    };
    private final zzlv zzmW;
    private final Thread zzzi;

    private com.google.android.gms.tagmanager.zza(Context context)
    {
        this(context, null, zzlx.zzkc());
    }

    com.google.android.gms.tagmanager.zza(Context context, zza zza1, zzlv zzlv1)
    {
        zzaxf = 0xdbba0L;
        zzaxg = 30000L;
        mClosed = false;
        zzmW = zzlv1;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        } else
        {
            mContext = context;
        }
        if (zza1 != null)
        {
            zzaxi = zza1;
        }
        zzzi = new Thread(new Runnable() {

            final com.google.android.gms.tagmanager.zza zzaxl;

            public void run()
            {
                com.google.android.gms.tagmanager.zza.zzb(zzaxl);
            }

            
            {
                zzaxl = com.google.android.gms.tagmanager.zza.this;
                super();
            }
        });
    }

    static Context zza(com.google.android.gms.tagmanager.zza zza1)
    {
        return zza1.mContext;
    }

    static com.google.android.gms.tagmanager.zza zzaj(Context context)
    {
        if (zzaxk == null)
        {
            synchronized (zzaxj)
            {
                if (zzaxk == null)
                {
                    context = new com.google.android.gms.tagmanager.zza(context);
                    zzaxk = context;
                    context.start();
                }
            }
        }
        return zzaxk;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void zzb(com.google.android.gms.tagmanager.zza zza1)
    {
        zza1.zzsA();
    }

    private void zzsA()
    {
        Process.setThreadPriority(10);
        while (!mClosed) 
        {
            try
            {
                zzAO = zzaxi.zzsC();
                Thread.sleep(zzaxf);
            }
            catch (InterruptedException interruptedexception)
            {
                zzbf.zzaa("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    private void zzsB()
    {
        if (zzmW.currentTimeMillis() - zzaxh < zzaxg)
        {
            return;
        } else
        {
            interrupt();
            zzaxh = zzmW.currentTimeMillis();
            return;
        }
    }

    void interrupt()
    {
        zzzi.interrupt();
    }

    public boolean isLimitAdTrackingEnabled()
    {
        zzsB();
        if (zzAO == null)
        {
            return true;
        } else
        {
            return zzAO.isLimitAdTrackingEnabled();
        }
    }

    void start()
    {
        zzzi.start();
    }

    public String zzsz()
    {
        zzsB();
        if (zzAO == null)
        {
            return null;
        } else
        {
            return zzAO.getId();
        }
    }

}
