// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            Ordering, ImmutableList, Lists

final class AllEqualOrdering extends Ordering
    implements Serializable
{

    static final AllEqualOrdering INSTANCE = new AllEqualOrdering();
    private static final long serialVersionUID = 0L;

    AllEqualOrdering()
    {
    }

    private Object readResolve()
    {
        return INSTANCE;
    }

    public final int compare(Object obj, Object obj1)
    {
        return 0;
    }

    public final ImmutableList immutableSortedCopy(Iterable iterable)
    {
        return ImmutableList.copyOf(iterable);
    }

    public final Ordering reverse()
    {
        return this;
    }

    public final List sortedCopy(Iterable iterable)
    {
        return Lists.a(iterable);
    }

    public final String toString()
    {
        return "Ordering.allEqual()";
    }

}
