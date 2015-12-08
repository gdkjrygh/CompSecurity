// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aY;
import bD;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

final class <init> extends <init>
{

    private RecyclerView a;

    private void b()
    {
        if (RecyclerView.n(a) && RecyclerView.o(a) && RecyclerView.p(a))
        {
            aY.a(a, RecyclerView.q(a));
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
        a.o.i = true;
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
        bD bd = a.b;
        bd.a.add(bd.a(2, i, j));
        if (bd.a.size() == 1)
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
        bD bd = a.b;
        bd.a.add(bd.a(0, i, j));
        if (bd.a.size() == 1)
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
        bD bd = a.b;
        bd.a.add(bd.a(1, i, j));
        if (bd.a.size() == 1)
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

    public final void d(int i, int j)
    {
        bD bd;
        boolean flag;
        flag = true;
        a.a(null);
        bd = a.b;
        if (i == j) goto _L2; else goto _L1
_L1:
        bd.a.add(bd.a(3, i, j));
        if (bd.a.size() != 1) goto _L2; else goto _L3
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

    private (RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    <init>(RecyclerView recyclerview, byte byte0)
    {
        this(recyclerview);
    }
}
