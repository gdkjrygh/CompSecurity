// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzah, zzcf, zzgy, zzhx, 
//            zzce, zzgw, zzdf, zzia

class zzxo
    implements zzxo
{

    final zzce zzxo;
    final xn zzxp;

    public void zza(Object obj)
    {
        zzb((zzah)obj);
    }

    public void zzb(zzah zzah1)
    {
        zzxp.xl.zza(zzxo, new String[] {
            "jsf"
        });
        zzah1.zza("/invalidRequest", zzxp.xk.zzxz);
        zzah1.zza("/loadAdURL", zzxp.xk.zzxA);
        try
        {
            zzah1.zzb("AFMA_buildAdURL", zzxp.xn);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzah zzah1)
        {
            zzhx.zzb("Error requesting an ad url", zzah1);
        }
    }

    xn(xn xn, zzce zzce)
    {
        zzxp = xn;
        zzxo = zzce;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzgw$1

/* anonymous class */
    static final class zzgw._cls1
        implements Runnable
    {

        final zzdf zzxj;
        final zzgy zzxk;
        final zzcf zzxl;
        final zzce zzxm;
        final String zzxn;

        public final void run()
        {
            zzia zzia1 = zzxj.zzcJ();
            zzxk.zze(zzia1);
            zzxl.zza(zzxm, new String[] {
                "rwc"
            });
            zzia1.zza(new zzgw._cls1._cls1(this, zzxl.zzcq()), new zzgw._cls1._cls2());
        }

            
            {
                zzxj = zzdf1;
                zzxk = zzgy1;
                zzxl = zzcf1;
                zzxm = zzce;
                zzxn = s;
                super();
            }

        // Unreferenced inner class com/google/android/gms/internal/zzgw$1$2

/* anonymous class */
        class zzgw._cls1._cls2
            implements zzia.zza
        {

            final zzgw._cls1 zzxp;

            public void run()
            {
            }

                    
                    {
                        zzxp = zzgw._cls1.this;
                        super();
                    }
        }

    }

}
