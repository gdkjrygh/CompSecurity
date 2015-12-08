// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bf;

import android.util.Pair;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ax.b;
import com.google.android.m4b.maps.ax.f;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bq.j;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.bf:
//            b

public final class com.google.android.m4b.maps.bf.a
{
    final class a
    {

        boolean a;
        int b;
        ac c;
        LinkedHashSet d;
        LinkedHashSet e;
        Iterator f;
        com.google.android.m4b.maps.bf.a g;

        public a(boolean flag)
        {
            g = com.google.android.m4b.maps.bf.a.this;
            super();
            b = 0;
            d = new LinkedHashSet();
            e = new LinkedHashSet();
            a = flag;
        }
    }


    int a;
    final LinkedHashSet b = new LinkedHashSet();
    f c;
    g d;
    private boolean e;
    private int f;
    private final LinkedHashSet g = new LinkedHashSet();
    private Iterator h;
    private final a i;
    private final LinkedList j = new LinkedList();
    private long k;
    private long l;
    private byte m;
    private boolean n;
    private Map o;
    private Set p;
    private com.google.android.m4b.maps.bf.b q;

    public com.google.android.m4b.maps.bf.a(int i1, int j1, boolean flag, boolean flag1)
    {
        k = 0L;
        m = 4;
        o = ax.b();
        p = new HashSet();
        a = i1;
        i = new a(flag1);
        e = flag;
        f = j1;
    }

    private com.google.android.m4b.maps.bf.b b(com.google.android.m4b.maps.bf.b b1, boolean flag)
    {
        boolean flag2 = true;
        Object obj1 = null;
        this;
        JVM INSTR monitorenter ;
        boolean flag3 = a(b1);
        if (flag3) goto _L2; else goto _L1
_L1:
        Object obj = obj1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((com.google.android.m4b.maps.bf.b) (obj));
_L2:
        long l1;
        l1 = b1.c;
        if (m != 0)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        obj = obj1;
        if (l1 != q.c)
        {
            continue; /* Loop/switch isn't completed */
        }
        m = 1;
        e();
        flag = false;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        if (b1 != q)
        {
            b.remove(b1.a);
            p.add(b1.a);
        }
        if (m != 1)
        {
            break MISSING_BLOCK_LABEL_278;
        }
        obj = obj1;
        if (l1 != k)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (p.size() + b.size() < f && h.hasNext())
        {
            obj = new com.google.android.m4b.maps.bf.b((ac)h.next(), d(), Boolean.TRUE.booleanValue());
            continue; /* Loop/switch isn't completed */
        }
        if (!n)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        m = 4;
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        b1;
        throw b1;
        m = 2;
        obj = i;
        obj.b = 0;
        ((a) (obj)).d.clear();
        ((a) (obj)).e.clear();
        obj.c = null;
        ((a) (obj)).d.addAll(((a) (obj)).g.b);
        obj.f = ((a) (obj)).d.iterator();
        boolean flag1;
        if (p.size() < f)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_313;
        }
        m = 4;
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        if (m != 2)
        {
            break MISSING_BLOCK_LABEL_577;
        }
        if (b.isEmpty())
        {
            break MISSING_BLOCK_LABEL_566;
        }
        obj = obj1;
        if (b1.c != k)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = obj1;
        if (!flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        b1 = i;
        if (((a) (b1)).c == null || ((a) (b1)).b >= ((a) (b1)).g.a)
        {
            break MISSING_BLOCK_LABEL_489;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_421;
        }
        obj = ((a) (b1)).g.c.a(((a) (b1)).c, ((a) (b1)).g.d);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_421;
        }
        ((a) (b1)).e.add(obj);
        if (!((a) (b1)).f.hasNext() && !((a) (b1)).e.isEmpty())
        {
            b1.b = ((a) (b1)).b + 1;
            obj = ((a) (b1)).d;
            b1.d = ((a) (b1)).e;
            b1.e = ((LinkedHashSet) (obj));
            ((a) (b1)).e.clear();
            b1.f = ((a) (b1)).d.iterator();
        }
        obj = obj1;
        if (!((a) (b1)).f.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        b1.c = (ac)((a) (b1)).f.next();
        obj = ((a) (b1)).c;
        l1 = ((a) (b1)).g.d();
        if (!((a) (b1)).a && ((a) (b1)).b != 0)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        obj = new com.google.android.m4b.maps.bf.b(((ac) (obj)), l1, flag);
        continue; /* Loop/switch isn't completed */
        l1 = k;
        m = 3;
        obj = obj1;
        if (m != 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = obj1;
        if (l1 != k)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (j.isEmpty() || !flag1)
        {
            break MISSING_BLOCK_LABEL_660;
        }
        b1 = (Pair)j.remove(0);
        obj = new com.google.android.m4b.maps.bf.b((ac)((Pair) (b1)).first, d(), ((Boolean)((Pair) (b1)).second).booleanValue());
        continue; /* Loop/switch isn't completed */
        m = 4;
        obj = obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private long d()
    {
        long l1 = k + 1L;
        k = l1;
        return l1;
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        o.clear();
        g.clear();
        p.clear();
        if (!e) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new LinkedHashSet();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((LinkedHashSet) (obj)).add(((ac)iterator.next()).a())) { }
          goto _L3
        obj;
        throw obj;
_L3:
        com.google.android.m4b.maps.ax.b.a(c, a, ((java.util.Collection) (obj)), d, 8, g);
        if (!n) goto _L5; else goto _L4
_L4:
        g.addAll(c.b(d));
_L2:
        h = g.iterator();
        this;
        JVM INSTR monitorexit ;
        return;
_L5:
        obj = com.google.android.m4b.maps.aa.f.a(g);
        Collections.reverse(((List) (obj)));
        ac ac1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); j.add(0, Pair.create(ac1, Boolean.FALSE)))
        {
            ac1 = (ac)((Iterator) (obj)).next();
        }

