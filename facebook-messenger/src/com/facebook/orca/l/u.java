// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import com.facebook.orca.server.FetchThreadListResult;
import com.google.common.base.Function;

// Referenced classes of package com.facebook.orca.l:
//            a

class u
    implements Function
{

    final a a;

    u(a a1)
    {
        a = a1;
        super();
    }

    public Long a(FetchThreadListResult fetchthreadlistresult)
    {
        return Long.valueOf(fetchthreadlistresult.f());
    }

    public Object apply(Object obj)
    {
        return a((FetchThreadListResult)obj);
    }
}
