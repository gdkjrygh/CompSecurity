// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.ik;
import com.google.common.base.Objects;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.analytics:
//            am

public abstract class ca
    implements am
{

    protected final String a;
    private long b;
    private String c;
    private boolean d;
    private String e;
    private final Map f = ik.a();
    private boolean g;

    public ca(String s, String s1)
    {
        b = -1L;
        c = "AUTO_SET";
        e = "AUTO_SET";
        g = false;
        a = s;
        c = s1;
    }

    public ca a(long l)
    {
        b = l;
        return this;
    }

    public ca a(String s, String s1)
    {
        f.put(s, s1);
        return this;
    }

    ca a(boolean flag)
    {
        d = flag;
        return this;
    }

    public String a()
    {
        return a;
    }

    public boolean a(String s)
    {
        return f.containsKey(s);
    }

    public long b()
    {
        return b;
    }

    public String b(String s)
    {
        return (String)f.get(s);
    }

    void b(boolean flag)
    {
        g = flag;
    }

    public ca c(String s)
    {
        c = s;
        return this;
    }

    public String c()
    {
        return c;
    }

    public void d(String s)
    {
        e = s;
    }

    public boolean d()
    {
        return d;
    }

    public abstract JsonNode e();

    public String f()
    {
        return e;
    }

    protected Set g()
    {
        return f.keySet();
    }

    boolean h()
    {
        return g;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a, g()
        });
    }

    public String toString()
    {
        return a();
    }
}
