// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import com.facebook.common.time.a;

public class e
    implements a
{

    private long a;

    public e()
    {
    }

    public long a()
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        long l1;
        l = System.currentTimeMillis();
        l1 = a;
        if (l <= l1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        a = a + 1L;
        l = a;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        a = Math.max(l, a);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
