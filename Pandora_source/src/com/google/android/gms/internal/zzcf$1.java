// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.internal:
//            zzcf, zzfx

class a
    implements 
{

    final zzfx a;
    final zzcf b;

    public void zzbq()
    {
        (new Timer()).schedule(new TimerTask() {

            final zzcf._cls1 a;

            public void run()
            {
label0:
                {
                    synchronized (zzcf.zza(a.b))
                    {
                        if (a.a.getStatus() != -1 && a.a.getStatus() != 1)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                zzcf.zza(a.b, 1);
                a.a.reject();
                obj;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = zzcf._cls1.this;
                super();
            }
        }, b);
    }

    _cls1.a(zzcf zzcf1, zzfx zzfx)
    {
        b = zzcf1;
        a = zzfx;
        super();
    }
}
