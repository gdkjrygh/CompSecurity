// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.base:
//            Supplier, Suppliers, Preconditions, Platform

static class durationNanos
    implements Supplier, Serializable
{

    private static final long serialVersionUID = 0L;
    final Supplier _flddelegate;
    final long durationNanos;
    volatile transient long expirationNanos;
    volatile transient Object value;

    public Object get()
    {
        long l;
        long l1;
        l = expirationNanos;
        l1 = Platform.systemNanoTime();
        if (l != 0L && l1 - l < 0L) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (l != expirationNanos)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        obj = _flddelegate.get();
        value = obj;
        l = l1 + durationNanos;
        if (l == 0L)
        {
            l = 1L;
        }
        expirationNanos = l;
        this;
        JVM INSTR monitorexit ;
        return obj;
        this;
        JVM INSTR monitorexit ;
_L2:
        return value;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (Supplier supplier, long l, TimeUnit timeunit)
    {
        _flddelegate = (Supplier)Preconditions.checkNotNull(supplier);
        durationNanos = timeunit.toNanos(l);
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
    }
}
