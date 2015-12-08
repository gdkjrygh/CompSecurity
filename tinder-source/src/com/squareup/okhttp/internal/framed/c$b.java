// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.d;
import com.squareup.okhttp.internal.f;
import com.squareup.okhttp.internal.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;
import okio.e;
import okio.l;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            c, d, ErrorCode, k, 
//            m, HeadersMode, o, a, 
//            i, b

final class <init> extends f
    implements <init>
{

    a a;
    final c c;

    public final void a(int i, long l1)
    {
        if (i == 0)
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
        d1 = c.a(i);
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

    public final void a(int i, ErrorCode errorcode)
    {
        if (com.squareup.okhttp.internal.framed.c.a(c, i))
        {
            com.squareup.okhttp.internal.framed.c.a(c, i, errorcode);
        } else
        {
            com.squareup.okhttp.internal.framed.d d1 = c.b(i);
            if (d1 != null)
            {
                d1.c(errorcode);
                return;
            }
        }
    }

    public final void a(int i, List list)
    {
        com.squareup.okhttp.internal.framed.c.a(c, i, list);
    }

    public final void a(int i, ByteString bytestring)
    {
        bytestring = bytestring.c;
        com.squareup.okhttp.internal.framed.d ad[];
        synchronized (c)
        {
            ad = (com.squareup.okhttp.internal.framed.d[])com.squareup.okhttp.internal.framed.c.e(c).values().toArray(new com.squareup.okhttp.internal.framed.d[com.squareup.okhttp.internal.framed.c.e(c).size()]);
            com.squareup.okhttp.internal.framed.c.i(c);
        }
        int i1 = ad.length;
        for (int j = 0; j < i1; j++)
        {
            bytestring = ad[j];
            if (((com.squareup.okhttp.internal.framed.d) (bytestring)).c > i && bytestring.b())
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

    public final void a(boolean flag, int i, int j)
    {
        if (flag)
        {
            com.squareup.okhttp.internal.framed.k k1 = com.squareup.okhttp.internal.framed.c.c(c, i);
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
            com.squareup.okhttp.internal.framed.c.a(c, i, j);
            return;
        }
    }

    public final void a(boolean flag, int i, e e1, int j)
        throws IOException
    {
        if (com.squareup.okhttp.internal.framed.c.a(c, i))
        {
            com.squareup.okhttp.internal.framed.c.a(c, i, e1, j, flag);
        } else
        {
            com.squareup.okhttp.internal.framed.d d1 = c.a(i);
            if (d1 == null)
            {
                c.a(i, ErrorCode.c);
                e1.f(j);
                return;
            }
            if (!d.i && Thread.holdsLock(d1))
            {
                throw new AssertionError();
            }
            d1.f.a(e1, j);
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
        int j = c.f.b();
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
        int i = 0;
_L5:
        if (i >= 10)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        if (m1.a(i))
        {
            m3.a(i, m1.b(i), m1.d[i]);
        }
        break MISSING_BLOCK_LABEL_361;
        if (c.a == Protocol.d)
        {
            com.squareup.okhttp.internal.framed.c.d().execute(new f("OkHttp %s ACK Settings", new Object[] {
                com.squareup.okhttp.internal.framed.c.a(c)
            }, m1) {

                final m a;
                final c.b c;

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
                c = c.b.this;
                a = m1;
                super(s, aobj);
            }
            });
        }
        i = c.f.b();
        long l1;
        if (i == -1 || i == j)
        {
            break MISSING_BLOCK_LABEL_353;
        }
        l1 = i - j;
        if (com.squareup.okhttp.internal.framed.c.g(c))
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
        com.squareup.okhttp.internal.framed.c.h(c);
        if (com.squareup.okhttp.internal.framed.c.e(c).isEmpty()) goto _L2; else goto _L1
_L1:
        m1 = (com.squareup.okhttp.internal.framed.d[])com.squareup.okhttp.internal.framed.c.e(c).values().toArray(new com.squareup.okhttp.internal.framed.d[com.squareup.okhttp.internal.framed.c.e(c).size()]);
_L3:
        c1;
        JVM INSTR monitorexit ;
        if (m1 != null && l1 != 0L)
        {
            int i1 = m1.length;
            for (i = 0; i < i1; i++)
            {
                synchronized (m1[i])
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
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(boolean flag, boolean flag1, int i, List list, HeadersMode headersmode)
    {
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        flag3 = false;
        flag4 = false;
        flag2 = false;
        flag5 = true;
        if (!com.squareup.okhttp.internal.framed.c.a(c, i)) goto _L2; else goto _L1
_L1:
        com.squareup.okhttp.internal.framed.c.a(c, i, list, flag1);
_L8:
        return;
_L2:
        synchronized (c)
        {
            if (!com.squareup.okhttp.internal.framed.c.b(c))
            {
                break MISSING_BLOCK_LABEL_66;
            }
        }
        return;
        list;
        c1;
        JVM INSTR monitorexit ;
        throw list;
        com.squareup.okhttp.internal.framed.d d1 = c.a(i);
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
        c.a(i, ErrorCode.c);
        c1;
        JVM INSTR monitorexit ;
        return;
        if (i > com.squareup.okhttp.internal.framed.c.c(c))
        {
            break MISSING_BLOCK_LABEL_135;
        }
        c1;
        JVM INSTR monitorexit ;
        return;
        if (i % 2 != com.squareup.okhttp.internal.framed.c.d(c) % 2)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        c1;
        JVM INSTR monitorexit ;
        return;
        list = new com.squareup.okhttp.internal.framed.d(i, c, flag, flag1, list);
        com.squareup.okhttp.internal.framed.c.b(c, i);
        com.squareup.okhttp.internal.framed.c.e(c).put(Integer.valueOf(i), list);
        com.squareup.okhttp.internal.framed.c.d().execute(new f("OkHttp %s stream %d", new Object[] {
            com.squareup.okhttp.internal.framed.c.a(c), Integer.valueOf(i)
        }, list) {

            final com.squareup.okhttp.internal.framed.d a;
            final c.b c;

            public final void b()
            {
                try
                {
                    com.squareup.okhttp.internal.framed.c.f(c.c).a(a);
                    return;
                }
                catch (IOException ioexception)
                {
                    d.a.log(Level.INFO, (new StringBuilder("StreamHandler failure for ")).append(com.squareup.okhttp.internal.framed.c.a(c.c)).toString(), ioexception);
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
                c = c.b.this;
                a = d1;
                super(s, aobj);
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
            c.b(i);
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
        i = ((flag3) ? 1 : 0);
        if (headersmode == HeadersMode.c)
        {
            i = 1;
        }
        if (i == 0) goto _L6; else goto _L5
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
        i = ((flag4) ? 1 : 0);
        if (headersmode == HeadersMode.b)
        {
            i = 1;
        }
        if (i == 0)
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
        a = c.g.a(l.a(l.b(c.h)), c.b);
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
            com.squareup.okhttp.internal.framed.c.a(c, ((ErrorCode) (obj2)), errorcode2);
        }
        catch (IOException ioexception1) { }
        k.a(a);
        return;
        obj;
        obj = errorcode;
        obj2 = ErrorCode.b;
        obj = ErrorCode.b;
        try
        {
            com.squareup.okhttp.internal.framed.c.a(c, ((ErrorCode) (obj2)), ((ErrorCode) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        k.a(a);
        return;
        obj1;
        obj2 = obj;
        obj = obj1;
_L4:
        try
        {
            com.squareup.okhttp.internal.framed.c.a(c, ((ErrorCode) (obj2)), errorcode1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        k.a(a);
        throw obj;
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private _cls2.a(c c1)
    {
        c = c1;
        super("OkHttp %s", new Object[] {
            com.squareup.okhttp.internal.framed.c.a(c1)
        });
    }

    c(c c1, byte byte0)
    {
        this(c1);
    }
}
