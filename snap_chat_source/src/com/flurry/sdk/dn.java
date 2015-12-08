// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            dp, dq, el

public class dn
{

    private static final String a = com/flurry/sdk/dn.getSimpleName();
    private static dn b;

    public dn()
    {
    }

    public static dn a()
    {
        com/flurry/sdk/dn;
        JVM INSTR monitorenter ;
        dn dn1;
        if (b == null)
        {
            b = new dn();
        }
        dn1 = b;
        com/flurry/sdk/dn;
        JVM INSTR monitorexit ;
        return dn1;
        Exception exception;
        exception;
        throw exception;
    }

    public int b()
    {
        int i = ((Integer)dp.a().a("AgentVersion")).intValue();
        el.a(4, a, (new StringBuilder("getAgentVersion() = ")).append(i).toString());
        return i;
    }

}
