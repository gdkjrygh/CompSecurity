// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gug extends gub
{

    private boolean b;
    private gua c;

    private gug(gua gua1)
    {
        c = gua1;
        super(gua1, (byte)0);
    }

    gug(gua gua1, byte byte0)
    {
        this(gua1);
    }

    public final long a(hch hch, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l).toString());
        }
        if (a)
        {
            throw new IllegalStateException("closed");
        }
        if (b)
        {
            return -1L;
        }
        l = c.c.a(hch, l);
        if (l == -1L)
        {
            b = true;
            a(false);
            return -1L;
        } else
        {
            return l;
        }
    }

    public final void close()
    {
        if (a)
        {
            return;
        }
        if (!b)
        {
            b();
        }
        a = true;
    }
}
