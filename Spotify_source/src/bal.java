// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bal extends azu
{

    private final azi j;
    private final byte k[];
    private boolean l;
    private volatile int m;
    private volatile boolean n;

    public bal(bdc bdc1, bde bde, bad bad, long l1, long l2, 
            int i, boolean flag, azi azi, byte abyte0[])
    {
        super(bdc1, bde, 1, bad, l1, l2, i, flag);
        j = azi;
        k = abyte0;
    }

    public final azi a()
    {
        return j;
    }

    public final bbj b()
    {
        return null;
    }

    public final long c()
    {
        return (long)m;
    }

    public final void d()
    {
        n = true;
    }

    public final boolean e()
    {
        return n;
    }

    public final void f()
    {
        bde bde;
        int i;
        i = 0;
        if (!l)
        {
            if (k != null)
            {
                super.a.a(new bec(k), k.length);
            }
            l = true;
        }
        bde = bej.a(d, m);
        e.a(bde);
_L1:
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        Object obj;
        m = i + m;
        obj = super.a;
        bdc bdc1 = e;
        obj = ((bbw) (obj)).a;
        i = ((bca) (obj)).a(0x7fffffff);
        i = bdc1.a(((bca) (obj)).i.a, ((bca) (obj)).j, i);
label0:
        {
            if (i != -1)
            {
                break label0;
            }
            i = -1;
        }
          goto _L1
        obj.j = ((bca) (obj)).j + i;
        obj.h = ((bca) (obj)).h + (long)i;
          goto _L1
        Exception exception;
        exception;
        e.b();
        throw exception;
        int i1 = m;
        i = i1;
        if (k != null)
        {
            i = i1 + k.length;
        }
        super.a.a(f, 1, i, 0, null);
        e.b();
        return;
    }
}
