// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.m;
import com.google.common.base.Predicate;

// Referenced classes of package com.facebook.orca.threadlist:
//            af

class ai
    implements Predicate
{

    final af a;

    ai(af af)
    {
        a = af;
        super();
    }

    public boolean a(ThreadSummary threadsummary)
    {
        return m.g(threadsummary.a());
    }

    public boolean apply(Object obj)
    {
        return a((ThreadSummary)obj);
    }
}
