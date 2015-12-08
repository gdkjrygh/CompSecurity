// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;


// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzb

final class b
    implements Runnable
{

    final zzb a;

    b(zzb zzb1)
    {
        a = zzb1;
        super();
    }

    public final void run()
    {
label0:
        {
            synchronized (zzb.a(a))
            {
                if (a.a != null)
                {
                    break label0;
                }
            }
            return;
        }
        a.onStop();
        zzb.a(a, "Timed out waiting for ad response.");
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
