// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.a;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ax;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.c.y;
import com.roidapp.baselib.view.HeaderFooterGridView;
import com.roidapp.baselib.view.SpaceCompat;

// Referenced classes of package com.roidapp.cloudlib.sns.a:
//            b, c

public final class a
{

    public static void a(RecyclerView recyclerview, ax ax, y y1, View view, Object obj)
    {
        SpaceCompat spacecompat = new SpaceCompat(recyclerview.getContext());
        spacecompat.setMinimumHeight(view.getLayoutParams().height);
        y1.a(spacecompat);
        if (n.d())
        {
            recyclerview.a(new b(ax, view, obj));
        }
    }

    public static void a(View view, Object obj)
    {
        if (view != null)
        {
            view.setTag(obj);
        }
    }

    public static void a(AbsListView abslistview, View view, Object obj)
    {
        a(abslistview, view, true, obj, ((android.widget.AbsListView.OnScrollListener) (null)));
    }

    public static void a(AbsListView abslistview, View view, boolean flag, Object obj, android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        if (abslistview instanceof ListView)
        {
            ListView listview = (ListView)abslistview;
            if (listview.getHeaderViewsCount() > 0)
            {
                throw new RuntimeException("The listView already has header view, please attach before add your header view!");
            }
            abslistview = new SpaceCompat(abslistview.getContext());
            abslistview.setMinimumHeight(view.getLayoutParams().height);
            listview.addHeaderView(abslistview);
            if (flag && n.d())
            {
                listview.setOnScrollListener(new b(onscrolllistener, view, obj));
            }
        } else
        if (abslistview instanceof HeaderFooterGridView)
        {
            HeaderFooterGridView headerfootergridview = (HeaderFooterGridView)abslistview;
            if (headerfootergridview.a() > 0)
            {
                throw new RuntimeException("The listView already has header view, please attach before add your header view!");
            }
            abslistview = new SpaceCompat(abslistview.getContext());
            abslistview.setMinimumHeight(view.getLayoutParams().height);
            headerfootergridview.a(abslistview);
            if (flag && n.d())
            {
                headerfootergridview.setOnScrollListener(new b(onscrolllistener, view, obj));
                return;
            }
        } else
        {
            throw new IllegalArgumentException("Only support ListView or HeaderFooterGridView");
        }
    }

    public static void a(c c)
    {
        if (n.d())
        {
            com.roidapp.cloudlib.sns.a.b.a(c);
        }
    }

    public static void b(c c)
    {
        if (n.d())
        {
            com.roidapp.cloudlib.sns.a.b.b(c);
        }
    }
}
