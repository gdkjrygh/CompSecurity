// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import c.e;
import c.h;
import c.o;
import com.c.a.a.c;
import com.c.a.a.i;
import com.c.a.v;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.c.a.a.b:
//            q, g, D, r, 
//            C, n, c, v, 
//            y, z, a, w, 
//            x, u, t, i, 
//            o, b, B, e, 
//            A

public final class s
    implements Closeable
{
    public static final class a
    {

        String a;
        Socket b;
        com.c.a.a.b.i c;
        public v d;
        com.c.a.a.b.o e;
        boolean f;

        public a(String s1, Socket socket)
            throws IOException
        {
            c = i.a;
            d = v.c;
            e = o.a;
            a = s1;
            f = true;
            b = socket;
        }
    }

    final class b extends c
        implements b.a
    {

        com.c.a.a.b.b b;
        final s c;

        protected final void a()
        {
            Object obj;
            com.c.a.a.b.a a1;
            Object obj2;
            com.c.a.a.b.a a2;
            obj2 = com.c.a.a.b.a.g;
            a2 = com.c.a.a.b.a.g;
            a1 = ((com.c.a.a.b.a) (obj2));
            obj = obj2;
            b = c.g.a(c.o.a(c.o.b(c.h)), c.b);
            a1 = ((com.c.a.a.b.a) (obj2));
            obj = obj2;
            if (c.b)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            a1 = ((com.c.a.a.b.a) (obj2));
            obj = obj2;
            b.a();
_L2:
            a1 = ((com.c.a.a.b.a) (obj2));
            obj = obj2;
            if (b.a(this)) goto _L2; else goto _L1
_L1:
            a1 = ((com.c.a.a.b.a) (obj2));
            obj = obj2;
            obj2 = com.c.a.a.b.a.a;
            a1 = ((com.c.a.a.b.a) (obj2));
            obj = obj2;
            com.c.a.a.b.a a3 = com.c.a.a.b.a.l;
            IOException ioexception;
            Object obj1;
            try
            {
                s.a(c, ((com.c.a.a.b.a) (obj2)), a3);
            }
            catch (IOException ioexception1) { }
            com.c.a.a.i.a(b);
            return;
            obj;
            obj = a1;
            obj2 = com.c.a.a.b.a.b;
            obj = com.c.a.a.b.a.b;
            try
            {
                s.a(c, ((com.c.a.a.b.a) (obj2)), ((com.c.a.a.b.a) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception) { }
            com.c.a.a.i.a(b);
            return;
            obj1;
            obj2 = obj;
            obj = obj1;
_L4:
            try
            {
                s.a(c, ((com.c.a.a.b.a) (obj2)), a2);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            com.c.a.a.i.a(b);
            throw obj;
            obj;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final void a(int i1, long l1)
        {
            if (i1 == 0)
            {
                synchronized (c)
                {
                    s s2 = c;
                    s2.d = s2.d + l1;
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
            c1 = c.a(i1);
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            c1;
            JVM INSTR monitorenter ;
            c1.a(l1);
            c1;
            JVM INSTR monitorexit ;
            return;
            Exception exception1;
            exception1;
            c1;
            JVM INSTR monitorexit ;
            throw exception1;
        }

        public final void a(int i1, c.i j1)
        {
            j1 = j1.c;
            C ac[];
            synchronized (c)
            {
                ac = (C[])com.c.a.a.b.s.e(c).values().toArray(new C[com.c.a.a.b.s.e(c).size()]);
                com.c.a.a.b.s.i(c);
            }
            int l1 = ac.length;
            for (int k1 = 0; k1 < l1; k1++)
            {
                j1 = ac[k1];
                if (((C) (j1)).c > i1 && j1.b())
                {
                    j1.c(com.c.a.a.b.a.k);
                    c.b(((C) (j1)).c);
                }
            }

            break MISSING_BLOCK_LABEL_125;
            exception;
            j1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void a(int i1, com.c.a.a.b.a a1)
        {
            if (s.a(c, i1))
            {
                s.a(c, i1, a1);
            } else
            {
                C c1 = c.b(i1);
                if (c1 != null)
                {
                    c1.c(a1);
                    return;
                }
            }
        }

        public final void a(int i1, List list)
        {
            s.a(c, i1, list);
        }

        public final void a(boolean flag, int i1, int j1)
        {
            if (flag)
            {
                n n1 = com.c.a.a.b.s.c(c, i1);
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
                s.a(c, i1, j1);
                return;
            }
        }

        public final void a(boolean flag, int i1, h h1, int j1)
            throws IOException
        {
            if (s.a(c, i1))
            {
                s.a(c, i1, h1, j1, flag);
            } else
            {
                C c1 = c.a(i1);
                if (c1 == null)
                {
                    c.a(i1, com.c.a.a.b.a.c);
                    h1.f(j1);
                    return;
                }
                if (!com.c.a.a.b.C.i && Thread.holdsLock(c1))
                {
                    throw new AssertionError();
                }
                c1.f.a(h1, j1);
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
            int j1 = c.f.b();
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
            int i1 = 0;
_L5:
            if (i1 >= 10)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            if (q1.a(i1))
            {
                q3.a(i1, q1.b(i1), q1.d[i1]);
            }
            break MISSING_BLOCK_LABEL_362;
            if (c.a == v.d)
            {
                s.d().execute(new B(this, "OkHttp %s ACK Settings", new Object[] {
                    s.a(c)
                }, q1));
            }
            i1 = c.f.b();
            long l1;
            if (i1 == -1 || i1 == j1)
            {
                break MISSING_BLOCK_LABEL_354;
            }
            l1 = i1 - j1;
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
            if (com.c.a.a.b.s.e(c).isEmpty()) goto _L2; else goto _L1
_L1:
            q1 = (C[])com.c.a.a.b.s.e(c).values().toArray(new C[com.c.a.a.b.s.e(c).size()]);
_L3:
            s1;
            JVM INSTR monitorexit ;
            if (q1 != null && l1 != 0L)
            {
                int k1 = q1.length;
                for (i1 = 0; i1 < k1; i1++)
                {
                    synchronized (q1[i1])
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
            i1++;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void a(boolean flag, boolean flag1, int i1, List list, com.c.a.a.b.e e1)
        {
            boolean flag2;
            boolean flag3;
            boolean flag4;
            boolean flag5;
            flag3 = false;
            flag4 = false;
            flag2 = false;
            flag5 = true;
            if (!s.a(c, i1)) goto _L2; else goto _L1
_L1:
            s.a(c, i1, list, flag1);
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
            C c1 = c.a(i1);
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
            c.a(i1, com.c.a.a.b.a.c);
            s1;
            JVM INSTR monitorexit ;
            return;
            if (i1 > com.c.a.a.b.s.c(c))
            {
                break MISSING_BLOCK_LABEL_135;
            }
            s1;
            JVM INSTR monitorexit ;
            return;
            if (i1 % 2 != s.d(c) % 2)
            {
                break MISSING_BLOCK_LABEL_154;
            }
            s1;
            JVM INSTR monitorexit ;
            return;
            list = new C(i1, c, flag, flag1, list);
            s.b(c, i1);
            com.c.a.a.b.s.e(c).put(Integer.valueOf(i1), list);
            s.d().execute(new A(this, "OkHttp %s stream %d", new Object[] {
                s.a(c), Integer.valueOf(i1)
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
                c1.b(com.c.a.a.b.a.b);
                c.b(i1);
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
            i1 = ((flag3) ? 1 : 0);
            if (e1 == com.c.a.a.b.e.c)
            {
                i1 = 1;
            }
            if (i1 == 0) goto _L6; else goto _L5
_L5:
            list = com.c.a.a.b.a.b;
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
            i1 = ((flag4) ? 1 : 0);
            if (e1 == e.b)
            {
                i1 = 1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_436;
            }
            list = com.c.a.a.b.a.e;
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

        private b()
        {
            c = s.this;
            super("OkHttp %s", new Object[] {
                s.a(s.this)
            });
        }

        b(byte byte0)
        {
            this();
        }
    }


    static final boolean k;
    private static final ExecutorService l;
    public final v a;
    final boolean b;
    long c;
    long d;
    public final q e;
    final q f;
    final D g;
    final Socket h;
    public final com.c.a.a.b.c i;
    final b j;
    private final com.c.a.a.b.i m;
    private final Map n;
    private final String o;
    private int p;
    private int q;
    private boolean r;
    private long s;
    private final ExecutorService t;
    private Map u;
    private final com.c.a.a.b.o v;
    private int w;
    private boolean x;
    private final Set y;

    private s(a a1)
        throws IOException
    {
        byte byte0 = 2;
        super();
        n = new HashMap();
        s = System.nanoTime();
        c = 0L;
        e = new q();
        f = new q();
        x = false;
        y = new LinkedHashSet();
        a = a1.d;
        v = a1.e;
        b = a1.f;
        m = a1.c;
        int i1;
        if (a1.f)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        q = i1;
        if (a1.f && a == v.d)
        {
            q = q + 2;
        }
        i1 = byte0;
        if (a1.f)
        {
            i1 = 1;
        }
        w = i1;
        if (a1.f)
        {
            e.a(7, 0, 0x1000000);
        }
        o = a1.a;
        if (a == v.d)
        {
            g = new g();
            t = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.c.a.a.i.b(String.format("OkHttp %s Push Observer", new Object[] {
                o
            })));
            f.a(7, 0, 65535);
            f.a(5, 0, 16384);
        } else
        if (a == v.c)
        {
            g = new r();
            t = null;
        } else
        {
            throw new AssertionError(a);
        }
        d = f.b();
        h = a1.b;
        i = g.a(c.o.a(c.o.a(a1.b)), b);
        j = new b((byte)0);
        (new Thread(j)).start();
    }

    public s(a a1, byte byte0)
        throws IOException
    {
        this(a1);
    }

    static String a(s s1)
    {
        return s1.o;
    }

    private void a(com.c.a.a.b.a a1, com.c.a.a.b.a a2)
        throws IOException
    {
        if (!k && Thread.holdsLock(this))
        {
            throw new AssertionError();
        }
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        this;
        JVM INSTR monitorenter ;
        if (!r) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        obj;
        JVM INSTR monitorexit ;
        a1 = null;
_L9:
        this;
        JVM INSTR monitorenter ;
        C ac[];
        if (n.isEmpty())
        {
            break MISSING_BLOCK_LABEL_390;
        }
        ac = (C[])n.values().toArray(new C[n.size()]);
        n.clear();
        a(false);
_L13:
        if (u == null) goto _L4; else goto _L3
_L3:
        n an[];
        an = (n[])u.values().toArray(new n[u.size()]);
        u = null;
_L12:
        this;
        JVM INSTR monitorexit ;
        obj = a1;
        if (ac == null) goto _L6; else goto _L5
_L5:
        int i1;
        int k1;
        k1 = ac.length;
        i1 = 0;
_L8:
        if (i1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ac[i1];
        ((C) (obj)).a(a2);
        obj = a1;
_L10:
        i1++;
        a1 = ((com.c.a.a.b.a) (obj));
        if (true) goto _L8; else goto _L7
_L2:
        r = true;
        i1 = p;
        this;
        JVM INSTR monitorexit ;
        i.a(i1, a1, i.a);
        obj;
        JVM INSTR monitorexit ;
        a1 = null;
          goto _L9
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
        a1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw a1;
        }
        // Misplaced declaration of an exception variable
        catch (com.c.a.a.b.a a1) { }
          goto _L9
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
        IOException ioexception;
        ioexception;
        obj = a1;
        if (a1 != null)
        {
            obj = ioexception;
        }
          goto _L10
_L7:
        obj = a1;
_L6:
        if (an != null)
        {
            int l1 = an.length;
            for (int j1 = 0; j1 < l1; j1++)
            {
                a1 = an[j1];
                if (((n) (a1)).c != -1L || ((n) (a1)).b == -1L)
                {
                    throw new IllegalStateException();
                }
                a1.c = ((n) (a1)).b - 1L;
                ((n) (a1)).a.countDown();
            }

        }
        i.close();
        a1 = ((com.c.a.a.b.a) (obj));
_L11:
        try
        {
            h.close();
        }
        // Misplaced declaration of an exception variable
        catch (com.c.a.a.b.a a1) { }
        if (a1 != null)
        {
            throw a1;
        } else
        {
            return;
        }
        a1;
        if (obj != null)
        {
            a1 = ((com.c.a.a.b.a) (obj));
        }
          goto _L11
_L4:
        an = null;
          goto _L12
        ac = null;
          goto _L13
    }

    static void a(s s1, int i1, int j1)
    {
        l.execute(new com.c.a.a.b.v(s1, "OkHttp %s ping %08x%08x", new Object[] {
            s1.o, Integer.valueOf(i1), Integer.valueOf(j1)
        }, i1, j1));
    }

    static void a(s s1, int i1, h h1, int j1, boolean flag)
        throws IOException
    {
        e e1 = new e();
        h1.a(j1);
        h1.a(e1, j1);
        if (e1.b != (long)j1)
        {
            throw new IOException((new StringBuilder()).append(e1.b).append(" != ").append(j1).toString());
        } else
        {
            s1.t.execute(new y(s1, "OkHttp %s Push Data[%s]", new Object[] {
                s1.o, Integer.valueOf(i1)
            }, i1, e1, j1, flag));
            return;
        }
    }

    static void a(s s1, int i1, com.c.a.a.b.a a1)
    {
        s1.t.execute(new z(s1, "OkHttp %s Push Reset[%s]", new Object[] {
            s1.o, Integer.valueOf(i1)
        }, i1, a1));
    }

    static void a(s s1, int i1, List list)
    {
        s1;
        JVM INSTR monitorenter ;
        if (!s1.y.contains(Integer.valueOf(i1)))
        {
            break MISSING_BLOCK_LABEL_29;
        }
        s1.a(i1, com.c.a.a.b.a.b);
        s1;
        JVM INSTR monitorexit ;
        return;
        s1.y.add(Integer.valueOf(i1));
        s1;
        JVM INSTR monitorexit ;
        s1.t.execute(new w(s1, "OkHttp %s Push Request[%s]", new Object[] {
            s1.o, Integer.valueOf(i1)
        }, i1, list));
        return;
        list;
        s1;
        JVM INSTR monitorexit ;
        throw list;
    }

    static void a(s s1, int i1, List list, boolean flag)
    {
        s1.t.execute(new x(s1, "OkHttp %s Push Headers[%s]", new Object[] {
            s1.o, Integer.valueOf(i1)
        }, i1, list, flag));
    }

    static void a(s s1, com.c.a.a.b.a a1, com.c.a.a.b.a a2)
        throws IOException
    {
        s1.a(a1, a2);
    }

    static void a(s s1, boolean flag, int i1, int j1, n n1)
        throws IOException
    {
        com.c.a.a.b.c c1 = s1.i;
        c1;
        JVM INSTR monitorenter ;
        if (n1 == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        if (n1.b != -1L)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_40;
        s1;
        c1;
        JVM INSTR monitorexit ;
        throw s1;
        n1.b = System.nanoTime();
        s1.i.a(flag, i1, j1);
        c1;
        JVM INSTR monitorexit ;
    }

    private void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        long l1 = System.nanoTime();
_L1:
        s = l1;
        this;
        JVM INSTR monitorexit ;
        return;
        l1 = 0x7fffffffffffffffL;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    static boolean a(s s1, int i1)
    {
        return s1.a == v.d && i1 != 0 && (i1 & 1) == 0;
    }

    static int b(s s1, int i1)
    {
        s1.p = i1;
        return i1;
    }

    static boolean b(s s1)
    {
        return s1.r;
    }

    static int c(s s1)
    {
        return s1.p;
    }

    private n c(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (u == null) goto _L2; else goto _L1
_L1:
        n n1 = (n)u.remove(Integer.valueOf(i1));
_L4:
        this;
        JVM INSTR monitorexit ;
        return n1;
_L2:
        n1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static n c(s s1, int i1)
    {
        return s1.c(i1);
    }

    static int d(s s1)
    {
        return s1.q;
    }

    static ExecutorService d()
    {
        return l;
    }

    static Map e(s s1)
    {
        return s1.n;
    }

    static com.c.a.a.b.i f(s s1)
    {
        return s1.m;
    }

    static boolean g(s s1)
    {
        return s1.x;
    }

    static boolean h(s s1)
    {
        s1.x = true;
        return true;
    }

    static boolean i(s s1)
    {
        s1.r = true;
        return true;
    }

    static com.c.a.a.b.o j(s s1)
    {
        return s1.v;
    }

    static Set k(s s1)
    {
        return s1.y;
    }

    final C a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        C c1 = (C)n.get(Integer.valueOf(i1));
        this;
        JVM INSTR monitorexit ;
        return c1;
        Exception exception;
        exception;
        throw exception;
    }

    public final C a(List list, boolean flag)
        throws IOException
    {
        boolean flag1;
        flag1 = false;
        if (!flag)
        {
            flag1 = true;
        }
        com.c.a.a.b.c c1 = i;
        c1;
        JVM INSTR monitorenter ;
        this;
        JVM INSTR monitorenter ;
        if (r)
        {
            throw new IOException("shutdown");
        }
        break MISSING_BLOCK_LABEL_47;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        list;
        c1;
        JVM INSTR monitorexit ;
        throw list;
        C c2;
        int i1;
        i1 = q;
        q = q + 2;
        c2 = new C(i1, this, flag1, false, list);
        if (c2.a())
        {
            n.put(Integer.valueOf(i1), c2);
            a(false);
        }
        this;
        JVM INSTR monitorexit ;
        i.a(flag1, i1, list);
        c1;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            i.b();
        }
        return c2;
    }

    final void a(int i1, long l1)
    {
        l.execute(new u(this, "OkHttp Window Update %s stream %d", new Object[] {
            o, Integer.valueOf(i1)
        }, i1, l1));
    }

    final void a(int i1, com.c.a.a.b.a a1)
    {
        l.submit(new t(this, "OkHttp %s stream %d", new Object[] {
            o, Integer.valueOf(i1)
        }, i1, a1));
    }

    public final void a(int i1, boolean flag, e e1, long l1)
        throws IOException
    {
        long l2 = l1;
        if (l1 != 0L) goto _L2; else goto _L1
_L1:
        i.a(flag, i1, e1, 0);
_L4:
        return;
_L5:
        int j1;
        j1 = Math.min((int)Math.min(l2, d), i.c());
        d = d - (long)j1;
        this;
        JVM INSTR monitorexit ;
        l2 -= j1;
        com.c.a.a.b.c c1 = i;
        boolean flag1;
        if (flag && l2 == 0L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        c1.a(flag1, i1, e1, j1);
_L2:
        if (l2 <= 0L) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorenter ;
        while (d <= 0L) 
        {
            wait();
        }
          goto _L5
        e1;
        throw new InterruptedIOException();
        e1;
        this;
        JVM INSTR monitorexit ;
        throw e1;
    }

    public final boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = s;
        boolean flag;
        if (l1 != 0x7fffffffffffffffL)
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

    public final long b()
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = s;
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    final C b(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        C c1 = (C)n.remove(Integer.valueOf(i1));
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (n.isEmpty())
        {
            a(true);
        }
        this;
        JVM INSTR monitorexit ;
        return c1;
        Exception exception;
        exception;
        throw exception;
    }

    final void b(int i1, com.c.a.a.b.a a1)
        throws IOException
    {
        i.a(i1, a1);
    }

    public final void c()
        throws IOException
    {
        i.b();
    }

    public final void close()
        throws IOException
    {
        a(com.c.a.a.b.a.a, com.c.a.a.b.a.l);
    }

    static 
    {
        boolean flag;
        if (!com/c/a/a/b/s.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
        l = new ThreadPoolExecutor(0, 0x7fffffff, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.c.a.a.i.b("OkHttp SpdyConnection"));
    }
}
