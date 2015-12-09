// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.b;

import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.a.d.a.p;

// Referenced classes of package com.nuance.a.a.a.c.b:
//            a

final class j
    implements p
{

    private a a;

    j(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        if (com.nuance.a.a.a.c.b.a.c().e())
        {
            com.nuance.a.a.a.c.b.a.c().b("XMode.handleSendCopConnect() COP CONNECT timed out. ");
        }
        com.nuance.a.a.a.c.b.a.a(a, (byte)9);
_L1:
        return;
        Exception exception;
        exception;
        if (com.nuance.a.a.a.c.b.a.c().e())
        {
            com.nuance.a.a.a.c.b.a.c().b((new StringBuilder("XMode.handleSendCopConnect() ")).append(exception.getClass().getName()).append(" ").append(exception.getMessage()).toString());
            return;
        }
          goto _L1
    }
}
