// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.IOException;
import java.util.zip.Deflater;

// Referenced classes of package c:
//            x, o, g, e, 
//            v, w, B, z

public final class j
    implements x
{

    private final g a;
    private final Deflater b;
    private boolean c;

    private j(g g1, Deflater deflater)
    {
        if (g1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater == null)
        {
            throw new IllegalArgumentException("inflater == null");
        } else
        {
            a = g1;
            b = deflater;
            return;
        }
    }

    public j(x x1, Deflater deflater)
    {
        this(o.a(x1), deflater);
    }

    private void a(boolean flag)
        throws IOException
    {
        e e1 = a.a();
        v v1;
label0:
        do
        {
            do
            {
                v1 = e1.d(1);
                int i;
                if (flag)
                {
                    i = b.deflate(v1.a, v1.c, 2048 - v1.c, 2);
                } else
                {
                    i = b.deflate(v1.a, v1.c, 2048 - v1.c);
                }
                if (i <= 0)
                {
                    continue label0;
                }
                v1.c = v1.c + i;
                e1.b = e1.b + (long)i;
                a.o();
            } while (true);
        } while (!b.needsInput());
        if (v1.b == v1.c)
        {
            e1.a = v1.a();
            w.a(v1);
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
            B.a(throwable1);
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

    public final z timeout()
    {
        return a.timeout();
    }

    public final String toString()
    {
        return (new StringBuilder("DeflaterSink(")).append(a).append(")").toString();
    }

    public final void write(e e1, long l)
        throws IOException
    {
        B.a(e1.b, 0L, l);
        int i;
        for (; l > 0L; l -= i)
        {
            v v1 = e1.a;
            i = (int)Math.min(l, v1.c - v1.b);
            b.setInput(v1.a, v1.b, i);
            a(false);
            e1.b = e1.b - (long)i;
            v1.b = v1.b + i;
            if (v1.b == v1.c)
            {
                e1.a = v1.a();
                w.a(v1);
            }
        }

    }
}
