// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import com.squareup.okhttp.x;
import java.util.LinkedHashSet;
import java.util.Set;

public final class j
{

    private final Set a = new LinkedHashSet();

    public j()
    {
    }

    public final void a(x x)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(x);
        this;
        JVM INSTR monitorexit ;
        return;
        x;
        throw x;
    }

    public final void b(x x)
    {
        this;
        JVM INSTR monitorenter ;
        a.remove(x);
        this;
        JVM INSTR monitorexit ;
        return;
        x;
        throw x;
    }

    public final boolean c(x x)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a.contains(x);
        this;
        JVM INSTR monitorexit ;
        return flag;
        x;
        throw x;
    }
}
