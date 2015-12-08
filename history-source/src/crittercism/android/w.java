// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.OutputStream;

// Referenced classes of package crittercism.android:
//            al, af, dx, as, 
//            ae, c, k, an

public final class w extends OutputStream
    implements al
{

    private ae a;
    private OutputStream b;
    private c c;
    private af d;

    public w(ae ae1, OutputStream outputstream)
    {
        if (ae1 == null)
        {
            throw new NullPointerException("socket was null");
        }
        if (outputstream == null)
        {
            throw new NullPointerException("output stream was null");
        }
        a = ae1;
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

    private void a(byte abyte0[], int i, int j)
    {
        try
        {
            d.a(abyte0, i, j);
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
            dx.a(abyte0);
        }
        d = as.d;
    }

    private c d()
    {
        if (c == null)
        {
            c = a.a();
        }
        c c1 = c;
        return c;
    }

    public final af a()
    {
        return d;
    }

    public final void a(int i)
    {
    }

    public final void a(af af1)
    {
        d = af1;
    }

    public final void a(String s)
    {
        c c1 = d();
        if (c1 != null)
        {
            c1.b(s);
        }
    }

    public final void a(String s, String s1)
    {
        c c1 = d();
        c1.b();
        c1.f = s;
        c1.i = null;
        s = c1.h;
        if (s1 != null)
        {
            s.c = s1;
        }
        a.a(c1);
    }

    public final boolean a(OutputStream outputstream)
    {
        return b == outputstream;
    }

    public final af b()
    {
        return new an(this);
    }

    public final void b(int i)
    {
        c c1 = c;
        c = null;
        if (c1 != null)
        {
            c1.d(i);
        }
    }

    public final String c()
    {
        c c1 = d();
        String s = null;
        if (c1 != null)
        {
            s = c1.f;
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
            dx.a(throwable);
        }
        d = as.d;
    }

    public final void write(byte abyte0[])
    {
        b.write(abyte0);
        if (abyte0 != null)
        {
            a(abyte0, 0, abyte0.length);
        }
    }

    public final void write(byte abyte0[], int i, int j)
    {
        b.write(abyte0, i, j);
        if (abyte0 != null)
        {
            a(abyte0, i, j);
        }
    }
}
