// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.e;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.ik;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class a
{

    private Map a;

    public a()
    {
        a = ik.a();
    }

    public JsonNode a()
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); objectnode.put((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return objectnode;
    }

    public void a(String s, String s1)
    {
        a.put(s, s1);
    }
}
