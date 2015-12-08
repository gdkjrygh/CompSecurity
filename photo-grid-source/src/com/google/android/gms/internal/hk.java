// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            ro, ha, hs

final class hk
    implements ro
{

    final hs a;
    final ha b;

    hk(ha ha1, hs hs1)
    {
        b = ha1;
        a = hs1;
        super();
    }

    public final void a()
    {
        synchronized (ha.c(b))
        {
            ha.a(b, 1);
            zzb.v("Failed loading new engine. Marking new engine destroyable.");
            a.c();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
