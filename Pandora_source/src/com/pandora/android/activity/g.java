// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.j;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TabWidget;
import android.widget.TextView;
import com.pandora.android.inbox.b;
import com.pandora.android.util.ReclickableTabHost;
import com.pandora.android.util.TabsClickedStatsCollector;
import p.ca.p;
import p.ca.r;

// Referenced classes of package com.pandora.android.activity:
//            f

class g extends j
    implements android.support.v4.view.ViewPager.e, android.widget.TabHost.OnTabChangeListener
{
    private static class a
        implements android.widget.TabHost.TabContentFactory
    {

        private final Context a;

        public View createTabContent(String s)
        {
            s = new View(a);
            s.setMinimumWidth(0);
            s.setMinimumHeight(0);
            return s;
        }

        public a(Context context)
        {
            a = context;
        }
    }


    private final Context a;
    private final ReclickableTabHost b;
    private final ViewPager c;
    private final HomeTabsActivity.b d[];
    private final Fragment e[];
    private int f;
    private int g;
    private HomeTabsActivity.c h;

    public g(FragmentActivity fragmentactivity, ReclickableTabHost reclickabletabhost, ViewPager viewpager, HomeTabsActivity.c c1, HomeTabsActivity.b ab[])
    {
        super(fragmentactivity.f());
        f = -1;
        g = -1;
        a = fragmentactivity;
        b = reclickabletabhost;
        c = viewpager;
        h = c1;
        d = ab;
        b.setOnTabChangedListener(this);
        c.setAdapter(this);
        c.setOnPageChangeListener(this);
        e = new Fragment[ab.length / 2 + 1];
        int i1 = ab.length;
        int k = 0;
        int i = 0;
        for (; k < i1; k++)
        {
            a(ab[k]);
            if (i < e.length)
            {
                int l = i + 1;
                g(i);
                i = l;
            }
        }

    }

    public static int a(HomeTabsActivity.b ab[])
    {
        return ab.length * 2 - 1;
    }

    static Context a(g g1)
    {
        return g1.a;
    }

    private View a(Context context, String s)
    {
        context = LayoutInflater.from(context).inflate(0x7f0400ac, null);
        ((TextView)context.findViewById(0x7f1002b7)).setText(s);
        return context;
    }

    private void a(HomeTabsActivity.b b1)
    {
        android.widget.TabHost.TabSpec tabspec = b.newTabSpec(b1.e.b);
        tabspec.setContent(new a(a));
        tabspec.setIndicator(a(b.getContext(), b1.e.c));
        if (b1.e.d == p/ca/r)
        {
            g = b.getTabWidget().getTabCount();
        }
        b.addTab(tabspec);
        c();
    }

    private void f()
    {
        AsyncQueryHandler asyncqueryhandler = new AsyncQueryHandler(a.getContentResolver()) {

            final g a;

            protected void onQueryComplete(int i, Object obj, Cursor cursor)
            {
                if ((g.a(a) instanceof Activity) && !((Activity)g.a(a)).isFinishing())
                {
                    obj = a;
                    boolean flag;
                    if (cursor != null && cursor.getCount() > 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    ((g) (obj)).a(flag);
                }
            }

            
            {
                a = g.this;
                super(contentresolver);
            }
        };
        android.net.Uri uri = b.a;
        String s = (new StringBuilder()).append(b.s).append(" AND ").append(b.q).toString();
        asyncqueryhandler.startQuery(0, null, uri, new String[] {
            "isSeen"
        }, s, null, null);
    }

    private void g(int i)
    {
        Object obj = LayoutInflater.from(b.getContext()).inflate(0x7f0400ab, null);
        android.widget.TabHost.TabSpec tabspec = b.newTabSpec((new StringBuilder()).append("div").append(i).toString());
        tabspec.setContent(new a(a));
        tabspec.setIndicator(((View) (obj)));
        b.addTab(tabspec);
        ((View) (obj)).setOnClickListener(null);
        if (((View) (obj)).getLayoutParams() instanceof android.widget.LinearLayout.LayoutParams)
        {
            obj = (android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams();
            obj.weight = 0.0F;
            obj.width = -2;
        }
        c();
    }

    public Fragment a(int i)
    {
        int k = e(i);
        Object obj;
        if (i % 2 > 0)
        {
            Fragment fragment1 = e[k];
            obj = fragment1;
            if (fragment1 == null)
            {
                obj = new p();
            }
        } else
        {
            HomeTabsActivity.b b1 = d[k];
            Fragment fragment2 = b1.e.a;
            obj = fragment2;
            if (fragment2 == null)
            {
                Fragment fragment = Fragment.instantiate(a, b1.e.d.getName(), b1.e.a(true));
                h.a(fragment, k);
                return fragment;
            }
        }
        return ((Fragment) (obj));
    }

    public void a(int i, float f1, int k)
    {
    }

    public void a(boolean flag)
    {
        if (g >= 0)
        {
            Object obj = b.getTabWidget().getChildTabViewAt(g);
            if (obj != null)
            {
                obj = (ImageView)((View) (obj)).findViewById(0x7f1002b8);
                int i;
                if (flag)
                {
                    i = 0;
                } else
                {
                    i = 8;
                }
                ((ImageView) (obj)).setVisibility(i);
            }
        }
    }

    public void a_(int i)
    {
        TabWidget tabwidget = b.getTabWidget();
        int k = tabwidget.getDescendantFocusability();
        tabwidget.setDescendantFocusability(0x60000);
        b.a(i, false);
        tabwidget.setDescendantFocusability(k);
    }

    public int b()
    {
        return a(d);
    }

    public void b(ViewGroup viewgroup, int i, Object obj)
    {
        super.b(viewgroup, i, obj);
        if (i != f)
        {
            f = i;
            i = e(i);
            h.b(i);
            if (f == g)
            {
                f();
            }
            TabsClickedStatsCollector.a().a(i);
        }
    }

    public void b_(int i)
    {
    }

    public Fragment d()
    {
        return a(f);
    }

    public int e(int i)
    {
        return i / 2;
    }

    public boolean e()
    {
        return f != -1;
    }

    public int f(int i)
    {
        return i * 2;
    }

    public void onTabChanged(String s)
    {
        int i = b.getCurrentTab();
        int k = e(i);
        h.a(k);
        c.a(i, false);
    }
}
