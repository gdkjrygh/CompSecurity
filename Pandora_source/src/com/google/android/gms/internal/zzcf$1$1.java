// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.internal:
//            zzcf, zzfx

class a extends TimerTask
{

    final ct a;

    public void run()
    {
label0:
        {
            synchronized (zzcf.zza(a.a))
            {
                if (a.a.getStatus() != -1 && a.a.getStatus() != 1)
                {
                    break label0;
                }
            }
            return;
        }
        zzcf.zza(a.a, 1);
        a.a.reject();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzcf$1

/* anonymous class */
    class zzcf._cls1
        implements zzy.zza
    {

        final zzfx a;
        final zzcf b;

        public void zzbq()
        {
            (new Timer()).schedule(new zzcf._cls1._cls1(this), zzcf.a.b);
        }

            
            {
                b = zzcf1;
                a = zzfx1;
                super();
            }
    }

}
