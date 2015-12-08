// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;

public final class gmk extends hhh
    implements gmg, hbu, hhd
{

    private final jp a = new jp(200);
    private final gml b;
    private final gmm c;
    private int d;

    public gmk(gml gml1, gmm gmm1)
    {
        d = -1;
        b = gml1;
        c = gmm1;
    }

    public final int a(int i, int j)
    {
        return b.a(i, j);
    }

    public final int a(long l)
    {
        throw new UnsupportedOperationException();
    }

    public final int a(gml gml1, int i)
    {
        return b.a(gml1, i);
    }

    public final long a(int i)
    {
        return -1L;
    }

    public final void a()
    {
        d = -1;
        a.a();
        if (b.a() != -1)
        {
            c.ac_();
        }
    }

    public final void a(RecyclerView recyclerview, int i)
    {
    }

    public final void a_(int i, int j, int k)
    {
        b.a_(i, j, k);
    }

    public final int b()
    {
        if (d == -1)
        {
            d = b.a();
        }
        if (d != -1)
        {
            return d;
        } else
        {
            return 0;
        }
    }

    public final int b(int i, int j)
    {
        return b.b(i, j);
    }

    public final int b(gml gml1, int i)
    {
        return b.b(gml1, i);
    }

    public final boolean b(int i)
    {
        return b.a(i);
    }

    public final int c(int i, int j)
    {
        return b.c(i, j);
    }

    public final hgo c(int i)
    {
        hgo hgo2 = (hgo)a.a(Integer.valueOf(i));
        hgo hgo1 = hgo2;
        if (hgo2 == null)
        {
            hgo1 = b.b(i);
            a.a(Integer.valueOf(i), hgo1);
        }
        return hgo1;
    }
}
