// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import com.facebook.fbservice.c.b;
import com.facebook.orca.server.FetchMoreThreadsResult;
import com.google.common.base.Function;

// Referenced classes of package com.facebook.orca.l:
//            a

class g
    implements Function
{

    final a a;

    g(a a1)
    {
        a = a1;
        super();
    }

    public b a(FetchMoreThreadsResult fetchmorethreadsresult)
    {
        return fetchmorethreadsresult.e();
    }

    public Object apply(Object obj)
    {
        return a((FetchMoreThreadsResult)obj);
    }
}
