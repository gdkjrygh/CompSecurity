// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nux.status;

import com.facebook.common.w.e;
import com.facebook.common.w.k;
import com.facebook.common.w.n;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.a.fi;
import com.google.common.a.fk;
import com.google.common.a.hq;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.nux.status:
//            NuxStatusResult, e, NuxStep, FetchNuxStatusesParams, 
//            FetchNuxStatusesResult

public class a
    implements f
{

    private final Set a;

    public a(Set set)
    {
        a = set;
    }

    private NuxStatusResult a(JsonNode jsonnode)
    {
        Object obj = jsonnode.get("steps");
        et et1 = es.e();
        for (obj = ((JsonNode) (obj)).iterator(); ((Iterator) (obj)).hasNext(); et1.b(b((JsonNode)((Iterator) (obj)).next()))) { }
        Object obj1 = jsonnode.get("extra_data");
        obj = ev.k();
        java.util.Map.Entry entry;
        for (obj1 = ((JsonNode) (obj1)).fields(); ((Iterator) (obj1)).hasNext(); ((ew) (obj)).b(entry.getKey(), Integer.valueOf(e.d((JsonNode)entry.getValue()))))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
        }

        return new NuxStatusResult(e.b(jsonnode.get("nux_id")), e.g(jsonnode.get("is_eligible")), et1.b(), ((ew) (obj)).b());
    }

    private fi a()
    {
        Preconditions.checkNotNull(a);
        fk fk1 = fi.e();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); fk1.b(((com.facebook.nux.status.e)iterator.next()).a())) { }
        return fk1.b();
    }

    private NuxStep b(JsonNode jsonnode)
    {
        return new NuxStep(e.b(jsonnode.get("name")), e.g(jsonnode.get("is_current")));
    }

    public com.facebook.http.protocol.n a(FetchNuxStatusesParams fetchnuxstatusesparams)
    {
        java.util.ArrayList arraylist;
        if (fetchnuxstatusesparams == null)
        {
            fetchnuxstatusesparams = a();
        } else
        {
            fetchnuxstatusesparams = fetchnuxstatusesparams.a();
        }
        fetchnuxstatusesparams = n.a("SELECT %s FROM %s WHERE nux_id IN %s", new Object[] {
            "nux_id, steps, is_eligible, extra_data", "user_nux_status", k.b(fetchnuxstatusesparams)
        });
        arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("query", fetchnuxstatusesparams));
        return new com.facebook.http.protocol.n("get_nux_statuses_method", "GET", "method/fql.query", arraylist, t.JSON);
    }

    public volatile com.facebook.http.protocol.n a(Object obj)
    {
        return a((FetchNuxStatusesParams)obj);
    }

    public FetchNuxStatusesResult a(FetchNuxStatusesParams fetchnuxstatusesparams, r r1)
    {
        r1.f();
        r1 = r1.c();
        if (!r1.isArray())
        {
            throw new IOException("Result must be an array");
        }
        fetchnuxstatusesparams = es.e();
        for (r1 = r1.iterator(); r1.hasNext(); fetchnuxstatusesparams.b(a((JsonNode)r1.next()))) { }
        return new FetchNuxStatusesResult(fetchnuxstatusesparams.b());
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((FetchNuxStatusesParams)obj, r1);
    }
}
