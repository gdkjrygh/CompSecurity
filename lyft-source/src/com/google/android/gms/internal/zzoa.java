// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzoa extends zznq
{

    private final List a = new ArrayList();
    private final List b = new ArrayList();
    private final Map c = new HashMap();
    private ProductAction d;

    public zzoa()
    {
    }

    public ProductAction a()
    {
        return d;
    }

    public void a(Product product, String s)
    {
        if (product == null)
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
        ((List)c.get(s1)).add(product);
    }

    public volatile void a(zznq zznq1)
    {
        a((zzoa)zznq1);
    }

    public void a(zzoa zzoa1)
    {
        zzoa1.a.addAll(a);
        zzoa1.b.addAll(b);
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iterator.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                zzoa1.a((Product)((Iterator) (obj)).next(), s);
            }
        }

        if (d != null)
        {
            zzoa1.d = d;
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
