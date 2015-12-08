// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.InterruptedIOException;

public class hce extends hcx
{

    private static hce a;
    private boolean c;
    private hce d;
    private long e;

    public hce()
    {
    }

    private static void a(hce hce1, long l, boolean flag)
    {
        hce;
        JVM INSTR monitorenter ;
        long l1;
        if (a == null)
        {
            a = new hce();
            (new hcf()).start();
        }
        l1 = System.nanoTime();
        if (l == 0L || !flag) goto _L2; else goto _L1
_L1:
        hce1.e = Math.min(l, hce1.c() - l1) + l1;
_L3:
        l = hce1.e;
        for (hce hce2 = a; hce2.d != null && l - l1 >= hce2.d.e - l1; hce2 = hce2.d)
        {
            break MISSING_BLOCK_LABEL_177;
        }

        hce1.d = hce2.d;
        hce2.d = hce1;
        if (hce2 == a)
        {
            hce.notify();
        }
        hce;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (l == 0L)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        hce1.e = l1 + l;
          goto _L3
        hce1;
        throw hce1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        hce1.e = hce1.c();
          goto _L3
        throw new AssertionError();
    }

    private static boolean a(hce hce1)
    {
        hce;
        JVM INSTR monitorenter ;
        hce hce2 = a;
_L8:
        if (hce2 == null) goto _L2; else goto _L1
_L1:
        if (hce2.d != hce1) goto _L4; else goto _L3
_L3:
        hce2.d = hce1.d;
        hce1.d = null;
        boolean flag = false;
_L6:
        hce;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        hce2 = hce2.d;
        continue; /* Loop/switch isn't completed */
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
        hce1;
        throw hce1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static hce e()
    {
        return g();
    }

    private static hce g()
    {
        Object obj = null;
        hce;
        JVM INSTR monitorenter ;
        hce hce1 = a.d;
        if (hce1 != null) goto _L2; else goto _L1
_L1:
        hce.wait();
_L4:
        hce;
        JVM INSTR monitorexit ;
        return ((hce) (obj));
_L2:
        long l;
        l = System.nanoTime();
        l = hce1.e - l;
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        long l1 = l / 0xf4240L;
        hce.wait(l1, (int)(l - 0xf4240L * l1));
        continue; /* Loop/switch isn't completed */
        obj;
        throw obj;
        a.d = hce1.d;
        hce1.d = null;
        obj = hce1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void U_()
    {
        if (c)
        {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long l = W_();
        boolean flag = X_();
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

    public final boolean V_()
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
    {
        if (V_() && flag)
        {
            throw a(((IOException) (null)));
        } else
        {
            return;
        }
    }

    final IOException b(IOException ioexception)
    {
        if (!V_())
        {
            return ioexception;
        } else
        {
            return a(ioexception);
        }
    }

    // Unreferenced inner class hce$1

/* anonymous class */
    final class _cls1
        implements hcv
    {

        private hcv a;
        private hce b;

        public final hcx T_()
        {
            return b;
        }

        public final void a_(hch hch, long l)
        {
            b.U_();
            a.a_(hch, l);
            b.a(true);
            return;
            hch;
            throw b.b(hch);
            hch;
            b.a(false);
            throw hch;
        }

        public final void close()
        {
            b.U_();
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
        {
            b.U_();
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

        public final String toString()
        {
            return (new StringBuilder("AsyncTimeout.sink(")).append(a).append(")").toString();
        }

            
            {
                b = hce.this;
                a = hcv1;
                super();
            }
    }


    // Unreferenced inner class hce$2

/* anonymous class */
    final class _cls2
        implements hcw
    {

        private hcw a;
        private hce b;

        public final hcx T_()
        {
            return b;
        }

        public final long a(hch hch, long l)
        {
            b.U_();
            l = a.a(hch, l);
            b.a(true);
            return l;
            hch;
            throw b.b(hch);
            hch;
            b.a(false);
            throw hch;
        }

        public final void close()
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

        public final String toString()
        {
            return (new StringBuilder("AsyncTimeout.source(")).append(a).append(")").toString();
        }

            
            {
                b = hce.this;
                a = hcw1;
                super();
            }
    }

}
