// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.d;
import com.squareup.okhttp.internal.f;
import com.squareup.okhttp.internal.k;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;
import okio.e;
import okio.l;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            m, g, o, n, 
//            d, k, b, ErrorCode, 
//            i, l, HeadersMode, a

public final class c
    implements Closeable
{
    public static final class a
    {

        String a;
        Socket b;
        i c;
        public Protocol d;
        com.squareup.okhttp.internal.framed.l e;
        boolean f;

        public a(String s1, Socket socket)
            throws IOException
        {
            c = i.a;
            d = Protocol.c;
            e = l.a;
            a = s1;
            f = true;
            b = socket;
        }
    }

    final class b extends f
        implements a.a
    {

        com.squareup.okhttp.internal.framed.a a;
        final c c;

        public final void a(int i1, long l1)
        {
            if (i1 == 0)
            {
                synchronized (c)
                {
                    c c2 = c;
                    c2.d = c2.d + l1;
                    c.notifyAll();
                }
                return;
            }
            break MISSING_BLOCK_LABEL_50;
            exception;
            c1;
            JVM INSTR monitorexit ;
            throw exception;
            com.squareup.okhttp.internal.framed.d d1;
            d1 = c.a(i1);
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            d1;
            JVM INSTR monitorenter ;
            d1.a(l1);
            d1;
            JVM INSTR monitorexit ;
            return;
            Exception exception1;
            exception1;
            d1;
            JVM INSTR monitorexit ;
            throw exception1;
        }

        public final void a(int i1, ErrorCode errorcode)
        {
            if (c.a(c, i1))
            {
                c.a(c, i1, errorcode);
            } else
            {
                com.squareup.okhttp.internal.framed.d d1 = c.b(i1);
                if (d1 != null)
                {
                    d1.c(errorcode);
                    return;
                }
            }
        }

        public final void a(int i1, List list)
        {
            c.a(c, i1, list);
        }

        public final void a(int i1, ByteString bytestring)
        {
            bytestring = bytestring.c;
            com.squareup.okhttp.internal.framed.d ad[];
            synchronized (c)
            {
                ad = (com.squareup.okhttp.internal.framed.d[])com.squareup.okhttp.internal.framed.c.e(c).values().toArray(new com.squareup.okhttp.internal.framed.d[com.squareup.okhttp.internal.framed.c.e(c).size()]);
                c.i(c);
            }
            int k1 = ad.length;
            for (int j1 = 0; j1 < k1; j1++)
            {
                bytestring = ad[j1];
                if (((com.squareup.okhttp.internal.framed.d) (bytestring)).c > i1 && bytestring.b())
                {
                    bytestring.c(com.squareup.okhttp.internal.framed.ErrorCode.k);
                    c.b(((com.squareup.okhttp.internal.framed.d) (bytestring)).c);
                }
            }

            break MISSING_BLOCK_LABEL_125;
            exception;
            bytestring;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void a(boolean flag, int i1, int j1)
        {
            if (flag)
            {
                com.squareup.okhttp.internal.framed.k k1 = c.c(c, i1);
                if (k1 != null)
                {
                    if (k1.c != -1L || k1.b == -1L)
                    {
                        throw new IllegalStateException();
                    }
                    k1.c = System.nanoTime();
                    k1.a.countDown();
                }
                return;
            } else
            {
                c.a(c, i1, j1);
                return;
            }
        }

        public final void a(boolean flag, int i1, e e1, int j1)
            throws IOException
        {
            if (c.a(c, i1))
            {
                c.a(c, i1, e1, j1, flag);
            } else
            {
                com.squareup.okhttp.internal.framed.d d1 = c.a(i1);
                if (d1 == null)
                {
                    c.a(i1, ErrorCode.c);
                    e1.f(j1);
                    return;
                }
                if (!d.i && Thread.holdsLock(d1))
                {
                    throw new AssertionError();
                }
                d1.f.a(e1, j1);
                if (flag)
                {
                    d1.e();
                    return;
                }
            }
        }

        public final void a(boolean flag, m m1)
        {
            c1 = c;
            c1;
            JVM INSTR monitorenter ;
            int j1 = c.f.b();
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            m m2 = c.f;
            m2.c = 0;
            m2.b = 0;
            m2.a = 0;
            Arrays.fill(m2.d, 0);
            m m3 = c.f;
            int i1 = 0;
_L5:
            if (i1 >= 10)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            if (m1.a(i1))
            {
                m3.a(i1, m1.b(i1), m1.d[i1]);
            }
            break MISSING_BLOCK_LABEL_361;
            if (c.a == Protocol.d)
            {
                com.squareup.okhttp.internal.framed.c.d().execute(new f(this, "OkHttp %s ACK Settings", new Object[] {
                    c.a(c)
                }, m1) {

                    final m a;
                    final b c;

                    public final void b()
                    {
                        try
                        {
                            c.c.i.a(a);
                            return;
                        }
                        catch (IOException ioexception)
                        {
                            return;
                        }
                    }

            transient 
            {
                c = b1;
                a = m1;
                super(s1, aobj);
            }
                });
            }
            i1 = c.f.b();
            long l1;
            if (i1 == -1 || i1 == j1)
            {
                break MISSING_BLOCK_LABEL_353;
            }
            l1 = i1 - j1;
            if (c.g(c))
            {
                break MISSING_BLOCK_LABEL_235;
            }
            m1 = c;
            m1.d = ((c) (m1)).d + l1;
            if (l1 <= 0L)
            {
                break MISSING_BLOCK_LABEL_227;
            }
            m1.notifyAll();
            c.h(c);
            if (com.squareup.okhttp.internal.framed.c.e(c).isEmpty()) goto _L2; else goto _L1
_L1:
            m1 = (com.squareup.okhttp.internal.framed.d[])com.squareup.okhttp.internal.framed.c.e(c).values().toArray(new com.squareup.okhttp.internal.framed.d[com.squareup.okhttp.internal.framed.c.e(c).size()]);
_L3:
            c1;
            JVM INSTR monitorexit ;
            if (m1 != null && l1 != 0L)
            {
                int k1 = m1.length;
                for (i1 = 0; i1 < k1; i1++)
                {
                    synchronized (m1[i1])
                    {
                        c1.a(l1);
                    }
                }

            }
            break MISSING_BLOCK_LABEL_347;
            m1;
            c1;
            JVM INSTR monitorexit ;
            throw m1;
            m1;
            c1;
            JVM INSTR monitorexit ;
            throw m1;
            return;
_L2:
            m1 = null;
              goto _L3
            m1 = null;
            l1 = 0L;
              goto _L3
            i1++;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void a(boolean flag, boolean flag1, int i1, List list, HeadersMode headersmode)
        {
            boolean flag2;
            boolean flag3;
            boolean flag4;
            boolean flag5;
            flag3 = false;
            flag4 = false;
            flag2 = false;
            flag5 = true;
            if (!c.a(c, i1)) goto _L2; else goto _L1
_L1:
            c.a(c, i1, list, flag1);
_L8:
            return;
_L2:
            synchronized (c)
            {
                if (!c.b(c))
                {
                    break MISSING_BLOCK_LABEL_66;
                }
            }
            return;
            list;
            c1;
            JVM INSTR monitorexit ;
            throw list;
            com.squareup.okhttp.internal.framed.d d1 = c.a(i1);
            if (d1 != null)
            {
                break MISSING_BLOCK_LABEL_246;
            }
            Object obj;
            if (headersmode == HeadersMode.b || headersmode == HeadersMode.c)
            {
                flag2 = true;
            }
            if (!flag2)
            {
                break MISSING_BLOCK_LABEL_120;
            }
            c.a(i1, ErrorCode.c);
            c1;
            JVM INSTR monitorexit ;
            return;
            if (i1 > c.c(c))
            {
                break MISSING_BLOCK_LABEL_135;
            }
            c1;
            JVM INSTR monitorexit ;
            return;
            if (i1 % 2 != com.squareup.okhttp.internal.framed.c.d(c) % 2)
            {
                break MISSING_BLOCK_LABEL_154;
            }
            c1;
            JVM INSTR monitorexit ;
            return;
            list = new com.squareup.okhttp.internal.framed.d(i1, c, flag, flag1, list);
            c.b(c, i1);
            com.squareup.okhttp.internal.framed.c.e(c).put(Integer.valueOf(i1), list);
            com.squareup.okhttp.internal.framed.c.d().execute(new f(this, "OkHttp %s stream %d", new Object[] {
                c.a(c), Integer.valueOf(i1)
            }, list) {

                final com.squareup.okhttp.internal.framed.d a;
                final b c;

                public final void b()
                {
                    try
                    {
                        com.squareup.okhttp.internal.framed.c.f(c.c).a(a);
                        return;
                    }
                    catch (IOException ioexception)
                    {
                        d.a.log(Level.INFO, (new StringBuilder("StreamHandler failure for ")).append(c.a(c.c)).toString(), ioexception);
                    }
                    try
                    {
                        a.a(ErrorCode.b);
                        return;
                    }
                    catch (IOException ioexception1)
                    {
                        return;
                    }
                }

            transient 
            {
                c = b1;
                a = d1;
                super(s1, aobj);
            }
            });
            c1;
            JVM INSTR monitorexit ;
            return;
            c1;
            JVM INSTR monitorexit ;
            if (headersmode == HeadersMode.a)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag2)
            {
                d1.b(ErrorCode.b);
                c.b(i1);
                return;
            }
            if (!d.i && Thread.holdsLock(d1))
            {
                throw new AssertionError();
            }
            obj = null;
            d1;
            JVM INSTR monitorenter ;
            if (d1.e != null) goto _L4; else goto _L3
_L3:
            i1 = ((flag3) ? 1 : 0);
            if (headersmode == HeadersMode.c)
            {
                i1 = 1;
            }
            if (i1 == 0) goto _L6; else goto _L5
_L5:
            list = ErrorCode.b;
            flag = flag5;
_L9:
            d1;
            JVM INSTR monitorexit ;
            if (list != null)
            {
                d1.b(list);
            } else
            if (!flag)
            {
                d1.d.b(d1.c);
            }
            if (!flag1) goto _L8; else goto _L7
_L7:
            d1.e();
            return;
_L6:
            d1.e = list;
            flag = d1.a();
            d1.notifyAll();
            list = obj;
              goto _L9
            list;
            d1;
            JVM INSTR monitorexit ;
            throw list;
_L4:
            i1 = ((flag4) ? 1 : 0);
            if (headersmode == HeadersMode.b)
            {
                i1 = 1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_436;
            }
            list = com.squareup.okhttp.internal.framed.ErrorCode.e;
            flag = flag5;
              goto _L9
            headersmode = new ArrayList();
            headersmode.addAll(d1.e);
            headersmode.addAll(list);
            d1.e = headersmode;
            flag = flag5;
            list = obj;
              goto _L9
        }

        protected final void b()
        {
            Object obj;
            ErrorCode errorcode;
            Object obj2;
            ErrorCode errorcode1;
            obj2 = ErrorCode.g;
            errorcode1 = ErrorCode.g;
            errorcode = ((ErrorCode) (obj2));
            obj = obj2;
            a = c.g.a(okio.l.a(okio.l.b(c.h)), c.b);
            errorcode = ((ErrorCode) (obj2));
            obj = obj2;
            if (c.b)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            errorcode = ((ErrorCode) (obj2));
            obj = obj2;
            a.a();
_L2:
            errorcode = ((ErrorCode) (obj2));
            obj = obj2;
            if (a.a(this)) goto _L2; else goto _L1
_L1:
            errorcode = ((ErrorCode) (obj2));
            obj = obj2;
            obj2 = ErrorCode.a;
            errorcode = ((ErrorCode) (obj2));
            obj = obj2;
            ErrorCode errorcode2 = com.squareup.okhttp.internal.framed.ErrorCode.l;
            IOException ioexception;
            Object obj1;
            try
            {
                c.a(c, ((ErrorCode) (obj2)), errorcode2);
            }
            catch (IOException ioexception1) { }
            com.squareup.okhttp.internal.k.a(a);
            return;
            obj;
            obj = errorcode;
            obj2 = ErrorCode.b;
            obj = ErrorCode.b;
            try
            {
                c.a(c, ((ErrorCode) (obj2)), ((ErrorCode) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception) { }
            com.squareup.okhttp.internal.k.a(a);
            return;
            obj1;
            obj2 = obj;
            obj = obj1;
_L4:
            try
            {
                c.a(c, ((ErrorCode) (obj2)), errorcode1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            com.squareup.okhttp.internal.k.a(a);
            throw obj;
            obj;
            if (true) goto _L4; else goto _L3
_L3:
        }

        private b()
        {
            c = c.this;
            super("OkHttp %s", new Object[] {
                c.a(c.this)
            });
        }

        b(byte byte0)
        {
            this();
        }
    }


    static final boolean k;
    private static final ExecutorService l;
    public final Protocol a;
    final boolean b;
    long c;
    long d;
    public final m e;
    final m f;
    final o g;
    final Socket h;
    public final com.squareup.okhttp.internal.framed.b i;
    final b j;
    private final i m;
    private final Map n;
    private final String o;
    private int p;
    private int q;
    private boolean r;
    private long s;
    private final ExecutorService t;
    private Map u;
    private final com.squareup.okhttp.internal.framed.l v;
    private int w;
    private boolean x;
    private final Set y;

    private c(a a1)
        throws IOException
    {
        byte byte0 = 2;
        super();
        n = new HashMap();
        s = System.nanoTime();
        c = 0L;
        e = new m();
        f = new m();
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
        if (a1.f && a == Protocol.d)
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
        if (a == Protocol.d)
        {
            g = new g();
            t = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.squareup.okhttp.internal.k.a(String.format("OkHttp %s Push Observer", new Object[] {
                o
            }), true));
            f.a(7, 0, 65535);
            f.a(5, 0, 16384);
        } else
        if (a == Protocol.c)
        {
            g = new n();
            t = null;
        } else
        {
            throw new AssertionError(a);
        }
        d = f.b();
        h = a1.b;
        i = g.a(okio.l.a(okio.l.a(a1.b)), b);
        j = new b((byte)0);
        (new Thread(j)).start();
    }

    public c(a a1, byte byte0)
        throws IOException
    {
        this(a1);
    }

    static String a(c c1)
    {
        return c1.o;
    }

    private void a(ErrorCode errorcode, ErrorCode errorcode1)
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
        errorcode = null;
_L9:
        this;
        JVM INSTR monitorenter ;
        com.squareup.okhttp.internal.framed.d ad[];
        if (n.isEmpty())
        {
            break MISSING_BLOCK_LABEL_390;
        }
        ad = (com.squareup.okhttp.internal.framed.d[])n.values().toArray(new com.squareup.okhttp.internal.framed.d[n.size()]);
        n.clear();
        a(false);
_L13:
        if (u == null) goto _L4; else goto _L3
_L3:
        com.squareup.okhttp.internal.framed.k ak[];
        ak = (com.squareup.okhttp.internal.framed.k[])u.values().toArray(new com.squareup.okhttp.internal.framed.k[u.size()]);
        u = null;
_L12:
        this;
        JVM INSTR monitorexit ;
        obj = errorcode;
        if (ad == null) goto _L6; else goto _L5
_L5:
        int i1;
        int k1;
        k1 = ad.length;
        i1 = 0;
_L8:
        if (i1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ad[i1];
        ((com.squareup.okhttp.internal.framed.d) (obj)).a(errorcode1);
        obj = errorcode;
_L10:
        i1++;
        errorcode = ((ErrorCode) (obj));
        if (true) goto _L8; else goto _L7
_L2:
        r = true;
        i1 = p;
        this;
        JVM INSTR monitorexit ;
        i.a(i1, errorcode, k.a);
        obj;
        JVM INSTR monitorexit ;
        errorcode = null;
          goto _L9
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
          goto _L9
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
          goto _L10
_L7:
        obj = errorcode;
_L6:
        if (ak != null)
        {
            int l1 = ak.length;
            for (int j1 = 0; j1 < l1; j1++)
            {
                errorcode = ak[j1];
                if (((com.squareup.okhttp.internal.framed.k) (errorcode)).c != -1L || ((com.squareup.okhttp.internal.framed.k) (errorcode)).b == -1L)
                {
                    throw new IllegalStateException();
                }
                errorcode.c = ((com.squareup.okhttp.internal.framed.k) (errorcode)).b - 1L;
                ((com.squareup.okhttp.internal.framed.k) (errorcode)).a.countDown();
            }

        }
        i.close();
        errorcode = ((ErrorCode) (obj));
_L11:
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
          goto _L11
_L4:
        ak = null;
          goto _L12
        ad = null;
          goto _L13
    }

    static void a(c c1, int i1, int j1)
    {
        l.execute(c1. new f("OkHttp %s ping %08x%08x", new Object[] {
            c1.o, Integer.valueOf(i1), Integer.valueOf(j1)
        }, i1, j1) {

            final boolean a = true;
            final int c;
            final int d;
            final com.squareup.okhttp.internal.framed.k e = null;
            final c f;

            public final void b()
            {
                try
                {
                    c.a(f, a, c, d, e);
                    return;
                }
                catch (IOException ioexception)
                {
                    return;
                }
            }

            transient 
            {
                f = c.this;
                c = i1;
                d = j1;
                super(s1, aobj);
            }
        });
    }

    static void a(c c1, int i1, ErrorCode errorcode)
    {
        c1.t.execute(c1. new f("OkHttp %s Push Reset[%s]", new Object[] {
            c1.o, Integer.valueOf(i1)
        }, i1, errorcode) {

            final int a;
            final ErrorCode c;
            final c d;

            public final void b()
            {
                c.j(d).c();
                synchronized (d)
                {
                    com.squareup.okhttp.internal.framed.c.k(d).remove(Integer.valueOf(a));
                }
                return;
                exception;
                c2;
                JVM INSTR monitorexit ;
                throw exception;
            }

            transient 
            {
                d = c.this;
                a = i1;
                c = errorcode;
                super(s1, aobj);
            }
        });
    }

    static void a(c c1, int i1, List list)
    {
        c1;
        JVM INSTR monitorenter ;
        if (!c1.y.contains(Integer.valueOf(i1)))
        {
            break MISSING_BLOCK_LABEL_29;
        }
        c1.a(i1, ErrorCode.b);
        c1;
        JVM INSTR monitorexit ;
        return;
        c1.y.add(Integer.valueOf(i1));
        c1;
        JVM INSTR monitorexit ;
        c1.t.execute(c1. new f("OkHttp %s Push Request[%s]", new Object[] {
            c1.o, Integer.valueOf(i1)
        }, i1, list) {

            final int a;
            final List c;
            final c d;

            public final void b()
            {
                c.j(d).a();
                d.i.a(a, com.squareup.okhttp.internal.framed.ErrorCode.l);
                synchronized (d)
                {
                    com.squareup.okhttp.internal.framed.c.k(d).remove(Integer.valueOf(a));
                }
                return;
                exception;
                c2;
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
                d = c.this;
                a = i1;
                c = list;
                super(s1, aobj);
            }
        });
        return;
        list;
        c1;
        JVM INSTR monitorexit ;
        throw list;
    }

    static void a(c c1, int i1, List list, boolean flag)
    {
        c1.t.execute(c1. new f("OkHttp %s Push Headers[%s]", new Object[] {
            c1.o, Integer.valueOf(i1)
        }, i1, list, flag) {

            final int a;
            final List c;
            final boolean d;
            final c e;

            public final void b()
            {
                c.j(e).b();
                e.i.a(a, com.squareup.okhttp.internal.framed.ErrorCode.l);
                synchronized (e)
                {
                    com.squareup.okhttp.internal.framed.c.k(e).remove(Integer.valueOf(a));
                }
                return;
                exception;
                c2;
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
                e = c.this;
                a = i1;
                c = list;
                d = flag;
                super(s1, aobj);
            }
        });
    }

    static void a(c c1, int i1, e e1, int j1, boolean flag)
        throws IOException
    {
        okio.c c2 = new okio.c();
        e1.a(j1);
        e1.a(c2, j1);
        if (c2.b != (long)j1)
        {
            throw new IOException((new StringBuilder()).append(c2.b).append(" != ").append(j1).toString());
        } else
        {
            c1.t.execute(c1. new f("OkHttp %s Push Data[%s]", new Object[] {
                c1.o, Integer.valueOf(i1)
            }, i1, c2, j1, flag) {

                final int a;
                final okio.c c;
                final int d;
                final boolean e;
                final c f;

                public final void b()
                {
                    c.j(f).a(c, d);
                    f.i.a(a, com.squareup.okhttp.internal.framed.ErrorCode.l);
                    synchronized (f)
                    {
                        com.squareup.okhttp.internal.framed.c.k(f).remove(Integer.valueOf(a));
                    }
                    return;
                    exception;
                    c3;
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
                f = c.this;
                a = i1;
                c = c2;
                d = j1;
                e = flag;
                super(s1, aobj);
            }
            });
            return;
        }
    }

    static void a(c c1, ErrorCode errorcode, ErrorCode errorcode1)
        throws IOException
    {
        c1.a(errorcode, errorcode1);
    }

    static void a(c c1, boolean flag, int i1, int j1, com.squareup.okhttp.internal.framed.k k1)
        throws IOException
    {
        com.squareup.okhttp.internal.framed.b b1 = c1.i;
        b1;
        JVM INSTR monitorenter ;
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        if (k1.b != -1L)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_40;
        c1;
        b1;
        JVM INSTR monitorexit ;
        throw c1;
        k1.b = System.nanoTime();
        c1.i.a(flag, i1, j1);
        b1;
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

    static boolean a(c c1, int i1)
    {
        return c1.a == Protocol.d && i1 != 0 && (i1 & 1) == 0;
    }

    static int b(c c1, int i1)
    {
        c1.p = i1;
        return i1;
    }

    static boolean b(c c1)
    {
        return c1.r;
    }

    static int c(c c1)
    {
        return c1.p;
    }

    private com.squareup.okhttp.internal.framed.k c(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (u == null) goto _L2; else goto _L1
_L1:
        com.squareup.okhttp.internal.framed.k k1 = (com.squareup.okhttp.internal.framed.k)u.remove(Integer.valueOf(i1));
_L4:
        this;
        JVM INSTR monitorexit ;
        return k1;
_L2:
        k1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static com.squareup.okhttp.internal.framed.k c(c c1, int i1)
    {
        return c1.c(i1);
    }

    static int d(c c1)
    {
        return c1.q;
    }

    static ExecutorService d()
    {
        return l;
    }

    static Map e(c c1)
    {
        return c1.n;
    }

    static i f(c c1)
    {
        return c1.m;
    }

    static boolean g(c c1)
    {
        return c1.x;
    }

    static boolean h(c c1)
    {
        c1.x = true;
        return true;
    }

    static boolean i(c c1)
    {
        c1.r = true;
        return true;
    }

    static com.squareup.okhttp.internal.framed.l j(c c1)
    {
        return c1.v;
    }

    static Set k(c c1)
    {
        return c1.y;
    }

    final com.squareup.okhttp.internal.framed.d a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        com.squareup.okhttp.internal.framed.d d1 = (com.squareup.okhttp.internal.framed.d)n.get(Integer.valueOf(i1));
        this;
        JVM INSTR monitorexit ;
        return d1;
        Exception exception;
        exception;
        throw exception;
    }

    public final com.squareup.okhttp.internal.framed.d a(List list, boolean flag)
        throws IOException
    {
        boolean flag1;
        flag1 = false;
        if (!flag)
        {
            flag1 = true;
        }
        com.squareup.okhttp.internal.framed.b b1 = i;
        b1;
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
        b1;
        JVM INSTR monitorexit ;
        throw list;
        com.squareup.okhttp.internal.framed.d d1;
        int i1;
        i1 = q;
        q = q + 2;
        d1 = new com.squareup.okhttp.internal.framed.d(i1, this, flag1, false, list);
        if (d1.a())
        {
            n.put(Integer.valueOf(i1), d1);
            a(false);
        }
        this;
        JVM INSTR monitorexit ;
        i.a(flag1, i1, list);
        b1;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            i.b();
        }
        return d1;
    }

    final void a(int i1, long l1)
    {
        l.execute(new f("OkHttp Window Update %s stream %d", new Object[] {
            o, Integer.valueOf(i1)
        }, i1, l1) {

            final int a;
            final long c;
            final c d;

            public final void b()
            {
                try
                {
                    d.i.a(a, c);
                    return;
                }
                catch (IOException ioexception)
                {
                    return;
                }
            }

            transient 
            {
                d = c.this;
                a = i1;
                c = l1;
                super(s1, aobj);
            }
        });
    }

    final void a(int i1, ErrorCode errorcode)
    {
        l.submit(new f("OkHttp %s stream %d", new Object[] {
            o, Integer.valueOf(i1)
        }, i1, errorcode) {

            final int a;
            final ErrorCode c;
            final c d;

            public final void b()
            {
                try
                {
                    d.b(a, c);
                    return;
                }
                catch (IOException ioexception)
                {
                    return;
                }
            }

            transient 
            {
                d = c.this;
                a = i1;
                c = errorcode;
                super(s1, aobj);
            }
        });
    }

    public final void a(int i1, boolean flag, okio.c c1, long l1)
        throws IOException
    {
        long l2 = l1;
        if (l1 != 0L) goto _L2; else goto _L1
_L1:
        i.a(flag, i1, c1, 0);
_L4:
        return;
_L6:
        int j1;
        j1 = Math.min((int)Math.min(l2, d), i.c());
        d = d - (long)j1;
        this;
        JVM INSTR monitorexit ;
        l2 -= j1;
        com.squareup.okhttp.internal.framed.b b1 = i;
        boolean flag1;
        if (flag && l2 == 0L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        b1.a(flag1, i1, c1, j1);
_L2:
        if (l2 <= 0L) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorenter ;
_L8:
        if (d > 0L) goto _L6; else goto _L5
_L5:
        if (!n.containsKey(Integer.valueOf(i1)))
        {
            throw new IOException("stream closed");
        }
        break MISSING_BLOCK_LABEL_163;
        c1;
        throw new InterruptedIOException();
        c1;
        this;
        JVM INSTR monitorexit ;
        throw c1;
        wait();
        if (true) goto _L8; else goto _L7
_L7:
          goto _L6
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

    final com.squareup.okhttp.internal.framed.d b(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        com.squareup.okhttp.internal.framed.d d1 = (com.squareup.okhttp.internal.framed.d)n.remove(Integer.valueOf(i1));
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (n.isEmpty())
        {
            a(true);
        }
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return d1;
        Exception exception;
        exception;
        throw exception;
    }

    final void b(int i1, ErrorCode errorcode)
        throws IOException
    {
        i.a(i1, errorcode);
    }

    public final void c()
        throws IOException
    {
        i.b();
    }

    public final void close()
        throws IOException
    {
        a(ErrorCode.a, com.squareup.okhttp.internal.framed.ErrorCode.l);
    }

    static 
    {
        boolean flag;
        if (!com/squareup/okhttp/internal/framed/c.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
        l = new ThreadPoolExecutor(0, 0x7fffffff, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.squareup.okhttp.internal.k.a("OkHttp FramedConnection", true));
    }
}
