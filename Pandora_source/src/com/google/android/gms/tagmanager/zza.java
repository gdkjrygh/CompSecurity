// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.zzht;
import com.google.android.gms.internal.zzhv;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbg

class com.google.android.gms.tagmanager.zza
{
    public static interface zza
    {

        public abstract com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzwm();
    }


    private static Object j = new Object();
    private static com.google.android.gms.tagmanager.zza k;
    private volatile long a;
    private volatile long b;
    private volatile boolean c;
    private volatile com.google.android.gms.ads.identifier.AdvertisingIdClient.Info d;
    private volatile long e;
    private final Context f;
    private final zzht g;
    private final Thread h;
    private zza i = new zza() {

        final com.google.android.gms.tagmanager.zza a;

        public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zzwm()
        {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
            try
            {
                info = AdvertisingIdClient.getAdvertisingIdInfo(com.google.android.gms.tagmanager.zza.a(a));
            }
            catch (IllegalStateException illegalstateexception)
            {
                zzbg.zzan("IllegalStateException getting Advertising Id Info");
                return null;
            }
            catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception)
            {
                zzbg.zzan("GooglePlayServicesRepairableException getting Advertising Id Info");
                return null;
            }
            catch (IOException ioexception)
            {
                zzbg.zzan("IOException getting Ad Id Info");
                return null;
            }
            catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
            {
                zzbg.zzan("GooglePlayServicesNotAvailableException getting Advertising Id Info");
                return null;
            }
            catch (Exception exception)
            {
                zzbg.zzan("Unknown exception. Could not get the Advertising Id Info.");
                return null;
            }
            return info;
        }

            
            {
                a = com.google.android.gms.tagmanager.zza.this;
                super();
            }
    };

    private com.google.android.gms.tagmanager.zza(Context context)
    {
        this(context, null, zzhv.zznd());
    }

    com.google.android.gms.tagmanager.zza(Context context, zza zza1, zzht zzht1)
    {
        a = 0xdbba0L;
        b = 30000L;
        c = false;
        g = zzht1;
        if (context != null)
        {
            f = context.getApplicationContext();
        } else
        {
            f = context;
        }
        if (zza1 != null)
        {
            i = zza1;
        }
        h = new Thread(new Runnable() {

            final com.google.android.gms.tagmanager.zza a;

            public void run()
            {
                com.google.android.gms.tagmanager.zza.b(a);
            }

            
            {
                a = com.google.android.gms.tagmanager.zza.this;
                super();
            }
        });
    }

    static Context a(com.google.android.gms.tagmanager.zza zza1)
    {
        return zza1.f;
    }

    static com.google.android.gms.tagmanager.zza a(Context context)
    {
        if (k == null)
        {
            synchronized (j)
            {
                if (k == null)
                {
                    k = new com.google.android.gms.tagmanager.zza(context);
                    k.d();
                }
            }
        }
        return k;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void b(com.google.android.gms.tagmanager.zza zza1)
    {
        zza1.e();
    }

    private void e()
    {
        Process.setThreadPriority(10);
        while (!c) 
        {
            try
            {
                d = i.zzwm();
                Thread.sleep(a);
            }
            catch (InterruptedException interruptedexception)
            {
                zzbg.zzal("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    private void f()
    {
        if (g.currentTimeMillis() - e < b)
        {
            return;
        } else
        {
            c();
            e = g.currentTimeMillis();
            return;
        }
    }

    public String a()
    {
        f();
        if (d == null)
        {
            return null;
        } else
        {
            return d.getId();
        }
    }

    public boolean b()
    {
        f();
        if (d == null)
        {
            return true;
        } else
        {
            return d.isLimitAdTrackingEnabled();
        }
    }

    void c()
    {
        h.interrupt();
    }

    void d()
    {
        h.start();
    }

}
