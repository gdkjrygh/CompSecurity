// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzeq, zzcf, zzes, zzay, 
//            zzfx, zzax, zzy

class a
    implements a
{

    final a a;

    public void run()
    {
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzeq$1

/* anonymous class */
    static final class zzeq._cls1
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
            zzfx1.zza(new zzeq._cls1._cls1(c.zzct()), new zzeq._cls1._cls2(this));
        }

            
            {
                a = zzcf1;
                b = zzes1;
                c = zzay1;
                d = zzax;
                e = s;
                super();
            }

        // Unreferenced inner class com/google/android/gms/internal/zzeq$1$1

/* anonymous class */
        class zzeq._cls1._cls1
            implements zzfx.zzd
        {

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
        }

    }

}
