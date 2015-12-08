// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.topic;

import android.support.v7.widget.LinearLayoutManager;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.b.w;
import com.roidapp.cloudlib.sns.basepost.PinnedListView2;
import com.roidapp.cloudlib.sns.basepost.bc;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;

// Referenced classes of package com.roidapp.cloudlib.sns.topic:
//            i

final class k extends aa
{

    final i a;

    k(i j)
    {
        a = j;
        super();
    }

    public final void b(int j, Exception exception)
    {
        i.C(a).e();
        i.D(a).a();
        i.E(a);
        i.B(a);
    }

    public final void c(Object obj)
    {
        obj = (w)obj;
        if (obj == null || ((w) (obj)).c == null || ((w) (obj)).c.isEmpty())
        {
            i.a(a, true);
            an.a(a.getActivity(), at.ae);
        }
        i.v(a).a(((w) (obj)).c);
        i.a(a, (e)com.roidapp.cloudlib.sns.topic.i.w(a).g());
        ((LinearLayoutManager)i.x(a).b()).e(i.y(a).d());
        i.z(a).a();
        i.A(a);
        i.B(a);
        if (!l.b(a.getActivity()))
        {
            i.c(a, at.aG);
        }
    }
}
