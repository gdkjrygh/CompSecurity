// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.d:
//            ab

public final class ao extends ab
{

    private final List a = new ArrayList();
    private final List b = new ArrayList();
    private final Map c = new HashMap();
    private b d;

    public ao()
    {
    }

    public b a()
    {
        return d;
    }

    public void a(a a1, String s)
    {
        if (a1 == null)
        {
            return;
        }
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        if (!c.containsKey(s1))
        {
            c.put(s1, new ArrayList());
        }
        ((List)c.get(s1)).add(a1);
    }

    public volatile void a(ab ab1)
    {
        a((ao)ab1);
    }

    public void a(ao ao1)
    {
        ao1.a.addAll(a);
        ao1.b.addAll(b);
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iterator.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ao1.a((a)((Iterator) (obj)).next(), s);
            }
        }

        if (d != null)
        {
            ao1.d = d;
        }
    }

    public List b()
    {
        return Collections.unmodifiableList(a);
    }

    public Map c()
    {
        return c;
    }

    public List d()
    {
        return Collections.unmodifiableList(b);
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        if (!a.isEmpty())
        {
            hashmap.put("products", a);
        }
        if (!b.isEmpty())
        {
            hashmap.put("promotions", b);
        }
        if (!c.isEmpty())
        {
            hashmap.put("impressions", c);
        }
        hashmap.put("productAction", d);
        return a(hashmap);
    }
}
