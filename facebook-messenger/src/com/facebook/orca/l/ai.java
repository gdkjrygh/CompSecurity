// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import com.facebook.orca.threads.ThreadSummary;
import com.google.common.base.Function;

// Referenced classes of package com.facebook.orca.l:
//            x

class ai
    implements Function
{

    private ai()
    {
    }

    ai(x x)
    {
        this();
    }

    public Boolean a(ThreadSummary threadsummary)
    {
        return Boolean.valueOf(threadsummary.u());
    }

    public Object apply(Object obj)
    {
        return a((ThreadSummary)obj);
    }
}
