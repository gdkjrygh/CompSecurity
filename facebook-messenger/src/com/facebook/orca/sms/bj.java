// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.os.Bundle;
import com.facebook.common.e.h;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.s;
import com.facebook.messages.model.threads.Message;
import com.facebook.orca.prefs.n;
import com.facebook.orca.server.DeleteMessagesParams;
import com.facebook.orca.server.DeleteThreadParams;
import com.facebook.orca.server.FetchMoreMessagesParams;
import com.facebook.orca.server.FetchMoreThreadsParams;
import com.facebook.orca.server.FetchMultipleThreadsParams;
import com.facebook.orca.server.FetchMultipleThreadsResult;
import com.facebook.orca.server.FetchThreadListParams;
import com.facebook.orca.server.FetchThreadParams;
import com.facebook.orca.server.MarkThreadParams;
import com.facebook.orca.server.ModifyThreadParams;
import com.facebook.orca.server.SendMessageByRecipientsParams;
import com.facebook.orca.server.ThreadCriteria;
import com.facebook.orca.server.a;
import com.facebook.orca.server.ac;
import com.facebook.orca.server.ai;
import com.facebook.orca.server.aq;
import com.facebook.orca.threads.m;
import com.facebook.prefs.shared.d;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.fi;
import java.util.Iterator;

// Referenced classes of package com.facebook.orca.sms:
//            bi, aa, z, af, 
//            y

