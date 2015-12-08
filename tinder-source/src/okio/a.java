// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;
import java.io.InterruptedIOException;

// Referenced classes of package okio:
//            s, q, c, r

public class okio.a extends s
{
    private static final class a extends Thread
    {

        public final void run()
        {
            do
            {
                okio.a a1;
                do
                {
                    a1 = okio.a.e();
                } while (a1 == null);
                try
                {
                    a1.a();
                }
                catch (InterruptedException interruptedexception) { }
            } while (true);
        }

        public a()
        {
            super("Okio Watchdog");
            setDaemon(true);
        }
    }


    private static okio.a a;
    private boolean c;
    private okio.a d;
    private long e;

    public okio.a()
    {
    }

    private static void a(okio.a a1, long l, boolean flag)
    {
        okio/a;
        JVM INSTR monitorenter ;
        long l1;
        if (a == null)
        {
            a = new okio.a();
            (new a()).start();
        }
        l1 = System.nanoTime();
        if (l == 0L || !flag) goto _L2; else goto _L1
_L1:
        a1.e = Math.min(l, a1.c() - l1) + l1;
_L3:
        l = a1.e;
        for (okio.a a2 = a; a2.d != null && l - l1 >= a2.d.e - l1; a2 = a2.d)
        {
            break MISSING_BLOCK_LABEL_177;
        }

        a1.d = a2.d;
        a2.d = a1;
        if (a2 == a)
        {
            okio/a.notify();
        }
        okio/a;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (l == 0L)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        a1.e = l1 + l;
          goto _L3
        a1;
        throw a1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        a1.e = a1.c();
          goto _L3
        throw new AssertionError();
    }

    private static boolean a(okio.a a1)
    {
        okio/a;
        JVM INSTR monitorenter ;
        okio.a a2 = a;
_L8:
        if (a2 == null) goto _L2; else goto _L1
_L1:
        if (a2.d != a1) goto _L4; else goto _L3
_L3:
        a2.d = a1.d;
        a1.d = null;
        boolean flag = false;
_L6:
        okio/a;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        a2 = a2.d;
        continue; /* Loop/switch isn't completed */
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
        a1;
        throw a1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static okio.a e()
        throws InterruptedException
    {
        return g();
    }

    private static okio.a g()
        throws InterruptedException
    {
        Object obj = null;
        okio/a;
        JVM INSTR monitorenter ;
        okio.a a1 = a.d;
        if (a1 != null) goto _L2; else goto _L1
_L1:
        okio/a.wait();
_L4:
        okio/a;
        JVM INSTR monitorexit ;
        return ((okio.a) (obj));
_L2:
        long l;
        l = System.nanoTime();
        l = a1.e - l;
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        long l1 = l / 0xf4240L;
        okio/a.wait(l1, (int)(l - 0xf4240L * l1));
        continue; /* Loop/switch isn't completed */
        obj;
        throw obj;
        a.d = a1.d;
        a1.d = null;
        obj = a1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public IOException a(IOException ioexception)
    {
        InterruptedIOException interruptedioexception = new InterruptedIOException("timeout");
        if (ioexception != null)
        {
            interruptedioexception.initCause(ioexception);
        }
        return interruptedioexception;
    }

    public void a()
    {
    }

    final void a(boolean flag)
        throws IOException
    {
        if (s_() && flag)
        {
            throw a(((IOException) (null)));
        } else
        {
            return;
        }
    }

    final IOException b(IOException ioexception)
        throws IOException
    {
        if (!s_())
        {
            return ioexception;
        } else
        {
            return a(ioexception);
        }
    }

    public final void r_()
    {
        if (c)
        {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long l = t_();
        boolean flag = u_();
        if (l == 0L && !flag)
        {
            return;
        } else
        {
            c = true;
            a(this, l, flag);
            return;
        }
    }

    public final boolean s_()
    {
        if (!c)
        {
            return false;
        } else
        {
            c = false;
            return a(this);
        }
    }

    // Unreferenced inner class okio/a$1

/* anonymous class */
    final class _cls1
        implements q
    {

        final q a;
        final okio.a b;

        public final void a_(c c1, long l)
            throws IOException
        {
            b.r_();
            a.a_(c1, l);
            b.a(true);
            return;
            c1;
            throw b.b(c1);
            c1;
            b.a(false);
            throw c1;
        }

        public final void close()
            throws IOException
        {
            b.r_();
            a.close();
            b.a(true);
            return;
            Object obj;
            obj;
            throw b.b(((IOException) (obj)));
            obj;
            b.a(false);
            throw obj;
        }

        public final void flush()
            throws IOException
        {
            b.r_();
            a.flush();
            b.a(true);
            return;
            Object obj;
            obj;
            throw b.b(((IOException) (obj)));
            obj;
            b.a(false);
            throw obj;
        }

        public final s q_()
        {
            return b;
        }

        public final String toString()
        {
            return (new StringBuilder("AsyncTimeout.sink(")).append(a).append(")").toString();
        }

            
            {
                b = okio.a.this;
                a = q1;
                super();
            }
    }


    // Unreferenced inner class okio/a$2

/* anonymous class */
    final class _cls2
        implements r
    {

        final r a;
        final okio.a b;

        public final long a(c c1, long l)
            throws IOException
        {
            b.r_();
            l = a.a(c1, l);
            b.a(true);
            return l;
            c1;
            throw b.b(c1);
            c1;
            b.a(false);
            throw c1;
        }

        public final void close()
            throws IOException
        {
            a.close();
            b.a(true);
            return;
            Object obj;
            obj;
            throw b.b(((IOException) (obj)));
            obj;
            b.a(false);
            throw obj;
        }

        public final s q_()
        {
            return b;
        }

        public final String toString()
        {
            return (new StringBuilder("AsyncTimeout.source(")).append(a).append(")").toString();
        }

            
            {
                b = okio.a.this;
                a = r1;
                super();
            }
    }

}
