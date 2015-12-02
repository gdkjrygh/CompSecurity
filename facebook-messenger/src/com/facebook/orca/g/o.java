// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import android.net.Uri;
import com.facebook.common.w.e;
import com.facebook.common.w.n;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.f;
import com.facebook.ui.media.attachments.g;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.Iterator;
import java.util.List;

public class o
{

    private final ObjectMapper a;

    public o(ObjectMapper objectmapper)
    {
        a = objectmapper;
    }

    String a(List list)
    {
        if (list == null || list.isEmpty())
        {
            return null;
        }
        ArrayNode arraynode = new ArrayNode(JsonNodeFactory.instance);
        ObjectNode objectnode;
        for (list = list.iterator(); list.hasNext(); arraynode.add(objectnode))
        {
            MediaResource mediaresource = (MediaResource)list.next();
            objectnode = new ObjectNode(JsonNodeFactory.instance);
            objectnode.put("type", mediaresource.c().name());
            objectnode.put("uri", mediaresource.d().toString());
            objectnode.put("mimeType", mediaresource.e());
            objectnode.put("fileName", mediaresource.f());
            objectnode.put("duration", mediaresource.g());
            objectnode.put("width", mediaresource.h());
            objectnode.put("height", mediaresource.i());
        }

        return arraynode.toString();
    }

    List a(String s)
    {
        if (n.a(s))
        {
            return es.d();
        }
        et et1 = es.e();
        JsonNode jsonnode;
        for (s = a.readTree(s).iterator(); s.hasNext(); et1.b(MediaResource.a().a(Uri.parse(e.b(jsonnode.get("uri")))).a(g.valueOf(e.b(jsonnode.get("type")))).a(e.b(jsonnode.get("mimeType"))).b(e.b(jsonnode.get("fileName"))).b(e.c(jsonnode.get("duration"))).a(e.d(jsonnode.get("width"))).b(e.d(jsonnode.get("height"))).i()))
        {
            jsonnode = (JsonNode)s.next();
        }

        return et1.b();
    }
}
