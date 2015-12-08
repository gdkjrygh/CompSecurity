// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ai, cb, cn, cq

class gW
    implements ai
{

    final cb gW;

    public void a(cq cq, Map map)
    {
        cq = ((cq) (cb.a(gW)));
        cq;
        JVM INSTR monitorenter ;
        map = (String)map.get("url");
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        cn.q("URL missing in loadAdUrl GMSG.");
        cq;
        JVM INSTR monitorexit ;
        return;
        cb.a(gW, map);
        cb.a(gW).notify();
        cq;
        JVM INSTR monitorexit ;
        return;
        map;
        cq;
        JVM INSTR monitorexit ;
        throw map;
    }

    (cb cb1)
    {
        gW = cb1;
        super();
    }
}
