// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import com.pandora.radio.data.s;
import com.pandora.radio.provider.b;
import java.io.IOException;
import p.cx.q;
import p.df.a;

// Referenced classes of package com.pandora.radio.util:
//            h, q

private class b
    implements Runnable
{

    final h a;
    private s b;
    private int c;

    public void run()
    {
        Object obj2;
        obj2 = null;
        if (c <= 0)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        p.df.a.c("PingDBQueue", "PingRunnable retry sleep");
        Thread.sleep(5000L);
        Object obj = com.pandora.radio.util.h.a(a);
        obj;
        JVM INSTR monitorenter ;
_L1:
        boolean flag = com.pandora.radio.util.h.b(a);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        p.df.a.c("PingDBQueue", "PingRunnable wait for network");
        com.pandora.radio.util.h.a(a).wait();
          goto _L1
        Object obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        return;
        obj;
        JVM INSTR monitorexit ;
        if (b.b())
        {
            h.c(a).b(b);
            return;
        }
        break MISSING_BLOCK_LABEL_103;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj = com.pandora.radio.util.h.a(a, b);
        h.c(a).b(b);
        com.pandora.radio.data.b b1 = b.d();
        if (b1 != null)
        {
            b1.a(((String) (obj)), null);
            return;
        }
        break MISSING_BLOCK_LABEL_339;
        b1;
        obj = null;
_L10:
        obj2 = b1.a();
        if (!(obj2 instanceof IOException)) goto _L3; else goto _L2
_L2:
        c = c + 1;
        if (c >= 5) goto _L5; else goto _L4
_L4:
        h.d(a).a(this);
        p.df.a.c("PingDBQueue", "Retrying ping because of an IO exception", ((Throwable) (obj2)));
_L6:
        obj2 = b.d();
        if (obj2 != null)
        {
            ((com.pandora.radio.data.b) (obj2)).a(((String) (obj)), b1);
            return;
        }
        break MISSING_BLOCK_LABEL_339;
_L5:
        p.df.a.c("PingDBQueue", "Skip retry ping because we're out of retries", ((Throwable) (obj2)));
          goto _L6
        Exception exception;
        exception;
        obj2 = b1;
        b1 = exception;
_L7:
        com.pandora.radio.data.ion ion = b.d();
        if (ion != null)
        {
            ion.a(((String) (obj)), ((Exception) (obj2)));
        }
        throw b1;
_L3:
        p.df.a.c("PingDBQueue", "Skipping ping because of an exception", ((Throwable) (obj2)));
          goto _L6
        b1;
        obj = null;
_L8:
        p.df.a.c("PingDBQueue", "Skipping ping because of an exception", b1);
        obj2 = b.d();
        if (obj2 != null)
        {
            ((com.pandora.radio.data.b) (obj2)).a(((String) (obj)), b1);
            return;
        }
        break MISSING_BLOCK_LABEL_339;
        b1;
        obj = null;
          goto _L7
        b1;
          goto _L7
        ion;
        obj2 = b1;
        b1 = ion;
          goto _L7
        b1;
          goto _L8
        b1;
        if (true) goto _L10; else goto _L9
_L9:
        InterruptedException interruptedexception;
        interruptedexception;
    }

    public ion(h h1, s s1)
    {
        a = h1;
        super();
        c = 0;
        b = s1;
    }
}
