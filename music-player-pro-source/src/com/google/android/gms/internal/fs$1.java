// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cd, fs, gj, fu, 
//            gr, gu

class uI
    implements cd
{

    final fs uI;

    public void a(gu gu, Map map)
    {
label0:
        {
            synchronized (fs.a(uI))
            {
                if (!fs.b(uI).isDone())
                {
                    break label0;
                }
            }
            return;
        }
        map = new fu(1, map);
        gr.W((new StringBuilder()).append("Invalid ").append(map.getType()).append(" request error: ").append(map.cT()).toString());
        fs.b(uI).a(map);
        gu;
        JVM INSTR monitorexit ;
        return;
        map;
        gu;
        JVM INSTR monitorexit ;
        throw map;
    }

    (fs fs1)
    {
        uI = fs1;
        super();
    }
}
