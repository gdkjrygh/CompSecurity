// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.ListFragment;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import bo.app.aw;
import bo.app.c;
import com.appboy.b.b;
import com.appboy.d;
import com.appboy.ui.b.a;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

// Referenced classes of package com.appboy.ui:
//            a, b, c, d, 
//            e, g

public class AppboyFeedFragment extends ListFragment
    implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
{
    public final class a extends android.view.GestureDetector.SimpleOnGestureListener
    {

        final AppboyFeedFragment a;

        public final boolean onDown(MotionEvent motionevent)
        {
            return true;
        }

        public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
        {
            long l1 = (motionevent1.getEventTime() - motionevent.getEventTime()) * 2L;
            int i1 = (int)(((float)l1 * f2) / 1000F);
            a.getListView().smoothScrollBy(-i1, (int)(l1 * 2L));
            return true;
        }

        public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
        {
            a.getListView().smoothScrollBy((int)f2, 0);
            return true;
        }

        public a()
        {
            a = AppboyFeedFragment.this;
            super();
        }
    }


    private static final String a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final Runnable c = new com.appboy.ui.a(this);
    private com.appboy.a d;
    private com.appboy.c.b e;
    private com.appboy.ui.b.a f;
    private LinearLayout g;
    private LinearLayout h;
    private ProgressBar i;
    private RelativeLayout j;
    private boolean k;
    private EnumSet l;
    private SwipeRefreshLayout m;
    private int n;
    private int o;
    private GestureDetectorCompat p;
    private View q;

    public AppboyFeedFragment()
    {
    }

    static int a(AppboyFeedFragment appboyfeedfragment, int i1)
    {
        appboyfeedfragment.n = i1;
        return i1;
    }

    static ProgressBar a(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.i;
    }

    static String a()
    {
        return a;
    }

    static int b(AppboyFeedFragment appboyfeedfragment, int i1)
    {
        appboyfeedfragment.o = i1;
        return i1;
    }

    static LinearLayout b(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.g;
    }

    private void b()
    {
        f.a(n, o);
    }

    static GestureDetectorCompat c(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.p;
    }

    static SwipeRefreshLayout d(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.m;
    }

    static int e(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.n;
    }

    static com.appboy.ui.b.a f(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.f;
    }

    static Runnable g(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.c;
    }

    static Handler h(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.b;
    }

    static EnumSet i(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.l;
    }

    static LinearLayout j(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.h;
    }

    static View k(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.q;
    }

    static com.appboy.a l(AppboyFeedFragment appboyfeedfragment)
    {
        return appboyfeedfragment.d;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        Object obj;
        com.appboy.c.b b1;
        if (k)
        {
            k = false;
        } else
        {
            f.a.clear();
        }
        obj = LayoutInflater.from(getActivity());
        bundle = getListView();
        bundle.addHeaderView(((LayoutInflater) (obj)).inflate(n.d.com_appboy_feed_header, null));
        bundle.addFooterView(((LayoutInflater) (obj)).inflate(n.d.com_appboy_feed_footer, null));
        j.setOnTouchListener(new com.appboy.ui.b(this));
        bundle.setOnScrollListener(new com.appboy.ui.c(this));
        q.setOnTouchListener(new com.appboy.ui.d(this));
        d.a(e, com/appboy/c/a);
        e = new e(this, bundle);
        obj = d;
        b1 = e;
        try
        {
            ((com.appboy.a) (obj)).a.a(b1, com/appboy/c/a);
        }
        catch (Exception exception)
        {
            ((com.appboy.a) (obj)).a(exception);
        }
        bundle.setAdapter(f);
        bundle = d;
        ((com.appboy.a) (bundle)).b.execute(new c(bundle));
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        d = com.appboy.a.a(activity);
        if (f == null)
        {
            f = new com.appboy.ui.b.a(activity, n.c.tag, new ArrayList());
            l = b.f;
        }
        setRetainInstance(true);
        p = new GestureDetectorCompat(activity, new a());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(n.d.com_appboy_feed, viewgroup, false);
        g = (LinearLayout)layoutinflater.findViewById(n.c.com_appboy_feed_network_error);
        i = (ProgressBar)layoutinflater.findViewById(n.c.com_appboy_feed_loading_spinner);
        h = (LinearLayout)layoutinflater.findViewById(n.c.com_appboy_feed_empty_feed);
        j = (RelativeLayout)layoutinflater.findViewById(n.c.com_appboy_feed_root);
        m = (SwipeRefreshLayout)layoutinflater.findViewById(n.c.appboy_feed_swipe_container);
        m.setOnRefreshListener(this);
        m.setEnabled(false);
        m.setColorSchemeResources(new int[] {
            n.a.com_appboy_newsfeed_swipe_refresh_color_1, n.a.com_appboy_newsfeed_swipe_refresh_color_2, n.a.com_appboy_newsfeed_swipe_refresh_color_3, n.a.com_appboy_newsfeed_swipe_refresh_color_4
        });
        q = layoutinflater.findViewById(n.c.com_appboy_feed_transparent_full_bounds_container_view);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        d.a(e, com/appboy/c/a);
        b();
    }

    public void onDetach()
    {
        super.onDetach();
        setListAdapter(null);
    }

    public void onPause()
    {
        super.onPause();
        b();
    }

    public void onRefresh()
    {
        d.c();
        b.postDelayed(new g(this), 2500L);
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
            k = true;
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, com/appboy/ui/AppboyFeedFragment.getName()
        });
    }
}
