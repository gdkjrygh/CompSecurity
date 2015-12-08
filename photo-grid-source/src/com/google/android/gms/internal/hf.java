// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            fz, hb, ha, hs, 
//            hm, bg, ry

final class hf
    implements fz
{

    final bg a;
    final hb b;

    hf(hb hb1, bg bg)
    {
        b = hb1;
        a = bg;
        super();
    }

    public final void zza(ry ry, Map map)
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
        ha.a(b.b, 0);
        ha.d(b.b).zzc(a);
        b.a.a(a);
        ha.a(b.b, b.a);
        zzb.v("Successfully loaded JS Engine.");
        ry;
        JVM INSTR monitorexit ;
        return;
        map;
        ry;
        JVM INSTR monitorexit ;
        throw map;
    }
}
