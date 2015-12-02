// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.es;
import com.google.common.b.c;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.List;
import org.apache.http.HttpEntity;

// Referenced classes of package com.facebook.http.protocol:
//            s

public class r
{

    private final int a;
    private final es b;
    private final Object c;
    private final Object d;
    private final s e;

    public r(int i, List list, JsonParser jsonparser, s s1, Object obj)
    {
        this(i, list, jsonparser, s1, obj);
    }

    public r(int i, List list, JsonNode jsonnode, s s1, Object obj)
    {
        this(i, list, jsonnode, s1, obj);
    }

    private r(int i, List list, Object obj, s s1, Object obj1)
    {
        a = i;
        b = es.a(list);
        c = obj;
        e = s1;
        d = obj1;
    }

    public r(int i, List list, String s1, s s2, Object obj)
    {
        this(i, list, s1, s2, obj);
    }

    public r(int i, List list, HttpEntity httpentity, s s1, Object obj)
    {
        this(i, list, httpentity, s1, obj);
    }

    public int a()
    {
        return a;
    }

    public String b()
    {
        Preconditions.checkState(c instanceof String, "No response body.");
        f();
        return (String)c;
    }

    public JsonNode c()
    {
        Preconditions.checkState(c instanceof JsonNode, "No response json node.");
        f();
        return (JsonNode)c;
    }

    public Object d()
    {
        return c;
    }

    public void e()
    {
        if (!(c instanceof HttpEntity))
        {
            break MISSING_BLOCK_LABEL_23;
        }
        ((HttpEntity)c).consumeContent();
_L1:
        return;
        if (c instanceof JsonParser)
        {
            com.google.common.b.c.a((JsonParser)c);
            return;
        }
          goto _L1
        IOException ioexception;
        ioexception;
    }

    public void f()
    {
        if (c instanceof String)
        {
            e.a((String)c);
        } else
        if (c instanceof JsonNode)
        {
            e.a((JsonNode)c);
            return;
        }
    }
}
