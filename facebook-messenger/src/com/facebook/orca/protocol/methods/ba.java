// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.common.w.e;
import com.facebook.messages.model.share.Share;
import com.facebook.messages.model.share.ShareMedia;
import com.facebook.messages.model.share.ShareMediaPhoto;
import com.facebook.messages.model.share.ShareMediaVideo;
import com.facebook.messages.model.share.b;
import com.facebook.messages.model.share.d;
import com.facebook.messages.model.share.f;
import com.facebook.messages.model.share.h;
import com.facebook.messages.model.share.j;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;

public class ba
{

    public ba()
    {
    }

    private ShareMedia e(JsonNode jsonnode)
    {
        d d1;
        d1 = new d();
        d1.a(com.facebook.common.w.e.b(jsonnode.get("href")));
        d1.b(com.facebook.common.w.e.b(jsonnode.get("alt")));
        d1.c(com.facebook.common.w.e.b(jsonnode.get("type")));
        d1.d(com.facebook.common.w.e.b(jsonnode.get("src")));
        if (!jsonnode.has("photo")) goto _L2; else goto _L1
_L1:
        d1.a(f(jsonnode.get("photo")));
_L4:
        return d1.g();
_L2:
        if (jsonnode.has("video"))
        {
            d1.a(g(jsonnode.get("video")));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private ShareMediaPhoto f(JsonNode jsonnode)
    {
        f f1 = new f();
        f1.a(com.facebook.common.w.e.b(jsonnode.get("aid")));
        f1.b(com.facebook.common.w.e.b(jsonnode.get("pid")));
        f1.c(com.facebook.common.w.e.b(jsonnode.get("fbid")));
        f1.d(com.facebook.common.w.e.b(jsonnode.get("owner")));
        if (jsonnode.has("height") && jsonnode.has("width"))
        {
            f1.b(com.facebook.common.w.e.d(jsonnode.get("height")));
            f1.a(com.facebook.common.w.e.d(jsonnode.get("width")));
        }
        return f1.g();
    }

    private ShareMediaVideo g(JsonNode jsonnode)
    {
        h h1 = new h();
        h1.a(com.facebook.common.w.e.b(jsonnode.get("display_url")));
        h1.b(com.facebook.common.w.e.b(jsonnode.get("source_url")));
        h1.c(com.facebook.common.w.e.b(jsonnode.get("owner")));
        h1.d(com.facebook.common.w.e.b(jsonnode.get("source_type")));
        return h1.e();
    }

    es a(JsonNode jsonnode)
    {
        et et1 = es.e();
        for (Iterator iterator = jsonnode.fieldNames(); iterator.hasNext(); et1.b(b(jsonnode.get((String)iterator.next())))) { }
        return et1.b();
    }

    Share b(JsonNode jsonnode)
    {
        b b1 = new b();
        b1.a(com.facebook.common.w.e.b(jsonnode.get("name")));
        b1.b(com.facebook.common.w.e.b(jsonnode.get("caption")));
        b1.c(com.facebook.common.w.e.b(jsonnode.get("description")));
        b1.d(com.facebook.common.w.e.b(jsonnode.get("href")));
        b1.e(com.facebook.common.w.e.b(jsonnode.get("sticker_id")));
        if (jsonnode.has("media"))
        {
            b1.a(d(jsonnode.get("media")));
        }
        if (jsonnode.has("properties"))
        {
            b1.b(c(jsonnode.get("properties")));
        }
        return b1.h();
    }

    List c(JsonNode jsonnode)
    {
        java.util.ArrayList arraylist = hq.a();
        jsonnode = jsonnode.iterator();
        do
        {
            if (!jsonnode.hasNext())
            {
                break;
            }
            JsonNode jsonnode1 = (JsonNode)jsonnode.next();
            if (jsonnode1.has("name") && jsonnode1.has("text"))
            {
                j j1 = new j();
                j1.a(com.facebook.common.w.e.b(jsonnode1.get("name")));
                j1.b(com.facebook.common.w.e.b(jsonnode1.get("text")));
                j1.c(com.facebook.common.w.e.b(jsonnode1.get("href")));
                arraylist.add(j1.d());
            }
        } while (true);
        return arraylist;
    }

    es d(JsonNode jsonnode)
    {
        et et1 = es.e();
        for (jsonnode = jsonnode.iterator(); jsonnode.hasNext(); et1.b(e((JsonNode)jsonnode.next()))) { }
        return et1.b();
    }
}
