// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.topic;

import android.widget.ProgressBar;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.b.w;
import com.roidapp.cloudlib.sns.basepost.bc;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;

// Referenced classes of package com.roidapp.cloudlib.sns.topic:
//            i

final class j extends aa
{

    final i a;

    j(i k)
    {
        a = k;
        super();
    }

    public final void b(int k, Exception exception)
    {
        i.j(a).a(false);
        i.k(a).setVisibility(8);
        if (com.roidapp.cloudlib.sns.topic.i.l(a) != null)
        {
            i.m(a).a(false);
        }
        if (!l.b(a.getActivity()))
        {
            i.a(a, at.aG);
        } else
        {
            i.b(a, at.I);
        }
        i.n(a);
    }

    public final void b(Object obj)
    {
        obj = (w)obj;
        i.o(a).setVisibility(8);
        if (!i.p(a))
        {
            i.q(a).a(false);
        }
        if (obj != null)
        {
            i.r(a).clear();
            if (((w) (obj)).b != null)
            {
                i.s(a).addAll(((w) (obj)).b);
            }
            if (((w) (obj)).c != null)
            {
                i.t(a).addAll(((w) (obj)).c);
            }
        }
        a.a(i.u(a), true, true);
    }

    public final void c(Object obj)
    {
        obj = (w)obj;
        i.a(a).setVisibility(8);
        i.b(a).a(false);
        if (obj != null)
        {
            i.c(a).clear();
            if (((w) (obj)).b != null && ((w) (obj)).b.size() == 5)
            {
                i.d(a).addAll(((w) (obj)).b);
            }
            if (((w) (obj)).c != null)
            {
                com.roidapp.cloudlib.sns.topic.i.e(a).addAll(((w) (obj)).c);
            }
            a.a(i.f(a), true, true);
        } else
        {
            a.a(i.g(a), true, false);
        }
        i.h(a);
        i.a(a, false);
        i.i(a);
    }
}
