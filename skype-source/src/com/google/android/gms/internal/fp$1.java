// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cf, fp, gx, fr, 
//            hi

final class a
    implements cf
{

    final fp a;

    public final void a(hi hi, Map map)
    {
label0:
        {
            synchronized (fp.a(a))
            {
                if (!com.google.android.gms.internal.fp.b(a).isDone())
                {
                    break label0;
                }
            }
            return;
        }
        if (fp.c(a).equals(map.get("request_id")))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        hi;
        JVM INSTR monitorexit ;
        return;
        map;
        hi;
        JVM INSTR monitorexit ;
        throw map;
        map = new fr(1, map);
        b.c((new StringBuilder("Invalid ")).append(map.e()).append(" request error: ").append(map.b()).toString());
        com.google.android.gms.internal.fp.b(a).b(map);
        hi;
        JVM INSTR monitorexit ;
    }

    til.client.b(fp fp1)
    {
        a = fp1;
        super();
    }
}
