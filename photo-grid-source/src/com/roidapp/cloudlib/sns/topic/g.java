// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.topic;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.c.y;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.b.w;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;

// Referenced classes of package com.roidapp.cloudlib.sns.topic:
//            e, a

final class g extends aa
{

    final com.roidapp.cloudlib.sns.topic.e a;

    g(com.roidapp.cloudlib.sns.topic.e e1)
    {
        a = e1;
        super();
    }

    public final void b(int i, Exception exception)
    {
        i = a.u();
        a.c.a();
        if (!l.b(a.getActivity()))
        {
            a.a(at.aG, i);
        } else
        {
            a.a(at.bb, i);
        }
        a.i = false;
        a.h = null;
    }

    public final void c(Object obj)
    {
        obj = (w)obj;
        a.c.a();
        if (obj == null || ((w) (obj)).c == null || ((w) (obj)).c.isEmpty())
        {
            a.i = false;
            a.j = true;
            an.a(a.getActivity(), at.ae);
            a.h = null;
            return;
        } else
        {
            ((w)a.k).c.addAll(((w) (obj)).c);
            ((a)a.d.d()).b(a.k);
            a.d.c();
            ((GridLayoutManager)a.e.b()).e(a.c.d());
            a.i = false;
            a.h = null;
            return;
        }
    }
}
