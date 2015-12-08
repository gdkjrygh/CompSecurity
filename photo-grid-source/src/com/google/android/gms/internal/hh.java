// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            hb, ha, hs, hi, 
//            qa, bg

final class hh
    implements Runnable
{

    final bg a;
    final hb b;

    hh(hb hb1, bg bg)
    {
        b = hb1;
        a = bg;
        super();
    }

    public final void run()
    {
label0:
        {
            synchronized (ha.c(b.b))
            {
                if (b.a.e() != -1 && b.a.e() != 1)
                {
                    break label0;
                }
            }
            return;
        }
        b.a.d();
        qa.a(new hi(this));
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
