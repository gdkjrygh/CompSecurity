// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;

// Referenced classes of package android.support.v7.widget:
//            an, RecyclerView, al, bf, 
//            a

final class bb extends an
{

    final RecyclerView a;

    private bb(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    bb(RecyclerView recyclerview, byte byte0)
    {
        this(recyclerview);
    }

    private void b()
    {
        if (RecyclerView.n(a) && RecyclerView.o(a) && RecyclerView.p(a))
        {
            ViewCompat.postOnAnimation(a, RecyclerView.q(a));
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
        if (RecyclerView.g(a).k_())
        {
            bf.a(a.e, true);
            RecyclerView.m(a);
        } else
        {
            bf.a(a.e, true);
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
}
