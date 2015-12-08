// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public abstract class aau
{

    protected final abd a;
    public int b;

    private aau(abd abd)
    {
        b = 0x80000000;
        a = abd;
    }

    aau(abd abd, byte byte0)
    {
        this(abd);
    }

    public static aau a(abd abd, int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException("invalid orientation");

        case 0: // '\0'
            return new aau(abd) {

                public final int a(View view)
                {
                    android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
                    return abd.g(view) - layoutparams.leftMargin;
                }

                public final void a(int j)
                {
                    a.e(j);
                }

                public final int b()
                {
                    return a.s();
                }

                public final int b(View view)
                {
                    android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
                    int j = abd.i(view);
                    return layoutparams.rightMargin + j;
                }

                public final int c()
                {
                    return a.q() - a.u();
                }

                public final int c(View view)
                {
                    android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
                    int j = a.e(view);
                    int k = layoutparams.leftMargin;
                    return layoutparams.rightMargin + (j + k);
                }

                public final int d()
                {
                    return a.q();
                }

                public final int d(View view)
                {
                    android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
                    int j = abd.f(view);
                    int k = layoutparams.topMargin;
                    return layoutparams.bottomMargin + (j + k);
                }

                public final int e()
                {
                    return a.q() - a.s() - a.u();
                }

                public final int f()
                {
                    return a.u();
                }

            };

        case 1: // '\001'
            return new aau(abd) {

                public final int a(View view)
                {
                    android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
                    return abd.h(view) - layoutparams.topMargin;
                }

                public final void a(int j)
                {
                    a.f(j);
                }

                public final int b()
                {
                    return a.t();
                }

                public final int b(View view)
                {
                    android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
                    int j = abd.j(view);
                    return layoutparams.bottomMargin + j;
                }

                public final int c()
                {
                    return a.r() - a.v();
                }

                public final int c(View view)
                {
                    android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
                    int j = abd.f(view);
                    int k = layoutparams.topMargin;
                    return layoutparams.bottomMargin + (j + k);
                }

                public final int d()
                {
                    return a.r();
                }

                public final int d(View view)
                {
                    android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
                    int j = a.e(view);
                    int k = layoutparams.leftMargin;
                    return layoutparams.rightMargin + (j + k);
                }

                public final int e()
                {
                    return a.r() - a.t() - a.v();
                }

                public final int f()
                {
                    return a.v();
                }

            };
        }
    }

    public final int a()
    {
        if (0x80000000 == b)
        {
            return 0;
        } else
        {
            return e() - b;
        }
    }

    public abstract int a(View view);

    public abstract void a(int i);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();
}
