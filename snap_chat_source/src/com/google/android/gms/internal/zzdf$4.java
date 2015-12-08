// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.internal:
//            zzdf, zzia

class zzrY extends TimerTask
{

    final zzia zzrY;
    final zzdf zzrZ;

    public void run()
    {
label0:
        {
            synchronized (zzdf.zza(zzrZ))
            {
                if (zzrY.getStatus() != -1 && zzrY.getStatus() != 1)
                {
                    break label0;
                }
            }
            return;
        }
        zzdf.zza(zzrZ, 1);
        zzrY.reject();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (zzdf zzdf1, zzia zzia1)
    {
        zzrZ = zzdf1;
        zzrY = zzia1;
        super();
    }
}
