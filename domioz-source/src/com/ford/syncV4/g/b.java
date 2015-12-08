// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.g;

import com.ford.syncV4.d.b.d;
import com.ford.syncV4.d.c;
import com.ford.syncV4.i.a;
import com.ford.syncV4.i.e;
import com.ford.syncV4.i.f;
import com.ford.syncV4.i.g;
import com.ford.syncV4.i.l;
import com.ford.syncV4.i.m;
import com.ford.syncV4.i.p;
import com.ford.syncV4.i.q;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.ford.syncV4.g:
//            c, d, a

public final class b
    implements c, g
{

    l a;
    com.ford.syncV4.d.a b;
    com.ford.syncV4.g.a c;
    com.ford.syncV4.f.a d;
    Object e;
    Object f;
    private Object g;
    private CopyOnWriteArrayList h;

    public b(f f1)
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = new Object();
        f = new Object();
        g = new Object();
        h = new CopyOnWriteArrayList();
        c = new com.ford.syncV4.g.c(this, (byte)0);
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
        if (f1.a() != q.a) goto _L2; else goto _L1
_L1:
        a = new a(this, ((e)f1).b());
_L4:
        synchronized (f)
        {
            if (b != null)
            {
                b = null;
            }
            b = new com.ford.syncV4.d.f(this);
        }
        return;
_L2:
        if (f1.a() != q.b) goto _L4; else goto _L3
_L3:
        a = new m((p)f1, this);
          goto _L4
        f1;
        obj;
        JVM INSTR monitorexit ;
        throw f1;
        exception;
        f1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static com.ford.syncV4.g.d a(b b1, byte byte0)
    {
        return b1.c(byte0);
    }

    static CopyOnWriteArrayList a(b b1)
    {
        return b1.h;
    }

    private com.ford.syncV4.g.d c(byte byte0)
    {
        for (Iterator iterator = h.iterator(); iterator.hasNext();)
        {
            com.ford.syncV4.g.d d1 = (com.ford.syncV4.g.d)iterator.next();
            if (d1.d() == byte0)
            {
                return d1;
            }
        }

        return null;
    }

    private void d()
    {
        synchronized (f)
        {
            if (b != null)
            {
                b.a(com.ford.syncV4.d.a.f.c);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Boolean a()
    {
        if (a == null)
        {
            return Boolean.valueOf(false);
        } else
        {
            return a.e();
        }
    }

    public final void a(byte byte0)
    {
        com.ford.syncV4.g.d d1;
        for (d1 = c(byte0); d1 == null || d1.b == null;)
        {
            return;
        }

        d1.b.d();
    }

    public final void a(com.ford.syncV4.d.a.f f1, byte byte0, byte byte1, String s)
    {
        c.a(f1, byte0, byte1, s);
    }

    public final void a(com.ford.syncV4.d.a.f f1, byte byte0, String s)
    {
        c.a(f1, byte0, s);
    }

    public final void a(com.ford.syncV4.d.e e1)
    {
        c.a(e1);
    }

    final void a(com.ford.syncV4.g.d d1)
    {
        synchronized (g)
        {
            if (!h.contains(d1))
            {
                h.add(d1);
            }
        }
        if (!a().booleanValue())
        {
            a.a();
            return;
        } else
        {
            d();
            return;
        }
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
    }

    public final void a(String s)
    {
        c.a(s);
    }

    public final void a(String s, Exception exception)
    {
        c.b(s, exception);
    }

    public final void a(byte abyte0[], int i)
    {
        synchronized (f)
        {
            if (b != null)
            {
                b.a(abyte0, i);
            }
        }
        return;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public final void a(byte abyte0[], int i, int j)
    {
        synchronized (e)
        {
            if (a != null)
            {
                a.b(abyte0, i, j);
            }
        }
        return;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public final void b()
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
                if (((com.ford.syncV4.g.d)iterator.next()).d() == 0)
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

    public final void b(byte byte0)
    {
        com.ford.syncV4.g.d d1;
        for (d1 = c(byte0); d1 == null || d1.b == null;)
        {
            return;
        }

        d1.b.c();
    }

    public final void b(com.ford.syncV4.g.d d1)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        h.remove(d1);
        byte byte0;
        boolean flag;
        if (h.size() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        byte0 = d1.d();
        d1 = ((com.ford.syncV4.g.d) (f));
        d1;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        if (a != null && a.e().booleanValue())
        {
            b.a(com.ford.syncV4.d.a.f.c, byte0);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        b = null;
        d1;
        JVM INSTR monitorexit ;
        d1 = ((com.ford.syncV4.g.d) (e));
        d1;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        if (a != null)
        {
            a.b();
        }
        a = null;
        d1;
        JVM INSTR monitorexit ;
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        d1;
        JVM INSTR monitorexit ;
        throw exception;
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
        exception;
        d1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(String s, Exception exception)
    {
        c.a(s, exception);
    }

    public final int c()
    {
        return h.size();
    }
}
