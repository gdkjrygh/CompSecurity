// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.cache;

import com.facebook.common.time.a;
import com.facebook.e.a.e;
import com.google.common.a.fi;
import com.google.common.a.fk;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.facebook.cache:
//            q, l, t, a, 
//            k

public class j
{

    private static final Class a = com/facebook/cache/j;
    private static long b = 0x100000L;
    private final Map c = new WeakHashMap();
    private final e d;
    private final q e;
    private final k f;
    private final a g;
    private long h;

    public j(e e1, q q1, k k, a a1)
    {
        h = 0L;
        d = e1;
        g = a1;
        e = q1;
        e.a(this);
        f = k;
    }

    private fi a(l l1)
    {
        this;
        JVM INSTR monitorenter ;
        if (l1 != l.ALL) goto _L2; else goto _L1
_L1:
        l1 = b();
_L5:
        this;
        JVM INSTR monitorexit ;
        return l1;
_L2:
        fk fk1;
        Iterator iterator;
        fk1 = new fk();
        iterator = c.keySet().iterator();
_L4:
        t t1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_92;
            }
            t1 = (t)iterator.next();
        } while (t1 == null);
        if (t1.b() != l1) goto _L4; else goto _L3
_L3:
        fk1.b(t1);
          goto _L4
        l1;
        throw l1;
        l1 = fk1.b();
          goto _L5
    }

    private fi b()
    {
        this;
        JVM INSTR monitorenter ;
        fi fi1 = fi.a(c.keySet());
        this;
        JVM INSTR monitorexit ;
        return fi1;
        Exception exception;
        exception;
        throw exception;
    }

    fi a()
    {
        return a(l.MEMORY);
    }

    public void a(t t1)
    {
        this;
        JVM INSTR monitorenter ;
        Preconditions.checkNotNull(t1, "require non-null SyndicatedCache");
        c.put(t1, Boolean.TRUE);
        if (t1 instanceof com.facebook.cache.a)
        {
            ((com.facebook.cache.a)t1).a(e);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        t1;
        throw t1;
    }

    void a(t t1, double d1)
    {
        if (t1 != null)
        {
            t1.a(d1);
        }
    }

}
