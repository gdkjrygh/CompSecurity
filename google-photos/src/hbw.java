// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import org.lucasr.twowayview.TwoWayLayoutManager;

final class hbw extends afc
{

    private final hbu a;
    private int b;
    private int c;
    private int d;

    hbw(hbu hbu1)
    {
        b = 0x80000000;
        c = 0x80000000;
        d = 0x80000000;
        a = hbu1;
    }

    public final void a(RecyclerView recyclerview, int i)
    {
        a.a(null, hbv.a(i));
    }

    public final void a(RecyclerView recyclerview, int i, int j)
    {
        recyclerview = recyclerview.e;
        int k;
        if (recyclerview instanceof adi)
        {
            i = ((adi)recyclerview).c();
            j = ((adi)recyclerview).d();
        } else
        if (recyclerview instanceof TwoWayLayoutManager)
        {
            i = ((TwoWayLayoutManager)recyclerview).getFirstVisiblePosition();
            j = ((TwoWayLayoutManager)recyclerview).getLastVisiblePosition();
        } else
        {
            recyclerview = String.valueOf(recyclerview);
            throw new IllegalStateException((new StringBuilder(String.valueOf(recyclerview).length() + 52)).append("Cannot calculate visible items using layout manager ").append(recyclerview).toString());
        }
        j = Math.abs(i - j);
        k = recyclerview.getItemCount();
        if (b != i || c != j || d != k)
        {
            a.a_(i, j, k);
        }
        b = i;
        c = j;
        d = k;
    }
}
