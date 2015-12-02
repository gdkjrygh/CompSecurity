// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.common.w.e;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.user.Name;
import com.facebook.user.o;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class ah
    implements f
{

    public ah()
    {
    }

    public volatile n a(Object obj)
    {
        return a((String)obj);
    }

    public n a(String s)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("context", "messenger_composer"));
        arraylist.add(new BasicNameValuePair("query", s));
        arraylist.add(new BasicNameValuePair("limit", "20"));
        return new n("searchUsersMethod", "GET", "method/ubersearch.get", arraylist, t.JSON);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((String)obj, r1);
    }

    public List a(String s, r r1)
    {
        s = hq.a();
        r1 = r1.c();
        for (int i = 0; i < r1.size(); i++)
        {
            Object obj = r1.get(i);
            if ("user".equals(e.b(((JsonNode) (obj)).get("type"))))
            {
                String s1 = e.b(((JsonNode) (obj)).get("text"));
                String s2 = e.b(((JsonNode) (obj)).get("uid"));
                String s3 = e.b(((JsonNode) (obj)).get("photo"));
                String s4 = e.b(((JsonNode) (obj)).get("subtext"));
                obj = e.b(((JsonNode) (obj)).get("category"));
                s.add((new o()).a(com.facebook.user.n.FACEBOOK, s2).a(new Name(null, null, s1)).b(s3).d(s4).e(((String) (obj))).x());
            }
        }

        return s;
    }
}
