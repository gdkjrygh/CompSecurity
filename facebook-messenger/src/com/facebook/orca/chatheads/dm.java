// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threadview.cl;
import com.facebook.orca.threadview.cm;
import com.facebook.orca.threadview.cn;
import com.facebook.orca.threadview.cp;
import com.facebook.user.User;

// Referenced classes of package com.facebook.orca.chatheads:
//            dh

class dm
    implements cl
{

    final dh a;

    dm(dh dh1)
    {
        a = dh1;
        super();
    }

    public void a(ThreadSummary threadsummary)
    {
        dh.a(a, threadsummary);
    }

    public void a(cn cn)
    {
        dh.a(a, cn);
    }

    public void a(cn cn, cm cm)
    {
        dh.a(a, cn, cm);
    }

    public void a(cn cn, cp cp)
    {
        dh.a(a, cn, cp);
    }

    public void a(User user)
    {
        dh.a(a, user);
    }

    public void b(cn cn)
    {
        dh.b(a, cn);
    }
}
