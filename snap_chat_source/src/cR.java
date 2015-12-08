// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class cR
    implements Iterable
{

    private final Set a = new HashSet();
    private Set b;

    public cR()
    {
        b = null;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        a.clear();
        b = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(obj);
        b = null;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public final Iterator iterator()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator1;
        if (b == null)
        {
            b = Collections.unmodifiableSet(a);
        }
        iterator1 = b.iterator();
        this;
        JVM INSTR monitorexit ;
        return iterator1;
        Exception exception;
        exception;
        throw exception;
    }
}
