// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.n;

import com.facebook.common.b.d;
import com.facebook.common.time.a;
import com.google.common.a.kl;
import com.google.common.base.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.facebook.n:
//            k, c, l

public class j
{

    private final Map a = new HashMap();
    private final Set b = kl.a(new ConcurrentHashMap());
    private final com.facebook.ui.b.d c;
    private final k d;
    private final a e;
    private long f;
    private d g;
    private boolean h;

    public j(a a1, com.facebook.ui.b.d d1, k k1)
    {
        f = -1L;
        g = new d();
        h = true;
        e = (a)Preconditions.checkNotNull(a1);
        c = (com.facebook.ui.b.d)Preconditions.checkNotNull(d1);
        d = (k)Preconditions.checkNotNull(k1);
        d.a(this);
    }

    void a(long l1, long l2)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            c c1 = (c)iterator.next();
            if (c1.f())
            {
                c1.a((double)l1 / 1000D, (double)l2 / 1000D);
            } else
            {
                b.remove(c1);
            }
        }

    }

    void a(c c1)
    {
        Preconditions.checkNotNull(c1);
        boolean flag;
        if (!a.containsKey(c1.b()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        a.put(c1.b(), c1);
    }

    void a(String s)
    {
        c c1;
        c1 = (c)a.get(s);
        Preconditions.checkNotNull(c1, (new StringBuilder()).append("Tried to activate Spring with id ").append(s).append(" not registered to SpringSystem.").toString());
        this;
        JVM INSTR monitorenter ;
        b.add(c1);
        if (a())
        {
            h = false;
            c.a(d);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public boolean a()
    {
        return h;
    }

    public c b()
    {
        c c1 = new c(this);
        a(c1);
        return c1;
    }

    public void b(c c1)
    {
        Preconditions.checkNotNull(c1);
        b.remove(c1);
        a.remove(c1.b());
    }

    void c()
    {
        long l1 = e.a();
        if (f == -1L)
        {
            f = l1 - 1L;
        }
        long l2 = f;
        f = l1;
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((l)iterator.next()).a(this)) { }
        a(l1, l1 - l2);
        this;
        JVM INSTR monitorenter ;
        if (b.size() == 0)
        {
            h = true;
            f = -1L;
        }
        this;
        JVM INSTR monitorexit ;
        for (Iterator iterator1 = g.iterator(); iterator1.hasNext(); ((l)iterator1.next()).b(this)) { }
        break MISSING_BLOCK_LABEL_151;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        c.b(d);
        if (!h)
        {
            c.a(d);
        }
        return;
    }
}
