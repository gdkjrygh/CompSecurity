// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package crittercism.android:
//            al, c, e, dx, 
//            af, as, ae, ap, 
//            cl, cm, cn

public final class x extends InputStream
    implements al
{

    private ae a;
    private c b;
    private InputStream c;
    private e d;
    private af e;

    public x(ae ae1, InputStream inputstream, e e1)
    {
        if (ae1 == null)
        {
            throw new NullPointerException("socket was null");
        }
        if (inputstream == null)
        {
            throw new NullPointerException("delegate was null");
        }
        if (e1 == null)
        {
            throw new NullPointerException("dispatch was null");
        }
        a = ae1;
        c = inputstream;
        d = e1;
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
        c c1;
        try
        {
            c1 = e();
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            dx.a(exception);
            return;
        }
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        c1.a(exception);
        d.a(c1, c.a.h);
    }

    private void a(byte abyte0[], int i, int j)
    {
        try
        {
            e.a(abyte0, i, j);
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
            e = as.d;
        }
        dx.a(abyte0);
    }

    private c e()
    {
        if (b == null)
        {
            b = a.b();
        }
        return b;
    }

    public final af a()
    {
        return e;
    }

    public final void a(int i)
    {
        c c1 = e();
        if (c1 != null)
        {
            c1.c();
            c1.e = i;
        }
    }

    public final void a(af af1)
    {
        e = af1;
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

    public final af b()
    {
        return new ap(this);
    }

    public final void b(int i)
    {
        c c1 = null;
        Object obj = null;
        c c2 = b;
        if (b != null)
        {
            int j = b.e;
            c1 = obj;
            if (j >= 100)
            {
                c1 = obj;
                if (j < 200)
                {
                    c1 = new c(b.a());
                    c1.e(b.a);
                    c1.d(b.d);
                    c1.f = b.f;
                }
            }
            b.b(i);
            d.a(b, c.a.g);
        }
        b = c1;
    }

    public final String c()
    {
        c c1 = e();
        String s = null;
        if (c1 != null)
        {
            s = c1.f;
        }
        return s;
    }

    public final void close()
    {
        try
        {
            e.f();
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            dx.a(throwable);
        }
        c.close();
    }

    public final void d()
    {
        if (b != null)
        {
            cm cm1 = b.g;
            cl cl1 = cl.a;
            boolean flag;
            if (cm1.a == cn.d.ordinal() && cm1.b == cl1.a())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && e != null)
            {
                e.f();
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
        catch (Throwable throwable)
        {
            e = as.d;
            dx.a(throwable);
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
