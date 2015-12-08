// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;

final class fsy extends afc
{

    private fsv a;

    fsy(fsv fsv1)
    {
        a = fsv1;
        super();
    }

    public final void a(RecyclerView recyclerview, int i)
    {
        if (i == 0)
        {
            fsv.a(a, 0);
        }
    }

    public final void a(RecyclerView recyclerview, int i, int j)
    {
        fsv.a(a, fsv.e(a) + Math.abs(j));
        fsv.f(a);
    }
}
