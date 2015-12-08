// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            zzeq, zzhw

static final class zzdq
{

    private final Runnable zzmG;
    private volatile boolean zzuF;

    static boolean zza(zzdq zzdq1)
    {
        return zzdq1.zzuF;
    }

    public final void cancel()
    {
        zzuF = true;
        zzhw.zzzG.removeCallbacks(zzmG);
    }

    public final void zzdq()
    {
        zzhw.zzzG.postDelayed(zzmG, 250L);
    }

    public _cls1.zzuH(zzeq zzeq1)
    {
        zzuF = false;
        zzmG = new Runnable(zzeq1) {

            private final WeakReference zzuG;
            final zzeq zzuH;
            final zzeq.zza zzuI;

            public void run()
            {
                zzeq zzeq2 = (zzeq)zzuG.get();
                if (!zzeq.zza.zza(zzuI) && zzeq2 != null)
                {
                    zzeq2.zzdp();
                    zzuI.zzdq();
                }
            }

            
            {
                zzuI = zzeq.zza.this;
                zzuH = zzeq1;
                super();
                zzuG = new WeakReference(zzuH);
            }
        };
    }
}
