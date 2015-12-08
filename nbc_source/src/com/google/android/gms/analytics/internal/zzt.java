// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzns;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzf, zzaf

abstract class zzt
{

    private static volatile Handler zzKS;
    private final zzf zzJy;
    private volatile long zzKT;
    private boolean zzKU;
    private final Runnable zzx = new Runnable() {

        final zzt zzKV;

        public void run()
        {
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                zzt.zza(zzKV).zzhS().zze(this);
            } else
            {
                boolean flag = zzKV.zzbp();
                zzt.zza(zzKV, 0L);
                if (flag && !zzt.zzb(zzKV))
                {
                    zzKV.run();
                    return;
                }
            }
        }

            
            {
                zzKV = zzt.this;
                super();
            }
    };

    zzt(zzf zzf1)
    {
        com.google.android.gms.common.internal.zzu.zzu(zzf1);
        zzJy = zzf1;
    }

    private Handler getHandler()
    {
        if (zzKS != null)
        {
            return zzKS;
        }
        com/google/android/gms/analytics/internal/zzt;
        JVM INSTR monitorenter ;
        Handler handler;
        if (zzKS == null)
        {
            zzKS = new Handler(zzJy.getContext().getMainLooper());
        }
        handler = zzKS;
        com/google/android/gms/analytics/internal/zzt;
        JVM INSTR monitorexit ;
        return handler;
        Exception exception;
        exception;
        com/google/android/gms/analytics/internal/zzt;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static long zza(zzt zzt1, long l)
    {
        zzt1.zzKT = l;
        return l;
    }

    static zzf zza(zzt zzt1)
    {
        return zzt1.zzJy;
    }

    static boolean zzb(zzt zzt1)
    {
        return zzt1.zzKU;
    }

    public void cancel()
    {
        zzKT = 0L;
        getHandler().removeCallbacks(zzx);
    }

    public abstract void run();

    public boolean zzbp()
    {
        return zzKT != 0L;
    }

    public long zzjD()
    {
        if (zzKT == 0L)
        {
            return 0L;
        } else
        {
            return Math.abs(zzJy.zzhP().currentTimeMillis() - zzKT);
        }
    }

    public void zzt(long l)
    {
        cancel();
        if (l >= 0L)
        {
            zzKT = zzJy.zzhP().currentTimeMillis();
            if (!getHandler().postDelayed(zzx, l))
            {
                zzJy.zzhQ().zze("Failed to schedule delayed post. time", Long.valueOf(l));
            }
        }
    }

    public void zzu(long l)
    {
        long l1 = 0L;
        if (zzbp())
        {
            if (l < 0L)
            {
                cancel();
                return;
            }
            l -= Math.abs(zzJy.zzhP().currentTimeMillis() - zzKT);
            if (l < 0L)
            {
                l = l1;
            }
            getHandler().removeCallbacks(zzx);
            if (!getHandler().postDelayed(zzx, l))
            {
                zzJy.zzhQ().zze("Failed to adjust delayed post. time", Long.valueOf(l));
                return;
            }
        }
    }
}
