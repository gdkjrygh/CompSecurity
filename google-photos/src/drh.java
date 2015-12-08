// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;

final class drh extends fte
    implements hbu
{

    private boolean a;
    private boolean b;
    private drc c;

    drh(drc drc1)
    {
        c = drc1;
        super();
    }

    private void b()
    {
        fnh fnh1 = drc.h(c);
        fnj fnj1 = fnj.a;
        boolean flag;
        if (b || a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fnh1.a(fnj1, flag);
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
        drc.d(c).a_(i, j, k);
    }

    public final void b(fsv fsv)
    {
        super.b(fsv);
        b = false;
        b();
    }
}
