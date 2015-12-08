// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.h;

import android.support.v7.widget.LinearLayoutManager;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.basepost.PinnedListView2;
import com.roidapp.cloudlib.sns.basepost.bc;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;

// Referenced classes of package com.roidapp.cloudlib.sns.h:
//            h

final class i extends aa
{

    final h a;

    i(h h1)
    {
        a = h1;
        super();
    }

    public final void b(int j, Exception exception)
    {
        if (a.getActivity() == null)
        {
            return;
        }
        if (h.k(a).c())
        {
            h.l(a).a();
            h.m(a).setEnabled(true);
            h.n(a);
        }
        h.a(a, at.aG);
        h.o(a).e();
        h.j(a);
    }

    public final void c(Object obj)
    {
        obj = (e)obj;
        if (h.a(a))
        {
            if (h.b(a).c())
            {
                h.c(a).a();
                h.d(a).setEnabled(true);
                com.roidapp.cloudlib.sns.h.h.e(a);
            }
            if (obj == null || ((e) (obj)).size() < 10)
            {
                h.f(a);
            }
            h.g(a).a(((e) (obj)));
            ((LinearLayoutManager)h.h(a).b()).e(h.i(a).d());
            h.j(a);
        }
    }
}
