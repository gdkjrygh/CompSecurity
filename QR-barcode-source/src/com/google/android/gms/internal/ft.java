// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            gk, gv, by, fv, 
//            gs, gf

public final class ft
{

    private gv md;
    private final Object mw = new Object();
    private String uq;
    private gk ur;
    public final by us = new by() {

        final ft uu;

        public void a(gv gv, Map map)
        {
label0:
            {
                synchronized (ft.a(uu))
                {
                    if (!ft.b(uu).isDone())
                    {
                        break label0;
                    }
                }
                return;
            }
            map = new fv(1, map);
            gs.W((new StringBuilder()).append("Invalid ").append(map.getType()).append(" request error: ").append(map.cL()).toString());
            ft.b(uu).a(map);
            gv;
            JVM INSTR monitorexit ;
            return;
            map;
            gv;
            JVM INSTR monitorexit ;
            throw map;
        }

            
            {
                uu = ft.this;
                super();
            }
    };
    public final by ut = new by() {

        final ft uu;

        public void a(gv gv1, Map map)
        {
label0:
            {
                synchronized (ft.a(uu))
                {
                    if (!ft.b(uu).isDone())
                    {
                        break label0;
                    }
                }
                return;
            }
            fv fv1;
            String s1;
            fv1 = new fv(-2, map);
            s1 = fv1.getUrl();
            if (s1 != null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            gs.W("URL missing in loadAdUrl GMSG.");
            obj;
            JVM INSTR monitorexit ;
            return;
            gv1;
            obj;
            JVM INSTR monitorexit ;
            throw gv1;
            if (s1.contains("%40mediation_adapters%40"))
            {
                gv1 = s1.replaceAll("%40mediation_adapters%40", gf.a(gv1.getContext(), (String)map.get("check_adapters"), ft.c(uu)));
                fv1.setUrl(gv1);
                gs.V((new StringBuilder()).append("Ad request URL modified to ").append(gv1).toString());
            }
            ft.b(uu).a(fv1);
            obj;
            JVM INSTR monitorexit ;
        }

            
            {
                uu = ft.this;
                super();
            }
    };

    public ft(String s)
    {
        ur = new gk();
        uq = s;
    }

    static Object a(ft ft1)
    {
        return ft1.mw;
    }

    static gk b(ft ft1)
    {
        return ft1.ur;
    }

    static String c(ft ft1)
    {
        return ft1.uq;
    }

    public void b(gv gv)
    {
        md = gv;
    }

    public Future cK()
    {
        return ur;
    }
}
