// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class cod extends cpd
{

    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final Map c = new HashMap();
    public bmf d;

    public cod()
    {
    }

    public final void a(cpd cpd1)
    {
        cod cod1 = (cod)cpd1;
        cod1.a.addAll(a);
        cod1.b.addAll(b);
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext();)
        {
            cpd1 = (java.util.Map.Entry)iterator.next();
            String s = (String)cpd1.getKey();
            Iterator iterator1 = ((List)cpd1.getValue()).iterator();
            while (iterator1.hasNext()) 
            {
                bme bme1 = (bme)iterator1.next();
                if (bme1 != null)
                {
                    if (s == null)
                    {
                        cpd1 = "";
                    } else
                    {
                        cpd1 = s;
                    }
                    if (!cod1.c.containsKey(cpd1))
                    {
                        cod1.c.put(cpd1, new ArrayList());
                    }
                    ((List)cod1.c.get(cpd1)).add(bme1);
                }
            }
        }

        if (d != null)
        {
            cod1.d = d;
        }
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
