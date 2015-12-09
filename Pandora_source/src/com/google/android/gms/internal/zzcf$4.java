// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.internal:
//            zzcf, zzfx

class a extends TimerTask
{

    final zzfx a;
    final zzcf b;

    public void run()
    {
label0:
        {
            synchronized (zzcf.zza(b))
            {
                if (a.getStatus() != -1 && a.getStatus() != 1)
                {
                    break label0;
                }
            }
            return;
        }
        zzcf.zza(b, 1);
        a.reject();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (zzcf zzcf1, zzfx zzfx1)
    {
        b = zzcf1;
        a = zzfx1;
        super();
    }
}
