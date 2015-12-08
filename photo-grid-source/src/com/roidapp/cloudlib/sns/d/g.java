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
//            f

final class g extends aa
{

    final f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    public final void b(int i, Exception exception)
    {
        if (f.h(a).getVisibility() == 0)
        {
            f.i(a).setVisibility(8);
        }
        if (f.j(a) != null)
        {
            f.k(a).a(false);
        }
        if (!l.b(a.getActivity()))
        {
            f.a(a, at.aG);
        } else
        {
            f.b(a, at.t);
        }
        if (com.roidapp.cloudlib.sns.d.f.l(a).b())
        {
            f.m(a).a(false);
        }
        f.n(a);
    }

    public final void b(Object obj)
    {
        obj = (e)obj;
        if (f.o(a).getVisibility() == 0)
        {
            f.p(a).setVisibility(8);
        }
        if (f.q(a).b() && !f.r(a))
        {
            f.s(a).a(false);
        }
        a.a(((e) (obj)), true, true);
        f.t(a);
    }

    public final void c(Object obj)
    {
        obj = (e)obj;
        f.a(a);
        f.b(a);
        if (f.c(a).getVisibility() == 0)
        {
            f.d(a).setVisibility(8);
        }
        if (com.roidapp.cloudlib.sns.d.f.e(a).b())
        {
            f.f(a).a(false);
        }
        a.a(((e) (obj)), true, true);
        f.g(a);
    }
}
