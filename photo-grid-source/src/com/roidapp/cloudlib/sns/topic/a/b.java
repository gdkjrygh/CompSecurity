// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.topic.a;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.au;
import android.view.View;
import com.roidapp.baselib.c.y;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.ab;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.q;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.f.a;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.o;

// Referenced classes of package com.roidapp.cloudlib.sns.topic.a:
//            c, e, d, a

public final class b extends com.roidapp.cloudlib.sns.topic.b
{

    private boolean m;
    private int n;
    private final aa o = new c(this);

    public b()
    {
        n = 1;
    }

    private o a(int i1, boolean flag)
    {
        i = true;
        m = flag;
        if (af.a(getActivity()))
        {
            g = com.roidapp.cloudlib.sns.b.q.a(getActivity()).c();
            f = g.b;
            return com.roidapp.cloudlib.sns.q.a(g.a, f.a, i1, 21, o);
        } else
        {
            return com.roidapp.cloudlib.sns.q.a(i1, 21, o);
        }
    }

    static void a(b b1, int i1, int j1)
    {
        b1.a(i1, j1);
    }

    static void a(b b1, Object obj)
    {
        b1.b(obj);
    }

    static boolean a(b b1)
    {
        b1.j = true;
        return true;
    }

    static void b(b b1, int i1, int j1)
    {
        b1.a(i1, j1);
    }

    static void b(b b1, Object obj)
    {
        b1.b(obj);
    }

    static boolean b(b b1)
    {
        return b1.m;
    }

    static boolean c(b b1)
    {
        return b1.j;
    }

    static Object d(b b1)
    {
        return b1.k;
    }

    static int e(b b1)
    {
        int i1 = b1.n;
        b1.n = i1 + 1;
        return i1;
    }

    static Object f(b b1)
    {
        return b1.k;
    }

    static Object g(b b1)
    {
        return b1.k;
    }

    static y h(b b1)
    {
        return b1.d;
    }

    static y i(b b1)
    {
        return b1.d;
    }

    static RecyclerView j(b b1)
    {
        return b1.e;
    }

    static SwipeRefreshLayout2 k(b b1)
    {
        return b1.c;
    }

    static SwipeRefreshLayout2 l(b b1)
    {
        return b1.c;
    }

    static o m(b b1)
    {
        b1.h = null;
        return null;
    }

    static boolean n(b b1)
    {
        b1.j = false;
        return false;
    }

    static int o(b b1)
    {
        b1.n = 1;
        return 1;
    }

    static SwipeRefreshLayout2 p(b b1)
    {
        return b1.c;
    }

    static boolean q(b b1)
    {
        b1.i = false;
        return false;
    }

    static SwipeRefreshLayout2 r(b b1)
    {
        return b1.c;
    }

    static o s(b b1)
    {
        b1.h = null;
        return null;
    }

    static SwipeRefreshLayout2 t(b b1)
    {
        return b1.c;
    }

    static boolean u(b b1)
    {
        b1.i = false;
        return false;
    }

    static boolean v(b b1)
    {
        b1.j = false;
        return false;
    }

    static y w(b b1)
    {
        return b1.d;
    }

    static y x(b b1)
    {
        return b1.d;
    }

    public final View a(Context context)
    {
        ab ab1 = new ab(context);
        ab1.a(context.getResources().getString(at.A));
        ab1.a(u);
        return ab1;
    }

    protected final void a(n n1)
    {
        getActivity();
        com.roidapp.baselib.c.b.a("SNS", "click", "SNS/TopicPopular/onPostClick");
        al.g().a(getActivity(), "SNS", "click", "SNS/TopicPopular/onPostClick", Long.valueOf(1L));
        int i1 = ((e)k).indexOf(n1);
        n1 = new com.roidapp.cloudlib.sns.topic.a.e();
        n1.a((e)k, i1 + 1, n, j);
        a(((com.roidapp.cloudlib.sns.main.b) (n1)));
    }

    protected final void a(boolean flag)
    {
        super.a(flag);
        al.g().a("TopicPopular");
        al.g().b(getActivity(), "TopicPopular");
        com.roidapp.baselib.c.b.b("TopicPopular");
        com.roidapp.cloudlib.sns.f.a.a().a("Explore_Popularnow_Page", 1);
        if (flag)
        {
            c.a(true);
            a(1, false).a(this);
            return;
        }
        if (d == null || k == null)
        {
            c.a(true);
            a(1, false).a(this);
            return;
        } else
        {
            c.a(i);
            b(k);
            return;
        }
    }

    protected final boolean a(Object obj)
    {
        obj = (e)obj;
        return obj != null && !((e) (obj)).isEmpty();
    }

    protected final void b()
    {
        super.b();
        if (m())
        {
            i = false;
        }
        if (d != null)
        {
            if (j())
            {
                com.roidapp.baselib.c.b.e("TopicPopular");
            }
            int i1 = k();
            if (i1 != -1)
            {
                com.roidapp.baselib.c.b.b("TopicPopular", i1);
            }
        }
        com.roidapp.baselib.c.b.a("TopicPopular", a());
    }

    protected final void d()
    {
        l = true;
    }

    protected final au f()
    {
        getActivity();
        GridLayoutManager gridlayoutmanager = new GridLayoutManager(3);
        gridlayoutmanager.a(new d(this));
        return gridlayoutmanager;
    }

    protected final com.roidapp.cloudlib.sns.topic.a g()
    {
        return new com.roidapp.cloudlib.sns.topic.a.a(this, this);
    }

    protected final void i()
    {
        super.i();
        getActivity();
        com.roidapp.baselib.c.b.a("SNS", "UpGlide", "SNS/UpGlide/TopicPopular");
        al.g().a(getActivity(), "SNS", "UpGlide", "SNS/UpGlide/TopicPopular", Long.valueOf(1L));
    }

    protected final boolean l()
    {
        if (j || i)
        {
            return false;
        } else
        {
            h = a(n + 1, true);
            h.a(this);
            return true;
        }
    }

    public final void onRefresh()
    {
        m();
        a(1, false).l().a(this);
    }
}
