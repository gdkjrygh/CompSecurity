// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cf, fp, gx, fr, 
//            hi, gh

final class a
    implements cf
{

    final fp a;

    public final void a(hi hi1, Map map)
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
        fr fr1;
        fr1 = new fr(-2, map);
        if (fp.c(a).equals(fr1.g()))
        {
            break MISSING_BLOCK_LABEL_100;
        }
        b.c((new StringBuilder()).append(fr1.g()).append(" ==== ").append(fp.c(a)).toString());
        obj;
        JVM INSTR monitorexit ;
        return;
        hi1;
        obj;
        JVM INSTR monitorexit ;
        throw hi1;
        String s = fr1.d();
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        b.c("URL missing in loadAdUrl GMSG.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (s.contains("%40mediation_adapters%40"))
        {
            fr1.a(s.replaceAll("%40mediation_adapters%40", gh.a(hi1.getContext(), (String)map.get("check_adapters"), fp.d(a))));
            b.a(2);
        }
        com.google.android.gms.internal.fp.b(a).b(fr1);
        obj;
        JVM INSTR monitorexit ;
    }

    til.client.b(fp fp1)
    {
        a = fp1;
        super();
    }
}
