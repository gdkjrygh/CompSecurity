// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            q

final class s extends q
{

    s(RecyclerView.i i)
    {
        super(i, (byte)0);
    }

    public final int a(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        return RecyclerView.i.i(view) - layoutparams.topMargin;
    }

    public final void a(int i)
    {
        a.f(i);
    }

    public final int b(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        int i = RecyclerView.i.k(view);
        return layoutparams.bottomMargin + i;
    }

    public final int c()
    {
        return a.t();
    }

    public final int c(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        int i = RecyclerView.i.g(view);
        int j = layoutparams.topMargin;
        return layoutparams.bottomMargin + (i + j);
    }

    public final int d()
    {
        return a.r() - a.v();
    }

    public final int d(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        int i = RecyclerView.i.f(view);
        int j = layoutparams.leftMargin;
        return layoutparams.rightMargin + (i + j);
    }

    public final int e()
    {
        return a.r();
    }

    public final int f()
    {
        return a.r() - a.t() - a.v();
    }

    public final int g()
    {
        return a.v();
    }
}
