// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.bp;

// Referenced classes of package android.support.v7.widget:
//            be, RecyclerView, bc, bs, 
//            k

final class bo extends be
{

    final RecyclerView a;

    private bo(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    bo(RecyclerView recyclerview, byte byte0)
    {
        this(recyclerview);
    }

    private void b()
    {
        if (RecyclerView.n(a) && RecyclerView.o(a) && RecyclerView.p(a))
        {
            bp.a(a, RecyclerView.q(a));
            return;
        } else
        {
            RecyclerView.r(a);
            a.requestLayout();
            return;
        }
    }

    public final void a()
    {
        a.a(null);
        if (RecyclerView.g(a).hasStableIds())
        {
            bs.a(a.e, true);
            RecyclerView.m(a);
        } else
        {
            bs.a(a.e, true);
            RecyclerView.m(a);
        }
        if (!a.b.d())
        {
            a.requestLayout();
        }
    }

    public final void a(int i, int j)
    {
        a.a(null);
        if (a.b.b(i, j))
        {
            b();
        }
    }

    public final void b(int i, int j)
    {
        a.a(null);
        if (a.b.c(i, j))
        {
            b();
        }
    }

    public final void c(int i, int j)
    {
        a.a(null);
        if (a.b.d(i, j))
        {
            b();
        }
    }

    public final void d(int i, int j)
    {
        a.a(null);
        if (a.b.e(i, j))
        {
            b();
        }
    }
}
