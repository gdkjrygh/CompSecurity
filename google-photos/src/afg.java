// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public final class afg extends aep
{

    private RecyclerView a;

    public afg(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    private void b()
    {
        if (RecyclerView.m(a) && RecyclerView.n(a) && RecyclerView.o(a))
        {
            mk.a(a, RecyclerView.p(a));
            return;
        } else
        {
            RecyclerView.b(a, true);
            a.requestLayout();
            return;
        }
    }

    public final void a()
    {
        a.a(null);
        if (RecyclerView.f(a).b)
        {
            a.v.i = true;
            RecyclerView.l(a);
        } else
        {
            a.v.i = true;
            RecyclerView.l(a);
        }
        if (!a.b.d())
        {
            a.requestLayout();
        }
    }

    public final void a(int i, int j, int k)
    {
        abl abl1;
        boolean flag;
        flag = true;
        a.a(null);
        abl1 = a.b;
        if (i == j) goto _L2; else goto _L1
_L1:
        if (k != 1)
        {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        abl1.a.add(abl1.a(3, i, j, null));
        if (abl1.a.size() != 1) goto _L2; else goto _L3
_L3:
        i = ((flag) ? 1 : 0);
_L5:
        if (i != 0)
        {
            b();
        }
        return;
_L2:
        i = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(int i, int j, Object obj)
    {
        boolean flag = true;
        a.a(null);
        abl abl1 = a.b;
        abl1.a.add(abl1.a(2, i, j, obj));
        if (abl1.a.size() == 1)
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

    public final void b_(int i, int j)
    {
        boolean flag = true;
        a.a(null);
        abl abl1 = a.b;
        abl1.a.add(abl1.a(0, i, j, null));
        if (abl1.a.size() == 1)
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

    public final void c_(int i, int j)
    {
        boolean flag = true;
        a.a(null);
        abl abl1 = a.b;
        abl1.a.add(abl1.a(1, i, j, null));
        if (abl1.a.size() == 1)
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
