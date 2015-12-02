// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.analytics.i.b;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

// Referenced classes of package com.facebook.analytics:
//            ca

public class cc extends ca
{

    private String b;
    private String c;
    private ObjectNode d;

    public cc(String s)
    {
        this(s, "AUTO_SET");
    }

    public cc(String s, String s1)
    {
        super("experiment", s1);
        b = s;
    }

    public cc a(String s, JsonNode jsonnode)
    {
        if (d == null)
        {
            d = new ObjectNode(JsonNodeFactory.instance);
        }
        d.put(s, jsonnode);
        return this;
    }

    public cc b(String s, String s1)
    {
        if (d == null)
        {
            d = new ObjectNode(JsonNodeFactory.instance);
        }
        if (s1 != null)
        {
            d.put(s, s1);
        }
        return this;
    }

    public cc e(String s)
    {
        c = s;
        return this;
    }

    public JsonNode e()
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("time", com.facebook.analytics.i.b.a(b()));
        objectnode.put("log_type", a());
        objectnode.put("name", b);
        if (c != null)
        {
            objectnode.put("exprID", c);
        }
        if (d != null)
        {
            objectnode.put("result", d);
        }
        if (d())
        {
            objectnode.put("bg", true);
        }
        return objectnode;
    }
}
