// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.facebook.fbservice.c.b;
import com.facebook.orca.server.FetchMoreThreadsParams;
import com.facebook.orca.server.FetchMoreThreadsResult;
import com.facebook.orca.server.FetchThreadListParams;
import com.facebook.orca.server.FetchThreadListResult;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.ThreadsCollection;

// Referenced classes of package com.facebook.orca.sms:
//            c, y, d

public class aa
{

    private static final Class a = com/facebook/orca/sms/aa;
    private final y b;

    public aa(y y1)
    {
        b = y1;
    }

    public FetchMoreThreadsResult a(FetchMoreThreadsParams fetchmorethreadsparams)
    {
        fetchmorethreadsparams = com.facebook.orca.sms.c.b(fetchmorethreadsparams.c(), fetchmorethreadsparams.b());
        fetchmorethreadsparams = b.a(fetchmorethreadsparams);
        return new FetchMoreThreadsResult(b.FROM_CACHE_UP_TO_DATE, FolderName.d, fetchmorethreadsparams.a(), fetchmorethreadsparams.b(), System.currentTimeMillis());
    }

    public FetchThreadListResult a(FetchThreadListParams fetchthreadlistparams)
    {
        long l = fetchthreadlistparams.c() / 0xf4240L;
        Object obj;
        ThreadsCollection threadscollection;
        com.facebook.orca.threads.FolderCounts foldercounts;
        boolean flag;
        if (fetchthreadlistparams.c() != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = c.a(fetchthreadlistparams.d(), l);
        obj = b.a(((c) (obj)));
        threadscollection = ((d) (obj)).a();
        foldercounts = b.a();
        l = fetchthreadlistparams.c();
        if (threadscollection.e() > 0)
        {
            l = threadscollection.a(0).c();
        }
        return FetchThreadListResult.newBuilder().a(b.FROM_SERVER).a(FolderName.d).a(threadscollection).a(((d) (obj)).b()).a(foldercounts).a(flag).a(System.currentTimeMillis()).b(l).o();
    }

}
