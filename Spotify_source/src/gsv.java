// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.HeadersMode;
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

final class gsv extends gsh
    implements gsr
{

    final gst a;
    private gsq b;

    private gsv(gst gst1)
    {
        a = gst1;
        super("OkHttp %s", new Object[] {
            gst.a(gst1)
        });
    }

    gsv(gst gst1, byte byte0)
    {
        this(gst1);
    }

    public final void a(int i)
    {
        gst.e(a, i);
    }

    public final void a(int i, long l)
    {
        if (i == 0)
        {
            synchronized (a)
            {
                gst gst2 = a;
                gst2.d = gst2.d + l;
                a.notifyAll();
            }
            return;
        }
        break MISSING_BLOCK_LABEL_50;
        exception;
        gst1;
        JVM INSTR monitorexit ;
        throw exception;
        gsw gsw1;
        gsw1 = a.a(i);
        if (gsw1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        gsw1;
        JVM INSTR monitorenter ;
        gsw1.a(l);
        gsw1;
        JVM INSTR monitorexit ;
        return;
        Exception exception1;
        exception1;
        gsw1;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public final void a(int i, ErrorCode errorcode)
    {
        if (gst.a(a, i))
        {
            gst.d(a, i);
        } else
        {
            gsw gsw1 = a.b(i);
            if (gsw1 != null)
            {
                gsw1.c(errorcode);
                return;
            }
        }
    }

    public final void a(int i, ByteString bytestring)
    {
        bytestring.f();
        gsw agsw[];
        synchronized (a)
        {
            agsw = (gsw[])gst.e(a).values().toArray(new gsw[gst.e(a).size()]);
            gst.j(a);
        }
        int k = agsw.length;
        for (int j = 0; j < k; j++)
        {
            bytestring = agsw[j];
            if (((gsw) (bytestring)).c > i && bytestring.b())
            {
                bytestring.c(ErrorCode.g);
                a.b(((gsw) (bytestring)).c);
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
            gtn gtn1 = gst.i(a);
            if (gtn1 != null)
            {
                if (gtn1.b != -1L || 0L == -1L)
                {
                    throw new IllegalStateException();
                }
                gtn1.b = System.nanoTime();
                gtn1.a.countDown();
            }
            return;
        } else
        {
            gst.a(a, i, j);
            return;
        }
    }

    public final void a(boolean flag, int i, hcj hcj1, int j)
    {
        if (gst.a(a, i))
        {
            gst.a(a, i, hcj1, j);
        } else
        {
            gsw gsw1 = a.a(i);
            if (gsw1 == null)
            {
                a.a(i, ErrorCode.c);
                hcj1.f(j);
                return;
            }
            if (!gsw.i && Thread.holdsLock(gsw1))
            {
                throw new AssertionError();
            }
            gsw1.f.a(hcj1, j);
            if (flag)
            {
                gsw1.e();
                return;
            }
        }
    }

    public final void a(boolean flag, gtp gtp1)
    {
        gst1 = a;
        gst1;
        JVM INSTR monitorenter ;
        int j = a.f.b();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        gtp gtp2 = a.f;
        gtp2.c = 0;
        gtp2.b = 0;
        gtp2.a = 0;
        Arrays.fill(gtp2.d, 0);
        gtp gtp3 = a.f;
        int i = 0;
_L5:
        if (i >= 10)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        if (gtp1.a(i))
        {
            gtp3.a(i, gtp1.b(i), gtp1.d[i]);
        }
        break MISSING_BLOCK_LABEL_361;
        if (a.a == Protocol.d)
        {
            gst.d().execute(new gsh("OkHttp %s ACK Settings", new Object[] {
                gst.a(a)
            }, gtp1) {

                private gtp a;
                private gsv b;

                public final void b()
                {
                    try
                    {
                        b.a.i.a(a);
                        return;
                    }
                    catch (IOException ioexception)
                    {
                        return;
                    }
                }

            transient 
            {
                b = gsv.this;
                a = gtp1;
                super(s, aobj);
            }
            });
        }
        i = a.f.b();
        long l;
        if (i == -1 || i == j)
        {
            break MISSING_BLOCK_LABEL_353;
        }
        l = i - j;
        if (gst.g(a))
        {
            break MISSING_BLOCK_LABEL_235;
        }
        gtp1 = a;
        gtp1.d = ((gst) (gtp1)).d + l;
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        gtp1.notifyAll();
        gst.h(a);
        if (gst.e(a).isEmpty()) goto _L2; else goto _L1
_L1:
        gtp1 = (gsw[])gst.e(a).values().toArray(new gsw[gst.e(a).size()]);
_L3:
        gst1;
        JVM INSTR monitorexit ;
        if (gtp1 != null && l != 0L)
        {
            int k = gtp1.length;
            for (i = 0; i < k; i++)
            {
                synchronized (gtp1[i])
                {
                    gst1.a(l);
                }
            }

        }
        break MISSING_BLOCK_LABEL_347;
        gtp1;
        gst1;
        JVM INSTR monitorexit ;
        throw gtp1;
        gtp1;
        gst1;
        JVM INSTR monitorexit ;
        throw gtp1;
        return;
_L2:
        gtp1 = null;
          goto _L3
        gtp1 = null;
        l = 0L;
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
        if (!gst.a(a, i)) goto _L2; else goto _L1
_L1:
        gst.b(a, i);
_L8:
        return;
_L2:
        synchronized (a)
        {
            if (!gst.b(a))
            {
                break MISSING_BLOCK_LABEL_63;
            }
        }
        return;
        list;
        gst1;
        JVM INSTR monitorexit ;
        throw list;
        gsw gsw1 = a.a(i);
        if (gsw1 != null)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        Object obj;
        if (headersmode == HeadersMode.b || headersmode == HeadersMode.c)
        {
            flag2 = true;
        }
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        a.a(i, ErrorCode.c);
        gst1;
        JVM INSTR monitorexit ;
        return;
        if (i > gst.c(a))
        {
            break MISSING_BLOCK_LABEL_132;
        }
        gst1;
        JVM INSTR monitorexit ;
        return;
        if (i % 2 != gst.d(a) % 2)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        gst1;
        JVM INSTR monitorexit ;
        return;
        list = new gsw(i, a, flag, flag1, list);
        gst.c(a, i);
        gst.e(a).put(Integer.valueOf(i), list);
        gst.d().execute(new gsh("OkHttp %s stream %d", new Object[] {
            gst.a(a), Integer.valueOf(i)
        }, list) {

            private gsw a;
            private gsv b;

            public final void b()
            {
                try
                {
                    gst.f(b.a).a(a);
                    return;
                }
                catch (IOException ioexception)
                {
                    gsf.a.log(Level.INFO, (new StringBuilder("StreamHandler failure for ")).append(gst.a(b.a)).toString(), ioexception);
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
                b = gsv.this;
                a = gsw1;
                super(s, aobj);
            }
        });
        gst1;
        JVM INSTR monitorexit ;
        return;
        gst1;
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
            gsw1.b(ErrorCode.b);
            a.b(i);
            return;
        }
        if (!gsw.i && Thread.holdsLock(gsw1))
        {
            throw new AssertionError();
        }
        obj = null;
        gsw1;
        JVM INSTR monitorenter ;
        if (gsw1.e != null) goto _L4; else goto _L3
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
        gsw1;
        JVM INSTR monitorexit ;
        if (list != null)
        {
            gsw1.b(list);
        } else
        if (!flag)
        {
            gsw1.d.b(gsw1.c);
        }
        if (!flag1) goto _L8; else goto _L7
_L7:
        gsw1.e();
        return;
_L6:
        gsw1.e = list;
        flag = gsw1.a();
        gsw1.notifyAll();
        list = obj;
          goto _L9
        list;
        gsw1;
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
            break MISSING_BLOCK_LABEL_433;
        }
        list = ErrorCode.d;
        flag = flag5;
          goto _L9
        headersmode = new ArrayList();
        headersmode.addAll(gsw1.e);
        headersmode.addAll(list);
        gsw1.e = headersmode;
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
        obj2 = ErrorCode.e;
        errorcode1 = ErrorCode.e;
        errorcode = ((ErrorCode) (obj2));
        obj = obj2;
        b = a.g.a(hcq.a(hcq.b(a.h)), a.b);
        errorcode = ((ErrorCode) (obj2));
        obj = obj2;
        if (a.b)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        errorcode = ((ErrorCode) (obj2));
        obj = obj2;
        b.a();
_L2:
        errorcode = ((ErrorCode) (obj2));
        obj = obj2;
        if (b.a(this)) goto _L2; else goto _L1
_L1:
        errorcode = ((ErrorCode) (obj2));
        obj = obj2;
        obj2 = ErrorCode.a;
        errorcode = ((ErrorCode) (obj2));
        obj = obj2;
        ErrorCode errorcode2 = ErrorCode.h;
        IOException ioexception;
        Object obj1;
        try
        {
            gst.a(a, ((ErrorCode) (obj2)), errorcode2);
        }
        catch (IOException ioexception1) { }
        gsp.a(b);
        return;
        obj;
        obj = errorcode;
        obj2 = ErrorCode.b;
        obj = ErrorCode.b;
        try
        {
            gst.a(a, ((ErrorCode) (obj2)), ((ErrorCode) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        gsp.a(b);
        return;
        obj1;
        obj2 = obj;
        obj = obj1;
_L4:
        try
        {
            gst.a(a, ((ErrorCode) (obj2)), errorcode1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        gsp.a(b);
        throw obj;
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
