// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import com.facebook.analytics.d.a;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.location:
//            aa

public class q
    implements a
{

    private final aa a;

    public q(aa aa1)
    {
        a = aa1;
    }

    private ArrayNode a(Collection collection)
    {
        ArrayNode arraynode = new ArrayNode(JsonNodeFactory.instance);
        for (collection = collection.iterator(); collection.hasNext(); arraynode.add((String)collection.next())) { }
        return arraynode;
    }

    private JsonNode d()
    {
        if (a == null)
        {
            return null;
        } else
        {
            ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
            objectnode.put("all", a(a.a()));
            objectnode.put("possible", a(a.b()));
            objectnode.put("enabled", a(a.c()));
            objectnode.put("disabled", a(a.d()));
            objectnode.put("user_enabled", a(a.e()));
            objectnode.put("user_disabled", a(a.f()));
            return objectnode;
        }
    }

    public String a()
    {
        return "location";
    }

    public boolean b()
    {
        return a.e().size() > 0;
    }

    public JsonNode c()
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("providers", d());
        return objectnode;
    }
}
