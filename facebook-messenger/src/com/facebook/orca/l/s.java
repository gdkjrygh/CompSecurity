// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import com.facebook.orca.server.FetchThreadListResult;
import com.facebook.orca.threads.FolderCounts;
import com.google.common.base.Function;

// Referenced classes of package com.facebook.orca.l:
//            a

class s
    implements Function
{

    final a a;

    s(a a1)
    {
        a = a1;
        super();
    }

    public FolderCounts a(FetchThreadListResult fetchthreadlistresult)
    {
        return fetchthreadlistresult.h();
    }

    public Object apply(Object obj)
    {
        return a((FetchThreadListResult)obj);
    }
}
