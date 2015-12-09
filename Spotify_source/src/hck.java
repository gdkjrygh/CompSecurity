// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.zip.Deflater;

public final class hck
    implements hcv
{

    private final hci a;
    private final Deflater b;
    private boolean c;

    private hck(hci hci1, Deflater deflater)
    {
        if (hci1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater == null)
        {
            throw new IllegalArgumentException("inflater == null");
        } else
        {
            a = hci1;
            b = deflater;
            return;
        }
    }

    public hck(hcv hcv1, Deflater deflater)
    {
        this(hcq.a(hcv1), deflater);
    }

    private void a(boolean flag)
    {
        hch hch1 = a.b();
        hct hct1;
label0:
        do
        {
            do
            {
                hct1 = hch1.e(1);
                int i;
                if (flag)
                {
                    i = b.deflate(hct1.a, hct1.c, 2048 - hct1.c, 2);
                } else
                {
                    i = b.deflate(hct1.a, hct1.c, 2048 - hct1.c);
                }
                if (i <= 0)
                {
                    continue label0;
                }
                hct1.c = hct1.c + i;
                hch1.b = hch1.b + (long)i;
                a.t();
            } while (true);
        } while (!b.needsInput());
        if (hct1.b == hct1.c)
        {
            hch1.a = hct1.a();
            hcu.a(hct1);
        }
    }

    public final hcx T_()
    {
        return a.T_();
    }

    public final void a_(hch hch1, long l)
    {
        hcy.a(hch1.b, 0L, l);
        int i;
        for (; l > 0L; l -= i)
        {
            hct hct1 = hch1.a;
            i = (int)Math.min(l, hct1.c - hct1.b);
            b.setInput(hct1.a, hct1.b, i);
            a(false);
            hch1.b = hch1.b - (long)i;
            hct1.b = hct1.b + i;
            if (hct1.b == hct1.c)
            {
                hch1.a = hct1.a();
                hcu.a(hct1);
            }
        }

    }

    public final void close()
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
            hcy.a(throwable1);
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
    {
        a(true);
        a.flush();
    }

    public final String toString()
    {
        return (new StringBuilder("DeflaterSink(")).append(a).append(")").toString();
    }
}
