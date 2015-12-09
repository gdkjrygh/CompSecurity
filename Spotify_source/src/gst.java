// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class gst
    implements Closeable
{

    private static final ExecutorService j;
    private static boolean w;
    public final Protocol a;
    final boolean b;
    long c;
    long d;
    public final gtp e;
    final gtp f;
    final gtt g;
    final Socket h;
    public final gss i;
    private final gtl k;
    private final Map l;
    private final String m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private final ExecutorService r;
    private final gto s;
    private boolean t;
    private gsv u;
    private final Set v;

    private gst(gsu gsu1)
    {
        l = new HashMap();
        q = System.nanoTime();
        c = 0L;
        e = new gtp();
        f = new gtp();
        t = false;
        v = new LinkedHashSet();
        a = gsu1.d;
        s = gsu1.e;
        b = gsu1.f;
        k = gsu1.c;
        int i1;
        if (gsu1.f)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        o = i1;
        if (gsu1.f && a == Protocol.d)
        {
            o = o + 2;
        }
        if (gsu1.f)
        {
            e.a(7, 0, 0x1000000);
        }
        m = gsu1.a;
        if (a == Protocol.d)
        {
            g = new gte();
            r = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), gsp.a(String.format("OkHttp %s Push Observer", new Object[] {
                m
            }), true));
            f.a(7, 0, 65535);
            f.a(5, 0, 16384);
        } else
        if (a == Protocol.c)
        {
            g = new gtq();
            r = null;
        } else
        {
            throw new AssertionError(a);
        }
        d = f.b();
        h = gsu1.b;
        i = g.a(hcq.a(hcq.a(gsu1.b)), b);
        u = new gsv(this, (byte)0);
        (new Thread(u)).start();
    }

    public gst(gsu gsu1, byte byte0)
    {
        this(gsu1);
    }

    static String a(gst gst1)
    {
        return gst1.m;
    }

    private void a(ErrorCode errorcode, ErrorCode errorcode1)
    {
        int i1;
        i1 = 0;
        if (!w && Thread.holdsLock(this))
        {
            throw new AssertionError();
        }
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        this;
        JVM INSTR monitorenter ;
        if (!p) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        obj;
        JVM INSTR monitorexit ;
        errorcode = null;
_L7:
        this;
        JVM INSTR monitorenter ;
        gsw agsw[];
        if (l.isEmpty())
        {
            break MISSING_BLOCK_LABEL_259;
        }
        agsw = (gsw[])l.values().toArray(new gsw[l.size()]);
        l.clear();
        a(false);
_L10:
        this;
        JVM INSTR monitorexit ;
        obj = errorcode;
        if (agsw == null) goto _L4; else goto _L3
_L3:
        int j1 = agsw.length;
_L6:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = agsw[i1];
        ((gsw) (obj)).a(errorcode1);
        obj = errorcode;
_L8:
        i1++;
        errorcode = ((ErrorCode) (obj));
        if (true) goto _L6; else goto _L5
_L2:
        p = true;
        j1 = n;
        this;
        JVM INSTR monitorexit ;
        i.a(j1, errorcode, gsp.a);
        obj;
        JVM INSTR monitorexit ;
        errorcode = null;
          goto _L7
        errorcode;
        this;
        JVM INSTR monitorexit ;
        throw errorcode;
        errorcode;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw errorcode;
        }
        // Misplaced declaration of an exception variable
        catch (ErrorCode errorcode) { }
          goto _L7
        errorcode;
        this;
        JVM INSTR monitorexit ;
        throw errorcode;
        IOException ioexception;
        ioexception;
        obj = errorcode;
        if (errorcode != null)
        {
            obj = ioexception;
        }
          goto _L8
_L5:
        obj = errorcode;
_L4:
        i.close();
        errorcode = ((ErrorCode) (obj));
