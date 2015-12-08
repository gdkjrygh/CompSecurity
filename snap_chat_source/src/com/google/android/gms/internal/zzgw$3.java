// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzgw, zzgy, zzia, zzdf, 
//            zzah

static final class zzxj
    implements Runnable
{

    final zzdf zzxj;
    final zzgy zzxk;

    public final void run()
    {
        zzxk.zzdT();
        if (zzxk.zzdR() != null)
        {
            zzxk.zzdR().zza(new zzia.zzd() {

                final zzgw._cls3 zzxs;

                public void zza(Object obj)
                {
                    zzb((zzah)obj);
                }

                public void zzb(zzah zzah1)
                {
                    zzah1.zzb("/invalidRequest", zzxs.zzxk.zzxz);
                    zzah1.zzb("/loadAdURL", zzxs.zzxk.zzxA);
                }

            
            {
                zzxs = zzgw._cls3.this;
                super();
            }
            }, new b());
            zzxj.zzb(zzxk.zzdR());
        }
    }

    _cls1.zzxs(zzgy zzgy1, zzdf zzdf1)
    {
        zzxk = zzgy1;
        zzxj = zzdf1;
        super();
    }
}
