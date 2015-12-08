// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.LinkedHashSet;
import java.util.Set;

public final class gso
{

    private final Set a = new LinkedHashSet();

    public gso()
    {
    }

    public final void a(grw grw)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(grw);
        this;
        JVM INSTR monitorexit ;
        return;
        grw;
        throw grw;
    }

    public final void b(grw grw)
    {
        this;
        JVM INSTR monitorenter ;
        a.remove(grw);
        this;
        JVM INSTR monitorexit ;
        return;
        grw;
        throw grw;
    }

    public final boolean c(grw grw)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a.contains(grw);
        this;
        JVM INSTR monitorexit ;
        return flag;
        grw;
        throw grw;
    }
}
