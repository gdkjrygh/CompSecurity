// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.rewrite;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.Iterator;

// Referenced classes of package com.facebook.zero.rewrite:
//            ZeroUrlRewriteRule

public class e
{

    private final ObjectMapper a;
    private final JsonFactory b;

    public e(ObjectMapper objectmapper, JsonFactory jsonfactory)
    {
        a = objectmapper;
        b = jsonfactory;
    }

    public es a(JsonNode jsonnode)
    {
        et et1 = new et();
        jsonnode = jsonnode.elements();
        do
        {
            if (!jsonnode.hasNext())
            {
                break;
            }
            JsonNode jsonnode3 = (JsonNode)jsonnode.next();
            JsonNode jsonnode1 = jsonnode3.get("matcher");
            JsonNode jsonnode2 = jsonnode3.get("replacer");
            jsonnode3 = jsonnode3.get("mode");
            if (jsonnode1 != null && jsonnode2 != null && jsonnode3 != null)
            {
                et1.b(new ZeroUrlRewriteRule(jsonnode1.asText(), jsonnode2.asText(), jsonnode3.asText()));
            }
        } while (true);
        return et1.b();
    }

    public es a(String s)
    {
        return a((JsonNode)b.createJsonParser(s).readValueAsTree());
    }

    public String a(es es1)
    {
        et et1 = es.e();
        for (es1 = es1.iterator(); es1.hasNext(); et1.b((ZeroUrlRewriteRule)es1.next())) { }
        return a.writeValueAsString(et1.b());
    }
}
