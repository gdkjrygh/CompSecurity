// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import android.text.TextUtils;
import com.facebook.http.e.a;
import com.facebook.http.e.b;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.messages.model.threads.Message;
import com.facebook.orca.server.FetchThreadParams;
import com.facebook.orca.server.FetchThreadResult;
import com.facebook.orca.server.ThreadCriteria;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.es;
import com.google.common.a.hq;
import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            p, r, q

public class s
    implements f
{

    private final p a;

    public s(p p1)
    {
        a = p1;
    }

    private MessagesCollection a(String s1, List list, long l, int i)
    {
        boolean flag;
        if (l < 0L && list.size() < i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new MessagesCollection(s1, es.a(list), flag);
    }

    private User a(ThreadSummary threadsummary, es es1)
    {
        for (es1 = es1.iterator(); es1.hasNext();)
        {
            User user = (User)es1.next();
            if (user.c().equals(threadsummary.i()))
            {
                return user;
            }
        }

        throw new IllegalArgumentException("No matching user was found in the returned users list");
    }

    private es a(Map map, ThreadSummary threadsummary)
    {
        java.util.ArrayList arraylist = hq.a();
        for (threadsummary = threadsummary.j().iterator(); threadsummary.hasNext(); arraylist.add(map.get(((ThreadParticipant)threadsummary.next()).d()))) { }
        return es.a(arraylist);
    }

    public n a(FetchThreadParams fetchthreadparams)
    {
        Preconditions.checkNotNull(fetchthreadparams.a().c());
        a a1;
        String s1;
        int i;
        boolean flag;
        if (!fetchthreadparams.a().c().isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        a1 = new a();
        s1 = TextUtils.join(",", fetchthreadparams.a().c());
        i = fetchthreadparams.a().c().size();
        a.c(a1, s1);
        a.a(a1, (new StringBuilder()).append("single_recipient in (").append(s1).append(")").toString(), i, false, false);
        if (fetchthreadparams.f() != 0)
        {
            a.a(a1, "thread_id IN (SELECT thread_id FROM #threads)", "timestamp DESC", i + fetchthreadparams.f());
        }
        fetchthreadparams = hq.a();
        fetchthreadparams.add(new BasicNameValuePair("format", "json"));
        fetchthreadparams.add(new BasicNameValuePair("q", a1.a().toString()));
        return new n("fetchThreads", "GET", "fql", fetchthreadparams, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((FetchThreadParams)obj);
    }

    public es a(FetchThreadParams fetchthreadparams, r r1)
    {
        int i = fetchthreadparams.a().c().size();
        Object obj1 = new b(r1.c());
        Object obj = a.a(((b) (obj1)), false, i);
        r1 = ik.a();
        User user;
        for (Iterator iterator = ((com.facebook.orca.protocol.methods.r) (obj)).d.iterator(); iterator.hasNext(); r1.put(user.c(), user))
        {
            user = (User)iterator.next();
        }

        es es1 = a.b(((b) (obj1)));
        Object obj2 = a.a(((b) (obj1)), fetchthreadparams.f());
        obj1 = ik.a();
        for (obj2 = ((q) (obj2)).a.iterator(); ((Iterator) (obj2)).hasNext();)
        {
            Message message = (Message)((Iterator) (obj2)).next();
            if (!((Map) (obj1)).containsKey(message.e()))
            {
                ((Map) (obj1)).put(message.e(), hq.a(new Message[] {
                    message
                }));
            } else
            {
                ((List)((Map) (obj1)).get(message.e())).add(message);
            }
        }

        i = fetchthreadparams.f() / i;
        obj2 = hq.a();
        obj = ((com.facebook.orca.protocol.methods.r) (obj)).a.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ThreadSummary threadsummary = (ThreadSummary)((Iterator) (obj)).next();
            if (((Map) (obj1)).containsKey(threadsummary.a()))
            {
                ((List) (obj2)).add(new FetchThreadResult(com.facebook.fbservice.c.b.FROM_SERVER, threadsummary, a(threadsummary.a(), (List)((Map) (obj1)).get(threadsummary.a()), fetchthreadparams.g(), i), a(((Map) (r1)), threadsummary), a(threadsummary, es1), System.currentTimeMillis()));
            }
        } while (true);
        return es.a(((java.util.Collection) (obj2)));
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((FetchThreadParams)obj, r1);
    }
}
