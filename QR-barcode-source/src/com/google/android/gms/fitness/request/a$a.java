// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.fitness.request:
//            a, BleScanCallback

public static class canCallback
{

    private static final canCallback Ug = new <init>();
    private final Map Uh = new HashMap();

    public static canCallback je()
    {
        return Ug;
    }

    public a a(BleScanCallback blescancallback)
    {
        Map map = Uh;
        map;
        JVM INSTR monitorenter ;
        a a2 = (a)Uh.get(blescancallback);
        a a1;
        a1 = a2;
        if (a2 != null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        a1 = new a(blescancallback, null);
        Uh.put(blescancallback, a1);
        map;
        JVM INSTR monitorexit ;
        return a1;
        blescancallback;
        map;
        JVM INSTR monitorexit ;
        throw blescancallback;
    }

    public a b(BleScanCallback blescancallback)
    {
        Map map = Uh;
        map;
        JVM INSTR monitorenter ;
        a a1 = (a)Uh.get(blescancallback);
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        map;
        JVM INSTR monitorexit ;
        return a1;
        blescancallback = new a(blescancallback, null);
        map;
        JVM INSTR monitorexit ;
        return blescancallback;
        blescancallback;
        map;
        JVM INSTR monitorexit ;
        throw blescancallback;
    }


    private canCallback()
    {
    }
}
