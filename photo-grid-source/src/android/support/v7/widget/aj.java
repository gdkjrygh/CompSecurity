// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            f, RecyclerView, bi

final class aj
    implements f
{

    final RecyclerView a;

    aj(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

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

    public final void a(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        bi bi1 = RecyclerView.b(view);
        if (bi1 != null)
        {
            if (!bi1.p() && !bi1.b())
            {
                throw new IllegalArgumentException((new StringBuilder("Called attach on a child which is not detached: ")).append(bi1).toString());
            }
            bi1.i();
        }
        RecyclerView.a(a, view, i, layoutparams);
    }

    public final bi b(View view)
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
                if (((bi) (obj)).p() && !((bi) (obj)).b())
                {
                    throw new IllegalArgumentException((new StringBuilder("called detach on an already detached child ")).append(obj).toString());
                }
                ((bi) (obj)).a(256);
            }
        }
        RecyclerView.a(a, i);
    }
}
