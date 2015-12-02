// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.tasklist;

import com.facebook.common.w.q;
import com.google.common.a.es;

// Referenced classes of package com.facebook.bugreporter.activity.tasklist:
//            TaskListFragment

class h
    implements com.google.common.d.a.h
{

    final q a;
    final TaskListFragment b;

    h(TaskListFragment tasklistfragment, q q)
    {
        b = tasklistfragment;
        a = q;
        super();
    }

    public void a(es es1)
    {
        TaskListFragment.a(b, es1, a);
    }

    public volatile void a(Object obj)
    {
        a((es)obj);
    }

    public void a(Throwable throwable)
    {
        TaskListFragment.a(b, es.d(), a);
    }
}
