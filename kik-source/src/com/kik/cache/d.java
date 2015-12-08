// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import com.kik.g.p;
import com.kik.sdkutils.b.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.kik.cache:
//            e, h

public abstract class d
{

    private final d a;
    private final a b;
    private final HashMap c = new HashMap();

    public d(d d1, a a1)
    {
        a = d1;
        b = a1;
    }

    static HashMap a(d d1)
    {
        return d1.c;
    }

    protected abstract p a(Object obj);

    public final p a(Object obj, Long long1, boolean flag)
    {
        HashMap hashmap = c;
        hashmap;
        JVM INSTR monitorenter ;
        p p1 = new p();
        if (obj != null) goto _L2; else goto _L1
_L1:
        p1.a(new Exception("Null Token"));
_L3:
        hashmap;
        JVM INSTR monitorexit ;
        return p1;
_L2:
        if (!c.containsKey(obj))
        {
            break MISSING_BLOCK_LABEL_76;
        }
        obj = (p)c.get(obj);
        hashmap;
        JVM INSTR monitorexit ;
        return ((p) (obj));
        obj;
        hashmap;
        JVM INSTR monitorexit ;
        throw obj;
        d d1 = a;
        p p2 = a(obj);
        c.put(obj, p2);
        p2.a(new e(this, p1, long1, flag, d1, obj));
          goto _L3
    }

    public abstract Object a(Object obj, h h);

    protected abstract Set a();

    public final void b()
    {
        d d1 = a;
        if (d1 != null)
        {
            d1.b();
        }
        for (Iterator iterator = (new HashSet(a())).iterator(); iterator.hasNext(); b(iterator.next())) { }
    }

    protected abstract void b(Object obj);

    public final p c(Object obj)
    {
        return a(obj, b.a(), false);
    }

    public final a c()
    {
        return b;
    }
}
