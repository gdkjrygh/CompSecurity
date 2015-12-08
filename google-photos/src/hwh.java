// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

final class hwh
{

    List a;
    List b;
    private hwf c;

    hwh(hwf hwf1)
    {
        c = hwf1;
        super();
        a = Collections.emptyList();
        b = Collections.emptyList();
    }

    final void a()
    {
        Object obj;
        obj = new ArrayList(a);
        ((List) (obj)).addAll(b);
        if (!((List) (obj)).isEmpty()) goto _L2; else goto _L1
_L1:
        for (obj = c.b.iterator(); ((Iterator) (obj)).hasNext(); ((hwg)((Iterator) (obj)).next()).b(Collections.emptyList())) { }
          goto _L3
_L2:
        LinkedHashSet linkedhashset;
        Object obj1;
        Iterator iterator1;
        obj1 = new LinkedHashMap(((List) (obj)).size());
        linkedhashset = new LinkedHashSet();
        iterator1 = ((List) (obj)).iterator();
_L5:
        if (iterator1.hasNext())
        {
            hrr hrr1 = (hrr)iterator1.next();
            if (hrr1.d() != null && !linkedhashset.contains(hrr1))
            {
                linkedhashset.add(hrr1);
            } else
            if (!((LinkedHashMap) (obj1)).containsKey(hrr1.c()) && hrr1.at_())
            {
                ((LinkedHashMap) (obj1)).put(hrr1.c(), hrr1);
            } else
            {
                boolean flag;
                if (((LinkedHashMap) (obj1)).containsKey(hrr1.c()) && ((hrr)((LinkedHashMap) (obj1)).get(hrr1.c())).e() && hrr1.a() == hsw.a && hrr1.at_())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    hrr1.a(true);
                    ((LinkedHashMap) (obj1)).put(hrr1.c(), hrr1);
                }
            }
            continue; /* Loop/switch isn't completed */
        }
        ((List) (obj)).clear();
        for (obj1 = ((LinkedHashMap) (obj1)).entrySet().iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(((java.util.Map.Entry)((Iterator) (obj1)).next()).getValue())) { }
        ((List) (obj)).addAll(linkedhashset);
        for (Iterator iterator = c.b.iterator(); iterator.hasNext(); ((hwg)iterator.next()).b(Collections.unmodifiableList(((List) (obj))))) { }
_L3:
        return;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
