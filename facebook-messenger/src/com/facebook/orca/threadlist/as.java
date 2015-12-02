// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import com.facebook.fbservice.service.OperationResult;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.orca.threadlist:
//            ThreadListFragment

class as
    implements h
{

    final ThreadListFragment a;

    as(ThreadListFragment threadlistfragment)
    {
        a = threadlistfragment;
        super();
    }

    public void a(OperationResult operationresult)
    {
        ThreadListFragment.a(a, null);
    }

    public volatile void a(Object obj)
    {
        a((OperationResult)obj);
    }

    public void a(Throwable throwable)
    {
        ThreadListFragment.a(a, null);
    }
}
