// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Maps, Sets

private static class keyPredicate extends dMap
{

    Set entrySet;
    Predicate keyPredicate;
    Set keySet;

    public boolean containsKey(Object obj)
    {
        return unfiltered.containsKey(obj) && keyPredicate.apply(obj);
    }

    public Set entrySet()
    {
        Set set1 = entrySet;
        Set set = set1;
        if (set1 == null)
        {
            set = Sets.filter(unfiltered.entrySet(), predicate);
            entrySet = set;
        }
        return set;
    }

    public Set keySet()
    {
        Set set1 = keySet;
        Set set = set1;
        if (set1 == null)
        {
            set = Sets.filter(unfiltered.keySet(), keyPredicate);
            keySet = set;
        }
        return set;
    }

    dMap(Map map, Predicate predicate, Predicate predicate1)
    {
        super(map, predicate1);
        keyPredicate = predicate;
    }
}
