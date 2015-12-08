// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            fd, gf, eq, hs, 
//            i, gd

public class hu
{

    private static final String a = com/flurry/sdk/hu.getSimpleName();
    private static boolean b;

    public hu()
    {
    }

    public static void a()
    {
        com/flurry/sdk/hu;
        JVM INSTR monitorenter ;
        boolean flag = b;
        if (!flag) goto _L2; else goto _L1
_L1:
        com/flurry/sdk/hu;
        JVM INSTR monitorexit ;
        return;
_L2:
        gf.a(com/flurry/sdk/fd, 10);
        gf.a(com/flurry/sdk/eq, 10);
_L3:
        gf.a(com/flurry/sdk/hs, 10);
_L4:
        gf.a(com/flurry/sdk/i, 10);
_L5:
        b = true;
          goto _L1
        Object obj;
        obj;
        throw obj;
        obj;
        gd.a(3, a, "Analytics module not available");
          goto _L3
        obj;
        gd.a(3, a, "Crash module not available");
          goto _L4
        obj;
        gd.a(3, a, "Ads module not available");
          goto _L5
    }

}
