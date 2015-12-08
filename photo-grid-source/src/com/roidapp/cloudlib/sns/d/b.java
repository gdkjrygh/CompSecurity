// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.d;

import android.widget.ProgressBar;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.basepost.bc;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;

// Referenced classes of package com.roidapp.cloudlib.sns.d:
//            a

final class b extends aa
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final void b(int i, Exception exception)
    {
        com.roidapp.cloudlib.sns.d.a.h(a).setEnabled(true);
        if (com.roidapp.cloudlib.sns.d.a.i(a).getVisibility() == 0)
        {
            com.roidapp.cloudlib.sns.d.a.j(a).setVisibility(8);
        }
        if (com.roidapp.cloudlib.sns.d.a.k(a) != null)
        {
            com.roidapp.cloudlib.sns.d.a.l(a).a(false);
        }
        if (!l.b(a.getActivity()))
        {
            com.roidapp.cloudlib.sns.d.a.a(a, at.aG);
        } else
        {
            com.roidapp.cloudlib.sns.d.a.b(a, at.I);
        }
        if (com.roidapp.cloudlib.sns.d.a.m(a).b())
        {
            com.roidapp.cloudlib.sns.d.a.n(a).a(false);
        }
        com.roidapp.cloudlib.sns.d.a.o(a);
    }

    public final void b(Object obj)
    {
        obj = (e)obj;
        com.roidapp.cloudlib.sns.d.a.p(a).setEnabled(true);
        if (com.roidapp.cloudlib.sns.d.a.q(a).getVisibility() == 0)
        {
            com.roidapp.cloudlib.sns.d.a.r(a).setVisibility(8);
        }
        if (com.roidapp.cloudlib.sns.d.a.s(a).b() && !com.roidapp.cloudlib.sns.d.a.t(a))
        {
            com.roidapp.cloudlib.sns.d.a.u(a).a(false);
        }
        a.a(((e) (obj)), true, true);
        com.roidapp.cloudlib.sns.d.a.v(a);
        if (!com.roidapp.cloudlib.sns.d.a.w(a).b())
        {
            com.roidapp.cloudlib.sns.d.a.x(a).a(true);
        }
    }

    public final void c(Object obj)
    {
        obj = (e)obj;
        com.roidapp.cloudlib.sns.d.a.a(a).setEnabled(true);
        com.roidapp.cloudlib.sns.d.a.b(a);
        com.roidapp.cloudlib.sns.d.a.a(a, false);
        if (com.roidapp.cloudlib.sns.d.a.c(a).getVisibility() == 0)
        {
            com.roidapp.cloudlib.sns.d.a.d(a).setVisibility(8);
        }
        if (com.roidapp.cloudlib.sns.d.a.e(a).b())
        {
            com.roidapp.cloudlib.sns.d.a.f(a).a(false);
        }
        a.a(((e) (obj)), true, true);
        com.roidapp.cloudlib.sns.d.a.g(a);
    }
}
