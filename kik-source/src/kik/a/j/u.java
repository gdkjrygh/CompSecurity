// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.b.a.n;
import com.kik.g.as;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.g.p;
import com.kik.g.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kik.a.d.ab;
import kik.a.e.x;
import kik.a.f.f.ap;
import kik.a.f.f.z;
import kik.a.h.g;
import kik.a.h.j;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.a.j:
//            n, v, x, w, 
//            y, aa, ab, ae, 
//            af, ag, ah, ai

public class u
    implements kik.a.j.n
{
    private final class a
        implements Callable
    {

        final u a;
        private final String b;

        private p a()
        {
            Map map = u.a(a);
            map;
            JVM INSTR monitorenter ;
            p p1;
            if (u.a(a).containsKey(b))
            {
                break MISSING_BLOCK_LABEL_115;
            }
            p1 = kik.a.j.u.b(a).a(new ap(b, null));
            p1.a(new ae(this));
            u.a(a).put(b, p1);
_L2:
            p1 = s.b(p1, new f((byte)0));
            p1.a(new af(this));
            return p1;
            p1 = (p)u.a(a).get(b);
            if (true) goto _L2; else goto _L1
_L1:
            Exception exception;
            exception;
            map;
            JVM INSTR monitorexit ;
            throw exception;
        }

        static String a(a a1)
        {
            return a1.b;
        }

        public final Object call()
        {
            return a();
        }

        public a(String s1)
        {
            a = u.this;
            super();
            b = s1;
        }
    }

    private final class b
        implements Callable
    {

        final u a;
        private final String b;

        static String a(b b1)
        {
            return b1.b;
        }

        public final p a()
        {
            Map map = u.a(a);
            map;
            JVM INSTR monitorenter ;
            p p1;
            if (u.a(a).containsKey(b))
            {
                break MISSING_BLOCK_LABEL_115;
            }
            p1 = kik.a.j.u.b(a).a(new ap(null, b));
            p1.a(new ag(this));
            u.a(a).put(b, p1);
_L2:
            p1 = s.b(p1, new e((byte)0));
            p1.a(new ah(this));
            return p1;
            p1 = (p)u.a(a).get(b);
            if (true) goto _L2; else goto _L1
_L1:
            Exception exception;
            exception;
            map;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final Object call()
        {
            return a();
        }

        public b(String s1)
        {
            a = u.this;
            super();
            b = s1;
        }
    }

    private final class c
        implements Callable
    {

        final u a;
        private final String b;
        private final String c;

        static String a(c c1)
        {
            return c1.b;
        }

        public final Object call()
        {
            p p1 = (a. new b(b)).a();
            p1.a(new ai(this));
            return s.b(p1, new d(c));
        }

        public c(String s1, String s2)
        {
            a = u.this;
            super();
            b = s1;
            c = s2;
        }
    }

    private static final class d
        implements as
    {

        private String a;

        public final Object a(Object obj)
        {
            return (ab)((Map)obj).get(a);
        }

        public d(String s1)
        {
            a = s1;
        }
    }

    private static final class e
        implements as
    {

        public final Object a(Object obj)
        {
            Object obj1 = ((ap)(z)obj).d();
            obj = new HashMap();
            ab ab1;
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((HashMap) (obj)).put(ab1.b(), ab1))
            {
                ab1 = (ab)((Iterator) (obj1)).next();
            }

            return obj;
        }

        private e()
        {
        }

        e(byte byte0)
        {
            this();
        }
    }

    private static final class f
        implements as
    {

        public final Object a(Object obj)
        {
            List list = ((ap)(z)obj).d();
            obj = null;
            if (list.size() > 0)
            {
                obj = (ab)list.get(0);
            }
            return obj;
        }

        private f()
        {
        }

        f(byte byte0)
        {
            this();
        }
    }

    private static final class g
        implements as
    {

        private Class a;

        public final volatile Object a(Object obj)
        {
            obj = (ab)obj;
            if (obj != null)
            {
                return ((ab) (obj)).a(a);
            } else
            {
                return null;
            }
        }

        public g(Class class1)
        {
            a = class1;
        }
    }


    private static final org.c.b a = org.c.c.a("IXDataManager");
    private ScheduledExecutorService b;
    private ScheduledFuture c;
    private boolean d;
    private Object e;
    private x f;
    private kik.a.e.f g;
    private com.kik.g.f h;
    private Map i;
    private Map j;
    private final i k = new v(this);

    public u()
    {
        e = new Object();
        h = new com.kik.g.f();
        j = new HashMap();
        i = new HashMap();
    }

    static Map a(u u1)
    {
        return u1.j;
    }

    static void a(u u1, String s1, Map map)
    {
        u1.f.b(s1);
        String s2;
        ab ab1;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); u1.f.b(s1, s2, ab1.c()))
        {
            s2 = (String)iterator.next();
            ab1 = (ab)map.get(s2);
        }

    }

    static void a(u u1, String s1, ab ab1)
    {
        if (ab1 != null)
        {
            u1.f.b(Arrays.asList(new ab[] {
                ab1
            }));
            u1.f.b(s1, null, ab1.c());
            return;
        } else
        {
            u1.f.b(Arrays.asList(new ab[] {
                new ab(s1)
            }));
            return;
        }
    }

    static kik.a.e.f b(u u1)
    {
        return u1.g;
    }

    static void c(u u1)
    {
label0:
        {
            synchronized (u1.e)
            {
                if (!u1.d)
                {
                    break label0;
                }
            }
            return;
        }
        u1.d = true;
        u1.f.b().a(new kik.a.j.x(u1));
        obj;
        JVM INSTR monitorexit ;
        return;
        u1;
        obj;
        JVM INSTR monitorexit ;
        throw u1;
    }

    static void d(u u1)
    {
        if (u1.c != null)
        {
            ScheduledFuture scheduledfuture = u1.c;
            u1.c = null;
            if (!scheduledfuture.isCancelled())
            {
                scheduledfuture.cancel(false);
            }
        }
        long l3 = kik.a.h.j.b();
        Object obj = new ArrayList();
        Iterator iterator = u1.i.entrySet().iterator();
        long l = 0x7fffffffffffffffL;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            String s2 = (String)entry.getKey();
            long l2 = ((Long)entry.getValue()).longValue();
            long l1 = l;
            if (l2 <= l)
            {
                l1 = l2;
            }
            l = l1;
            if (l2 <= l3)
            {
                ((List) (obj)).add(s2);
                l = l1;
            }
        } while (true);
        String s1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); u1.i.remove(s1))
        {
            s1 = (String)((Iterator) (obj)).next();
        }

        if (l < 0x7fffffffffffffffL)
        {
            u1.c = u1.b.schedule(new w(u1), l - l3, TimeUnit.MILLISECONDS);
        }
    }

    static Map e(u u1)
    {
        return u1.i;
    }

    static boolean f(u u1)
    {
        u1.d = false;
        return false;
    }

    static x g(u u1)
    {
        return u1.f;
    }

    public final p a(String s1, String s2, Class class1)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("Must provide a primary key");
        }
        if (!s1.matches("^[_a-z0-9]{2,253}$"))
        {
            throw new IllegalArgumentException("Primary key must match ^[_a-z0-9]{2,253}$");
        }
        if (s2 == null || s2 != null && (s2.length() < 2 || s2.length() > 253))
        {
            throw new IllegalArgumentException((new StringBuilder("Sub key must be less than 253 and more than 2 characters. Illegal value of: ")).append(s2).toString());
        } else
        {
            return s.b(s.a(f.a(s1, s2), new c(s1, s2)), new g(class1));
        }
    }

    public final p a(String s1, String s2, Class class1, as as, Long long1)
    {
        return s.a(a(s1, s2, class1), new y(this, as, s1, s2, long1));
    }

    public final p a(String s1, String s2, byte abyte0[], Long long1)
    {
        if (abyte0 == null)
        {
            s1 = new ab(s1, s2);
        } else
        {
            s1 = new ab(s1, s2, abyte0);
        }
        return s.b(a(Arrays.asList(new ab[] {
            s1
        }), long1), new aa(this));
    }

    public final p a(List list)
    {
        return a(list, ((Long) (null)));
    }

    public final p a(List list, Long long1)
    {
        p p1 = new p();
        Object obj;
        Iterator iterator;
        obj = s.a(null);
        iterator = list.iterator();
_L1:
        byte abyte0[];
        x x1;
        String s1;
        String s2;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_106;
        }
        abyte0 = (ab)iterator.next();
        x1 = f;
        s1 = abyte0.a();
        s2 = abyte0.b();
        if (!abyte0.d())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        abyte0 = null;
