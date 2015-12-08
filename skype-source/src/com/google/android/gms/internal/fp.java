// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import java.util.Map;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            gx, hi, cf, fr, 
//            gh

public final class fp
{

    hi a;
    cu.d b;
    public final cf c = new cf() {

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
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Invalid ")).append(map.e()).append(" request error: ").append(map.b()).toString());
            com.google.android.gms.internal.fp.b(a).b(map);
            hi;
            JVM INSTR monitorexit ;
        }

            
            {
                a = fp.this;
                super();
            }
    };
    public final cf d = new cf() {

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
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder()).append(fr1.g()).append(" ==== ").append(fp.c(a)).toString());
            obj;
            JVM INSTR monitorexit ;
            return;
            hi1;
            obj;
            JVM INSTR monitorexit ;
            throw hi1;
            String s2 = fr1.d();
            if (s2 != null)
            {
                break MISSING_BLOCK_LABEL_120;
            }
            com.google.android.gms.ads.internal.util.client.b.c("URL missing in loadAdUrl GMSG.");
            obj;
            JVM INSTR monitorexit ;
            return;
            if (s2.contains("%40mediation_adapters%40"))
            {
                fr1.a(s2.replaceAll("%40mediation_adapters%40", gh.a(hi1.getContext(), (String)map.get("check_adapters"), fp.d(a))));
                com.google.android.gms.ads.internal.util.client.b.a(2);
            }
            com.google.android.gms.internal.fp.b(a).b(fr1);
            obj;
            JVM INSTR monitorexit ;
        }

            
            {
                a = fp.this;
                super();
            }
    };
    private final Object e = new Object();
    private String f;
    private String g;
    private gx h;

    public fp(String s, String s1)
    {
        h = new gx();
        g = s1;
        f = s;
    }

    static Object a(fp fp1)
    {
        return fp1.e;
    }

    static gx b(fp fp1)
    {
        return fp1.h;
    }

    static String c(fp fp1)
    {
        return fp1.f;
    }

    static String d(fp fp1)
    {
        return fp1.g;
    }

    public final Future a()
    {
        return h;
    }
}
