// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            by, ft, gk, fv, 
//            gs, gv

class uu
    implements by
{

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

    (ft ft1)
    {
        uu = ft1;
        super();
    }
}
