// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzld;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbg

class com.google.android.gms.tagmanager.zza
{
    public static interface zza
    {

        public abstract com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzyg();
    }


    private static Object zzaKl = new Object();
    private static com.google.android.gms.tagmanager.zza zzaKm;
    private volatile boolean mClosed;
    private final Context mContext;
    private final Thread zzFZ;
    private volatile com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzJl;
    private volatile long zzaKh;
    private volatile long zzaKi;
    private volatile long zzaKj;
    private zza zzaKk = new zza() {

        final com.google.android.gms.tagmanager.zza zzaKn;

        public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzyg()
        {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
            try
            {
                info = AdvertisingIdClient.getAdvertisingIdInfo(com.google.android.gms.tagmanager.zza.zza(zzaKn));
            }
            catch (IllegalStateException illegalstateexception)
            {
                zzbg.zzaC("IllegalStateException getting Advertising Id Info");
                return null;
            }
            catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception)
            {
                zzbg.zzaC("GooglePlayServicesRepairableException getting Advertising Id Info");
                return null;
            }
            catch (IOException ioexception)
            {
                zzbg.zzaC("IOException getting Ad Id Info");
                return null;
            }
            catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
            {
                zzbg.zzaC("GooglePlayServicesNotAvailableException getting Advertising Id Info");
                return null;
            }
            catch (Exception exception)
            {
                zzbg.zzaC("Unknown exception. Could not get the Advertising Id Info.");
                return null;
            }
            return info;
        }

            
            {
                zzaKn = com.google.android.gms.tagmanager.zza.this;
                super();
            }
    };
    private final zzlb zzpw;

    private com.google.android.gms.tagmanager.zza(Context context)
    {
        this(context, null, zzld.zzoQ());
    }

    com.google.android.gms.tagmanager.zza(Context context, zza zza1, zzlb zzlb1)
    {
        zzaKh = 0xdbba0L;
        zzaKi = 30000L;
        mClosed = false;
        zzpw = zzlb1;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        } else
        {
            mContext = context;
        }
        if (zza1 != null)
        {
            zzaKk = zza1;
        }
        zzFZ = new Thread(new Runnable() {

            final com.google.android.gms.tagmanager.zza zzaKn;

            public void run()
            {
                com.google.android.gms.tagmanager.zza.zzb(zzaKn);
            }

            
            {
                zzaKn = com.google.android.gms.tagmanager.zza.this;
                super();
            }
        });
    }

    static Context zza(com.google.android.gms.tagmanager.zza zza1)
    {
        return zza1.mContext;
    }

    static com.google.android.gms.tagmanager.zza zzaE(Context context)
    {
        if (zzaKm == null)
        {
            synchronized (zzaKl)
            {
                if (zzaKm == null)
                {
                    zzaKm = new com.google.android.gms.tagmanager.zza(context);
                    zzaKm.start();
                }
            }
        }
        return zzaKm;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void zzb(com.google.android.gms.tagmanager.zza zza1)
    {
        zza1.zzye();
    }

    private void zzye()
    {
        Process.setThreadPriority(10);
        while (!mClosed) 
        {
            try
            {
                zzJl = zzaKk.zzyg();
                Thread.sleep(zzaKh);
            }
            catch (InterruptedException interruptedexception)
            {
                zzbg.zzaA("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    private void zzyf()
    {
        if (zzpw.currentTimeMillis() - zzaKj < zzaKi)
        {
            return;
        } else
        {
            interrupt();
            zzaKj = zzpw.currentTimeMillis();
            return;
        }
    }

    void interrupt()
    {
        zzFZ.interrupt();
    }

    public boolean isLimitAdTrackingEnabled()
    {
        zzyf();
        if (zzJl == null)
        {
            return true;
        } else
        {
            return zzJl.isLimitAdTrackingEnabled();
        }
    }

    void start()
    {
        zzFZ.start();
    }

    public String zzyd()
    {
        zzyf();
        if (zzJl == null)
        {
            return null;
        } else
        {
            return zzJl.getId();
        }
    }

}
