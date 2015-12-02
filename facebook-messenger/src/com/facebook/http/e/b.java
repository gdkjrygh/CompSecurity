// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.e;

import com.facebook.common.w.e;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.ik;
import java.util.Map;

public class b
{

    private final Map a = ik.a();

    public b(JsonNode jsonnode)
    {
        JsonNode jsonnode1 = jsonnode;
        if (!jsonnode.isArray())
        {
            jsonnode1 = jsonnode;
            if (jsonnode.get("data") != null)
            {
                jsonnode1 = jsonnode.get("data");
            }
        }
        for (int i = 0; i < jsonnode1.size(); i++)
        {
            JsonNode jsonnode2 = jsonnode1.get(i);
            jsonnode = e.b(jsonnode2.get("name"));
            jsonnode2 = jsonnode2.get("fql_result_set");
            a.put(jsonnode, jsonnode2);
        }

    }

    public JsonNode a(String s)
    {
        return (JsonNode)a.get(s);
    }
}
