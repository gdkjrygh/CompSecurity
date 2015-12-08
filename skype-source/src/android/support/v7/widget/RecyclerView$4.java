// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

final class a
    implements a
{

    final RecyclerView a;

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
            RecyclerView.access$700(a, view);
        }
        a.removeViewAt(i);
    }

    public final void a(View view, int i)
    {
        a.addView(view, i);
        RecyclerView.access$600(a, view);
    }

    public final void a(View view, int i, android.view.tParams tparams)
    {
        a a1 = RecyclerView.getChildViewHolderInt(view);
        if (a1 != null)
        {
            if (!a1.isTmpDetached() && !a1.shouldIgnore())
            {
                throw new IllegalArgumentException((new StringBuilder("Called attach on a child which is not detached: ")).append(a1).toString());
            }
            a1.clearTmpDetachFlag();
        }
        RecyclerView.access$800(a, view, i, tparams);
    }

    public final a b(View view)
    {
        return RecyclerView.getChildViewHolderInt(view);
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
            RecyclerView.access$700(a, b(i));
        }

        a.removeAllViews();
    }

    public final void c(int i)
    {
        Object obj = b(i);
        if (obj != null)
        {
            obj = RecyclerView.getChildViewHolderInt(((View) (obj)));
            if (obj != null)
            {
                if (((tChildViewHolderInt) (obj)).isTmpDetached() && !((isTmpDetached) (obj)).shouldIgnore())
                {
                    throw new IllegalArgumentException((new StringBuilder("called detach on an already detached child ")).append(obj).toString());
                }
                (() (obj)).addFlags(256);
            }
        }
        RecyclerView.access$900(a, i);
    }

    public final void c(View view)
    {
        view = RecyclerView.getChildViewHolderInt(view);
        if (view != null)
        {
            access._mth1000(view);
        }
    }

    public final void d(View view)
    {
        view = RecyclerView.getChildViewHolderInt(view);
        if (view != null)
        {
            access._mth1100(view);
        }
    }

    (RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }
}
