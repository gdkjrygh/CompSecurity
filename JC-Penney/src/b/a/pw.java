// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package b.a:
//            c, eg, eh, gt, 
//            eu, qe, j, qd, 
//            g, df, dg, dh

public final class pw extends InputStream
    implements c
{

    private qd a;
    private eg b;
    private InputStream c;
    private gt d;
    private qe e;

    public pw(qd qd1, InputStream inputstream, gt gt1)
    {
        if (qd1 == null)
        {
            throw new NullPointerException("socket was null");
        }
        if (inputstream == null)
        {
            throw new NullPointerException("delegate was null");
        }
        if (gt1 == null)
        {
            throw new NullPointerException("dispatch was null");
        }
        a = qd1;
        c = inputstream;
        d = gt1;
        e = b();
        if (e == null)
        {
            throw new NullPointerException("parser was null");
        } else
        {
            return;
        }
    }

    private void a(Exception exception)
    {
        try
        {
            eg eg1 = e();
            eg1.a(exception);
            d.a(eg1, eh.h);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            eu.a(exception);
        }
    }

    private void a(byte abyte0[], int i, int k)
    {
        try
        {
            e.b(abyte0, i, k);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            e = j.a;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            e = j.a;
        }
        eu.a(abyte0);
    }

    private eg e()
    {
        if (b == null)
        {
            b = a.b();
        }
        if (b == null)
        {
            throw new IllegalStateException("No statistics were queued up.");
        } else
        {
            return b;
        }
    }

    public final qe a()
    {
        return e;
    }

    public final void a(int i)
    {
        eg eg1 = e();
        eg1.c();
        eg1.g = i;
    }

    public final void a(qe qe1)
    {
        e = qe1;
    }

    public final void a(String s)
    {
    }

    public final void a(String s, String s1)
    {
    }

    public final boolean a(InputStream inputstream)
    {
        return c == inputstream;
    }

    public final int available()
    {
        return c.available();
    }

    public final qe b()
    {
        return new g(this);
    }

    public final void b(int i)
    {
        eg eg1 = null;
        Object obj = null;
        eg eg2 = b;
        if (b != null)
        {
            int k = b.g;
            eg1 = obj;
            if (k >= 100)
            {
                eg1 = obj;
                if (k < 200)
                {
                    eg1 = new eg(b.a());
                    eg1.c(b.a);
                    eg1.b(b.f);
                    eg1.h = b.h;
                }
            }
            b.a(i);
            d.a(b, eh.g);
        }
        b = eg1;
    }

    public final String c()
    {
        return e().h;
    }

    public final void close()
    {
        try
        {
            e.g();
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            eu.a(throwable);
        }
        c.close();
    }

    public final void d()
    {
        if (b != null)
        {
            dg dg1 = b.i;
            df df1 = df.a;
            boolean flag;
            if (dg1.a == dh.d.ordinal() && dg1.b == df1.a())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && e != null)
            {
                e.g();
            }
        }
    }

    public final void mark(int i)
    {
        c.mark(i);
    }

    public final boolean markSupported()
    {
        return c.markSupported();
    }

    public final int read()
    {
        int i;
        try
        {
            i = c.read();
        }
        catch (IOException ioexception)
        {
            a(ioexception);
            throw ioexception;
        }
        try
        {
            e.a(i);
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (IllegalStateException illegalstateexception)
        {
            e = j.a;
            return i;
        }
        catch (Throwable throwable)
        {
            e = j.a;
            eu.a(throwable);
            return i;
        }
        return i;
    }

    public final int read(byte abyte0[])
    {
        int i;
        try
        {
            i = c.read(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            a(abyte0);
            throw abyte0;
        }
        a(abyte0, 0, i);
        return i;
    }

    public final int read(byte abyte0[], int i, int k)
    {
        try
        {
            k = c.read(abyte0, i, k);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            a(abyte0);
            throw abyte0;
        }
        a(abyte0, i, k);
        return k;
    }

    public final void reset()
    {
        this;
        JVM INSTR monitorenter ;
        c.reset();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final long skip(long l)
    {
        return c.skip(l);
    }
}
