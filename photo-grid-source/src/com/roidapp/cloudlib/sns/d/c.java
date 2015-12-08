// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.d;

import android.support.v7.widget.LinearLayoutManager;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.basepost.PinnedListView2;
import com.roidapp.cloudlib.sns.basepost.bc;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;

// Referenced classes of package com.roidapp.cloudlib.sns.d:
//            a

final class c extends aa
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public final void b(int i, Exception exception)
    {
        com.roidapp.cloudlib.sns.d.a.F(a).e();
        com.roidapp.cloudlib.sns.d.a.z(a);
        if (com.roidapp.cloudlib.sns.d.a.G(a).c())
        {
            com.roidapp.cloudlib.sns.d.a.H(a).a();
        }
        if (!l.b(a.getActivity()))
        {
            com.roidapp.cloudlib.sns.d.a.c(a, at.aG);
        }
        com.roidapp.cloudlib.sns.d.a.I(a);
    }

    public final void c(Object obj)
    {
        obj = (e)obj;
        if (obj == null || ((e) (obj)).isEmpty())
        {
            com.roidapp.cloudlib.sns.d.a.a(a, true);
            an.a(a.getActivity(), at.ae);
        }
        obj = com.roidapp.cloudlib.sns.d.a.a(((e) (obj)));
        com.roidapp.cloudlib.sns.d.a.y(a).a(((e) (obj)));
        com.roidapp.cloudlib.sns.d.a.z(a);
        com.roidapp.cloudlib.sns.d.a.A(a);
        ((LinearLayoutManager)com.roidapp.cloudlib.sns.d.a.B(a).b()).e(com.roidapp.cloudlib.sns.d.a.C(a).d());
        if (com.roidapp.cloudlib.sns.d.a.D(a).c())
        {
            com.roidapp.cloudlib.sns.d.a.E(a).a();
        }
    }
}