_L2:
        try
        {
            obj = s.a(((p) (obj)), x1.a(s1, s2, abyte0));
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            p1.a(list);
            return p1;
        }
          goto _L1
        abyte0 = abyte0.c();
          goto _L2
        ((p) (obj)).a(new kik.a.j.ab(this, long1, list, p1));
        return p1;
    }

    public final void a(x x1, kik.a.e.f f1)
    {
        f = x1;
        g = f1;
        b = Executors.newSingleThreadScheduledExecutor();
        h.a(g.b(), k);
    }

    public final p b()
    {
        return f.a();
    }

    public final p b(String s1, String s2, n n1)
    {
        return b(s1, s2, n1, null);
    }

    public final p b(String s1, String s2, n n1, Long long1)
    {
        return a(s1, s2, kik.a.h.g.a(n1), long1);
    }

    public final p c(String s1, Class class1)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("Must provide a primary key");
        }
        if (!s1.matches("^[_a-z0-9]{2,253}$"))
        {
            throw new IllegalArgumentException("Primary key must match ^[_a-z0-9]{2,253}$");
        } else
        {
            return s.b(s.a(f.a(s1), new b(s1)), s.a(new g(class1)));
        }
    }

    public void c()
    {
        b.shutdown();
        h.a();
        f.c();
    }

    public final p d(String s1, Class class1)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("Must provide a primary key");
        }
        if (!s1.matches("^[_a-z0-9]{2,253}$"))
        {
            throw new IllegalArgumentException("Primary key must match ^[_a-z0-9]{2,253}$");
        } else
        {
            return s.b(s.a(f.a(s1, null), new a(s1)), new g(class1));
        }
    }

    protected final x d()
    {
        return f;
    }

}
