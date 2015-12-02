// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.protocol;

import com.facebook.common.w.e;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.ik;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class j
{

    public j()
    {
    }

    public JsonNode a(JsonNode jsonnode, JsonNode jsonnode1)
    {
        return a(jsonnode, jsonnode1, null);
    }

    public JsonNode a(JsonNode jsonnode, JsonNode jsonnode1, JsonNode jsonnode2)
    {
        boolean flag = false;
        java.util.HashMap hashmap = ik.a();
        for (int i = 0; i < jsonnode1.size(); i++)
        {
            JsonNode jsonnode3 = jsonnode1.get(i);
            ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
            objectnode.put("uid", e.b(jsonnode3.get("id")));
            String s1;
            for (Iterator iterator1 = jsonnode3.fieldNames(); iterator1.hasNext(); objectnode.put(s1, jsonnode3.get(s1)))
            {
                s1 = (String)iterator1.next();
            }

            hashmap.put(e.b(jsonnode3.get("id")), objectnode);
        }

        for (int k = 0; k < jsonnode.size(); k++)
        {
            JsonNode jsonnode4 = jsonnode.get(k);
            jsonnode1 = (ObjectNode)hashmap.get(e.b(jsonnode4.get("uid")));
            if (jsonnode1 == null)
            {
                jsonnode1 = new ObjectNode(JsonNodeFactory.instance);
                hashmap.put(e.b(jsonnode1.get("uid")), jsonnode1);
            }
            String s;
            for (Iterator iterator = jsonnode4.fieldNames(); iterator.hasNext(); jsonnode1.put(s, jsonnode4.get(s)))
            {
                s = (String)iterator.next();
            }

        }

        if (jsonnode2 != null)
        {
            for (int l = ((flag) ? 1 : 0); l < jsonnode2.size(); l++)
            {
                jsonnode = jsonnode2.get(l);
                jsonnode1 = (ObjectNode)hashmap.get(e.b(jsonnode.get("uid2")));
                if (jsonnode1 != null && jsonnode.has("communication_rank"))
                {
                    jsonnode1.put("rank", e.e(jsonnode.get("communication_rank")));
                }
            }

        }
        jsonnode = new ArrayNode(JsonNodeFactory.instance);
        for (jsonnode1 = hashmap.values().iterator(); jsonnode1.hasNext(); jsonnode.add((ObjectNode)jsonnode1.next())) { }
        return jsonnode;
    }

    public transient JsonNode a(JsonNode ajsonnode[])
    {
        if (ajsonnode.length != 0) goto _L2; else goto _L1
_L1:
        Object obj = new ArrayNode(JsonNodeFactory.instance);
_L4:
        return ((JsonNode) (obj));
_L2:
        ArrayNode arraynode;
label0:
        {
            if (ajsonnode.length == 1)
            {
                return ajsonnode[0];
            }
            int l = ajsonnode.length;
            int i = 0;
            arraynode = null;
            do
            {
                if (i >= l)
                {
                    break label0;
                }
                obj = ajsonnode[i];
                if (((JsonNode) (obj)).size() > 0)
                {
                    if (arraynode != null)
                    {
                        break;
                    }
                    arraynode = (ArrayNode)obj;
                }
                i++;
            } while (true);
            arraynode = null;
        }
        obj = arraynode;
        if (arraynode == null)
        {
            ArrayNode arraynode1 = new ArrayNode(JsonNodeFactory.instance);
            int j1 = ajsonnode.length;
            for (int k = 0; k < j1; k++)
            {
                JsonNode jsonnode = ajsonnode[k];
                for (int i1 = 0; i1 < jsonnode.size(); i1++)
                {
                    arraynode1.add(jsonnode.get(i1));
                }

            }

            return arraynode1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
