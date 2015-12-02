// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import com.facebook.orca.threads.ThreadSummary;
import com.google.common.base.Function;

final class ab
    implements Function
{

    final Function a;

    ab(Function function)
    {
        a = function;
        super();
    }

    public Boolean a(ThreadSummary threadsummary)
    {
        return (Boolean)a.apply(threadsummary);
    }

    public Object apply(Object obj)
    {
        return a((ThreadSummary)obj);
    }
}
