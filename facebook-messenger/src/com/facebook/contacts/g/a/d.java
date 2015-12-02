// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g.a;

import com.facebook.contacts.server.FetchLastActiveParams;
import com.facebook.contacts.server.FetchLastActiveResult;
import com.facebook.contacts.server.w;
import com.facebook.fbservice.c.b;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.user.ac;
import com.facebook.user.n;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class d
    implements f
{

    private final ac a;
    private final w b;

    public d(ac ac1, w w1)
    {
        a = ac1;
        b = w1;
    }

    public FetchLastActiveResult a(FetchLastActiveParams fetchlastactiveparams, r r1)
    {
        r1.f();
        fetchlastactiveparams = (ArrayNode)r1.c();
        fetchlastactiveparams = a.a(n.FACEBOOK, fetchlastactiveparams);
        return new FetchLastActiveResult(b.FROM_SERVER, fetchlastactiveparams, System.currentTimeMillis());
    }

    public com.facebook.http.protocol.n a(FetchLastActiveParams fetchlastactiveparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("query", b.a(fetchlastactiveparams.b(), fetchlastactiveparams.c())));
        return new com.facebook.http.protocol.n("fetchLastActiveMethod", "GET", "method/fql.query", arraylist, t.JSON);
    }

    public volatile com.facebook.http.protocol.n a(Object obj)
    {
        return a((FetchLastActiveParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((FetchLastActiveParams)obj, r1);
    }
}
