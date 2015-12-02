// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.analytics.b.c;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.ik;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.analytics:
//            cb

public class a
{

    private ConcurrentMap a;
    private final c b;

    public a(c c1)
    {
        a = ik.c();
        b = c1;
    }

    public static Map a(ObjectMapper objectmapper, String s)
    {
        HashMap hashmap = new HashMap();
        try
        {
            for (objectmapper = objectmapper.readTree(s).fields(); objectmapper.hasNext(); hashmap.put(s.getKey(), Long.valueOf(((JsonNode)s.getValue()).longValue())))
            {
                s = (java.util.Map.Entry)objectmapper.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (ObjectMapper objectmapper) { }
        // Misplaced declaration of an exception variable
        catch (ObjectMapper objectmapper)
        {
            return hashmap;
        }
        return hashmap;
    }

    private void e()
    {
        if (b != null && b.a(a()))
        {
            b.a(a(), c().toString());
            b();
        }
    }

    protected String a()
    {
        return "analytic_counters";
    }

    public void a(cb cb1)
    {
        JsonNode jsonnode = c();
        if (jsonnode.size() > 0)
        {
            cb1.a(a(), jsonnode);
        }
    }

    public void a(String s)
    {
        a.remove(s);
    }

    public void a(String s, long l)
    {
        do
        {
            Long long1 = (Long)a.get(s);
            boolean flag;
            if (long1 == null)
            {
                if ((Long)a.putIfAbsent(s, Long.valueOf(l)) == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                long l1 = long1.longValue();
                flag = a.replace(s, long1, Long.valueOf(l1 + l));
            }
        } while (!flag);
        e();
    }

    public void b()
    {
        a.clear();
    }

    public void b(String s, long l)
    {
        do
        {
            Long long1 = (Long)a.get(s);
            boolean flag;
            if (long1 == null)
            {
                if ((Long)a.putIfAbsent(s, Long.valueOf(l)) == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = a.replace(s, long1, Long.valueOf(l));
            }
        } while (!flag);
        e();
    }

    public JsonNode c()
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); objectnode.put((String)entry.getKey(), ((Long)entry.getValue()).longValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return objectnode;
    }

    protected ConcurrentMap d()
    {
        return a;
    }
}
