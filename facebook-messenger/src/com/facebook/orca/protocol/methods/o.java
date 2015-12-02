// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.common.w.m;
import com.facebook.http.e.a;
import com.facebook.http.e.b;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.orca.server.FetchThreadParams;
import com.facebook.orca.server.FetchThreadResult;
import com.facebook.orca.server.ThreadCriteria;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.user.UserKey;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.es;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            p, r, q

public class o
    implements f
{

    private static final Class a = com/facebook/orca/protocol/methods/o;
    private final p b;

    public o(p p1)
    {
        b = p1;
    }

    private String b(FetchThreadParams fetchthreadparams)
    {
        a a1 = new a();
        b.a(a1, (new StringBuilder()).append("thread_id='").append(fetchthreadparams.a().a()).append("'").toString(), 1, false, true);
        if (fetchthreadparams.f() != 0)
        {
            b.a(a1, (new StringBuilder()).append("thread_id='").append(fetchthreadparams.a().a()).append("'").toString(), "timestamp DESC", fetchthreadparams.f() + 1);
        }
        return a1.a().toString();
    }

    private String c(FetchThreadParams fetchthreadparams)
    {
        a a1 = new a();
        b.a(a1, (new StringBuilder()).append("thread_id='").append(fetchthreadparams.a().a()).append("'").toString(), 1, false, true);
        if (fetchthreadparams.f() != 0)
        {
            b.a(a1, m.a("thread_id='%1$s' AND timestamp > %2$d", new Object[] {
                fetchthreadparams.a().a(), Long.valueOf(fetchthreadparams.g())
            }), "timestamp DESC", fetchthreadparams.f() + 1);
        }
        return a1.a().toString();
    }

    private String d(FetchThreadParams fetchthreadparams)
    {
        a a1 = new a();
        b.b(a1, fetchthreadparams.a().b().b());
        b.a(a1, (new StringBuilder()).append("single_recipient='").append(fetchthreadparams.a().b().b()).append("'").toString(), 1, false, true);
        if (fetchthreadparams.f() != 0)
        {
            b.a(a1, "thread_id IN (SELECT thread_id FROM #threads)", "timestamp DESC", fetchthreadparams.f() + 1);
        }
        return a1.a().toString();
    }

    public n a(FetchThreadParams fetchthreadparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        if (fetchthreadparams.a().b() != null)
        {
            arraylist.add(new BasicNameValuePair("q", d(fetchthreadparams)));
        } else
        if (fetchthreadparams.g() == -1L)
        {
            arraylist.add(new BasicNameValuePair("q", b(fetchthreadparams)));
        } else
        {
            arraylist.add(new BasicNameValuePair("q", c(fetchthreadparams)));
        }
        return new n("fetchThread", "GET", "fql", arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((FetchThreadParams)obj);
    }

    public FetchThreadResult a(FetchThreadParams fetchthreadparams, r r1)
    {
        boolean flag = true;
        Object obj = new b(r1.c());
        com.facebook.orca.protocol.methods.r r2 = b.a(((b) (obj)), false, 1);
        if (fetchthreadparams.a().b() != null)
        {
            com.facebook.user.User user = b.a(((b) (obj)));
            r1 = user;
            if (user == null)
            {
                throw new Exception("Couldn't find canonical user");
            }
        } else
        {
            r1 = null;
        }
        if (r2.a.size() == 0)
        {
            if (fetchthreadparams.a().b() == null)
            {
                throw new Exception("Couldn't find thread");
            } else
            {
                return new FetchThreadResult(com.facebook.fbservice.c.b.FROM_SERVER, null, null, null, r1, System.currentTimeMillis());
            }
        }
        if (r2.a.size() > 1)
        {
            throw new Exception("Invalid api response - multiple threads in fetchThread");
        }
        ThreadSummary threadsummary = (ThreadSummary)r2.a.get(0);
        obj = b.a(((b) (obj)), fetchthreadparams.f());
        if (fetchthreadparams.g() >= 0L || ((q) (obj)).b >= fetchthreadparams.f())
        {
            flag = false;
        }
        fetchthreadparams = new MessagesCollection(threadsummary.a(), ((q) (obj)).a, flag);
        return new FetchThreadResult(com.facebook.fbservice.c.b.FROM_SERVER, threadsummary, fetchthreadparams, r2.d, r1, System.currentTimeMillis());
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((FetchThreadParams)obj, r1);
    }

}
