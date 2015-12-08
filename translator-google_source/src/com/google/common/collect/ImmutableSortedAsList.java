// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;

// Referenced classes of package com.google.common.collect:
//            RegularImmutableAsList, ef, ImmutableSortedSet, RegularImmutableSortedSet, 
//            ImmutableList, ImmutableCollection

final class ImmutableSortedAsList extends RegularImmutableAsList
    implements ef
{

    ImmutableSortedAsList(ImmutableSortedSet immutablesortedset, ImmutableList immutablelist)
    {
        super(immutablesortedset, immutablelist);
    }

    public final Comparator comparator()
    {
        return delegateCollection().comparator();
    }

    public final boolean contains(Object obj)
    {
        return indexOf(obj) >= 0;
    }

    final volatile ImmutableCollection delegateCollection()
    {
        return delegateCollection();
    }

    final ImmutableSortedSet delegateCollection()
    {
        return (ImmutableSortedSet)super.delegateCollection();
    }

    public final int indexOf(Object obj)
    {
        int i = delegateCollection().indexOf(obj);
        if (i >= 0 && get(i).equals(obj))
        {
            return i;
        } else
        {
            return -1;
        }
    }

    public final int lastIndexOf(Object obj)
    {
        return indexOf(obj);
    }

    final ImmutableList subListUnchecked(int i, int j)
    {
        return (new RegularImmutableSortedSet(super.subListUnchecked(i, j), comparator())).asList();
    }
}
