// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.analytics.f.a;
import com.facebook.analytics.i.b;
import com.facebook.common.w.n;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.analytics:
//            ca

public class cb extends ca
{

    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private ObjectNode h;

    public cb(String s)
    {
        this(s, "AUTO_SET");
    }

    public cb(String s, String s1)
    {
        super("client_event", s1);
        b = s;
    }

    private JsonNode j(String s)
    {
        boolean flag;
        if (!n.a(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Invalid Key");
        if (h == null)
        {
            s = null;
        } else
        {
            JsonNode jsonnode = h.get(s);
            s = jsonnode;
            if (jsonnode == null)
            {
                return null;
            }
        }
        return s;
    }

    public cb a(a a1)
    {
        return e(a1.toString());
    }

    public cb a(String s, double d1)
    {
        return b(s, n.a("%4.2f", new Object[] {
            Double.valueOf(d1)
        }));
    }

    public cb a(String s, int k)
    {
        return b(s, Integer.toString(k));
    }

    public cb a(String s, long l)
    {
        return b(s, Long.toString(l));
    }

    public cb a(String s, JsonNode jsonnode)
    {
        if (h == null)
        {
            h = new ObjectNode(JsonNodeFactory.instance);
        }
        h.put(s, jsonnode);
        return this;
    }

    public cb a(String s, boolean flag)
    {
        return b(s, Boolean.toString(flag));
    }

    public cb b(String s, String s1)
    {
        if (h == null)
        {
            h = new ObjectNode(JsonNodeFactory.instance);
        }
        if (s1 != null)
        {
            h.put(s, s1);
        }
        return this;
    }

    public cb e(String s)
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
            objectnode.put("module", c);
        }
        if (d != null)
        {
            objectnode.put("obj_type", d);
        }
        if (e != null)
        {
            objectnode.put("obj_id", e);
        }
        if (f != null)
        {
            objectnode.put("uuid", f);
        }
        String s = f();
        if (s != null)
        {
            b("process", s);
        }
        if (h != null)
        {
            objectnode.put("extra", h);
        }
        if (g != null)
        {
            objectnode.put("interface", g);
        }
        if (d())
        {
            objectnode.put("bg", true);
        }
        return objectnode;
    }

    public cb f(String s)
    {
        d = s;
        return this;
    }

    public cb g(String s)
    {
        e = s;
        return this;
    }

    public cb h(String s)
    {
        f = s;
        return this;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a, b, c
        });
    }

    public String i()
    {
        return b;
    }

    public String i(String s)
    {
        s = j(s);
        if (s == null)
        {
            return null;
        } else
        {
            return s.textValue();
        }
    }

    public String j()
    {
        return c;
    }

    public String toString()
    {
        return (new StringBuilder()).append(a()).append(":").append(i()).append(":").append(j()).toString();
    }
}
