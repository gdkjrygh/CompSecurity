// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.functions.Predicate;
import java.util.Set;

// Referenced classes of package com.soundcloud.java.collections:
//            FilteredCollection, Sets

class FilteredSet extends FilteredCollection
    implements Set
{

    FilteredSet(Set set, Predicate predicate)
    {
        super(set, predicate);
    }

    public boolean equals(Object obj)
    {
        return Sets.equalsImpl(this, obj);
    }

    public int hashCode()
    {
        return Sets.hashCodeImpl(this);
    }
}
