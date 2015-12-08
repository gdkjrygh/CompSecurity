// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;

import com.c.a.C;
import java.util.LinkedHashSet;
import java.util.Set;

public final class h
{

    private final Set a = new LinkedHashSet();

    public h()
    {
    }

    public final void a(C c1)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(c1);
        this;
        JVM INSTR monitorexit ;
        return;
        c1;
        throw c1;
    }

    public final void b(C c1)
    {
        this;
        JVM INSTR monitorenter ;
        a.remove(c1);
        this;
        JVM INSTR monitorexit ;
        return;
        c1;
        throw c1;
    }

    public final boolean c(C c1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a.contains(c1);
        this;
        JVM INSTR monitorexit ;
        return flag;
        c1;
        throw c1;
    }
}
