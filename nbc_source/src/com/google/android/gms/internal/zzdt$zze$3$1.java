// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzdt, zzbb, zzhl

class zzra
    implements Runnable
{

    final zzbb zzra;
    final zzra zzxl;

    public void run()
    {
        zzra(zzxl.xk).xk(zzra);
        zzra.destroy();
    }

    xk(xk xk, zzbb zzbb1)
    {
        zzxl = xk;
        zzra = zzbb1;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzdt$zze$3

/* anonymous class */
    class zzdt.zze._cls3
        implements zzhx.zzc
    {

        final zzdt.zze zzxk;

        public void zza(zzbb zzbb1)
        {
            zzhl.runOnUiThread(new zzdt.zze._cls3._cls1(this, zzbb1));
        }

        public void zzc(Object obj)
        {
            zza((zzbb)obj);
        }

            
            {
                zzxk = zze1;
                super();
            }
    }

}
