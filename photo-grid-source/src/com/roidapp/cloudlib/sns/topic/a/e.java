// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.topic.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.ab;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.q;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.basepost.PinnedListView2;
import com.roidapp.cloudlib.sns.basepost.bc;
import com.roidapp.cloudlib.sns.basepost.h;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.o;

// Referenced classes of package com.roidapp.cloudlib.sns.topic.a:
//            f, g

public final class e extends h
{

    private final aa A = new f(this);
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private o z;

    public e()
    {
    }

    private boolean B()
    {
        if (z != null)
        {
            z.f();
            z = null;
            f.a();
            return true;
        } else
        {
            return false;
        }
    }

    static ProgressBar a(e e1)
    {
        return e1.a;
    }

    static void a(e e1, int i1)
    {
        e1.a(i1);
    }

    static boolean a(e e1, boolean flag)
    {
        e1.x = flag;
        return flag;
    }

    private o b(int i1, boolean flag)
    {
        y = flag;
        if (af.a(getActivity()))
        {
            i = com.roidapp.cloudlib.sns.b.q.a(getActivity()).c();
            h = i.b;
            return com.roidapp.cloudlib.sns.q.a(i.a, h.a, i1, 20, A);
        } else
        {
            return com.roidapp.cloudlib.sns.q.a(i1, 20, A);
        }
    }

    static void b(e e1, int i1)
    {
        e1.a(i1);
    }

    static boolean b(e e1)
    {
        return e1.y;
    }

    static boolean c(e e1)
    {
        return e1.x;
    }

    static bc d(e e1)
    {
        return e1.d;
    }

    static bc e(e e1)
    {
        return e1.d;
    }

    static PinnedListView2 f(e e1)
    {
        return e1.b;
    }

    static SwipeRefreshLayout2 g(e e1)
    {
        return e1.f;
    }

    static SwipeRefreshLayout2 h(e e1)
    {
        return e1.f;
    }

    static o i(e e1)
    {
        e1.z = null;
        return null;
    }

    static SwipeRefreshLayout2 j(e e1)
    {
        return e1.f;
    }

    static boolean k(e e1)
    {
        e1.e = false;
        return false;
    }

    static boolean l(e e1)
    {
        e1.g = false;
        return false;
    }

    static ProgressBar m(e e1)
    {
        return e1.a;
    }

    static SwipeRefreshLayout2 n(e e1)
    {
        return e1.f;
    }

    static SwipeRefreshLayout2 o(e e1)
    {
        return e1.f;
    }

    static bc p(e e1)
    {
        return e1.d;
    }

    static bc q(e e1)
    {
        return e1.d;
    }

    static bc r(e e1)
    {
        return e1.d;
    }

    static boolean s(e e1)
    {
        e1.e = false;
        return false;
    }

    static ProgressBar t(e e1)
    {
        return e1.a;
    }

    static boolean u(e e1)
    {
        return e1.g;
    }

    static SwipeRefreshLayout2 v(e e1)
    {
        return e1.f;
    }

    public final View a(Context context)
    {
        ab ab1 = new ab(context);
        ab1.a(context.getResources().getString(at.A));
        ab1.a(u);
        return ab1;
    }

    public final void a(com.roidapp.cloudlib.sns.b.a.e e1, int i1, int j1, boolean flag)
    {
        m = e1;
        v = i1;
        w = j1;
        x = flag;
    }

    protected final void a(com.roidapp.cloudlib.sns.b.a.e e1, boolean flag, boolean flag1)
    {
        super.a(e1, flag, flag1);
        if (v != 1)
        {
            b.a_(v);
            v = 1;
        }
    }

    protected final void a(boolean flag)
    {
        super.a(flag);
        al.g().b(getActivity(), "TopicPopularListPage");
        com.roidapp.baselib.c.b.b("TopicPopularListPage");
        if (m == null)
        {
            e = true;
            w = 1;
            f.a(true);
            a.setVisibility(0);
            b(1, false).a(this);
        } else
        {
            a(m, true, false);
            if (d != null)
            {
                d.f(w);
                return;
            }
        }
    }

    protected final void b()
    {
        super.b();
        if (B())
        {
            e = false;
        }
        if (d != null)
        {
            if (d.i())
            {
                com.roidapp.baselib.c.b.e("TopicPopularListPage");
            }
            int i1 = g();
            if (i1 != -1)
            {
                com.roidapp.baselib.c.b.b("TopicPopularListPage", i1);
            }
        }
        com.roidapp.baselib.c.b.a("TopicPopularListPage", a());
    }

    public final void b(boolean flag)
    {
        super.b(flag);
        if (flag)
        {
            k.removeAllViews();
            View view = LayoutInflater.from(getActivity()).inflate(as.ah, k, false);
            k.addView(view);
            k.setVisibility(0);
        } else
        if (k != null && k.getVisibility() == 0)
        {
            k.removeAllViews();
            k.setVisibility(8);
            return;
        }
    }

    protected final void f()
    {
        n = true;
        r = true;
    }

    public final boolean j()
    {
        if (x || e)
        {
            return false;
        } else
        {
            e = true;
            B();
            z = b(d.f() + 1, true);
            z.a(this);
            return true;
        }
    }

    public final void k()
    {
        if (!s())
        {
            af.a(getActivity(), new g(this), "Explore_Popularnow_Page");
        }
    }

    public final void onRefresh()
    {
        B();
        e = true;
        b(1, false).l().a(this);
    }
}
