// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class bad
{

    private final LinkedHashMap a = new LinkedHashMap(100, 0.75F, true);
    private int b;
    private int c;

    public bad(int i)
    {
        c = 0;
        b = i;
    }

    public int a(Object obj)
    {
        return 1;
    }

    public final void a()
    {
        b(0);
    }

    public void a(Object obj, Object obj1)
    {
    }

    public final int b()
    {
        this;
        JVM INSTR monitorenter ;
        int i = c;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public final Object b(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        obj = a.get(obj);
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        throw obj;
    }

    public final Object b(Object obj, Object obj1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a(obj1) < b) goto _L2; else goto _L1
_L1:
        a(obj, obj1);
        obj = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return obj;
_L2:
        obj = a.put(obj, obj1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        c = c + a(obj1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        c = c - a(obj);
        b(b);
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        throw obj;
    }

    public final void b(int i)
    {
        this;
        JVM INSTR monitorenter ;
        while (c > i) 
        {
            Object obj1 = (java.util.Map.Entry)a.entrySet().iterator().next();
            Object obj = ((java.util.Map.Entry) (obj1)).getValue();
            c = c - a(obj);
            obj1 = ((java.util.Map.Entry) (obj1)).getKey();
            a.remove(obj1);
            a(obj1, obj);
        }
        break MISSING_BLOCK_LABEL_82;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public final Object c(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        obj = a.remove(obj);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        c = c - a(obj);
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        throw obj;
    }
}
