// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            zzi, d, s, zzm, 
//            o

public class zzj extends zzi
{
    class a
    {

        final zzj a;
        private String b;
        private boolean c;

        public String a()
        {
            return b;
        }

        public boolean b()
        {
            return c;
        }

        public a(String s1, boolean flag)
        {
            a = zzj.this;
            super();
            b = s1;
            c = flag;
        }
    }

    private static final class b
        implements Runnable
    {

        private Context a;

        public void run()
        {
            AdvertisingIdClient advertisingidclient;
            advertisingidclient = new AdvertisingIdClient(a);
            advertisingidclient.start();
            com/google/android/gms/internal/zzj;
            JVM INSTR monitorenter ;
            if (zzj.zzA() != null) goto _L2; else goto _L1
_L1:
            zzj.zza(advertisingidclient);
_L3:
            com/google/android/gms/internal/zzj;
            JVM INSTR monitorexit ;
_L4:
            zzj.zzB().countDown();
            return;
_L2:
            advertisingidclient.finish();
              goto _L3
            Exception exception;
            exception;
            com/google/android/gms/internal/zzj;
            JVM INSTR monitorexit ;
            try
            {
                throw exception;
            }
            catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
            {
                zzj.zza(true);
            }
            catch (IOException ioexception) { }
            catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception) { }
              goto _L4
        }

        public b(Context context)
        {
            a = context.getApplicationContext();
            if (a == null)
            {
                a = context;
            }
        }
    }


    private static AdvertisingIdClient zzlE = null;
    private static CountDownLatch zzlF = new CountDownLatch(1);
    private static boolean zzlG;
    private boolean zzlH;

    protected zzj(Context context, zzm zzm, o o, boolean flag)
    {
        super(context, zzm, o);
        zzlH = flag;
    }

    static AdvertisingIdClient zzA()
    {
        return zzlE;
    }

    static CountDownLatch zzB()
    {
        return zzlF;
    }

    static AdvertisingIdClient zza(AdvertisingIdClient advertisingidclient)
    {
        zzlE = advertisingidclient;
        return advertisingidclient;
    }

    public static zzj zza(String s1, Context context, boolean flag)
    {
        d d1;
        d1 = new d();
        zza(s1, context, ((zzm) (d1)));
        if (!flag) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorenter ;
        if (zzlE == null)
        {
            (new Thread(new b(context))).start();
        }
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
_L2:
        return new zzj(context, d1, new s(239), flag);
        s1;
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    static boolean zza(boolean flag)
    {
        zzlG = flag;
        return flag;
    }

    protected void zzb(Context context)
    {
        super.zzb(context);
        if (zzlG || !zzlH)
        {
            zza(24, zzd(context));
            return;
        }
        context = zzz();
        long l;
        if (context.b())
        {
            l = 1L;
        } else
        {
            l = 0L;
        }
        zza(28, l);
        context = context.a();
        if (context != null)
        {
            try
            {
                zza(26, 5L);
                zza(24, context);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return;
    }

    a zzz()
        throws IOException
    {
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorenter ;
        Object obj;
        if (zzlF.await(2L, TimeUnit.SECONDS))
        {
            break MISSING_BLOCK_LABEL_57;
        }
        obj = new a(null, false);
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
        return ((a) (obj));
        Object obj1;
        obj1;
        obj1 = new a(null, false);
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
        return ((a) (obj1));
        obj1;
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
        throw obj1;
        if (zzlE != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        obj1 = new a(null, false);
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
        return ((a) (obj1));
        obj1 = zzlE.getInfo();
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
        return new a(zzb(((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj1)).getId()), ((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj1)).isLimitAdTrackingEnabled());
    }

}
