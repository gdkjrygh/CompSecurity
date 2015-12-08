// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.ap;
import android.support.v4.view.q;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.aw;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.appboy.b.b;
import com.appboy.f;
import com.appboy.ui.b.a;
import java.util.ArrayList;
import java.util.EnumSet;

// Referenced classes of package com.appboy.ui:
//            a, t, b, c, 
//            d, e, s, h, 
//            q, g

public class AppboyFeedFragment extends ap
    implements aw
{

    private static final String i;
    private final Handler j = new Handler(Looper.getMainLooper());
    private final Runnable k = new com.appboy.ui.a(this);
    private com.appboy.a l;
    private com.appboy.c.b m;
    private a n;
    private LinearLayout o;
    private LinearLayout p;
    private ProgressBar q;
    private RelativeLayout r;
    private boolean s;
    private EnumSet t;
    private SwipeRefreshLayout u;
    private int v;
    private int w;
    private q x;
    private View y;

    public AppboyFeedFragment()
    {
    }

    static int a(AppboyFeedFragment appboyfeedfragment, int i1)
    {
        appboyfeedfragment.v = i1;
        return i1;
    }

    static ProgressBar a(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.q;
    }

    static int b(AppboyFeedFragment appboyfeedfragment, int i1)
    {
        appboyfeedfragment.w = i1;
        return i1;
    }

    static LinearLayout b(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.o;
    }

    static q c(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.x;
    }

    static String c()
    {
        return i;
    }

    static SwipeRefreshLayout d(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.u;
    }

    private void d()
    {
        n.a(v, w);
    }

    static int e(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.v;
    }

    static a f(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.n;
    }

    static Runnable g(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.k;
    }

    static Handler h(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.j;
    }

    static EnumSet i(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.t;
    }

    static LinearLayout j(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.p;
    }

    static View k(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.y;
    }

    static com.appboy.a l(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.l;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        ListView listview;
        if (s)
        {
            s = false;
        } else
        {
            n.a();
            com.appboy.f.a.a(i, "Resetting card impressions.");
        }
        bundle = LayoutInflater.from(getActivity());
        listview = b();
        listview.addHeaderView(bundle.inflate(t.h, null));
        listview.addFooterView(bundle.inflate(t.g, null));
        r.setOnTouchListener(new com.appboy.ui.b(this));
        listview.setOnScrollListener(new c(this));
        y.setOnTouchListener(new d(this));
        l.a(m, com/appboy/c/a);
        m = new e(this, listview);
        l.b(m);
        listview.setAdapter(n);
        l.c();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        l = com.appboy.a.a(activity);
        if (n == null)
        {
            n = new a(activity, s.ac, new ArrayList());
            t = b.f;
        }
        setRetainInstance(true);
        x = new q(activity, new h(this));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(t.e, viewgroup, false);
        o = (LinearLayout)layoutinflater.findViewById(s.p);
        q = (ProgressBar)layoutinflater.findViewById(s.o);
        p = (LinearLayout)layoutinflater.findViewById(s.n);
        r = (RelativeLayout)layoutinflater.findViewById(com.appboy.ui.s.q);
        u = (SwipeRefreshLayout)layoutinflater.findViewById(com.appboy.ui.s.a);
        u.a(this);
        u.setEnabled(false);
        u.a(new int[] {
            com.appboy.ui.q.f, q.g, q.h, q.i
        });
        y = layoutinflater.findViewById(s.r);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        l.a(m, com/appboy/c/a);
        d();
    }

    public void onDetach()
    {
        super.onDetach();
        a(null);
    }

    public void onPause()
    {
        super.onPause();
        d();
    }

    public void onRefresh()
    {
        l.d();
        j.postDelayed(new g(this), 2500L);
    }

    public void onResume()
    {
        super.onResume();
        com.appboy.a.a(getActivity()).a();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (isVisible())
        {
            s = true;
        }
    }

    static 
    {
        i = String.format("%s.%s", new Object[] {
            f.a, com/appboy/ui/AppboyFeedFragment.getName()
        });
    }
}
