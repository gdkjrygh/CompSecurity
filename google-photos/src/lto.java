// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class lto
    implements luh
{

    private final Map a = new HashMap();
    private final int b;
    private final luj c;
    private int d;

    lto(int i, luj luj1)
    {
        b = i;
        c = luj1;
    }

    public final Object a(Object obj)
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

    public final void a(Object obj, Object obj1)
    {
        this;
        JVM INSTR monitorenter ;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new NullPointerException("key == null || value == null");
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        d = d + c.a(obj, obj1);
        if (d > b)
        {
            Iterator iterator = a.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                d = d - c.a(entry.getKey(), entry.getValue());
                iterator.remove();
            } while (d > b);
        }
        a.put(obj, obj1);
        this;
        JVM INSTR monitorexit ;
    }
}
