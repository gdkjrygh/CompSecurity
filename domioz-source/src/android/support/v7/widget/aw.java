// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            au, bj

final class aw extends au
{

    aw(bj bj1)
    {
        super(bj1, (byte)0);
    }

    public final int a(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        return view.getTop() - bj.f(view) - layoutparams.topMargin;
    }

    public final void a(int i)
    {
        a.d(i);
    }

    public final int b(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        int i = view.getBottom();
        int j = bj.g(view);
        return layoutparams.bottomMargin + (i + j);
    }

    public final int c()
    {
        return a.n();
    }

    public final int c(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        int i = bj.e(view);
        int j = layoutparams.topMargin;
        return layoutparams.bottomMargin + (i + j);
    }

    public final int d()
    {
        return a.l() - a.p();
    }

    public final int d(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        int i = bj.d(view);
        int j = layoutparams.leftMargin;
        return layoutparams.rightMargin + (i + j);
    }

    public final int e()
    {
        return a.l();
    }

    public final int f()
    {
        return a.l() - a.n() - a.p();
    }

    public final int g()
    {
        return a.p();
    }
}
