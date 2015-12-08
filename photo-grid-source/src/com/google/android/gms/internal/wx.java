// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.c.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class wx extends d
{

    private final List a = new ArrayList();
    private final List b = new ArrayList();
    private final Map c = new HashMap();
    private b d;

    public wx()
    {
    }

    public final b a()
    {
        return d;
    }

    public final void a(d d1)
    {
        wx wx1 = (wx)d1;
        wx1.a.addAll(a);
        wx1.b.addAll(b);
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext();)
        {
            d1 = (java.util.Map.Entry)iterator.next();
            String s = (String)d1.getKey();
            Iterator iterator1 = ((List)d1.getValue()).iterator();
            while (iterator1.hasNext()) 
            {
                a a1 = (a)iterator1.next();
                if (a1 != null)
                {
                    if (s == null)
                    {
                        d1 = "";
                    } else
                    {
                        d1 = s;
                    }
                    if (!wx1.c.containsKey(d1))
                    {
                        wx1.c.put(d1, new ArrayList());
                    }
                    ((List)wx1.c.get(d1)).add(a1);
                }
            }
        }

        if (d != null)
        {
            wx1.d = d;
        }
    }

    public final List b()
    {
        return Collections.unmodifiableList(a);
    }

    public final Map c()
    {
        return c;
    }

    public final List d()
    {
        return Collections.unmodifiableList(b);
    }

    public final String toString()
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
