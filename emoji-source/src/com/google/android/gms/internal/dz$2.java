// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bc, dz, eb, eu, 
//            ex, el

class qF
    implements bc
{

    final dz qF;

    public void b(ex ex1, Map map)
    {
        Object obj = dz.a(qF);
        obj;
        JVM INSTR monitorenter ;
        eb eb1;
        String s;
        eb1 = new eb(map);
        s = eb1.getUrl();
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        eu.D("URL missing in loadAdUrl GMSG.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (s.contains("%40mediation_adapters%40"))
        {
            ex1 = s.replaceAll("%40mediation_adapters%40", el.a(ex1.getContext(), (String)map.get("check_adapters"), dz.b(qF)));
            eu.C((new StringBuilder()).append("Ad request URL modified to ").append(ex1).toString());
        }
        dz.a(qF, eb1);
        dz.a(qF).notify();
        obj;
        JVM INSTR monitorexit ;
        return;
        ex1;
        obj;
        JVM INSTR monitorexit ;
        throw ex1;
    }

    (dz dz1)
    {
        qF = dz1;
        super();
    }
}
