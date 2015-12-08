// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hhb extends adf
{

    private final hha c;
    private final hhc d;
    private hgz e;

    public hhb(hgz hgz1, int i)
    {
        e = hgz1;
        super();
        c = new hha(hgz1, i);
        d = new hhc(hgz1, i);
        super.b = true;
    }

    private adf a()
    {
        if (hgz.a(e) instanceof hhd)
        {
            return d;
        } else
        {
            return c;
        }
    }

    private boolean b(int i)
    {
        return i < 0 || i >= hgz.a(e).b();
    }

    public final int a(int i)
    {
        if (b(i))
        {
            return 1;
        } else
        {
            return a().a(i);
        }
    }

    public final int a(int i, int j)
    {
        if (b(i))
        {
            return 0;
        } else
        {
            return a().a(i, j);
        }
    }

    public final int c(int i, int j)
    {
        if (b(i))
        {
            return 0;
        } else
        {
            return a().c(i, j);
        }
    }
}
