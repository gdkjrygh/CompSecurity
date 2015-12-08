// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.zip.Deflater;

public final class aib
    implements ain
{

    private final ahY a;
    private final Deflater b;
    private boolean c;

    aib(ahY ahy, Deflater deflater)
    {
        if (ahy == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater == null)
        {
            throw new IllegalArgumentException("inflater == null");
        } else
        {
            a = ahy;
            b = deflater;
            return;
        }
    }

    public aib(ain ain1, Deflater deflater)
    {
        this(aii.a(ain1), deflater);
    }

    private void a(boolean flag)
    {
        ahX ahx = a.b();
        ail ail1;
label0:
        do
        {
            do
            {
                ail1 = ahx.f(1);
                int i;
                if (flag)
                {
                    i = b.deflate(ail1.a, ail1.c, 2048 - ail1.c, 2);
                } else
                {
                    i = b.deflate(ail1.a, ail1.c, 2048 - ail1.c);
                }
                if (i <= 0)
                {
                    continue label0;
                }
                ail1.c = ail1.c + i;
                ahx.b = ahx.b + (long)i;
                a.q();
            } while (true);
        } while (!b.needsInput());
        if (ail1.b == ail1.c)
        {
            ahx.a = ail1.a();
            aim.a(ail1);
        }
    }

    public final void a_(ahX ahx, long l)
    {
        aiq.a(ahx.b, 0L, l);
        int i;
        for (; l > 0L; l -= i)
        {
            ail ail1 = ahx.a;
            i = (int)Math.min(l, ail1.c - ail1.b);
            b.setInput(ail1.a, ail1.b, i);
            a(false);
            ahx.b = ahx.b - (long)i;
            ail1.b = ail1.b + i;
            if (ail1.b == ail1.c)
            {
                ahx.a = ail1.a();
                aim.a(ail1);
            }
        }

    }

    public final aip aa_()
    {
        return a.aa_();
    }

    final void b()
    {
        b.finish();
        a(false);
    }

    public final void close()
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
            b();
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
            aiq.a(throwable1);
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

    public final void flush()
    {
        a(true);
        a.flush();
    }

    public final String toString()
    {
        return (new StringBuilder("DeflaterSink(")).append(a).append(")").toString();
    }
}
