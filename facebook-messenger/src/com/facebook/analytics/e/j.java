// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.e;

import com.facebook.common.h.a;
import com.google.common.a.fi;
import java.util.Set;
import java.util.UUID;

class j
{

    final String a;
    final String b;
    private double c;
    private long d;
    private fi e;
    private boolean f;

    public j(String s)
    {
        this(s, com.facebook.common.h.a.a().toString(), 0L);
    }

    public j(String s, String s1, long l)
    {
        com.facebook.debug.b.a.a(s);
        com.facebook.debug.b.a.a(s1);
        a = s;
        b = s1;
        c = l;
    }

    public double a()
    {
        this;
        JVM INSTR monitorenter ;
        double d1 = c;
        this;
        JVM INSTR monitorexit ;
        return d1;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(double d1)
    {
        this;
        JVM INSTR monitorenter ;
        c = d1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        d = l;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(Set set)
    {
        this;
        JVM INSTR monitorenter ;
        if (set == null) goto _L2; else goto _L1
_L1:
        e = fi.a(set);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        e = null;
        if (true) goto _L4; else goto _L3
_L3:
        set;
        throw set;
    }

    public long b()
    {
        this;
        JVM INSTR monitorenter ;
        long l = d;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public void c()
    {
        f = true;
    }

    public boolean d()
    {
        return f;
    }
}
