// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.topic;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.au;
import android.view.View;
import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.ab;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.q;
import com.roidapp.cloudlib.sns.b.w;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.f.a;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.o;

// Referenced classes of package com.roidapp.cloudlib.sns.topic:
//            b, f, g, i, 
//            h, d, a

public final class e extends com.roidapp.cloudlib.sns.topic.b
{

    private final aa m = new f(this);
    private final aa n = new g(this);

    public e()
    {
    }

    private o a(boolean flag, int j)
    {
        i = true;
        if (af.a(getActivity()))
        {
            g = q.a(getActivity()).c();
            f = g.b;
            if (!flag)
            {
                return com.roidapp.cloudlib.sns.q.b(g.a, f.a, a, j, m);
            } else
            {
                return com.roidapp.cloudlib.sns.q.b(g.a, f.a, a, j, n);
            }
        }
        if (!flag)
        {
            return com.roidapp.cloudlib.sns.q.a(a, j, m);
        } else
        {
            return com.roidapp.cloudlib.sns.q.a(a, j, n);
        }
    }

    public final View a(Context context)
    {
        context = new ab(context);
        context.a((new StringBuilder("#")).append(a).toString());
        context.a(u);
        return context;
    }

    protected final void a(n n1)
    {
        com.roidapp.cloudlib.sns.b.a.e e1 = new com.roidapp.cloudlib.sns.b.a.e();
        if (((w)k).b != null && ((w)k).b.size() == 5)
        {
            e1.addAll(((w)k).b);
        }
        if (((w)k).c != null)
        {
            e1.addAll(((w)k).c);
        }
        int j = e1.indexOf(n1);
        n1 = new i();
        n1.a(a, e1, j + 1, b);
        a(((com.roidapp.cloudlib.sns.main.b) (n1)));
    }

    protected final void a(boolean flag)
    {
        super.a(flag);
        com.roidapp.cloudlib.sns.f.a.a().a(String.format(b, new Object[] {
            a
        }), 1);
        if (flag)
        {
            c.a(true);
            a(false, 0).a(this);
        } else
        if (d == null || k == null)
        {
            c.a(true);
            a(false, 0).a(this);
        } else
        {
            c.a(i);
            b(k);
        }
        al.g().b(getActivity(), (new StringBuilder("TopicPage/")).append(a).toString());
        com.roidapp.baselib.c.b.a("TopicPage", a);
    }

    protected final boolean a(Object obj)
    {
        obj = (w)obj;
        return obj != null && (((w) (obj)).a != null || ((w) (obj)).b != null && !((w) (obj)).b.isEmpty() || ((w) (obj)).c != null && !((w) (obj)).c.isEmpty());
    }

    protected final void b()
    {
        super.b();
        if (h != null)
        {
            h.f();
            if (c.c())
            {
                c.a();
            }
            i = false;
        }
        if (d != null)
        {
            if (j())
            {
                com.roidapp.baselib.c.b.c("TopicPage", a);
            }
            int j = k();
            if (j != -1)
            {
                com.roidapp.baselib.c.b.b("TopicPage", a, j);
            }
        }
        com.roidapp.baselib.c.b.a("TopicPage", a, a());
    }

    protected final void d()
    {
        l = true;
    }

    protected final au f()
    {
        getActivity();
        GridLayoutManager gridlayoutmanager = new GridLayoutManager(2);
        gridlayoutmanager.a(new h(this));
        return gridlayoutmanager;
    }

    protected final com.roidapp.cloudlib.sns.topic.a g()
    {
        return new d(this, this);
    }

    protected final boolean l()
    {
        if (j || i)
        {
            return false;
        }
        if (k != null && ((w)k).c != null && !((w)k).c.isEmpty())
        {
            h = a(true, ((n)((w)k).c.get(((w)k).c.size() - 1)).a.a);
            h.a(this);
            return true;
        } else
        {
            return false;
        }
    }

    public final void onRefresh()
    {
        m();
        a(false, 0).l().a(this);
    }
}
