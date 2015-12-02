// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g;

import com.facebook.common.w.e;
import com.facebook.contacts.c.a;
import com.facebook.contacts.c.d;
import com.facebook.contacts.models.b;
import com.facebook.contacts.server.FetchAllContactsParams;
import com.facebook.contacts.server.FetchAllContactsResult;
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

public class f
    implements com.facebook.http.protocol.f
{

    private static final Class a = com/facebook/contacts/g/f;
    private final d b;
    private final a c;

    public f(d d1, a a1)
    {
        b = d1;
        c = a1;
    }

    public FetchAllContactsResult a(FetchAllContactsParams fetchallcontactsparams, r r1)
    {
        fetchallcontactsparams = r1.c();
        Object obj = fetchallcontactsparams.get((String)fetchallcontactsparams.fieldNames().next()).get("contacts");
        r1 = ((JsonNode) (obj)).get("page_info");
        fetchallcontactsparams = e.b(r1.get("end_cursor"));
        boolean flag = e.g(r1.get("has_next_page"));
        r1 = e.b(r1.get("delta_cursor"));
        obj = ((JsonNode) (obj)).get("nodes");
        et et1 = es.e();
        for (int i = 0; i < ((JsonNode) (obj)).size(); i++)
        {
            JsonNode jsonnode = ((JsonNode) (obj)).get(i);
            et1.b(c.a(jsonnode).u());
        }

        obj = et1.b();
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Got result: ").append(obj).toString());
        return new FetchAllContactsResult(com.facebook.fbservice.c.b.FROM_SERVER, ((es) (obj)), fetchallcontactsparams, flag, r1, System.currentTimeMillis());
    }

    public n a(FetchAllContactsParams fetchallcontactsparams)
    {
        java.util.ArrayList arraylist = hq.a();
        fetchallcontactsparams = b.a(fetchallcontactsparams.a(), fetchallcontactsparams.b(), com.facebook.contacts.c.e.FULL);
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Sending query: ").append(fetchallcontactsparams).toString());
        arraylist.add(new BasicNameValuePair("q", fetchallcontactsparams));
        return new n("fetchContacts", "GET", "graphql", arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((FetchAllContactsParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((FetchAllContactsParams)obj, r1);
    }

}
