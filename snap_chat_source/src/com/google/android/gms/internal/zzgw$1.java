// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzgw, zzdf, zzgy, zzcf, 
//            zzia, zzce, zzah, zzhx

static final class zzxn
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
        zzia1.zza(new zzia.zzd(zzxl.zzcq()) {

            final zzce zzxo;
            final zzgw._cls1 zzxp;

            public void zza(Object obj)
            {
                zzb((zzah)obj);
            }

            public void zzb(zzah zzah1)
            {
                zzxp.zzxl.zza(zzxo, new String[] {
                    "jsf"
                });
                zzah1.zza("/invalidRequest", zzxp.zzxk.zzxz);
                zzah1.zza("/loadAdURL", zzxp.zzxk.zzxA);
                try
                {
                    zzah1.zzb("AFMA_buildAdURL", zzxp.zzxn);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (zzah zzah1)
                {
                    zzhx.zzb("Error requesting an ad url", zzah1);
                }
            }

            
            {
                zzxp = zzgw._cls1.this;
                zzxo = zzce;
                super();
            }
        }, new zzia.zza() {

            final zzgw._cls1 zzxp;

            public void run()
            {
            }

            
            {
                zzxp = zzgw._cls1.this;
                super();
            }
        });
    }

    _cls2.zzxp(zzdf zzdf1, zzgy zzgy1, zzcf zzcf1, zzce zzce, String s)
    {
        zzxj = zzdf1;
        zzxk = zzgy1;
        zzxl = zzcf1;
        zzxm = zzce;
        zzxn = s;
        super();
    }
}
