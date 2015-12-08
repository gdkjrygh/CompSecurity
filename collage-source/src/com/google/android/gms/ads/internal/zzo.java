// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.gw;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zza

public class zzo
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


    private boolean zzpA;
    private boolean zzpB;
    private long zzpC;
    private final zza zzpy;
    private AdRequestParcel zzpz;
    private final Runnable zzx;

    public zzo(com.google.android.gms.ads.internal.zza zza1)
    {
        this(zza1, new zza(gw.a));
    }

    zzo(com.google.android.gms.ads.internal.zza zza1, zza zza2)
    {
        zzpA = false;
        zzpB = false;
        zzpC = 0L;
        zzpy = zza2;
        zzx = new Runnable(new WeakReference(zza1)) {

            final WeakReference zzpD;
            final zzo zzpE;

            public void run()
            {
                zzo.zza(zzpE, false);
                com.google.android.gms.ads.internal.zza zza3 = (com.google.android.gms.ads.internal.zza)zzpD.get();
                if (zza3 != null)
                {
                    zza3.zzc(zzo.zza(zzpE));
                }
            }

            
            {
                zzpE = zzo.this;
                zzpD = weakreference;
                super();
            }
        };
    }

    static AdRequestParcel zza(zzo zzo1)
    {
        return zzo1.zzpz;
    }

    static boolean zza(zzo zzo1, boolean flag)
    {
        zzo1.zzpA = flag;
        return flag;
    }

    public void cancel()
    {
        zzpA = false;
        zzpy.removeCallbacks(zzx);
    }

    public void pause()
    {
        zzpB = true;
        if (zzpA)
        {
            zzpy.removeCallbacks(zzx);
        }
    }

    public void resume()
    {
        zzpB = false;
        if (zzpA)
        {
            zzpA = false;
            zza(zzpz, zzpC);
        }
    }

    public void zza(AdRequestParcel adrequestparcel, long l)
    {
        if (zzpA)
        {
            zzb.zzaE("An ad refresh is already scheduled.");
        } else
        {
            zzpz = adrequestparcel;
            zzpA = true;
            zzpC = l;
            if (!zzpB)
            {
                zzb.zzaD((new StringBuilder()).append("Scheduling ad refresh ").append(l).append(" milliseconds from now.").toString());
                zzpy.postDelayed(zzx, l);
                return;
            }
        }
    }

    public boolean zzbr()
    {
        return zzpA;
    }

    public void zzf(AdRequestParcel adrequestparcel)
    {
        zza(adrequestparcel, 60000L);
    }
}
