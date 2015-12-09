// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cvd;
import java.util.Comparator;

// Referenced classes of package com.google.common.collect:
//            RegularImmutableAsList, RegularImmutableSortedSet, ImmutableSortedSet, ImmutableList, 
//            ImmutableCollection

final class ImmutableSortedAsList extends RegularImmutableAsList
    implements cvd
{

    ImmutableSortedAsList(ImmutableSortedSet immutablesortedset, ImmutableList immutablelist)
    {
        super(immutablesortedset, immutablelist);
    }

    final ImmutableList b(int i, int j)
    {
        return (new RegularImmutableSortedSet(super.b(i, j), comparator())).b();
    }

    final volatile ImmutableCollection c()
    {
        return (ImmutableSortedSet)super.c();
    }

    public final Comparator comparator()
    {
        return ((ImmutableSortedSet)super.c()).comparator();
    }

    public final boolean contains(Object obj)
    {
        return indexOf(obj) >= 0;
    }

    public final int indexOf(Object obj)
    {
        int i = ((ImmutableSortedSet)super.c()).a(obj);
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
}
