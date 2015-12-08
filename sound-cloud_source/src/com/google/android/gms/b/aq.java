// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.b:
//            ah

public final class aq extends ah
{

    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final Map c = new HashMap();
    public b d;

    public aq()
    {
    }

    public final void a(ah ah1)
    {
        aq aq1 = (aq)ah1;
        aq1.a.addAll(a);
        aq1.b.addAll(b);
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext();)
        {
            ah1 = (java.util.Map.Entry)iterator.next();
            String s = (String)ah1.getKey();
            Iterator iterator1 = ((List)ah1.getValue()).iterator();
            while (iterator1.hasNext()) 
            {
                a a1 = (a)iterator1.next();
                if (a1 != null)
                {
                    if (s == null)
                    {
                        ah1 = "";
                    } else
                    {
                        ah1 = s;
                    }
                    if (!aq1.c.containsKey(ah1))
                    {
                        aq1.c.put(ah1, new ArrayList());
                    }
                    ((List)aq1.c.get(ah1)).add(a1);
                }
            }
        }

        if (d != null)
        {
            aq1.d = d;
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
