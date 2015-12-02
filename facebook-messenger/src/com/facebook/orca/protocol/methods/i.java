// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.common.time.a;
import com.facebook.common.w.m;
import com.facebook.common.w.n;
import com.facebook.http.e.b;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.orca.server.FetchGroupThreadsParams;
import com.facebook.orca.server.FetchGroupThreadsResult;
import com.facebook.orca.server.j;
import com.facebook.orca.threads.ThreadsCollection;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            p, r

public class i
    implements f
{

    private static final Class a = com/facebook/orca/protocol/methods/i;
    private final p b;
    private final a c;

    public i(p p1, a a1)
    {
        b = p1;
        c = a1;
    }

    private String b(FetchGroupThreadsParams fetchgroupthreadsparams)
    {
        Object obj = fetchgroupthreadsparams.c();
        StringBuilder stringbuilder = new StringBuilder();
        if (!n.c(((CharSequence) (obj))))
        {
            stringbuilder.append(m.a("CONTAINS('%1$s', thread_and_participants_name) AND ", new Object[] {
                obj
            }));
        }
        stringbuilder.append("folder='inbox' AND not archived AND is_group_conversation=1");
        if (fetchgroupthreadsparams.a() == j.TOP_RANKED)
        {
            long l = c.a();
            stringbuilder.append(" AND is_named_conversation=1 AND timestamp > ").append(l - 0x48190800L);
        }
        obj = new com.facebook.http.e.a();
        b.a(((com.facebook.http.e.a) (obj)));
        b.a(((com.facebook.http.e.a) (obj)), stringbuilder.toString(), fetchgroupthreadsparams.b() + 1, false);
        return ((com.facebook.http.e.a) (obj)).a().toString();
    }

    public com.facebook.http.protocol.n a(FetchGroupThreadsParams fetchgroupthreadsparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("q", b(fetchgroupthreadsparams)));
        return new com.facebook.http.protocol.n("fetchGroupThreads", "GET", "fql", arraylist, t.JSON);
    }

    public volatile com.facebook.http.protocol.n a(Object obj)
    {
        return a((FetchGroupThreadsParams)obj);
    }

    public FetchGroupThreadsResult a(FetchGroupThreadsParams fetchgroupthreadsparams, r r1)
    {
        r1 = new b(r1.c());
        int k = fetchgroupthreadsparams.b();
        r1 = b.a(r1, false, k);
        boolean flag;
        if (((com.facebook.orca.protocol.methods.r) (r1)).e < fetchgroupthreadsparams.b() + 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fetchgroupthreadsparams = new ThreadsCollection(((com.facebook.orca.protocol.methods.r) (r1)).a, flag);
        return FetchGroupThreadsResult.newBuilder().a(com.facebook.fbservice.c.b.FROM_SERVER).a(fetchgroupthreadsparams).a(((com.facebook.orca.protocol.methods.r) (r1)).d).a(((com.facebook.orca.protocol.methods.r) (r1)).b).b(((com.facebook.orca.protocol.methods.r) (r1)).c).a(false).a(c.a()).b(((com.facebook.orca.protocol.methods.r) (r1)).f).j();
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((FetchGroupThreadsParams)obj, r1);
    }

}
