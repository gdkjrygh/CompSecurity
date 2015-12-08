// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            fz, hb, ha, rd, 
//            bg, ry

final class hg
    implements fz
{

    final bg a;
    final rd b;
    final hb c;

    hg(hb hb1, bg bg1, rd rd1)
    {
        c = hb1;
        a = bg1;
        b = rd1;
        super();
    }

    public final void zza(ry ry, Map map)
    {
        synchronized (ha.c(c.b))
        {
            zzb.zzaG("JS Engine is requesting an update");
            if (ha.e(c.b) == 0)
            {
                zzb.zzaG("Starting reload.");
                ha.a(c.b, 2);
                c.b.a();
            }
            a.b("/requestReload", (fz)b.a());
        }
        return;
        map;
        ry;
        JVM INSTR monitorexit ;
        throw map;
    }
}
