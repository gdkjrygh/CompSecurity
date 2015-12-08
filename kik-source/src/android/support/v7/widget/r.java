// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            q

final class r extends q
{

    r(RecyclerView.i i)
    {
        super(i, (byte)0);
    }

    public final int a(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        return RecyclerView.i.h(view) - layoutparams.leftMargin;
    }

    public final void a(int i)
    {
        a.e(i);
    }

    public final int b(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        int i = RecyclerView.i.j(view);
        return layoutparams.rightMargin + i;
    }

    public final int c()
    {
        return a.s();
    }

    public final int c(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        int i = RecyclerView.i.f(view);
        int j = layoutparams.leftMargin;
        return layoutparams.rightMargin + (i + j);
    }

    public final int d()
    {
        return a.q() - a.u();
    }

    public final int d(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        int i = RecyclerView.i.g(view);
        int j = layoutparams.topMargin;
        return layoutparams.bottomMargin + (i + j);
    }

    public final int e()
    {
        return a.q();
    }

    public final int f()
    {
        return a.q() - a.s() - a.u();
    }

    public final int g()
    {
        return a.u();
    }
}
