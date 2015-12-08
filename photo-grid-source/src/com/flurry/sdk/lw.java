// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            jb, ke, hi, lu, 
//            i, kc

public class lw
{

    private static final String a = com/flurry/sdk/lw.getSimpleName();
    private static boolean b;

    public lw()
    {
    }

    public static void a()
    {
        com/flurry/sdk/lw;
        JVM INSTR monitorenter ;
        boolean flag = b;
        if (!flag) goto _L2; else goto _L1
_L1:
        com/flurry/sdk/lw;
        JVM INSTR monitorexit ;
        return;
_L2:
        ke.a(com/flurry/sdk/jb, 10);
        ke.a(com/flurry/sdk/hi, 10);
_L3:
        ke.a(com/flurry/sdk/lu, 10);
_L4:
        ke.a(com/flurry/sdk/i, 10);
_L5:
        b = true;
          goto _L1
        Object obj;
        obj;
        throw obj;
        obj;
        kc.a(3, a, "Analytics module not available");
          goto _L3
        obj;
        kc.a(3, a, "Crash module not available");
          goto _L4
        obj;
        kc.a(3, a, "Ads module not available");
          goto _L5
    }

}
