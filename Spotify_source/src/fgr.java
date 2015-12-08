// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public final class fgr extends abc
{

    private final Drawable a;
    private final int b;
    private final int c;
    private final int d;

    public fgr(Context context, int i, int j)
    {
        a = gcg.a(context, 0x7f02004d);
        d = context.getResources().getDimensionPixelSize(0x7f0c008d) / 2;
        b = i;
        c = (b + j) - 1;
    }

    private static LinearLayoutManager a(RecyclerView recyclerview)
    {
        recyclerview = recyclerview.d();
        if (!(recyclerview instanceof LinearLayoutManager))
        {
            throw new IllegalStateException("CardBackgroundDecoration only supports LinearLayoutManager or its subclasses");
        } else
        {
            return (LinearLayoutManager)recyclerview;
        }
    }

    public final void a(Canvas canvas, RecyclerView recyclerview)
    {
        boolean flag = false;
        LinearLayoutManager linearlayoutmanager = a(recyclerview);
        int j = linearlayoutmanager.k();
        int k = linearlayoutmanager.l();
        int i;
        if (b < j)
        {
            i = 0;
        } else
        if (b > k)
        {
            i = linearlayoutmanager.r();
        } else
        {
            i = LinearLayoutManager.h((View)ctz.a(linearlayoutmanager.b(b))) + d;
        }
        if (c < j)
        {
            j = 0;
        } else
        if (c > k)
        {
            j = linearlayoutmanager.r();
        } else
        {
            j = LinearLayoutManager.j((View)ctz.a(linearlayoutmanager.b(c))) - d;
        }
        k = ((flag) ? 1 : 0);
        if (i < recyclerview.getHeight())
        {
            k = ((flag) ? 1 : 0);
            if (j > 0)
            {
                k = ((flag) ? 1 : 0);
                if (j > i)
                {
                    a.setBounds(d, i, recyclerview.getWidth() - d, j);
                    k = 1;
                }
            }
        }
        if (k != 0)
        {
            a.draw(canvas);
        }
    }

    public final void a(Rect rect, View view, RecyclerView recyclerview, abm abm)
    {
        boolean flag = false;
        int k = 1;
        int j1 = RecyclerView.d(view);
        view = a(recyclerview);
        boolean flag1;
        boolean flag2;
        int l;
        if (view instanceof GridLayoutManager)
        {
            recyclerview = ((GridLayoutManager)view).b();
            int j = ((GridLayoutManager)view).c();
            int i = recyclerview.c(b, j);
            k = recyclerview.c(c, j);
            l = recyclerview.c(j1, j);
            int i1 = recyclerview.a(j1, j);
            j1 = recyclerview.a(j1);
            if (i1 == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (l == i)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (j1 + i1 == j)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (l == k)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            l = k;
            k = ((flag2) ? 1 : 0);
            flag2 = flag;
        } else
        {
            if (j1 == b)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (j1 == c)
            {
                flag = true;
            }
            flag2 = true;
            l = ((flag) ? 1 : 0);
        }
        if (flag2)
        {
            rect.left = d;
        }
        if (flag1)
        {
            rect.top = d;
        }
        if (k != 0)
        {
            rect.right = d;
        }
        if (l != 0)
        {
            rect.bottom = d;
        }
    }
}
