// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bj;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p.ba.c;
import p.ba.g;
import p.bb.e;
import p.bm.a;
import p.bm.d;
import p.bm.f;
import p.bm.h;
import p.bm.i;

// Referenced classes of package p.bj:
//            c, a

public class b
    implements c, d
{
    private class a
        implements p.bj.a
    {

        final b a;

        public void a(byte byte0)
        {
            for (Iterator iterator = p.bj.b.a(a).iterator(); iterator.hasNext(); ((p.bj.c)iterator.next()).a(byte0)) { }
        }

        public void a(String s)
        {
            for (Iterator iterator = p.bj.b.a(a).iterator(); iterator.hasNext(); ((p.bj.c)iterator.next()).a(s)) { }
        }

        public void a(String s, Exception exception)
        {
            for (Iterator iterator = p.bj.b.a(a).iterator(); iterator.hasNext(); ((p.bj.c)iterator.next()).a(s, exception)) { }
        }

        public void a(p.ba.f f1)
        {
            p.bj.c c1 = p.bj.b.a(a, f1.b());
            if (c1 != null)
            {
                c1.a(f1);
            }
        }

        public void a(e e1, byte byte0, byte byte1, String s)
        {
            Iterator iterator = p.bj.b.a(a).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                p.bj.c c1 = (p.bj.c)iterator.next();
                if (c1.b() != 0)
                {
                    continue;
                }
                c1.a(e1, byte0, byte1, s);
                break;
            } while (true);
        }

        public void a(e e1, byte byte0, String s)
        {
            p.bj.c c1 = p.bj.b.a(a, byte0);
            if (c1 != null)
            {
                c1.a(e1, byte0, s);
            }
        }

        public void b(String s, Exception exception)
        {
            for (Iterator iterator = p.bj.b.a(a).iterator(); iterator.hasNext(); ((p.bj.c)iterator.next()).b(s, exception)) { }
        }

        private a()
        {
            a = b.this;
            super();
        }

    }


    f a;
    p.ba.a b;
    p.bj.a c;
    p.bi.a d;
    Object e;
    Object f;
    private Object g;
    private CopyOnWriteArrayList h;

    public b(p.bm.c c1)
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = new Object();
        f = new Object();
        g = new Object();
        h = new CopyOnWriteArrayList();
        c = new a();
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            if (a.e().booleanValue())
            {
                a.b();
            }
            a = null;
        }
        if (c1.a() != i.a) goto _L2; else goto _L1
_L1:
        a = new p.bm.a(this, ((p.bm.b)c1).b());
_L4:
        synchronized (f)
        {
            if (b != null)
            {
                b = null;
            }
            b = new g(this);
        }
        return;
_L2:
        if (c1.a() != i.b) goto _L4; else goto _L3
_L3:
        a = new p.bm.g((h)c1, this);
          goto _L4
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
        exception;
        c1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static CopyOnWriteArrayList a(b b1)
    {
        return b1.h;
    }

    private p.bj.c a(byte byte0)
    {
        for (Iterator iterator = h.iterator(); iterator.hasNext();)
        {
            p.bj.c c1 = (p.bj.c)iterator.next();
            if (c1.b() == byte0)
            {
                return c1;
            }
        }

        return null;
    }

    static p.bj.c a(b b1, byte byte0)
    {
        return b1.a(byte0);
    }

    private void a(boolean flag, byte byte0)
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        if (a != null && a.e().booleanValue())
        {
            b.a(e.c, byte0);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        b = null;
        obj;
        JVM INSTR monitorexit ;
        obj = e;
        obj;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (a != null)
        {
            a.b();
        }
        a = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a()
        throws p.ax.a
    {
        a.a();
    }

    public void a(String s)
    {
        c.a(s);
    }

    public void a(String s, Exception exception)
    {
        c.b(s, exception);
    }

    public void a(p.ba.f f1)
    {
        c.a(f1);
    }

    public void a(e e1, byte byte0)
    {
        for (e1 = a(byte0); e1 == null || ((p.bj.c) (e1)).b == null;)
        {
            return;
        }

        ((p.bj.c) (e1)).b.d();
    }

    public void a(e e1, byte byte0, byte byte1, String s)
    {
        c.a(e1, byte0, byte1, s);
    }

    public void a(e e1, byte byte0, String s)
    {
        c.a(e1, byte0, s);
    }

    void a(p.bj.c c1)
        throws p.ax.a
    {
        synchronized (g)
        {
            if (!h.contains(c1))
            {
                h.add(c1);
            }
        }
        if (!b().booleanValue())
        {
            a();
            return;
        } else
        {
            d();
            return;
        }
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
    }

    public void a(byte abyte0[], int j)
    {
        synchronized (f)
        {
            if (b != null)
            {
                b.a(abyte0, j);
            }
        }
        return;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public void a(byte abyte0[], int j, int k)
    {
        synchronized (e)
        {
            if (a != null)
            {
                a.b(abyte0, j, k);
            }
        }
        return;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public Boolean b()
    {
        if (a == null)
        {
            return Boolean.valueOf(false);
        } else
        {
            return a.e();
        }
    }

    public void b(String s, Exception exception)
    {
        c.a(s, exception);
    }

    public void b(p.ba.f f1)
    {
        if (b != null)
        {
            b.a(f1);
        }
    }

    public void b(e e1, byte byte0)
    {
        for (e1 = a(byte0); e1 == null || ((p.bj.c) (e1)).b == null;)
        {
            return;
        }

        ((p.bj.c) (e1)).b.c();
    }

    public void b(p.bj.c c1)
    {
        if (b != null && c1 != null)
        {
            b.a(c1.b());
        }
    }

    public String c()
    {
        if (a == null)
        {
            return "";
        } else
        {
            return a.d();
        }
    }

    public void c(p.bj.c c1)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        h.remove(c1);
        boolean flag;
        if (h.size() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag, c1.b());
        obj;
        JVM INSTR monitorexit ;
        return;
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
    }

    void d()
    {
        synchronized (f)
        {
            if (b != null)
            {
                b.a(e.c);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void e()
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            Iterator iterator = h.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((p.bj.c)iterator.next()).b() == 0)
                {
                    d();
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_58;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    public i f()
    {
        return a.c();
    }

    public int g()
    {
        return h.size();
    }
}
