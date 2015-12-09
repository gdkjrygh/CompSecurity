// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzeq, zzes, zzfx, zzcf, 
//            zzy

static final class b
    implements Runnable
{

    final zzes a;
    final zzcf b;

    public void run()
    {
        a.zzez();
        if (a.zzex() != null)
        {
            a.zzex().zza(new zzfx.zzd() {

                final zzeq._cls3 a;

                public void a(zzy zzy1)
                {
                    zzy1.zzb("/invalidRequest", a.a.zzAy);
                    zzy1.zzb("/loadAdURL", a.a.zzAz);
                }

                public void zza(Object obj)
                {
                    a((zzy)obj);
                }

            
            {
                a = zzeq._cls3.this;
                super();
            }
            }, new b());
            b.zzb(a.zzex());
        }
    }

    _cls1.a(zzes zzes1, zzcf zzcf1)
    {
        a = zzes1;
        b = zzcf1;
        super();
    }
}
