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
//            zzi, zze, zzp, zzm, 
//            zzn

public class zzj extends zzi
{
    class zza
    {

        private String zzkQ;
        private boolean zzkR;
        final zzj zzkS;

        public String getId()
        {
            return zzkQ;
        }

        public boolean isLimitAdTrackingEnabled()
        {
            return zzkR;
        }

        public zza(String s, boolean flag)
        {
            zzkS = zzj.this;
            super();
            zzkQ = s;
            zzkR = flag;
        }
    }

    static final class zzb
        implements Runnable
    {

        private Context zzkT;

        public final void run()
        {
            AdvertisingIdClient advertisingidclient;
            advertisingidclient = new AdvertisingIdClient(zzkT);
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

        public zzb(Context context)
        {
            zzkT = context.getApplicationContext();
            if (zzkT == null)
            {
                zzkT = context;
            }
        }
    }


    private static AdvertisingIdClient zzkN = null;
    private static CountDownLatch zzkO = new CountDownLatch(1);
    private static boolean zzkP;

    protected zzj(Context context, zzm zzm1, zzn zzn)
    {
        super(context, zzm1, zzn);
    }

    static AdvertisingIdClient zzA()
    {
        return zzkN;
    }

    static CountDownLatch zzB()
    {
        return zzkO;
    }

    static AdvertisingIdClient zza(AdvertisingIdClient advertisingidclient)
    {
        zzkN = advertisingidclient;
        return advertisingidclient;
    }

    public static zzj zza(String s, Context context)
    {
        zze zze1;
        zze1 = new zze();
        zza(s, context, ((zzm) (zze1)));
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorenter ;
        if (zzkN == null)
        {
            (new Thread(new zzb(context))).start();
        }
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
        return new zzj(context, zze1, new zzp(239));
        s;
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
        throw s;
    }

    static boolean zza(boolean flag)
    {
        zzkP = flag;
        return flag;
    }

    protected void zzb(Context context)
    {
        super.zzb(context);
        if (zzkP)
        {
            zza(24, zzd(context));
            return;
        }
        context = zzz();
        long l;
        if (context.isLimitAdTrackingEnabled())
        {
            l = 1L;
        } else
        {
            l = 0L;
        }
        zza(28, l);
        context = context.getId();
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

    zza zzz()
    {
        int i = 0;
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorenter ;
        zza zza1;
        if (zzkO.await(2L, TimeUnit.SECONDS))
        {
            break MISSING_BLOCK_LABEL_60;
        }
        zza1 = new zza(null, false);
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
        return zza1;
        Object obj;
        obj;
        obj = new zza(null, false);
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
        return ((zza) (obj));
        obj;
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
        throw obj;
        if (zzkN != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        obj = new zza(null, false);
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
        return ((zza) (obj));
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = zzkN.getInfo();
        com/google/android/gms/internal/zzj;
        JVM INSTR monitorexit ;
        String s;
label0:
        {
            s = info.getId();
            if (s == null || !s.matches("^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$"))
            {
                break label0;
            }
            byte abyte0[] = new byte[16];
            int j = 0;
            int k;
            for (; i < s.length(); i = k + 2)
            {
label1:
                {
                    if (i != 8 && i != 13 && i != 18)
                    {
                        k = i;
                        if (i != 23)
                        {
                            break label1;
                        }
                    }
                    k = i + 1;
                }
                abyte0[j] = (byte)((Character.digit(s.charAt(k), 16) << 4) + Character.digit(s.charAt(k + 1), 16));
                j++;
            }

            s = zzkx.zza(abyte0, true);
        }
        return new zza(s, info.isLimitAdTrackingEnabled());
    }

}
