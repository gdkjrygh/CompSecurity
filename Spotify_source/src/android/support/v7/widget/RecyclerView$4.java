// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aay;
import aba;
import abd;
import abh;
import abo;
import acc;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

final class a
    implements acc
{

    private RecyclerView a;

    public final void a(abo abo1)
    {
        RecyclerView.f(a).a(abo1.a, a.a);
    }

    public final void a(abo abo1, aba aba, aba aba1)
    {
        a.a.b(abo1);
        RecyclerView.a(a, abo1, aba, aba1);
    }

    public final void b(abo abo1, aba aba, aba aba1)
    {
        RecyclerView.b(a, abo1, aba, aba1);
    }

    public final void c(abo abo1, aba aba, aba aba1)
    {
        abo1.a(false);
        if (RecyclerView.d(a))
        {
            if (a.n.a(abo1, abo1, aba, aba1))
            {
                RecyclerView.e(a);
            }
        } else
        if (a.n.c(abo1, aba, aba1))
        {
            RecyclerView.e(a);
            return;
        }
    }

    (RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }
}
