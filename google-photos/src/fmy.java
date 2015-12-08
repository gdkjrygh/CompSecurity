// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;

final class fmy extends fte
    implements hbu
{

    private boolean a;
    private boolean b;
    private fmo c;

    fmy(fmo fmo1)
    {
        c = fmo1;
        super();
    }

    private void b()
    {
        fnh fnh1 = fmo.m(c);
        fnj fnj = fmo.l(c);
        boolean flag;
        if (b || a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fnh1.a(fnj, flag);
    }

    public final void a(RecyclerView recyclerview, int i)
    {
        boolean flag;
        if (i == hbv.a || i == hbv.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        b();
    }

    public final void a(fsv fsv)
    {
        super.a(fsv);
        b = true;
        b();
    }

    public final void a_(int i, int j, int k)
    {
        fmo.h(c).a_(i, j, k);
    }

    public final void b(fsv fsv)
    {
        super.b(fsv);
        b = false;
        b();
    }
}
