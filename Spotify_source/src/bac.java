// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bac extends azu
    implements azx
{

    private final azw j;
    private final long k;
    private azi l;
    private bbj m;
    private volatile int n;
    private volatile boolean o;

    public bac(bdc bdc1, bde bde1, int i, bad bad, long l1, long l2, int i1, boolean flag, long l3, azw azw1, azi azi, 
            bbj bbj)
    {
        super(bdc1, bde1, i, bad, l1, l2, i1, flag);
        j = azw1;
        k = l3;
        l = azi;
        m = bbj;
    }

    public final int a(bby bby1, int i, boolean flag)
    {
        return super.a.a(bby1, i, flag);
    }

    public final azi a()
    {
        return l;
    }

    public final void a(long l1, int i, int i1, int j1, byte abyte0[])
    {
        super.a.a(k + l1, i, i1, j1, abyte0);
    }

    public final void a(azi azi)
    {
        l = azi;
    }

    public final void a(bbj bbj)
    {
        m = bbj;
    }

    public final void a(bcd bcd)
    {
    }

    public final void a(bec bec, int i)
    {
        super.a.a(bec, i);
    }

    public final bbj b()
    {
        return m;
    }

    public final long c()
    {
        return (long)n;
    }

    public final void d()
    {
        o = true;
    }

    public final boolean e()
    {
        return o;
    }

    public final void f()
    {
        Object obj = bej.a(d, n);
        bdc bdc1 = e;
        long l1 = ((bde) (obj)).b;
        e.a(((bde) (obj)));
        obj = new bbv(bdc1, l1);
        if (n == 0)
        {
            j.a(this);
        }
        int i = 0;
_L1:
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if (o)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        i = j.a(((bby) (obj)));
          goto _L1
        n = (int)(((bby) (obj)).a() - d.b);
        e.b();
        return;
        Exception exception1;
        exception1;
        n = (int)(((bby) (obj)).a() - d.b);
        throw exception1;
        Exception exception;
        exception;
        e.b();
        throw exception;
    }
}
