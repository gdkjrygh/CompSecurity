// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.concurrent.ExecutionException;

public final class bvq
    implements Runnable
{

    final bvs a;
    final bvm b;

    public bvq(bvm bvm1, bvs bvs1)
    {
        b = bvm1;
        super();
        a = (bvs)b.a(bvs1, "params", null);
    }

    public final void run()
    {
        Object obj = bvm.a(b);
        obj;
        JVM INSTR monitorenter ;
        bvm.a(b, false);
        bvm.b(b, false);
        if (Thread.interrupted())
        {
            throw new InterruptedException();
        }
          goto _L1
        Object obj1;
        obj1;
        Log.e(bvm.b(), "render context not initialized", ((Throwable) (obj1)));
        bvm.c(b, false);
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
_L1:
        bvm.b(b).a(new bvr(this));
        bvm.c(b, true);
          goto _L2
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        Thread.currentThread().interrupt();
        bvm.c(b, false);
          goto _L2
        obj1;
        throw c.a("unexpected exception running write in context", ((Throwable) (obj1)));
        obj1;
        bvm.c(b, false);
        throw obj1;
    }
}
