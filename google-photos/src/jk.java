// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class jk extends jz
    implements Map
{

    private jq c;

    public jk()
    {
    }

    private jq a()
    {
        if (c == null)
        {
            c = new jl(this);
        }
        return c;
    }

    public Set entrySet()
    {
        jq jq1 = a();
        if (jq1.a == null)
        {
            jq1.a = new js(jq1);
        }
        return jq1.a;
    }

    public Set keySet()
    {
        jq jq1 = a();
        if (jq1.b == null)
        {
            jq1.b = new jt(jq1);
        }
        return jq1.b;
    }

    public void putAll(Map map)
    {
        a(b + map.size());
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public Collection values()
    {
        jq jq1 = a();
        if (jq1.c == null)
        {
            jq1.c = new jv(jq1);
        }
        return jq1.c;
    }
}
