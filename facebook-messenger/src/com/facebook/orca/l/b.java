// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import com.facebook.orca.server.FetchThreadListResult;
import com.facebook.orca.threads.ThreadsCollection;
import com.google.common.base.Function;

// Referenced classes of package com.facebook.orca.l:
//            a

class b
    implements Function
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public ThreadsCollection a(FetchThreadListResult fetchthreadlistresult)
    {
        return fetchthreadlistresult.b();
    }

    public Object apply(Object obj)
    {
        return a((FetchThreadListResult)obj);
    }
}
