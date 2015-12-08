// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.topic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.ab;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.q;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.basepost.PinnedListView2;
import com.roidapp.cloudlib.sns.basepost.bc;
import com.roidapp.cloudlib.sns.basepost.h;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.o;

// Referenced classes of package com.roidapp.cloudlib.sns.topic:
//            j, k, l

public final class i extends h
{

    private final aa A = new j(this);
    private final aa B = new k(this);
    private String v;
    private boolean w;
    private int x;
    private String y;
    private o z;

    public i()
    {
        w = false;
    }

    static boolean A(i i1)
    {
        i1.e = false;
        return false;
    }

    static o B(i i1)
    {
        i1.z = null;
        return null;
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

    static bc C(i i1)
    {
        return i1.d;
    }

    static SwipeRefreshLayout2 D(i i1)
    {
        return i1.f;
    }

    static boolean E(i i1)
    {
        i1.e = false;
        return false;
    }

    static ProgressBar a(i i1)
    {
        return i1.a;
    }

    static e a(i i1, e e1)
    {
        i1.m = e1;
        return e1;
    }

    private o a(boolean flag, int i1)
    {
        if (af.a(getActivity()))
        {
            i = com.roidapp.cloudlib.sns.b.q.a(getActivity()).c();
            h = i.b;
            if (!flag)
            {
                return com.roidapp.cloudlib.sns.q.b(i.a, h.a, v, i1, A);
            } else
            {
                return com.roidapp.cloudlib.sns.q.b(i.a, h.a, v, i1, B);
            }
        }
        if (!flag)
        {
            return com.roidapp.cloudlib.sns.q.a(v, i1, A);
        } else
        {
            return com.roidapp.cloudlib.sns.q.a(v, i1, B);
        }
    }

    static void a(i i1, int j1)
    {
        i1.a(j1);
    }

    static boolean a(i i1, boolean flag)
    {
        i1.w = flag;
        return flag;
    }

    static SwipeRefreshLayout2 b(i i1)
    {
        return i1.f;
    }

    static void b(i i1, int j1)
    {
        i1.a(j1);
    }

    static e c(i i1)
    {
        return i1.m;
    }

    static void c(i i1, int j1)
    {
        i1.a(j1);
    }

    static e d(i i1)
    {
        return i1.m;
    }

    static e e(i i1)
    {
        return i1.m;
    }

    static e f(i i1)
    {
        return i1.m;
    }

    static e g(i i1)
    {
        return i1.m;
    }

    static boolean h(i i1)
    {
        i1.g = false;
        return false;
    }

    static boolean i(i i1)
    {
        i1.e = false;
        return false;
    }

    static SwipeRefreshLayout2 j(i i1)
    {
        return i1.f;
    }

    static ProgressBar k(i i1)
    {
        return i1.a;
    }

    static bc l(i i1)
    {
        return i1.d;
    }

    static bc m(i i1)
    {
        return i1.d;
    }

    static boolean n(i i1)
    {
        i1.e = false;
        return false;
    }

    static ProgressBar o(i i1)
    {
        return i1.a;
    }

    static boolean p(i i1)
    {
        return i1.g;
    }

    static SwipeRefreshLayout2 q(i i1)
    {
        return i1.f;
    }

    static e r(i i1)
    {
        return i1.m;
    }

    static e s(i i1)
    {
        return i1.m;
    }

    static e t(i i1)
    {
        return i1.m;
    }

    static e u(i i1)
    {
        return i1.m;
    }

    static bc v(i i1)
    {
        return i1.d;
    }

    static bc w(i i1)
    {
        return i1.d;
    }

    static PinnedListView2 x(i i1)
    {
        return i1.b;
    }

    static SwipeRefreshLayout2 y(i i1)
    {
        return i1.f;
    }

    static SwipeRefreshLayout2 z(i i1)
    {
        return i1.f;
    }

    public final View a(Context context)
    {
        context = new ab(context);
        context.a((new StringBuilder("#")).append(v).toString());
        context.a(u);
        return context;
    }

    protected final void a(e e1, boolean flag, boolean flag1)
    {
        super.a(e1, flag, flag1);
        if (x != 1)
        {
            b.a_(x);
            x = 1;
        }
    }

    public final void a(String s1, e e1, int i1, String s2)
    {
        v = s1;
        m = e1;
        x = i1;
        y = s2;
    }

    protected final void a(boolean flag)
    {
        super.a(flag);
        al.g().b(getActivity(), (new StringBuilder("TopicListPage/")).append(v).toString());
        com.roidapp.baselib.c.b.a("TopicListPage", v);
        if (m == null)
        {
            e = true;
            f.a(true);
            a.setVisibility(0);
            a(false, 0).a(this);
            return;
        } else
        {
            a(m, true, false);
            return;
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
                com.roidapp.baselib.c.b.c("TopicListPage", v);
            }
            int i1 = g();
            if (i1 != -1)
            {
                com.roidapp.baselib.c.b.b("TopicListPage", v, i1);
            }
        }
        com.roidapp.baselib.c.b.a("TopicListPage", v, a());
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
        super.f();
        n = true;
        r = true;
    }

    public final boolean j()
    {
        while (w || e || m == null || m.isEmpty()) 
        {
            return false;
        }
        e = true;
        B();
        z = a(true, ((n)m.get(m.size() - 1)).a.a);
        z.a(this);
        return true;
    }

    public final void k()
    {
        if (!s())
        {
            af.a(getActivity(), new l(this), y);
        }
    }

    public final void onRefresh()
    {
        B();
        e = true;
        a(false, 0).l().a(this);
    }
}
