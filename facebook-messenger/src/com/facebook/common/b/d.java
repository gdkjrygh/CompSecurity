// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.b;

import com.google.common.a.fi;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class d
    implements Iterable
{

    private final Set a = new HashSet();
    private Set b;

    public d()
    {
        b = null;
    }

    public void a()
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

    public void a(Object obj)
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

    public Iterator iterator()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator1;
        if (b == null)
        {
            b = fi.a(a);
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
