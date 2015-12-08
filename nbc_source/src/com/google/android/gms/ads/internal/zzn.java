// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzhl;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zza

public class zzn
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


    private final zza zzpg;
    private AdRequestParcel zzph;
    private boolean zzpi;
    private boolean zzpj;
    private long zzpk;
    private final Runnable zzx;

    public zzn(com.google.android.gms.ads.internal.zza zza1)
    {
        this(zza1, new zza(zzhl.zzGk));
    }

    zzn(com.google.android.gms.ads.internal.zza zza1, zza zza2)
    {
        zzpi = false;
        zzpj = false;
        zzpk = 0L;
        zzpg = zza2;
        zzx = new Runnable(new WeakReference(zza1)) {

            final WeakReference zzpl;
            final zzn zzpm;

            public void run()
            {
                zzn.zza(zzpm, false);
                com.google.android.gms.ads.internal.zza zza3 = (com.google.android.gms.ads.internal.zza)zzpl.get();
                if (zza3 != null)
                {
                    zza3.zzd(zzn.zza(zzpm));
                }
            }

            
            {
                zzpm = zzn.this;
                zzpl = weakreference;
                super();
            }
        };
    }

    static AdRequestParcel zza(zzn zzn1)
    {
        return zzn1.zzph;
    }

    static boolean zza(zzn zzn1, boolean flag)
    {
        zzn1.zzpi = flag;
        return flag;
    }

    public void cancel()
    {
        zzpi = false;
        zzpg.removeCallbacks(zzx);
    }

    public void pause()
    {
        zzpj = true;
        if (zzpi)
        {
            zzpg.removeCallbacks(zzx);
        }
    }

    public void resume()
    {
        zzpj = false;
        if (zzpi)
        {
            zzpi = false;
            zza(zzph, zzpk);
        }
    }

    public void zza(AdRequestParcel adrequestparcel, long l)
    {
        if (zzpi)
        {
            zzb.zzaC("An ad refresh is already scheduled.");
        } else
        {
            zzph = adrequestparcel;
            zzpi = true;
            zzpk = l;
            if (!zzpj)
            {
                zzb.zzaA((new StringBuilder()).append("Scheduling ad refresh ").append(l).append(" milliseconds from now.").toString());
                zzpg.postDelayed(zzx, l);
                return;
            }
        }
    }

    public boolean zzbp()
    {
        return zzpi;
    }

    public void zzf(AdRequestParcel adrequestparcel)
    {
        zza(adrequestparcel, 60000L);
    }
}
