// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TimerTask;
import java.util.Vector;
import kik.a.d.a.a;
import kik.a.d.a.b;
import kik.a.d.a.d;
import kik.a.d.a.e;
import kik.a.d.a.g;
import kik.a.d.a.h;
import kik.a.d.a.l;
import kik.a.e.r;
import kik.a.e.v;
import kik.a.h.i;
import kik.a.h.j;
import kik.a.h.m;

// Referenced classes of package kik.a.d:
//            e, s, g, k

public final class f
{
    private final class a extends TimerTask
    {

        final f a;
        private final kik.a.h.d b;

        public final void run()
        {
            synchronized (kik.a.d.f.a(a))
            {
                if (kik.a.d.f.b(a) == this)
                {
                    f.c(a);
                    kik.a.d.f.d(a);
                    b.a();
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public a(kik.a.h.d d1)
        {
            a = f.this;
            super();
            b = d1;
        }
    }


    private long a;
    private Vector b;
    private HashSet c;
    private String d;
    private long e;
    private boolean f;
    private long g;
    private boolean h;
    private boolean i;
    private long j;
    private final kik.a.d.e k;
    private final Object l = new Object();
    private volatile a m;
    private volatile String n;
    private Vector o;
    private Vector p;
    private boolean q;
    private boolean r;
    private List s;
    private boolean t;

    public f(String s1)
    {
        a = 0xa4cb800L;
        j = -1L;
        m = null;
        n = null;
        o = null;
        p = null;
        q = false;
        r = false;
        t = false;
        d = s1;
        b = new Vector();
        c = new HashSet();
        f = false;
        e = 0L;
        h = false;
        i = false;
        s = new ArrayList();
        k = new kik.a.d.e(s1);
    }

    static Object a(f f1)
    {
        return f1.l;
    }

    static a b(f f1)
    {
        return f1.m;
    }

    static String c(f f1)
    {
        f1.n = null;
        return null;
    }

    static a d(f f1)
    {
        f1.m = null;
        return null;
    }

    private void y()
    {
        this;
        JVM INSTR monitorenter ;
        o = null;
        p = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final long a()
    {
        return e;
    }

    public final s a(String s1)
    {
        for (int i1 = b.size() - 1; i1 >= 0; i1--)
        {
            s s2 = (s)b.elementAt(i1);
            if (s2.b().equals(s1) && s2.d())
            {
                return s2;
            }
        }

        return null;
    }

    public final void a(long l1)
    {
        g = l1;
    }

    public final void a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        Vector vector;
        Iterator iterator;
        vector = new Vector(list.size());
        e = 0L;
        iterator = list.iterator();
        list = null;
_L2:
        Object obj;
        s s1;
        boolean flag1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_175;
        }
        s1 = (s)iterator.next();
        flag1 = kik.a.d.a.g.b(s1);
        obj = (e)kik.a.d.a.g.a(s1, kik/a/d/a/e);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        boolean flag;
        if (((e) (obj)).b().size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        if (e != 0L)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        e = s1.e();
        obj = (b)kik.a.d.a.g.a(s1, kik/a/d/a/b);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        list.a(list.a() + 1);
        break;
        vector.add(s1);
        break;
        list;
        throw list;
        vector.add(s1);
        list = null;
        continue; /* Loop/switch isn't completed */
        b = vector;
        this;
        JVM INSTR monitorexit ;
        return;
        for (flag = false; true;)
        {
            break MISSING_BLOCK_LABEL_88;
        }

        list = ((List) (obj));
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(kik.a.d.g g1)
    {
        a(g1.b(), g1.c());
        i = g1.d();
    }

    public final void a(s s1, int i1, v v1)
    {
        s1.a(i1);
        v1.c(s1);
        y();
    }

    public final void a(s s1, v v1)
    {
        this;
        JVM INSTR monitorenter ;
label0:
        {
            b.remove(s1);
            c.add(s1);
            if (b.isEmpty())
            {
                break label0;
            }
            ListIterator listiterator = b.listIterator(b.size());
            s s2;
            do
            {
                if (!listiterator.hasPrevious())
                {
                    break label0;
                }
                s2 = (s)listiterator.previous();
            } while (!kik.a.d.a.g.b(s2));
            e = s2.e();
        }
        this;
        JVM INSTR monitorexit ;
        v1.b(s1);
        y();
        return;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void a(boolean flag)
    {
        if (r != flag && r)
        {
            y();
        }
        r = flag;
    }

    public final void a(boolean flag, long l1)
    {
        h = flag;
        if (h)
        {
            j = l1;
            return;
        } else
        {
            j = -1L;
            return;
        }
    }

    public final boolean a(String s1, int i1, v v1)
    {
        int j1 = b.size() - 1;
_L3:
        s s2;
        if (j1 < 0)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        s2 = (s)b.elementAt(j1);
        if (!s2.b().equals(s1) || !s2.d()) goto _L2; else goto _L1
_L1:
        s1 = s2;
_L4:
        if (s1 != null)
        {
            a(((s) (s1)), i1, v1);
        }
        return s1 != null;
_L2:
        j1--;
          goto _L3
        s1 = null;
          goto _L4
    }

    public final boolean a(String s1, String s2, String s3, v v1)
    {
        Object obj = null;
        int i1 = b.size() - 1;
        do
        {
label0:
            {
                s s4 = obj;
                if (i1 >= 0)
                {
                    s4 = (s)b.elementAt(i1);
                    if (!s4.b().equals(s1))
                    {
                        break label0;
                    }
                }
                if (s4 != null)
                {
                    ((kik.a.d.a.a)kik.a.d.a.g.a(s4, kik/a/d/a/a)).a(s2, s3);
                    v1.c(s4);
                    y();
                    return true;
                } else
                {
                    return false;
                }
            }
            i1--;
        } while (true);
    }

    public final boolean a(String s1, m m1, kik.a.h.d d1)
    {
        Object obj = l;
        obj;
        JVM INSTR monitorenter ;
        boolean flag;
        if (!s1.equals(n))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        m = new a(d1);
        n = s1;
        m1.a(m);
        obj;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final boolean a(s s1, k k1, v v1, boolean flag)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        v1.d(s1);
        long l1 = kik.a.h.j.b();
        this;
        JVM INSTR monitorenter ;
        int i1 = 0;
_L27:
        if (i1 >= b.size()) goto _L2; else goto _L1
_L1:
        s s2 = (s)b.elementAt(i1);
        b b1;
        b b2;
        int j1;
        boolean flag1;
        if (s1.d() == s2.d() && s1.i().equals(s2.i()) && s1.h().equals(s2.h()) && s1.b().equals(s2.b()))
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 == 0) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return false;
_L2:
        if (!c.contains(s1))
        {
            break MISSING_BLOCK_LABEL_142;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
        j1 = b.size();
        i1 = 0;
_L28:
        if (i1 >= j1) goto _L6; else goto _L5
_L5:
        if (flag) goto _L8; else goto _L7
_L7:
        if (b.size() >= 600) goto _L9; else goto _L8
_L8:
        if (b.size() < 200 || l1 - ((s)b.elementAt(0)).e() <= a) goto _L10; else goto _L9
_L9:
        arraylist.add(b.elementAt(0));
        b.removeElementAt(0);
          goto _L11
_L10:
        if (!flag) goto _L6; else goto _L12
_L12:
        if (b.size() < 100) goto _L6; else goto _L13
_L13:
        arraylist.add(b.elementAt(0));
        b.removeElementAt(0);
          goto _L11
_L6:
        if (b.isEmpty()) goto _L15; else goto _L14
_L14:
        s2 = (s)b.lastElement();
_L26:
        if (s2 == null) goto _L17; else goto _L16
_L16:
        b1 = (b)kik.a.d.a.g.a(s2, kik/a/d/a/b);
        b2 = (b)kik.a.d.a.g.a(s1, kik/a/d/a/b);
        if (b1 == null || b2 == null) goto _L17; else goto _L18
_L18:
        i1 = b1.a();
        b1.a(b2.a() + i1);
        v1.c(s2);
        j1 = 1;
_L25:
        if (j1 != 0)
        {
            break MISSING_BLOCK_LABEL_394;
        }
        t = true;
        b.addElement(s1);
        if (!kik.a.d.a.g.b(s1)) goto _L20; else goto _L19
_L19:
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_560;
        }
        if (!k1.m())
        {
            break MISSING_BLOCK_LABEL_560;
        }
          goto _L20
_L23:
        k1 = (e)kik.a.d.a.g.a(s1, kik/a/d/a/e);
        if (k1 == null) goto _L22; else goto _L21
_L21:
        if (k1.b().size() > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
_L24:
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_456;
        }
        if (e != 0L)
        {
            break MISSING_BLOCK_LABEL_468;
        }
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_468;
        }
        e = kik.a.h.j.b();
        y();
        this;
        JVM INSTR monitorexit ;
        if (arraylist.size() > 0)
        {
            v1.d(arraylist);
        }
        if (j1 == 0)
        {
            v1.a(s1);
        }
        return true;
_L20:
        flag1 = false;
          goto _L23
_L22:
        i1 = 0;
          goto _L24
_L17:
        j1 = 0;
          goto _L25
_L15:
        s2 = null;
          goto _L26
_L4:
        i1++;
          goto _L27
_L11:
        i1++;
          goto _L28
        flag1 = true;
          goto _L23
    }

    public final boolean a(r r1)
    {
        Object obj;
        Object obj1;
        Iterator iterator;
        obj1 = null;
        iterator = b(true).iterator();
        obj = null;
_L3:
        boolean flag;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        Object obj2 = (s)iterator.next();
        if (!((s) (obj2)).h().equals(obj))
        {
            obj1 = ((s) (obj2)).h();
            obj = r1.a(((s) (obj2)).h(), true);
        } else
        {
            Object obj3 = obj;
            obj = obj1;
            obj1 = obj3;
        }
        if (((k) (obj)).m()) goto _L2; else goto _L1
_L1:
        flag = true;
_L4:
        return flag && !r;
_L2:
        obj2 = obj1;
        obj1 = obj;
        obj = obj2;
          goto _L3
        flag = false;
          goto _L4
    }

    public final String b()
    {
        return d;
    }

    public final Vector b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Vector vector = new Vector();
        if (!flag) goto _L2; else goto _L1
_L1:
        if (o == null) goto _L2; else goto _L3
_L3:
        vector.addAll(o);
_L4:
        this;
        JVM INSTR monitorexit ;
        return vector;
_L2:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (p == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        vector.addAll(p);
          goto _L4
        int i1 = b.size() - 1;
_L5:
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        s s1;
        s1 = (s)b.get(i1);
        if (s1.d())
        {
            break MISSING_BLOCK_LABEL_177;
        }
        if (s1.c() >= 500)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        if (!kik.a.d.a.g.b(s1))
        {
            break MISSING_BLOCK_LABEL_177;
        }
        vector.addElement(s1);
        break MISSING_BLOCK_LABEL_177;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        o = new Vector();
        o.addAll(vector);
          goto _L4
        p = new Vector();
        p.addAll(vector);
          goto _L4
        Exception exception;
        exception;
        throw exception;
        i1--;
          goto _L5
    }

    public final s b(String s1)
    {
        for (int i1 = b.size() - 1; i1 >= 0; i1--)
        {
            s s2 = (s)b.elementAt(i1);
            if (s2.b().equals(s1))
            {
                return s2;
            }
        }

        return null;
    }

    public final void b(List list)
    {
        s = list;
    }

    public final Vector c()
    {
        this;
        JVM INSTR monitorenter ;
        Vector vector = b;
        this;
        JVM INSTR monitorexit ;
        return vector;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c(boolean flag)
    {
        f = flag;
    }

    public final boolean c(String s1)
    {
        Object obj = l;
        obj;
        JVM INSTR monitorenter ;
        if (!s1.equals(n))
        {
            break MISSING_BLOCK_LABEL_32;
        }
        n = null;
        m = null;
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final s d()
    {
        this;
        JVM INSTR monitorenter ;
        if (b.size() <= 0) goto _L2; else goto _L1
_L1:
        s s1 = (s)b.lastElement();
_L4:
        this;
        JVM INSTR monitorexit ;
        return s1;
_L2:
        s1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final s e()
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = b.size() - 1;
_L12:
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        Object obj;
        s s1;
        kik.a.d.a.a a1;
        l l1;
        kik.a.d.a.m m1;
        d d1;
        b b1;
        s1 = (s)b.elementAt(i1);
        obj = (h)kik.a.d.a.g.a(s1, kik/a/d/a/h);
        a1 = (kik.a.d.a.a)kik.a.d.a.g.a(s1, kik/a/d/a/a);
        l1 = (l)kik.a.d.a.g.a(s1, kik/a/d/a/l);
        m1 = (kik.a.d.a.m)kik.a.d.a.g.a(s1, kik/a/d/a/m);
        d1 = (d)kik.a.d.a.g.a(s1, kik/a/d/a/d);
        b1 = (b)kik.a.d.a.g.a(s1, kik/a/d/a/b);
        if (obj == null) goto _L4; else goto _L3
_L3:
        boolean flag = kik.a.h.i.a(((h) (obj)).a());
        if (flag) goto _L4; else goto _L5
_L5:
        obj = s1;
_L7:
        this;
        JVM INSTR monitorexit ;
        return ((s) (obj));
_L4:
        obj = s1;
        if (a1 != null) goto _L7; else goto _L6
_L6:
        obj = s1;
        if (l1 != null) goto _L7; else goto _L8
_L8:
        obj = s1;
        if (m1 != null) goto _L7; else goto _L9
_L9:
        obj = s1;
        if (b1 != null) goto _L7; else goto _L10
_L10:
        if (d1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = d1.g();
        obj = s1;
        if (flag) goto _L7; else goto _L11
_L11:
        i1--;
          goto _L12
_L2:
        obj = null;
          goto _L7
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean equals(Object obj)
    {
        while (obj == null || !(obj instanceof f)) 
        {
            return false;
        }
        if (obj == this)
        {
            return true;
        } else
        {
            return ((f)obj).d.equals(d);
        }
    }

    public final s f()
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = b.size() - 1;
_L7:
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        s s1;
        d d1;
        s1 = (s)b.get(i1);
        d1 = (d)kik.a.d.a.g.a(s1, kik/a/d/a/d);
        if (d1 == null) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return s1;
_L4:
        i1--;
        continue; /* Loop/switch isn't completed */
_L2:
        s1 = null;
        if (true) goto _L3; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean g()
    {
        this;
        JVM INSTR monitorenter ;
        if (b.size() <= 0) goto _L2; else goto _L1
_L1:
        boolean flag = ((s)b.lastElement()).d();
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final String h()
    {
        return n;
    }

    public final int hashCode()
    {
        return 0x49ae78a9 ^ d.hashCode();
    }

    public final boolean i()
    {
        return t;
    }

    public final void j()
    {
        t = false;
    }

    public final long k()
    {
        return g;
    }

    public final boolean l()
    {
        return f;
    }

    public final void m()
    {
        e = kik.a.h.j.b();
    }

    public final boolean n()
    {
        return h;
    }

    public final boolean o()
    {
        return i;
    }

    public final long p()
    {
        return j;
    }

    public final kik.a.d.g q()
    {
        return new kik.a.d.g(d, h, j, i);
    }

    public final void r()
    {
        i = true;
    }

    public final String s()
    {
        return (new StringBuilder("KikPreferences.")).append(d).toString();
    }

    public final void t()
    {
        q = true;
    }

    public final boolean u()
    {
        return q;
    }

    public final void v()
    {
        q = false;
    }

    public final List w()
    {
        return s;
    }

    public final void x()
    {
        s = null;
    }
}
