// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import com.facebook.common.w.e;
import com.facebook.common.w.n;
import com.facebook.messages.model.threads.TitanAttachmentInfo;
import com.facebook.messages.model.threads.k;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.Iterator;
import java.util.List;

public class a
{

    private final ObjectMapper a;

    public a(ObjectMapper objectmapper)
    {
        a = objectmapper;
    }

    es a(String s)
    {
        if (n.a(s))
        {
            return es.d();
        }
        et et1 = es.e();
        k k1;
        for (s = a.readTree(s).iterator(); s.hasNext(); et1.b(k1.g()))
        {
            JsonNode jsonnode = (JsonNode)s.next();
            k1 = (new k()).a(e.b(jsonnode.get("id"))).a(e.d(jsonnode.get("type"))).b(e.b(jsonnode.get("mime_type"))).c(e.b(jsonnode.get("filename"))).b(e.d(jsonnode.get("file_size")));
            if (jsonnode.has("image_data_width") && jsonnode.has("image_data_height"))
            {
                k1.a(new com.facebook.messages.model.threads.TitanAttachmentInfo.ImageData(e.d(jsonnode.get("image_data_width")), e.d(jsonnode.get("image_data_height"))));
            }
        }

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
            TitanAttachmentInfo titanattachmentinfo = (TitanAttachmentInfo)list.next();
            objectnode = new ObjectNode(JsonNodeFactory.instance);
            objectnode.put("id", titanattachmentinfo.a());
            objectnode.put("type", titanattachmentinfo.b());
            objectnode.put("mime_type", titanattachmentinfo.c());
            objectnode.put("filename", titanattachmentinfo.d());
            objectnode.put("file_size", titanattachmentinfo.e());
            if (titanattachmentinfo.f() != null)
            {
                objectnode.put("image_data_width", titanattachmentinfo.f().a());
                objectnode.put("image_data_height", titanattachmentinfo.f().b());
            }
        }

        return arraynode.toString();
    }
}
