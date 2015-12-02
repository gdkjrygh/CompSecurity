// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import android.support.v4.view.ViewPager;
import android.support.v4.view.x;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.orca.emoji:
//            TabbedPageView

class ap extends x
{

    final TabbedPageView a;
    private final String b;
    private final List c;
    private final List d;

    ap(TabbedPageView tabbedpageview)
    {
        a = tabbedpageview;
        super();
        b = "";
        c = new ArrayList();
        d = new ArrayList();
    }

    ap(TabbedPageView tabbedpageview, String s, List list, List list1)
    {
        a = tabbedpageview;
        super();
        b = s;
        c = list;
        d = list1;
    }

    public int a()
    {
        return c.size();
    }

    public Object a(ViewGroup viewgroup, int i)
    {
        FrameLayout framelayout = (FrameLayout)c.get(i);
        if (framelayout.getChildCount() == 0)
        {
            framelayout.addView(TabbedPageView.a(a, framelayout.getContext(), d, TabbedPageView.a(a, i), b));
        }
        viewgroup.addView(framelayout, 0);
        return framelayout;
    }

    public void a(View view, int i, Object obj)
    {
        ((ViewPager)view).removeView((FrameLayout)obj);
    }

    public boolean a(View view, Object obj)
    {
        return view == obj;
    }
}
