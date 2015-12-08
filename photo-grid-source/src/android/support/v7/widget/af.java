// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ad, au

final class af extends ad
{

    af(au au1)
    {
        super(au1, (byte)0);
    }

    public final int a(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        return au.i(view) - layoutparams.topMargin;
    }

    public final void a(int i)
    {
        a.e(i);
    }

    public final int b(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        int i = au.k(view);
        return layoutparams.bottomMargin + i;
    }

    public final int c()
    {
        return a.v();
    }

    public final int c(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        int i = au.g(view);
        int j = layoutparams.topMargin;
        return layoutparams.bottomMargin + (i + j);
    }

    public final int d()
    {
        return a.t() - a.x();
    }

    public final int d(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        int i = au.f(view);
        int j = layoutparams.leftMargin;
        return layoutparams.rightMargin + (i + j);
    }

    public final int e()
    {
        return a.t();
    }

    public final int f()
    {
        return a.t() - a.v() - a.x();
    }

    public final int g()
    {
        return a.x();
    }
}
