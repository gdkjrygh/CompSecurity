// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import abo;
import android.view.View;
import zw;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

final class a
    implements zw
{

    private RecyclerView a;

    public final int a()
    {
        return a.getChildCount();
    }

    public final int a(View view)
    {
        return a.indexOfChild(view);
    }

    public final void a(int i)
    {
        View view = a.getChildAt(i);
        if (view != null)
        {
            RecyclerView.b(a, view);
        }
        a.removeViewAt(i);
    }

    public final void a(View view, int i)
    {
        a.addView(view, i);
        RecyclerView.a(a, view);
    }

    public final void a(View view, int i, android.view.tParams tparams)
    {
        abo abo1 = RecyclerView.b(view);
        if (abo1 != null)
        {
            if (!abo1.o() && !abo1.E_())
            {
                throw new IllegalArgumentException((new StringBuilder("Called attach on a child which is not detached: ")).append(abo1).toString());
            }
            abo1.j();
        }
        RecyclerView.a(a, view, i, tparams);
    }

    public final abo b(View view)
    {
        return RecyclerView.b(view);
    }

    public final View b(int i)
    {
        return a.getChildAt(i);
    }

    public final void b()
    {
        int j = a.getChildCount();
        for (int i = 0; i < j; i++)
        {
            RecyclerView.b(a, b(i));
        }

        a.removeAllViews();
    }

    public final void c(int i)
    {
        Object obj = b(i);
        if (obj != null)
        {
            obj = RecyclerView.b(((View) (obj)));
            if (obj != null)
            {
                if (((abo) (obj)).o() && !((abo) (obj)).E_())
                {
                    throw new IllegalArgumentException((new StringBuilder("called detach on an already detached child ")).append(obj).toString());
                }
                ((abo) (obj)).b(256);
            }
        }
        RecyclerView.a(a, i);
    }

    public final void c(View view)
    {
        view = RecyclerView.b(view);
        if (view != null)
        {
            abo.a(view);
        }
    }

    public final void d(View view)
    {
        view = RecyclerView.b(view);
        if (view != null)
        {
            abo.b(view);
        }
    }

    (RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }
}
