// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.internal:
//            zzdf, zzia

class zzrY
    implements a
{

    final zzia zzrY;
    final zzdf zzrZ;

    public void zzbk()
    {
        (new Timer()).schedule(new TimerTask() {

            final zzdf._cls1 zzsa;

            public void run()
            {
label0:
                {
                    synchronized (zzdf.zza(zzsa.zzrZ))
                    {
                        if (zzsa.zzrY.getStatus() != -1 && zzsa.zzrY.getStatus() != 1)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                zzdf.zza(zzsa.zzrZ, 1);
                zzsa.zzrY.reject();
                obj;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                zzsa = zzdf._cls1.this;
                super();
            }
        }, a.zzsd);
    }

    _cls1.zzsa(zzdf zzdf1, zzia zzia)
    {
        zzrZ = zzdf1;
        zzrY = zzia;
        super();
    }
}
