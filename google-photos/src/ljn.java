// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ljn extends liz
{

    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final Map c = new HashMap();
    public jrb d;

    public ljn()
    {
    }

    public final void a(liz liz1)
    {
        ljn ljn1 = (ljn)liz1;
        ljn1.a.addAll(a);
        ljn1.b.addAll(b);
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext();)
        {
            liz1 = (java.util.Map.Entry)iterator.next();
            String s = (String)liz1.getKey();
            Iterator iterator1 = ((List)liz1.getValue()).iterator();
            while (iterator1.hasNext()) 
            {
                jra jra1 = (jra)iterator1.next();
                if (jra1 != null)
                {
                    if (s == null)
                    {
                        liz1 = "";
                    } else
                    {
                        liz1 = s;
                    }
                    if (!ljn1.c.containsKey(liz1))
                    {
                        ljn1.c.put(liz1, new ArrayList());
                    }
                    ((List)ljn1.c.get(liz1)).add(jra1);
                }
            }
        }

        if (d != null)
        {
            ljn1.d = d;
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
