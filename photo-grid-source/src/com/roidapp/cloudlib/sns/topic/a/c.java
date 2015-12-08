// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.topic.a;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.c.y;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.topic.a;

// Referenced classes of package com.roidapp.cloudlib.sns.topic.a:
//            b

final class c extends aa
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public final void b(int i, Exception exception)
    {
        i = 0;
        if (com.roidapp.cloudlib.sns.topic.a.b.b(a))
        {
            i = a.u();
            com.roidapp.cloudlib.sns.topic.a.b.r(a).a();
            com.roidapp.cloudlib.sns.topic.a.b.s(a);
        } else
        {
            com.roidapp.cloudlib.sns.topic.a.b.t(a).a(false);
        }
        if (!l.b(a.getActivity()))
        {
            com.roidapp.cloudlib.sns.topic.a.b.a(a, at.aG, i);
        } else
        {
            com.roidapp.cloudlib.sns.topic.a.b.b(a, at.bc, i);
        }
        com.roidapp.cloudlib.sns.topic.a.b.u(a);
        com.roidapp.cloudlib.sns.topic.a.b.v(a);
    }

    public final volatile void b(Object obj)
    {
        obj = (e)obj;
        com.roidapp.cloudlib.sns.topic.a.b.b(a, obj);
    }

    public final void c(Object obj)
    {
        obj = (e)obj;
        if (obj == null || ((e) (obj)).isEmpty())
        {
            com.roidapp.cloudlib.sns.topic.a.b.a(a);
        }
        if (com.roidapp.cloudlib.sns.topic.a.b.b(a))
        {
            if (com.roidapp.cloudlib.sns.topic.a.b.c(a))
            {
                an.a(a.getActivity(), at.ae);
            } else
            if (com.roidapp.cloudlib.sns.topic.a.b.d(a) != null)
            {
                com.roidapp.cloudlib.sns.topic.a.b.e(a);
                ((e)com.roidapp.cloudlib.sns.topic.a.b.f(a)).addAll(((java.util.Collection) (obj)));
                ((a)com.roidapp.cloudlib.sns.topic.a.b.h(a).d()).b(com.roidapp.cloudlib.sns.topic.a.b.g(a));
                com.roidapp.cloudlib.sns.topic.a.b.i(a).c();
                ((GridLayoutManager)com.roidapp.cloudlib.sns.topic.a.b.j(a).b()).e(com.roidapp.cloudlib.sns.topic.a.b.k(a).d());
            }
            com.roidapp.cloudlib.sns.topic.a.b.l(a).a();
            com.roidapp.cloudlib.sns.topic.a.b.m(a);
        } else
        {
            com.roidapp.cloudlib.sns.topic.a.b.n(a);
            com.roidapp.cloudlib.sns.topic.a.b.o(a);
            com.roidapp.cloudlib.sns.topic.a.b.p(a).a(false);
            com.roidapp.cloudlib.sns.topic.a.b.a(a, obj);
        }
        com.roidapp.cloudlib.sns.topic.a.b.q(a);
    }
}
