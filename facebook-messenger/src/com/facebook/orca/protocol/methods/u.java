// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.user.User;
import com.facebook.user.o;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.io.IOException;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class u
    implements f
{

    public u()
    {
    }

    public volatile n a(Object obj)
    {
        return a((String)obj);
    }

    public n a(String s)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("fields", "name,picture"));
        return new n("lookupUser", "GET", s, arraylist, t.JSON);
    }

    public User a(String s, r r1)
    {
        r1 = r1.c();
        if (!r1.has("name"))
        {
            throw new IOException("Expected response body to contain a name field.");
        } else
        {
            o o1 = new o();
            o1.a(com.facebook.user.n.FACEBOOK, s);
            o1.a(r1.get("name").asText());
            o1.b(r1.get("picture").get("data").get("url").asText());
            return o1.x();
        }
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((String)obj, r1);
    }
}
