// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g;

import com.facebook.contacts.c.b;
import com.facebook.contacts.server.FetchContactsParams;
import com.facebook.contacts.server.FetchContactsResult;
import com.facebook.g.a.a;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.hq;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class i
    implements f
{

    private static final Class a = com/facebook/contacts/g/i;
    private final com.facebook.contacts.c.a b;
    private final b c;

    public i(com.facebook.contacts.c.a a1, b b1)
    {
        b = a1;
        c = b1;
    }

    private String a(Iterable iterable)
    {
        iterable = com.facebook.g.a.a.a(iterable);
        c.a(iterable);
        return iterable.f().toString();
    }

    public FetchContactsResult a(FetchContactsParams fetchcontactsparams, r r1)
    {
        fetchcontactsparams = es.e();
        Iterator iterator = r1.c().fields();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)iterator.next();
            r1 = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (JsonNode)((java.util.Map.Entry) (obj)).getValue();
            try
            {
                obj = b.a(((JsonNode) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (FetchContactsParams fetchcontactsparams)
            {
                com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Couldn't deserialize contact: ").append(r1).append(", error: ").append(fetchcontactsparams).toString());
                throw fetchcontactsparams;
            }
            fetchcontactsparams.b(((com.facebook.contacts.models.b) (obj)).u());
        } while (true);
        fetchcontactsparams = fetchcontactsparams.b();
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Got result: ").append(fetchcontactsparams).toString());
        return new FetchContactsResult(com.facebook.fbservice.c.b.FROM_SERVER, System.currentTimeMillis(), fetchcontactsparams);
    }

    public n a(FetchContactsParams fetchcontactsparams)
    {
        java.util.ArrayList arraylist = hq.a();
        fetchcontactsparams = a(((Iterable) (fetchcontactsparams.a())));
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Sending query: ").append(fetchcontactsparams).toString());
        arraylist.add(new BasicNameValuePair("q", fetchcontactsparams));
        return new n("fetchContacts", "GET", "graphql", arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((FetchContactsParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((FetchContactsParams)obj, r1);
    }

}
