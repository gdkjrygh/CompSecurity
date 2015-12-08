// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzah, zzgy, zzgw, zzia, 
//            zzdf

class zzxs
    implements zzxs
{

    final  zzxs;

    public void zza(Object obj)
    {
        zzb((zzah)obj);
    }

    public void zzb(zzah zzah1)
    {
        zzah1.zzb("/invalidRequest", zzxs.xk.zzxz);
        zzah1.zzb("/loadAdURL", zzxs.xk.zzxA);
    }

    xj(xj xj)
    {
        zzxs = xj;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzgw$3

/* anonymous class */
    static final class zzgw._cls3
        implements Runnable
    {

        final zzdf zzxj;
        final zzgy zzxk;

        public final void run()
        {
            zzxk.zzdT();
            if (zzxk.zzdR() != null)
            {
                zzxk.zzdR().zza(new zzgw._cls3._cls1(this), new zzia.zzb());
                zzxj.zzb(zzxk.zzdR());
            }
        }

            
            {
                zzxk = zzgy1;
                zzxj = zzdf1;
                super();
            }
    }

}
