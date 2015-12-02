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
import com.facebook.orca.server.FetchMoreThreadsParams;
import com.facebook.orca.server.FetchMoreThreadsResult;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.FolderType;
import com.facebook.orca.threads.ThreadsCollection;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            p, r

public class l
    implements f
{

    private static final Class a = com/facebook/orca/protocol/methods/l;
    private final p b;

    public l(p p1)
    {
        b = p1;
    }

    private String b(FetchMoreThreadsParams fetchmorethreadsparams)
    {
        FolderName foldername = fetchmorethreadsparams.a();
        a a1 = new a();
        b.a(a1, m.a("folder='%1$s' AND archived=0 AND timestamp <= %2$d", new Object[] {
            foldername.a().a(), Long.valueOf(fetchmorethreadsparams.b())
        }), fetchmorethreadsparams.c() + 1, false);
        return a1.a().toString();
    }

    public n a(FetchMoreThreadsParams fetchmorethreadsparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("q", b(fetchmorethreadsparams)));
        return new n("fetchThreads", "GET", "fql", arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((FetchMoreThreadsParams)obj);
    }

    public FetchMoreThreadsResult a(FetchMoreThreadsParams fetchmorethreadsparams, r r1)
    {
        boolean flag = false;
        r1 = new b(r1.c());
        int i = fetchmorethreadsparams.c();
        r1 = b.a(r1, false, i);
        if (((com.facebook.orca.protocol.methods.r) (r1)).e < fetchmorethreadsparams.c() + 1)
        {
            flag = true;
        }
        ThreadsCollection threadscollection = new ThreadsCollection(((com.facebook.orca.protocol.methods.r) (r1)).a, flag);
        return new FetchMoreThreadsResult(com.facebook.fbservice.c.b.FROM_SERVER, fetchmorethreadsparams.a(), threadscollection, ((com.facebook.orca.protocol.methods.r) (r1)).d, System.currentTimeMillis());
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((FetchMoreThreadsParams)obj, r1);
    }

}