        obj = g.iterator();
        int i1 = -1;
_L6:
        ac ac2;
        if (!((Iterator) (obj)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        ac2 = (ac)((Iterator) (obj)).next();
        if (i1 != -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = ac2.a;
          goto _L6
        if (i1 == ac2.a) goto _L6; else goto _L7
_L7:
        ((Iterator) (obj)).remove();
        if (true) goto _L6; else goto _L8
_L8:
        if (true) goto _L2; else goto _L9
_L9:
    }

    public final com.google.android.m4b.maps.bf.b a(com.google.android.m4b.maps.bf.b b1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
_L2:
        com.google.android.m4b.maps.bf.b b2 = b(b1, flag);
        boolean flag1;
        if (b2 == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        flag1 = false;
        com.google.android.m4b.maps.bf.b b3 = (com.google.android.m4b.maps.bf.b)o.get(b2.a);
        if (b3 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        b1 = b2;
        flag = flag1;
        if (!b3.b) goto _L2; else goto _L1
_L1:
        b1 = b2;
        flag = flag1;
        if (b2.b) goto _L2; else goto _L3
_L3:
        o.put(b2.a, b2);
        if (!b2.b)
        {
            p.add(b2.a);
        }
        this;
        JVM INSTR monitorexit ;
        return b2;
        b1;
        throw b1;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (!n)
        {
            m = 4;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(f f1, g g1, List list, Set set, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        m = 0;
        l = d();
        c = f1;
        d = g1;
        q = new com.google.android.m4b.maps.bf.b(j.d, d(), Boolean.TRUE.booleanValue());
        b.clear();
        b.addAll(list);
        j.clear();
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        for (f1 = set.iterator(); f1.hasNext(); j.add(Pair.create(g1, Boolean.TRUE)))
        {
            g1 = (ac)f1.next();
        }

        break MISSING_BLOCK_LABEL_127;
        f1;
        throw f1;
        n = flag;
        this;
        JVM INSTR monitorexit ;
    }

    public final boolean a(com.google.android.m4b.maps.bf.b b1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b1 == null) goto _L2; else goto _L1
_L1:
        if (b1.c < l) goto _L2; else goto _L3
_L3:
        boolean flag = c();
        if (flag) goto _L2; else goto _L4
_L4:
        flag = true;
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
        b1;
        throw b1;
    }

    public final com.google.android.m4b.maps.bf.b b()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.bf.b b1 = q;
        this;
        JVM INSTR monitorexit ;
        return b1;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        byte byte0 = m;
        boolean flag;
        if (byte0 == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }
}