public class bj extends a
    implements e
{

    private static final Class a = com/facebook/orca/sms/bj;
    private final aa b;
    private final z c;
    private final bi d;
    private final y e;
    private final d f;
    private final af g;
    private final h h;

    public bj(aa aa1, z z1, bi bi1, y y1, d d1, af af1, h h1)
    {
        super(a.getSimpleName());
        b = aa1;
        c = z1;
        d = bi1;
        e = y1;
        f = d1;
        g = af1;
        h = h1;
    }

    public OperationResult a(ad ad1)
    {
        com.facebook.debug.d.e e1 = com.facebook.debug.d.e.a(a.getSimpleName());
        OperationType operationtype;
        operationtype = ad1.a();
        if (!aq.w.equals(operationtype))
        {
            break MISSING_BLOCK_LABEL_41;
        }
        ad1 = b(ad1);
        e1.a(10L);
        return ad1;
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown operation type: ").append(operationtype).toString());
        ad1;
        e1.a(10L);
        throw ad1;
    }

    protected OperationResult b(ad ad1)
    {
        ad1 = (Message)ad1.b().getParcelable("outgoingMessage");
        return OperationResult.a(d.a(ad1));
    }

    protected OperationResult b(ad ad1, e e1)
    {
        e1 = com.facebook.debug.d.e.a("MmsSmsServiceHandler.handleFetchThreadList");
        ad1 = (FetchThreadListParams)ad1.b().getParcelable("fetchThreadListParams");
        ad1 = OperationResult.a(b.a(ad1));
        e1.a();
        return ad1;
        ad1;
        h.a(a.getSimpleName(), "failed to fetch MmsSms ThreadList", ad1);
        throw ad1;
        ad1;
        e1.a();
        throw ad1;
    }

    protected OperationResult c(ad ad1, e e1)
    {
        e1 = com.facebook.debug.d.e.a("MmsSmsServiceHandler.handleFetchMoreThreads");
        ad1 = (FetchMoreThreadsParams)ad1.b().getParcelable("fetchMoreThreadsParams");
        ad1 = OperationResult.a(b.a(ad1));
        e1.a();
        return ad1;
        ad1;
        h.a(a.getSimpleName(), "failed to fetch more MmsSms Threads", ad1);
        throw ad1;
        ad1;
        e1.a();
        throw ad1;
    }

    protected OperationResult d(ad ad1, e e1)
    {
        e1 = com.facebook.debug.d.e.a("MmsSmsServiceHandler.handleFetchThread");
        ad1 = (FetchThreadParams)ad1.b().getParcelable("fetchThreadParams");
        ad1 = OperationResult.a(c.a(ad1));
        e1.a();
        return ad1;
        ad1;
        h.a(a.getSimpleName(), "failed to fetch MmsSms Thread", ad1);
        throw ad1;
        ad1;
        e1.a();
        throw ad1;
    }

    protected OperationResult e(ad ad1, e e1)
    {
        boolean flag;
        boolean flag1;
        ad1 = (SendMessageByRecipientsParams)ad1.b().getParcelable("createThreadParams");
        flag1 = false;
        flag = false;
        e1 = d.a(ad1);
        flag1 = true;
        flag = true;
        e1 = OperationResult.a(e1);
        g.a(ad1.d().size(), true);
        return e1;
        e1;
        flag1 = flag;
        h.a(a.getSimpleName(), "failed to create MmsSms Thread", e1);
        flag1 = flag;
        throw e1;
        e1;
        g.a(ad1.d().size(), flag1);
        throw e1;
    }

    protected OperationResult j(ad ad1, e e1)
    {
        ad1 = (MarkThreadParams)ad1.b().getParcelable("markThreadParams");
        e1 = ad1.a();
        if (ad1.b() == ai.READ && ad1.c())
        {
            long l = com.facebook.orca.threads.m.c(e1);
            e.c(l);
        }
        return OperationResult.b();
    }

    protected OperationResult m(ad ad1, e e1)
    {
        long l;
        boolean flag;
        boolean flag1;
        ad1 = ((DeleteThreadParams)ad1.b().getParcelable("deleteThreadParams")).a();
        l = com.facebook.orca.threads.m.c(ad1);
        flag1 = false;
        flag = false;
        e.d(l);
        flag1 = true;
        flag = true;
        e1 = OperationResult.b();
        g.b(ad1, true);
        return e1;
        e1;
        flag1 = flag;
        h.a(a.getSimpleName(), "failed to delete MmsSms thread", e1);
        flag1 = flag;
        throw e1;
        e1;
        g.b(ad1, flag1);
        throw e1;
    }

    protected OperationResult n(ad ad1, e e1)
    {
        int i;
        e1 = ((DeleteMessagesParams)ad1.b().getParcelable("deleteMessagesParams")).b().iterator();
        i = 0;
_L1:
        if (!e1.hasNext())
        {
            break MISSING_BLOCK_LABEL_111;
        }
        ad1 = (String)e1.next();
        e.c(ad1);
        g.c(ad1, true);
          goto _L1
        Exception exception;
        exception;
        h.a(a.getSimpleName(), "failed to delete MmsSms messages", exception);
        g.c(ad1, false);
        i++;
          goto _L1
        e1;
        g.c(ad1, false);
        throw e1;
        if (i > 0)
        {
            throw new Exception("Some Mms or Sms message deletes failed");
        } else
        {
            return OperationResult.b();
        }
    }

    protected OperationResult o(ad ad1, e e1)
    {
        ad1 = (ModifyThreadParams)ad1.b().getParcelable("modifyThreadParams");
        ad1 = (new ac()).a(s.CHECK_SERVER_FOR_NEW_DATA).a(ThreadCriteria.a(ad1.a())).a(2).h();
        return OperationResult.a(c.a(ad1));
    }

    protected OperationResult q(ad ad1, e e1)
    {
        ad1 = f.b();
        ad1.a(n.e, System.currentTimeMillis());
        ad1.a();
        return OperationResult.b();
    }

    protected OperationResult t(ad ad1, e e1)
    {
        e1 = com.facebook.debug.d.e.a("MmsSmsServiceHandler.handleFetchMoreMessages");
        ad1 = (FetchMoreMessagesParams)ad1.b().getParcelable("fetchMoreMessagesParams");
        ad1 = OperationResult.a(c.a(ad1));
        e1.a();
        return ad1;
        ad1;
        h.a(a.getSimpleName(), "failed to fetch more MmsSms messages", ad1);
        throw ad1;
        ad1;
        e1.a();
        throw ad1;
    }

    protected OperationResult u(ad ad1, e e1)
    {
label0:
        {
            e1 = com.facebook.debug.d.e.a("MmsSmsServiceHandler.handleFetchMultipleThreads");
            try
            {
                Object obj = (FetchMultipleThreadsParams)ad1.b().getParcelable("fetchMultipleThreadsParams");
                ad1 = es.e();
                FetchThreadParams fetchthreadparams;
                for (obj = ((FetchMultipleThreadsParams) (obj)).b().iterator(); ((Iterator) (obj)).hasNext(); ad1.b(c.a(fetchthreadparams)))
                {
                    fetchthreadparams = (FetchThreadParams)((Iterator) (obj)).next();
                }

                break label0;
            }
            // Misplaced declaration of an exception variable
            catch (ad ad1) { }
            finally
            {
                e1.a();
                throw ad1;
            }
        }
        h.a(a.getSimpleName(), "failed to fetch multiple MmsSms Threads", ad1);
        throw ad1;
        ad1 = OperationResult.a(new FetchMultipleThreadsResult(ad1.b()));
        e1.a();
        return ad1;
    }

}
