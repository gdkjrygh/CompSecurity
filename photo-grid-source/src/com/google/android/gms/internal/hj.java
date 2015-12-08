// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            rq, ha, hs

final class hj
    implements rq
{

    final hs a;
    final ha b;

    hj(ha ha1, hs hs1)
    {
        b = ha1;
        a = hs1;
        super();
    }

    public final void a(Object obj)
    {
        synchronized (ha.c(b))
        {
            ha.a(b, 0);
            if (ha.g(b) != null && a != ha.g(b))
            {
                zzb.v("New JS engine is loaded, marking previous one as destroyable.");
                ha.g(b).c();
            }
            ha.a(b, a);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
