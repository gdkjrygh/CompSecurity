// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

public abstract class OrientationHelper
{

    protected final RecyclerView.LayoutManager a;
    private int b;

    private OrientationHelper(RecyclerView.LayoutManager layoutmanager)
    {
        b = 0x80000000;
        a = layoutmanager;
    }


    public static OrientationHelper a(RecyclerView.LayoutManager layoutmanager)
    {
        return new OrientationHelper(layoutmanager) {

            public int a(View view)
            {
                RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
                return a.g(view) - layoutparams.leftMargin;
            }

            public void a(int i)
            {
                a.h(i);
            }

            public int b(View view)
            {
                RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
                int i = a.i(view);
                return layoutparams.rightMargin + i;
            }

            public int c()
            {
                return a.t();
            }

            public int c(View view)
            {
                RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
                int i = a.e(view);
                int j = layoutparams.leftMargin;
                return layoutparams.rightMargin + (i + j);
            }

            public int d()
            {
                return a.r() - a.v();
            }

            public int d(View view)
            {
                RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
                int i = a.f(view);
                int j = layoutparams.topMargin;
                return layoutparams.bottomMargin + (i + j);
            }

            public int e()
            {
                return a.r();
            }

            public int f()
            {
                return a.r() - a.t() - a.v();
            }

            public int g()
            {
                return a.v();
            }

        };
    }

    public static OrientationHelper a(RecyclerView.LayoutManager layoutmanager, int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException("invalid orientation");

        case 0: // '\0'
            return a(layoutmanager);

        case 1: // '\001'
            return b(layoutmanager);
        }
    }

    public static OrientationHelper b(RecyclerView.LayoutManager layoutmanager)
    {
        return new OrientationHelper(layoutmanager) {

            public int a(View view)
            {
                RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
                return a.h(view) - layoutparams.topMargin;
            }

            public void a(int i)
            {
                a.i(i);
            }

            public int b(View view)
            {
                RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
                int i = a.j(view);
                return layoutparams.bottomMargin + i;
            }

            public int c()
            {
                return a.u();
            }

            public int c(View view)
            {
                RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
                int i = a.f(view);
                int j = layoutparams.topMargin;
                return layoutparams.bottomMargin + (i + j);
            }

            public int d()
            {
                return a.s() - a.w();
            }

            public int d(View view)
            {
                RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
                int i = a.e(view);
                int j = layoutparams.leftMargin;
                return layoutparams.rightMargin + (i + j);
            }

            public int e()
            {
                return a.s();
            }

            public int f()
            {
                return a.s() - a.u() - a.w();
            }

            public int g()
            {
                return a.w();
            }

        };
    }

    public abstract int a(View view);

    public void a()
    {
        b = f();
    }

    public abstract void a(int i);

    public int b()
    {
        if (0x80000000 == b)
        {
            return 0;
        } else
        {
            return f() - b;
        }
    }

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();
}
