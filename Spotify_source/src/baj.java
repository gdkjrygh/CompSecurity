// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class baj extends azv
    implements azx
{

    public azi a;
    public bbj b;
    public bcd f;
    private final azw g;
    private volatile int h;
    private volatile boolean i;

    public baj(bdc bdc1, bde bde1, int j, bad bad, azw azw1)
    {
        super(bdc1, bde1, 2, j, bad);
        g = azw1;
    }

    public final int a(bby bby1, int j, boolean flag)
    {
        throw new IllegalStateException("Unexpected sample data in initialization chunk");
    }

    public final void a(long l, int j, int k, int i1, byte abyte0[])
    {
        throw new IllegalStateException("Unexpected sample data in initialization chunk");
    }

    public final void a(azi azi)
    {
        a = azi;
    }

    public final void a(bbj bbj)
    {
        b = bbj;
    }

    public final void a(bcd bcd)
    {
        f = bcd;
    }

    public final void a(bec bec, int j)
    {
        throw new IllegalStateException("Unexpected sample data in initialization chunk");
    }

    public final long c()
    {
        return (long)h;
    }

    public final void d()
    {
        i = true;
    }

    public final boolean e()
    {
        return i;
    }

    public final void f()
    {
        Object obj = bej.a(d, h);
        bdc bdc1 = e;
        long l = ((bde) (obj)).b;
        e.a(((bde) (obj)));
        obj = new bbv(bdc1, l);
        if (h == 0)
        {
            g.a(this);
        }
        int j = 0;
_L1:
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if (i)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        j = g.a(((bby) (obj)));
          goto _L1
        h = (int)(((bby) (obj)).a() - d.b);
        e.b();
        return;
        Exception exception1;
        exception1;
        h = (int)(((bby) (obj)).a() - d.b);
        throw exception1;
        Exception exception;
        exception;
        e.b();
        throw exception;
    }
}
