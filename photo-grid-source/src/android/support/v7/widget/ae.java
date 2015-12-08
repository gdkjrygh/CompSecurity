// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ad, au

final class ae extends ad
{

    ae(au au1)
    {
        super(au1, (byte)0);
    }

    public final int a(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        return au.h(view) - layoutparams.leftMargin;
    }

    public final void a(int i)
    {
        a.d(i);
    }

    public final int b(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        int i = au.j(view);
        return layoutparams.rightMargin + i;
    }

    public final int c()
    {
        return a.u();
    }

    public final int c(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        int i = au.f(view);
        int j = layoutparams.leftMargin;
        return layoutparams.rightMargin + (i + j);
    }

    public final int d()
    {
        return a.s() - a.w();
    }

    public final int d(View view)
    {
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        int i = au.g(view);
        int j = layoutparams.topMargin;
        return layoutparams.bottomMargin + (i + j);
    }

    public final int e()
    {
        return a.s();
    }

    public final int f()
    {
        return a.s() - a.u() - a.w();
    }

    public final int g()
    {
        return a.w();
    }
}
