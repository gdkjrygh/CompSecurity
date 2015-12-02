// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g.a;

import com.facebook.contacts.server.FetchMessagingFavoritesResult;
import com.facebook.fbservice.c.b;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.user.n;
import com.facebook.user.o;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class e
    implements f
{

    public e()
    {
    }

    private String a()
    {
        return "SELECT favorite_id, ordering FROM messaging_favorite WHERE uid=me() ORDER BY ordering ASC";
    }

    public FetchMessagingFavoritesResult a(Void void1, r r1)
    {
        r1.f();
        void1 = (ArrayNode)r1.c();
        r1 = es.e();
        for (int i = 0; i < void1.size(); i++)
        {
            JsonNode jsonnode = void1.get(i);
            o o1 = new o();
            o1.a(n.FACEBOOK, com.facebook.common.w.e.b(jsonnode.get("favorite_id")));
            r1.b(o1.x());
        }

        return new FetchMessagingFavoritesResult(b.FROM_SERVER, r1.b(), System.currentTimeMillis());
    }

    public volatile com.facebook.http.protocol.n a(Object obj)
    {
        return a((Void)obj);
    }

    public com.facebook.http.protocol.n a(Void void1)
    {
        void1 = hq.a();
        void1.add(new BasicNameValuePair("format", "json"));
        void1.add(new BasicNameValuePair("query", a()));
        return new com.facebook.http.protocol.n("fetchMessagingFavorites", "GET", "method/fql.query", void1, t.JSON);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((Void)obj, r1);
    }
}
