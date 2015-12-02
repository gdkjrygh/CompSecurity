// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.a.a.a;

import com.facebook.http.a.a.a.a.b;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

// Referenced classes of package com.facebook.http.a.a.a:
//            b, h

public class a
{

    private final String a;
    private final com.facebook.http.a.a.a.b b;
    private final b c;

    public a(String s, b b1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Name may not be null");
        }
        if (b1 == null)
        {
            throw new IllegalArgumentException("Body may not be null");
        } else
        {
            a = s;
            c = b1;
            b = new com.facebook.http.a.a.a.b();
            a(b1);
            b(b1);
            c(b1);
            return;
        }
    }

    public String a()
    {
        return a;
    }

    protected void a(b b1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("form-data; name=\"");
        stringbuilder.append(a());
        stringbuilder.append("\"");
        if (b1.b() != null)
        {
            stringbuilder.append("; filename=\"");
            stringbuilder.append(b1.b());
            stringbuilder.append("\"");
        }
        a("Content-Disposition", stringbuilder.toString());
    }

    public void a(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Field name may not be null");
        } else
        {
            b.a(new h(s, s1));
            return;
        }
    }

    public b b()
    {
        return c;
    }

    protected void b(b b1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(b1.a());
        if (b1.c() != null)
        {
            stringbuilder.append("; charset=");
            stringbuilder.append(b1.c());
        }
        a("Content-Type", stringbuilder.toString());
    }

    public com.facebook.http.a.a.a.b c()
    {
        return b;
    }

    protected void c(b b1)
    {
        a("Content-Transfer-Encoding", b1.d());
    }

    public ObjectNode d()
    {
        return new ObjectNode(JsonNodeFactory.instance);
    }
}
