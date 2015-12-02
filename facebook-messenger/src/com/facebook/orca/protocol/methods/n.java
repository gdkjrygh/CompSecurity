// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.common.w.m;
import com.facebook.http.e.a;
import com.facebook.http.e.b;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.orca.server.FetchThreadListParams;
import com.facebook.orca.server.FetchThreadListResult;
import com.facebook.orca.server.aa;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.FolderType;
import com.facebook.orca.threads.ThreadsCollection;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            p, r

public class n
    implements f
{

    private static final Class a = com/facebook/orca/protocol/methods/n;
    private final p b;

    public n(p p1)
    {
        b = p1;
    }

    private String b(FetchThreadListParams fetchthreadlistparams)
    {
        FolderName foldername = fetchthreadlistparams.b();
        a a1 = new a();
        b.a(a1);
        b.a(a1, foldername);
        b.a(a1, m.a("folder='%1$s' AND archived=0", new Object[] {
            foldername.a().a()
        }), fetchthreadlistparams.d() + 1, false);
        return a1.a().toString();
    }

    private String c(FetchThreadListParams fetchthreadlistparams)
    {
        FolderName foldername = fetchthreadlistparams.b();
        a a1 = new a();
        b.a(a1);
        b.a(a1, foldername);
        b.a(a1, m.a("folder='%1$s' AND action_id > %2$d", new Object[] {
            foldername.a().a(), Long.valueOf(fetchthreadlistparams.c())
        }), 100, true);
        return a1.a().toString();
    }

    public com.facebook.http.protocol.n a(FetchThreadListParams fetchthreadlistparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        if (fetchthreadlistparams.c() == -1L)
        {
            arraylist.add(new BasicNameValuePair("q", b(fetchthreadlistparams)));
        } else
        {
            arraylist.add(new BasicNameValuePair("q", c(fetchthreadlistparams)));
        }
        return new com.facebook.http.protocol.n("fetchThreads", "GET", "fql", arraylist, t.JSON);
    }

    public volatile com.facebook.http.protocol.n a(Object obj)
    {
        return a((FetchThreadListParams)obj);
    }

    public FetchThreadListResult a(FetchThreadListParams fetchthreadlistparams, r r1)
    {
        boolean flag1 = true;
        Object obj = new b(r1.c());
        ThreadsCollection threadscollection;
        FolderName foldername;
        com.facebook.orca.threads.FolderCounts foldercounts;
        int i;
        boolean flag;
        if (fetchthreadlistparams.c() != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = fetchthreadlistparams.d();
        r1 = b.a(((b) (obj)), flag, i);
        if (flag || ((com.facebook.orca.protocol.methods.r) (r1)).e >= fetchthreadlistparams.d() + 1)
        {
            flag1 = false;
        }
        threadscollection = new ThreadsCollection(((com.facebook.orca.protocol.methods.r) (r1)).a, flag1);
        foldername = b.d(((b) (obj)));
        foldercounts = b.e(((b) (obj)));
        obj = b.f(((b) (obj)));
        return FetchThreadListResult.newBuilder().a(com.facebook.fbservice.c.b.FROM_SERVER).a(foldername).a(threadscollection).a(((com.facebook.orca.protocol.methods.r) (r1)).d).a(((com.facebook.orca.protocol.methods.r) (r1)).b).b(((com.facebook.orca.protocol.methods.r) (r1)).c).a(foldercounts).a(((com.facebook.orca.notify.NotificationSetting) (obj))).a(flag).a(System.currentTimeMillis()).b(Math.max(fetchthreadlistparams.c(), ((com.facebook.orca.protocol.methods.r) (r1)).f)).o();
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((FetchThreadListParams)obj, r1);
    }

}