_L9:
        try
        {
            h.close();
        }
        // Misplaced declaration of an exception variable
        catch (ErrorCode errorcode) { }
        if (errorcode != null)
        {
            throw errorcode;
        } else
        {
            return;
        }
        errorcode;
        if (obj != null)
        {
            errorcode = ((ErrorCode) (obj));
        }
          goto _L9
        agsw = null;
          goto _L10
    }

    static void a(gst gst1, int i1, int j1)
    {
        j.execute(gst1. new gsh("OkHttp %s ping %08x%08x", new Object[] {
            gst1.m, Integer.valueOf(i1), Integer.valueOf(j1)
        }, i1, j1) {

            private boolean a;
            private int b;
            private int c;
            private gst d;

            public final void b()
            {
                try
                {
                    gst.a(d, a, b, c);
                    return;
                }
                catch (IOException ioexception)
                {
                    return;
                }
            }

            transient 
            {
                d = gst.this;
                a = true;
                b = i1;
                c = j1;
                super(s1, aobj);
            }
        });
    }

    static void a(gst gst1, int i1, hcj hcj1, int j1)
    {
        hch hch1 = new hch();
        hcj1.a(j1);
        hcj1.a(hch1, j1);
        if (hch1.b != (long)j1)
        {
            throw new IOException((new StringBuilder()).append(hch1.b).append(" != ").append(j1).toString());
        } else
        {
            gst1.r.execute(gst1. new gsh("OkHttp %s Push Data[%s]", new Object[] {
                gst1.m, Integer.valueOf(i1)
            }, i1, hch1, j1) {

                private int a;
                private hch b;
                private int c;
                private gst d;

                public final void b()
                {
                    gst.k(d).a(b, c);
                    d.i.a(a, ErrorCode.h);
                    synchronized (d)
                    {
                        gst.l(d).remove(Integer.valueOf(a));
                    }
                    return;
                    exception;
                    gst2;
                    JVM INSTR monitorexit ;
                    try
                    {
                        throw exception;
                    }
                    catch (IOException ioexception)
                    {
                        return;
                    }
                }

            transient 
            {
                d = gst.this;
                a = i1;
                b = hch1;
                c = j1;
                super(s1, aobj);
            }
            });
            return;
        }
    }

    static void a(gst gst1, ErrorCode errorcode, ErrorCode errorcode1)
    {
        gst1.a(errorcode, errorcode1);
    }

    static void a(gst gst1, boolean flag, int i1, int j1)
    {
        synchronized (gst1.i)
        {
            gst1.i.a(flag, i1, j1);
        }
        return;
        gst1;
        gss1;
        JVM INSTR monitorexit ;
        throw gst1;
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
        q = l1;
        this;
        JVM INSTR monitorexit ;
        return;
        l1 = 0x7fffffffffffffffL;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    static boolean a(gst gst1, int i1)
    {
        return gst1.a == Protocol.d && i1 != 0 && (i1 & 1) == 0;
    }

    static void b(gst gst1, int i1)
    {
        gst1.r.execute(gst1. new gsh("OkHttp %s Push Headers[%s]", new Object[] {
            gst1.m, Integer.valueOf(i1)
        }, i1) {

            private int a;
            private gst b;

            public final void b()
            {
                gst.k(b).b();
                b.i.a(a, ErrorCode.h);
                synchronized (b)
                {
                    gst.l(b).remove(Integer.valueOf(a));
                }
                return;
                exception;
                gst2;
                JVM INSTR monitorexit ;
                try
                {
                    throw exception;
                }
                catch (IOException ioexception)
                {
                    return;
                }
            }

            transient 
            {
                b = gst.this;
                a = i1;
                super(s1, aobj);
            }
        });
    }

    static boolean b(gst gst1)
    {
        return gst1.p;
    }

    static int c(gst gst1)
    {
        return gst1.n;
    }

    static int c(gst gst1, int i1)
    {
        gst1.n = i1;
        return i1;
    }

    static int d(gst gst1)
    {
        return gst1.o;
    }

    static ExecutorService d()
    {
        return j;
    }

    static void d(gst gst1, int i1)
    {
        gst1.r.execute(gst1. new gsh("OkHttp %s Push Reset[%s]", new Object[] {
            gst1.m, Integer.valueOf(i1)
        }, i1) {

            private int a;
            private gst b;

            public final void b()
            {
                gst.k(b).c();
                synchronized (b)
                {
                    gst.l(b).remove(Integer.valueOf(a));
                }
                return;
                exception;
                gst2;
                JVM INSTR monitorexit ;
                throw exception;
            }

            transient 
            {
                b = gst.this;
                a = i1;
                super(s1, aobj);
            }
        });
    }

    private gtn e()
    {
        this;
        JVM INSTR monitorenter ;
        return null;
    }

    static Map e(gst gst1)
    {
        return gst1.l;
    }

    static void e(gst gst1, int i1)
    {
        gst1;
        JVM INSTR monitorenter ;
        if (!gst1.v.contains(Integer.valueOf(i1)))
        {
            break MISSING_BLOCK_LABEL_29;
        }
        gst1.a(i1, ErrorCode.b);
        gst1;
        JVM INSTR monitorexit ;
        return;
        gst1.v.add(Integer.valueOf(i1));
        gst1;
        JVM INSTR monitorexit ;
        gst1.r.execute(gst1. new gsh("OkHttp %s Push Request[%s]", new Object[] {
            gst1.m, Integer.valueOf(i1)
        }, i1) {

            private int a;
            private gst b;

            public final void b()
            {
                gst.k(b).a();
                b.i.a(a, ErrorCode.h);
                synchronized (b)
                {
                    gst.l(b).remove(Integer.valueOf(a));
                }
                return;
                exception1;
                gst2;
                JVM INSTR monitorexit ;
                try
                {
                    throw exception1;
                }
                catch (IOException ioexception)
                {
                    return;
                }
            }

            transient 
            {
                b = gst.this;
                a = i1;
                super(s1, aobj);
            }
        });
        return;
        Exception exception;
        exception;
        gst1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static gtl f(gst gst1)
    {
        return gst1.k;
    }

    static boolean g(gst gst1)
    {
        return gst1.t;
    }

    static boolean h(gst gst1)
    {
        gst1.t = true;
        return true;
    }

    static gtn i(gst gst1)
    {
        return gst1.e();
    }

    static boolean j(gst gst1)
    {
        gst1.p = true;
        return true;
    }

    static gto k(gst gst1)
    {
        return gst1.s;
    }

    static Set l(gst gst1)
    {
        return gst1.v;
    }

    final gsw a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        gsw gsw1 = (gsw)l.get(Integer.valueOf(i1));
        this;
        JVM INSTR monitorexit ;
        return gsw1;
        Exception exception;
        exception;
        throw exception;
    }

    public final gsw a(List list, boolean flag)
    {
        boolean flag1;
        flag1 = false;
        if (!flag)
        {
            flag1 = true;
        }
        gss gss1 = i;
        gss1;
        JVM INSTR monitorenter ;
        this;
        JVM INSTR monitorenter ;
        if (p)
        {
            throw new IOException("shutdown");
        }
        break MISSING_BLOCK_LABEL_47;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        list;
        gss1;
        JVM INSTR monitorexit ;
        throw list;
        gsw gsw1;
        int i1;
        i1 = o;
        o = o + 2;
        gsw1 = new gsw(i1, this, flag1, false, list);
        if (gsw1.a())
        {
            l.put(Integer.valueOf(i1), gsw1);
            a(false);
        }
        this;
        JVM INSTR monitorexit ;
        i.a(flag1, i1, list);
        gss1;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            i.b();
        }
        return gsw1;
    }

    final void a(int i1, long l1)
    {
        j.execute(new gsh("OkHttp Window Update %s stream %d", new Object[] {
            m, Integer.valueOf(i1)
        }, i1, l1) {

            private int a;
            private long b;
            private gst c;

            public final void b()
            {
                try
                {
                    c.i.a(a, b);
                    return;
                }
                catch (IOException ioexception)
                {
                    return;
                }
            }

            transient 
            {
                c = gst.this;
                a = i1;
                b = l1;
                super(s1, aobj);
            }
        });
    }

    final void a(int i1, ErrorCode errorcode)
    {
        j.submit(new gsh("OkHttp %s stream %d", new Object[] {
            m, Integer.valueOf(i1)
        }, i1, errorcode) {

            private int a;
            private ErrorCode b;
            private gst c;

            public final void b()
            {
                try
                {
                    c.b(a, b);
                    return;
                }
                catch (IOException ioexception)
                {
                    return;
                }
            }

            transient 
            {
                c = gst.this;
                a = i1;
                b = errorcode;
                super(s1, aobj);
            }
        });
    }

    public final void a(int i1, boolean flag, hch hch1, long l1)
    {
        long l2 = l1;
        if (l1 != 0L) goto _L2; else goto _L1
_L1:
        i.a(flag, i1, hch1, 0);
_L4:
        return;
_L6:
        int j1;
        j1 = Math.min((int)Math.min(l2, d), i.c());
        d = d - (long)j1;
        this;
        JVM INSTR monitorexit ;
        l2 -= j1;
        gss gss1 = i;
        boolean flag1;
        if (flag && l2 == 0L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        gss1.a(flag1, i1, hch1, j1);
_L2:
        if (l2 <= 0L) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorenter ;
_L8:
        if (d > 0L) goto _L6; else goto _L5
_L5:
        if (!l.containsKey(Integer.valueOf(i1)))
        {
            throw new IOException("stream closed");
        }
        break MISSING_BLOCK_LABEL_163;
        hch1;
        throw new InterruptedIOException();
        hch1;
        this;
        JVM INSTR monitorexit ;
        throw hch1;
        wait();
        if (true) goto _L8; else goto _L7
_L7:
          goto _L6
    }

    public final boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = q;
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
        long l1 = q;
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    final gsw b(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        gsw gsw1 = (gsw)l.remove(Integer.valueOf(i1));
        if (gsw1 == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (l.isEmpty())
        {
            a(true);
        }
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return gsw1;
        Exception exception;
        exception;
        throw exception;
    }

    final void b(int i1, ErrorCode errorcode)
    {
        i.a(i1, errorcode);
    }

    public final void c()
    {
        i.b();
    }

    public final void close()
    {
        a(ErrorCode.a, ErrorCode.h);
    }

    static 
    {
        boolean flag;
        if (!gst.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        w = flag;
        j = new ThreadPoolExecutor(0, 0x7fffffff, 60L, TimeUnit.SECONDS, new SynchronousQueue(), gsp.a("OkHttp FramedConnection", true));
    }
}
