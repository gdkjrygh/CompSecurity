// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import com.facebook.common.w.e;
import com.facebook.common.w.n;
import com.facebook.messages.model.share.Share;
import com.facebook.messages.model.share.ShareMedia;
import com.facebook.messages.model.share.ShareMediaPhoto;
import com.facebook.messages.model.share.ShareMediaVideo;
import com.facebook.messages.model.share.ShareProperty;
import com.facebook.messages.model.share.b;
import com.facebook.messages.model.share.d;
import com.facebook.messages.model.share.f;
import com.facebook.messages.model.share.h;
import com.facebook.messages.model.share.j;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.hq;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class w
{

    private final ObjectMapper a;

    public w(ObjectMapper objectmapper)
    {
        a = objectmapper;
    }

    private ArrayNode a(Collection collection)
    {
        ArrayNode arraynode = new ArrayNode(JsonNodeFactory.instance);
        for (collection = collection.iterator(); collection.hasNext(); arraynode.add(a((ShareProperty)collection.next()))) { }
        return arraynode;
    }

    private ObjectNode a(ShareMediaPhoto sharemediaphoto)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("aid", sharemediaphoto.a());
        objectnode.put("pid", sharemediaphoto.b());
        objectnode.put("fbid", sharemediaphoto.c());
        objectnode.put("owner", sharemediaphoto.d());
        if (sharemediaphoto.e() != 0 && sharemediaphoto.f() != 0)
        {
            objectnode.put("width", sharemediaphoto.e());
            objectnode.put("height", sharemediaphoto.f());
        }
        return objectnode;
    }

    private ObjectNode a(ShareMediaVideo sharemediavideo)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("display_url", sharemediavideo.a());
        objectnode.put("source_url", sharemediavideo.b());
        objectnode.put("source_type", sharemediavideo.d());
        objectnode.put("owner", sharemediavideo.c());
        return objectnode;
    }

    private ObjectNode a(ShareProperty shareproperty)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("name", shareproperty.a());
        objectnode.put("text", shareproperty.b());
        objectnode.put("href", shareproperty.c());
        return objectnode;
    }

    private ArrayNode b(List list)
    {
        ArrayNode arraynode = new ArrayNode(JsonNodeFactory.instance);
        list = list.iterator();
        while (list.hasNext()) 
        {
            ShareMedia sharemedia = (ShareMedia)list.next();
            ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
            objectnode.put("type", sharemedia.c());
            objectnode.put("src", sharemedia.d());
            objectnode.put("href", sharemedia.a());
            objectnode.put("alt", sharemedia.b());
            if (sharemedia.e() != null)
            {
                objectnode.put("photo", a(sharemedia.e()));
            } else
            if (sharemedia.f() != null)
            {
                objectnode.put("video", a(sharemedia.f()));
            }
            arraynode.add(objectnode);
        }
        return arraynode;
    }

    private Share c(JsonNode jsonnode)
    {
        b b1 = new b();
        b1.a(com.facebook.common.w.e.b(jsonnode.get("name")));
        b1.b(com.facebook.common.w.e.b(jsonnode.get("caption")));
        b1.c(com.facebook.common.w.e.b(jsonnode.get("description")));
        b1.a(a(jsonnode.get("media")));
        b1.d(com.facebook.common.w.e.b(jsonnode.get("href")));
        b1.e(com.facebook.common.w.e.b(jsonnode.get("sticker_id")));
        b1.b(b(jsonnode.get("properties")));
        return b1.h();
    }

    private ShareMedia d(JsonNode jsonnode)
    {
        d d1;
        d1 = new d();
        d1.a(com.facebook.common.w.e.b(jsonnode.get("href")));
        d1.b(com.facebook.common.w.e.b(jsonnode.get("alt")));
        d1.c(com.facebook.common.w.e.b(jsonnode.get("type")));
        d1.d(com.facebook.common.w.e.b(jsonnode.get("src")));
        if (!jsonnode.has("photo")) goto _L2; else goto _L1
_L1:
        d1.a(e(jsonnode.get("photo")));
_L4:
        return d1.g();
_L2:
        if (jsonnode.has("video"))
        {
            d1.a(f(jsonnode.get("video")));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private ShareMediaPhoto e(JsonNode jsonnode)
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

    private ShareMediaVideo f(JsonNode jsonnode)
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
        for (jsonnode = jsonnode.iterator(); jsonnode.hasNext(); et1.b(d((JsonNode)jsonnode.next()))) { }
        return et1.b();
    }

    es a(String s)
    {
        if (n.a(s))
        {
            return es.d();
        }
        et et1 = es.e();
        for (s = a.readTree(s).iterator(); s.hasNext(); et1.b(c((JsonNode)s.next()))) { }
        return et1.b();
    }

    String a(List list)
    {
        if (list == null)
        {
            return null;
        }
        ArrayNode arraynode = new ArrayNode(JsonNodeFactory.instance);
        ObjectNode objectnode;
        for (list = list.iterator(); list.hasNext(); arraynode.add(objectnode))
        {
            Share share = (Share)list.next();
            objectnode = new ObjectNode(JsonNodeFactory.instance);
            objectnode.put("name", share.a());
            objectnode.put("caption", share.b());
            objectnode.put("description", share.c());
            objectnode.put("href", share.e());
            objectnode.put("sticker_id", share.f());
            objectnode.put("media", b(share.d()));
            objectnode.put("properties", a(((Collection) (share.g()))));
        }

        return arraynode.toString();
    }

    List b(JsonNode jsonnode)
    {
        java.util.ArrayList arraylist = hq.a();
        for (int i = 0; i < jsonnode.size(); i++)
        {
            JsonNode jsonnode1 = jsonnode.get(i);
            if (jsonnode1.has("name") && jsonnode1.has("text"))
            {
                j j1 = new j();
                j1.a(com.facebook.common.w.e.b(jsonnode1.get("name")));
                j1.b(com.facebook.common.w.e.b(jsonnode1.get("text")));
                j1.c(com.facebook.common.w.e.b(jsonnode1.get("href")));
                arraylist.add(j1.d());
            }
        }

        return arraylist;
    }
}
