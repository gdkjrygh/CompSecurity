// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import com.facebook.common.w.n;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.a.fi;
import java.util.Iterator;

public class q
{

    private final ObjectMapper a;

    public q(ObjectMapper objectmapper)
    {
        a = objectmapper;
    }

    ev a(String s)
    {
        ew ew1 = ev.k();
        if (!n.a(s))
        {
            java.util.Map.Entry entry;
            for (s = a.readTree(s).fields(); s.hasNext(); ew1.b(entry.getKey(), ((JsonNode)entry.getValue()).asText()))
            {
                entry = (java.util.Map.Entry)s.next();
            }

        }
        return ew1.b();
    }

    String a(ev ev1)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        if (ev1 != null)
        {
            java.util.Map.Entry entry;
            for (ev1 = ev1.a().iterator(); ev1.hasNext(); objectnode.put((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)ev1.next();
            }

        }
        return objectnode.toString();
    }
}
