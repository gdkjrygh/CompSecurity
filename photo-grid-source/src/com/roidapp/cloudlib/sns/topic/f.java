// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.topic;

import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.b.w;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;

// Referenced classes of package com.roidapp.cloudlib.sns.topic:
//            e

final class f extends aa
{

    final com.roidapp.cloudlib.sns.topic.e a;

    f(com.roidapp.cloudlib.sns.topic.e e1)
    {
        a = e1;
        super();
    }

    public final void b(int i, Exception exception)
    {
        a.c.a(false);
        if (!l.b(a.getActivity()))
        {
            a.a(at.aG, 0);
        } else
        {
            a.a(at.bb, 0);
        }
        a.j = false;
        a.i = false;
    }

    public final volatile void b(Object obj)
    {
        obj = (w)obj;
        a.b(obj);
    }

    public final void c(Object obj)
    {
        obj = (w)obj;
        a.c.a(false);
        a.b(obj);
        obj = a;
        boolean flag;
        if (a.k == null || (((w)a.k).b == null || ((w)a.k).b.isEmpty()) && (((w)a.k).c == null || ((w)a.k).c.isEmpty()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj.j = flag;
        a.i = false;
    }
}
