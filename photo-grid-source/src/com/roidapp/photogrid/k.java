// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.u;
import com.roidapp.baselib.c.y;
import com.roidapp.cloudlib.ads.s;
import com.roidapp.cloudlib.common.d;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.c.a;
import com.roidapp.cloudlib.sns.main.b;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.q;
import com.roidapp.cloudlib.template.TemplateInfo;
import com.roidapp.cloudlib.template.b.c;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.w;
import com.roidapp.photogrid.release.ih;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.roidapp.photogrid:
//            s, p, l, a, 
//            q, r, MainPage, m, 
//            n, o

public final class k extends b
    implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
{

    private final com.roidapp.photogrid.s a = new com.roidapp.photogrid.s();
    private RecyclerView b;
    private SwipeRefreshLayout c;
    private com.roidapp.photogrid.a d;
    private y e;
    private Set f;
    private c g;
    private com.roidapp.photogrid.cloud.a.a h;
    private MainPage i;
    private List j;
    private int k;
    private boolean l;
    private boolean m;
    private com.roidapp.cloudlib.template.b.a n;
    private android.view.View.OnClickListener o;

    public k()
    {
        f = new HashSet();
        n = new p(this);
        o = new l(this);
    }

    static MainPage a(k k1)
    {
        return k1.i;
    }

    static List a(k k1, List list)
    {
        k1.j = list;
        return list;
    }

    static void a(k k1, TemplateInfo templateinfo)
    {
        if (k1.e != null && templateinfo != null && s.c())
        {
            ((a)k1.e.d()).a(templateinfo);
            k1.e.c();
        }
        if (k1.k > 0 && k1.a != null && k1.a.a != null)
        {
            String s1 = com.roidapp.cloudlib.a.a.a(aj.a()).a("other", "templateEntry");
            templateinfo = s1;
            if (s1 == null)
            {
                templateinfo = "%d NEW";
            }
            k1.a.a.setText(String.format(Locale.ENGLISH, templateinfo, new Object[] {
                Integer.valueOf(k1.k)
            }));
            k1.a.a.setBackgroundResource(0x7f0205ed);
            k1.a.a.setVisibility(0);
        }
    }

    private void a(List list)
    {
        if (d != null)
        {
            d.a(list);
            u.a(d, 0x7f0d026b).setVisibility(0);
        }
    }

    static y b(k k1)
    {
        return k1.e;
    }

    static void b(k k1, List list)
    {
        k1.a(list);
    }

    private void b(boolean flag)
    {
        l = true;
        o o1 = q.b(new com.roidapp.photogrid.q(this, (byte)0));
        if (flag)
        {
            o1.l();
        }
        o1.a(this);
        m = true;
        o1 = q.a(new r(this, (byte)0));
        if (flag)
        {
            o1.l();
        }
        o1.a(this);
    }

    static RecyclerView c(k k1)
    {
        return k1.b;
    }

    static Set d(k k1)
    {
        return k1.f;
    }

    static c e(k k1)
    {
        return k1.g;
    }

    static int f(k k1)
    {
        int i1 = k1.k;
        k1.k = i1 + 1;
        return i1;
    }

    static boolean g(k k1)
    {
        return k1.z();
    }

    static boolean h(k k1)
    {
        k1.l = false;
        return false;
    }

    static void i(k k1)
    {
        if (k1.d != null)
        {
            k1.d.a(null);
            u.a(k1.d, 0x7f0d026b).setVisibility(8);
        }
    }

    static boolean j(k k1)
    {
        return k1.z();
    }

    static List k(k k1)
    {
        return k1.j;
    }

    static boolean l(k k1)
    {
        return k1.z();
    }

    static boolean m(k k1)
    {
        k1.m = false;
        return false;
    }

    static SwipeRefreshLayout n(k k1)
    {
        return k1.c;
    }

    static boolean o(k k1)
    {
        return k1.z();
    }

    protected final void a(boolean flag)
    {
        super.a(flag);
        com.roidapp.baselib.c.b.a(af.a(getActivity()));
        com.roidapp.baselib.c.b.b("HomePage");
    }

