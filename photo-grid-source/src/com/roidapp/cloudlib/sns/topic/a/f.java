// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.topic.a;

import android.support.v7.widget.LinearLayoutManager;
import android.widget.ProgressBar;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.basepost.PinnedListView2;
import com.roidapp.cloudlib.sns.basepost.bc;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;

// Referenced classes of package com.roidapp.cloudlib.sns.topic.a:
//            e

final class f extends aa
{

    final com.roidapp.cloudlib.sns.topic.a.e a;

    f(com.roidapp.cloudlib.sns.topic.a.e e1)
    {
        a = e1;
        super();
    }

    public final void b(int i, Exception exception)
    {
        e.m(a).setVisibility(8);
        if (e.b(a))
        {
            e.n(a).a();
            e.i(a);
        } else
        {
            e.o(a).a(false);
        }
        if (e.p(a) != null)
        {
            if (e.b(a))
            {
                e.q(a).e();
            } else
            {
                e.r(a).a(false);
            }
        }
        if (!l.b(a.getActivity()))
        {
            e.a(a, at.aG);
        } else
        {
            e.b(a, at.bb);
        }
        e.s(a);
        e.a(a, false);
    }

    public final void b(Object obj)
    {
        obj = (e)obj;
        e.t(a).setVisibility(8);
        if (!e.u(a))
        {
            e.v(a).a(false);
        }
        a.a(((e) (obj)), true, true);
    }

    public final void c(Object obj)
    {
        obj = (e)obj;
        e.a(a).setVisibility(8);
        if (obj == null || ((e) (obj)).isEmpty())
        {
            e.a(a, true);
        }
        if (e.b(a))
        {
            if (e.c(a))
            {
                an.a(a.getActivity(), at.ae);
            } else
            if (e.d(a) != null)
            {
                com.roidapp.cloudlib.sns.topic.a.e.e(a).a(((e) (obj)));
                ((LinearLayoutManager)e.f(a).b()).e(e.g(a).d());
            }
            e.h(a).a();
            e.i(a);
        } else
        {
            e.a(a, false);
            e.j(a).a(false);
            a.a(((e) (obj)), true, true);
        }
        e.k(a);
        com.roidapp.cloudlib.sns.topic.a.e.l(a);
    }
}
