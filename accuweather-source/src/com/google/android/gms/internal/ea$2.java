// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bd, ea, ec, ev, 
//            ey, em

class qC
    implements bd
{

    final ea qC;

    public void b(ey ey1, Map map)
    {
        Object obj = ea.a(qC);
        obj;
        JVM INSTR monitorenter ;
        ec ec1;
        String s;
        ec1 = new ec(map);
        s = ec1.getUrl();
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        ev.D("URL missing in loadAdUrl GMSG.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (s.contains("%40mediation_adapters%40"))
        {
            ey1 = s.replaceAll("%40mediation_adapters%40", em.a(ey1.getContext(), (String)map.get("check_adapters"), ea.b(qC)));
            ev.C((new StringBuilder()).append("Ad request URL modified to ").append(ey1).toString());
        }
        ea.a(qC, ec1);
        ea.a(qC).notify();
        obj;
        JVM INSTR monitorexit ;
        return;
        ey1;
        obj;
        JVM INSTR monitorexit ;
        throw ey1;
    }

    (ea ea1)
    {
        qC = ea1;
        super();
    }
}
