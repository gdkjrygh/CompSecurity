// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.facebook.fbservice.c.b;
import com.facebook.orca.server.FetchMoreMessagesParams;
import com.facebook.orca.server.FetchMoreMessagesResult;
import com.facebook.orca.server.FetchThreadParams;
import com.facebook.orca.server.FetchThreadResult;
import com.facebook.orca.server.ThreadCriteria;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.m;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.google.common.a.es;

// Referenced classes of package com.facebook.orca.sms:
//            aa, y, b, e, 
//            bk

public class z
{

    private static final Class a = com/facebook/orca/sms/aa;
    private final y b;
    private bk c;

    public z(y y1, bk bk1)
    {
        b = y1;
        c = bk1;
    }

    public FetchMoreMessagesResult a(FetchMoreMessagesParams fetchmoremessagesparams)
    {
        ThreadCriteria threadcriteria = fetchmoremessagesparams.a();
        long l = fetchmoremessagesparams.c();
        int i = fetchmoremessagesparams.d();
        b b1 = b.FROM_CACHE_UP_TO_DATE;
        fetchmoremessagesparams = threadcriteria.a();
        if (threadcriteria.b() != null)
        {
            fetchmoremessagesparams = threadcriteria.b().b();
            fetchmoremessagesparams = m.a(b.b(fetchmoremessagesparams));
        }
        if (fetchmoremessagesparams == null)
        {
            throw new Exception("Trying to fetch an unknown MmsSms thread");
        } else
        {
            fetchmoremessagesparams = com.facebook.orca.sms.b.b(m.c(fetchmoremessagesparams), i, l);
            return new FetchMoreMessagesResult(b1, b.a(fetchmoremessagesparams), -1L);
        }
    }

    public FetchThreadResult a(FetchThreadParams fetchthreadparams)
    {
        ThreadCriteria threadcriteria = fetchthreadparams.a();
        Object obj1 = b.NO_DATA;
        es.d();
        if (threadcriteria.a() != null)
        {
            long l = m.c(threadcriteria.a());
            Object obj = b.a(l);
            ThreadSummary threadsummary = ((e) (obj)).a();
            es es1 = ((e) (obj)).b();
            e e1;
            int i;
            long l1;
            if (((e) (obj)).b().size() == 1)
            {
                obj = (User)((e) (obj)).b().get(0);
            } else
            {
                obj = null;
            }
        } else
        if (threadcriteria.b() != null)
        {
            obj = threadcriteria.b().b();
            e1 = b.a(((String) (obj)));
            threadsummary = e1.a();
            es1 = e1.b();
            if (e1.b().size() == 1)
            {
                obj = (User)e1.b().get(0);
            } else
            {
                obj = c.a(((String) (obj)));
            }
            if (threadsummary != null)
            {
                l = m.c(threadsummary.a());
            } else
            {
                l = -1L;
            }
        } else
        {
            throw new Exception("Trying to fetch an MmsSms thread without a threadId or a phone number");
        }
        if (threadsummary == null && threadcriteria.b() == null)
        {
            throw new Exception("Couldn't find thread");
        }
        if (threadsummary != null && l != -1L)
        {
            l1 = fetchthreadparams.g();
            i = fetchthreadparams.f();
            fetchthreadparams = b.FROM_CACHE_UP_TO_DATE;
            obj1 = com.facebook.orca.sms.b.a(l, i, l1);
            obj1 = b.a(((com.facebook.orca.sms.b) (obj1)));
        } else
        {
            threadcriteria = null;
            fetchthreadparams = ((FetchThreadParams) (obj1));
            obj1 = threadcriteria;
        }
        return new FetchThreadResult(fetchthreadparams, threadsummary, ((com.facebook.orca.threads.MessagesCollection) (obj1)), es1, ((User) (obj)), System.currentTimeMillis());
    }

}
