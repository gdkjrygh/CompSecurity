// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            jc

public final class jk extends jc
{

    private final List a = new ArrayList();
    private final List b = new ArrayList();
    private final Map c = new HashMap();
    private b d;

    public jk()
    {
    }

    public final b a()
    {
        return d;
    }

    public final void a(jc jc1)
    {
        jk jk1 = (jk)jc1;
        jk1.a.addAll(a);
        jk1.b.addAll(b);
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext();)
        {
            jc1 = (java.util.Map.Entry)iterator.next();
            String s = (String)jc1.getKey();
            Iterator iterator1 = ((List)jc1.getValue()).iterator();
            while (iterator1.hasNext()) 
            {
                a a1 = (a)iterator1.next();
                if (a1 != null)
                {
                    if (s == null)
                    {
                        jc1 = "";
                    } else
                    {
                        jc1 = s;
                    }
                    if (!jk1.c.containsKey(jc1))
                    {
                        jk1.c.put(jc1, new ArrayList());
                    }
                    ((List)jk1.c.get(jc1)).add(a1);
                }
            }
        }

        if (d != null)
        {
            jk1.d = d;
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
