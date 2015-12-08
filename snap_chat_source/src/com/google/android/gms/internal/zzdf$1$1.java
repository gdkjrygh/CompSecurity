// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.internal:
//            zzdf, zzia

class zzsa extends TimerTask
{

    final ct zzsa;

    public void run()
    {
label0:
        {
            synchronized (zzdf.zza(zzsa.rZ))
            {
                if (zzsa.rY.getStatus() != -1 && zzsa.rY.getStatus() != 1)
                {
                    break label0;
                }
            }
            return;
        }
        zzdf.zza(zzsa.rZ, 1);
        zzsa.rY.reject();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    rY(rY ry)
    {
        zzsa = ry;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzdf$1

/* anonymous class */
    class zzdf._cls1
        implements zzah.zza
    {

        final zzia zzrY;
        final zzdf zzrZ;

        public void zzbk()
        {
            (new Timer()).schedule(new zzdf._cls1._cls1(this), zzdf.zza.zzsd);
        }

            
            {
                zzrZ = zzdf1;
                zzrY = zzia1;
                super();
            }
    }

}
