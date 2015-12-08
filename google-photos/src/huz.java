// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;

final class huz
    implements gml, hvs
{

    private final aen a;
    private final gll b;
    private final gml c;
    private final ehr d;
    private final hvq e;

    huz(aen aen1, gll gll1, gml gml1, ehr ehr, hvq hvq1)
    {
        a = aen1;
        b = gll1;
        c = gml1;
        d = ehr;
        e = hvq1;
        hvq1.a(this);
    }

    private boolean c(int i)
    {
        return d() == i;
    }

    private int d()
    {
        return c.a();
    }

    public final int a()
    {
        boolean flag;
        if (!e.a && c.a() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return c.a() + 1;
        } else
        {
            return c.a();
        }
    }

    public final int a(int i, int j)
    {
        if (c(i))
        {
            return j;
        } else
        {
            return c.a(i, j);
        }
    }

    public final int a(gml gml1, int i)
    {
        if (gml1 == this)
        {
            return i;
        } else
        {
            return c.a(gml1, i);
        }
    }

    public final void a(RecyclerView recyclerview, int i)
    {
        c.a(recyclerview, i);
    }

    public final boolean a(int i)
    {
        return b.b(d) != null;
    }

    public final void a_(int i, int j, int k)
    {
        c.a_(i, j, k);
    }

    public final int b(int i, int j)
    {
        if (c(i))
        {
            return 0;
        } else
        {
            return c.b(i, j);
        }
    }

    public final int b(gml gml1, int i)
    {
        if (gml1 == this)
        {
            return i;
        } else
        {
            return c.b(gml1, i);
        }
    }

    public final hgo b(int i)
    {
        if (c(i))
        {
            return new fre(d());
        } else
        {
            return c.b(i);
        }
    }

    public final void b()
    {
    }

    public final int c(int i, int j)
    {
        if (c(i))
        {
            return c.c(i, j) + 1;
        } else
        {
            return c.c(i, j);
        }
    }

    public final void c()
    {
        a.a.b();
    }
}
