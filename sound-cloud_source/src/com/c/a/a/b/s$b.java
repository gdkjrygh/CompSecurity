// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import c.h;
import c.o;
import com.c.a.a.c;
import com.c.a.a.i;
import com.c.a.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.c.a.a.b:
//            s, a, D, b, 
//            C, n, q, B, 
//            e, A

final class <init> extends c
    implements <init>
{

    b b;
    final s c;

    protected final void a()
    {
        Object obj;
        a a1;
        Object obj2;
        a a2;
        obj2 = a.g;
        a2 = a.g;
        a1 = ((a) (obj2));
        obj = obj2;
        b = c.g.a(o.a(o.b(c.h)), c.b);
        a1 = ((a) (obj2));
        obj = obj2;
        if (c.b)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        a1 = ((a) (obj2));
        obj = obj2;
        b.a();
_L2:
        a1 = ((a) (obj2));
        obj = obj2;
        if (b.a(this)) goto _L2; else goto _L1
_L1:
        a1 = ((a) (obj2));
        obj = obj2;
        obj2 = a.a;
        a1 = ((a) (obj2));
        obj = obj2;
        a a3 = a.l;
        IOException ioexception;
        Object obj1;
        try
        {
            s.a(c, ((a) (obj2)), a3);
        }
        catch (IOException ioexception1) { }
        i.a(b);
        return;
        obj;
        obj = a1;
        obj2 = a.b;
        obj = a.b;
        try
        {
            s.a(c, ((a) (obj2)), ((a) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        i.a(b);
        return;
        obj1;
        obj2 = obj;
        obj = obj1;
_L4:
        try
        {
            s.a(c, ((a) (obj2)), a2);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        i.a(b);
        throw obj;
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(int j, long l)
    {
        if (j == 0)
        {
            synchronized (c)
            {
                s s2 = c;
                s2.d = s2.d + l;
                c.notifyAll();
            }
            return;
        }
        break MISSING_BLOCK_LABEL_50;
        exception;
        s1;
        JVM INSTR monitorexit ;
        throw exception;
        C c1;
        c1 = c.a(j);
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        c1;
        JVM INSTR monitorenter ;
        c1.a(l);
        c1;
        JVM INSTR monitorexit ;
        return;
        Exception exception1;
        exception1;
        c1;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public final void a(int j, c.i k)
    {
        k = k.c;
        C ac[];
        synchronized (c)
        {
            ac = (C[])s.e(c).values().toArray(new C[s.e(c).size()]);
            com.c.a.a.b.s.i(c);
        }
        int i1 = ac.length;
        for (int l = 0; l < i1; l++)
        {
            k = ac[l];
            if (((C) (k)).c > j && k.b())
            {
                k.c(a.k);
                c.b(((C) (k)).c);
            }
        }

        break MISSING_BLOCK_LABEL_125;
        exception;
        k;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int j, a a1)
    {
        if (s.a(c, j))
        {
            s.a(c, j, a1);
        } else
        {
            C c1 = c.b(j);
            if (c1 != null)
            {
                c1.c(a1);
                return;
            }
        }
    }

    public final void a(int j, List list)
    {
        s.a(c, j, list);
    }

    public final void a(boolean flag, int j, int k)
    {
        if (flag)
        {
            n n1 = com.c.a.a.b.s.c(c, j);
            if (n1 != null)
            {
                if (n1.c != -1L || n1.b == -1L)
                {
                    throw new IllegalStateException();
                }
                n1.c = System.nanoTime();
                n1.a.countDown();
            }
            return;
        } else
        {
            s.a(c, j, k);
            return;
        }
    }

    public final void a(boolean flag, int j, h h1, int k)
        throws IOException
    {
        if (s.a(c, j))
        {
            s.a(c, j, h1, k, flag);
        } else
        {
            C c1 = c.a(j);
            if (c1 == null)
            {
                c.a(j, com.c.a.a.b.a.c);
                h1.f(k);
                return;
            }
            if (!com.c.a.a.b.C.i && Thread.holdsLock(c1))
            {
                throw new AssertionError();
            }
            c1.f.a(h1, k);
            if (flag)
            {
                c1.e();
                return;
            }
        }
    }

    public final void a(boolean flag, q q1)
    {
        s1 = c;
        s1;
        JVM INSTR monitorenter ;
        int k = c.f.b();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        q q2 = c.f;
        q2.c = 0;
        q2.b = 0;
        q2.a = 0;
        Arrays.fill(q2.d, 0);
        q q3 = c.f;
        int j = 0;
_L5:
        if (j >= 10)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        if (q1.a(j))
        {
            q3.a(j, q1.b(j), q1.d[j]);
        }
        break MISSING_BLOCK_LABEL_362;
        if (c.a == v.d)
        {
            s.d().execute(new B(this, "OkHttp %s ACK Settings", new Object[] {
                s.a(c)
            }, q1));
        }
        j = c.f.b();
        long l1;
        if (j == -1 || j == k)
        {
            break MISSING_BLOCK_LABEL_354;
        }
        l1 = j - k;
        if (s.g(c))
        {
            break MISSING_BLOCK_LABEL_236;
        }
        q1 = c;
        q1.d = ((s) (q1)).d + l1;
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        q1.notifyAll();
        com.c.a.a.b.s.h(c);
        if (s.e(c).isEmpty()) goto _L2; else goto _L1
_L1:
        q1 = (C[])s.e(c).values().toArray(new C[s.e(c).size()]);
_L3:
        s1;
        JVM INSTR monitorexit ;
        if (q1 != null && l1 != 0L)
        {
            int l = q1.length;
            for (j = 0; j < l; j++)
            {
                synchronized (q1[j])
                {
                    s1.a(l1);
                }
            }

        }
        break MISSING_BLOCK_LABEL_348;
        q1;
        s1;
        JVM INSTR monitorexit ;
        throw q1;
        q1;
        s1;
        JVM INSTR monitorexit ;
        throw q1;
        return;
_L2:
        q1 = null;
          goto _L3
        q1 = null;
        l1 = 0L;
          goto _L3
        j++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(boolean flag, boolean flag1, int j, List list, e e1)
    {
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        flag3 = false;
        flag4 = false;
        flag2 = false;
        flag5 = true;
        if (!s.a(c, j)) goto _L2; else goto _L1
_L1:
        s.a(c, j, list, flag1);
_L8:
        return;
_L2:
        synchronized (c)
        {
            if (!s.b(c))
            {
                break MISSING_BLOCK_LABEL_66;
            }
        }
        return;
        list;
        s1;
        JVM INSTR monitorexit ;
        throw list;
        C c1 = c.a(j);
        if (c1 != null)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        Object obj;
        if (e1 == e.b || e1 == com.c.a.a.b.e.c)
        {
            flag2 = true;
        }
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        c.a(j, com.c.a.a.b.a.c);
        s1;
        JVM INSTR monitorexit ;
        return;
        if (j > com.c.a.a.b.s.c(c))
        {
            break MISSING_BLOCK_LABEL_135;
        }
        s1;
        JVM INSTR monitorexit ;
        return;
        if (j % 2 != s.d(c) % 2)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        s1;
        JVM INSTR monitorexit ;
        return;
        list = new C(j, c, flag, flag1, list);
        s.b(c, j);
        s.e(c).put(Integer.valueOf(j), list);
        s.d().execute(new A(this, "OkHttp %s stream %d", new Object[] {
            s.a(c), Integer.valueOf(j)
        }, list));
        s1;
        JVM INSTR monitorexit ;
        return;
        s1;
        JVM INSTR monitorexit ;
        if (e1 == e.a)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2)
        {
            c1.b(a.b);
            c.b(j);
            return;
        }
        if (!com.c.a.a.b.C.i && Thread.holdsLock(c1))
        {
            throw new AssertionError();
        }
        obj = null;
        c1;
        JVM INSTR monitorenter ;
        if (c1.e != null) goto _L4; else goto _L3
_L3:
        j = ((flag3) ? 1 : 0);
        if (e1 == com.c.a.a.b.e.c)
        {
            j = 1;
        }
        if (j == 0) goto _L6; else goto _L5
_L5:
        list = a.b;
        flag = flag5;
_L9:
        c1;
        JVM INSTR monitorexit ;
        if (list != null)
        {
            c1.b(list);
        } else
        if (!flag)
        {
            c1.d.b(c1.c);
        }
        if (!flag1) goto _L8; else goto _L7
_L7:
        c1.e();
        return;
_L6:
        c1.e = list;
        flag = c1.a();
        c1.notifyAll();
        list = obj;
          goto _L9
        list;
        c1;
        JVM INSTR monitorexit ;
        throw list;
_L4:
        j = ((flag4) ? 1 : 0);
        if (e1 == e.b)
        {
            j = 1;
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_436;
        }
        list = a.e;
        flag = flag5;
          goto _L9
        e1 = new ArrayList();
        e1.addAll(c1.e);
        e1.addAll(list);
        c1.e = e1;
        flag = flag5;
        list = obj;
          goto _L9
    }

    private (s s1)
    {
        c = s1;
        super("OkHttp %s", new Object[] {
            s.a(s1)
        });
    }

    (s s1, byte byte0)
    {
        this(s1);
    }
}
