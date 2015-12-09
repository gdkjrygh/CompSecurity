// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzeq, zzcf, zzes, zzay, 
//            zzfx, zzax, zzy

static final class e
    implements Runnable
{

    final zzcf a;
    final zzes b;
    final zzay c;
    final zzax d;
    final String e;

    public void run()
    {
        zzfx zzfx1 = a.zzda();
        b.zze(zzfx1);
        c.zza(d, new String[] {
            "rwc"
        });
        zzfx1.zza(new zzfx.zzd(c.zzct()) {

            final zzax a;
            final zzeq._cls1 b;

            public void a(zzy zzy1)
            {
                b.c.zza(a, new String[] {
                    "jsf"
                });
                b.c.zzcu();
                zzy1.zza("/invalidRequest", b.b.zzAy);
                zzy1.zza("/loadAdURL", b.b.zzAz);
                try
                {
                    zzy1.zzb("AFMA_buildAdURL", b.e);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (zzy zzy1)
                {
                    zzb.zzb("Error requesting an ad url", zzy1);
                }
            }

            public void zza(Object obj)
            {
                a((zzy)obj);
            }

            
            {
                b = zzeq._cls1.this;
                a = zzax;
                super();
            }
        }, new zzfx.zza() {

            final zzeq._cls1 a;

            public void run()
            {
            }

            
            {
                a = zzeq._cls1.this;
                super();
            }
        });
    }

    _cls2.a(zzcf zzcf1, zzes zzes1, zzay zzay1, zzax zzax, String s)
    {
        a = zzcf1;
        b = zzes1;
        c = zzay1;
        d = zzax;
        e = s;
        super();
    }
}
