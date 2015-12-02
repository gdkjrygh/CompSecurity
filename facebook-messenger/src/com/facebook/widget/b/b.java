// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.b;

import android.widget.AbsListView;
import com.facebook.common.b.a;

// Referenced classes of package com.facebook.widget.b:
//            c

public class b
{

    private final a a = new a();
    private android.widget.AbsListView.OnScrollListener b;
    private android.widget.AbsListView.OnScrollListener c;

    public b()
    {
        b = new c(this);
    }

    private void a(AbsListView abslistview, int i)
    {
        if (c != null)
        {
            c.onScrollStateChanged(abslistview, i);
        }
        int k = a.size();
        for (int j = 0; j < k; j++)
        {
            ((android.widget.AbsListView.OnScrollListener)a.a(j)).onScrollStateChanged(abslistview, i);
        }

    }

    private void a(AbsListView abslistview, int i, int j, int k)
    {
        if (c != null)
        {
            c.onScroll(abslistview, i, j, k);
        }
        int i1 = a.size();
        for (int l = 0; l < i1; l++)
        {
            ((android.widget.AbsListView.OnScrollListener)a.a(l)).onScroll(abslistview, i, j, k);
        }

    }

    static void a(b b1, AbsListView abslistview, int i)
    {
        b1.a(abslistview, i);
    }

    static void a(b b1, AbsListView abslistview, int i, int j, int k)
    {
        b1.a(abslistview, i, j, k);
    }

    public android.widget.AbsListView.OnScrollListener a()
    {
        return b;
    }

    public void a(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        c = onscrolllistener;
    }

    public void b(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        a.add(onscrolllistener);
    }

    public void c(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        a.remove(onscrolllistener);
    }
}
