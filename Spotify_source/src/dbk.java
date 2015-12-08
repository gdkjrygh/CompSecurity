// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public final class dbk
    implements Callable
{

    public final dbl a;
    private dbj b;

    public dbk(dbj dbj1, dbl dbl1)
    {
        b = dbj1;
        super();
        a = dbl1;
    }

    public final Object call()
    {
        a.a(b.b);
        obj1 = a.b(b.b);
        synchronized (b.a)
        {
            b.a.remove(Integer.valueOf(hashCode()));
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        if (!(null instanceof Exception))
        {
            break MISSING_BLOCK_LABEL_325;
        }
        obj1 = a.b(b.b, (Exception)null);
        obj = obj1;
        if (obj1 == null)
        {
            throw (Exception)null;
        }
          goto _L1
_L6:
        a.b(b.b, null);
_L8:
        throw obj1;
_L3:
        obj = a.b(b.b, null);
_L1:
        return obj;
        Throwable throwable;
        throwable;
        synchronized (b.a)
        {
            b.a.remove(Integer.valueOf(hashCode()));
        }
        if (throwable == null) goto _L3; else goto _L2
_L2:
        if (!(throwable instanceof Exception))
        {
            break MISSING_BLOCK_LABEL_213;
        }
        obj1 = a.b(b.b, (Exception)throwable);
        obj = obj1;
        if (obj1 != null) goto _L1; else goto _L4
_L4:
        throw (Exception)throwable;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        throw new ExecutionException(throwable);
        obj1;
        synchronized (b.a)
        {
            b.a.remove(Integer.valueOf(hashCode()));
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (!(null instanceof Exception))
        {
            break MISSING_BLOCK_LABEL_295;
        }
        if (a.b(b.b, (Exception)null) != null) goto _L8; else goto _L7
_L7:
        throw (Exception)null;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        throw new ExecutionException(null);
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        return a.b(b.b, obj1);
        throw new ExecutionException(null);
    }
}
