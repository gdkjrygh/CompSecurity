// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            au, bj

final class av extends au
{

    av(bj bj1)
    {
        super(bj1, (byte)0);
    }

    public final int a(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        return view.getLeft() - bj.h(view) - layoutparams.leftMargin;
    }

    public final void a(int i)
    {
        a.c(i);
    }

    public final int b(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        int i = view.getRight();
        int j = bj.i(view);
        return layoutparams.rightMargin + (i + j);
    }

    public final int c()
    {
        return a.m();
    }

    public final int c(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        int i = bj.d(view);
        int j = layoutparams.leftMargin;
        return layoutparams.rightMargin + (i + j);
    }

    public final int d()
    {
        return a.k() - a.o();
    }

    public final int d(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        int i = bj.e(view);
        int j = layoutparams.topMargin;
        return layoutparams.bottomMargin + (i + j);
    }

    public final int e()
    {
        return a.k();
    }

    public final int f()
    {
        return a.k() - a.m() - a.o();
    }

    public final int g()
    {
        return a.o();
    }
}
