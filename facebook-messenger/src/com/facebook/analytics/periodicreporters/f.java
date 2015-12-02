// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.periodicreporters;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.util.Comparator;

// Referenced classes of package com.facebook.analytics.periodicreporters:
//            g

class f
{

    private static Comparator c = new g();
    private String a;
    private long b;

    public f(File file)
    {
        a = file.getName();
        b = file.length();
    }

    static long a(f f1)
    {
        return f1.b;
    }

    static Comparator a()
    {
        return c;
    }

    private JsonNode b()
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("name", a);
        objectnode.put("size", b);
        return objectnode;
    }

    static JsonNode b(f f1)
    {
        return f1.b();
    }

}
