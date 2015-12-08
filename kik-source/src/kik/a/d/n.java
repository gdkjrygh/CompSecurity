// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kik.a.h.i;

// Referenced classes of package kik.a.d:
//            k, j

public final class n extends k
{
    public static final class a
    {

        private List a;
        private List b;
        private Set c;

        public final List a()
        {
            return a;
        }

        public final void a(String s1)
        {
            a.add(s1);
        }

        public final boolean a(k k1)
        {
            return c.contains(k1.b());
        }

        public final List b()
        {
            return b;
        }

        public final boolean b(String s1)
        {
            a.add(s1);
            return c.add(s1);
        }

        public final Set c()
        {
            return c;
        }

        public final boolean c(String s1)
        {
            return c.add(s1);
        }

        public final void d()
        {
            Collections.sort(a);
        }

        public final boolean d(String s1)
        {
            return a.contains(s1);
        }

        public final boolean e(String s1)
        {
            c.remove(s1);
            return a.remove(s1);
        }

        public final boolean f(String s1)
        {
            c.remove(s1);
            a.remove(s1);
            return b.add(s1);
        }

        public final boolean g(String s1)
        {
            return c.contains(s1);
        }

        public a()
        {
            this(((List) (new ArrayList())), ((List) (new ArrayList())), ((Set) (new HashSet())));
        }

        public a(List list, List list1, Set set)
        {
            a = list;
            b = list1;
            c = set;
        }
    }


    protected boolean r;
    protected String s;
    protected boolean t;
    protected boolean u;
    protected a v;
    private final Object w;
    private boolean x;

    private n(j j1, String s1, List list)
    {
        this(j1, s1, new a(list, new ArrayList(), new HashSet()), false, false, false, null, null, null);
    }

    private n(j j1, String s1, List list, byte byte0)
    {
        this(j1, s1, list);
    }

    public n(j j1, String s1, a a1, boolean flag, boolean flag1, boolean flag2, String s2, 
            String s3, String s4)
    {
        super(j1, s1, null, flag1, s2, s3, flag1);
        w = new Object();
        u = false;
        v = a1;
        synchronized (w)
        {
            v.d();
        }
        r = flag;
        s = s4;
        t = flag2;
        return;
        s1;
        j1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public static n a(n n1)
    {
        n n2 = new n(n1.a(), "", new ArrayList(), (byte)0);
        n2.c(n1);
        return n2;
    }

    public static n h(String s1)
    {
        s1 = new n(kik.a.d.j.a(s1), null, new ArrayList(), (byte)0);
        s1.d = true;
        return s1;
    }

    private boolean j(String s1)
    {
        boolean flag;
        synchronized (w)
        {
            flag = v.d(s1);
        }
        return flag;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final boolean A()
    {
        return t;
    }

    public final boolean B()
    {
        return u;
    }

    public final int C()
    {
        int i1 = v.c().size();
        int l;
        if (t)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        return l + i1;
    }

    public final int D()
    {
        return v.b().size();
    }

    public final int E()
    {
        return v.a().size();
    }

    public final int F()
    {
        int i1 = v.a().size();
        int l;
        if (u)
        {
            l = 0;
        } else
        {
            l = 1;
        }
        return l + i1;
    }

    public final boolean G()
    {
        return r;
    }

    public final boolean H()
    {
        return x;
    }

    public final boolean I()
    {
        return !kik.a.h.i.a(s);
    }

    public final String J()
    {
        return s;
    }

    public final String c()
    {
        if (b != null)
        {
            return b;
        } else
        {
            return null;
        }
    }

    public final void c(k k1)
    {
        synchronized (w)
        {
            if (a.a(k1.a) && (k1 instanceof n))
            {
                String s1 = n;
                super.c(k1);
                v = ((n)k1).v;
                v.d();
                r = ((n)k1).r;
                t = ((n)k1).t;
                u = ((n)k1).u;
                s = ((n)k1).s;
                n = s1;
                if (k1.n != null)
                {
                    n = k1.n;
                }
            }
        }
        return;
        k1;
        obj;
        JVM INSTR monitorexit ;
        throw k1;
    }

    public final boolean d(String s1)
    {
label0:
        {
            synchronized (w)
            {
                if (!j(s1))
                {
                    break label0;
                }
            }
            return true;
        }
        v.a(s1);
        v.d();
        obj;
        JVM INSTR monitorexit ;
        return true;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final boolean d(k k1)
    {
        return v.a(k1);
    }

    public final boolean e(String s1)
    {
        boolean flag;
        synchronized (w)
        {
            flag = v.e(s1);
        }
        return flag;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final boolean f(String s1)
    {
        boolean flag;
        synchronized (w)
        {
            flag = v.c(s1);
        }
        return flag;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final boolean g(String s1)
    {
        return v.g(s1);
    }

    public final void i(String s1)
    {
        s = s1;
    }

    public final void i(boolean flag)
    {
        u = flag;
    }

    public final void j(boolean flag)
    {
        r = flag;
    }

    public final void k(boolean flag)
    {
        x = flag;
    }

    public final boolean t()
    {
        return true;
    }

    public final List w()
    {
        ArrayList arraylist;
        synchronized (w)
        {
            arraylist = new ArrayList(v.a());
        }
        return arraylist;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final List x()
    {
        Object obj = w;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        obj1 = new ArrayList();
        Iterator iterator = v.a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (!g(s1))
            {
                ((ArrayList) (obj1)).add(s1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_72;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
        return ((List) (obj1));
    }

    public final List y()
    {
        ArrayList arraylist;
        synchronized (w)
        {
            arraylist = new ArrayList(v.b());
        }
        return arraylist;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final List z()
    {
        Object obj = w;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        obj1 = new ArrayList();
        Iterator iterator = v.a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (g(s1))
            {
                ((ArrayList) (obj1)).add(s1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_72;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
        return ((List) (obj1));
    }
}
