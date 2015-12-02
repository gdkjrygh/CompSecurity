// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.b;

import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.kl;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.common.b:
//            h, g

public class f
{

    public f()
    {
    }

    public static es a(Collection collection)
    {
        java.util.LinkedHashSet linkedhashset = kl.b();
        Object obj = collection.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            h h1 = (h)((Iterator) (obj)).next();
            if (h1.b.isEmpty())
            {
                linkedhashset.add(h1);
            }
        } while (true);
        obj = es.e();
        while (!linkedhashset.isEmpty()) 
        {
            Object obj1 = (h)linkedhashset.iterator().next();
            linkedhashset.remove(obj1);
            ((et) (obj)).b(obj1);
            obj1 = ((h) (obj1)).c.iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                g g1 = (g)((Iterator) (obj1)).next();
                h h2 = g1.b;
                ((Iterator) (obj1)).remove();
                h2.b.remove(g1);
                if (h2.b.isEmpty())
                {
                    linkedhashset.add(h2);
                }
            }
        }
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (!((h)collection.next()).b.isEmpty())
            {
                throw new RuntimeException("Cycle in background tasks dependencies");
            }
        }

        return ((et) (obj)).b();
    }
}
