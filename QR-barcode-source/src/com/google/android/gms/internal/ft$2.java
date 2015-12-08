// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            by, ft, gk, fv, 
//            gs, gv, gf

class uu
    implements by
{

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
        String s;
        fv1 = new fv(-2, map);
        s = fv1.getUrl();
        if (s != null)
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
        if (s.contains("%40mediation_adapters%40"))
        {
            gv1 = s.replaceAll("%40mediation_adapters%40", gf.a(gv1.getContext(), (String)map.get("check_adapters"), ft.c(uu)));
            fv1.setUrl(gv1);
            gs.V((new StringBuilder()).append("Ad request URL modified to ").append(gv1).toString());
        }
        ft.b(uu).a(fv1);
        obj;
        JVM INSTR monitorexit ;
    }

    (ft ft1)
    {
        uu = ft1;
        super();
    }
}
