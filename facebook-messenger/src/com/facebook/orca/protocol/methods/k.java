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
import com.facebook.orca.server.FetchMoreMessagesParams;
import com.facebook.orca.server.FetchMoreMessagesResult;
import com.facebook.orca.server.ThreadCriteria;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.user.UserKey;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            p, q

public class k
    implements f
{

    private final p a;

    public k(p p1)
    {
        a = p1;
    }

    private String b(FetchMoreMessagesParams fetchmoremessagesparams)
    {
        ThreadCriteria threadcriteria = fetchmoremessagesparams.a();
        a a1 = new a();
        if (fetchmoremessagesparams.c() == -1L)
        {
            a.a(a1, m.a("thread_id = '%1$s' AND timestamp >= %2$d", new Object[] {
                threadcriteria.a(), Long.valueOf(fetchmoremessagesparams.b())
            }), "timestamp DESC", fetchmoremessagesparams.d() + 1);
        } else
        {
            a.a(a1, m.a("thread_id = '%1$s' AND timestamp >= %2$d AND timestamp <= %3$d", new Object[] {
                threadcriteria.a(), Long.valueOf(fetchmoremessagesparams.b()), Long.valueOf(fetchmoremessagesparams.c())
            }), "timestamp DESC", fetchmoremessagesparams.d() + 1);
        }
        return a1.a().toString();
    }

    private String c(FetchMoreMessagesParams fetchmoremessagesparams)
    {
        ThreadCriteria threadcriteria = fetchmoremessagesparams.a();
        a a1 = new a();
        a.a(a1, threadcriteria.b().b());
        if (fetchmoremessagesparams.c() == -1L)
        {
            a.a(a1, m.a("thread_id IN (SELECT thread_id FROM #canonical_thread_id) AND timestamp >= %1$d", new Object[] {
                Long.valueOf(fetchmoremessagesparams.b())
            }), "timestamp DESC", fetchmoremessagesparams.d() + 1);
        } else
        {
            a.a(a1, m.a("thread_id IN (SELECT thread_id FROM #canonical_thread_id) AND timestamp >= %1$d AND timestamp <= %2$d", new Object[] {
                Long.valueOf(fetchmoremessagesparams.b()), Long.valueOf(fetchmoremessagesparams.c())
            }), "timestamp DESC", fetchmoremessagesparams.d() + 1);
        }
        return a1.a().toString();
    }

    public n a(FetchMoreMessagesParams fetchmoremessagesparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        if (fetchmoremessagesparams.a().a() != null)
        {
            arraylist.add(new BasicNameValuePair("q", b(fetchmoremessagesparams)));
        } else
        {
            arraylist.add(new BasicNameValuePair("q", c(fetchmoremessagesparams)));
        }
        return new n("fetchMoreMessages", "GET", "fql", arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((FetchMoreMessagesParams)obj);
    }

    public FetchMoreMessagesResult a(FetchMoreMessagesParams fetchmoremessagesparams, r r1)
    {
        Object obj = fetchmoremessagesparams.a();
        b b1 = new b(r1.c());
        obj = ((ThreadCriteria) (obj)).a();
        r1 = ((r) (obj));
        if (obj == null)
        {
            r1 = a.c(b1);
        }
        obj = a.a(b1, fetchmoremessagesparams.d());
        boolean flag1 = false;
        boolean flag = flag1;
        if (fetchmoremessagesparams.b() <= 0L)
        {
            flag = flag1;
            if (((q) (obj)).b < fetchmoremessagesparams.d() + 1)
            {
                flag = true;
            }
        }
        fetchmoremessagesparams = new MessagesCollection(r1, ((q) (obj)).a, flag);
        return new FetchMoreMessagesResult(com.facebook.fbservice.c.b.FROM_SERVER, fetchmoremessagesparams, System.currentTimeMillis());
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((FetchMoreMessagesParams)obj, r1);
    }
}
