// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.b;

import com.nuance.a.a.a.a.d.a.p;

// Referenced classes of package com.nuance.a.a.a.c.b:
//            a

final class e
    implements p
{

    private a a;

    e(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        com.nuance.a.a.a.c.b.a.a(a);
        if (com.nuance.a.a.a.c.b.a.c().e())
        {
            com.nuance.a.a.a.c.b.a.c().b((new StringBuilder("Session Idle for too long, longer than [")).append(com.nuance.a.a.a.c.b.a.b(a)).append("] (initiated from XMode.parseBcp)").toString());
        }
        a.c = 2;
        com.nuance.a.a.a.c.b.a.a(a, (byte)4);
_L1:
        return;
        Exception exception;
        exception;
        if (com.nuance.a.a.a.c.b.a.c().e())
        {
            com.nuance.a.a.a.c.b.a.c().b((new StringBuilder("XMode.parseXModeMsg() ")).append(exception.getClass().getName()).append(" ").append(exception.getMessage()).toString());
            return;
        }
          goto _L1
    }
}
