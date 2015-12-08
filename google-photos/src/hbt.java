// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

final class hbt extends fte
    implements hbu
{

    private final List a;
    private final hbw b = new hbw(this);

    hbt(List list)
    {
        a = list;
    }

    public final void a(RecyclerView recyclerview, int i)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((hbu)iterator.next()).a(recyclerview, i)) { }
    }

    public final void a(fsv fsv1)
    {
        b.a(fsv1.i, 1);
    }

    public final void a_(int i, int j, int k)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((hbu)iterator.next()).a_(i, j, k)) { }
    }

    public final void b(fsv fsv1)
    {
        b.a(fsv1.i, 0);
    }

    public final void c(fsv fsv1)
    {
        b.a(fsv1.i, -1, -1);
    }
}
