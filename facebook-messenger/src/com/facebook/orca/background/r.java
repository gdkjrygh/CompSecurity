// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.background;

import com.facebook.common.time.a;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.orca.server.FetchGroupThreadsResult;
import com.facebook.orca.threads.ThreadsCollection;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.google.common.a.es;

// Referenced classes of package com.facebook.orca.background:
//            q, n

class r extends com.facebook.backgroundtasks.r
{

    final q a;

    r(q q1, Class class1)
    {
        a = q1;
        super(class1);
    }

    public void a(OperationResult operationresult)
    {
        super.a(operationresult);
        operationresult = (FetchGroupThreadsResult)operationresult.i();
        int i;
        if (operationresult != null)
        {
            i = operationresult.a().b().size();
        } else
        {
            i = 0;
        }
        q.b(a).b().a(n.b, com.facebook.orca.background.q.a(a).a()).a(n.c, i).a();
        q.c(a).a("com.facebook.intent.action.TOP_GROUP_THREADS_SYNC_PROGRESS");
    }

    public volatile void a(Object obj)
    {
        a((OperationResult)obj);
    }
}
