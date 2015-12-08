// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.internal:
//            bc, l

public final class k
{

    private static Map a = new HashMap();

    public static void a(int i, l l)
    {
        com/facebook/internal/k;
        JVM INSTR monitorenter ;
        boolean flag;
        bc.a(l, "callback");
        flag = a.containsKey(Integer.valueOf(i));
        if (!flag) goto _L2; else goto _L1
_L1:
        com/facebook/internal/k;
        JVM INSTR monitorexit ;
        return;
_L2:
        a.put(Integer.valueOf(i), l);
        if (true) goto _L1; else goto _L3
_L3:
        l;
        throw l;
    }

}
