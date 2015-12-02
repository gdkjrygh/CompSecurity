// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.protocol.sync.full;

import com.facebook.abtest.qe.protocol.sync.SyncQuickExperimentParams;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.a.ew;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.abtest.qe.protocol.sync.full:
//            c, SyncQuickExperimentMetaInfoResult

public class d
{

    private static final Class a = com/facebook/abtest/qe/protocol/sync/full/d;
    private final ObjectMapper b;

    public d(ObjectMapper objectmapper)
    {
        b = objectmapper;
    }

    private static SyncQuickExperimentMetaInfoResult a(JsonNode jsonnode, String s)
    {
        c c1 = new c();
        Object obj;
        if (n.a(s))
        {
            c1.a(jsonnode.get("id").asText());
        } else
        {
            c1.a(s);
        }
        s = new ArrayList();
        obj = jsonnode.get("groups");
        if (((JsonNode) (obj)).isObject())
        {
            for (Iterator iterator = ((JsonNode) (obj)).fieldNames(); iterator.hasNext(); s.add(((JsonNode) (obj)).get((String)iterator.next()).asText())) { }
        } else
        {
            for (obj = ((JsonNode) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.add(((JsonNode)((Iterator) (obj)).next()).asText())) { }
        }
        c1.a(s);
        obj = new ew();
        JsonNode jsonnode1 = jsonnode.get("params");
        Iterator iterator1 = jsonnode1.fieldNames();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            String s1 = (String)iterator1.next();
            if (s.contains(s1))
            {
                Iterator iterator2 = jsonnode1.get(s1).fieldNames();
                ew ew1 = new ew();
                do
                {
                    if (!iterator2.hasNext())
                    {
                        break;
                    }
                    String s2 = (String)iterator2.next();
                    Object obj1 = jsonnode1.get(s1).get(s2);
                    if (!((JsonNode) (obj1)).isNull())
                    {
                        if (((JsonNode) (obj1)).isObject())
                        {
                            int i = ((JsonNode) (obj1)).get("type").asInt();
                            obj1 = ((JsonNode) (obj1)).get("value").asText();
                            if (i == 1 || i == 2)
                            {
                                ew1.b(s2, obj1);
                            }
                        } else
                        if (((JsonNode) (obj1)).isTextual())
                        {
                            ew1.b(s2, ((JsonNode) (obj1)).asText());
                        }
                    }
                } while (true);
                ((ew) (obj)).b(s1, ew1.b());
            }
        } while (true);
        c1.a(((ew) (obj)).b());
        s = jsonnode.get("default_group");
        if (s.isNull())
        {
            s = null;
        } else
        {
            s = s.asText();
        }
        c1.b(s);
        c1.a(jsonnode.get("expiration").asLong());
        return c1.a();
    }

    public SyncQuickExperimentMetaInfoResult a(JsonNode jsonnode, SyncQuickExperimentParams syncquickexperimentparams)
    {
        if (jsonnode == null || syncquickexperimentparams == null)
        {
            return null;
        } else
        {
            return a(jsonnode, syncquickexperimentparams.a());
        }
    }

    public SyncQuickExperimentMetaInfoResult a(String s)
    {
        Object obj;
        if (s == null)
        {
            return null;
        }
        obj = b.getJsonFactory();
        obj = ((JsonFactory) (obj)).createJsonParser(s);
        obj = (JsonNode)b.readTree(((com.fasterxml.jackson.core.JsonParser) (obj)));
        s = ((String) (obj));
_L2:
        return a(((JsonNode) (s)), ((String) (null)));
        IOException ioexception;
        ioexception;
        com.facebook.debug.log.b.d(a, (new StringBuilder()).append("Error parsing ").append(s).append(": ").append(ioexception).toString());
        s = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String a(SyncQuickExperimentMetaInfoResult syncquickexperimentmetainforesult)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        JsonGenerator jsongenerator;
        if (syncquickexperimentmetainforesult == null)
        {
            return null;
        }
        try
        {
            bytearrayoutputstream = new ByteArrayOutputStream();
            jsongenerator = b.getJsonFactory().createJsonGenerator(bytearrayoutputstream, JsonEncoding.UTF8);
            jsongenerator.writeStartObject();
            jsongenerator.writeStringField("id", syncquickexperimentmetainforesult.a());
            jsongenerator.writeArrayFieldStart("groups");
            for (Iterator iterator = syncquickexperimentmetainforesult.b().iterator(); iterator.hasNext(); jsongenerator.writeString((String)iterator.next())) { }
        }
        // Misplaced declaration of an exception variable
        catch (SyncQuickExperimentMetaInfoResult syncquickexperimentmetainforesult)
        {
            com.facebook.debug.log.b.d(a, "Exception while trying to convert SyncQuickExperimentMetaInfoResult to JSON", syncquickexperimentmetainforesult);
            return "{}";
        }
        com.google.common.a.ev ev;
        Iterator iterator1;
        jsongenerator.writeEndArray();
        jsongenerator.writeObjectFieldStart("params");
        ev = syncquickexperimentmetainforesult.c();
        iterator1 = ev.keySet().iterator();
_L1:
        Object obj;
        if (!iterator1.hasNext())
        {
            break MISSING_BLOCK_LABEL_247;
        }
        String s = (String)iterator1.next();
        obj = (Map)ev.get(s);
        jsongenerator.writeObjectFieldStart(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        for (Iterator iterator2 = ((Map) (obj)).entrySet().iterator(); iterator2.hasNext(); jsongenerator.writeStringField((String)((java.util.Map.Entry) (obj)).getKey(), (String)((java.util.Map.Entry) (obj)).getValue()))
        {
            obj = (java.util.Map.Entry)iterator2.next();
        }

        jsongenerator.writeEndObject();
          goto _L1
        jsongenerator.writeEndObject();
        jsongenerator.writeStringField("default_group", syncquickexperimentmetainforesult.d());
        jsongenerator.writeNumberField("expiration", syncquickexperimentmetainforesult.e());
        jsongenerator.writeEndObject();
        jsongenerator.close();
        syncquickexperimentmetainforesult = new String(bytearrayoutputstream.toByteArray(), "UTF-8");
        return syncquickexperimentmetainforesult;
    }

}
