// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gp, gl, nr, gn, 
//            no, nj

public final class gi extends gp
{

    public final nr a;
    int b;
    private int g;

    public gi(gn gn, no no, nj nj, nr nr1)
    {
        super(gn, no, nj);
        if (nr1 == null)
        {
            throw new NullPointerException("constant == null");
        } else
        {
            a = nr1;
            b = -1;
            g = -1;
            return;
        }
    }

    public final gl a(gn gn)
    {
        gn = new gi(gn, super.e, super.f, a);
        if (b >= 0)
        {
            gn.a(b);
        }
        if (g >= 0)
        {
            gn.b(g);
        }
        return gn;
    }

    public final gl a(nj nj)
    {
        nj = new gi(super.d, super.e, nj, a);
        if (b >= 0)
        {
            nj.a(b);
        }
        if (g >= 0)
        {
            nj.b(g);
        }
        return nj;
    }

    protected final String a()
    {
        return a.h_();
    }

    public final void a(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("index < 0");
        }
        if (b >= 0)
        {
            throw new RuntimeException("index already set");
        } else
        {
            b = i;
            return;
        }
    }

    public final int b()
    {
        if (b < 0)
        {
            throw new RuntimeException((new StringBuilder("index not yet set for ")).append(a).toString());
        } else
        {
            return b;
        }
    }

    public final void b(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("index < 0");
        }
        if (g >= 0)
        {
            throw new RuntimeException("class index already set");
        } else
        {
            g = i;
            return;
        }
    }
}
