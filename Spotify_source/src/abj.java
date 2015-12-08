// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public final class abj extends aax
{

    private RecyclerView a;

    private abj(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    public abj(RecyclerView recyclerview, byte byte0)
    {
        this(recyclerview);
    }

    private void b()
    {
        if (RecyclerView.n(a) && RecyclerView.o(a) && RecyclerView.p(a))
        {
            km.a(a, RecyclerView.q(a));
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
        RecyclerView.g(a);
        a.q.e = true;
        RecyclerView.m(a);
        if (!a.b.d())
        {
            a.requestLayout();
        }
    }

    public final void a(int i, int j)
    {
        boolean flag = true;
        a.a(null);
        zi zi1 = a.b;
        zi1.a.add(zi1.a(4, i, j, null));
        zi1.b = zi1.b | 4;
        if (zi1.a.size() == 1)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            b();
        }
    }

    public final void b(int i, int j)
    {
        boolean flag = true;
        a.a(null);
        zi zi1 = a.b;
        zi1.a.add(zi1.a(1, i, j, null));
        zi1.b = zi1.b | 1;
        if (zi1.a.size() == 1)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            b();
        }
    }

    public final void c(int i, int j)
    {
        boolean flag = true;
        a.a(null);
        zi zi1 = a.b;
        zi1.a.add(zi1.a(2, i, j, null));
        zi1.b = zi1.b | 2;
        if (zi1.a.size() == 1)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            b();
        }
    }
}
