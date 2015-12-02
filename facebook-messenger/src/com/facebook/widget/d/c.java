// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.d;

import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.Iterator;

// Referenced classes of package com.facebook.widget.d:
//            d, e, b, f, 
//            a

public class c
{

    private final View a;
    private final PopupWindow b;
    private final a c;
    private es d;
    private av e;
    private View f;
    private ListView g;
    private int h;
    private int i;
    private Point j;

    public c(View view, a a1)
    {
        h = -2;
        i = -2;
        j = new Point(0, 0);
        a = view;
        b = new PopupWindow(a.getContext());
        c = a1;
        e = (av)t.a(a.getContext()).a(com/facebook/analytics/av);
        b.setTouchInterceptor(new d(this));
        c();
    }

    static PopupWindow a(c c1)
    {
        return c1.b;
    }

    private void a(View view)
    {
        f = view;
        b.setContentView(view);
    }

    static void a(c c1, String s)
    {
        c1.a(s);
    }

    private void a(String s)
    {
        if (s == null)
        {
            return;
        } else
        {
            s = (new cb("click")).g(s).f("quick_action_item");
            e.a(s);
            return;
        }
    }

    static a b(c c1)
    {
        return c1.c;
    }

    private void c()
    {
        LayoutInflater layoutinflater = LayoutInflater.from(a.getContext());
        b.setBackgroundDrawable(new BitmapDrawable());
        f = layoutinflater.inflate(k.orca_quick_action_menu_list, null);
        g = (ListView)f.findViewById(i.listview);
        g.setOnItemClickListener(new e(this));
        a(f);
    }

    private int d()
    {
        if (d == null || d.size() == 0)
        {
            return 0;
        }
        b b1 = null;
        Iterator iterator = d.iterator();
        while (iterator.hasNext()) 
        {
            Object obj1 = (b)iterator.next();
            Object obj = obj1;
            int l;
            if (b1 != null)
            {
                if (((b) (obj1)).a().length() > b1.a().length())
                {
                    obj = obj1;
                } else
                {
                    obj = b1;
                }
            }
            b1 = ((b) (obj));
        }
        obj = g.getAdapter();
        obj1 = es.e();
        ((et) (obj1)).b(b1);
        g.setAdapter(new f(this, a.getContext(), ((et) (obj1)).b()));
        g.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(1000, 0x80000000));
        l = g.getMeasuredWidth();
        g.setAdapter(((android.widget.ListAdapter) (obj)));
        return l;
    }

    private void e()
    {
        if (c != null)
        {
            c.a(this);
        }
        if (d == null || d.size() == 0)
        {
            return;
        }
        int l = h;
        View view;
        int i1;
        int j1;
        if (h == -2)
        {
            l = d();
        } else
        if (h == -3)
        {
            l = a.getMeasuredWidth();
        }
        view = b.getContentView();
        i1 = view.getPaddingLeft();
        j1 = view.getPaddingRight();
        b.setWidth(l + (j1 + i1));
        if (i == -2)
        {
            b.setHeight(-2);
        } else
        if (i == -3)
        {
            b.setHeight(a.getMeasuredHeight());
        } else
        {
            b.setHeight(i);
        }
        b.setTouchable(true);
        b.setFocusable(true);
        b.setOutsideTouchable(true);
    }

    public void a()
    {
        e();
        if (d == null)
        {
            return;
        } else
        {
            b.setAnimationStyle(-1);
            b.showAsDropDown(a, j.x - b.getContentView().getPaddingLeft(), j.y - b.getContentView().getPaddingTop());
            return;
        }
    }

    public void a(int l)
    {
        h = l;
    }

    public void b()
    {
        b.dismiss();
    }
}
