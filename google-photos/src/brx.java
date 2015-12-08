// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.util.Map;

final class brx
    implements Runnable
{

    private brv a;

    brx(brv brv1)
    {
        a = brv1;
        super();
    }

    public final void run()
    {
        Object obj = brv.a(a);
        obj;
        JVM INSTR monitorenter ;
        okq okq1;
        brv.b(a);
        okq1 = brv.c(a);
        Object obj1 = okq1.d;
        obj1;
        JVM INSTR monitorenter ;
        String as[];
        p.b(okq1.e, "ChunkStore not initialized");
        as = okq1.a.list();
        if (as == null) goto _L2; else goto _L1
_L1:
        int j = as.length;
        int i = 0;
_L3:
        String s;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = as[i];
        (new File(okq1.a, s)).delete();
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        okq1.c.clear();
        obj1;
        JVM INSTR monitorexit ;
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception1;
        exception1;
        obj1;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
