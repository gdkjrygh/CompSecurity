// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.notification;

import android.widget.ProgressBar;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;

// Referenced classes of package com.roidapp.cloudlib.sns.notification:
//            s

final class t extends aa
{

    final s a;

    t(s s1)
    {
        a = s1;
        super();
    }

    public final void b(int i, Exception exception)
    {
        com.roidapp.cloudlib.sns.notification.s.e(a);
        if (!s.f(a))
        {
            return;
        }
        if (s.g(a).b())
        {
            s.h(a).a(false);
        }
        s.i(a);
        s.j(a).setVisibility(8);
    }

    public final void c(Object obj)
    {
        obj = (n)obj;
        s.a(a);
        if (s.b(a).b())
        {
            s.c(a).a(false);
        }
        s.d(a).setVisibility(8);
        s.a(a, ((n) (obj)));
        e e1 = new e();
        e1.add(obj);
        a.a(e1, true, true);
    }
}
