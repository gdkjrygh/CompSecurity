// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.g;

import com.roidapp.cloudlib.sns.b.a.a;
import com.roidapp.cloudlib.sns.b.c;
import com.roidapp.cloudlib.sns.b.g;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.b.o;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.roidapp.cloudlib.sns.g:
//            f, a, d, e, 
//            c

public class b
{

    private static b c;
    private final Map a = new ConcurrentHashMap();
    private final Map b = new HashMap();

    private b()
    {
    }

    private static com.roidapp.cloudlib.sns.g.a a(f f1, int i)
    {
        com.roidapp.cloudlib.sns.g.a a2 = (com.roidapp.cloudlib.sns.g.a)f1.i.get(Integer.valueOf(i));
        com.roidapp.cloudlib.sns.g.a a1 = a2;
        if (a2 == null)
        {
            a1 = new com.roidapp.cloudlib.sns.g.a();
            f1.i.put(Integer.valueOf(i), a1);
        }
        return a1;
    }

    public static b a()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        com/roidapp/cloudlib/sns/g/b;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = new b();
        }
        com/roidapp/cloudlib/sns/g/b;
        JVM INSTR monitorexit ;
_L2:
        return c;
        Exception exception;
        exception;
        com/roidapp/cloudlib/sns/g/b;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private f a(long l)
    {
        f f2 = (f)a.get(Long.valueOf(l));
        f f1 = f2;
        if (f2 == null)
        {
            f1 = new f();
            a.put(Long.valueOf(l), f1);
        }
        return f1;
    }

    public static f a(x x1)
    {
        if (x1 != null)
        {
            return (f)c.a.get(Long.valueOf(x1.a));
        } else
        {
            return null;
        }
    }

    public static void a(n n1)
    {
        f f1;
        while (n1 == null || n1.b == null || n1.a == null || (f1 = a(n1.b)) == null) 
        {
            return;
        }
        f1;
        JVM INSTR monitorenter ;
        f1.a = n1.b.q;
        f1.g = n1.b.i;
        f1.f = n1.b.j;
        f1.h = n1.b.k;
        f1.b = n1.b.b;
        if (n1 == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        com.roidapp.cloudlib.sns.g.a a1;
        if (n1.a == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        a1 = f.b(f1, n1.a.a);
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        a1.e = n1.c;
        a1.d = n1.a.i;
        a1.c = n1.a.h;
        a1.b = n1.f;
        a1.a = false;
        f1;
        JVM INSTR monitorexit ;
        return;
        n1;
        f1;
        JVM INSTR monitorexit ;
        throw n1;
    }

    private void a(n n1, g g1, boolean flag)
    {
        f f1;
        if (n1 == null || n1.a == null)
        {
            return;
        }
        f1 = a(n1.a.b);
        com.roidapp.cloudlib.sns.g.a a1 = a(f1, n1.a.a);
        f1;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        o o1;
        int i;
        int j;
        o1 = n1.a;
        i = a1.c;
        j = n1.a.h;
        if (g1 == g.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = com.roidapp.cloudlib.sns.g.d.a(i, j, flag);
        a1.c = i;
        o1.h = i;
        a1.b = g1;
        n1.f = g1;
        f1;
        JVM INSTR monitorexit ;
        a(new e[] {
            e.b
        });
        return;
        n1;
        f1;
        JVM INSTR monitorexit ;
        throw n1;
    }

    private void a(x x1, p p1, c c1, boolean flag)
    {
        f f1;
        if (x1 == null || p1 == null || p1.b == null)
        {
            return;
        }
        f1 = a(x1.a);
        f f2 = a(p1.b.a);
        f1;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        int i;
        int j;
        i = f1.f;
        j = x1.j;
        x x2;
        if (c1 == c.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = com.roidapp.cloudlib.sns.g.d.a(i, j, flag);
        f1.f = i;
        x1.j = i;
        x2 = p1.b;
        i = f2.h;
        j = p1.b.k;
        if (c1 == c.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = com.roidapp.cloudlib.sns.g.d.a(i, j, flag);
        f2.h = i;
        x2.k = i;
        x1.q = c1;
        f1.a = c1;
        f1;
        JVM INSTR monitorexit ;
        p1 = com.roidapp.cloudlib.sns.g.e.a;
        c1 = e.d;
        long l = x1.a;
        long l1 = x1.a;
        a(new e[] {
            p1, c1
        }, new Object[] {
            Long.valueOf(l), Long.valueOf(l1)
        });
        return;
        x1;
        f1;
        JVM INSTR monitorexit ;
        throw x1;
    }

    private void a(e ae[])
    {
        this;
        JVM INSTR monitorenter ;
        a(ae, ((Object []) (null)));
        this;
        JVM INSTR monitorexit ;
        return;
        ae;
        throw ae;
    }

    private void a(e ae[], Object aobj[])
    {
        this;
        JVM INSTR monitorenter ;
        if (ae != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int i = 0;
_L5:
        List list;
        if (i >= ae.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        list = (List)b.get(ae[i]);
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        Iterator iterator = list.iterator();
_L3:
        com.roidapp.cloudlib.sns.g.c c1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        c1 = (com.roidapp.cloudlib.sns.g.c)iterator.next();
        e e1 = ae[i];
        Object obj;
        if (aobj != null)
        {
            obj = aobj[i];
        } else
        {
            obj = null;
        }
        c1.a(e1, obj);
          goto _L3
        ae;
        throw ae;
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L1; else goto _L6
_L6:
    }

    public static void b(x x1)
    {
        f f1;
        while (x1 == null || (f1 = a(x1)) == null) 
        {
            return;
        }
        f1;
        JVM INSTR monitorenter ;
        f1.a = x1.q;
        f1.g = x1.i;
        f1.f = x1.j;
        f1.h = x1.k;
        f1.b = x1.b;
        f1;
        JVM INSTR monitorexit ;
        return;
        x1;
        f1;
        JVM INSTR monitorexit ;
        throw x1;
    }

    public final void a(n n1, com.roidapp.cloudlib.sns.b.a a1)
    {
        f f1;
        com.roidapp.cloudlib.sns.g.a a2;
        if (n1 == null || n1.b == null || n1.a == null)
        {
            return;
        }
        f1 = a(n1.a.b);
        a2 = a(f1, n1.a.a);
        if (n1.c == null)
        {
            n1.c = new a();
        }
        n1.c.add(0, a1);
        f1;
        JVM INSTR monitorenter ;
        a2.e = n1.c;
        a2.d = com.roidapp.cloudlib.sns.g.d.a(a2.d, n1.a.i, true);
        f1;
        JVM INSTR monitorexit ;
        a(new e[] {
            e.b
        });
        return;
        n1;
        f1;
        JVM INSTR monitorexit ;
        throw n1;
    }

    public final void a(n n1, g g1)
    {
        a(n1, g1, false);
    }

    public final void a(p p1, String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        synchronized (a(p1.b.a))
        {
            p1.b = s;
            p1.c = s1;
        }
        a(new e[] {
            e.d
        });
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        p1;
        JVM INSTR monitorexit ;
        throw s;
        p1;
        this;
        JVM INSTR monitorexit ;
        throw p1;
    }

    public final void a(x x1, p p1)
    {
        a(x1, p1, c.b, true);
    }

    public final void a(x x1, p p1, c c1)
    {
        a(x1, p1, c1, false);
    }

    public final void a(e e1, com.roidapp.cloudlib.sns.g.c c1)
    {
        this;
        JVM INSTR monitorenter ;
        if (e1 != null && c1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        List list = (List)b.get(e1);
        Object obj;
        obj = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        obj = new ArrayList();
        b.put(e1, obj);
        if (!((List) (obj)).contains(c1))
        {
            ((List) (obj)).add(c1);
        }
        if (true) goto _L1; else goto _L3
_L3:
        e1;
        throw e1;
    }

    public final void b()
    {
        a.clear();
        b.clear();
        c = null;
    }

    public final void b(n n1)
    {
        a(n1, g.b, true);
    }

    public final void b(n n1, com.roidapp.cloudlib.sns.b.a a1)
    {
        f f1;
        com.roidapp.cloudlib.sns.g.a a2;
        while (n1 == null || n1.b == null || n1.c == null || !n1.c.contains(a1)) 
        {
            return;
        }
        f1 = a(n1.b.a);
        a2 = a(f1, n1.a.a);
        n1.c.remove(a1);
        f1;
        JVM INSTR monitorenter ;
        a2.e = n1.c;
        a2.d = com.roidapp.cloudlib.sns.g.d.a(a2.d, n1.a.i, false);
        f1;
        JVM INSTR monitorexit ;
        a(new e[] {
            e.b
        });
        return;
        n1;
        f1;
        JVM INSTR monitorexit ;
        throw n1;
    }

    public final void b(p p1, String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        synchronized (a(p1.b.a))
        {
            p1.d = s;
            p1.e = s1;
        }
        a(new e[] {
            e.d
        });
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        p1;
        JVM INSTR monitorexit ;
        throw s;
        p1;
        this;
        JVM INSTR monitorexit ;
        throw p1;
    }

    public final void b(x x1, p p1)
    {
        a(x1, p1, c.a, false);
    }

    public final void b(e e1, com.roidapp.cloudlib.sns.g.c c1)
    {
        this;
        JVM INSTR monitorenter ;
        if (e1 != null && c1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        e1 = (List)b.get(e1);
        if (e1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        e1.remove(c1);
        if (true) goto _L1; else goto _L3
_L3:
        e1;
        throw e1;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        a(new e[] {
            e.e
        });
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c(n n1)
    {
        a(n1, g.a, false);
    }

    public final void c(x x1, p p1)
    {
        a(x1, p1, c.c, true);
    }

    public final void d(n n1)
    {
        a(n1, g.c, true);
    }

    public final void e(n n1)
    {
        Object obj;
        if (n1 == null || n1.b == null || n1.a == null)
        {
            return;
        }
        obj = a(n1.b.a);
        com.roidapp.cloudlib.sns.g.a a1 = a(((f) (obj)), n1.a.a);
        obj;
        JVM INSTR monitorenter ;
        a1.a = true;
        obj.g = com.roidapp.cloudlib.sns.g.d.a(((f) (obj)).g, n1.b.i, false);
        obj;
        JVM INSTR monitorexit ;
        obj = com.roidapp.cloudlib.sns.g.e.c;
        int i = n1.a.a;
        a(new e[] {
            obj
        }, new Object[] {
            Integer.valueOf(i)
        });
        return;
        n1;
        obj;
        JVM INSTR monitorexit ;
        throw n1;
    }
}
