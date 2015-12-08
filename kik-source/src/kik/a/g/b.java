// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.a;
import com.kik.g.e;
import com.kik.g.f;
import com.kik.g.p;
import com.kik.g.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kik.a.d.j;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.e.l;
import kik.a.e.r;
import kik.a.e.v;
import kik.a.f.f.ag;
import kik.a.f.f.h;
import kik.a.f.f.m;
import kik.a.f.f.o;
import kik.a.f.f.q;
import kik.a.h.i;
import kik.a.z;

// Referenced classes of package kik.a.g:
//            c, m, o, j, 
//            k, f, g, h, 
//            i, r, t, u, 
//            l, n, d, e, 
//            s, p, q

public final class b
    implements l
{

    private final kik.a.e.f a;
    private final r b;
    private final v c;
    private final f d = new f();
    private com.kik.g.k e;
    private com.kik.g.k f;
    private com.kik.g.k g;
    private com.kik.g.k h;
    private com.kik.g.k i;
    private final Map j = new HashMap();
    private final Map k = new HashMap();
    private final com.kik.g.i l = new c(this);
    private final com.kik.g.i m = new kik.a.g.m(this);
    private final com.kik.g.i n = new kik.a.g.o(this);

    public b(Map map, r r1, kik.a.e.f f1, v v1, ExecutorService executorservice)
    {
        a(map);
        a = f1;
        b = r1;
        c = v1;
        d.a(c.c(), l);
        d.a(b.f(), l);
        d.a(b.e(), m);
        e = new a(this, executorservice);
        f = new a(this, executorservice);
        g = new a(this, executorservice);
        h = new a(this, executorservice);
        i = new a(this, executorservice);
    }

    private static List a(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(((k)list.next()).b())) { }
        return arraylist;
    }

    static v a(b b1)
    {
        return b1.c;
    }

    private void a(Map map)
    {
        map = map.values().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            Object obj = (k)map.next();
            if (obj instanceof n)
            {
                obj = (n)obj;
                Iterator iterator = ((n) (obj)).w().iterator();
                while (iterator.hasNext()) 
                {
                    a(((n) (obj)), (String)iterator.next());
                }
            }
        } while (true);
    }

    private void a(n n1, String s1)
    {
        if (!n1.p())
        {
            return;
        }
        if (!j.containsKey(s1))
        {
            j.put(s1, new HashSet());
        }
        synchronized ((Set)j.get(s1))
        {
            s1.add(n1.b());
        }
        return;
        n1;
        s1;
        JVM INSTR monitorexit ;
        throw n1;
    }

    static void a(b b1, n n1, String s1)
    {
        b1.a(n1, s1);
    }

    static r b(b b1)
    {
        return b1.b;
    }

    static com.kik.g.k c(b b1)
    {
        return b1.i;
    }

    static com.kik.g.k d(b b1)
    {
        return b1.h;
    }

    static com.kik.g.k e(b b1)
    {
        return b1.e;
    }

    static Map f(b b1)
    {
        return b1.k;
    }

    static com.kik.g.k g(b b1)
    {
        return b1.g;
    }

    public final p a(String s1, String s2)
    {
        s2 = s.b(a.a(new m(s1, s2)));
        s2.a(new kik.a.g.j(this));
        return s.b(s2, new kik.a.g.k(this, s1));
    }

    public final p a(String s1, String s2, String s3)
    {
        if (!kik.a.h.i.a(s1))
        {
            s2 = new kik.a.f.f.p(s1, s3, z.b(c).a().a());
            s2 = s.b(a.a(s2));
            s2.a(new kik.a.g.f(this, s3, s1));
            return s.b(s2, new g(this, s3));
        } else
        {
            s2 = new o(s2, s3);
            s2 = s.b(a.a(s2));
            s2.a(new kik.a.g.h(this, s3, s1));
            return s.b(s2, new kik.a.g.i(this, s3));
        }
    }

    public final p a(String s1, String s2, boolean flag, boolean flag1)
    {
        if (flag1)
        {
            s1 = kik.a.f.f.r.b(s1, s2);
        } else
        if (flag)
        {
            s1 = kik.a.f.f.r.a(s1, s2);
        } else
        {
            s1 = kik.a.f.f.r.c(s1, s2);
        }
        s1 = s.b(a.a(s1));
        s1.a(new kik.a.g.r(this));
        return s1;
    }

    public final p a(String s1, k k1, List list)
    {
        String s2;
        StringBuilder stringbuilder;
        if (k1 == null)
        {
            s2 = null;
        } else
        {
            s2 = k1.b();
        }
        stringbuilder = new StringBuilder();
        stringbuilder.append(k1);
        stringbuilder.append(list.hashCode());
        k1 = stringbuilder.toString();
        if (k.containsKey(k1))
        {
            String s3 = (String)k.get(k1);
            s1 = new kik.a.f.f.n(s1, s2, a(list), s3);
        } else
        {
            s1 = new kik.a.f.f.n(s1, s2, a(list));
        }
        list = s1.d();
        s1 = s.b(a.a(s1));
        s1.a(new t(this, k1, list));
        return s.b(s1, new u(this, s1));
    }

    public final p a(n n1)
    {
        Object obj = new q(n1.b());
        n1.k(true);
        obj = s.b(a.a(((kik.a.f.f.z) (obj))));
        ((p) (obj)).a(new kik.a.g.l(this));
        return s.b(((p) (obj)), new kik.a.g.n(this, n1));
    }

    public final p a(n n1, List list)
    {
        n1 = new kik.a.f.f.l(n1.b(), a(list));
        n1 = s.b(a.a(n1));
        n1.a(new d(this));
        return s.b(n1, new kik.a.g.e(this));
    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = b.g().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            k k1 = (k)iterator.next();
            if ((k1 instanceof n) && k1.l())
            {
                arraylist.add((n)k1);
            }
        } while (true);
        return arraylist;
    }

    public final Set a(k k1)
    {
        k1 = (Set)j.get(k1.b());
        if (k1 == null)
        {
            return new HashSet();
        } else
        {
            return new HashSet(k1);
        }
    }

    public final n a(String s1, boolean flag)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("Can't get group for null identifier");
        }
        Object obj1 = b.a(s1, flag);
        Object obj = obj1;
        if (!(obj1 instanceof n))
        {
            obj = null;
        }
        obj1 = (n)obj;
        obj = obj1;
        if (obj1 == null)
        {
            obj = obj1;
            if (flag)
            {
                obj = kik.a.d.n.h(s1);
                b.a(((k) (obj)));
                b.j();
            }
        }
        return ((n) (obj));
    }

    public final void a(String s1)
    {
        s.b(a.a(new kik.a.f.f.k(s1))).a(new kik.a.g.s(this));
    }

    public final void a(String s1, String s2, com.kik.g.r r1)
    {
        s.b(a.a(new ag(s1, s2), true)).a(new kik.a.g.p(this, r1));
    }

    protected final void a(String s1, n n1)
    {
        Set set;
        set = (Set)j.get(s1);
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        set;
        JVM INSTR monitorenter ;
        set.remove(n1.b());
        if (set.isEmpty())
        {
            j.remove(s1);
        }
        set;
        JVM INSTR monitorexit ;
        return;
        s1;
        set;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void a(kik.a.e.i i1)
    {
        d.a(i1.o(), n);
    }

    public final e b()
    {
        return e.a();
    }

    public final p b(String s1)
    {
        return s.b(s.b(a.a(new h(s1))), new kik.a.g.q(this));
    }

    public final void b(n n1)
    {
        c(n1);
    }

    public final e c()
    {
        return g.a();
    }

    public final Set c(String s1)
    {
        return a(b.a(s1, false));
    }

    protected final void c(n n1)
    {
        Object obj1 = new LinkedList();
        LinkedList linkedlist = new LinkedList();
        linkedlist.addAll(n1.w());
        LinkedList linkedlist1 = new LinkedList();
        Object obj = new LinkedList();
        if (((List) (obj1)).size() != linkedlist.size())
        {
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
            {
                String s1 = (String)((Iterator) (obj1)).next();
                if (!linkedlist.contains(s1))
                {
                    ((List) (obj)).add(s1);
                } else
                {
                    linkedlist.remove(s1);
                }
            }

            linkedlist1.addAll(linkedlist);
        }
        for (Iterator iterator = linkedlist1.iterator(); iterator.hasNext(); a(n1, (String)iterator.next())) { }
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a((String)((Iterator) (obj)).next(), n1)) { }
        c.d(n1);
    }

    public final e d()
    {
        return h.a();
    }

    public final e e()
    {
        return i.a();
    }

    public final void f()
    {
        d.a();
        j.clear();
    }
}
