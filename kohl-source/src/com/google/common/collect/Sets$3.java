// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Sets, Iterators

static final class tView extends tView
{

    final Predicate val$notInSet2;
    final Set val$set1;
    final Set val$set2;

    public boolean contains(Object obj)
    {
        return val$set1.contains(obj) && !val$set2.contains(obj);
    }

    public boolean isEmpty()
    {
        return val$set2.containsAll(val$set1);
    }

    public Iterator iterator()
    {
        return Iterators.filter(val$set1.iterator(), val$notInSet2);
    }

    public int size()
    {
        return Iterators.size(iterator());
    }

    rs(Set set, Predicate predicate, Set set3)
    {
        val$set1 = set;
        val$notInSet2 = predicate;
        val$set2 = set3;
        super(null);
    }
}
