// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;
import java.util.zip.Deflater;

// Referenced classes of package okio:
//            q, l, d, c, 
//            o, p, t, s

public final class f
    implements q
{

    private final d a;
    private final Deflater b;
    private boolean c;

    private f(d d1, Deflater deflater)
    {
        if (d1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater == null)
        {
            throw new IllegalArgumentException("inflater == null");
        } else
        {
            a = d1;
            b = deflater;
            return;
        }
    }

    public f(q q1, Deflater deflater)
    {
        this(l.a(q1), deflater);
    }

    private void a(boolean flag)
        throws IOException
    {
        c c1 = a.b();
        o o1;
label0:
        do
        {
            do
            {
                o1 = c1.e(1);
                int i;
                if (flag)
                {
                    i = b.deflate(o1.a, o1.c, 2048 - o1.c, 2);
                } else
                {
                    i = b.deflate(o1.a, o1.c, 2048 - o1.c);
                }
                if (i <= 0)
                {
                    continue label0;
                }
                o1.c = o1.c + i;
                c1.b = c1.b + (long)i;
                a.s();
            } while (true);
        } while (!b.needsInput());
        if (o1.b == o1.c)
        {
            c1.a = o1.a();
            p.a(o1);
        }
    }

    public final void a_(c c1, long l1)
        throws IOException
    {
        t.a(c1.b, 0L, l1);
        int i;
        for (; l1 > 0L; l1 -= i)
        {
            o o1 = c1.a;
            i = (int)Math.min(l1, o1.c - o1.b);
            b.setInput(o1.a, o1.b, i);
            a(false);
            c1.b = c1.b - (long)i;
            o1.b = o1.b + i;
            if (o1.b == o1.c)
            {
                c1.a = o1.a();
                p.a(o1);
            }
        }

    }

    public final void close()
        throws IOException
    {
        if (!c) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Throwable throwable;
        Throwable throwable1;
        throwable1 = null;
        try
        {
            b.finish();
            a(false);
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
            t.a(throwable1);
            return;
        }
          goto _L1
        throwable;
        if (throwable1 != null)
        {
            throwable = throwable1;
        }
          goto _L3
        Throwable throwable2;
        throwable2;
        throwable1 = throwable;
        if (throwable == null)
        {
            throwable1 = throwable2;
        }
          goto _L4
    }

    public final void flush()
        throws IOException
    {
        a(true);
        a.flush();
    }

    public final s q_()
    {
        return a.q_();
    }

    public final String toString()
    {
        return (new StringBuilder("DeflaterSink(")).append(a).append(")").toString();
    }
}
