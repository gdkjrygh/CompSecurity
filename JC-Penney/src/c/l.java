// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.util.zip.Deflater;

// Referenced classes of package c:
//            ac, r, i, f, 
//            z, aa, ag, ae

public final class l
    implements ac
{

    private final i a;
    private final Deflater b;
    private boolean c;

    public l(ac ac1, Deflater deflater)
    {
        this(r.a(ac1), deflater);
    }

    l(i j, Deflater deflater)
    {
        if (j == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater == null)
        {
            throw new IllegalArgumentException("inflater == null");
        } else
        {
            a = j;
            b = deflater;
            return;
        }
    }

    private void a(boolean flag)
    {
        f f1 = a.b();
        z z1;
label0:
        do
        {
            do
            {
                z1 = f1.e(1);
                int j;
                if (flag)
                {
                    j = b.deflate(z1.a, z1.c, 2048 - z1.c, 2);
                } else
                {
                    j = b.deflate(z1.a, z1.c, 2048 - z1.c);
                }
                if (j <= 0)
                {
                    continue label0;
                }
                z1.c = z1.c + j;
                f1.b = f1.b + (long)j;
                a.w();
            } while (true);
        } while (!b.needsInput());
        if (z1.b == z1.c)
        {
            f1.a = z1.a();
            aa.a(z1);
        }
    }

    void a()
    {
        b.finish();
        a(false);
    }

    public void close()
    {
        if (!c) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Throwable throwable1 = null;
        Throwable throwable;
        Throwable throwable2;
        try
        {
            a();
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable1) { }
        b.end();
        throwable = throwable1;
_L3:
        a.close();
        throwable1 = throwable;
_L4:
        c = true;
        if (throwable1 != null)
        {
            ag.a(throwable1);
            return;
        }
          goto _L1
        throwable;
        if (throwable1 != null)
        {
            throwable = throwable1;
        }
          goto _L3
        throwable2;
        throwable1 = throwable;
        if (throwable == null)
        {
            throwable1 = throwable2;
        }
          goto _L4
    }

    public void flush()
    {
        a(true);
        a.flush();
    }

    public ae timeout()
    {
        return a.timeout();
    }

    public String toString()
    {
        return (new StringBuilder()).append("DeflaterSink(").append(a).append(")").toString();
    }

    public void write(f f1, long l1)
    {
        ag.a(f1.b, 0L, l1);
        int j;
        for (; l1 > 0L; l1 -= j)
        {
            z z1 = f1.a;
            j = (int)Math.min(l1, z1.c - z1.b);
            b.setInput(z1.a, z1.b, j);
            a(false);
            f1.b = f1.b - (long)j;
            z1.b = z1.b + j;
            if (z1.b == z1.c)
            {
                f1.a = z1.a();
                aa.a(z1);
            }
        }

    }
}
