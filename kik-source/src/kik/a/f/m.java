// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Timer;
import java.util.TimerTask;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.a.f:
//            p

public final class m extends OutputStream
{
    public static final class a extends IOException
    {

        private a()
        {
        }

        private a(String s)
        {
            super(s);
        }

        a(String s, byte byte0)
        {
            this(s);
        }
    }

    private final class b extends TimerTask
    {

        final m a;
        private final Thread b = Thread.currentThread();
        private boolean c;

        public final boolean cancel()
        {
            this;
            JVM INSTR monitorenter ;
            c = true;
            this;
            JVM INSTR monitorexit ;
            return super.cancel();
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void run()
        {
            this;
            JVM INSTR monitorenter ;
            if (c)
            {
                break MISSING_BLOCK_LABEL_28;
            }
            b.interrupt();
            m.a(a).a();
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
            Object obj;
            obj;
            m.a();
              goto _L1
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public b()
        {
            a = m.this;
            super();
            c = false;
        }
    }


    private static final Timer d = new Timer("InterruptingOutputStream");
    private static final org.c.b e = org.c.c.a("InterruptingOutputStream");
    private final OutputStream a;
    private final p b;
    private final long c;

    public m(OutputStream outputstream, long l, p p)
    {
        a = outputstream;
        c = l;
        b = p;
    }

    static p a(m m1)
    {
        return m1.b;
    }

    static org.c.b a()
    {
        return e;
    }

    private static void b()
    {
        if (!Thread.currentThread().isInterrupted())
        {
            break MISSING_BLOCK_LABEL_15;
        }
        Thread.sleep(100L);
        return;
        InterruptedException interruptedexception;
        interruptedexception;
        throw new a("Interrupted", (byte)0);
    }

    private b c()
    {
        b b1 = new b();
        d.schedule(b1, c);
        return b1;
    }

    public final void close()
    {
        b b1 = c();
        a.close();
        b1.cancel();
        b();
        return;
        Exception exception;
        exception;
        b1.cancel();
        b();
        throw exception;
    }

    public final void flush()
    {
        b b1 = c();
        a.flush();
        b1.cancel();
        b();
        return;
        Exception exception;
        exception;
        b1.cancel();
        b();
        throw exception;
    }

    public final void write(int i)
    {
        b b1 = c();
        a.write(i);
        b1.cancel();
        b();
        return;
        Exception exception;
        exception;
        b1.cancel();
        b();
        throw exception;
    }

    public final void write(byte abyte0[])
    {
        write(abyte0, 0, abyte0.length);
    }

    public final void write(byte abyte0[], int i, int j)
    {
        b b1 = c();
        a.write(abyte0, i, j);
        b1.cancel();
        b();
        return;
        abyte0;
        b1.cancel();
        b();
        throw abyte0;
    }

}
