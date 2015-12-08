// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            hc, hb, ha, hs, 
//            he, qa

final class hd
    implements Runnable
{

    final hc a;

    hd(hc hc1)
    {
        a = hc1;
        super();
    }

    public final void run()
    {
label0:
        {
            synchronized (ha.c(a.b.b))
            {
                if (a.b.a.e() != -1 && a.b.a.e() != 1)
                {
                    break label0;
                }
            }
            return;
        }
        a.b.a.d();
        qa.a(new he(this));
        zzb.v("Could not receive loaded message in a timely manner. Rejecting.");
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
