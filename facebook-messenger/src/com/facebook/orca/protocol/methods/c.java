// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.common.w.e;
import com.facebook.messages.model.threads.k;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.Iterator;

public class c
{

    public c()
    {
    }

    es a(JsonNode jsonnode)
    {
        et et1 = es.e();
        k k1;
        for (Iterator iterator = jsonnode.fieldNames(); iterator.hasNext(); et1.b(k1.g()))
        {
            JsonNode jsonnode1 = jsonnode.get((String)iterator.next());
            k1 = (new k()).a(e.b(jsonnode1.get("id"))).a(e.d(jsonnode1.get("type"))).b(e.b(jsonnode1.get("mime_type"))).c(e.b(jsonnode1.get("filename"))).b(e.d(jsonnode1.get("file_size")));
            if (jsonnode1.has("image_data"))
            {
                jsonnode1 = jsonnode1.get("image_data");
                k1.a(new com.facebook.messages.model.threads.TitanAttachmentInfo.ImageData(e.d(jsonnode1.get("width")), e.d(jsonnode1.get("height"))));
            }
        }

        return et1.b();
    }
}
