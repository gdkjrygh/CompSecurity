// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g;

import com.facebook.common.w.e;
import com.facebook.contacts.c.a;
import com.facebook.contacts.c.d;
import com.facebook.contacts.server.FetchDeltaContactsParams;
import com.facebook.contacts.server.FetchDeltaContactsResult;
import com.facebook.debug.log.b;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class j
    implements f
{

    private static final Class a = com/facebook/contacts/g/j;
    private final d b;
    private final a c;

    public j(d d1, a a1)
    {
        b = d1;
        c = a1;
    }

    public FetchDeltaContactsResult a(FetchDeltaContactsParams fetchdeltacontactsparams, r r1)
    {
        fetchdeltacontactsparams = r1.c();
        r1 = fetchdeltacontactsparams.get((String)fetchdeltacontactsparams.fieldNames().next()).get("contacts");
        Object obj = es.e();
        fetchdeltacontactsparams = es.e();
        r1 = r1.get("deltas");
        Object obj1 = r1.get("nodes").iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            JsonNode jsonnode1 = (JsonNode)((Iterator) (obj1)).next();
            JsonNode jsonnode = jsonnode1.get("added");
            jsonnode1 = jsonnode1.get("removed");
            if (jsonnode != null && !jsonnode.isNull())
            {
                com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Deserializing node: ").append(jsonnode).toString());
                ((et) (obj)).b(c.a(jsonnode).u());
            } else
            if (jsonnode1 != null && !jsonnode1.isNull())
            {
                fetchdeltacontactsparams.b(e.b(jsonnode1));
            }
        } while (true);
        obj = ((et) (obj)).b();
        fetchdeltacontactsparams = fetchdeltacontactsparams.b();
        r1 = r1.get("page_info");
        obj1 = e.b(r1.get("end_cursor"));
        boolean flag = e.g(r1.get("has_next_page"));
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Got added contacts: ").append(obj).toString());
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Got removed contact Ids: ").append(fetchdeltacontactsparams).toString());
        return new FetchDeltaContactsResult(com.facebook.fbservice.c.b.FROM_SERVER, ((es) (obj)), fetchdeltacontactsparams, ((String) (obj1)), flag, System.currentTimeMillis());
    }

    public n a(FetchDeltaContactsParams fetchdeltacontactsparams)
    {
        java.util.ArrayList arraylist = hq.a();
        fetchdeltacontactsparams = b.a(fetchdeltacontactsparams.a(), fetchdeltacontactsparams.b(), com.facebook.contacts.c.e.DELTA);
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Sending query: ").append(fetchdeltacontactsparams).toString());
        arraylist.add(new BasicNameValuePair("q", fetchdeltacontactsparams));
        return new n("fetchContactsDelta", "GET", "graphql", arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((FetchDeltaContactsParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((FetchDeltaContactsParams)obj, r1);
    }

}
