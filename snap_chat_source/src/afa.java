// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.InputStream;

public final class afa extends InputStream
    implements ZC
{

    private afh a;
    private abb b;
    private InputStream c;
    private abW d;
    private afi e;

    public afa(afh afh1, InputStream inputstream, abW abw)
    {
        if (afh1 == null)
        {
            throw new NullPointerException("socket was null");
        }
        if (inputstream == null)
        {
            throw new NullPointerException("delegate was null");
        }
        if (abw == null)
        {
            throw new NullPointerException("dispatch was null");
        }
        a = afh1;
        c = inputstream;
        d = abw;
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
            abb abb1 = e();
            abb1.a(exception);
            d.a(abb1, abb.a.c);
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
            abk.a(exception);
        }
    }

    private void a(byte abyte0[], int i, int j)
    {
        try
        {
            e.b(abyte0, i, j);
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
            e = ZJ.a;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            e = ZJ.a;
        }
        abk.a(abyte0);
    }

    private abb e()
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

    public final afi a()
    {
        return e;
    }

    public final void a(int i)
    {
        abb abb1 = e();
        abb1.c();
        abb1.g = i;
    }

    public final void a(afi afi1)
    {
        e = afi1;
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

    public final afi b()
    {
        return new ZG(this);
    }

    public final void b(int i)
    {
        abb abb1 = null;
        Object obj = null;
        if (b != null)
        {
            int j = b.g;
            abb1 = obj;
            if (j >= 100)
            {
                abb1 = obj;
                if (j < 200)
                {
                    abb1 = new abb(b.a());
                    abb1.a = b.a;
                    abb1.b = true;
                    abb1.f = b.f;
                    abb1.h = b.h;
                }
            }
            b.e = i;
            d.a(b, abb.a.b);
        }
        b = abb1;
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
            abk.a(throwable);
        }
        c.close();
    }

    public final void d()
    {
        if (b != null)
        {
            aaE aae = b.i;
            aaD aad = aaD.a;
            boolean flag;
            if (aae.a == 3 && aae.b == aad.b)
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
            e = ZJ.a;
            return i;
        }
        catch (Throwable throwable)
        {
            e = ZJ.a;
            abk.a(throwable);
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

    public final int read(byte abyte0[], int i, int j)
    {
        try
        {
            j = c.read(abyte0, i, j);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            a(abyte0);
            throw abyte0;
        }
        a(abyte0, i, j);
        return j;
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
