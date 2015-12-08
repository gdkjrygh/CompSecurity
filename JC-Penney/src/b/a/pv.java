// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.OutputStream;

// Referenced classes of package b.a:
//            c, qe, eu, j, 
//            qd, eg, pj, e

public final class pv extends OutputStream
    implements c
{

    private qd a;
    private OutputStream b;
    private eg c;
    private qe d;

    public pv(qd qd1, OutputStream outputstream)
    {
        if (qd1 == null)
        {
            throw new NullPointerException("socket was null");
        }
        if (outputstream == null)
        {
            throw new NullPointerException("output stream was null");
        }
        a = qd1;
        b = outputstream;
        d = b();
        if (d == null)
        {
            throw new NullPointerException("parser was null");
        } else
        {
            return;
        }
    }

    private void a(byte abyte0[], int i, int k)
    {
        try
        {
            d.b(abyte0, i, k);
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
            eu.a(abyte0);
        }
        d = j.a;
    }

    private eg d()
    {
        if (c == null)
        {
            c = a.a();
        }
        eg eg1 = c;
        return c;
    }

    public final qe a()
    {
        return d;
    }

    public final void a(int i)
    {
    }

    public final void a(qe qe1)
    {
        d = qe1;
    }

    public final void a(String s)
    {
        eg eg1 = d();
        if (eg1 != null)
        {
            eg1.b(s);
        }
    }

    public final void a(String s, String s1)
    {
        eg eg1 = d();
        eg1.b();
        eg1.h = s;
        eg1.k = null;
        s = eg1.j;
        if (s1 != null)
        {
            s.c = s1;
        }
        a.a(eg1);
    }

    public final boolean a(OutputStream outputstream)
    {
        return b == outputstream;
    }

    public final qe b()
    {
        return new e(this);
    }

    public final void b(int i)
    {
        eg eg1 = c;
        c = null;
        if (eg1 != null)
        {
            eg1.b(i);
        }
    }

    public final String c()
    {
        eg eg1 = d();
        String s = null;
        if (eg1 != null)
        {
            s = eg1.h;
        }
        return s;
    }

    public final void close()
    {
        b.close();
    }

    public final void flush()
    {
        b.flush();
    }

    public final void write(int i)
    {
        b.write(i);
        try
        {
            d.a(i);
            return;
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            eu.a(throwable);
        }
        d = j.a;
    }

    public final void write(byte abyte0[])
    {
        b.write(abyte0);
        if (abyte0 != null)
        {
            a(abyte0, 0, abyte0.length);
        }
    }

    public final void write(byte abyte0[], int i, int k)
    {
        b.write(abyte0, i, k);
        if (abyte0 != null)
        {
            a(abyte0, i, k);
        }
    }
}
