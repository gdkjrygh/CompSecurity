// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            zzhw, zzhx, zzax, zzt

public class zzaa
{
    public static class zza
    {

        private final Handler mHandler;

        public boolean postDelayed(Runnable runnable, long l)
        {
            return mHandler.postDelayed(runnable, l);
        }

        public void removeCallbacks(Runnable runnable)
        {
            mHandler.removeCallbacks(runnable);
        }

        public zza(Handler handler)
        {
            mHandler = handler;
        }
    }


    private final zza zzmF;
    private final Runnable zzmG;
    private zzax zzmH;
    private boolean zzmI;
    private boolean zzmJ;
    private long zzmK;

    public zzaa(zzt zzt)
    {
        this(zzt, new zza(zzhw.zzzG));
    }

    zzaa(zzt zzt, zza zza1)
    {
        zzmI = false;
        zzmJ = false;
        zzmK = 0L;
        zzmF = zza1;
        zzmG = new Runnable(new WeakReference(zzt)) {

            final WeakReference zzmL;
            final zzaa zzmM;

            public void run()
            {
                zzaa.zza(zzmM, false);
                zzt zzt1 = (zzt)zzmL.get();
                if (zzt1 != null)
                {
                    zzt1.zzb(zzaa.zza(zzmM));
                }
            }

            
            {
                zzmM = zzaa.this;
                zzmL = weakreference;
                super();
            }
        };
    }

    static zzax zza(zzaa zzaa1)
    {
        return zzaa1.zzmH;
    }

    static boolean zza(zzaa zzaa1, boolean flag)
    {
        zzaa1.zzmI = flag;
        return flag;
    }

    public void cancel()
    {
        zzmI = false;
        zzmF.removeCallbacks(zzmG);
    }

    public void pause()
    {
        zzmJ = true;
        if (zzmI)
        {
            zzmF.removeCallbacks(zzmG);
        }
    }

    public void resume()
    {
        zzmJ = false;
        if (zzmI)
        {
            zzmI = false;
            zza(zzmH, zzmK);
        }
    }

    public void zza(zzax zzax, long l)
    {
        if (zzmI)
        {
            zzhx.zzac("An ad refresh is already scheduled.");
        } else
        {
            zzmH = zzax;
            zzmI = true;
            zzmK = l;
            if (!zzmJ)
            {
                zzhx.zzaa((new StringBuilder("Scheduling ad refresh ")).append(l).append(" milliseconds from now.").toString());
                zzmF.postDelayed(zzmG, l);
                return;
            }
        }
    }

    public boolean zzaG()
    {
        return zzmI;
    }

    public void zzc(zzax zzax)
    {
        zza(zzax, 60000L);
    }
}
