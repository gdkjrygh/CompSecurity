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
//            ag

class aj
    implements cl
{

    final ag a;

    aj(ag ag1)
    {
        a = ag1;
        super();
    }

    public void a(ThreadSummary threadsummary)
    {
        ag.a(a, threadsummary);
    }

    public void a(cn cn)
    {
    }

    public void a(cn cn, cm cm)
    {
    }

    public void a(cn cn, cp cp)
    {
        ag.a(a, cp);
    }

    public void a(User user)
    {
        ag.a(a, user);
    }

    public void b(cn cn)
    {
    }
}
