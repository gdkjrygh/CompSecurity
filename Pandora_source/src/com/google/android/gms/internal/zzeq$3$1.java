// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzes, zzy, zzeq, zzfx, 
//            zzcf

class a
    implements a
{

    final a a;

    public void a(zzy zzy1)
    {
        zzy1.zzb("/invalidRequest", a.a.zzAy);
        zzy1.zzb("/loadAdURL", a.a.zzAz);
    }

    public void zza(Object obj)
    {
        a((zzy)obj);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzeq$3

/* anonymous class */
    static final class zzeq._cls3
        implements Runnable
    {

        final zzes a;
        final zzcf b;

        public void run()
        {
            a.zzez();
            if (a.zzex() != null)
            {
                a.zzex().zza(new zzeq._cls3._cls1(this), new zzfx.zzb());
                b.zzb(a.zzex());
            }
        }

            
            {
                a = zzes1;
                b = zzcf1;
                super();
            }
    }

}