    protected final void b()
    {
        super.b();
        if (e != null)
        {
            int i1;
            if (((a)e.d()).a() == 0)
            {
                i1 = -1;
            } else
            {
                GridLayoutManager gridlayoutmanager = (GridLayoutManager)b.b();
                i1 = gridlayoutmanager.c().c(gridlayoutmanager.l(), gridlayoutmanager.d());
            }
            if (i1 != -1)
            {
                com.roidapp.baselib.c.b.b("HomePage", i1);
            }
        }
        com.roidapp.baselib.c.b.a("HomePage", a());
    }

    public final void i_()
    {
        super.i_();
        if (b == null)
        {
            return;
        } else
        {
            getActivity();
            com.roidapp.baselib.c.b.a("SNS", "click", "SNS/TittleClick/Home");
            com.roidapp.photogrid.common.af.b(getActivity(), "SNS", "click", "SNS/TittleClick/Home", Long.valueOf(1L));
            b.c();
            return;
        }
    }

    public final void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i == null)
        {
            super.onActivityResult(i1, j1, intent);
            return;
        } else
        {
            super.onActivityResult(i1, j1, intent);
            return;
        }
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        i = (MainPage)activity;
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        g = new c(n);
        e = new y(new a(this, o));
        b(false);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300b4, viewgroup, false);
        if (layoutinflater != null)
        {
            c = (SwipeRefreshLayout)layoutinflater.findViewById(0x7f0d02c7);
            b = (RecyclerView)layoutinflater.findViewById(0x7f0d02c8);
            getActivity();
            viewgroup = new GridLayoutManager(2);
            viewgroup.a(new m(this));
            int i1 = com.roidapp.cloudlib.common.d.a(getResources(), 4F);
            b.a(new n(this, i1, viewgroup));
            b.a(new com.roidapp.photogrid.o(this));
            b.a(viewgroup);
            c.setOnRefreshListener(this);
            a(c);
        }
        if (i != null)
        {
            com.roidapp.cloudlib.sns.a.a.a(b, null, e, s.b(), Integer.valueOf(hashCode()));
            viewgroup = e;
            if (d == null)
            {
                d = new com.roidapp.photogrid.a(this);
                u.a(d, 0x7f0d026b).setVisibility(0);
            }
            viewgroup.a(d);
            if (j != null && !j.isEmpty())
            {
                a(j);
            }
            a.a(i);
            viewgroup = LayoutInflater.from(i);
            viewgroup = a.a(viewgroup, b);
            a.a();
            e.a(viewgroup);
            if (!i.z())
            {
                Message.obtain(g, 8976).sendToTarget();
            }
            b.a(e);
        }
        if (i != null)
        {
            i.h.a(layoutinflater);
            i.h.a((ViewGroup)layoutinflater);
        }
        return layoutinflater;
    }

    public final void onDestroy()
    {
        super.onDestroy();
        if (g != null)
        {
            g.a();
            g = null;
        }
        n = null;
        o = null;
        if (e != null)
        {
            ((a)e.d()).d();
            e = null;
        }
        if (j != null)
        {
            j.clear();
            j = null;
        }
        if (h != null)
        {
            h.a();
            h = null;
        }
    }

    public final void onDestroyView()
    {
        super.onDestroyView();
        if (e != null)
        {
            e.e();
            e.f();
        }
        if (b != null)
        {
            b.a(null);
            b = null;
        }
        if (c != null)
        {
            c.setRefreshing(false);
            c = null;
        }
        if (d != null)
        {
            d.a();
            d = null;
        }
    }

    public final void onDetach()
    {
        i = null;
        super.onDetach();
    }

    public final void onPause()
    {
        a.b();
        ih.C().G();
        super.onPause();
    }

    public final void onRefresh()
    {
        if (l || m)
        {
            return;
        } else
        {
            b(true);
            return;
        }
    }

    public final void onResume()
    {
        super.onResume();
    }

    public final void onStart()
    {
        super.onStart();
        com.roidapp.photogrid.common.b.a("MainPage");
        if (az.y == 0)
        {
            com.roidapp.photogrid.common.af.d(i, "HomePage");
        }
    }

    public final void onStop()
    {
        super.onStop();
    }

    public final void setUserVisibleHint(boolean flag)
    {
        super.setUserVisibleHint(flag);
        if (flag)
        {
            com.roidapp.photogrid.common.b.a("Home");
        }
    }
}
