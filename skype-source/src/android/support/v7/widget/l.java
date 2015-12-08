// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

public abstract class l
{

    protected final RecyclerView.i a;
    private int b;

    private l(RecyclerView.i i)
    {
        b = 0x80000000;
        a = i;
    }

    l(RecyclerView.i i, byte byte0)
    {
        this(i);
    }

    public static l a(RecyclerView.i i, int j)
    {
        switch (j)
        {
        default:
            throw new IllegalArgumentException("invalid orientation");

        case 0: // '\0'
            return new l(i) {

                public final int a(View view)
                {
                    RecyclerView.j j1 = (RecyclerView.j)view.getLayoutParams();
                    return a.getDecoratedLeft(view) - j1.leftMargin;
                }

                public final void a(int k)
                {
                    a.offsetChildrenHorizontal(k);
                }

                public final int b(View view)
                {
                    RecyclerView.j j1 = (RecyclerView.j)view.getLayoutParams();
                    return a.getDecoratedRight(view) + j1.rightMargin;
                }

                public final int c()
                {
                    return a.getPaddingLeft();
                }

                public final int c(View view)
                {
                    RecyclerView.j j1 = (RecyclerView.j)view.getLayoutParams();
                    return a.getDecoratedMeasuredWidth(view) + j1.leftMargin + j1.rightMargin;
                }

                public final int d()
                {
                    return a.getWidth() - a.getPaddingRight();
                }

                public final int d(View view)
                {
                    RecyclerView.j j1 = (RecyclerView.j)view.getLayoutParams();
                    return a.getDecoratedMeasuredHeight(view) + j1.topMargin + j1.bottomMargin;
                }

                public final int e()
                {
                    return a.getWidth();
                }

                public final int f()
                {
                    return a.getWidth() - a.getPaddingLeft() - a.getPaddingRight();
                }

                public final int g()
                {
                    return a.getPaddingRight();
                }

            };

        case 1: // '\001'
            return new l(i) {

                public final int a(View view)
                {
                    RecyclerView.j j1 = (RecyclerView.j)view.getLayoutParams();
                    return a.getDecoratedTop(view) - j1.topMargin;
                }

                public final void a(int k)
                {
                    a.offsetChildrenVertical(k);
                }

                public final int b(View view)
                {
                    RecyclerView.j j1 = (RecyclerView.j)view.getLayoutParams();
                    return a.getDecoratedBottom(view) + j1.bottomMargin;
                }

                public final int c()
                {
                    return a.getPaddingTop();
                }

                public final int c(View view)
                {
                    RecyclerView.j j1 = (RecyclerView.j)view.getLayoutParams();
                    return a.getDecoratedMeasuredHeight(view) + j1.topMargin + j1.bottomMargin;
                }

                public final int d()
                {
                    return a.getHeight() - a.getPaddingBottom();
                }

                public final int d(View view)
                {
                    RecyclerView.j j1 = (RecyclerView.j)view.getLayoutParams();
                    return a.getDecoratedMeasuredWidth(view) + j1.leftMargin + j1.rightMargin;
                }

                public final int e()
                {
                    return a.getHeight();
                }

                public final int f()
                {
                    return a.getHeight() - a.getPaddingTop() - a.getPaddingBottom();
                }

                public final int g()
                {
                    return a.getPaddingBottom();
                }

            };
        }
    }

    public abstract int a(View view);

    public final void a()
    {
        b = f();
    }

    public abstract void a(int i);

    public final int b()
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
